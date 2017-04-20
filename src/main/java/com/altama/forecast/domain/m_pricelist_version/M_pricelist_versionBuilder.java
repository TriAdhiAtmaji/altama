
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.altama.forecast.domain.m_pricelist_version;

import java.math.BigDecimal;

public class M_pricelist_versionBuilder {

    private BigDecimal m_pricelist_version_id;
    private String namePricelist;

    public M_pricelist_versionBuilder() {
    }

    public M_pricelist_versionBuilder setM_pricelist_version_id(BigDecimal m_pricelist_version_id) {
        this.m_pricelist_version_id = m_pricelist_version_id;
        return this;
    }

    public M_pricelist_versionBuilder setNamePricelist(String namePricelist) {
        this.namePricelist = namePricelist;
        return this;
    }

    public M_pricelist_version createM_pricelist_version() {
        return new M_pricelist_version(m_pricelist_version_id, namePricelist);
    }

}
