package com.altama.forecast.domain.forecastrecomend;

import com.altama.forecast.domain.m_product.IsDiscontinue;
import com.altama.forecast.domain.shared.EntityObject;
import java.math.BigDecimal;
import java.util.Objects;

/**
 *
 * @author admin
 */
public class ForecastRecomend implements EntityObject<ForecastRecomend> {

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

    public ForecastRecomend() {
    }

    public ForecastRecomend(BigDecimal m_product_id, BigDecimal c_bpartner_id, BigDecimal c_elementvalue_id, BigDecimal z_m_factory_id, BigDecimal m_pricelist_version_id, String product, BigDecimal qtyAvailable, BigDecimal qtyAverage, BigDecimal leadTime, BigDecimal qtyBatasAtas, BigDecimal qtyOnOrdered, BigDecimal priceListJual, BigDecimal currencyListPO, String priceListLastPO, BigDecimal moq, BigDecimal qtyPcsPerMasterBox, BigDecimal recomendQtyPOPcs, BigDecimal totalMasterBox, IsDiscontinue isDiscontinue) {
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
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.c_bpartner_id);
        hash = 19 * hash + Objects.hashCode(this.c_elementvalue_id);
        hash = 19 * hash + Objects.hashCode(this.z_m_factory_id);
        hash = 19 * hash + Objects.hashCode(this.m_pricelist_version_id);
        hash = 19 * hash + Objects.hashCode(this.product);
        hash = 19 * hash + Objects.hashCode(this.qtyAvailable);
        hash = 19 * hash + Objects.hashCode(this.qtyAverage);
        hash = 19 * hash + Objects.hashCode(this.leadTime);
        hash = 19 * hash + Objects.hashCode(this.qtyBatasAtas);
        hash = 19 * hash + Objects.hashCode(this.qtyOnOrdered);
        hash = 19 * hash + Objects.hashCode(this.priceListJual);
        hash = 19 * hash + Objects.hashCode(this.currencyListPO);
        hash = 19 * hash + Objects.hashCode(this.priceListLastPO);
        hash = 19 * hash + Objects.hashCode(this.moq);
        hash = 19 * hash + Objects.hashCode(this.qtyPcsPerMasterBox);
        hash = 19 * hash + Objects.hashCode(this.recomendQtyPOPcs);
        hash = 19 * hash + Objects.hashCode(this.totalMasterBox);
        hash = 19 * hash + Objects.hashCode(this.isDiscontinue);
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
        final ForecastRecomend other = (ForecastRecomend) obj;
        if (!Objects.equals(this.m_product_id, other.m_product_id)) {
            return false;
        }
        return true;
    }

    @Override
    public boolean sameIdentityAs(ForecastRecomend other) {
        return this.equals(other);
    }

}
