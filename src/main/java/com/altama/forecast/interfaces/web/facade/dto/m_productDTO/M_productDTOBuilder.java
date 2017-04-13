/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.altama.forecast.interfaces.web.facade.dto.m_productDTO;

import java.math.BigDecimal;
import java.util.Date;

public class M_productDTOBuilder {

    private BigDecimal m_product_id;
    private BigDecimal ad_client_id;
    private BigDecimal ad_org_id;
    private String isactive;
    private Date created;
    private BigDecimal createdby;
    private Date updated;
    private BigDecimal updatedBy;
    private String value;
    private String name;
    private String description;
    private String documentnote;
    private String help;
    private String upc;
    private String sku;
    private BigDecimal c_uom_id;
    private BigDecimal salesrep_id;
    private String issummary;
    private String isstocked;
    private String ispurchased;
    private String issold;
    private String isbom;
    private String isinvoiceprintdetails;
    private String ispicklistprintdetails;
    private String isverified;
    private BigDecimal c_revenuerecognition_id;
    private BigDecimal m_product_category_id;
    private String classification;
    private BigDecimal volume;
    private BigDecimal weight;
    private BigDecimal shelfwidth;
    private BigDecimal shelfheight;
    private BigDecimal shelfdepth;
    private BigDecimal unitsperpallet;
    private BigDecimal c_taxcategory_id;
    private BigDecimal s_resource_id;
    private String discontinued;
    private Date discontinuedby;
    private String processing;
    private String s_expensetype_id;
    private String producttype;
    private String imageurl;
    private String descriptionurl;
    private BigDecimal guaranteedays;
    private BigDecimal r_mailtext_id;
    private String versionno;
    private BigDecimal m_attributeset_id;
    private BigDecimal m_attributesetinstance_id;
    private String downloadurl;
    private BigDecimal m_freightcategory_id;
    private BigDecimal m_locator_id;
    private BigDecimal guaranteedaysmin;
    private String iswebstorefeatured;
    private String isselfservice;
    private BigDecimal c_subscriptiontype_id;
    private String isdropship;
    private String isexcludeautodelivery;
    private BigDecimal m_productsubcat_id;
    private BigDecimal user1_id;
    private String isgeneralsparepart;
    private String item_no;
    private String qty_per_innerbox;
    private BigDecimal qty_per_ctn;
    private BigDecimal qty_innerbox_per_ctn;
    private BigDecimal net_weight;
    private String isdiscontinued;
    private BigDecimal net_weight_dus;
    private BigDecimal weight_dus;
    private String item_code;
    private String picture;
    private String isqi;
    private String isnew;
    private String isnewpo;
    private Date updated_2;
    private BigDecimal m_productsubcat2_id;
    private BigDecimal m_productsubcat3_id;
    private BigDecimal volume_ctn;
    private String iscashback;
    private String wmsvalue;
    private BigDecimal c_uom2_id;
    private BigDecimal c_uom3_id;
    private String palletizeby;
    private BigDecimal palletizevalue;
    private String movingtype;
    private String movingtypesales;
    private int interface_flag;
    private BigDecimal weight_ctn;
    private BigDecimal qtylimitpo;
    private BigDecimal length_ctn;
    private BigDecimal width_ctn;
    private BigDecimal height_ctn;
    private String islimitpo;
    private BigDecimal tier;
    private BigDecimal qty_ctn_per_pallete;
    private BigDecimal height_pallete;
    private BigDecimal weight_pallete;
    private BigDecimal height_tier;
    private BigDecimal qtylimitoti;

    public M_productDTOBuilder() {
    }

    public M_productDTOBuilder setM_product_id(BigDecimal m_product_id) {
        this.m_product_id = m_product_id;
        return this;
    }

    public M_productDTOBuilder setAd_client_id(BigDecimal ad_client_id) {
        this.ad_client_id = ad_client_id;
        return this;
    }

    public M_productDTOBuilder setAd_org_id(BigDecimal ad_org_id) {
        this.ad_org_id = ad_org_id;
        return this;
    }

    public M_productDTOBuilder setIsactive(String isactive) {
        this.isactive = isactive;
        return this;
    }

    public M_productDTOBuilder setCreated(Date created) {
        this.created = created;
        return this;
    }

    public M_productDTOBuilder setCreatedby(BigDecimal createdby) {
        this.createdby = createdby;
        return this;
    }

    public M_productDTOBuilder setUpdated(Date updated) {
        this.updated = updated;
        return this;
    }

