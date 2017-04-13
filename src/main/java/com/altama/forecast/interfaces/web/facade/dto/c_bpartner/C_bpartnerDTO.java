package com.altama.forecast.interfaces.web.facade.dto.c_bpartner;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author admin
 */
public class C_bpartnerDTO implements Serializable {

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

    public C_bpartnerDTO() {
    }

    public C_bpartnerDTO(BigDecimal c_bpartner_id, BigDecimal ad_client_id, BigDecimal ad_org_id, String isactive, Date created, BigDecimal createdby, Date updated, BigDecimal updatedBy, String value, String name, String name2, String description, String issummary, BigDecimal c_bp_group_id, String isonetime, String isprospect, String isvendor, String iscustomer, String isemployee, String issalesrep, String referenceno, String duns, String url, String ad_language, String taxid, String istaxexempt, BigDecimal c_invoiceschedule_id, String rating, BigDecimal salesvolume, BigDecimal numberemployees, String naics, Date firstsale, BigDecimal acqusitioncost, BigDecimal potentiallifetimevalue, BigDecimal actuallifetimevalue, BigDecimal shareofcustomer, String paymentrule, BigDecimal so_creditlimit, BigDecimal so_creditused, BigDecimal c_paymentterm_id, BigDecimal m_pricelist_id, BigDecimal m_discountschema_id, BigDecimal c_dunning_id, String isdiscountprinted, String so_description, String poreference, String paymentrulepo, BigDecimal po_pricelist_id, BigDecimal po_discountschema_id, BigDecimal po_paymentterm_id, BigDecimal documentcopies, BigDecimal c_greeting_id, String invoicerule, String deliveryrule, String freightcostrule, String deliveryviarule, BigDecimal salesrep_id, String sendemail, BigDecimal bpartner_parent_id, BigDecimal invoice_printformat_id, String socreditstatus, BigDecimal shelflifeminpct, BigDecimal ad_orgbp_id, BigDecimal flatdiscount, BigDecimal totalopenbalance, String isodt, String istaxdelay, String trans_code, Date pkpdate, String processing, String isvalid, BigDecimal c_salesregion_id, String ismechanic, String isdriver, BigDecimal m_shipper_id, String distributionmethod, String marketsegment, String iswarehousestaff, String sales_group, String salesrep_2_id, String isstopsopt, String isstopsoht, String ischeckunpaidinvoice, BigDecimal so_creditlimit_pt, BigDecimal so_creditlimit_ht, BigDecimal so_creditused_pt, BigDecimal so_creditused_ht, String wmsvalue, String ringtype, BigDecimal c_paymentterm_invoice_id, int interface_flag, String ispkp, String alias) {
        this.c_bpartner_id = c_bpartner_id;
        this.ad_client_id = ad_client_id;
        this.ad_org_id = ad_org_id;
        this.isactive = isactive;
        this.created = created;
        this.createdby = createdby;
        this.updated = updated;
        this.updatedBy = updatedBy;
        this.value = value;
        this.name = name;
        this.name2 = name2;
        this.description = description;
        this.issummary = issummary;
        this.c_bp_group_id = c_bp_group_id;
        this.isonetime = isonetime;
        this.isprospect = isprospect;
        this.isvendor = isvendor;
        this.iscustomer = iscustomer;
        this.isemployee = isemployee;
        this.issalesrep = issalesrep;
        this.referenceno = referenceno;
        this.duns = duns;
        this.url = url;
        this.ad_language = ad_language;
        this.taxid = taxid;
        this.istaxexempt = istaxexempt;
        this.c_invoiceschedule_id = c_invoiceschedule_id;
        this.rating = rating;
        this.salesvolume = salesvolume;
        this.numberemployees = numberemployees;
        this.naics = naics;
        this.firstsale = firstsale;
        this.acqusitioncost = acqusitioncost;
        this.potentiallifetimevalue = potentiallifetimevalue;
        this.actuallifetimevalue = actuallifetimevalue;
        this.shareofcustomer = shareofcustomer;
        this.paymentrule = paymentrule;
        this.so_creditlimit = so_creditlimit;
        this.so_creditused = so_creditused;
        this.c_paymentterm_id = c_paymentterm_id;
        this.m_pricelist_id = m_pricelist_id;
        this.m_discountschema_id = m_discountschema_id;
        this.c_dunning_id = c_dunning_id;
        this.isdiscountprinted = isdiscountprinted;
        this.so_description = so_description;
        this.poreference = poreference;
        this.paymentrulepo = paymentrulepo;
        this.po_pricelist_id = po_pricelist_id;
        this.po_discountschema_id = po_discountschema_id;
        this.po_paymentterm_id = po_paymentterm_id;
        this.documentcopies = documentcopies;
        this.c_greeting_id = c_greeting_id;
        this.invoicerule = invoicerule;
        this.deliveryrule = deliveryrule;
        this.freightcostrule = freightcostrule;
        this.deliveryviarule = deliveryviarule;
        this.salesrep_id = salesrep_id;
        this.sendemail = sendemail;
        this.bpartner_parent_id = bpartner_parent_id;
        this.invoice_printformat_id = invoice_printformat_id;
        this.socreditstatus = socreditstatus;
        this.shelflifeminpct = shelflifeminpct;
        this.ad_orgbp_id = ad_orgbp_id;
        this.flatdiscount = flatdiscount;
        this.totalopenbalance = totalopenbalance;
        this.isodt = isodt;
        this.istaxdelay = istaxdelay;
        this.trans_code = trans_code;
        this.pkpdate = pkpdate;
        this.processing = processing;
        this.isvalid = isvalid;
        this.c_salesregion_id = c_salesregion_id;
        this.ismechanic = ismechanic;
        this.isdriver = isdriver;
        this.m_shipper_id = m_shipper_id;
        this.distributionmethod = distributionmethod;
        this.marketsegment = marketsegment;
        this.iswarehousestaff = iswarehousestaff;
        this.sales_group = sales_group;
        this.salesrep_2_id = salesrep_2_id;
        this.isstopsopt = isstopsopt;
        this.isstopsoht = isstopsoht;
        this.ischeckunpaidinvoice = ischeckunpaidinvoice;
        this.so_creditlimit_pt = so_creditlimit_pt;
        this.so_creditlimit_ht = so_creditlimit_ht;
        this.so_creditused_pt = so_creditused_pt;
        this.so_creditused_ht = so_creditused_ht;
        this.wmsvalue = wmsvalue;
        this.ringtype = ringtype;
        this.c_paymentterm_invoice_id = c_paymentterm_invoice_id;
        this.interface_flag = interface_flag;
        this.ispkp = ispkp;
        this.alias = alias;
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

    public BigDecimal getCreatedby() {
        return createdby;
    }

    public void setCreatedby(BigDecimal createdby) {
        this.createdby = createdby;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public BigDecimal getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(BigDecimal updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIssummary() {
        return issummary;
    }

    public void setIssummary(String issummary) {
        this.issummary = issummary;
    }

    public BigDecimal getC_bp_group_id() {
        return c_bp_group_id;
    }

    public void setC_bp_group_id(BigDecimal c_bp_group_id) {
        this.c_bp_group_id = c_bp_group_id;
    }

    public String getIsonetime() {
        return isonetime;
    }

    public void setIsonetime(String isonetime) {
        this.isonetime = isonetime;
    }

    public String getIsprospect() {
        return isprospect;
    }

    public void setIsprospect(String isprospect) {
        this.isprospect = isprospect;
    }

    public String getIsvendor() {
        return isvendor;
    }

    public void setIsvendor(String isvendor) {
        this.isvendor = isvendor;
    }

    public String getIscustomer() {
        return iscustomer;
    }

    public void setIscustomer(String iscustomer) {
        this.iscustomer = iscustomer;
    }

    public String getIsemployee() {
        return isemployee;
    }

    public void setIsemployee(String isemployee) {
        this.isemployee = isemployee;
    }

    public String getIssalesrep() {
        return issalesrep;
    }

    public void setIssalesrep(String issalesrep) {
        this.issalesrep = issalesrep;
    }

    public String getReferenceno() {
        return referenceno;
    }

    public void setReferenceno(String referenceno) {
        this.referenceno = referenceno;
    }

    public String getDuns() {
        return duns;
    }

    public void setDuns(String duns) {
        this.duns = duns;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAd_language() {
        return ad_language;
    }

    public void setAd_language(String ad_language) {
        this.ad_language = ad_language;
    }

    public String getTaxid() {
        return taxid;
    }

    public void setTaxid(String taxid) {
        this.taxid = taxid;
    }

    public String getIstaxexempt() {
        return istaxexempt;
    }

    public void setIstaxexempt(String istaxexempt) {
        this.istaxexempt = istaxexempt;
    }

    public BigDecimal getC_invoiceschedule_id() {
        return c_invoiceschedule_id;
    }

    public void setC_invoiceschedule_id(BigDecimal c_invoiceschedule_id) {
        this.c_invoiceschedule_id = c_invoiceschedule_id;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public BigDecimal getSalesvolume() {
        return salesvolume;
    }

    public void setSalesvolume(BigDecimal salesvolume) {
        this.salesvolume = salesvolume;
    }

    public BigDecimal getNumberemployees() {
        return numberemployees;
    }

    public void setNumberemployees(BigDecimal numberemployees) {
        this.numberemployees = numberemployees;
    }

    public String getNaics() {
        return naics;
    }

    public void setNaics(String naics) {
        this.naics = naics;
    }

    public Date getFirstsale() {
        return firstsale;
    }

    public void setFirstsale(Date firstsale) {
        this.firstsale = firstsale;
    }

    public BigDecimal getAcqusitioncost() {
        return acqusitioncost;
    }

    public void setAcqusitioncost(BigDecimal acqusitioncost) {
        this.acqusitioncost = acqusitioncost;
    }

    public BigDecimal getPotentiallifetimevalue() {
        return potentiallifetimevalue;
    }

    public void setPotentiallifetimevalue(BigDecimal potentiallifetimevalue) {
        this.potentiallifetimevalue = potentiallifetimevalue;
    }

    public BigDecimal getActuallifetimevalue() {
        return actuallifetimevalue;
    }

    public void setActuallifetimevalue(BigDecimal actuallifetimevalue) {
        this.actuallifetimevalue = actuallifetimevalue;
    }

    public BigDecimal getShareofcustomer() {
        return shareofcustomer;
    }

    public void setShareofcustomer(BigDecimal shareofcustomer) {
        this.shareofcustomer = shareofcustomer;
    }

    public String getPaymentrule() {
        return paymentrule;
    }

    public void setPaymentrule(String paymentrule) {
        this.paymentrule = paymentrule;
    }

    public BigDecimal getSo_creditlimit() {
        return so_creditlimit;
    }

    public void setSo_creditlimit(BigDecimal so_creditlimit) {
        this.so_creditlimit = so_creditlimit;
    }

    public BigDecimal getSo_creditused() {
        return so_creditused;
    }

    public void setSo_creditused(BigDecimal so_creditused) {
        this.so_creditused = so_creditused;
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

    public String getIsdiscountprinted() {
        return isdiscountprinted;
    }

    public void setIsdiscountprinted(String isdiscountprinted) {
        this.isdiscountprinted = isdiscountprinted;
    }

    public String getSo_description() {
        return so_description;
    }

    public void setSo_description(String so_description) {
        this.so_description = so_description;
    }

    public String getPoreference() {
        return poreference;
    }

    public void setPoreference(String poreference) {
        this.poreference = poreference;
    }

    public String getPaymentrulepo() {
        return paymentrulepo;
    }

    public void setPaymentrulepo(String paymentrulepo) {
        this.paymentrulepo = paymentrulepo;
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

    public String getInvoicerule() {
        return invoicerule;
    }

    public void setInvoicerule(String invoicerule) {
        this.invoicerule = invoicerule;
    }

    public String getDeliveryrule() {
        return deliveryrule;
    }

    public void setDeliveryrule(String deliveryrule) {
        this.deliveryrule = deliveryrule;
    }

    public String getFreightcostrule() {
        return freightcostrule;
    }

    public void setFreightcostrule(String freightcostrule) {
        this.freightcostrule = freightcostrule;
    }

    public String getDeliveryviarule() {
        return deliveryviarule;
    }

    public void setDeliveryviarule(String deliveryviarule) {
        this.deliveryviarule = deliveryviarule;
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

    public BigDecimal getInvoice_printformat_id() {
        return invoice_printformat_id;
    }

    public void setInvoice_printformat_id(BigDecimal invoice_printformat_id) {
        this.invoice_printformat_id = invoice_printformat_id;
    }

    public String getSocreditstatus() {
        return socreditstatus;
    }

    public void setSocreditstatus(String socreditstatus) {
        this.socreditstatus = socreditstatus;
    }

    public BigDecimal getShelflifeminpct() {
        return shelflifeminpct;
    }

    public void setShelflifeminpct(BigDecimal shelflifeminpct) {
        this.shelflifeminpct = shelflifeminpct;
    }

    public BigDecimal getAd_orgbp_id() {
        return ad_orgbp_id;
    }

    public void setAd_orgbp_id(BigDecimal ad_orgbp_id) {
        this.ad_orgbp_id = ad_orgbp_id;
    }

    public BigDecimal getFlatdiscount() {
        return flatdiscount;
    }

    public void setFlatdiscount(BigDecimal flatdiscount) {
        this.flatdiscount = flatdiscount;
    }

    public BigDecimal getTotalopenbalance() {
        return totalopenbalance;
    }

    public void setTotalopenbalance(BigDecimal totalopenbalance) {
        this.totalopenbalance = totalopenbalance;
    }

    public String getIsodt() {
        return isodt;
    }

    public void setIsodt(String isodt) {
        this.isodt = isodt;
    }

    public String getIstaxdelay() {
        return istaxdelay;
    }

    public void setIstaxdelay(String istaxdelay) {
        this.istaxdelay = istaxdelay;
    }

    public String getTrans_code() {
        return trans_code;
    }

    public void setTrans_code(String trans_code) {
        this.trans_code = trans_code;
    }

    public Date getPkpdate() {
        return pkpdate;
    }

    public void setPkpdate(Date pkpdate) {
        this.pkpdate = pkpdate;
    }

    public String getProcessing() {
        return processing;
    }

    public void setProcessing(String processing) {
        this.processing = processing;
    }

    public String getIsvalid() {
        return isvalid;
    }

    public void setIsvalid(String isvalid) {
        this.isvalid = isvalid;
    }

    public BigDecimal getC_salesregion_id() {
        return c_salesregion_id;
    }

    public void setC_salesregion_id(BigDecimal c_salesregion_id) {
        this.c_salesregion_id = c_salesregion_id;
    }

    public String getIsmechanic() {
        return ismechanic;
    }

    public void setIsmechanic(String ismechanic) {
        this.ismechanic = ismechanic;
    }

    public String getIsdriver() {
        return isdriver;
    }

    public void setIsdriver(String isdriver) {
        this.isdriver = isdriver;
    }

    public BigDecimal getM_shipper_id() {
        return m_shipper_id;
    }

    public void setM_shipper_id(BigDecimal m_shipper_id) {
        this.m_shipper_id = m_shipper_id;
    }

    public String getDistributionmethod() {
        return distributionmethod;
    }

    public void setDistributionmethod(String distributionmethod) {
        this.distributionmethod = distributionmethod;
    }

    public String getMarketsegment() {
        return marketsegment;
    }

    public void setMarketsegment(String marketsegment) {
        this.marketsegment = marketsegment;
    }

    public String getIswarehousestaff() {
        return iswarehousestaff;
    }

    public void setIswarehousestaff(String iswarehousestaff) {
        this.iswarehousestaff = iswarehousestaff;
    }

    public String getSales_group() {
        return sales_group;
    }

    public void setSales_group(String sales_group) {
        this.sales_group = sales_group;
    }

    public String getSalesrep_2_id() {
        return salesrep_2_id;
    }

    public void setSalesrep_2_id(String salesrep_2_id) {
        this.salesrep_2_id = salesrep_2_id;
    }

    public String getIsstopsopt() {
        return isstopsopt;
    }

    public void setIsstopsopt(String isstopsopt) {
        this.isstopsopt = isstopsopt;
    }

    public String getIsstopsoht() {
        return isstopsoht;
    }

    public void setIsstopsoht(String isstopsoht) {
        this.isstopsoht = isstopsoht;
    }

    public String getIscheckunpaidinvoice() {
        return ischeckunpaidinvoice;
    }

    public void setIscheckunpaidinvoice(String ischeckunpaidinvoice) {
        this.ischeckunpaidinvoice = ischeckunpaidinvoice;
    }

    public BigDecimal getSo_creditlimit_pt() {
        return so_creditlimit_pt;
    }

    public void setSo_creditlimit_pt(BigDecimal so_creditlimit_pt) {
        this.so_creditlimit_pt = so_creditlimit_pt;
    }

    public BigDecimal getSo_creditlimit_ht() {
        return so_creditlimit_ht;
    }

    public void setSo_creditlimit_ht(BigDecimal so_creditlimit_ht) {
        this.so_creditlimit_ht = so_creditlimit_ht;
    }

    public BigDecimal getSo_creditused_pt() {
        return so_creditused_pt;
    }

    public void setSo_creditused_pt(BigDecimal so_creditused_pt) {
        this.so_creditused_pt = so_creditused_pt;
    }

    public BigDecimal getSo_creditused_ht() {
        return so_creditused_ht;
    }

    public void setSo_creditused_ht(BigDecimal so_creditused_ht) {
        this.so_creditused_ht = so_creditused_ht;
    }

    public String getWmsvalue() {
        return wmsvalue;
    }

    public void setWmsvalue(String wmsvalue) {
        this.wmsvalue = wmsvalue;
    }

    public String getRingtype() {
        return ringtype;
    }

    public void setRingtype(String ringtype) {
        this.ringtype = ringtype;
    }

    public BigDecimal getC_paymentterm_invoice_id() {
        return c_paymentterm_invoice_id;
    }

    public void setC_paymentterm_invoice_id(BigDecimal c_paymentterm_invoice_id) {
        this.c_paymentterm_invoice_id = c_paymentterm_invoice_id;
    }

    public int getInterface_flag() {
        return interface_flag;
    }

    public void setInterface_flag(int interface_flag) {
        this.interface_flag = interface_flag;
    }

    public String getIspkp() {
        return ispkp;
    }

    public void setIspkp(String ispkp) {
        this.ispkp = ispkp;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Override
    public String toString() {
        return "C_bpartnerDTO{" + "c_bpartner_id=" + c_bpartner_id + ", ad_client_id=" + ad_client_id + ", ad_org_id=" + ad_org_id + ", isactive=" + isactive + ", created=" + created + ", createdby=" + createdby + ", updated=" + updated + ", updatedBy=" + updatedBy + ", value=" + value + ", name=" + name + ", name2=" + name2 + ", description=" + description + ", issummary=" + issummary + ", c_bp_group_id=" + c_bp_group_id + ", isonetime=" + isonetime + ", isprospect=" + isprospect + ", isvendor=" + isvendor + ", iscustomer=" + iscustomer + ", isemployee=" + isemployee + ", issalesrep=" + issalesrep + ", referenceno=" + referenceno + ", duns=" + duns + ", url=" + url + ", ad_language=" + ad_language + ", taxid=" + taxid + ", istaxexempt=" + istaxexempt + ", c_invoiceschedule_id=" + c_invoiceschedule_id + ", rating=" + rating + ", salesvolume=" + salesvolume + ", numberemployees=" + numberemployees + ", naics=" + naics + ", firstsale=" + firstsale + ", acqusitioncost=" + acqusitioncost + ", potentiallifetimevalue=" + potentiallifetimevalue + ", actuallifetimevalue=" + actuallifetimevalue + ", shareofcustomer=" + shareofcustomer + ", paymentrule=" + paymentrule + ", so_creditlimit=" + so_creditlimit + ", so_creditused=" + so_creditused + ", c_paymentterm_id=" + c_paymentterm_id + ", m_pricelist_id=" + m_pricelist_id + ", m_discountschema_id=" + m_discountschema_id + ", c_dunning_id=" + c_dunning_id + ", isdiscountprinted=" + isdiscountprinted + ", so_description=" + so_description + ", poreference=" + poreference + ", paymentrulepo=" + paymentrulepo + ", po_pricelist_id=" + po_pricelist_id + ", po_discountschema_id=" + po_discountschema_id + ", po_paymentterm_id=" + po_paymentterm_id + ", documentcopies=" + documentcopies + ", c_greeting_id=" + c_greeting_id + ", invoicerule=" + invoicerule + ", deliveryrule=" + deliveryrule + ", freightcostrule=" + freightcostrule + ", deliveryviarule=" + deliveryviarule + ", salesrep_id=" + salesrep_id + ", sendemail=" + sendemail + ", bpartner_parent_id=" + bpartner_parent_id + ", invoice_printformat_id=" + invoice_printformat_id + ", socreditstatus=" + socreditstatus + ", shelflifeminpct=" + shelflifeminpct + ", ad_orgbp_id=" + ad_orgbp_id + ", flatdiscount=" + flatdiscount + ", totalopenbalance=" + totalopenbalance + ", isodt=" + isodt + ", istaxdelay=" + istaxdelay + ", trans_code=" + trans_code + ", pkpdate=" + pkpdate + ", processing=" + processing + ", isvalid=" + isvalid + ", c_salesregion_id=" + c_salesregion_id + ", ismechanic=" + ismechanic + ", isdriver=" + isdriver + ", m_shipper_id=" + m_shipper_id + ", distributionmethod=" + distributionmethod + ", marketsegment=" + marketsegment + ", iswarehousestaff=" + iswarehousestaff + ", sales_group=" + sales_group + ", salesrep_2_id=" + salesrep_2_id + ", isstopsopt=" + isstopsopt + ", isstopsoht=" + isstopsoht + ", ischeckunpaidinvoice=" + ischeckunpaidinvoice + ", so_creditlimit_pt=" + so_creditlimit_pt + ", so_creditlimit_ht=" + so_creditlimit_ht + ", so_creditused_pt=" + so_creditused_pt + ", so_creditused_ht=" + so_creditused_ht + ", wmsvalue=" + wmsvalue + ", ringtype=" + ringtype + ", c_paymentterm_invoice_id=" + c_paymentterm_invoice_id + ", interface_flag=" + interface_flag + ", ispkp=" + ispkp + ", alias=" + alias + '}';
    }

}
