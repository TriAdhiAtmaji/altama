/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.altama.forecast.interfaces.web.facade.dto.z_m_factory;

import com.altama.forecast.domain.z_m_product_factory.Z_m_product_factory;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

public class Z_m_factoryDTOBuilder {

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
    private Set<Z_m_product_factory> z_m_product_factory;

    public Z_m_factoryDTOBuilder() {
    }

    public Z_m_factoryDTOBuilder setZ_m_factory_id(BigDecimal z_m_factory_id) {
        this.z_m_factory_id = z_m_factory_id;
        return this;
    }

    public Z_m_factoryDTOBuilder setAd_client_id(BigDecimal ad_client_id) {
        this.ad_client_id = ad_client_id;
        return this;
    }

    public Z_m_factoryDTOBuilder setAd_org_id(BigDecimal ad_org_id) {
        this.ad_org_id = ad_org_id;
        return this;
    }

    public Z_m_factoryDTOBuilder setIsactive(String isactive) {
        this.isactive = isactive;
        return this;
    }

    public Z_m_factoryDTOBuilder setCreated(Date created) {
        this.created = created;
        return this;
    }

    public Z_m_factoryDTOBuilder setCreatedby(BigDecimal createdby) {
        this.createdby = createdby;
        return this;
    }

    public Z_m_factoryDTOBuilder setUpdated(Date updated) {
        this.updated = updated;
        return this;
    }

    public Z_m_factoryDTOBuilder setUpdatedby(BigDecimal updatedby) {
        this.updatedby = updatedby;
        return this;
    }

    public Z_m_factoryDTOBuilder setC_bpartner_id(BigDecimal c_bpartner_id) {
        this.c_bpartner_id = c_bpartner_id;
        return this;
    }

    public Z_m_factoryDTOBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public Z_m_factoryDTOBuilder setZ_m_product_factory(Set<Z_m_product_factory> z_m_product_factory) {
        this.z_m_product_factory = z_m_product_factory;
        return this;
    }

    public Z_m_factoryDTO createZ_m_factoryDTO() {
        return new Z_m_factoryDTO(z_m_factory_id, ad_client_id, ad_org_id, isactive, created, createdby, updated, updatedby, c_bpartner_id, name, z_m_product_factory);
    }

}