    public M_productDTOBuilder setUpdatedBy(BigDecimal updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    public M_productDTOBuilder setValue(String value) {
        this.value = value;
        return this;
    }

    public M_productDTOBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public M_productDTOBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public M_productDTOBuilder setDocumentnote(String documentnote) {
        this.documentnote = documentnote;
        return this;
    }

    public M_productDTOBuilder setHelp(String help) {
        this.help = help;
        return this;
    }

    public M_productDTOBuilder setUpc(String upc) {
        this.upc = upc;
        return this;
    }

    public M_productDTOBuilder setSku(String sku) {
        this.sku = sku;
        return this;
    }

    public M_productDTOBuilder setC_uom_id(BigDecimal c_uom_id) {
        this.c_uom_id = c_uom_id;
        return this;
    }

    public M_productDTOBuilder setSalesrep_id(BigDecimal salesrep_id) {
        this.salesrep_id = salesrep_id;
        return this;
    }

    public M_productDTOBuilder setIssummary(String issummary) {
        this.issummary = issummary;
        return this;
    }

    public M_productDTOBuilder setIsstocked(String isstocked) {
        this.isstocked = isstocked;
        return this;
    }

    public M_productDTOBuilder setIspurchased(String ispurchased) {
        this.ispurchased = ispurchased;
        return this;
    }

    public M_productDTOBuilder setIssold(String issold) {
        this.issold = issold;
        return this;
    }

    public M_productDTOBuilder setIsbom(String isbom) {
        this.isbom = isbom;
        return this;
    }

    public M_productDTOBuilder setIsinvoiceprintdetails(String isinvoiceprintdetails) {
        this.isinvoiceprintdetails = isinvoiceprintdetails;
        return this;
    }

    public M_productDTOBuilder setIspicklistprintdetails(String ispicklistprintdetails) {
        this.ispicklistprintdetails = ispicklistprintdetails;
        return this;
    }

    public M_productDTOBuilder setIsverified(String isverified) {
        this.isverified = isverified;
        return this;
    }

    public M_productDTOBuilder setC_revenuerecognition_id(BigDecimal c_revenuerecognition_id) {
        this.c_revenuerecognition_id = c_revenuerecognition_id;
        return this;
    }

    public M_productDTOBuilder setM_product_category_id(BigDecimal m_product_category_id) {
        this.m_product_category_id = m_product_category_id;
        return this;
    }

    public M_productDTOBuilder setClassification(String classification) {
        this.classification = classification;
        return this;
    }

    public M_productDTOBuilder setVolume(BigDecimal volume) {
        this.volume = volume;
        return this;
    }

    public M_productDTOBuilder setWeight(BigDecimal weight) {
        this.weight = weight;
        return this;
    }

    public M_productDTOBuilder setShelfwidth(BigDecimal shelfwidth) {
        this.shelfwidth = shelfwidth;
        return this;
    }

    public M_productDTOBuilder setShelfheight(BigDecimal shelfheight) {
        this.shelfheight = shelfheight;
        return this;
    }

    public M_productDTOBuilder setShelfdepth(BigDecimal shelfdepth) {
        this.shelfdepth = shelfdepth;
        return this;
    }

    public M_productDTOBuilder setUnitsperpallet(BigDecimal unitsperpallet) {
        this.unitsperpallet = unitsperpallet;
        return this;
    }

    public M_productDTOBuilder setC_taxcategory_id(BigDecimal c_taxcategory_id) {
        this.c_taxcategory_id = c_taxcategory_id;
        return this;
    }

    public M_productDTOBuilder setS_resource_id(BigDecimal s_resource_id) {
        this.s_resource_id = s_resource_id;
        return this;
    }

    public M_productDTOBuilder setDiscontinued(String discontinued) {
        this.discontinued = discontinued;
        return this;
    }

    public M_productDTOBuilder setDiscontinuedby(Date discontinuedby) {
        this.discontinuedby = discontinuedby;
        return this;
    }

    public M_productDTOBuilder setProcessing(String processing) {
        this.processing = processing;
        return this;
    }

    public M_productDTOBuilder setS_expensetype_id(String s_expensetype_id) {
        this.s_expensetype_id = s_expensetype_id;
        return this;
    }

    public M_productDTOBuilder setProducttype(String producttype) {
        this.producttype = producttype;
        return this;
    }

    public M_productDTOBuilder setImageurl(String imageurl) {
        this.imageurl = imageurl;
        return this;
    }

    public M_productDTOBuilder setDescriptionurl(String descriptionurl) {
        this.descriptionurl = descriptionurl;
        return this;
    }

    public M_productDTOBuilder setGuaranteedays(BigDecimal guaranteedays) {
        this.guaranteedays = guaranteedays;
        return this;
    }

    public M_productDTOBuilder setR_mailtext_id(BigDecimal r_mailtext_id) {
        this.r_mailtext_id = r_mailtext_id;
        return this;
    }

    public M_productDTOBuilder setVersionno(String versionno) {
        this.versionno = versionno;
        return this;
    }

    public M_productDTOBuilder setM_attributeset_id(BigDecimal m_attributeset_id) {
        this.m_attributeset_id = m_attributeset_id;
        return this;
    }

    public M_productDTOBuilder setM_attributesetinstance_id(BigDecimal m_attributesetinstance_id) {
        this.m_attributesetinstance_id = m_attributesetinstance_id;
        return this;
    }

    public M_productDTOBuilder setDownloadurl(String downloadurl) {
        this.downloadurl = downloadurl;
        return this;
    }

    public M_productDTOBuilder setM_freightcategory_id(BigDecimal m_freightcategory_id) {
        this.m_freightcategory_id = m_freightcategory_id;
        return this;
    }

    public M_productDTOBuilder setM_locator_id(BigDecimal m_locator_id) {
        this.m_locator_id = m_locator_id;
        return this;
    }

    public M_productDTOBuilder setGuaranteedaysmin(BigDecimal guaranteedaysmin) {
        this.guaranteedaysmin = guaranteedaysmin;
        return this;
    }

    public M_productDTOBuilder setIswebstorefeatured(String iswebstorefeatured) {
        this.iswebstorefeatured = iswebstorefeatured;
        return this;
    }

    public M_productDTOBuilder setIsselfservice(String isselfservice) {
        this.isselfservice = isselfservice;
        return this;
    }

    public M_productDTOBuilder setC_subscriptiontype_id(BigDecimal c_subscriptiontype_id) {
        this.c_subscriptiontype_id = c_subscriptiontype_id;
        return this;
    }

    public M_productDTOBuilder setIsdropship(String isdropship) {
        this.isdropship = isdropship;
        return this;
    }

    public M_productDTOBuilder setIsexcludeautodelivery(String isexcludeautodelivery) {
        this.isexcludeautodelivery = isexcludeautodelivery;
        return this;
    }

    public M_productDTOBuilder setM_productsubcat_id(BigDecimal m_productsubcat_id) {
        this.m_productsubcat_id = m_productsubcat_id;
        return this;
    }

    public M_productDTOBuilder setUser1_id(BigDecimal user1_id) {
        this.user1_id = user1_id;
        return this;
    }

    public M_productDTOBuilder setIsgeneralsparepart(String isgeneralsparepart) {
        this.isgeneralsparepart = isgeneralsparepart;
        return this;
    }

    public M_productDTOBuilder setItem_no(String item_no) {
        this.item_no = item_no;
        return this;
    }

    public M_productDTOBuilder setQty_per_innerbox(String qty_per_innerbox) {
        this.qty_per_innerbox = qty_per_innerbox;
        return this;
    }

    public M_productDTOBuilder setQty_per_ctn(BigDecimal qty_per_ctn) {
        this.qty_per_ctn = qty_per_ctn;
        return this;
    }

    public M_productDTOBuilder setQty_innerbox_per_ctn(BigDecimal qty_innerbox_per_ctn) {
        this.qty_innerbox_per_ctn = qty_innerbox_per_ctn;
        return this;
    }

    public M_productDTOBuilder setNet_weight(BigDecimal net_weight) {
        this.net_weight = net_weight;
        return this;
    }

    public M_productDTOBuilder setIsdiscontinued(String isdiscontinued) {
        this.isdiscontinued = isdiscontinued;
        return this;
    }

    public M_productDTOBuilder setNet_weight_dus(BigDecimal net_weight_dus) {
        this.net_weight_dus = net_weight_dus;
        return this;
    }

    public M_productDTOBuilder setWeight_dus(BigDecimal weight_dus) {
        this.weight_dus = weight_dus;
        return this;
    }

    public M_productDTOBuilder setItem_code(String item_code) {
        this.item_code = item_code;
        return this;
    }

    public M_productDTOBuilder setPicture(String picture) {
        this.picture = picture;
        return this;
    }

    public M_productDTOBuilder setIsqi(String isqi) {
        this.isqi = isqi;
        return this;
    }

    public M_productDTOBuilder setIsnew(String isnew) {
        this.isnew = isnew;
        return this;
    }

    public M_productDTOBuilder setIsnewpo(String isnewpo) {
        this.isnewpo = isnewpo;
        return this;
    }

    public M_productDTOBuilder setUpdated_2(Date updated_2) {
        this.updated_2 = updated_2;
        return this;
    }

    public M_productDTOBuilder setM_productsubcat2_id(BigDecimal m_productsubcat2_id) {
        this.m_productsubcat2_id = m_productsubcat2_id;
        return this;
    }

    public M_productDTOBuilder setM_productsubcat3_id(BigDecimal m_productsubcat3_id) {
        this.m_productsubcat3_id = m_productsubcat3_id;
        return this;
    }

    public M_productDTOBuilder setVolume_ctn(BigDecimal volume_ctn) {
        this.volume_ctn = volume_ctn;
        return this;
    }

    public M_productDTOBuilder setIscashback(String iscashback) {
        this.iscashback = iscashback;
        return this;
    }

    public M_productDTOBuilder setWmsvalue(String wmsvalue) {
        this.wmsvalue = wmsvalue;
        return this;
    }

    public M_productDTOBuilder setC_uom2_id(BigDecimal c_uom2_id) {
        this.c_uom2_id = c_uom2_id;
        return this;
    }

    public M_productDTOBuilder setC_uom3_id(BigDecimal c_uom3_id) {
        this.c_uom3_id = c_uom3_id;
        return this;
    }

    public M_productDTOBuilder setPalletizeby(String palletizeby) {
        this.palletizeby = palletizeby;
        return this;
    }

    public M_productDTOBuilder setPalletizevalue(BigDecimal palletizevalue) {
        this.palletizevalue = palletizevalue;
        return this;
    }

    public M_productDTOBuilder setMovingtype(String movingtype) {
        this.movingtype = movingtype;
        return this;
    }

    public M_productDTOBuilder setMovingtypesales(String movingtypesales) {
        this.movingtypesales = movingtypesales;
        return this;
    }

    public M_productDTOBuilder setInterface_flag(int interface_flag) {
        this.interface_flag = interface_flag;
        return this;
    }

    public M_productDTOBuilder setWeight_ctn(BigDecimal weight_ctn) {
        this.weight_ctn = weight_ctn;
        return this;
    }

    public M_productDTOBuilder setQtylimitpo(BigDecimal qtylimitpo) {
        this.qtylimitpo = qtylimitpo;
        return this;
    }

    public M_productDTOBuilder setLength_ctn(BigDecimal length_ctn) {
        this.length_ctn = length_ctn;
        return this;
    }

    public M_productDTOBuilder setWidth_ctn(BigDecimal width_ctn) {
        this.width_ctn = width_ctn;
        return this;
    }

    public M_productDTOBuilder setHeight_ctn(BigDecimal height_ctn) {
        this.height_ctn = height_ctn;
        return this;
    }

    public M_productDTOBuilder setIslimitpo(String islimitpo) {
        this.islimitpo = islimitpo;
        return this;
    }

    public M_productDTOBuilder setTier(BigDecimal tier) {
        this.tier = tier;
        return this;
    }

    public M_productDTOBuilder setQty_ctn_per_pallete(BigDecimal qty_ctn_per_pallete) {
        this.qty_ctn_per_pallete = qty_ctn_per_pallete;
        return this;
    }

    public M_productDTOBuilder setHeight_pallete(BigDecimal height_pallete) {
        this.height_pallete = height_pallete;
        return this;
    }

    public M_productDTOBuilder setWeight_pallete(BigDecimal weight_pallete) {
        this.weight_pallete = weight_pallete;
        return this;
    }

    public M_productDTOBuilder setHeight_tier(BigDecimal height_tier) {
        this.height_tier = height_tier;
        return this;
    }

    public M_productDTOBuilder setQtylimitoti(BigDecimal qtylimitoti) {
        this.qtylimitoti = qtylimitoti;
        return this;
    }

    public M_productDTO createM_productDTO() {
        return new M_productDTO(m_product_id, ad_client_id, ad_org_id, isactive, created, createdby, updated, updatedBy, value, name, description, documentnote, help, upc, sku, c_uom_id, salesrep_id, issummary, isstocked, ispurchased, issold, isbom, isinvoiceprintdetails, ispicklistprintdetails, isverified, c_revenuerecognition_id, m_product_category_id, classification, volume, weight, shelfwidth, shelfheight, shelfdepth, unitsperpallet, c_taxcategory_id, s_resource_id, discontinued, discontinuedby, processing, s_expensetype_id, producttype, imageurl, descriptionurl, guaranteedays, r_mailtext_id, versionno, m_attributeset_id, m_attributesetinstance_id, downloadurl, m_freightcategory_id, m_locator_id, guaranteedaysmin, iswebstorefeatured, isselfservice, c_subscriptiontype_id, isdropship, isexcludeautodelivery, m_productsubcat_id, user1_id, isgeneralsparepart, item_no, qty_per_innerbox, qty_per_ctn, qty_innerbox_per_ctn, net_weight, isdiscontinued, net_weight_dus, weight_dus, item_code, picture, isqi, isnew, isnewpo, updated_2, m_productsubcat2_id, m_productsubcat3_id, volume_ctn, iscashback, wmsvalue, c_uom2_id, c_uom3_id, palletizeby, palletizevalue, movingtype, movingtypesales, interface_flag, weight_ctn, qtylimitpo, length_ctn, width_ctn, height_ctn, islimitpo, tier, qty_ctn_per_pallete, height_pallete, weight_pallete, height_tier, qtylimitoti);
    }

}
