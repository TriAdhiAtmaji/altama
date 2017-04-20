package com.altama.forecast.interfaces.web.facade.dto.m_pricelist_versionDTO;

import java.math.BigDecimal;

/**
 *
 * @author admin
 */
public class M_pricelist_versionDTO {

    private BigDecimal m_pricelist_version_id;
    private String namePricelist;

    public M_pricelist_versionDTO() {
    }

    public M_pricelist_versionDTO(BigDecimal m_pricelist_version_id, String namePricelist) {
        this.m_pricelist_version_id = m_pricelist_version_id;
        this.namePricelist = namePricelist;
    }

    public BigDecimal getM_pricelist_version_id() {
        return m_pricelist_version_id;
    }

    public void setM_pricelist_version_id(BigDecimal m_pricelist_version_id) {
        this.m_pricelist_version_id = m_pricelist_version_id;
    }

    public String getNamePricelist() {
        return namePricelist;
    }

    public void setNamePricelist(String namePricelist) {
        this.namePricelist = namePricelist;
    }

    @Override
    public String toString() {
        return "m_pricelist_versionDTO{" + "m_pricelist_version_id=" + m_pricelist_version_id + ", namePricelist=" + namePricelist + '}';
    }

}
