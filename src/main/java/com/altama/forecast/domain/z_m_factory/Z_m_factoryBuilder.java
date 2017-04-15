/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.altama.forecast.domain.z_m_factory;

import java.math.BigDecimal;
import java.util.Date;

public class Z_m_factoryBuilder {

    private BigDecimal z_m_factory_id;
    private BigDecimal ad_client_id;
    private BigDecimal ad_org_id;
    private String isactive;
    private Date created;
    private BigDecimal createdby;
    private Date updated;
    private BigDecimal updatedby;
    private BigDecimal c_bpartner_id;
    private String name;

    public Z_m_factoryBuilder() {
    }

    public Z_m_factoryBuilder setZ_m_factory_id(BigDecimal z_m_factory_id) {
        this.z_m_factory_id = z_m_factory_id;
        return this;
    }

    public Z_m_factoryBuilder setAd_client_id(BigDecimal ad_client_id) {
        this.ad_client_id = ad_client_id;
        return this;
    }

    public Z_m_factoryBuilder setAd_org_id(BigDecimal ad_org_id) {
        this.ad_org_id = ad_org_id;
        return this;
    }

    public Z_m_factoryBuilder setIsactive(String isactive) {
        this.isactive = isactive;
        return this;
    }

    public Z_m_factoryBuilder setCreated(Date created) {
        this.created = created;
        return this;
    }

    public Z_m_factoryBuilder setCreatedby(BigDecimal createdby) {
        this.createdby = createdby;
        return this;
    }

    public Z_m_factoryBuilder setUpdated(Date updated) {
        this.updated = updated;
        return this;
    }

    public Z_m_factoryBuilder setUpdatedby(BigDecimal updatedby) {
        this.updatedby = updatedby;
        return this;
    }

    public Z_m_factoryBuilder setC_bpartner_id(BigDecimal c_bpartner_id) {
        this.c_bpartner_id = c_bpartner_id;
        return this;
    }

    public Z_m_factoryBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public Z_m_factory createZ_m_factory() {
        return new Z_m_factory(z_m_factory_id, ad_client_id, ad_org_id, isactive, created, createdby, updated, updatedby, c_bpartner_id, name);
    }

}
