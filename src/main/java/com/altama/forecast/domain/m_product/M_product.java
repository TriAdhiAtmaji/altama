package com.altama.forecast.domain.m_product;

import com.altama.forecast.domain.shared.EntityObject;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author admin
 */
public class M_product implements EntityObject<M_product> {

    long id;
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
    private short interface_flag;
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

    public M_product() {
    }

    public M_product(BigDecimal m_product_id, BigDecimal ad_client_id, BigDecimal ad_org_id, String isactive, Date created, BigDecimal createdby, Date updated, BigDecimal updatedBy, String value, String name, String description, String documentnote, String help, String upc, String sku, BigDecimal c_uom_id, BigDecimal salesrep_id, String issummary, String isstocked, String ispurchased, String issold, String isbom, String isinvoiceprintdetails, String ispicklistprintdetails, String isverified, BigDecimal c_revenuerecognition_id, BigDecimal m_product_category_id, String classification, BigDecimal volume, BigDecimal weight, BigDecimal shelfwidth, BigDecimal shelfheight, BigDecimal shelfdepth, BigDecimal unitsperpallet, BigDecimal c_taxcategory_id, BigDecimal s_resource_id, String discontinued, Date discontinuedby, String processing, String s_expensetype_id, String producttype, String imageurl, String descriptionurl, BigDecimal guaranteedays, BigDecimal r_mailtext_id, String versionno, BigDecimal m_attributeset_id, BigDecimal m_attributesetinstance_id, String downloadurl, BigDecimal m_freightcategory_id, BigDecimal m_locator_id, BigDecimal guaranteedaysmin, String iswebstorefeatured, String isselfservice, BigDecimal c_subscriptiontype_id, String isdropship, String isexcludeautodelivery, BigDecimal m_productsubcat_id, BigDecimal user1_id, String isgeneralsparepart, String item_no, String qty_per_innerbox, BigDecimal qty_per_ctn, BigDecimal qty_innerbox_per_ctn, BigDecimal net_weight, String isdiscontinued, BigDecimal net_weight_dus, BigDecimal weight_dus, String item_code, String picture, String isqi, String isnew, String isnewpo, Date updated_2, BigDecimal m_productsubcat2_id, BigDecimal m_productsubcat3_id, BigDecimal volume_ctn, String iscashback, String wmsvalue, BigDecimal c_uom2_id, BigDecimal c_uom3_id, String palletizeby, BigDecimal palletizevalue, String movingtype, String movingtypesales, short interface_flag, BigDecimal weight_ctn, BigDecimal qtylimitpo, BigDecimal length_ctn, BigDecimal width_ctn, BigDecimal height_ctn, String islimitpo, BigDecimal tier, BigDecimal qty_ctn_per_pallete, BigDecimal height_pallete, BigDecimal weight_pallete, BigDecimal height_tier, BigDecimal qtylimitoti) {
        this.m_product_id = m_product_id;
        this.ad_client_id = ad_client_id;
        this.ad_org_id = ad_org_id;
        this.isactive = isactive;
        this.created = created;
        this.createdby = createdby;
        this.updated = updated;
        this.updatedBy = updatedBy;
        this.value = value;
        this.name = name;
        this.description = description;
        this.documentnote = documentnote;
        this.help = help;
        this.upc = upc;
        this.sku = sku;
        this.c_uom_id = c_uom_id;
        this.salesrep_id = salesrep_id;
        this.issummary = issummary;
        this.isstocked = isstocked;
        this.ispurchased = ispurchased;
        this.issold = issold;
        this.isbom = isbom;
        this.isinvoiceprintdetails = isinvoiceprintdetails;
        this.ispicklistprintdetails = ispicklistprintdetails;
        this.isverified = isverified;
        this.c_revenuerecognition_id = c_revenuerecognition_id;
        this.m_product_category_id = m_product_category_id;
        this.classification = classification;
        this.volume = volume;
        this.weight = weight;
        this.shelfwidth = shelfwidth;
        this.shelfheight = shelfheight;
        this.shelfdepth = shelfdepth;
        this.unitsperpallet = unitsperpallet;
        this.c_taxcategory_id = c_taxcategory_id;
        this.s_resource_id = s_resource_id;
        this.discontinued = discontinued;
        this.discontinuedby = discontinuedby;
        this.processing = processing;
        this.s_expensetype_id = s_expensetype_id;
        this.producttype = producttype;
        this.imageurl = imageurl;
        this.descriptionurl = descriptionurl;
        this.guaranteedays = guaranteedays;
        this.r_mailtext_id = r_mailtext_id;
        this.versionno = versionno;
        this.m_attributeset_id = m_attributeset_id;
        this.m_attributesetinstance_id = m_attributesetinstance_id;
        this.downloadurl = downloadurl;
        this.m_freightcategory_id = m_freightcategory_id;
        this.m_locator_id = m_locator_id;
        this.guaranteedaysmin = guaranteedaysmin;
        this.iswebstorefeatured = iswebstorefeatured;
        this.isselfservice = isselfservice;
        this.c_subscriptiontype_id = c_subscriptiontype_id;
        this.isdropship = isdropship;
        this.isexcludeautodelivery = isexcludeautodelivery;
        this.m_productsubcat_id = m_productsubcat_id;
        this.user1_id = user1_id;
        this.isgeneralsparepart = isgeneralsparepart;
        this.item_no = item_no;
        this.qty_per_innerbox = qty_per_innerbox;
        this.qty_per_ctn = qty_per_ctn;
        this.qty_innerbox_per_ctn = qty_innerbox_per_ctn;
        this.net_weight = net_weight;
        this.isdiscontinued = isdiscontinued;
        this.net_weight_dus = net_weight_dus;
        this.weight_dus = weight_dus;
        this.item_code = item_code;
        this.picture = picture;
        this.isqi = isqi;
        this.isnew = isnew;
        this.isnewpo = isnewpo;
        this.updated_2 = updated_2;
        this.m_productsubcat2_id = m_productsubcat2_id;
        this.m_productsubcat3_id = m_productsubcat3_id;
        this.volume_ctn = volume_ctn;
        this.iscashback = iscashback;
        this.wmsvalue = wmsvalue;
        this.c_uom2_id = c_uom2_id;
        this.c_uom3_id = c_uom3_id;
        this.palletizeby = palletizeby;
        this.palletizevalue = palletizevalue;
        this.movingtype = movingtype;
        this.movingtypesales = movingtypesales;
        this.interface_flag = interface_flag;
        this.weight_ctn = weight_ctn;
        this.qtylimitpo = qtylimitpo;
        this.length_ctn = length_ctn;
        this.width_ctn = width_ctn;
        this.height_ctn = height_ctn;
        this.islimitpo = islimitpo;
        this.tier = tier;
        this.qty_ctn_per_pallete = qty_ctn_per_pallete;
        this.height_pallete = height_pallete;
        this.weight_pallete = weight_pallete;
        this.height_tier = height_tier;
        this.qtylimitoti = qtylimitoti;
    }

