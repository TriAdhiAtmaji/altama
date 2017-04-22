package com.altama.forecast.interfaces.web.facade.dto.ad_treenodeu1;

import com.altama.forecast.domain.c_elementvalue.C_Elementvalue;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author admin
 */
public class Ad_treenodeu1DTO implements Serializable {

    private BigDecimal ad_tree_id;
    private C_Elementvalue node_id;
    private BigDecimal ad_client_id;
    private BigDecimal ad_org_id;

    public Ad_treenodeu1DTO() {
    }

    public Ad_treenodeu1DTO(BigDecimal ad_tree_id, C_Elementvalue node_id, BigDecimal ad_client_id, BigDecimal ad_org_id) {
        this.ad_tree_id = ad_tree_id;
        this.node_id = node_id;
        this.ad_client_id = ad_client_id;
        this.ad_org_id = ad_org_id;
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

    @Override
    public String toString() {
        return "Ad_treenodeu1DTO{" + "ad_tree_id=" + ad_tree_id + ", node_id=" + node_id + ", ad_client_id=" + ad_client_id + ", ad_org_id=" + ad_org_id + '}';
    }

}
