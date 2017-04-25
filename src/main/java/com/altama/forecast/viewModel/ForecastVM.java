package com.altama.forecast.viewModel;

import com.altama.forecast.application.ForecastService;
import com.altama.forecast.common.zul.PageNavigation;
import com.altama.forecast.domain.forecast.IsDiscontinued;
import com.altama.forecast.interfaces.web.facade.dto.forecast.ForecastDTO;
import com.altama.forecast.interfaces.web.facade.dto.forecast.ForecastDTOBuilder;
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
public class ForecastVM {

    @WireVariable
    ForecastService forecastService;

    private ForecastDTO forecastDTO = new ForecastDTO();
    private List<ForecastDTO> forecastDTOs = new ArrayList<>();

    // search setting
    private String brand;
    private String product;
    private String suplier;
    private String factory;
    private IsDiscontinued isDiscontined;
    private String priceVersion;

    private ListModelList<ForecastDTO> listForecast = new ListModelList<>();
    private ListModelList<IsDiscontinued> listIsDiscontinued = new ListModelList<>();

    //    Setting List
    private PageNavigation previous;
    private boolean checked;
    private int pageSize = 5;
    private int activePage = 0;
    private int selectedIndex;
    private int totalSize = 0;

    @Init
    public void init(
            @ExecutionArgParam("forecastDTO") ForecastDTO forecast,
            @ExecutionArgParam("previous") PageNavigation previous) {

        initData();
        checkValidity(forecast, previous);

    }

    private void initData() {
//        ForecastDTO forecastDTO = forecastService.getDummy();
//        forecastService.saveForecast(forecastDTO);
//
//        ForecastDTO aw = forecastService.getDummy2();
//        forecastService.saveForecast(aw);

        forecastDTOs = forecastService.findAll();
    }

    private void checkValidity(ForecastDTO forecast, PageNavigation previous) {
        if (forecast == null) {
            ListModelList<ForecastDTO> forecastList = new ListModelList<>(forecastService.findAll());
            forecastDTO = new ForecastDTOBuilder()
                    .createForecastDTO();
        } else {
            this.forecastDTO = forecast;
            brand = forecastDTO.getBrand();
            product = forecastDTO.getProduct();
            suplier = forecastDTO.getSuplier();
            factory = forecastDTO.getFactory();
            isDiscontined = forecastDTO.getIsDiscontinued();
            priceVersion = forecastDTO.getPriceVersion();
            this.previous = previous;
        }
    }

    @Command("buttonSearch")
    @NotifyChange("forecastDTOs")
    public void buttonSearch(@ContextParam(ContextType.VIEW) Window window) {
        Map params = new HashMap();
        params.put("brand", brand);
        params.put("product", product);
        params.put("suplier", suplier);
        params.put("factory", factory);
        params.put("isDiscontined", isDiscontined);
        params.put("priceVersion", priceVersion);

        forecastDTOs = forecastService.findByParams(params);
    }

    public ForecastDTO getForecastDTO() {
        return forecastDTO;
    }

    public void setForecastDTO(ForecastDTO forecastDTO) {
        this.forecastDTO = forecastDTO;
    }

    public List<ForecastDTO> getForecastDTOs() {
        return forecastDTOs;
    }

    public void setForecastDTOs(List<ForecastDTO> forecastDTOs) {
        this.forecastDTOs = forecastDTOs;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getSuplier() {
        return suplier;
    }

    public void setSuplier(String suplier) {
        this.suplier = suplier;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    public IsDiscontinued getIsDiscontined() {
        return isDiscontined;
    }

    public void setIsDiscontined(IsDiscontinued isDiscontined) {
        this.isDiscontined = isDiscontined;
    }

    public String getPriceVersion() {
        return priceVersion;
    }

    public void setPriceVersion(String priceVersion) {
        this.priceVersion = priceVersion;
    }

    public ListModelList<IsDiscontinued> getListIsDiscontinued() {
        return new ListModelList<>(IsDiscontinued.values());
    }

    public void setListIsDiscontinued(ListModelList<IsDiscontinued> listIsDiscontinued) {
        this.listIsDiscontinued = listIsDiscontinued;
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
