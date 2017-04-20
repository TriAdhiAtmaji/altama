package com.altama.forecast.domain.ad_treenodeu1;

import com.altama.forecast.domain.c_elementvalue.C_Elementvalue;
import com.altama.forecast.domain.shared.EntityObject;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author admin
 */
public class Ad_treenodeu1 implements EntityObject<Ad_treenodeu1> {

    long id;

    private BigDecimal ad_tree_id;
    private C_Elementvalue node_id;
    private BigDecimal ad_client_id;
    private BigDecimal ad_org_id;
    private String isactive;
    private Date created;
    private BigDecimal createdBy;
    private BigDecimal updatedBy;
    private Date updated;
    private BigDecimal parent_id;
    private BigDecimal seqno;

    public Ad_treenodeu1() {
    }

    public Ad_treenodeu1(BigDecimal ad_tree_id, C_Elementvalue node_id, BigDecimal ad_client_id, BigDecimal ad_org_id, String isactive, Date created, BigDecimal createdBy, BigDecimal updatedBy, Date updated, BigDecimal parent_id, BigDecimal seqno) {
        this.ad_tree_id = ad_tree_id;
        this.node_id = node_id;
        this.ad_client_id = ad_client_id;
        this.ad_org_id = ad_org_id;
        this.isactive = isactive;
        this.created = created;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.updated = updated;
        this.parent_id = parent_id;
        this.seqno = seqno;
    }

    public void assignNewAd_treenodeu1(Ad_treenodeu1 ad_treenodeu1) {
        this.ad_tree_id = ad_treenodeu1.ad_tree_id;
        this.node_id = ad_treenodeu1.node_id;
        this.ad_client_id = ad_treenodeu1.ad_client_id;
        this.ad_org_id = ad_treenodeu1.ad_org_id;
        this.isactive = ad_treenodeu1.isactive;
        this.created = ad_treenodeu1.created;
        this.createdBy = ad_treenodeu1.createdBy;
        this.updatedBy = ad_treenodeu1.updatedBy;
        this.updated = ad_treenodeu1.updated;
        this.parent_id = ad_treenodeu1.parent_id;
        this.seqno = ad_treenodeu1.seqno;
    }

    public BigDecimal getAd_tree_id() {
        return ad_tree_id;
    }

    public void setAd_tree_id(BigDecimal ad_tree_id) {
        this.ad_tree_id = ad_tree_id;
    }

    public C_Elementvalue getNode_id() {
        return node_id;
    }

    public void setNode_id(C_Elementvalue node_id) {
        this.node_id = node_id;
    }

    public BigDecimal getAd_client_id() {
        return ad_client_id;
    }

    public void setAd_client_id(BigDecimal ad_client_id) {
        this.ad_client_id = ad_client_id;
    }

    public BigDecimal getAd_org_id() {
        return ad_org_id;
    }

    public void setAd_org_id(BigDecimal ad_org_id) {
        this.ad_org_id = ad_org_id;
    }

    public String getIsactive() {
        return isactive;
    }

    public void setIsactive(String isactive) {
        this.isactive = isactive;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public BigDecimal getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(BigDecimal createdBy) {
        this.createdBy = createdBy;
    }

    public BigDecimal getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(BigDecimal updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public BigDecimal getParent_id() {
        return parent_id;
    }

    public void setParent_id(BigDecimal parent_id) {
        this.parent_id = parent_id;
    }

    public BigDecimal getSeqno() {
        return seqno;
    }

    public void setSeqno(BigDecimal seqno) {
        this.seqno = seqno;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.ad_tree_id);
        hash = 97 * hash + Objects.hashCode(this.node_id);
        hash = 97 * hash + Objects.hashCode(this.ad_client_id);
        hash = 97 * hash + Objects.hashCode(this.ad_org_id);
        hash = 97 * hash + Objects.hashCode(this.isactive);
        hash = 97 * hash + Objects.hashCode(this.created);
        hash = 97 * hash + Objects.hashCode(this.createdBy);
        hash = 97 * hash + Objects.hashCode(this.updatedBy);
        hash = 97 * hash + Objects.hashCode(this.updated);
        hash = 97 * hash + Objects.hashCode(this.parent_id);
        hash = 97 * hash + Objects.hashCode(this.seqno);
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
        final Ad_treenodeu1 other = (Ad_treenodeu1) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public boolean sameIdentityAs(Ad_treenodeu1 other) {
        return this.equals(other);
    }

}
