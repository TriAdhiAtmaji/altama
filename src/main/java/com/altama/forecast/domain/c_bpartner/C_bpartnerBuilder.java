/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.altama.forecast.domain.c_bpartner;

import java.math.BigDecimal;
import java.util.Date;

public class C_bpartnerBuilder {

    private BigDecimal c_bpartner_id;
    private BigDecimal ad_client_id;
    private BigDecimal ad_org_id;
    private String isactive;
    private Date created;
    private BigDecimal createdby;
    private Date updated;
    private BigDecimal updatedBy;
    private String value;
    private String name;
    private String name2;
    private String description;
    private String issummary;
    private BigDecimal c_bp_group_id;
    private String isonetime;
    private String isprospect;
    private String isvendor;
    private String iscustomer;
    private String isemployee;
    private String issalesrep;
    private String referenceno;
    private String duns;
    private String url;
    private String ad_language;
    private String taxid;
    private String istaxexempt;
    private BigDecimal c_invoiceschedule_id;
    private String rating;
    private BigDecimal salesvolume;
    private BigDecimal numberemployees;
    private String naics;
    private Date firstsale;
    private BigDecimal acqusitioncost;
    private BigDecimal potentiallifetimevalue;
    private BigDecimal actuallifetimevalue;
    private BigDecimal shareofcustomer;
    private String paymentrule;
    private BigDecimal so_creditlimit;
    private BigDecimal so_creditused;
    private BigDecimal c_paymentterm_id;
    private BigDecimal m_pricelist_id;
    private BigDecimal m_discountschema_id;
    private BigDecimal c_dunning_id;
    private String isdiscountprinted;
    private String so_description;
    private String poreference;
    private String paymentrulepo;
    private BigDecimal po_pricelist_id;
    private BigDecimal po_discountschema_id;
    private BigDecimal po_paymentterm_id;
    private BigDecimal documentcopies;
    private BigDecimal c_greeting_id;
    private String invoicerule;
    private String deliveryrule;
    private String freightcostrule;
    private String deliveryviarule;
    private BigDecimal salesrep_id;
    private String sendemail;
    private BigDecimal bpartner_parent_id;
    private BigDecimal invoice_printformat_id;
    private String socreditstatus;
    private BigDecimal shelflifeminpct;
    private BigDecimal ad_orgbp_id;
    private BigDecimal flatdiscount;
    private BigDecimal totalopenbalance;
    private String isodt;
    private String istaxdelay;
    private String trans_code;
    private Date pkpdate;
    private String processing;
    private String isvalid;
    private BigDecimal c_salesregion_id;
    private String ismechanic;
    private String isdriver;
    private BigDecimal m_shipper_id;
    private String distributionmethod;
    private String marketsegment;
    private String iswarehousestaff;
    private String sales_group;
    private String salesrep_2_id;
    private String isstopsopt;
    private String isstopsoht;
    private String ischeckunpaidinvoice;
    private BigDecimal so_creditlimit_pt;
    private BigDecimal so_creditlimit_ht;
    private BigDecimal so_creditused_pt;
    private BigDecimal so_creditused_ht;
    private String wmsvalue;
    private String ringtype;
    private BigDecimal c_paymentterm_invoice_id;
    private int interface_flag;
    private String ispkp;
    private String alias;

    public C_bpartnerBuilder() {
    }

    public C_bpartnerBuilder setC_bpartner_id(BigDecimal c_bpartner_id) {
        this.c_bpartner_id = c_bpartner_id;
        return this;
    }

    public C_bpartnerBuilder setAd_client_id(BigDecimal ad_client_id) {
        this.ad_client_id = ad_client_id;
        return this;
    }

    public C_bpartnerBuilder setAd_org_id(BigDecimal ad_org_id) {
        this.ad_org_id = ad_org_id;
        return this;
    }

    public C_bpartnerBuilder setIsactive(String isactive) {
        this.isactive = isactive;
        return this;
    }

    public C_bpartnerBuilder setCreated(Date created) {
        this.created = created;
        return this;
    }

    public C_bpartnerBuilder setCreatedby(BigDecimal createdby) {
        this.createdby = createdby;
        return this;
    }

    public C_bpartnerBuilder setUpdated(Date updated) {
        this.updated = updated;
        return this;
    }

