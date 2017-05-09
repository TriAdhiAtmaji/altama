/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.altama.forecast.interfaces.web.facade.dto.forecastRecomendDTO;

import com.altama.forecast.domain.m_product.IsDiscontinue;
import java.math.BigDecimal;

public class ForecastRecomendDTOBuilder {

    private BigDecimal m_product_id;
    private BigDecimal c_bpartner_id;
    private BigDecimal c_elementvalue_id;
    private BigDecimal z_m_factory_id;
    private BigDecimal m_pricelist_version_id;
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

    public ForecastRecomendDTOBuilder() {
    }

    public ForecastRecomendDTOBuilder setM_product_id(BigDecimal m_product_id) {
        this.m_product_id = m_product_id;
        return this;
    }

    public ForecastRecomendDTOBuilder setC_bpartner_id(BigDecimal c_bpartner_id) {
        this.c_bpartner_id = c_bpartner_id;
        return this;
    }

    public ForecastRecomendDTOBuilder setC_elementvalue_id(BigDecimal c_elementvalue_id) {
        this.c_elementvalue_id = c_elementvalue_id;
        return this;
    }

    public ForecastRecomendDTOBuilder setZ_m_factory_id(BigDecimal z_m_factory_id) {
        this.z_m_factory_id = z_m_factory_id;
        return this;
    }

    public ForecastRecomendDTOBuilder setM_pricelist_version_id(BigDecimal m_pricelist_version_id) {
        this.m_pricelist_version_id = m_pricelist_version_id;
        return this;
    }

    public ForecastRecomendDTOBuilder setProduct(String product) {
        this.product = product;
        return this;
    }

    public ForecastRecomendDTOBuilder setQtyAvailable(BigDecimal qtyAvailable) {
        this.qtyAvailable = qtyAvailable;
        return this;
    }

    public ForecastRecomendDTOBuilder setQtyAverage(BigDecimal qtyAverage) {
        this.qtyAverage = qtyAverage;
        return this;
    }

    public ForecastRecomendDTOBuilder setLeadTime(BigDecimal leadTime) {
        this.leadTime = leadTime;
        return this;
    }

    public ForecastRecomendDTOBuilder setQtyBatasAtas(BigDecimal qtyBatasAtas) {
        this.qtyBatasAtas = qtyBatasAtas;
        return this;
    }

    public ForecastRecomendDTOBuilder setQtyOnOrdered(BigDecimal qtyOnOrdered) {
        this.qtyOnOrdered = qtyOnOrdered;
        return this;
    }

    public ForecastRecomendDTOBuilder setPriceListJual(BigDecimal priceListJual) {
        this.priceListJual = priceListJual;
        return this;
    }

    public ForecastRecomendDTOBuilder setPriceListLastPO(BigDecimal priceListLastPO) {
        this.priceListLastPO = priceListLastPO;
        return this;
    }

    public ForecastRecomendDTOBuilder setCurrencyListPO(String currencyListPO) {
        this.currencyListPO = currencyListPO;
        return this;
    }

    public ForecastRecomendDTOBuilder setMoq(BigDecimal moq) {
        this.moq = moq;
        return this;
    }

    public ForecastRecomendDTOBuilder setQtyPcsPerMasterBox(BigDecimal qtyPcsPerMasterBox) {
        this.qtyPcsPerMasterBox = qtyPcsPerMasterBox;
        return this;
    }

    public ForecastRecomendDTOBuilder setRecomendQtyPOPcs(BigDecimal recomendQtyPOPcs) {
        this.recomendQtyPOPcs = recomendQtyPOPcs;
        return this;
    }

    public ForecastRecomendDTOBuilder setTotalMasterBox(BigDecimal totalMasterBox) {
        this.totalMasterBox = totalMasterBox;
        return this;
    }

    public ForecastRecomendDTOBuilder setIsDiscontinue(IsDiscontinue isDiscontinue) {
        this.isDiscontinue = isDiscontinue;
        return this;
    }

    public ForecastRecomendDTO createForecastRecomendDTO() {
        return new ForecastRecomendDTO(m_product_id, c_bpartner_id, c_elementvalue_id, z_m_factory_id, m_pricelist_version_id, product, qtyAvailable, qtyAverage, leadTime, qtyBatasAtas, qtyOnOrdered, priceListJual, priceListLastPO, currencyListPO, moq, qtyPcsPerMasterBox, recomendQtyPOPcs, totalMasterBox, isDiscontinue);
    }

}
