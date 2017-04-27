/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.altama.forecast.interfaces.web.facade.dto.c_bpartner;

import java.math.BigDecimal;

public class C_bpartnerDTOBuilder {

    private BigDecimal c_bpartner_id;
    private BigDecimal ad_client_id;
    private BigDecimal ad_org_id;
    private String value;
    private String suplier;
    private String suplier2;
    private String description;
    private BigDecimal c_bp_group_id;
    private char isvendor;
    private BigDecimal c_invoiceschedule_id;
    private BigDecimal c_paymentterm_id;
    private BigDecimal m_pricelist_id;
    private BigDecimal m_discountschema_id;
    private BigDecimal c_dunning_id;
    private BigDecimal po_pricelist_id;
    private BigDecimal po_discountschema_id;
    private BigDecimal po_paymentterm_id;
    private BigDecimal documentcopies;
    private BigDecimal c_greeting_id;
    private BigDecimal salesrep_id;
    private String sendemail;
    private BigDecimal bpartner_parent_id;

    public C_bpartnerDTOBuilder() {
    }

    public C_bpartnerDTOBuilder setC_bpartner_id(BigDecimal c_bpartner_id) {
        this.c_bpartner_id = c_bpartner_id;
        return this;
    }

    public C_bpartnerDTOBuilder setAd_client_id(BigDecimal ad_client_id) {
        this.ad_client_id = ad_client_id;
        return this;
    }

    public C_bpartnerDTOBuilder setAd_org_id(BigDecimal ad_org_id) {
        this.ad_org_id = ad_org_id;
        return this;
    }

    public C_bpartnerDTOBuilder setValue(String value) {
        this.value = value;
        return this;
    }

    public C_bpartnerDTOBuilder setSuplier(String suplier) {
        this.suplier = suplier;
        return this;
    }

    public C_bpartnerDTOBuilder setSuplier2(String suplier2) {
        this.suplier2 = suplier2;
        return this;
    }

    public C_bpartnerDTOBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public C_bpartnerDTOBuilder setC_bp_group_id(BigDecimal c_bp_group_id) {
        this.c_bp_group_id = c_bp_group_id;
        return this;
    }

    public C_bpartnerDTOBuilder setIsvendor(char isvendor) {
        this.isvendor = isvendor;
        return this;
    }

    public C_bpartnerDTOBuilder setC_invoiceschedule_id(BigDecimal c_invoiceschedule_id) {
        this.c_invoiceschedule_id = c_invoiceschedule_id;
        return this;
    }

    public C_bpartnerDTOBuilder setC_paymentterm_id(BigDecimal c_paymentterm_id) {
        this.c_paymentterm_id = c_paymentterm_id;
        return this;
    }

    public C_bpartnerDTOBuilder setM_pricelist_id(BigDecimal m_pricelist_id) {
        this.m_pricelist_id = m_pricelist_id;
        return this;
    }

    public C_bpartnerDTOBuilder setM_discountschema_id(BigDecimal m_discountschema_id) {
        this.m_discountschema_id = m_discountschema_id;
        return this;
    }

    public C_bpartnerDTOBuilder setC_dunning_id(BigDecimal c_dunning_id) {
        this.c_dunning_id = c_dunning_id;
        return this;
    }

    public C_bpartnerDTOBuilder setPo_pricelist_id(BigDecimal po_pricelist_id) {
        this.po_pricelist_id = po_pricelist_id;
        return this;
    }

    public C_bpartnerDTOBuilder setPo_discountschema_id(BigDecimal po_discountschema_id) {
        this.po_discountschema_id = po_discountschema_id;
        return this;
    }

    public C_bpartnerDTOBuilder setPo_paymentterm_id(BigDecimal po_paymentterm_id) {
        this.po_paymentterm_id = po_paymentterm_id;
        return this;
    }

    public C_bpartnerDTOBuilder setDocumentcopies(BigDecimal documentcopies) {
        this.documentcopies = documentcopies;
        return this;
    }

    public C_bpartnerDTOBuilder setC_greeting_id(BigDecimal c_greeting_id) {
        this.c_greeting_id = c_greeting_id;
        return this;
    }

    public C_bpartnerDTOBuilder setSalesrep_id(BigDecimal salesrep_id) {
        this.salesrep_id = salesrep_id;
        return this;
    }

    public C_bpartnerDTOBuilder setSendemail(String sendemail) {
        this.sendemail = sendemail;
        return this;
    }

    public C_bpartnerDTOBuilder setBpartner_parent_id(BigDecimal bpartner_parent_id) {
        this.bpartner_parent_id = bpartner_parent_id;
        return this;
    }

    public C_bpartnerDTO createC_bpartnerDTO() {
        return new C_bpartnerDTO(c_bpartner_id, ad_client_id, ad_org_id, value, suplier, suplier2, description, c_bp_group_id, isvendor, c_invoiceschedule_id, c_paymentterm_id, m_pricelist_id, m_discountschema_id, c_dunning_id, po_pricelist_id, po_discountschema_id, po_paymentterm_id, documentcopies, c_greeting_id, salesrep_id, sendemail, bpartner_parent_id);
    }

}
