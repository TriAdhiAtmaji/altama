/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.altama.forecast.domain.forecast;

public class ForecastBuilder {

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

    public ForecastBuilder() {
    }

    public ForecastBuilder setBrandID(Double brandID) {
        this.brandID = brandID;
        return this;
    }

    public ForecastBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public ForecastBuilder setProduct(String product) {
        this.product = product;
        return this;
    }

    public ForecastBuilder setSuplier(String suplier) {
        this.suplier = suplier;
        return this;
    }

    public ForecastBuilder setFactory(String factory) {
        this.factory = factory;
        return this;
    }

    public ForecastBuilder setIsDiscontinued(IsDiscontinued isDiscontinued) {
        this.isDiscontinued = isDiscontinued;
        return this;
    }

    public ForecastBuilder setPriceVersion(String priceVersion) {
        this.priceVersion = priceVersion;
        return this;
    }

    public ForecastBuilder setQtyAvalilable(Double qtyAvalilable) {
        this.qtyAvalilable = qtyAvalilable;
        return this;
    }

    public ForecastBuilder setQtyAverage(Double qtyAverage) {
        this.qtyAverage = qtyAverage;
        return this;
    }

    public ForecastBuilder setLeadTime(Double leadTime) {
        this.leadTime = leadTime;
        return this;
    }

    public ForecastBuilder setQtyBatasAtas(Double qtyBatasAtas) {
        this.qtyBatasAtas = qtyBatasAtas;
        return this;
    }

    public ForecastBuilder setQtyOnOrdered(Double qtyOnOrdered) {
        this.qtyOnOrdered = qtyOnOrdered;
        return this;
    }

    public ForecastBuilder setPriceListJual(Double priceListJual) {
        this.priceListJual = priceListJual;
        return this;
    }

    public ForecastBuilder setCurrencyLastPCS(Double currencyLastPCS) {
        this.currencyLastPCS = currencyLastPCS;
        return this;
    }

    public ForecastBuilder setPriceListLastPCS(Double priceListLastPCS) {
        this.priceListLastPCS = priceListLastPCS;
        return this;
    }

    public ForecastBuilder setMoq(Double moq) {
        this.moq = moq;
        return this;
    }

    public ForecastBuilder setQtyPCSperMasterBox(Double qtyPCSperMasterBox) {
        this.qtyPCSperMasterBox = qtyPCSperMasterBox;
        return this;
    }

    public ForecastBuilder setRekomendasiQtyPO(Double rekomendasiQtyPO) {
        this.rekomendasiQtyPO = rekomendasiQtyPO;
        return this;
    }

    public ForecastBuilder setTotalMasterBox(Double totalMasterBox) {
        this.totalMasterBox = totalMasterBox;
        return this;
    }

    public Forecast createForecast() {
        return new Forecast(brandID, brand, product, suplier, factory, isDiscontinued, priceVersion, qtyAvalilable, qtyAverage, leadTime, qtyBatasAtas, qtyOnOrdered, priceListJual, currencyLastPCS, priceListLastPCS, moq, qtyPCSperMasterBox, rekomendasiQtyPO, totalMasterBox);
    }

}
