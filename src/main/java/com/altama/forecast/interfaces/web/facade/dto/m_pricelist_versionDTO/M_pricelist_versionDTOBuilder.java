/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.altama.forecast.interfaces.web.facade.dto.m_pricelist_versionDTO;

import java.math.BigDecimal;


public class M_pricelist_versionDTOBuilder {
    private BigDecimal m_pricelist_version_id;
    private String namePricelist;

    public M_pricelist_versionDTOBuilder() {
    }

    public M_pricelist_versionDTOBuilder setM_pricelist_version_id(BigDecimal m_pricelist_version_id) {
        this.m_pricelist_version_id = m_pricelist_version_id;
        return this;
    }

    public M_pricelist_versionDTOBuilder setNamePricelist(String namePricelist) {
        this.namePricelist = namePricelist;
        return this;
    }

    public M_pricelist_versionDTO createM_pricelist_versionDTO() {
        return new M_pricelist_versionDTO(m_pricelist_version_id, namePricelist);
    }
    
}
