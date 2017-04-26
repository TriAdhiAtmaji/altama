/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.altama.forecast.domain.z_m_product_factory;

import com.altama.forecast.domain.z_m_factory.Z_m_factory;
import java.math.BigDecimal;

public class Z_m_product_factoryBuilder {

    private BigDecimal z_m_product_factory_id;
    private BigDecimal m_product_id;
    private BigDecimal z_m_factory_id;
    private String iscurrentvendor;
    private Z_m_factory z_m_factory;

    public Z_m_product_factoryBuilder() {
    }

    public Z_m_product_factoryBuilder setZ_m_product_factory_id(BigDecimal z_m_product_factory_id) {
        this.z_m_product_factory_id = z_m_product_factory_id;
        return this;
    }

    public Z_m_product_factoryBuilder setM_product_id(BigDecimal m_product_id) {
        this.m_product_id = m_product_id;
        return this;
    }

    public Z_m_product_factoryBuilder setZ_m_factory_id(BigDecimal z_m_factory_id) {
        this.z_m_factory_id = z_m_factory_id;
        return this;
    }

    public Z_m_product_factoryBuilder setIscurrentvendor(String iscurrentvendor) {
        this.iscurrentvendor = iscurrentvendor;
        return this;
    }

    public Z_m_product_factoryBuilder setZ_m_factory(Z_m_factory z_m_factory) {
        this.z_m_factory = z_m_factory;
        return this;
    }

    public Z_m_product_factory createZ_m_product_factory() {
        return new Z_m_product_factory(z_m_product_factory_id, m_product_id, z_m_factory_id, iscurrentvendor, z_m_factory);
    }

}
