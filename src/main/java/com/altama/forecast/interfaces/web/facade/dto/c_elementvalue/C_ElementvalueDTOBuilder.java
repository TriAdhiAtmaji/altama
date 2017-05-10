/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.altama.forecast.interfaces.web.facade.dto.c_elementvalue;

import com.altama.forecast.domain.ad_treenodeu1.Ad_treenodeu1;
import java.math.BigDecimal;

public class C_ElementvalueDTOBuilder {

    private BigDecimal c_elementvalue_id;
    private BigDecimal ad_client_id;
    private String value;
    private String brand;
    private String description;
    private Ad_treenodeu1 node_id;

    public C_ElementvalueDTOBuilder() {
    }

    public C_ElementvalueDTOBuilder setC_elementvalue_id(BigDecimal c_elementvalue_id) {
        this.c_elementvalue_id = c_elementvalue_id;
        return this;
    }

    public C_ElementvalueDTOBuilder setAd_client_id(BigDecimal ad_client_id) {
        this.ad_client_id = ad_client_id;
        return this;
    }

    public C_ElementvalueDTOBuilder setValue(String value) {
        this.value = value;
        return this;
    }

    public C_ElementvalueDTOBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public C_ElementvalueDTOBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public C_ElementvalueDTOBuilder setNode_id(Ad_treenodeu1 node_id) {
        this.node_id = node_id;
        return this;
    }

    public C_ElementvalueDTO createC_ElementvalueDTO() {
        return new C_ElementvalueDTO(c_elementvalue_id, ad_client_id, value, brand, description, node_id);
    }

}
