/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.altama.forecast.interfaces.web.facade.dto.z_m_product_factory;

import java.math.BigDecimal;

public class Z_m_product_factoryDTOBuilder {

    private BigDecimal z_m_product_factory_id;
    private BigDecimal m_product_id;
    private BigDecimal z_m_factory_id;
    private String iscurrentvendor;

    public Z_m_product_factoryDTOBuilder() {
    }

    public Z_m_product_factoryDTOBuilder setZ_m_product_factory_id(BigDecimal z_m_product_factory_id) {
        this.z_m_product_factory_id = z_m_product_factory_id;
        return this;
    }

    public Z_m_product_factoryDTOBuilder setM_product_id(BigDecimal m_product_id) {
        this.m_product_id = m_product_id;
        return this;
    }

    public Z_m_product_factoryDTOBuilder setZ_m_factory_id(BigDecimal z_m_factory_id) {
        this.z_m_factory_id = z_m_factory_id;
        return this;
    }

    public Z_m_product_factoryDTOBuilder setIscurrentvendor(String iscurrentvendor) {
        this.iscurrentvendor = iscurrentvendor;
        return this;
    }

    public Z_m_product_factoryDTO createZ_m_product_factoryDTO() {
        return new Z_m_product_factoryDTO(z_m_product_factory_id, m_product_id, z_m_factory_id, iscurrentvendor);
    }

}
