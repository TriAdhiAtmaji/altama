/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.altama.forecast.domain.ad_treenodeu1;

import java.math.BigDecimal;
import java.util.Date;

public class Ad_treenodeu1Builder {

    private BigDecimal ad_tree_id;
    private BigDecimal node_id;
    private BigDecimal ad_client_id;
    private BigDecimal ad_org_id;
    private String isactive;
    private Date created;
    private BigDecimal createdBy;
    private BigDecimal updatedBy;
    private Date updated;
    private BigDecimal parent_id;
    private BigDecimal seqno;

    public Ad_treenodeu1Builder() {
    }

    public Ad_treenodeu1Builder setAd_tree_id(BigDecimal ad_tree_id) {
        this.ad_tree_id = ad_tree_id;
        return this;
    }

    public Ad_treenodeu1Builder setNode_id(BigDecimal node_id) {
        this.node_id = node_id;
        return this;
    }

    public Ad_treenodeu1Builder setAd_client_id(BigDecimal ad_client_id) {
        this.ad_client_id = ad_client_id;
        return this;
    }

    public Ad_treenodeu1Builder setAd_org_id(BigDecimal ad_org_id) {
        this.ad_org_id = ad_org_id;
        return this;
    }

    public Ad_treenodeu1Builder setIsactive(String isactive) {
        this.isactive = isactive;
        return this;
    }

    public Ad_treenodeu1Builder setCreated(Date created) {
        this.created = created;
        return this;
    }

    public Ad_treenodeu1Builder setCreatedBy(BigDecimal createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public Ad_treenodeu1Builder setUpdatedBy(BigDecimal updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    public Ad_treenodeu1Builder setUpdated(Date updated) {
        this.updated = updated;
        return this;
    }

    public Ad_treenodeu1Builder setParent_id(BigDecimal parent_id) {
        this.parent_id = parent_id;
        return this;
    }

    public Ad_treenodeu1Builder setSeqno(BigDecimal seqno) {
        this.seqno = seqno;
        return this;
    }

    public Ad_treenodeu1 createAd_treenodeu1() {
        return new Ad_treenodeu1(ad_tree_id, node_id, ad_client_id, ad_org_id, isactive, created, createdBy, updatedBy, updated, parent_id, seqno);
    }

}
