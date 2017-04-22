/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.altama.forecast.interfaces.web.facade.dto.m_productDTO;

import com.altama.forecast.domain.m_product.IsDiscontinue;
import java.math.BigDecimal;

public class M_productDTOBuilder {

    private BigDecimal m_product_id;
    private BigDecimal ad_client_id;
    private BigDecimal ad_org_id;
    private String value;
    private String name;
    private BigDecimal c_uom_id;
    private BigDecimal salesrep_id;
    private BigDecimal c_revenuerecognition_id;
    private BigDecimal m_product_category_id;
    private String classification;
    private BigDecimal volume;
    private BigDecimal weight;
    private BigDecimal m_locator_id;
    private String wmsvalue;
    private IsDiscontinue isDiscontinue;

    public M_productDTOBuilder() {
    }

    public M_productDTOBuilder setM_product_id(BigDecimal m_product_id) {
        this.m_product_id = m_product_id;
        return this;
    }

    public M_productDTOBuilder setAd_client_id(BigDecimal ad_client_id) {
        this.ad_client_id = ad_client_id;
        return this;
    }

    public M_productDTOBuilder setAd_org_id(BigDecimal ad_org_id) {
        this.ad_org_id = ad_org_id;
        return this;
    }

    public M_productDTOBuilder setValue(String value) {
        this.value = value;
        return this;
    }

    public M_productDTOBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public M_productDTOBuilder setC_uom_id(BigDecimal c_uom_id) {
        this.c_uom_id = c_uom_id;
        return this;
    }

    public M_productDTOBuilder setSalesrep_id(BigDecimal salesrep_id) {
        this.salesrep_id = salesrep_id;
        return this;
    }

    public M_productDTOBuilder setC_revenuerecognition_id(BigDecimal c_revenuerecognition_id) {
        this.c_revenuerecognition_id = c_revenuerecognition_id;
        return this;
    }

    public M_productDTOBuilder setM_product_category_id(BigDecimal m_product_category_id) {
        this.m_product_category_id = m_product_category_id;
        return this;
    }

    public M_productDTOBuilder setClassification(String classification) {
        this.classification = classification;
        return this;
    }

    public M_productDTOBuilder setVolume(BigDecimal volume) {
        this.volume = volume;
        return this;
    }

    public M_productDTOBuilder setWeight(BigDecimal weight) {
        this.weight = weight;
        return this;
    }

    public M_productDTOBuilder setM_locator_id(BigDecimal m_locator_id) {
        this.m_locator_id = m_locator_id;
        return this;
    }

    public M_productDTOBuilder setWmsvalue(String wmsvalue) {
        this.wmsvalue = wmsvalue;
        return this;
    }

    public M_productDTOBuilder setIsDiscontinue(IsDiscontinue isDiscontinue) {
        this.isDiscontinue = isDiscontinue;
        return this;
    }

    public M_productDTO createM_productDTO() {
        return new M_productDTO(m_product_id, ad_client_id, ad_org_id, value, name, c_uom_id, salesrep_id, c_revenuerecognition_id, m_product_category_id, classification, volume, weight, m_locator_id, wmsvalue, isDiscontinue);
    }

}
