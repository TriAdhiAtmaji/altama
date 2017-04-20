package com.altama.forecast.viewModel;

import com.altama.forecast.application.M_productService;
import com.altama.forecast.common.zul.PageNavigation;
import com.altama.forecast.domain.m_product.Name;
import com.altama.forecast.interfaces.web.facade.dto.m_productDTO.M_productDTO;
import com.altama.forecast.interfaces.web.facade.dto.m_productDTO.M_productDTOBuilder;
import java.math.BigDecimal;
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

    private String nama;

    private Name nameSelected;

    Name n1 = new Name(BigDecimal.valueOf(1), "Tekiro");
    Name n2 = new Name(BigDecimal.valueOf(2), "Ryu");

    List<Name> listName = new ArrayList<Name>();

    //        combobox
    //    private ListModelList<Name> listnama = new ListModelList<Name>();
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
        listName.add(n1);
        listName.add(n2);

        m_productDTOs = m_productService.findAll();
    }

    private void checkValidity(M_productDTO m_product, PageNavigation previous) {
        if (m_product == null) {
            ListModelList<M_productDTO> m_productList = new ListModelList<>(m_productService.findAll());
            m_productDTO = new M_productDTOBuilder()
                    .createM_productDTO();
        } else {
            this.m_productDTO = m_product;
            nama = m_productDTO.getName();
            this.previous = previous;
        }
    }

    @Command("buttonSearch")
    @NotifyChange("m_productDTOs")
    public void buttonSearch(@ContextParam(ContextType.VIEW) Window window) {
        Map params = new HashMap();
        params.put("nama", nama);

        System.out.print("aaa" + nameSelected.getId().toString());

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

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
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

    public M_productService getM_productService() {
        return m_productService;
    }

    public void setM_productService(M_productService m_productService) {
        this.m_productService = m_productService;
    }

//    public Name getN() {
//        return n;
//    }
//
//    public void setN(Name n) {
//        this.n = n;
//    }
    public List<Name> getListName() {
        return listName;
    }

    public void setListName(List<Name> listName) {
        this.listName = listName;
    }

    public Name getNameSelected() {
        return nameSelected;
    }

    public void setNameSelected(Name nameSelected) {
        this.nameSelected = nameSelected;
    }

}
