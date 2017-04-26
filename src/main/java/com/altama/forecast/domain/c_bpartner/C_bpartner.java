package com.altama.forecast.domain.c_bpartner;

import com.altama.forecast.domain.shared.EntityObject;
import java.math.BigDecimal;
import java.util.Objects;

/**
 *
 * @author admin
 */
public class C_bpartner implements EntityObject<C_bpartner> {

    private BigDecimal c_bpartner_id;
    private BigDecimal ad_client_id;
    private BigDecimal ad_org_id;
    private String value;
    private String Suplier;
    private String Suplier2;
    private String description;
    private BigDecimal c_bp_group_id;
    private String isvendor;
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

    public C_bpartner() {
    }

    public C_bpartner(BigDecimal c_bpartner_id, BigDecimal ad_client_id, BigDecimal ad_org_id, String value, String Suplier, String Suplier2, String description, BigDecimal c_bp_group_id, String isvendor, BigDecimal c_invoiceschedule_id, BigDecimal c_paymentterm_id, BigDecimal m_pricelist_id, BigDecimal m_discountschema_id, BigDecimal c_dunning_id, BigDecimal po_pricelist_id, BigDecimal po_discountschema_id, BigDecimal po_paymentterm_id, BigDecimal documentcopies, BigDecimal c_greeting_id, BigDecimal salesrep_id, String sendemail, BigDecimal bpartner_parent_id) {
        this.c_bpartner_id = c_bpartner_id;
        this.ad_client_id = ad_client_id;
        this.ad_org_id = ad_org_id;
        this.value = value;
        this.Suplier = Suplier;
        this.Suplier2 = Suplier2;
        this.description = description;
        this.c_bp_group_id = c_bp_group_id;
        this.isvendor = isvendor;
        this.c_invoiceschedule_id = c_invoiceschedule_id;
        this.c_paymentterm_id = c_paymentterm_id;
        this.m_pricelist_id = m_pricelist_id;
        this.m_discountschema_id = m_discountschema_id;
        this.c_dunning_id = c_dunning_id;
        this.po_pricelist_id = po_pricelist_id;
        this.po_discountschema_id = po_discountschema_id;
        this.po_paymentterm_id = po_paymentterm_id;
        this.documentcopies = documentcopies;
        this.c_greeting_id = c_greeting_id;
        this.salesrep_id = salesrep_id;
        this.sendemail = sendemail;
        this.bpartner_parent_id = bpartner_parent_id;
    }

    public void assignNewC_bpartner(C_bpartner c_bpartner) {
        this.c_bpartner_id = c_bpartner.c_bpartner_id;
        this.ad_client_id = c_bpartner.ad_client_id;
        this.ad_org_id = c_bpartner.ad_org_id;
        this.value = c_bpartner.value;
        this.Suplier = c_bpartner.Suplier;
        this.Suplier2 = c_bpartner.Suplier2;
        this.description = c_bpartner.description;
        this.c_bp_group_id = c_bpartner.c_bp_group_id;
        this.isvendor = c_bpartner.isvendor;
        this.c_invoiceschedule_id = c_bpartner.c_invoiceschedule_id;
        this.c_paymentterm_id = c_bpartner.c_paymentterm_id;
        this.m_pricelist_id = c_bpartner.m_pricelist_id;
        this.m_discountschema_id = c_bpartner.m_discountschema_id;
        this.c_dunning_id = c_bpartner.c_dunning_id;
        this.po_pricelist_id = c_bpartner.po_pricelist_id;
        this.po_discountschema_id = c_bpartner.po_discountschema_id;
        this.po_paymentterm_id = c_bpartner.po_paymentterm_id;
        this.documentcopies = c_bpartner.documentcopies;
        this.c_greeting_id = c_bpartner.c_greeting_id;
        this.salesrep_id = c_bpartner.salesrep_id;
        this.sendemail = c_bpartner.sendemail;
        this.bpartner_parent_id = c_bpartner.bpartner_parent_id;
    }

    public BigDecimal getC_bpartner_id() {
        return c_bpartner_id;
    }

