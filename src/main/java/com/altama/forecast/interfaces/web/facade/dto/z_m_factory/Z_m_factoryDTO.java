package com.altama.forecast.interfaces.web.facade.dto.z_m_factory;

import com.altama.forecast.domain.z_m_product_factory.Z_m_product_factory;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 *
 * @author admin
 */
public class Z_m_factoryDTO implements Serializable {

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

    public Z_m_factoryDTO() {
    }

    public Z_m_factoryDTO(BigDecimal z_m_factory_id, BigDecimal ad_client_id, BigDecimal ad_org_id, String isactive, Date created, BigDecimal createdby, Date updated, BigDecimal updatedby, BigDecimal c_bpartner_id, String name, Set<Z_m_product_factory> z_m_product_factory) {
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
        this.z_m_product_factory = z_m_product_factory;
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

    public Set<Z_m_product_factory> getZ_m_product_factory() {
        return z_m_product_factory;
    }

    public void setZ_m_product_factory(Set<Z_m_product_factory> z_m_product_factory) {
        this.z_m_product_factory = z_m_product_factory;
    }

    @Override
    public String toString() {
        return "Z_m_factoryDTO{" + "z_m_factory_id=" + z_m_factory_id + ", ad_client_id=" + ad_client_id + ", ad_org_id=" + ad_org_id + ", isactive=" + isactive + ", created=" + created + ", createdby=" + createdby + ", updated=" + updated + ", updatedby=" + updatedby + ", c_bpartner_id=" + c_bpartner_id + ", name=" + name + ", z_m_product_factory=" + z_m_product_factory + '}';
    }

}
