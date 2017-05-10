package com.altama.forecast.domain.m_pricelist_version;

import com.altama.forecast.domain.shared.EntityObject;
import java.math.BigDecimal;

/**
 *
 * @author admin
 */
public class M_pricelist_version implements EntityObject<M_pricelist_version> {

    private BigDecimal m_pricelist_version_id;
    private String namePricelist;

    public M_pricelist_version() {
    }

    public M_pricelist_version(BigDecimal m_pricelist_version_id, String namePricelist) {
        this.m_pricelist_version_id = m_pricelist_version_id;
        this.namePricelist = namePricelist;
    }

    public void assignNewPricelistVersion(M_pricelist_version m_pricelist_version) {
        this.m_pricelist_version_id = m_pricelist_version.m_pricelist_version_id;
        this.namePricelist = m_pricelist_version.namePricelist;
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
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + (this.namePricelist != null ? this.namePricelist.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final M_pricelist_version other = (M_pricelist_version) obj;
        if (this.m_pricelist_version_id != other.m_pricelist_version_id && (this.m_pricelist_version_id == null || !this.m_pricelist_version_id.equals(other.m_pricelist_version_id))) {
            return false;
        }
        return true;
    }

    @Override
    public boolean sameIdentityAs(M_pricelist_version other) {
        return this.equals(other);
    }

}
