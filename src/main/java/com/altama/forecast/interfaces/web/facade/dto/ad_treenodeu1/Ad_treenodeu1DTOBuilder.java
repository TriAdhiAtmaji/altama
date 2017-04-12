/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.altama.forecast.interfaces.web.facade.dto.ad_treenodeu1;

import java.math.BigDecimal;
import java.util.Date;

public class Ad_treenodeu1DTOBuilder {

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

    public Ad_treenodeu1DTOBuilder() {
    }

    public Ad_treenodeu1DTOBuilder setAd_tree_id(BigDecimal ad_tree_id) {
        this.ad_tree_id = ad_tree_id;
        return this;
    }

    public Ad_treenodeu1DTOBuilder setNode_id(BigDecimal node_id) {
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

    public Ad_treenodeu1DTOBuilder setIsactive(String isactive) {
        this.isactive = isactive;
        return this;
    }

    public Ad_treenodeu1DTOBuilder setCreated(Date created) {
        this.created = created;
        return this;
    }

    public Ad_treenodeu1DTOBuilder setCreatedBy(BigDecimal createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public Ad_treenodeu1DTOBuilder setUpdatedBy(BigDecimal updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    public Ad_treenodeu1DTOBuilder setUpdated(Date updated) {
        this.updated = updated;
        return this;
    }

    public Ad_treenodeu1DTOBuilder setParent_id(BigDecimal parent_id) {
        this.parent_id = parent_id;
        return this;
    }

    public Ad_treenodeu1DTOBuilder setSeqno(BigDecimal seqno) {
        this.seqno = seqno;
        return this;
    }

    public Ad_treenodeu1DTO createAd_treenodeu1DTO() {
        return new Ad_treenodeu1DTO(ad_tree_id, node_id, ad_client_id, ad_org_id, isactive, created, createdBy, updatedBy, updated, parent_id, seqno);
    }

}
