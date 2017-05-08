package com.altama.forecast.interfaces.web.facade.dto.forecastRecomendDTO;

import com.altama.forecast.domain.m_product.IsDiscontinue;
import java.math.BigDecimal;

/**
 *
 * @author admin
 */
public class ForecastRecomendDTO {

    private BigDecimal m_product_id;
    private BigDecimal c_bpartner_id;
    private BigDecimal c_elementvalue_id;
    private BigDecimal z_m_factory_id;
    private BigDecimal m_pricelist_version_id;
    private String product;
    private BigDecimal qtyAvailable;
    private BigDecimal qtyAverage;
    private BigDecimal leadTime;
    private BigDecimal qtyBatasAtas;
    private BigDecimal qtyOnOrdered;
    private BigDecimal priceListJual;
    private BigDecimal currencyListPO;
    private String priceListLastPO;
    private BigDecimal moq;
    private BigDecimal qtyPcsPerMasterBox;
    private BigDecimal recomendQtyPOPcs;
    private BigDecimal totalMasterBox;
    private IsDiscontinue isDiscontinue;

    public ForecastRecomendDTO() {
    }

    public ForecastRecomendDTO(BigDecimal m_product_id, BigDecimal c_bpartner_id, BigDecimal c_elementvalue_id, BigDecimal z_m_factory_id, BigDecimal m_pricelist_version_id, String product, BigDecimal qtyAvailable, BigDecimal qtyAverage, BigDecimal leadTime, BigDecimal qtyBatasAtas, BigDecimal qtyOnOrdered, BigDecimal priceListJual, BigDecimal currencyListPO, String priceListLastPO, BigDecimal moq, BigDecimal qtyPcsPerMasterBox, BigDecimal recomendQtyPOPcs, BigDecimal totalMasterBox, IsDiscontinue isDiscontinue) {
        this.m_product_id = m_product_id;
        this.c_bpartner_id = c_bpartner_id;
        this.c_elementvalue_id = c_elementvalue_id;
        this.z_m_factory_id = z_m_factory_id;
        this.m_pricelist_version_id = m_pricelist_version_id;
        this.product = product;
        this.qtyAvailable = qtyAvailable;
        this.qtyAverage = qtyAverage;
        this.leadTime = leadTime;
        this.qtyBatasAtas = qtyBatasAtas;
        this.qtyOnOrdered = qtyOnOrdered;
        this.priceListJual = priceListJual;
        this.currencyListPO = currencyListPO;
        this.priceListLastPO = priceListLastPO;
        this.moq = moq;
        this.qtyPcsPerMasterBox = qtyPcsPerMasterBox;
        this.recomendQtyPOPcs = recomendQtyPOPcs;
        this.totalMasterBox = totalMasterBox;
        this.isDiscontinue = isDiscontinue;
    }

    public BigDecimal getM_product_id() {
        return m_product_id;
    }

    public void setM_product_id(BigDecimal m_product_id) {
        this.m_product_id = m_product_id;
    }

    public BigDecimal getC_bpartner_id() {
        return c_bpartner_id;
    }

    public void setC_bpartner_id(BigDecimal c_bpartner_id) {
        this.c_bpartner_id = c_bpartner_id;
    }

    public BigDecimal getC_elementvalue_id() {
        return c_elementvalue_id;
    }

    public void setC_elementvalue_id(BigDecimal c_elementvalue_id) {
        this.c_elementvalue_id = c_elementvalue_id;
    }

    public BigDecimal getZ_m_factory_id() {
        return z_m_factory_id;
    }

    public void setZ_m_factory_id(BigDecimal z_m_factory_id) {
        this.z_m_factory_id = z_m_factory_id;
    }

    public BigDecimal getM_pricelist_version_id() {
        return m_pricelist_version_id;
    }

