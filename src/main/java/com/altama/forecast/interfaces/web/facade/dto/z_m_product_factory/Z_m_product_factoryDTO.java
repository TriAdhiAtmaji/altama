package com.altama.forecast.interfaces.web.facade.dto.z_m_product_factory;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @author admin
 */
public class Z_m_product_factoryDTO implements Serializable {

    private BigDecimal z_m_product_factory_id;
    private BigDecimal m_product_id;
    private BigDecimal z_m_factory_id;
    private String iscurrentvendor;

    public Z_m_product_factoryDTO() {
    }

    public Z_m_product_factoryDTO(BigDecimal z_m_product_factory_id, BigDecimal m_product_id, BigDecimal z_m_factory_id, String iscurrentvendor) {
        this.z_m_product_factory_id = z_m_product_factory_id;
        this.m_product_id = m_product_id;
        this.z_m_factory_id = z_m_factory_id;
        this.iscurrentvendor = iscurrentvendor;
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
    public String toString() {
        return "Z_m_product_factoryDTO{" + "z_m_product_factory_id=" + z_m_product_factory_id + ", m_product_id=" + m_product_id + ", z_m_factory_id=" + z_m_factory_id + ", iscurrentvendor=" + iscurrentvendor + '}';
    }

}
