/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.altama.forecast.interfaces.web.facade.dto.forecast;

import com.altama.forecast.domain.forecast.IsDiscontinued;

public class ForecastDTOBuilder {

    private Double brandID;
    private String brand;
    private String product;
    private String suplier;
    private String factory;
    private IsDiscontinued isDiscontinued;
    private String priceVersion;
    private Double qtyAvalilable;
    private Double qtyAverage;
    private Double leadTime;
    private Double qtyBatasAtas;
    private Double qtyOnOrdered;
    private Double priceListJual;
    private Double currencyLastPCS;
    private Double priceListLastPCS;
    private Double moq;
    private Double qtyPCSperMasterBox;
    private Double rekomendasiQtyPO;
    private Double totalMasterBox;

    public ForecastDTOBuilder() {
    }

    public ForecastDTOBuilder setBrandID(Double brandID) {
        this.brandID = brandID;
        return this;
    }

    public ForecastDTOBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public ForecastDTOBuilder setProduct(String product) {
        this.product = product;
        return this;
    }

    public ForecastDTOBuilder setSuplier(String suplier) {
        this.suplier = suplier;
        return this;
    }

    public ForecastDTOBuilder setFactory(String factory) {
        this.factory = factory;
        return this;
    }

    public ForecastDTOBuilder setIsDiscontinued(IsDiscontinued isDiscontinued) {
        this.isDiscontinued = isDiscontinued;
        return this;
    }

    public ForecastDTOBuilder setPriceVersion(String priceVersion) {
        this.priceVersion = priceVersion;
        return this;
    }

    public ForecastDTOBuilder setQtyAvalilable(Double qtyAvalilable) {
        this.qtyAvalilable = qtyAvalilable;
        return this;
    }

    public ForecastDTOBuilder setQtyAverage(Double qtyAverage) {
        this.qtyAverage = qtyAverage;
        return this;
    }

    public ForecastDTOBuilder setLeadTime(Double leadTime) {
        this.leadTime = leadTime;
        return this;
    }

    public ForecastDTOBuilder setQtyBatasAtas(Double qtyBatasAtas) {
        this.qtyBatasAtas = qtyBatasAtas;
        return this;
    }

    public ForecastDTOBuilder setQtyOnOrdered(Double qtyOnOrdered) {
        this.qtyOnOrdered = qtyOnOrdered;
        return this;
    }

    public ForecastDTOBuilder setPriceListJual(Double priceListJual) {
        this.priceListJual = priceListJual;
        return this;
    }

    public ForecastDTOBuilder setCurrencyLastPCS(Double currencyLastPCS) {
        this.currencyLastPCS = currencyLastPCS;
        return this;
    }

    public ForecastDTOBuilder setPriceListLastPCS(Double priceListLastPCS) {
        this.priceListLastPCS = priceListLastPCS;
        return this;
    }

    public ForecastDTOBuilder setMoq(Double moq) {
        this.moq = moq;
        return this;
    }

    public ForecastDTOBuilder setQtyPCSperMasterBox(Double qtyPCSperMasterBox) {
        this.qtyPCSperMasterBox = qtyPCSperMasterBox;
        return this;
    }

    public ForecastDTOBuilder setRekomendasiQtyPO(Double rekomendasiQtyPO) {
        this.rekomendasiQtyPO = rekomendasiQtyPO;
        return this;
    }

    public ForecastDTOBuilder setTotalMasterBox(Double totalMasterBox) {
        this.totalMasterBox = totalMasterBox;
        return this;
    }

    public ForecastDTO createForecastDTO() {
        return new ForecastDTO(brandID, brand, product, suplier, factory, isDiscontinued, priceVersion, qtyAvalilable, qtyAverage, leadTime, qtyBatasAtas, qtyOnOrdered, priceListJual, currencyLastPCS, priceListLastPCS, moq, qtyPCSperMasterBox, rekomendasiQtyPO, totalMasterBox);
    }

}
