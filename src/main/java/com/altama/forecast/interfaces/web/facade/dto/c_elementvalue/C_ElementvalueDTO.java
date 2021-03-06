package com.altama.forecast.interfaces.web.facade.dto.c_elementvalue;

import com.altama.forecast.domain.ad_treenodeu1.Ad_treenodeu1;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @author admin
 */
public class C_ElementvalueDTO implements Serializable {

    private BigDecimal c_elementvalue_id;
    private BigDecimal ad_client_id;
    private String value;
    private String brand;
    private String description;
    private Ad_treenodeu1 node_id;

    public C_ElementvalueDTO() {
    }

    public C_ElementvalueDTO(BigDecimal c_elementvalue_id, BigDecimal ad_client_id, String value, String brand, String description, Ad_treenodeu1 node_id) {
        this.c_elementvalue_id = c_elementvalue_id;
        this.ad_client_id = ad_client_id;
        this.value = value;
        this.brand = brand;
        this.description = description;
        this.node_id = node_id;
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
    public String toString() {
        return "C_ElementvalueDTO{" + "c_elementvalue_id=" + c_elementvalue_id + ", ad_client_id=" + ad_client_id + ", value=" + value + ", brand=" + brand + ", description=" + description + ", node_id=" + node_id + '}';
    }

}
