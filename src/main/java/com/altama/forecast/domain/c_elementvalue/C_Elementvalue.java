package com.altama.forecast.domain.c_elementvalue;

import com.altama.forecast.domain.ad_treenodeu1.Ad_treenodeu1;
import com.altama.forecast.domain.shared.EntityObject;
import java.math.BigDecimal;
import java.util.Objects;

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
    private Ad_treenodeu1 ad_treenodeu1;

    public C_Elementvalue() {
    }

    public C_Elementvalue(BigDecimal c_elementvalue_id, BigDecimal ad_client_id, String value, String brand, String description, Ad_treenodeu1 ad_treenodeu1) {
        this.c_elementvalue_id = c_elementvalue_id;
        this.ad_client_id = ad_client_id;
        this.value = value;
        this.brand = brand;
        this.description = description;
        this.ad_treenodeu1 = ad_treenodeu1;
    }

    public void assignNEWc_elemenvalue(C_Elementvalue c_Elementvalue) {
        this.c_elementvalue_id = c_Elementvalue.c_elementvalue_id;
        this.ad_client_id = c_Elementvalue.ad_client_id;
        this.value = c_Elementvalue.value;
        this.brand = c_Elementvalue.brand;
        this.description = c_Elementvalue.description;

    }

    public Ad_treenodeu1 getAd_treenodeu1() {
        return ad_treenodeu1;
    }

    public void setAd_treenodeu1(Ad_treenodeu1 ad_treenodeu1) {
        this.ad_treenodeu1 = ad_treenodeu1;
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
        hash = 79 * hash + Objects.hashCode(this.ad_client_id);
        hash = 79 * hash + Objects.hashCode(this.value);
        hash = 79 * hash + Objects.hashCode(this.brand);
        hash = 79 * hash + Objects.hashCode(this.description);
        hash = 79 * hash + Objects.hashCode(this.ad_treenodeu1);
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
        if (!Objects.equals(this.c_elementvalue_id, other.c_elementvalue_id)) {
            return false;
        }
        return true;
    }

    @Override
    public boolean sameIdentityAs(C_Elementvalue other) {
        return this.equals(other);
    }

}
