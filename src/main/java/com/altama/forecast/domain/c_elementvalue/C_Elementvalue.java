package com.altama.forecast.domain.c_elementvalue;

import com.altama.forecast.domain.ad_treenodeu1.Ad_treenodeu1;
import com.altama.forecast.domain.shared.EntityObject;
import java.math.BigDecimal;

/**
 *
 * @author admin
 */
public class C_Elementvalue implements EntityObject<C_Elementvalue> {

    private BigDecimal c_elementvalue_id;
    private BigDecimal ad_client_id;
    private String value;
    private String brand;
    private String description;
    private Ad_treenodeu1 node_id;

    public C_Elementvalue() {
    }

    public C_Elementvalue(BigDecimal c_elementvalue_id, BigDecimal ad_client_id, String value, String brand, String description, Ad_treenodeu1 node_id) {
        this.c_elementvalue_id = c_elementvalue_id;
        this.ad_client_id = ad_client_id;
        this.value = value;
        this.brand = brand;
        this.description = description;
        this.node_id = node_id;
    }

    public void assignNEWc_elemenvalue(C_Elementvalue c_Elementvalue) {
        this.c_elementvalue_id = c_Elementvalue.c_elementvalue_id;
        this.ad_client_id = c_Elementvalue.ad_client_id;
        this.value = c_Elementvalue.value;
        this.brand = c_Elementvalue.brand;
        this.description = c_Elementvalue.description;

    }

    public Ad_treenodeu1 getNode_id() {
        return node_id;
    }

    public void setNode_id(Ad_treenodeu1 node_id) {
        this.node_id = node_id;
    }

    public BigDecimal getC_elementvalue_id() {
        return c_elementvalue_id;
    }

    public void setC_elementvalue_id(BigDecimal c_elementvalue_id) {
        this.c_elementvalue_id = c_elementvalue_id;
    }

    public BigDecimal getAd_client_id() {
        return ad_client_id;
    }

    public void setAd_client_id(BigDecimal ad_client_id) {
        this.ad_client_id = ad_client_id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + (this.ad_client_id != null ? this.ad_client_id.hashCode() : 0);
        hash = 89 * hash + (this.value != null ? this.value.hashCode() : 0);
        hash = 89 * hash + (this.brand != null ? this.brand.hashCode() : 0);
        hash = 89 * hash + (this.description != null ? this.description.hashCode() : 0);
        hash = 89 * hash + (this.node_id != null ? this.node_id.hashCode() : 0);
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
        final C_Elementvalue other = (C_Elementvalue) obj;
        if (this.c_elementvalue_id != other.c_elementvalue_id && (this.c_elementvalue_id == null || !this.c_elementvalue_id.equals(other.c_elementvalue_id))) {
            return false;
        }
        return true;
    }

    @Override
    public boolean sameIdentityAs(C_Elementvalue other) {
        return this.equals(other);
    }

}
