package com.altama.forecast.domain.ad_treenodeu1;

import com.altama.forecast.domain.shared.EntityObject;
import java.math.BigDecimal;

/**
 *
 * @author admin
 */
public class Ad_treenodeu1 implements EntityObject<Ad_treenodeu1> {

    private BigDecimal ad_tree_id;
    private BigDecimal node_id;
    private BigDecimal ad_client_id;
    private BigDecimal ad_org_id;

    public Ad_treenodeu1() {
    }

    public Ad_treenodeu1(BigDecimal ad_tree_id, BigDecimal node_id, BigDecimal ad_client_id, BigDecimal ad_org_id) {
        this.ad_tree_id = ad_tree_id;
        this.node_id = node_id;
        this.ad_client_id = ad_client_id;
        this.ad_org_id = ad_org_id;
    }

    public void assignNewAd_treenodeu1(Ad_treenodeu1 ad_treenodeu1) {
        this.ad_tree_id = ad_treenodeu1.ad_tree_id;
        this.node_id = ad_treenodeu1.node_id;
        this.ad_client_id = ad_treenodeu1.ad_client_id;
        this.ad_org_id = ad_treenodeu1.ad_org_id;
    }

    public BigDecimal getNode_id() {
        return node_id;
    }

    public void setNode_id(BigDecimal node_id) {
        this.node_id = node_id;
    }

    public BigDecimal getAd_tree_id() {
        return ad_tree_id;
    }

    public void setAd_tree_id(BigDecimal ad_tree_id) {
        this.ad_tree_id = ad_tree_id;
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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + (this.node_id != null ? this.node_id.hashCode() : 0);
        hash = 17 * hash + (this.ad_client_id != null ? this.ad_client_id.hashCode() : 0);
        hash = 17 * hash + (this.ad_org_id != null ? this.ad_org_id.hashCode() : 0);
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
        if (this.ad_tree_id != other.ad_tree_id && (this.ad_tree_id == null || !this.ad_tree_id.equals(other.ad_tree_id))) {
            return false;
        }
        return true;
    }

    @Override
    public boolean sameIdentityAs(Ad_treenodeu1 other) {
        return this.equals(other);
    }

}
