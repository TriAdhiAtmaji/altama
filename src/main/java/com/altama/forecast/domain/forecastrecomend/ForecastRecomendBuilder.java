/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.altama.forecast.domain.forecastrecomend;

import com.altama.forecast.domain.m_product.IsDiscontinue;
import java.math.BigDecimal;

public class ForecastRecomendBuilder {

    private BigDecimal m_product_id;
    private BigDecimal c_bpartner_id;
    private BigDecimal c_elementvalue_id;
    private BigDecimal z_m_factory_id;
    private BigDecimal m_pricelist_version_id;
    private String supplier;
    private String factory;
    private String barcode;
    private String itemCode;
    private String productEnglish;
    private String product;
    private BigDecimal qtyAvailable;
    private BigDecimal qtyAverage;
    private BigDecimal leadTime;
    private BigDecimal qtyBatasAtas;
    private BigDecimal qtyOnOrdered;
    private BigDecimal priceListJual;
    private BigDecimal priceListLastPO;
    private String currencyListPO;
    private BigDecimal moq;
    private BigDecimal qtyPcsPerMasterBox;
    private BigDecimal recomendQtyPOPcs;
    private BigDecimal totalMasterBox;
    private IsDiscontinue isDiscontinue;

    public ForecastRecomendBuilder() {
    }

    public ForecastRecomendBuilder setM_product_id(BigDecimal m_product_id) {
        this.m_product_id = m_product_id;
        return this;
    }

    public ForecastRecomendBuilder setC_bpartner_id(BigDecimal c_bpartner_id) {
        this.c_bpartner_id = c_bpartner_id;
        return this;
    }

    public ForecastRecomendBuilder setC_elementvalue_id(BigDecimal c_elementvalue_id) {
        this.c_elementvalue_id = c_elementvalue_id;
        return this;
    }

    public ForecastRecomendBuilder setZ_m_factory_id(BigDecimal z_m_factory_id) {
        this.z_m_factory_id = z_m_factory_id;
        return this;
    }

    public ForecastRecomendBuilder setM_pricelist_version_id(BigDecimal m_pricelist_version_id) {
        this.m_pricelist_version_id = m_pricelist_version_id;
        return this;
    }

    public ForecastRecomendBuilder setSupplier(String supplier) {
        this.supplier = supplier;
        return this;
    }

    public ForecastRecomendBuilder setFactory(String factory) {
        this.factory = factory;
        return this;
    }

    public ForecastRecomendBuilder setBarcode(String barcode) {
        this.barcode = barcode;
        return this;
    }

    public ForecastRecomendBuilder setItemCode(String itemCode) {
        this.itemCode = itemCode;
        return this;
    }

    public ForecastRecomendBuilder setProductEnglish(String productEnglish) {
        this.productEnglish = productEnglish;
        return this;
    }

    public ForecastRecomendBuilder setProduct(String product) {
        this.product = product;
        return this;
    }

    public ForecastRecomendBuilder setQtyAvailable(BigDecimal qtyAvailable) {
        this.qtyAvailable = qtyAvailable;
        return this;
    }

    public ForecastRecomendBuilder setQtyAverage(BigDecimal qtyAverage) {
        this.qtyAverage = qtyAverage;
        return this;
    }

    public ForecastRecomendBuilder setLeadTime(BigDecimal leadTime) {
        this.leadTime = leadTime;
        return this;
    }

    public ForecastRecomendBuilder setQtyBatasAtas(BigDecimal qtyBatasAtas) {
        this.qtyBatasAtas = qtyBatasAtas;
        return this;
    }

    public ForecastRecomendBuilder setQtyOnOrdered(BigDecimal qtyOnOrdered) {
        this.qtyOnOrdered = qtyOnOrdered;
        return this;
    }

    public ForecastRecomendBuilder setPriceListJual(BigDecimal priceListJual) {
        this.priceListJual = priceListJual;
        return this;
    }

    public ForecastRecomendBuilder setPriceListLastPO(BigDecimal priceListLastPO) {
        this.priceListLastPO = priceListLastPO;
        return this;
    }

    public ForecastRecomendBuilder setCurrencyListPO(String currencyListPO) {
        this.currencyListPO = currencyListPO;
        return this;
    }

    public ForecastRecomendBuilder setMoq(BigDecimal moq) {
        this.moq = moq;
        return this;
    }

    public ForecastRecomendBuilder setQtyPcsPerMasterBox(BigDecimal qtyPcsPerMasterBox) {
        this.qtyPcsPerMasterBox = qtyPcsPerMasterBox;
        return this;
    }

    public ForecastRecomendBuilder setRecomendQtyPOPcs(BigDecimal recomendQtyPOPcs) {
        this.recomendQtyPOPcs = recomendQtyPOPcs;
        return this;
    }

    public ForecastRecomendBuilder setTotalMasterBox(BigDecimal totalMasterBox) {
        this.totalMasterBox = totalMasterBox;
        return this;
    }

    public ForecastRecomendBuilder setIsDiscontinue(IsDiscontinue isDiscontinue) {
        this.isDiscontinue = isDiscontinue;
        return this;
    }

    public ForecastRecomend createForecastRecomend() {
        return new ForecastRecomend(m_product_id, c_bpartner_id, c_elementvalue_id, z_m_factory_id, m_pricelist_version_id, supplier, factory, barcode, itemCode, productEnglish, product, qtyAvailable, qtyAverage, leadTime, qtyBatasAtas, qtyOnOrdered, priceListJual, priceListLastPO, currencyListPO, moq, qtyPcsPerMasterBox, recomendQtyPOPcs, totalMasterBox, isDiscontinue);
    }

}