    public void assignNewM_product(M_product m_product) {
        this.m_product_id = m_product.m_product_id;
        this.ad_client_id = m_product.ad_client_id;
        this.ad_org_id = m_product.ad_org_id;
        this.isactive = m_product.isactive;
        this.created = m_product.created;
        this.createdby = m_product.createdby;
        this.updated = m_product.updated;
        this.updatedBy = m_product.updatedBy;
        this.value = m_product.value;
        this.name = m_product.name;
        this.description = m_product.description;
        this.documentnote = m_product.documentnote;
        this.help = m_product.help;
        this.upc = m_product.upc;
        this.sku = m_product.sku;
        this.c_uom_id = m_product.c_uom_id;
        this.salesrep_id = m_product.salesrep_id;
        this.issummary = m_product.issummary;
        this.isstocked = m_product.isstocked;
        this.ispurchased = m_product.ispurchased;
        this.issold = m_product.issold;
        this.isbom = m_product.isbom;
        this.isinvoiceprintdetails = m_product.isinvoiceprintdetails;
        this.ispicklistprintdetails = m_product.ispicklistprintdetails;
        this.isverified = m_product.isverified;
        this.c_revenuerecognition_id = m_product.c_revenuerecognition_id;
        this.m_product_category_id = m_product.m_product_category_id;
        this.classification = m_product.classification;
        this.volume = m_product.volume;
        this.weight = m_product.weight;
        this.shelfwidth = m_product.shelfwidth;
        this.shelfheight = m_product.shelfheight;
        this.shelfdepth = m_product.shelfdepth;
        this.unitsperpallet = m_product.unitsperpallet;
        this.c_taxcategory_id = m_product.c_taxcategory_id;
        this.s_resource_id = m_product.s_resource_id;
        this.discontinued = m_product.discontinued;
        this.discontinuedby = m_product.discontinuedby;
        this.processing = m_product.processing;
        this.s_expensetype_id = m_product.s_expensetype_id;
        this.producttype = m_product.producttype;
        this.imageurl = m_product.imageurl;
        this.descriptionurl = m_product.descriptionurl;
        this.guaranteedays = m_product.guaranteedays;
        this.r_mailtext_id = m_product.r_mailtext_id;
        this.versionno = m_product.versionno;
        this.m_attributeset_id = m_product.m_attributeset_id;
        this.m_attributesetinstance_id = m_product.m_attributesetinstance_id;
        this.downloadurl = m_product.downloadurl;
        this.m_freightcategory_id = m_product.m_freightcategory_id;
        this.m_locator_id = m_product.m_locator_id;
        this.guaranteedaysmin = m_product.guaranteedaysmin;
        this.iswebstorefeatured = m_product.iswebstorefeatured;
        this.isselfservice = m_product.isselfservice;
        this.c_subscriptiontype_id = m_product.c_subscriptiontype_id;
        this.isdropship = m_product.isdropship;
        this.isexcludeautodelivery = m_product.isexcludeautodelivery;
        this.m_productsubcat_id = m_product.m_productsubcat_id;
        this.user1_id = m_product.user1_id;
        this.isgeneralsparepart = m_product.isgeneralsparepart;
        this.item_no = m_product.item_no;
        this.qty_per_innerbox = m_product.qty_per_innerbox;
        this.qty_per_ctn = m_product.qty_per_ctn;
        this.qty_innerbox_per_ctn = m_product.qty_innerbox_per_ctn;
        this.net_weight = m_product.net_weight;
        this.isdiscontinued = m_product.isdiscontinued;
        this.net_weight_dus = m_product.net_weight_dus;
        this.weight_dus = m_product.weight_dus;
        this.item_code = m_product.item_code;
        this.picture = m_product.picture;
        this.isqi = m_product.isqi;
        this.isnew = m_product.isnew;
        this.isnewpo = m_product.isnewpo;
        this.updated_2 = m_product.updated_2;
        this.m_productsubcat2_id = m_product.m_productsubcat2_id;
        this.m_productsubcat3_id = m_product.m_productsubcat3_id;
        this.volume_ctn = m_product.volume_ctn;
        this.iscashback = m_product.iscashback;
        this.wmsvalue = m_product.wmsvalue;
        this.c_uom2_id = m_product.c_uom2_id;
        this.c_uom3_id = m_product.c_uom3_id;
        this.palletizeby = m_product.palletizeby;
        this.palletizevalue = m_product.palletizevalue;
        this.movingtype = m_product.movingtype;
        this.movingtypesales = m_product.movingtypesales;
        this.interface_flag = m_product.interface_flag;
        this.weight_ctn = m_product.weight_ctn;
        this.qtylimitpo = m_product.qtylimitpo;
        this.length_ctn = m_product.length_ctn;
        this.width_ctn = m_product.width_ctn;
        this.height_ctn = m_product.height_ctn;
        this.islimitpo = m_product.islimitpo;
        this.tier = m_product.tier;
        this.qty_ctn_per_pallete = m_product.qty_ctn_per_pallete;
        this.height_pallete = m_product.height_pallete;
        this.weight_pallete = m_product.weight_pallete;
        this.height_tier = m_product.height_tier;
        this.qtylimitoti = m_product.qtylimitoti;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public BigDecimal getM_product_id() {
        return m_product_id;
    }

    public void setM_product_id(BigDecimal m_product_id) {
        this.m_product_id = m_product_id;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDocumentnote() {
        return documentnote;
    }

    public void setDocumentnote(String documentnote) {
        this.documentnote = documentnote;
    }

    public String getHelp() {
        return help;
    }

    public void setHelp(String help) {
        this.help = help;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public BigDecimal getC_uom_id() {
        return c_uom_id;
    }

    public void setC_uom_id(BigDecimal c_uom_id) {
        this.c_uom_id = c_uom_id;
    }

    public BigDecimal getSalesrep_id() {
        return salesrep_id;
    }

    public void setSalesrep_id(BigDecimal salesrep_id) {
        this.salesrep_id = salesrep_id;
    }

    public String getIssummary() {
        return issummary;
    }

    public void setIssummary(String issummary) {
        this.issummary = issummary;
    }

    public String getIsstocked() {
        return isstocked;
    }

    public void setIsstocked(String isstocked) {
        this.isstocked = isstocked;
    }

    public String getIspurchased() {
        return ispurchased;
    }

    public void setIspurchased(String ispurchased) {
        this.ispurchased = ispurchased;
    }

    public String getIssold() {
        return issold;
    }

    public void setIssold(String issold) {
        this.issold = issold;
    }

    public String getIsbom() {
        return isbom;
    }

    public void setIsbom(String isbom) {
        this.isbom = isbom;
    }

    public String getIsinvoiceprintdetails() {
        return isinvoiceprintdetails;
    }

    public void setIsinvoiceprintdetails(String isinvoiceprintdetails) {
        this.isinvoiceprintdetails = isinvoiceprintdetails;
    }

    public String getIspicklistprintdetails() {
        return ispicklistprintdetails;
    }

    public void setIspicklistprintdetails(String ispicklistprintdetails) {
        this.ispicklistprintdetails = ispicklistprintdetails;
    }

    public String getIsverified() {
        return isverified;
    }

    public void setIsverified(String isverified) {
        this.isverified = isverified;
    }

    public BigDecimal getC_revenuerecognition_id() {
        return c_revenuerecognition_id;
    }

    public void setC_revenuerecognition_id(BigDecimal c_revenuerecognition_id) {
        this.c_revenuerecognition_id = c_revenuerecognition_id;
    }

    public BigDecimal getM_product_category_id() {
        return m_product_category_id;
    }

    public void setM_product_category_id(BigDecimal m_product_category_id) {
        this.m_product_category_id = m_product_category_id;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public BigDecimal getVolume() {
        return volume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getShelfwidth() {
        return shelfwidth;
    }

    public void setShelfwidth(BigDecimal shelfwidth) {
        this.shelfwidth = shelfwidth;
    }

    public BigDecimal getShelfheight() {
        return shelfheight;
    }

    public void setShelfheight(BigDecimal shelfheight) {
        this.shelfheight = shelfheight;
    }

    public BigDecimal getShelfdepth() {
        return shelfdepth;
    }

    public void setShelfdepth(BigDecimal shelfdepth) {
        this.shelfdepth = shelfdepth;
    }

    public BigDecimal getUnitsperpallet() {
        return unitsperpallet;
    }

    public void setUnitsperpallet(BigDecimal unitsperpallet) {
        this.unitsperpallet = unitsperpallet;
    }

    public BigDecimal getC_taxcategory_id() {
        return c_taxcategory_id;
    }

    public void setC_taxcategory_id(BigDecimal c_taxcategory_id) {
        this.c_taxcategory_id = c_taxcategory_id;
    }

    public BigDecimal getS_resource_id() {
        return s_resource_id;
    }

    public void setS_resource_id(BigDecimal s_resource_id) {
        this.s_resource_id = s_resource_id;
    }

    public String getDiscontinued() {
        return discontinued;
    }

    public void setDiscontinued(String discontinued) {
        this.discontinued = discontinued;
    }

    public Date getDiscontinuedby() {
        return discontinuedby;
    }

    public void setDiscontinuedby(Date discontinuedby) {
        this.discontinuedby = discontinuedby;
    }

    public String getProcessing() {
        return processing;
    }

    public void setProcessing(String processing) {
        this.processing = processing;
    }

    public String getS_expensetype_id() {
        return s_expensetype_id;
    }

    public void setS_expensetype_id(String s_expensetype_id) {
        this.s_expensetype_id = s_expensetype_id;
    }

    public String getProducttype() {
        return producttype;
    }

    public void setProducttype(String producttype) {
        this.producttype = producttype;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getDescriptionurl() {
        return descriptionurl;
    }

    public void setDescriptionurl(String descriptionurl) {
        this.descriptionurl = descriptionurl;
    }

    public BigDecimal getGuaranteedays() {
        return guaranteedays;
    }

    public void setGuaranteedays(BigDecimal guaranteedays) {
        this.guaranteedays = guaranteedays;
    }

    public BigDecimal getR_mailtext_id() {
        return r_mailtext_id;
    }

    public void setR_mailtext_id(BigDecimal r_mailtext_id) {
        this.r_mailtext_id = r_mailtext_id;
    }

    public String getVersionno() {
        return versionno;
    }

    public void setVersionno(String versionno) {
        this.versionno = versionno;
    }

    public BigDecimal getM_attributeset_id() {
        return m_attributeset_id;
    }

    public void setM_attributeset_id(BigDecimal m_attributeset_id) {
        this.m_attributeset_id = m_attributeset_id;
    }

    public BigDecimal getM_attributesetinstance_id() {
        return m_attributesetinstance_id;
    }

    public void setM_attributesetinstance_id(BigDecimal m_attributesetinstance_id) {
        this.m_attributesetinstance_id = m_attributesetinstance_id;
    }

    public String getDownloadurl() {
        return downloadurl;
    }

    public void setDownloadurl(String downloadurl) {
        this.downloadurl = downloadurl;
    }

    public BigDecimal getM_freightcategory_id() {
        return m_freightcategory_id;
    }

    public void setM_freightcategory_id(BigDecimal m_freightcategory_id) {
        this.m_freightcategory_id = m_freightcategory_id;
    }

    public BigDecimal getM_locator_id() {
        return m_locator_id;
    }

    public void setM_locator_id(BigDecimal m_locator_id) {
        this.m_locator_id = m_locator_id;
    }

    public BigDecimal getGuaranteedaysmin() {
        return guaranteedaysmin;
    }

    public void setGuaranteedaysmin(BigDecimal guaranteedaysmin) {
        this.guaranteedaysmin = guaranteedaysmin;
    }

    public String getIswebstorefeatured() {
        return iswebstorefeatured;
    }

    public void setIswebstorefeatured(String iswebstorefeatured) {
        this.iswebstorefeatured = iswebstorefeatured;
    }

    public String getIsselfservice() {
        return isselfservice;
    }

    public void setIsselfservice(String isselfservice) {
        this.isselfservice = isselfservice;
    }

    public BigDecimal getC_subscriptiontype_id() {
        return c_subscriptiontype_id;
    }

    public void setC_subscriptiontype_id(BigDecimal c_subscriptiontype_id) {
        this.c_subscriptiontype_id = c_subscriptiontype_id;
    }

    public String getIsdropship() {
        return isdropship;
    }

    public void setIsdropship(String isdropship) {
        this.isdropship = isdropship;
    }

    public String getIsexcludeautodelivery() {
        return isexcludeautodelivery;
    }

    public void setIsexcludeautodelivery(String isexcludeautodelivery) {
        this.isexcludeautodelivery = isexcludeautodelivery;
    }

    public BigDecimal getM_productsubcat_id() {
        return m_productsubcat_id;
    }

    public void setM_productsubcat_id(BigDecimal m_productsubcat_id) {
        this.m_productsubcat_id = m_productsubcat_id;
    }

    public BigDecimal getUser1_id() {
        return user1_id;
    }

    public void setUser1_id(BigDecimal user1_id) {
        this.user1_id = user1_id;
    }

    public String getIsgeneralsparepart() {
        return isgeneralsparepart;
    }

    public void setIsgeneralsparepart(String isgeneralsparepart) {
        this.isgeneralsparepart = isgeneralsparepart;
    }

    public String getItem_no() {
        return item_no;
    }

    public void setItem_no(String item_no) {
        this.item_no = item_no;
    }

    public String getQty_per_innerbox() {
        return qty_per_innerbox;
    }

    public void setQty_per_innerbox(String qty_per_innerbox) {
        this.qty_per_innerbox = qty_per_innerbox;
    }

    public BigDecimal getQty_per_ctn() {
        return qty_per_ctn;
    }

    public void setQty_per_ctn(BigDecimal qty_per_ctn) {
        this.qty_per_ctn = qty_per_ctn;
    }

    public BigDecimal getQty_innerbox_per_ctn() {
        return qty_innerbox_per_ctn;
    }

    public void setQty_innerbox_per_ctn(BigDecimal qty_innerbox_per_ctn) {
        this.qty_innerbox_per_ctn = qty_innerbox_per_ctn;
    }

    public BigDecimal getNet_weight() {
        return net_weight;
    }

    public void setNet_weight(BigDecimal net_weight) {
        this.net_weight = net_weight;
    }

    public String getIsdiscontinued() {
        return isdiscontinued;
    }

    public void setIsdiscontinued(String isdiscontinued) {
        this.isdiscontinued = isdiscontinued;
    }

    public BigDecimal getNet_weight_dus() {
        return net_weight_dus;
    }

    public void setNet_weight_dus(BigDecimal net_weight_dus) {
        this.net_weight_dus = net_weight_dus;
    }

    public BigDecimal getWeight_dus() {
        return weight_dus;
    }

    public void setWeight_dus(BigDecimal weight_dus) {
        this.weight_dus = weight_dus;
    }

    public String getItem_code() {
        return item_code;
    }

    public void setItem_code(String item_code) {
        this.item_code = item_code;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getIsqi() {
        return isqi;
    }

    public void setIsqi(String isqi) {
        this.isqi = isqi;
    }

    public String getIsnew() {
        return isnew;
    }

    public void setIsnew(String isnew) {
        this.isnew = isnew;
    }

    public String getIsnewpo() {
        return isnewpo;
    }

    public void setIsnewpo(String isnewpo) {
        this.isnewpo = isnewpo;
    }

    public Date getUpdated_2() {
        return updated_2;
    }

    public void setUpdated_2(Date updated_2) {
        this.updated_2 = updated_2;
    }

    public BigDecimal getM_productsubcat2_id() {
        return m_productsubcat2_id;
    }

    public void setM_productsubcat2_id(BigDecimal m_productsubcat2_id) {
        this.m_productsubcat2_id = m_productsubcat2_id;
    }

    public BigDecimal getM_productsubcat3_id() {
        return m_productsubcat3_id;
    }

    public void setM_productsubcat3_id(BigDecimal m_productsubcat3_id) {
        this.m_productsubcat3_id = m_productsubcat3_id;
    }

    public BigDecimal getVolume_ctn() {
        return volume_ctn;
    }

    public void setVolume_ctn(BigDecimal volume_ctn) {
        this.volume_ctn = volume_ctn;
    }

    public String getIscashback() {
        return iscashback;
    }

    public void setIscashback(String iscashback) {
        this.iscashback = iscashback;
    }

    public String getWmsvalue() {
        return wmsvalue;
    }

    public void setWmsvalue(String wmsvalue) {
        this.wmsvalue = wmsvalue;
    }

    public BigDecimal getC_uom2_id() {
        return c_uom2_id;
    }

    public void setC_uom2_id(BigDecimal c_uom2_id) {
        this.c_uom2_id = c_uom2_id;
    }

    public BigDecimal getC_uom3_id() {
        return c_uom3_id;
    }

    public void setC_uom3_id(BigDecimal c_uom3_id) {
        this.c_uom3_id = c_uom3_id;
    }

    public String getPalletizeby() {
        return palletizeby;
    }

    public void setPalletizeby(String palletizeby) {
        this.palletizeby = palletizeby;
    }

    public BigDecimal getPalletizevalue() {
        return palletizevalue;
    }

    public void setPalletizevalue(BigDecimal palletizevalue) {
        this.palletizevalue = palletizevalue;
    }

    public String getMovingtype() {
        return movingtype;
    }

    public void setMovingtype(String movingtype) {
        this.movingtype = movingtype;
    }

    public String getMovingtypesales() {
        return movingtypesales;
    }

    public void setMovingtypesales(String movingtypesales) {
        this.movingtypesales = movingtypesales;
    }

    public short getInterface_flag() {
        return interface_flag;
    }

    public void setInterface_flag(short interface_flag) {
        this.interface_flag = interface_flag;
    }

    public BigDecimal getWeight_ctn() {
        return weight_ctn;
    }

    public void setWeight_ctn(BigDecimal weight_ctn) {
        this.weight_ctn = weight_ctn;
    }

    public BigDecimal getQtylimitpo() {
        return qtylimitpo;
    }

    public void setQtylimitpo(BigDecimal qtylimitpo) {
        this.qtylimitpo = qtylimitpo;
    }

    public BigDecimal getLength_ctn() {
        return length_ctn;
    }

    public void setLength_ctn(BigDecimal length_ctn) {
        this.length_ctn = length_ctn;
    }

    public BigDecimal getWidth_ctn() {
        return width_ctn;
    }

    public void setWidth_ctn(BigDecimal width_ctn) {
        this.width_ctn = width_ctn;
    }

    public BigDecimal getHeight_ctn() {
        return height_ctn;
    }

    public void setHeight_ctn(BigDecimal height_ctn) {
        this.height_ctn = height_ctn;
    }

    public String getIslimitpo() {
        return islimitpo;
    }

    public void setIslimitpo(String islimitpo) {
        this.islimitpo = islimitpo;
    }

    public BigDecimal getTier() {
        return tier;
    }

    public void setTier(BigDecimal tier) {
        this.tier = tier;
    }

    public BigDecimal getQty_ctn_per_pallete() {
        return qty_ctn_per_pallete;
    }

    public void setQty_ctn_per_pallete(BigDecimal qty_ctn_per_pallete) {
        this.qty_ctn_per_pallete = qty_ctn_per_pallete;
    }

    public BigDecimal getHeight_pallete() {
        return height_pallete;
    }

    public void setHeight_pallete(BigDecimal height_pallete) {
        this.height_pallete = height_pallete;
    }

    public BigDecimal getWeight_pallete() {
        return weight_pallete;
    }

    public void setWeight_pallete(BigDecimal weight_pallete) {
        this.weight_pallete = weight_pallete;
    }

    public BigDecimal getHeight_tier() {
        return height_tier;
    }

    public void setHeight_tier(BigDecimal height_tier) {
        this.height_tier = height_tier;
    }

    public BigDecimal getQtylimitoti() {
        return qtylimitoti;
    }

    public void setQtylimitoti(BigDecimal qtylimitoti) {
        this.qtylimitoti = qtylimitoti;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.m_product_id);
        hash = 97 * hash + Objects.hashCode(this.ad_client_id);
        hash = 97 * hash + Objects.hashCode(this.ad_org_id);
        hash = 97 * hash + Objects.hashCode(this.isactive);
        hash = 97 * hash + Objects.hashCode(this.created);
        hash = 97 * hash + Objects.hashCode(this.createdby);
        hash = 97 * hash + Objects.hashCode(this.updated);
        hash = 97 * hash + Objects.hashCode(this.updatedBy);
        hash = 97 * hash + Objects.hashCode(this.value);
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + Objects.hashCode(this.description);
        hash = 97 * hash + Objects.hashCode(this.documentnote);
        hash = 97 * hash + Objects.hashCode(this.help);
        hash = 97 * hash + Objects.hashCode(this.upc);
        hash = 97 * hash + Objects.hashCode(this.sku);
        hash = 97 * hash + Objects.hashCode(this.c_uom_id);
        hash = 97 * hash + Objects.hashCode(this.salesrep_id);
        hash = 97 * hash + Objects.hashCode(this.issummary);
        hash = 97 * hash + Objects.hashCode(this.isstocked);
        hash = 97 * hash + Objects.hashCode(this.ispurchased);
        hash = 97 * hash + Objects.hashCode(this.issold);
        hash = 97 * hash + Objects.hashCode(this.isbom);
        hash = 97 * hash + Objects.hashCode(this.isinvoiceprintdetails);
        hash = 97 * hash + Objects.hashCode(this.ispicklistprintdetails);
        hash = 97 * hash + Objects.hashCode(this.isverified);
        hash = 97 * hash + Objects.hashCode(this.c_revenuerecognition_id);
        hash = 97 * hash + Objects.hashCode(this.m_product_category_id);
        hash = 97 * hash + Objects.hashCode(this.classification);
        hash = 97 * hash + Objects.hashCode(this.volume);
        hash = 97 * hash + Objects.hashCode(this.weight);
        hash = 97 * hash + Objects.hashCode(this.shelfwidth);
        hash = 97 * hash + Objects.hashCode(this.shelfheight);
        hash = 97 * hash + Objects.hashCode(this.shelfdepth);
        hash = 97 * hash + Objects.hashCode(this.unitsperpallet);
        hash = 97 * hash + Objects.hashCode(this.c_taxcategory_id);
        hash = 97 * hash + Objects.hashCode(this.s_resource_id);
        hash = 97 * hash + Objects.hashCode(this.discontinued);
        hash = 97 * hash + Objects.hashCode(this.discontinuedby);
        hash = 97 * hash + Objects.hashCode(this.processing);
        hash = 97 * hash + Objects.hashCode(this.s_expensetype_id);
        hash = 97 * hash + Objects.hashCode(this.producttype);
        hash = 97 * hash + Objects.hashCode(this.imageurl);
        hash = 97 * hash + Objects.hashCode(this.descriptionurl);
        hash = 97 * hash + Objects.hashCode(this.guaranteedays);
        hash = 97 * hash + Objects.hashCode(this.r_mailtext_id);
        hash = 97 * hash + Objects.hashCode(this.versionno);
        hash = 97 * hash + Objects.hashCode(this.m_attributeset_id);
        hash = 97 * hash + Objects.hashCode(this.m_attributesetinstance_id);
        hash = 97 * hash + Objects.hashCode(this.downloadurl);
        hash = 97 * hash + Objects.hashCode(this.m_freightcategory_id);
        hash = 97 * hash + Objects.hashCode(this.m_locator_id);
        hash = 97 * hash + Objects.hashCode(this.guaranteedaysmin);
        hash = 97 * hash + Objects.hashCode(this.iswebstorefeatured);
        hash = 97 * hash + Objects.hashCode(this.isselfservice);
        hash = 97 * hash + Objects.hashCode(this.c_subscriptiontype_id);
        hash = 97 * hash + Objects.hashCode(this.isdropship);
        hash = 97 * hash + Objects.hashCode(this.isexcludeautodelivery);
        hash = 97 * hash + Objects.hashCode(this.m_productsubcat_id);
        hash = 97 * hash + Objects.hashCode(this.user1_id);
        hash = 97 * hash + Objects.hashCode(this.isgeneralsparepart);
        hash = 97 * hash + Objects.hashCode(this.item_no);
        hash = 97 * hash + Objects.hashCode(this.qty_per_innerbox);
        hash = 97 * hash + Objects.hashCode(this.qty_per_ctn);
        hash = 97 * hash + Objects.hashCode(this.qty_innerbox_per_ctn);
        hash = 97 * hash + Objects.hashCode(this.net_weight);
        hash = 97 * hash + Objects.hashCode(this.isdiscontinued);
        hash = 97 * hash + Objects.hashCode(this.net_weight_dus);
        hash = 97 * hash + Objects.hashCode(this.weight_dus);
        hash = 97 * hash + Objects.hashCode(this.item_code);
        hash = 97 * hash + Objects.hashCode(this.picture);
        hash = 97 * hash + Objects.hashCode(this.isqi);
        hash = 97 * hash + Objects.hashCode(this.isnew);
        hash = 97 * hash + Objects.hashCode(this.isnewpo);
        hash = 97 * hash + Objects.hashCode(this.updated_2);
        hash = 97 * hash + Objects.hashCode(this.m_productsubcat2_id);
        hash = 97 * hash + Objects.hashCode(this.m_productsubcat3_id);
        hash = 97 * hash + Objects.hashCode(this.volume_ctn);
        hash = 97 * hash + Objects.hashCode(this.iscashback);
        hash = 97 * hash + Objects.hashCode(this.wmsvalue);
        hash = 97 * hash + Objects.hashCode(this.c_uom2_id);
        hash = 97 * hash + Objects.hashCode(this.c_uom3_id);
        hash = 97 * hash + Objects.hashCode(this.palletizeby);
        hash = 97 * hash + Objects.hashCode(this.palletizevalue);
        hash = 97 * hash + Objects.hashCode(this.movingtype);
        hash = 97 * hash + Objects.hashCode(this.movingtypesales);
        hash = 97 * hash + this.interface_flag;
        hash = 97 * hash + Objects.hashCode(this.weight_ctn);
        hash = 97 * hash + Objects.hashCode(this.qtylimitpo);
        hash = 97 * hash + Objects.hashCode(this.length_ctn);
        hash = 97 * hash + Objects.hashCode(this.width_ctn);
        hash = 97 * hash + Objects.hashCode(this.height_ctn);
        hash = 97 * hash + Objects.hashCode(this.islimitpo);
        hash = 97 * hash + Objects.hashCode(this.tier);
        hash = 97 * hash + Objects.hashCode(this.qty_ctn_per_pallete);
        hash = 97 * hash + Objects.hashCode(this.height_pallete);
        hash = 97 * hash + Objects.hashCode(this.weight_pallete);
        hash = 97 * hash + Objects.hashCode(this.height_tier);
        hash = 97 * hash + Objects.hashCode(this.qtylimitoti);
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
        final M_product other = (M_product) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public boolean sameIdentityAs(M_product other) {
        return this.equals(other);
    }

}
