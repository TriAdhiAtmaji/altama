/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.altama.forecast.domain.c_elementvalue;

import com.altama.forecast.domain.ad_treenodeu1.Ad_treenodeu1;
import java.math.BigDecimal;


public class C_ElementvalueBuilder {
    private long c_elementvalue_id;
    private BigDecimal ad_client_id;
    private String value;
    private String brand;
    private String description;
    private Ad_treenodeu1 ad_treenodeu1;

    public C_ElementvalueBuilder() {
    }

    public C_ElementvalueBuilder setC_elementvalue_id(long c_elementvalue_id) {
        this.c_elementvalue_id = c_elementvalue_id;
        return this;
    }

    public C_ElementvalueBuilder setAd_client_id(BigDecimal ad_client_id) {
        this.ad_client_id = ad_client_id;
        return this;
    }

    public C_ElementvalueBuilder setValue(String value) {
        this.value = value;
        return this;
    }

    public C_ElementvalueBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public C_ElementvalueBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public C_ElementvalueBuilder setAd_treenodeu1(Ad_treenodeu1 ad_treenodeu1) {
        this.ad_treenodeu1 = ad_treenodeu1;
        return this;
    }

    public C_Elementvalue createC_Elementvalue() {
        return new C_Elementvalue(c_elementvalue_id, ad_client_id, value, brand, description, ad_treenodeu1);
    }
    
}
