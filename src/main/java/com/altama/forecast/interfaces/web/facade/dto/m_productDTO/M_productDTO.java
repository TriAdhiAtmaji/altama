package com.altama.forecast.interfaces.web.facade.dto.m_productDTO;

import com.altama.forecast.domain.m_product.IsDiscontinue;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author admin
 */
public class M_productDTO implements Serializable {

    private BigDecimal m_product_id;
    private BigDecimal ad_client_id;
    private BigDecimal ad_org_id;
    private String value;
    private String name;
    private BigDecimal c_uom_id;
    private BigDecimal salesrep_id;
    private BigDecimal c_revenuerecognition_id;
    private BigDecimal m_product_category_id;
    private String classification;
    private BigDecimal volume;
    private BigDecimal weight;
    private BigDecimal m_locator_id;
    private String wmsvalue;
    private IsDiscontinue isDiscontinue;

    public M_productDTO() {
    }

    public M_productDTO(BigDecimal m_product_id, BigDecimal ad_client_id, BigDecimal ad_org_id, String value, String name, BigDecimal c_uom_id, BigDecimal salesrep_id, BigDecimal c_revenuerecognition_id, BigDecimal m_product_category_id, String classification, BigDecimal volume, BigDecimal weight, BigDecimal m_locator_id, String wmsvalue, IsDiscontinue isDiscontinue) {
        this.m_product_id = m_product_id;
        this.ad_client_id = ad_client_id;
        this.ad_org_id = ad_org_id;
        this.value = value;
        this.name = name;
        this.c_uom_id = c_uom_id;
        this.salesrep_id = salesrep_id;
        this.c_revenuerecognition_id = c_revenuerecognition_id;
        this.m_product_category_id = m_product_category_id;
        this.classification = classification;
        this.volume = volume;
        this.weight = weight;
        this.m_locator_id = m_locator_id;
        this.wmsvalue = wmsvalue;
        this.isDiscontinue = isDiscontinue;
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

    public BigDecimal getM_locator_id() {
        return m_locator_id;
    }

    public void setM_locator_id(BigDecimal m_locator_id) {
        this.m_locator_id = m_locator_id;
    }

    public String getWmsvalue() {
        return wmsvalue;
    }

    public void setWmsvalue(String wmsvalue) {
        this.wmsvalue = wmsvalue;
    }

    public IsDiscontinue getIsDiscontinue() {
        return isDiscontinue;
    }

    public void setIsDiscontinue(IsDiscontinue isDiscontinue) {
        this.isDiscontinue = isDiscontinue;
    }

    @Override
    public String toString() {
        return "M_productDTO{" + "m_product_id=" + m_product_id + ", ad_client_id=" + ad_client_id + ", ad_org_id=" + ad_org_id + ", value=" + value + ", name=" + name + ", c_uom_id=" + c_uom_id + ", salesrep_id=" + salesrep_id + ", c_revenuerecognition_id=" + c_revenuerecognition_id + ", m_product_category_id=" + m_product_category_id + ", classification=" + classification + ", volume=" + volume + ", weight=" + weight + ", m_locator_id=" + m_locator_id + ", wmsvalue=" + wmsvalue + ", isDiscontinue=" + isDiscontinue + '}';
    }

}