    public C_bpartnerBuilder setUpdatedBy(BigDecimal updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    public C_bpartnerBuilder setValue(String value) {
        this.value = value;
        return this;
    }

    public C_bpartnerBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public C_bpartnerBuilder setName2(String name2) {
        this.name2 = name2;
        return this;
    }

    public C_bpartnerBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public C_bpartnerBuilder setIssummary(String issummary) {
        this.issummary = issummary;
        return this;
    }

    public C_bpartnerBuilder setC_bp_group_id(BigDecimal c_bp_group_id) {
        this.c_bp_group_id = c_bp_group_id;
        return this;
    }

    public C_bpartnerBuilder setIsonetime(String isonetime) {
        this.isonetime = isonetime;
        return this;
    }

    public C_bpartnerBuilder setIsprospect(String isprospect) {
        this.isprospect = isprospect;
        return this;
    }

    public C_bpartnerBuilder setIsvendor(String isvendor) {
        this.isvendor = isvendor;
        return this;
    }

    public C_bpartnerBuilder setIscustomer(String iscustomer) {
        this.iscustomer = iscustomer;
        return this;
    }

    public C_bpartnerBuilder setIsemployee(String isemployee) {
        this.isemployee = isemployee;
        return this;
    }

    public C_bpartnerBuilder setIssalesrep(String issalesrep) {
        this.issalesrep = issalesrep;
        return this;
    }

    public C_bpartnerBuilder setReferenceno(String referenceno) {
        this.referenceno = referenceno;
        return this;
    }

    public C_bpartnerBuilder setDuns(String duns) {
        this.duns = duns;
        return this;
    }

    public C_bpartnerBuilder setUrl(String url) {
        this.url = url;
        return this;
    }

    public C_bpartnerBuilder setAd_language(String ad_language) {
        this.ad_language = ad_language;
        return this;
    }

    public C_bpartnerBuilder setTaxid(String taxid) {
        this.taxid = taxid;
        return this;
    }

    public C_bpartnerBuilder setIstaxexempt(String istaxexempt) {
        this.istaxexempt = istaxexempt;
        return this;
    }

    public C_bpartnerBuilder setC_invoiceschedule_id(BigDecimal c_invoiceschedule_id) {
        this.c_invoiceschedule_id = c_invoiceschedule_id;
        return this;
    }

    public C_bpartnerBuilder setRating(String rating) {
        this.rating = rating;
        return this;
    }

    public C_bpartnerBuilder setSalesvolume(BigDecimal salesvolume) {
        this.salesvolume = salesvolume;
        return this;
    }

    public C_bpartnerBuilder setNumberemployees(BigDecimal numberemployees) {
        this.numberemployees = numberemployees;
        return this;
    }

    public C_bpartnerBuilder setNaics(String naics) {
        this.naics = naics;
        return this;
    }

    public C_bpartnerBuilder setFirstsale(Date firstsale) {
        this.firstsale = firstsale;
        return this;
    }

    public C_bpartnerBuilder setAcqusitioncost(BigDecimal acqusitioncost) {
        this.acqusitioncost = acqusitioncost;
        return this;
    }

    public C_bpartnerBuilder setPotentiallifetimevalue(BigDecimal potentiallifetimevalue) {
        this.potentiallifetimevalue = potentiallifetimevalue;
        return this;
    }

    public C_bpartnerBuilder setActuallifetimevalue(BigDecimal actuallifetimevalue) {
        this.actuallifetimevalue = actuallifetimevalue;
        return this;
    }

    public C_bpartnerBuilder setShareofcustomer(BigDecimal shareofcustomer) {
        this.shareofcustomer = shareofcustomer;
        return this;
    }

    public C_bpartnerBuilder setPaymentrule(String paymentrule) {
        this.paymentrule = paymentrule;
        return this;
    }

    public C_bpartnerBuilder setSo_creditlimit(BigDecimal so_creditlimit) {
        this.so_creditlimit = so_creditlimit;
        return this;
    }

    public C_bpartnerBuilder setSo_creditused(BigDecimal so_creditused) {
        this.so_creditused = so_creditused;
        return this;
    }

    public C_bpartnerBuilder setC_paymentterm_id(BigDecimal c_paymentterm_id) {
        this.c_paymentterm_id = c_paymentterm_id;
        return this;
    }

    public C_bpartnerBuilder setM_pricelist_id(BigDecimal m_pricelist_id) {
        this.m_pricelist_id = m_pricelist_id;
        return this;
    }

    public C_bpartnerBuilder setM_discountschema_id(BigDecimal m_discountschema_id) {
        this.m_discountschema_id = m_discountschema_id;
        return this;
    }

    public C_bpartnerBuilder setC_dunning_id(BigDecimal c_dunning_id) {
        this.c_dunning_id = c_dunning_id;
        return this;
    }

    public C_bpartnerBuilder setIsdiscountprinted(String isdiscountprinted) {
        this.isdiscountprinted = isdiscountprinted;
        return this;
    }

    public C_bpartnerBuilder setSo_description(String so_description) {
        this.so_description = so_description;
        return this;
    }

    public C_bpartnerBuilder setPoreference(String poreference) {
        this.poreference = poreference;
        return this;
    }

    public C_bpartnerBuilder setPaymentrulepo(String paymentrulepo) {
        this.paymentrulepo = paymentrulepo;
        return this;
    }

    public C_bpartnerBuilder setPo_pricelist_id(BigDecimal po_pricelist_id) {
        this.po_pricelist_id = po_pricelist_id;
        return this;
    }

    public C_bpartnerBuilder setPo_discountschema_id(BigDecimal po_discountschema_id) {
        this.po_discountschema_id = po_discountschema_id;
        return this;
    }

    public C_bpartnerBuilder setPo_paymentterm_id(BigDecimal po_paymentterm_id) {
        this.po_paymentterm_id = po_paymentterm_id;
        return this;
    }

    public C_bpartnerBuilder setDocumentcopies(BigDecimal documentcopies) {
        this.documentcopies = documentcopies;
        return this;
    }

    public C_bpartnerBuilder setC_greeting_id(BigDecimal c_greeting_id) {
        this.c_greeting_id = c_greeting_id;
        return this;
    }

    public C_bpartnerBuilder setInvoicerule(String invoicerule) {
        this.invoicerule = invoicerule;
        return this;
    }

    public C_bpartnerBuilder setDeliveryrule(String deliveryrule) {
        this.deliveryrule = deliveryrule;
        return this;
    }

    public C_bpartnerBuilder setFreightcostrule(String freightcostrule) {
        this.freightcostrule = freightcostrule;
        return this;
    }

    public C_bpartnerBuilder setDeliveryviarule(String deliveryviarule) {
        this.deliveryviarule = deliveryviarule;
        return this;
    }

    public C_bpartnerBuilder setSalesrep_id(BigDecimal salesrep_id) {
        this.salesrep_id = salesrep_id;
        return this;
    }

    public C_bpartnerBuilder setSendemail(String sendemail) {
        this.sendemail = sendemail;
        return this;
    }

    public C_bpartnerBuilder setBpartner_parent_id(BigDecimal bpartner_parent_id) {
        this.bpartner_parent_id = bpartner_parent_id;
        return this;
    }

    public C_bpartnerBuilder setInvoice_printformat_id(BigDecimal invoice_printformat_id) {
        this.invoice_printformat_id = invoice_printformat_id;
        return this;
    }

    public C_bpartnerBuilder setSocreditstatus(String socreditstatus) {
        this.socreditstatus = socreditstatus;
        return this;
    }

    public C_bpartnerBuilder setShelflifeminpct(BigDecimal shelflifeminpct) {
        this.shelflifeminpct = shelflifeminpct;
        return this;
    }

    public C_bpartnerBuilder setAd_orgbp_id(BigDecimal ad_orgbp_id) {
        this.ad_orgbp_id = ad_orgbp_id;
        return this;
    }

    public C_bpartnerBuilder setFlatdiscount(BigDecimal flatdiscount) {
        this.flatdiscount = flatdiscount;
        return this;
    }

    public C_bpartnerBuilder setTotalopenbalance(BigDecimal totalopenbalance) {
        this.totalopenbalance = totalopenbalance;
        return this;
    }

    public C_bpartnerBuilder setIsodt(String isodt) {
        this.isodt = isodt;
        return this;
    }

    public C_bpartnerBuilder setIstaxdelay(String istaxdelay) {
        this.istaxdelay = istaxdelay;
        return this;
    }

    public C_bpartnerBuilder setTrans_code(String trans_code) {
        this.trans_code = trans_code;
        return this;
    }

    public C_bpartnerBuilder setPkpdate(Date pkpdate) {
        this.pkpdate = pkpdate;
        return this;
    }

    public C_bpartnerBuilder setProcessing(String processing) {
        this.processing = processing;
        return this;
    }

    public C_bpartnerBuilder setIsvalid(String isvalid) {
        this.isvalid = isvalid;
        return this;
    }

    public C_bpartnerBuilder setC_salesregion_id(BigDecimal c_salesregion_id) {
        this.c_salesregion_id = c_salesregion_id;
        return this;
    }

    public C_bpartnerBuilder setIsmechanic(String ismechanic) {
        this.ismechanic = ismechanic;
        return this;
    }

    public C_bpartnerBuilder setIsdriver(String isdriver) {
        this.isdriver = isdriver;
        return this;
    }

    public C_bpartnerBuilder setM_shipper_id(BigDecimal m_shipper_id) {
        this.m_shipper_id = m_shipper_id;
        return this;
    }

    public C_bpartnerBuilder setDistributionmethod(String distributionmethod) {
        this.distributionmethod = distributionmethod;
        return this;
    }

    public C_bpartnerBuilder setMarketsegment(String marketsegment) {
        this.marketsegment = marketsegment;
        return this;
    }

    public C_bpartnerBuilder setIswarehousestaff(String iswarehousestaff) {
        this.iswarehousestaff = iswarehousestaff;
        return this;
    }

    public C_bpartnerBuilder setSales_group(String sales_group) {
        this.sales_group = sales_group;
        return this;
    }

    public C_bpartnerBuilder setSalesrep_2_id(String salesrep_2_id) {
        this.salesrep_2_id = salesrep_2_id;
        return this;
    }

    public C_bpartnerBuilder setIsstopsopt(String isstopsopt) {
        this.isstopsopt = isstopsopt;
        return this;
    }

    public C_bpartnerBuilder setIsstopsoht(String isstopsoht) {
        this.isstopsoht = isstopsoht;
        return this;
    }

    public C_bpartnerBuilder setIscheckunpaidinvoice(String ischeckunpaidinvoice) {
        this.ischeckunpaidinvoice = ischeckunpaidinvoice;
        return this;
    }

    public C_bpartnerBuilder setSo_creditlimit_pt(BigDecimal so_creditlimit_pt) {
        this.so_creditlimit_pt = so_creditlimit_pt;
        return this;
    }

    public C_bpartnerBuilder setSo_creditlimit_ht(BigDecimal so_creditlimit_ht) {
        this.so_creditlimit_ht = so_creditlimit_ht;
        return this;
    }

    public C_bpartnerBuilder setSo_creditused_pt(BigDecimal so_creditused_pt) {
        this.so_creditused_pt = so_creditused_pt;
        return this;
    }

    public C_bpartnerBuilder setSo_creditused_ht(BigDecimal so_creditused_ht) {
        this.so_creditused_ht = so_creditused_ht;
        return this;
    }

    public C_bpartnerBuilder setWmsvalue(String wmsvalue) {
        this.wmsvalue = wmsvalue;
        return this;
    }

    public C_bpartnerBuilder setRingtype(String ringtype) {
        this.ringtype = ringtype;
        return this;
    }

    public C_bpartnerBuilder setC_paymentterm_invoice_id(BigDecimal c_paymentterm_invoice_id) {
        this.c_paymentterm_invoice_id = c_paymentterm_invoice_id;
        return this;
    }

    public C_bpartnerBuilder setInterface_flag(int interface_flag) {
        this.interface_flag = interface_flag;
        return this;
    }

    public C_bpartnerBuilder setIspkp(String ispkp) {
        this.ispkp = ispkp;
        return this;
    }

    public C_bpartnerBuilder setAlias(String alias) {
        this.alias = alias;
        return this;
    }

    public C_bpartner createC_bpartner() {
        return new C_bpartner(c_bpartner_id, ad_client_id, ad_org_id, isactive, created, createdby, updated, updatedBy, value, name, name2, description, issummary, c_bp_group_id, isonetime, isprospect, isvendor, iscustomer, isemployee, issalesrep, referenceno, duns, url, ad_language, taxid, istaxexempt, c_invoiceschedule_id, rating, salesvolume, numberemployees, naics, firstsale, acqusitioncost, potentiallifetimevalue, actuallifetimevalue, shareofcustomer, paymentrule, so_creditlimit, so_creditused, c_paymentterm_id, m_pricelist_id, m_discountschema_id, c_dunning_id, isdiscountprinted, so_description, poreference, paymentrulepo, po_pricelist_id, po_discountschema_id, po_paymentterm_id, documentcopies, c_greeting_id, invoicerule, deliveryrule, freightcostrule, deliveryviarule, salesrep_id, sendemail, bpartner_parent_id, invoice_printformat_id, socreditstatus, shelflifeminpct, ad_orgbp_id, flatdiscount, totalopenbalance, isodt, istaxdelay, trans_code, pkpdate, processing, isvalid, c_salesregion_id, ismechanic, isdriver, m_shipper_id, distributionmethod, marketsegment, iswarehousestaff, sales_group, salesrep_2_id, isstopsopt, isstopsoht, ischeckunpaidinvoice, so_creditlimit_pt, so_creditlimit_ht, so_creditused_pt, so_creditused_ht, wmsvalue, ringtype, c_paymentterm_invoice_id, interface_flag, ispkp, alias);
    }

}
