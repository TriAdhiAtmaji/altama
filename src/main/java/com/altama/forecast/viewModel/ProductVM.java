package com.altama.forecast.viewModel;

import com.altama.forecast.application.C_ElementvalueService;
import com.altama.forecast.application.C_bpartnerService;
import com.altama.forecast.application.ForecastRecomendService;
import com.altama.forecast.application.M_pricelist_versionService;
import com.altama.forecast.application.M_productService;
import com.altama.forecast.application.Z_m_factoryService;
import com.altama.forecast.common.zul.PageNavigation;
import com.altama.forecast.domain.m_product.IsDiscontinue;
import com.altama.forecast.interfaces.web.facade.dto.ad_treenodeu1.Ad_treenodeu1DTO;
import com.altama.forecast.interfaces.web.facade.dto.c_bpartner.C_bpartnerDTO;
import com.altama.forecast.interfaces.web.facade.dto.c_elementvalue.C_ElementvalueDTO;
import com.altama.forecast.interfaces.web.facade.dto.forecastRecomendDTO.ForecastRecomendDTO;
import com.altama.forecast.interfaces.web.facade.dto.forecastRecomendDTO.ForecastRecomendDTOBuilder;
import com.altama.forecast.interfaces.web.facade.dto.m_pricelist_versionDTO.M_pricelist_versionDTO;
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

    @WireVariable
    M_pricelist_versionService m_pricelist_versionService;

    @WireVariable
    ForecastRecomendService forecastRecomendService;

    private ForecastRecomendDTO forecastRecomendDTO = new ForecastRecomendDTO();
    private List<ForecastRecomendDTO> forecastRecomendDTOs = new ArrayList<>();

    private List<Ad_treenodeu1DTO> ad_treenodeu1DTOs = new ArrayList<>();

    // Selected ComboBox
    private String productSelect;
    private IsDiscontinue continueSelect;
    private C_ElementvalueDTO brandSelect;
    private C_bpartnerDTO suplierSelect;
    private Z_m_factoryDTO factorySelect;
    private M_pricelist_versionDTO priceVersionSelect;

    //        combobox
    private ListModelList<IsDiscontinue> listDiscontinue = new ListModelList<IsDiscontinue>();
    private List<C_ElementvalueDTO> listC_Elementvalues = new ArrayList<C_ElementvalueDTO>();
    private List<C_bpartnerDTO> listBpartner = new ArrayList<C_bpartnerDTO>();
    private List<Z_m_factoryDTO> listFactory = new ArrayList<Z_m_factoryDTO>();
    private List<M_pricelist_versionDTO> listPriceVersion = new ArrayList<M_pricelist_versionDTO>();

    //    Setting page navigate
    private PageNavigation previous;
    private boolean checked;
    private int pageSize = 10;
    private int activePage = 0;
    private int totalSize = 0;

    private Map params = new HashMap();

    @Init
    public void init(
            @ExecutionArgParam("forecastRecomendDTO") ForecastRecomendDTO forecastRecomend,
            @ExecutionArgParam("previous") PageNavigation previous
    ) {
        initData();
        checkValidity(forecastRecomend, previous);
    }

    private void initData() {

//        forecastRecomendDTOs = forecastRecomendService.findAll();
        listBpartner = c_bpartnerService.findAll();
        listFactory = z_m_factoryService.findAll();
        listPriceVersion = m_pricelist_versionService.findAll();
        listC_Elementvalues = c_ElementvalueService.findAll();

        if (continueSelect == null) {
            continueSelect = IsDiscontinue.valueOf("N");
        }

        if (productSelect != null) {
            params.put("productSelect", productSelect);
        }
        if (continueSelect != null) {
            params.put("continueSelect", continueSelect);
        }
        if (brandSelect != null) {
            params.put("brandSelected", brandSelect.getC_elementvalue_id());
        }
        if (suplierSelect != null) {
            params.put("suplierSelect", suplierSelect.getC_bpartner_id());
        }
        if (factorySelect != null) {
            params.put("factorySelect", factorySelect.getZ_m_factory_id());
        }
        if (priceVersionSelect != null) {
            params.put("priceVersionSelect", priceVersionSelect.getM_pricelist_version_id());
        }

        forecastRecomendDTOs = forecastRecomendService.findByParams(params, activePage * pageSize, pageSize);
        totalSize = forecastRecomendDTOs.size();
    }

    private void checkValidity(ForecastRecomendDTO forecastRecomend, PageNavigation previous) {
        if (forecastRecomend == null) {
            forecastRecomendDTO = new ForecastRecomendDTOBuilder()
                    .createForecastRecomendDTO();
        } else {
            this.forecastRecomendDTO = forecastRecomend;
//            brandSelect = forecastRecomend.getC_elementvalue_id();
            productSelect = forecastRecomend.getProduct();
            this.previous = previous;
        }
    }

    @Command("buttonSearch")
    @NotifyChange("forecastRecomendDTOs")
    public void buttonSearch(@ContextParam(ContextType.VIEW) Window window) {
//        Map params = new HashMap();
        if (productSelect != null) {
            params.put("productSelect", productSelect);
        }
        if (continueSelect != null) {
            params.put("continueSelect", continueSelect);
        }
        if (brandSelect != null) {
            params.put("brandSelected", brandSelect.getC_elementvalue_id());
        }
        if (suplierSelect != null) {
            params.put("suplierSelect", suplierSelect.getC_bpartner_id());
        }
        if (factorySelect != null) {
            params.put("factorySelect", factorySelect.getZ_m_factory_id());
        }
        if (priceVersionSelect != null) {
            params.put("priceVersionSelect", priceVersionSelect.getM_pricelist_version_id());
        }

        forecastRecomendDTOs = forecastRecomendService.findByParams(params, pageSize, pageSize);
//        forecastRecomendDTOs = forecastRecomendService.findByParamsMap(params);
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

    @NotifyChange("forecastRecomendDTOs")
    public void setActivePage(int activePage) {
        this.activePage = activePage;
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

    public ListModelList<IsDiscontinue> getListDiscontinue() {
        return new ListModelList<>(IsDiscontinue.values());
    }

    public void setListDiscontinue(ListModelList<IsDiscontinue> listDiscontinue) {
        this.listDiscontinue = listDiscontinue;
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

    public IsDiscontinue getContinueSelect() {
        return continueSelect;
    }

    public void setContinueSelect(IsDiscontinue continueSelect) {
        this.continueSelect = continueSelect;
    }

}
