package com.altama.forecast.domain.forecastrecomend;

import com.altama.forecast.domain.m_product.IsDiscontinue;
import com.altama.forecast.domain.shared.EntityObject;
import java.math.BigDecimal;

/**
 *
 * @author admin
 */
public class CountForecastRecomend implements EntityObject<CountForecastRecomend> {

    private BigDecimal m_product_id;
    private BigDecimal z_m_factory_id;
    private BigDecimal c_bpartner_id;
    private BigDecimal c_elementvalue_id;
    private IsDiscontinue isdiscontinued;
    private String product;
    private BigDecimal m_pricelist_version_id;

    public CountForecastRecomend() {
    }

    public CountForecastRecomend(BigDecimal m_product_id, BigDecimal z_m_factory_id, BigDecimal c_bpartner_id, BigDecimal c_elementvalue_id, IsDiscontinue isdiscontinued, String product, BigDecimal m_pricelist_version_id) {
        this.m_product_id = m_product_id;
        this.z_m_factory_id = z_m_factory_id;
        this.c_bpartner_id = c_bpartner_id;
        this.c_elementvalue_id = c_elementvalue_id;
        this.isdiscontinued = isdiscontinued;
        this.product = product;
        this.m_pricelist_version_id = m_pricelist_version_id;
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

    public BigDecimal getC_bpartner_id() {
        return c_bpartner_id;
    }

    public void setC_bpartner_id(BigDecimal c_bpartner_id) {
        this.c_bpartner_id = c_bpartner_id;
    }

    public BigDecimal getC_elementvalue_id() {
        return c_elementvalue_id;
    }

    public void setC_elementvalue_id(BigDecimal c_elementvalue_id) {
        this.c_elementvalue_id = c_elementvalue_id;
    }

    public IsDiscontinue getIsdiscontinued() {
        return isdiscontinued;
    }

    public void setIsdiscontinued(IsDiscontinue isdiscontinued) {
        this.isdiscontinued = isdiscontinued;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public BigDecimal getM_pricelist_version_id() {
        return m_pricelist_version_id;
    }

    public void setM_pricelist_version_id(BigDecimal m_pricelist_version_id) {
        this.m_pricelist_version_id = m_pricelist_version_id;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + (this.z_m_factory_id != null ? this.z_m_factory_id.hashCode() : 0);
        hash = 43 * hash + (this.c_bpartner_id != null ? this.c_bpartner_id.hashCode() : 0);
        hash = 43 * hash + (this.c_elementvalue_id != null ? this.c_elementvalue_id.hashCode() : 0);
        hash = 43 * hash + (this.isdiscontinued != null ? this.isdiscontinued.hashCode() : 0);
        hash = 43 * hash + (this.product != null ? this.product.hashCode() : 0);
        hash = 43 * hash + (this.m_pricelist_version_id != null ? this.m_pricelist_version_id.hashCode() : 0);
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
        final CountForecastRecomend other = (CountForecastRecomend) obj;
        if (this.m_product_id != other.m_product_id && (this.m_product_id == null || !this.m_product_id.equals(other.m_product_id))) {
            return false;
        }
        return true;
    }

    @Override
    public boolean sameIdentityAs(CountForecastRecomend other) {
        return this.equals(other);
    }

}
