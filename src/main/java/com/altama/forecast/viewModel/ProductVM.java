package com.altama.forecast.viewModel;

import com.altama.forecast.application.C_ElementvalueService;
import com.altama.forecast.application.C_bpartnerService;
import com.altama.forecast.application.M_productService;
import com.altama.forecast.application.Z_m_factoryService;
import com.altama.forecast.common.zul.PageNavigation;
import com.altama.forecast.domain.m_product.IsDiscontinue;
import com.altama.forecast.domain.m_product.Name;
import com.altama.forecast.interfaces.web.facade.dto.c_bpartner.C_bpartnerDTO;
import com.altama.forecast.interfaces.web.facade.dto.c_elementvalue.C_ElementvalueDTO;
import com.altama.forecast.interfaces.web.facade.dto.m_productDTO.M_productDTO;
import com.altama.forecast.interfaces.web.facade.dto.m_productDTO.M_productDTOBuilder;
import com.altama.forecast.interfaces.web.facade.dto.z_m_factory.Z_m_factoryDTO;
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

    @WireVariable
    C_ElementvalueService c_ElementvalueService;

    @WireVariable
    C_bpartnerService c_bpartnerService;

    @WireVariable
    Z_m_factoryService z_m_factoryService;

    private M_productDTO m_productDTO = new M_productDTO();
    private List<M_productDTO> m_productDTOs = new ArrayList<>();

    private C_ElementvalueDTO c_ElementvalueDTO = new C_ElementvalueDTO();
    private List<C_ElementvalueDTO> c_ElementvalueDTOs = new ArrayList<>();

    // Selected ComboBox
    private String nama;
    private Name nameSelected;
    private IsDiscontinue continueSelect;
    private C_ElementvalueDTO brandSelected;
    private C_bpartnerDTO suplier;
    private Z_m_factoryDTO factory;

    //        combobox
    private ListModelList<IsDiscontinue> listDiscontinue = new ListModelList<IsDiscontinue>();
    private List<C_ElementvalueDTO> listC_Elementvalues = new ArrayList<C_ElementvalueDTO>();
    private List<C_bpartnerDTO> listBpartner = new ArrayList<C_bpartnerDTO>();
    private List<Z_m_factoryDTO> listFactory = new ArrayList<Z_m_factoryDTO>();

    //    Setting page navigate
    private PageNavigation previous;
    private boolean checked;
    private int pageSize = 5;
    private int activePage = 0;
    private int selectedIndex;
    private int totalSize = 0;

    @Init
    public void init(
            @ExecutionArgParam("m_productDTO") M_productDTO m_product,
            @ExecutionArgParam("c_ElementvalueDTO") C_ElementvalueDTO c_Elementvalue,
            @ExecutionArgParam("previous") PageNavigation previous
    ) {
        initData();
        checkValidity(m_product, previous);
    }

    private void initData() {

        listBpartner = c_bpartnerService.findAll();
        listC_Elementvalues = c_ElementvalueService.findAll();
        m_productDTOs = m_productService.findAll();
        listFactory = z_m_factoryService.findAll();

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

//        System.out.print("1 " + nameSelected.getId().toString() + " ");
        System.out.print("2 " + brandSelected.getBrand() + " " + brandSelected.getC_elementvalue_id());

        System.out.print("3 " + continueSelect + " ");

        System.out.print("4 " + nama + " ");

        System.out.print("5 " + suplier + " ");

        System.out.print("6 " + factory + " ");

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
//    public List<Name> getListName() {
//        return listName;
//    }
//
//    public void setListName(List<Name> listName) {
//        this.listName = listName;
//    }
    public Name getNameSelected() {
        return nameSelected;
    }

    public void setNameSelected(Name nameSelected) {
        this.nameSelected = nameSelected;
    }

    public C_ElementvalueDTO getBrandSelected() {
        return brandSelected;
    }

    public void setBrandSelected(C_ElementvalueDTO brandSelected) {
        this.brandSelected = brandSelected;
    }

    public List<C_ElementvalueDTO> getListC_Elementvalues() {
        return listC_Elementvalues;
    }

    public void setListC_Elementvalues(List<C_ElementvalueDTO> listC_Elementvalues) {
        this.listC_Elementvalues = listC_Elementvalues;
    }

    public ListModelList<IsDiscontinue> getListDiscontinue() {
        return new ListModelList<>(IsDiscontinue.values());
    }

    public void setListDiscontinue(ListModelList<IsDiscontinue> listDiscontinue) {
        this.listDiscontinue = listDiscontinue;
    }

    public C_ElementvalueDTO getC_ElementvalueDTO() {
        return c_ElementvalueDTO;
    }

    public void setC_ElementvalueDTO(C_ElementvalueDTO c_ElementvalueDTO) {
        this.c_ElementvalueDTO = c_ElementvalueDTO;
    }

    public List<C_ElementvalueDTO> getC_ElementvalueDTOs() {
        return c_ElementvalueDTOs;
    }

    public void setC_ElementvalueDTOs(List<C_ElementvalueDTO> c_ElementvalueDTOs) {
        this.c_ElementvalueDTOs = c_ElementvalueDTOs;
    }

    public IsDiscontinue getContinueSelect() {
        return continueSelect;
    }

    public void setContinueSelect(IsDiscontinue continueSelect) {
        this.continueSelect = continueSelect;
    }

    public C_bpartnerDTO getSuplier() {
        return suplier;
    }

    public void setSuplier(C_bpartnerDTO suplier) {
        this.suplier = suplier;
    }

    public List<C_bpartnerDTO> getListBpartner() {
        return listBpartner;
    }

    public void setListBpartner(List<C_bpartnerDTO> listBpartner) {
        this.listBpartner = listBpartner;
    }

    public Z_m_factoryDTO getFactory() {
        return factory;
    }

    public void setFactory(Z_m_factoryDTO factory) {
        this.factory = factory;
    }

    public List<Z_m_factoryDTO> getListFactory() {
        return listFactory;
    }

    public void setListFactory(List<Z_m_factoryDTO> listFactory) {
        this.listFactory = listFactory;
    }

}
