package com.altama.forecast.viewModel;

import com.altama.forecast.application.M_productService;
import com.altama.forecast.common.zul.PageNavigation;
import com.altama.forecast.interfaces.web.facade.dto.m_productDTO.M_productDTO;
import com.altama.forecast.interfaces.web.facade.dto.m_productDTO.M_productDTOBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.ContextParam;
import org.zkoss.bind.annotation.ContextType;
import org.zkoss.bind.annotation.ExecutionArgParam;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.WireVariable;
import org.zkoss.zul.ListModelList;
import org.zkoss.zul.Window;

/**
 *
 * @author admin
 */
@VariableResolver(org.zkoss.zkplus.spring.DelegatingVariableResolver.class)
public class ProductVM {

    @WireVariable
    M_productService m_productService;

    private M_productDTO m_productDTO = new M_productDTO();
    private List<M_productDTO> m_productDTOs = new ArrayList<>();

    private String name;

//    private ListModelList<> listnama = new ListModelList<nama>();
    //    Setting List
    private PageNavigation previous;
    private boolean checked;
    private int pageSize = 5;
    private int activePage = 0;
    private int selectedIndex;
    private int totalSize = 0;

    @Init
    public void init(
            @ExecutionArgParam("m_productDTO") M_productDTO m_product,
            @ExecutionArgParam("previous") PageNavigation previous
    ) {
        initData();
        checkValidity(m_product, previous);
    }

    private void initData() {
        m_productDTOs = m_productService.findAll();
    }

    private void checkValidity(M_productDTO m_product, PageNavigation previous) {
        if (m_product == null) {
            ListModelList<M_productDTO> m_productList = new ListModelList<>(m_productService.findAll());
            m_productDTO = new M_productDTOBuilder()
                    .createM_productDTO();
        } else {
            this.m_productDTO = m_product;
            name = m_productDTO.getName();
            this.previous = previous;
        }
    }

    @Command("buttonSearch")
    @NotifyChange("m_productDTOs")
    public void buttonSearch(@ContextParam(ContextType.VIEW) Window window) {
        Map params = new HashMap();
        params.put("name", name);

        m_productDTOs = m_productService.findByParams(params);
    }

    public M_productDTO getM_productDTO() {
        return m_productDTO;
    }

    public void setM_productDTO(M_productDTO m_productDTO) {
        this.m_productDTO = m_productDTO;
    }

    public List<M_productDTO> getM_productDTOs() {
        return m_productDTOs;
    }

    public void setM_productDTOs(List<M_productDTO> m_productDTOs) {
        this.m_productDTOs = m_productDTOs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PageNavigation getPrevious() {
        return previous;
    }

    public void setPrevious(PageNavigation previous) {
        this.previous = previous;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getActivePage() {
        return activePage;
    }

    public void setActivePage(int activePage) {
        this.activePage = activePage;
    }

    public int getSelectedIndex() {
        return selectedIndex;
    }

    public void setSelectedIndex(int selectedIndex) {
        this.selectedIndex = selectedIndex;
    }

    public int getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(int totalSize) {
        this.totalSize = totalSize;
    }

}
