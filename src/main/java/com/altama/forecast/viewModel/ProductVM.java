package com.altama.forecast.viewModel;

import com.altama.forecast.application.Ad_treenodeu1Service;
import com.altama.forecast.application.C_ElementvalueService;
import com.altama.forecast.application.C_bpartnerService;
import com.altama.forecast.application.ForecastRecomendService;
import com.altama.forecast.application.M_pricelist_versionService;
import com.altama.forecast.application.M_productService;
import com.altama.forecast.application.Z_m_factoryService;
import com.altama.forecast.common.zul.PageNavigation;
import com.altama.forecast.interfaces.web.facade.dto.ad_treenodeu1.Ad_treenodeu1DTO;
import com.altama.forecast.interfaces.web.facade.dto.c_bpartner.C_bpartnerDTO;
import com.altama.forecast.interfaces.web.facade.dto.c_elementvalue.C_ElementvalueDTO;
import com.altama.forecast.interfaces.web.facade.dto.forecastRecomendDTO.ForecastRecomendDTO;
import com.altama.forecast.interfaces.web.facade.dto.m_pricelist_versionDTO.M_pricelist_versionDTO;
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
    Ad_treenodeu1Service ad_treenodeu1Service;

    @WireVariable
    M_productService m_productService;

    @WireVariable
    C_ElementvalueService c_ElementvalueService;

    @WireVariable
    C_bpartnerService c_bpartnerService;

    @WireVariable
    Z_m_factoryService z_m_factoryService;

    @WireVariable
    M_pricelist_versionService m_pricelist_versionService;

    @WireVariable
    ForecastRecomendService forecastRecomendService;

    private M_productDTO m_productDTO = new M_productDTO();
    private List<M_productDTO> m_productDTOs = new ArrayList<>();

    private ForecastRecomendDTO forecastRecomendDTO = new ForecastRecomendDTO();
    private List<ForecastRecomendDTO> forecastRecomendDTOs = new ArrayList<>();

    private List<Ad_treenodeu1DTO> ad_treenodeu1DTOs = new ArrayList<>();

    // Selected ComboBox
    private String productSelect;
//    private IsDiscontinue continueSelect;
    private String continueSelect;
    private C_ElementvalueDTO brandSelect;
    private C_bpartnerDTO suplierSelect;
    private Z_m_factoryDTO factorySelect;
    private M_pricelist_versionDTO priceVersionSelect;

    //        combobox
//    private ListModelList<IsDiscontinue> listDiscontinue = new ListModelList<IsDiscontinue>();
    private ListModelList<String> listDiscontinue = new ListModelList<String>();
    private List<C_ElementvalueDTO> listC_Elementvalues = new ArrayList<C_ElementvalueDTO>();
    private List<C_bpartnerDTO> listBpartner = new ArrayList<C_bpartnerDTO>();
    private List<Z_m_factoryDTO> listFactory = new ArrayList<Z_m_factoryDTO>();
    private List<M_pricelist_versionDTO> listPriceVersion = new ArrayList<M_pricelist_versionDTO>();

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

        listDiscontinue.add("Y");
        listDiscontinue.add("N");

        m_productDTOs = m_productService.findAll();
        listBpartner = c_bpartnerService.findAll();
        listC_Elementvalues = c_ElementvalueService.findAll();
        listFactory = z_m_factoryService.findAll();
        listPriceVersion = m_pricelist_versionService.findAll();
//        forecastRecomendDTOs = forecastRecomendService.findAll();
//        System.out.println(forecastRecomendDTOs + "\n");

