package com.altama.forecast.interfaces.web.facade.dto.forecastRecomendDTO;

import com.altama.forecast.domain.m_product.IsDiscontinue;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

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
    private String supplier;
    private String factory;
    private String barcode;
    private String itemCode;
    private String productEnglish;
    private String product;
    private BigDecimal qtyAvailable;
    private BigDecimal qtyAverage;
    private BigDecimal leadTime;
    private BigDecimal qtyBatasAtas;
    private BigDecimal qtyOnOrdered;
    private BigDecimal priceListJual;
    private BigDecimal priceListLastPO;
    private String currencyListPO;
    private BigDecimal moq;
    private BigDecimal qtyPcsPerMasterBox;
    private BigDecimal recomendQtyPOPcs;
    private BigDecimal totalMasterBox;
    private IsDiscontinue isDiscontinue;
    private final BigDecimal ZERO = new BigDecimal(0);
    private DecimalFormat df = new DecimalFormat("#,##0.00");

    public ForecastRecomendDTO() {
    }

    public ForecastRecomendDTO(BigDecimal m_product_id, BigDecimal c_bpartner_id, BigDecimal c_elementvalue_id, BigDecimal z_m_factory_id, BigDecimal m_pricelist_version_id, String supplier, String factory, String barcode, String itemCode, String productEnglish, String product, BigDecimal qtyAvailable, BigDecimal qtyAverage, BigDecimal leadTime, BigDecimal qtyBatasAtas, BigDecimal qtyOnOrdered, BigDecimal priceListJual, BigDecimal priceListLastPO, String currencyListPO, BigDecimal moq, BigDecimal qtyPcsPerMasterBox, BigDecimal recomendQtyPOPcs, BigDecimal totalMasterBox, IsDiscontinue isDiscontinue) {
        this.m_product_id = m_product_id;
        this.c_bpartner_id = c_bpartner_id;
        this.c_elementvalue_id = c_elementvalue_id;
        this.z_m_factory_id = z_m_factory_id;
        this.m_pricelist_version_id = m_pricelist_version_id;
        this.supplier = supplier;
        this.factory = factory;
        this.barcode = barcode;
        this.itemCode = itemCode;
        this.productEnglish = productEnglish;
        this.product = product;
        this.qtyAvailable = qtyAvailable;
        this.qtyAverage = qtyAverage;
        this.leadTime = leadTime;
        this.qtyBatasAtas = qtyBatasAtas;
        this.qtyOnOrdered = qtyOnOrdered;
        this.priceListJual = priceListJual;
        this.priceListLastPO = priceListLastPO;
        this.currencyListPO = currencyListPO;
        this.moq = moq;
        this.qtyPcsPerMasterBox = qtyPcsPerMasterBox;
        this.recomendQtyPOPcs = recomendQtyPOPcs;
        this.totalMasterBox = totalMasterBox;
        this.isDiscontinue = isDiscontinue;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getProductEnglish() {
        return productEnglish;
    }

    public void setProductEnglish(String productEnglish) {
        this.productEnglish = productEnglish;
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
        if (qtyAvailable == null) {
            return ZERO;
        } else {
            return qtyAvailable.setScale(2, RoundingMode.HALF_UP);
        }

    }

    public void setQtyAvailable(BigDecimal qtyAvailable) {
        this.qtyAvailable = qtyAvailable;
    }

    public BigDecimal getQtyAverage() {
        if (qtyAverage == null) {
            return ZERO;
        } else {
            return qtyAverage.setScale(2, RoundingMode.HALF_UP);
        }
    }

    public void setQtyAverage(BigDecimal qtyAverage) {
        this.qtyAverage = qtyAverage;
    }

    public BigDecimal getLeadTime() {
        if (leadTime == null) {
            return ZERO;
        } else {
            return leadTime.setScale(2, RoundingMode.HALF_UP);
        }

    }

    public void setLeadTime(BigDecimal leadTime) {
        this.leadTime = leadTime;
    }

    public BigDecimal getQtyBatasAtas() {
        if (qtyBatasAtas == null) {
            return ZERO;
        } else {
            return qtyBatasAtas.setScale(2, RoundingMode.HALF_UP);
        }
    }

    public void setQtyBatasAtas(BigDecimal qtyBatasAtas) {
        this.qtyBatasAtas = qtyBatasAtas;
    }

    public BigDecimal getQtyOnOrdered() {
        if (qtyOnOrdered == null) {
            return ZERO;
        } else {
            return qtyOnOrdered.setScale(2, RoundingMode.HALF_UP);
        }

    }

    public void setQtyOnOrdered(BigDecimal qtyOnOrdered) {
        this.qtyOnOrdered = qtyOnOrdered;
    }

    public BigDecimal getPriceListJual() {
        if (priceListJual == null) {
            return ZERO;
        } else {
            return priceListJual.setScale(2, RoundingMode.HALF_UP);
        }

    }

    public void setPriceListJual(BigDecimal priceListJual) {
        this.priceListJual = priceListJual;
    }

    public BigDecimal getPriceListLastPO() {
        if (priceListLastPO == null) {
            return ZERO;
        } else {
            return priceListLastPO.setScale(2, RoundingMode.HALF_UP);
        }

    }

    public void setPriceListLastPO(BigDecimal priceListLastPO) {
        this.priceListLastPO = priceListLastPO;
    }

    public String getCurrencyListPO() {
        return currencyListPO;
    }

    public void setCurrencyListPO(String currencyListPO) {
        this.currencyListPO = currencyListPO;
    }

    public BigDecimal getMoq() {
        if (moq == null) {
            return ZERO;
        }
        return moq.setScale(2, RoundingMode.HALF_UP);
    }

    public void setMoq(BigDecimal moq) {
        this.moq = moq;
    }

    public BigDecimal getQtyPcsPerMasterBox() {
        if (qtyPcsPerMasterBox == null) {
            return ZERO;
        } else {
            return qtyPcsPerMasterBox.setScale(2, RoundingMode.HALF_UP);
        }

    }

    public void setQtyPcsPerMasterBox(BigDecimal qtyPcsPerMasterBox) {
        this.qtyPcsPerMasterBox = qtyPcsPerMasterBox;
    }

    public BigDecimal getRecomendQtyPOPcs() {
        if (recomendQtyPOPcs == null) {
            return ZERO;
        } else {
            return recomendQtyPOPcs.setScale(2, RoundingMode.HALF_UP);
        }

    }

    public void setRecomendQtyPOPcs(BigDecimal recomendQtyPOPcs) {
        this.recomendQtyPOPcs = recomendQtyPOPcs;
    }

    public BigDecimal getTotalMasterBox() {
        if (totalMasterBox == null) {
            return ZERO;
        } else {
            return totalMasterBox.setScale(2, RoundingMode.HALF_UP);
        }

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
        return "ForecastRecomendDTO{" + "m_product_id=" + m_product_id + ", c_bpartner_id=" + c_bpartner_id + ", c_elementvalue_id=" + c_elementvalue_id + ", z_m_factory_id=" + z_m_factory_id + ", m_pricelist_version_id=" + m_pricelist_version_id + ", supplier=" + supplier + ", factory=" + factory + ", barcode=" + barcode + ", itemCode=" + itemCode + ", productEnglish=" + productEnglish + ", product=" + product + ", qtyAvailable=" + qtyAvailable + ", qtyAverage=" + qtyAverage + ", leadTime=" + leadTime + ", qtyBatasAtas=" + qtyBatasAtas + ", qtyOnOrdered=" + qtyOnOrdered + ", priceListJual=" + priceListJual + ", priceListLastPO=" + priceListLastPO + ", currencyListPO=" + currencyListPO + ", moq=" + moq + ", qtyPcsPerMasterBox=" + qtyPcsPerMasterBox + ", recomendQtyPOPcs=" + recomendQtyPOPcs + ", totalMasterBox=" + totalMasterBox + ", isDiscontinue=" + isDiscontinue + ", ZERO=" + ZERO + '}';
    }

}
