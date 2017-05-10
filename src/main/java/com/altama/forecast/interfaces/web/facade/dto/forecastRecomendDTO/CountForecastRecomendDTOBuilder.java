/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.altama.forecast.interfaces.web.facade.dto.forecastRecomendDTO;

import com.altama.forecast.domain.m_product.IsDiscontinue;
import java.math.BigDecimal;

public class CountForecastRecomendDTOBuilder {

    private BigDecimal m_product_id;
    private BigDecimal z_m_factory_id;
    private BigDecimal c_bpartner_id;
    private BigDecimal c_elementvalue_id;
    private IsDiscontinue isdiscontinued;
    private String product;
    private BigDecimal m_pricelist_version_id;

    public CountForecastRecomendDTOBuilder() {
    }

    public CountForecastRecomendDTOBuilder setM_product_id(BigDecimal m_product_id) {
        this.m_product_id = m_product_id;
        return this;
    }

    public CountForecastRecomendDTOBuilder setZ_m_factory_id(BigDecimal z_m_factory_id) {
        this.z_m_factory_id = z_m_factory_id;
        return this;
    }

    public CountForecastRecomendDTOBuilder setC_bpartner_id(BigDecimal c_bpartner_id) {
        this.c_bpartner_id = c_bpartner_id;
        return this;
    }

    public CountForecastRecomendDTOBuilder setC_elementvalue_id(BigDecimal c_elementvalue_id) {
        this.c_elementvalue_id = c_elementvalue_id;
        return this;
    }

    public CountForecastRecomendDTOBuilder setIsdiscontinued(IsDiscontinue isdiscontinued) {
        this.isdiscontinued = isdiscontinued;
        return this;
    }

    public CountForecastRecomendDTOBuilder setProduct(String product) {
        this.product = product;
        return this;
    }

    public CountForecastRecomendDTOBuilder setM_pricelist_version_id(BigDecimal m_pricelist_version_id) {
        this.m_pricelist_version_id = m_pricelist_version_id;
        return this;
    }

    public CountForecastRecomendDTO createCountForecastRecomendDTO() {
        return new CountForecastRecomendDTO(m_product_id, z_m_factory_id, c_bpartner_id, c_elementvalue_id, isdiscontinued, product, m_pricelist_version_id);
    }

}