    public void setC_bpartner_id(BigDecimal c_bpartner_id) {
        this.c_bpartner_id = c_bpartner_id;
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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getSuplier() {
        return Suplier;
    }

    public void setSuplier(String Suplier) {
        this.Suplier = Suplier;
    }

    public String getSuplier2() {
        return Suplier2;
    }

    public void setSuplier2(String Suplier2) {
        this.Suplier2 = Suplier2;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getC_bp_group_id() {
        return c_bp_group_id;
    }

    public void setC_bp_group_id(BigDecimal c_bp_group_id) {
        this.c_bp_group_id = c_bp_group_id;
    }

    public String getIsvendor() {
        return isvendor;
    }

    public void setIsvendor(String isvendor) {
        this.isvendor = isvendor;
    }

    public BigDecimal getC_invoiceschedule_id() {
        return c_invoiceschedule_id;
    }

    public void setC_invoiceschedule_id(BigDecimal c_invoiceschedule_id) {
        this.c_invoiceschedule_id = c_invoiceschedule_id;
    }

    public BigDecimal getC_paymentterm_id() {
        return c_paymentterm_id;
    }

    public void setC_paymentterm_id(BigDecimal c_paymentterm_id) {
        this.c_paymentterm_id = c_paymentterm_id;
    }

    public BigDecimal getM_pricelist_id() {
        return m_pricelist_id;
    }

    public void setM_pricelist_id(BigDecimal m_pricelist_id) {
        this.m_pricelist_id = m_pricelist_id;
    }

    public BigDecimal getM_discountschema_id() {
        return m_discountschema_id;
    }

    public void setM_discountschema_id(BigDecimal m_discountschema_id) {
        this.m_discountschema_id = m_discountschema_id;
    }

    public BigDecimal getC_dunning_id() {
        return c_dunning_id;
    }

    public void setC_dunning_id(BigDecimal c_dunning_id) {
        this.c_dunning_id = c_dunning_id;
    }

    public BigDecimal getPo_pricelist_id() {
        return po_pricelist_id;
    }

    public void setPo_pricelist_id(BigDecimal po_pricelist_id) {
        this.po_pricelist_id = po_pricelist_id;
    }

    public BigDecimal getPo_discountschema_id() {
        return po_discountschema_id;
    }

    public void setPo_discountschema_id(BigDecimal po_discountschema_id) {
        this.po_discountschema_id = po_discountschema_id;
    }

    public BigDecimal getPo_paymentterm_id() {
        return po_paymentterm_id;
    }

    public void setPo_paymentterm_id(BigDecimal po_paymentterm_id) {
        this.po_paymentterm_id = po_paymentterm_id;
    }

    public BigDecimal getDocumentcopies() {
        return documentcopies;
    }

    public void setDocumentcopies(BigDecimal documentcopies) {
        this.documentcopies = documentcopies;
    }

    public BigDecimal getC_greeting_id() {
        return c_greeting_id;
    }

    public void setC_greeting_id(BigDecimal c_greeting_id) {
        this.c_greeting_id = c_greeting_id;
    }

    public BigDecimal getSalesrep_id() {
        return salesrep_id;
    }

    public void setSalesrep_id(BigDecimal salesrep_id) {
        this.salesrep_id = salesrep_id;
    }

    public String getSendemail() {
        return sendemail;
    }

    public void setSendemail(String sendemail) {
        this.sendemail = sendemail;
    }

    public BigDecimal getBpartner_parent_id() {
        return bpartner_parent_id;
    }

    public void setBpartner_parent_id(BigDecimal bpartner_parent_id) {
        this.bpartner_parent_id = bpartner_parent_id;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.ad_client_id);
        hash = 23 * hash + Objects.hashCode(this.ad_org_id);
        hash = 23 * hash + Objects.hashCode(this.value);
        hash = 23 * hash + Objects.hashCode(this.Suplier);
        hash = 23 * hash + Objects.hashCode(this.Suplier2);
        hash = 23 * hash + Objects.hashCode(this.description);
        hash = 23 * hash + Objects.hashCode(this.c_bp_group_id);
        hash = 23 * hash + Objects.hashCode(this.isvendor);
        hash = 23 * hash + Objects.hashCode(this.c_invoiceschedule_id);
        hash = 23 * hash + Objects.hashCode(this.c_paymentterm_id);
        hash = 23 * hash + Objects.hashCode(this.m_pricelist_id);
        hash = 23 * hash + Objects.hashCode(this.m_discountschema_id);
        hash = 23 * hash + Objects.hashCode(this.c_dunning_id);
        hash = 23 * hash + Objects.hashCode(this.po_pricelist_id);
        hash = 23 * hash + Objects.hashCode(this.po_discountschema_id);
        hash = 23 * hash + Objects.hashCode(this.po_paymentterm_id);
        hash = 23 * hash + Objects.hashCode(this.documentcopies);
        hash = 23 * hash + Objects.hashCode(this.c_greeting_id);
        hash = 23 * hash + Objects.hashCode(this.salesrep_id);
        hash = 23 * hash + Objects.hashCode(this.sendemail);
        hash = 23 * hash + Objects.hashCode(this.bpartner_parent_id);
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
        final C_bpartner other = (C_bpartner) obj;
        if (!Objects.equals(this.c_bpartner_id, other.c_bpartner_id)) {
            return false;
        }
        return true;
    }

    @Override
    public boolean sameIdentityAs(C_bpartner other) {
        return this.equals(other);
    }

}