    public void setM_pricelist_version_id(BigDecimal m_pricelist_version_id) {
        this.m_pricelist_version_id = m_pricelist_version_id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public BigDecimal getQtyAvailable() {
        return qtyAvailable;
    }

    public void setQtyAvailable(BigDecimal qtyAvailable) {
        this.qtyAvailable = qtyAvailable;
    }

    public BigDecimal getQtyAverage() {
        return qtyAverage;
    }

    public void setQtyAverage(BigDecimal qtyAverage) {
        this.qtyAverage = qtyAverage;
    }

    public BigDecimal getLeadTime() {
        return leadTime;
    }

    public void setLeadTime(BigDecimal leadTime) {
        this.leadTime = leadTime;
    }

    public BigDecimal getQtyBatasAtas() {
        return qtyBatasAtas;
    }

    public void setQtyBatasAtas(BigDecimal qtyBatasAtas) {
        this.qtyBatasAtas = qtyBatasAtas;
    }

    public BigDecimal getQtyOnOrdered() {
        return qtyOnOrdered;
    }

    public void setQtyOnOrdered(BigDecimal qtyOnOrdered) {
        this.qtyOnOrdered = qtyOnOrdered;
    }

    public BigDecimal getPriceListJual() {
        return priceListJual;
    }

    public void setPriceListJual(BigDecimal priceListJual) {
        this.priceListJual = priceListJual;
    }

    public BigDecimal getCurrencyListPO() {
        return currencyListPO;
    }

    public void setCurrencyListPO(BigDecimal currencyListPO) {
        this.currencyListPO = currencyListPO;
    }

    public String getPriceListLastPO() {
        return priceListLastPO;
    }

    public void setPriceListLastPO(String priceListLastPO) {
        this.priceListLastPO = priceListLastPO;
    }

    public BigDecimal getMoq() {
        return moq;
    }

    public void setMoq(BigDecimal moq) {
        this.moq = moq;
    }

    public BigDecimal getQtyPcsPerMasterBox() {
        return qtyPcsPerMasterBox;
    }

    public void setQtyPcsPerMasterBox(BigDecimal qtyPcsPerMasterBox) {
        this.qtyPcsPerMasterBox = qtyPcsPerMasterBox;
    }

    public BigDecimal getRecomendQtyPOPcs() {
        return recomendQtyPOPcs;
    }

    public void setRecomendQtyPOPcs(BigDecimal recomendQtyPOPcs) {
        this.recomendQtyPOPcs = recomendQtyPOPcs;
    }

    public BigDecimal getTotalMasterBox() {
        return totalMasterBox;
    }

    public void setTotalMasterBox(BigDecimal totalMasterBox) {
        this.totalMasterBox = totalMasterBox;
    }

    public IsDiscontinue getIsDiscontinue() {
        return isDiscontinue;
    }

    public void setIsDiscontinue(IsDiscontinue isDiscontinue) {
        this.isDiscontinue = isDiscontinue;
    }

    @Override
    public String toString() {
        return "ForecastRecomendDTO{" + "m_product_id=" + m_product_id + ", c_bpartner_id=" + c_bpartner_id + ", c_elementvalue_id=" + c_elementvalue_id + ", z_m_factory_id=" + z_m_factory_id + ", m_pricelist_version_id=" + m_pricelist_version_id + ", product=" + product + ", qtyAvailable=" + qtyAvailable + ", qtyAverage=" + qtyAverage + ", leadTime=" + leadTime + ", qtyBatasAtas=" + qtyBatasAtas + ", qtyOnOrdered=" + qtyOnOrdered + ", priceListJual=" + priceListJual + ", currencyListPO=" + currencyListPO + ", priceListLastPO=" + priceListLastPO + ", moq=" + moq + ", qtyPcsPerMasterBox=" + qtyPcsPerMasterBox + ", recomendQtyPOPcs=" + recomendQtyPOPcs + ", totalMasterBox=" + totalMasterBox + ", isDiscontinue=" + isDiscontinue + '}';
    }

}