//        M_pricelist_versionDTO price = new M_pricelist_versionDTO(BigDecimal.valueOf(1000031), "US_Standard_PriceList_1108_IDR");
//        setPriceVersion(price);
//        if (priceVersionSelect == null) {
//
//          priceVersion.setM_pricelist_version_id(BigDecimal.valueOf(1000031));
//        }
        if (continueSelect == null) {
            continueSelect = "Y";
        }

    }

    private void checkValidity(M_productDTO m_product, PageNavigation previous) {
        if (m_product == null) {
            ListModelList<M_productDTO> m_productList = new ListModelList<>(m_productService.findAll());
            m_productDTO = new M_productDTOBuilder()
                    .createM_productDTO();
        } else {
            this.m_productDTO = m_product;
            productSelect = m_productDTO.getName();
            this.previous = previous;
        }
    }

    @Command("buttonSearch")
    @NotifyChange("m_productDTOs")
    public void buttonSearch(@ContextParam(ContextType.VIEW) Window window) {
        Map params = new HashMap();
        params.put("productSelect", productSelect);
        params.put("continueSelect", continueSelect);
        params.put("brandSelected", brandSelect.getC_elementvalue_id());
        params.put("suplier", suplierSelect.getC_bpartner_id());
        params.put("factory", factorySelect.getZ_m_factory_id());
        params.put("priceVersion", priceVersionSelect.getM_pricelist_version_id());

        m_productDTOs = m_productService.findByParams(params);

        System.out.print("2 " + brandSelect.getBrand() + " " + brandSelect.getC_elementvalue_id() + " \n");

        System.out.print("3 " + continueSelect + " \n");

        System.out.print("4 " + productSelect + " \n");

        System.out.print("5 " + suplierSelect.getSuplier() + " " + suplierSelect.getC_bpartner_id() + " \n");

        System.out.print("6 " + priceVersionSelect.getNamePricelist() + " " + priceVersionSelect.getM_pricelist_version_id() + " \n");

        System.out.print("7 " + factorySelect.getName() + " " + factorySelect.getZ_m_factory_id() + " \n");
    }

    public List<Ad_treenodeu1DTO> getAd_treenodeu1DTOs() {
        return ad_treenodeu1DTOs;
    }

    public void setAd_treenodeu1DTOs(List<Ad_treenodeu1DTO> ad_treenodeu1DTOs) {
        this.ad_treenodeu1DTOs = ad_treenodeu1DTOs;
    }

    public String getProductSelect() {
        return productSelect;
    }

    public void setProductSelect(String productSelect) {
        this.productSelect = productSelect;
    }

    public C_ElementvalueDTO getBrandSelect() {
        return brandSelect;
    }

    public void setBrandSelect(C_ElementvalueDTO brandSelect) {
        this.brandSelect = brandSelect;
    }

    public C_bpartnerDTO getSuplierSelect() {
        return suplierSelect;
    }

    public void setSuplierSelect(C_bpartnerDTO suplierSelect) {
        this.suplierSelect = suplierSelect;
    }

    public Z_m_factoryDTO getFactorySelect() {
        return factorySelect;
    }

    public void setFactorySelect(Z_m_factoryDTO factorySelect) {
        this.factorySelect = factorySelect;
    }

    public M_pricelist_versionDTO getPriceVersionSelect() {
        return priceVersionSelect;
    }

    public void setPriceVersionSelect(M_pricelist_versionDTO priceVersionSelect) {
        this.priceVersionSelect = priceVersionSelect;
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

    public List<C_ElementvalueDTO> getListC_Elementvalues() {
        return listC_Elementvalues;
    }

    public void setListC_Elementvalues(List<C_ElementvalueDTO> listC_Elementvalues) {
        this.listC_Elementvalues = listC_Elementvalues;
    }

//    public ListModelList<IsDiscontinue> getListDiscontinue() {
//        return new ListModelList<>(IsDiscontinue.values());
//    }
//
//    public void setListDiscontinue(ListModelList<IsDiscontinue> listDiscontinue) {
//        this.listDiscontinue = listDiscontinue;
//    }
    public ListModelList<String> getListDiscontinue() {
        return listDiscontinue;
    }

    public void setListDiscontinue(ListModelList<String> listDiscontinue) {
        this.listDiscontinue = listDiscontinue;
    }

    public String getContinueSelect() {
        return continueSelect;
    }

    public void setContinueSelect(String continueSelect) {
        this.continueSelect = continueSelect;
    }

    public List<C_bpartnerDTO> getListBpartner() {
        return listBpartner;
    }

    public void setListBpartner(List<C_bpartnerDTO> listBpartner) {
        this.listBpartner = listBpartner;
    }

    public List<Z_m_factoryDTO> getListFactory() {
        return listFactory;
    }

    public void setListFactory(List<Z_m_factoryDTO> listFactory) {
        this.listFactory = listFactory;
    }

    public List<M_pricelist_versionDTO> getListPriceVersion() {
        return listPriceVersion;
    }

    public void setListPriceVersion(List<M_pricelist_versionDTO> listPriceVersion) {
        this.listPriceVersion = listPriceVersion;
    }

    public ForecastRecomendDTO getForecastRecomendDTO() {
        return forecastRecomendDTO;
    }

    public void setForecastRecomendDTO(ForecastRecomendDTO forecastRecomendDTO) {
        this.forecastRecomendDTO = forecastRecomendDTO;
    }

    public List<ForecastRecomendDTO> getForecastRecomendDTOs() {
        return forecastRecomendDTOs;
    }

    public void setForecastRecomendDTOs(List<ForecastRecomendDTO> forecastRecomendDTOs) {
        this.forecastRecomendDTOs = forecastRecomendDTOs;
    }

}
