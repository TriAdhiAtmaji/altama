package com.altama.forecast.interfaces.web.facade.dto.forecast;

import com.altama.forecast.domain.forecast.IsDiscontinued;
import java.io.Serializable;

/**
 *
 * @author 3AD
 */
public class ForecastDTO implements Serializable {

    private Double brandID;
    private String brand;
    private String product;
    private String suplier;
    private String factory;
    private IsDiscontinued isDiscontinued;
    private String priceVersion;
    private Double qtyAvalilable;
    private Double qtyAverage;
    private Double leadTime;
    private Double qtyBatasAtas;
    private Double qtyOnOrdered;
    private Double priceListJual;
    private Double currencyLastPCS;
    private Double priceListLastPCS;
    private Double moq;
    private Double qtyPCSperMasterBox;
    private Double rekomendasiQtyPO;
    private Double totalMasterBox;

    public ForecastDTO() {
    }

    public ForecastDTO(Double brandID, String brand, String product, String suplier, String factory, IsDiscontinued isDiscontinued, String priceVersion, Double qtyAvalilable, Double qtyAverage, Double leadTime, Double qtyBatasAtas, Double qtyOnOrdered, Double priceListJual, Double currencyLastPCS, Double priceListLastPCS, Double moq, Double qtyPCSperMasterBox, Double rekomendasiQtyPO, Double totalMasterBox) {
        this.brandID = brandID;
        this.brand = brand;
        this.product = product;
        this.suplier = suplier;
        this.factory = factory;
        this.isDiscontinued = isDiscontinued;
        this.priceVersion = priceVersion;
        this.qtyAvalilable = qtyAvalilable;
        this.qtyAverage = qtyAverage;
        this.leadTime = leadTime;
        this.qtyBatasAtas = qtyBatasAtas;
        this.qtyOnOrdered = qtyOnOrdered;
        this.priceListJual = priceListJual;
        this.currencyLastPCS = currencyLastPCS;
        this.priceListLastPCS = priceListLastPCS;
        this.moq = moq;
        this.qtyPCSperMasterBox = qtyPCSperMasterBox;
        this.rekomendasiQtyPO = rekomendasiQtyPO;
        this.totalMasterBox = totalMasterBox;
    }

    public Double getBrandID() {
        return brandID;
    }

    public void setBrandID(Double brandID) {
        this.brandID = brandID;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getSuplier() {
        return suplier;
    }

    public void setSuplier(String suplier) {
        this.suplier = suplier;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    public IsDiscontinued getIsDiscontinued() {
        return isDiscontinued;
    }

    public void setIsDiscontinued(IsDiscontinued isDiscontinued) {
        this.isDiscontinued = isDiscontinued;
    }

    public String getPriceVersion() {
        return priceVersion;
    }

    public void setPriceVersion(String priceVersion) {
        this.priceVersion = priceVersion;
    }

    public Double getQtyAvalilable() {
        return qtyAvalilable;
    }

    public void setQtyAvalilable(Double qtyAvalilable) {
        this.qtyAvalilable = qtyAvalilable;
    }

    public Double getQtyAverage() {
        return qtyAverage;
    }

    public void setQtyAverage(Double qtyAverage) {
        this.qtyAverage = qtyAverage;
    }

    public Double getLeadTime() {
        return leadTime;
    }

    public void setLeadTime(Double leadTime) {
        this.leadTime = leadTime;
    }

    public Double getQtyBatasAtas() {
        return qtyBatasAtas;
    }

    public void setQtyBatasAtas(Double qtyBatasAtas) {
        this.qtyBatasAtas = qtyBatasAtas;
    }

    public Double getQtyOnOrdered() {
        return qtyOnOrdered;
    }

    public void setQtyOnOrdered(Double qtyOnOrdered) {
        this.qtyOnOrdered = qtyOnOrdered;
    }

    public Double getPriceListJual() {
        return priceListJual;
    }

    public void setPriceListJual(Double priceListJual) {
        this.priceListJual = priceListJual;
    }

    public Double getCurrencyLastPCS() {
        return currencyLastPCS;
    }

    public void setCurrencyLastPCS(Double currencyLastPCS) {
        this.currencyLastPCS = currencyLastPCS;
    }

    public Double getPriceListLastPCS() {
        return priceListLastPCS;
    }

    public void setPriceListLastPCS(Double priceListLastPCS) {
        this.priceListLastPCS = priceListLastPCS;
    }

    public Double getMoq() {
        return moq;
    }

    public void setMoq(Double moq) {
        this.moq = moq;
    }

    public Double getQtyPCSperMasterBox() {
        return qtyPCSperMasterBox;
    }

    public void setQtyPCSperMasterBox(Double qtyPCSperMasterBox) {
        this.qtyPCSperMasterBox = qtyPCSperMasterBox;
    }

    public Double getRekomendasiQtyPO() {
        return rekomendasiQtyPO;
    }

    public void setRekomendasiQtyPO(Double rekomendasiQtyPO) {
        this.rekomendasiQtyPO = rekomendasiQtyPO;
    }

    public Double getTotalMasterBox() {
        return totalMasterBox;
    }

    public void setTotalMasterBox(Double totalMasterBox) {
        this.totalMasterBox = totalMasterBox;
    }

    @Override
    public String toString() {
        return "ForecastDTO{" + "brandID=" + brandID + ", brand=" + brand + ", product=" + product + ", suplier=" + suplier + ", factory=" + factory + ", isDiscontinued=" + isDiscontinued + ", priceVersion=" + priceVersion + ", qtyAvalilable=" + qtyAvalilable + ", qtyAverage=" + qtyAverage + ", leadTime=" + leadTime + ", qtyBatasAtas=" + qtyBatasAtas + ", qtyOnOrdered=" + qtyOnOrdered + ", priceListJual=" + priceListJual + ", currencyLastPCS=" + currencyLastPCS + ", priceListLastPCS=" + priceListLastPCS + ", moq=" + moq + ", qtyPCSperMasterBox=" + qtyPCSperMasterBox + ", rekomendasiQtyPO=" + rekomendasiQtyPO + ", totalMasterBox=" + totalMasterBox + '}';
    }

}
