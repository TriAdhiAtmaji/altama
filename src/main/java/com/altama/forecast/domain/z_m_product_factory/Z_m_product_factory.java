package com.altama.forecast.domain.z_m_product_factory;

import com.altama.forecast.domain.shared.EntityObject;
import com.altama.forecast.domain.z_m_factory.Z_m_factory;
import java.math.BigDecimal;

/**
 *
 * @author admin
 */
public class Z_m_product_factory implements EntityObject<Z_m_product_factory> {

    private BigDecimal z_m_product_factory_id;
    private BigDecimal m_product_id;
    private BigDecimal z_m_factory_id;
    private String iscurrentvendor;
    private Z_m_factory z_m_factory;

    public Z_m_product_factory() {
    }

    public Z_m_product_factory(BigDecimal z_m_product_factory_id, BigDecimal m_product_id, BigDecimal z_m_factory_id, String iscurrentvendor, Z_m_factory z_m_factory) {
        this.z_m_product_factory_id = z_m_product_factory_id;
        this.m_product_id = m_product_id;
        this.z_m_factory_id = z_m_factory_id;
        this.iscurrentvendor = iscurrentvendor;
        this.z_m_factory = z_m_factory;
    }

    public void assignNewZ_m_product_factory(Z_m_product_factory z_m_product_factory) {
        this.z_m_product_factory_id = z_m_product_factory.z_m_product_factory_id;
        this.m_product_id = z_m_product_factory.m_product_id;
        this.z_m_factory_id = z_m_product_factory.z_m_factory_id;
        this.iscurrentvendor = z_m_product_factory.iscurrentvendor;
    }

    public Z_m_factory getZ_m_factory() {
        return z_m_factory;
    }

    public void setZ_m_factory(Z_m_factory z_m_factory) {
        this.z_m_factory = z_m_factory;
    }

    public BigDecimal getZ_m_product_factory_id() {
        return z_m_product_factory_id;
    }

    public void setZ_m_product_factory_id(BigDecimal z_m_product_factory_id) {
        this.z_m_product_factory_id = z_m_product_factory_id;
    }

    public BigDecimal getM_product_id() {
        return m_product_id;
    }

    public void setM_product_id(BigDecimal m_product_id) {
        this.m_product_id = m_product_id;
    }

    public BigDecimal getZ_m_factory_id() {
        return z_m_factory_id;
    }

    public void setZ_m_factory_id(BigDecimal z_m_factory_id) {
        this.z_m_factory_id = z_m_factory_id;
    }

    public String getIscurrentvendor() {
        return iscurrentvendor;
    }

    public void setIscurrentvendor(String iscurrentvendor) {
        this.iscurrentvendor = iscurrentvendor;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + (this.m_product_id != null ? this.m_product_id.hashCode() : 0);
        hash = 83 * hash + (this.z_m_factory_id != null ? this.z_m_factory_id.hashCode() : 0);
        hash = 83 * hash + (this.iscurrentvendor != null ? this.iscurrentvendor.hashCode() : 0);
        hash = 83 * hash + (this.z_m_factory != null ? this.z_m_factory.hashCode() : 0);
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
        final Z_m_product_factory other = (Z_m_product_factory) obj;
        if (this.z_m_product_factory_id != other.z_m_product_factory_id && (this.z_m_product_factory_id == null || !this.z_m_product_factory_id.equals(other.z_m_product_factory_id))) {
            return false;
        }
        return true;
    }

    @Override
    public boolean sameIdentityAs(Z_m_product_factory other) {
        return this.equals(other);
    }

}
