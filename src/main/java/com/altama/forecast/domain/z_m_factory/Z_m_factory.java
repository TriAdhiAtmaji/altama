package com.altama.forecast.domain.z_m_factory;

import com.altama.forecast.domain.shared.EntityObject;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author admin
 */
public class Z_m_factory implements EntityObject<Z_m_factory> {

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

    public Z_m_factory() {
    }

    public Z_m_factory(BigDecimal z_m_factory_id, BigDecimal ad_client_id, BigDecimal ad_org_id, String isactive, Date created, BigDecimal createdby, Date updated, BigDecimal updatedby, BigDecimal c_bpartner_id, String name) {
        this.z_m_factory_id = z_m_factory_id;
        this.ad_client_id = ad_client_id;
        this.ad_org_id = ad_org_id;
        this.isactive = isactive;
        this.created = created;
        this.createdby = createdby;
        this.updated = updated;
        this.updatedby = updatedby;
        this.c_bpartner_id = c_bpartner_id;
        this.name = name;
    }

    public void assignNewZ_m_factory(Z_m_factory z_m_factory) {
        this.z_m_factory_id = z_m_factory.z_m_factory_id;
        this.ad_client_id = z_m_factory.ad_client_id;
        this.ad_org_id = z_m_factory.ad_org_id;
        this.isactive = z_m_factory.isactive;
        this.created = z_m_factory.created;
        this.createdby = z_m_factory.createdby;
        this.updated = z_m_factory.updated;
        this.updatedby = z_m_factory.updatedby;
        this.c_bpartner_id = z_m_factory.c_bpartner_id;
        this.name = z_m_factory.name;
    }

    public BigDecimal getZ_m_factory_id() {
        return z_m_factory_id;
    }

    public void setZ_m_factory_id(BigDecimal z_m_factory_id) {
        this.z_m_factory_id = z_m_factory_id;
    }

    public BigDecimal getAd_client_id() {
        return ad_client_id;
    }

    public void setAd_client_id(BigDecimal ad_client_id) {
        this.ad_client_id = ad_client_id;
    }

    public BigDecimal getAd_org_id() {
        return ad_org_id;
    }

    public void setAd_org_id(BigDecimal ad_org_id) {
        this.ad_org_id = ad_org_id;
    }

    public String getIsactive() {
        return isactive;
    }

    public void setIsactive(String isactive) {
        this.isactive = isactive;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public BigDecimal getCreatedby() {
        return createdby;
    }

    public void setCreatedby(BigDecimal createdby) {
        this.createdby = createdby;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public BigDecimal getUpdatedby() {
        return updatedby;
    }

    public void setUpdatedby(BigDecimal updatedby) {
        this.updatedby = updatedby;
    }

    public BigDecimal getC_bpartner_id() {
        return c_bpartner_id;
    }

    public void setC_bpartner_id(BigDecimal c_bpartner_id) {
        this.c_bpartner_id = c_bpartner_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.ad_client_id);
        hash = 37 * hash + Objects.hashCode(this.ad_org_id);
        hash = 37 * hash + Objects.hashCode(this.isactive);
        hash = 37 * hash + Objects.hashCode(this.created);
        hash = 37 * hash + Objects.hashCode(this.createdby);
        hash = 37 * hash + Objects.hashCode(this.updated);
        hash = 37 * hash + Objects.hashCode(this.updatedby);
        hash = 37 * hash + Objects.hashCode(this.c_bpartner_id);
        hash = 37 * hash + Objects.hashCode(this.name);
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
        final Z_m_factory other = (Z_m_factory) obj;
        if (!Objects.equals(this.z_m_factory_id, other.z_m_factory_id)) {
            return false;
        }
        return true;
    }

    @Override
    public boolean sameIdentityAs(Z_m_factory other) {
        return this.equals(other);
    }

}
