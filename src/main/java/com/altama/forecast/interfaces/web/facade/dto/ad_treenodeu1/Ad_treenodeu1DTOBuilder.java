/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.altama.forecast.interfaces.web.facade.dto.ad_treenodeu1;

import com.altama.forecast.domain.c_elementvalue.C_Elementvalue;
import java.math.BigDecimal;

public class Ad_treenodeu1DTOBuilder {

    private BigDecimal ad_tree_id;
    private C_Elementvalue node_id;
    private BigDecimal ad_client_id;
    private BigDecimal ad_org_id;

    public Ad_treenodeu1DTOBuilder() {
    }

    public Ad_treenodeu1DTOBuilder setAd_tree_id(BigDecimal ad_tree_id) {
        this.ad_tree_id = ad_tree_id;
        return this;
    }

    public Ad_treenodeu1DTOBuilder setNode_id(C_Elementvalue node_id) {
        this.node_id = node_id;
        return this;
    }

    public Ad_treenodeu1DTOBuilder setAd_client_id(BigDecimal ad_client_id) {
        this.ad_client_id = ad_client_id;
        return this;
    }

    public Ad_treenodeu1DTOBuilder setAd_org_id(BigDecimal ad_org_id) {
        this.ad_org_id = ad_org_id;
        return this;
    }

    public Ad_treenodeu1DTO createAd_treenodeu1DTO() {
        return new Ad_treenodeu1DTO(ad_tree_id, node_id, ad_client_id, ad_org_id);
    }

}
