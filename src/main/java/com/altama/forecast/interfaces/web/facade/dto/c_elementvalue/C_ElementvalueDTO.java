package com.altama.forecast.interfaces.web.facade.dto.c_elementvalue;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author admin
 */
public class C_ElementvalueDTO implements Serializable {

    private BigDecimal c_elementvalue_id;
    private BigDecimal ad_client_id;
    private String isActive;
    private Date created;
    private BigDecimal createdBy;
    private Date updated;
    private BigDecimal updatedBy;
    private String value;
    private String brand;
    private String description;
    private String accountType;
    private String accountSign;
    private String isDocControlled;
    private BigDecimal c_element_id;
    private String isSummary;
    private Date validFrom;
    private Date validTo;
    private String postActual;
    private String postBudget;
    private String postEncumBrance;
    private String poststatistical;
    private String isBankAccount;
    private BigDecimal c_bankaccount_id;
    private String isForeignCurrency;
    private BigDecimal c_currency_id;
    private String isht;

    public C_ElementvalueDTO() {
    }

    public C_ElementvalueDTO(BigDecimal c_elementvalue_id, BigDecimal ad_client_id, String isActive, Date created, BigDecimal createdBy, Date updated, BigDecimal updatedBy, String value, String brand, String description, String accountType, String accountSign, String isDocControlled, BigDecimal c_element_id, String isSummary, Date validFrom, Date validTo, String postActual, String postBudget, String postEncumBrance, String poststatistical, String isBankAccount, BigDecimal c_bankaccount_id, String isForeignCurrency, BigDecimal c_currency_id, String isht) {
        this.c_elementvalue_id = c_elementvalue_id;
        this.ad_client_id = ad_client_id;
        this.isActive = isActive;
        this.created = created;
        this.createdBy = createdBy;
        this.updated = updated;
        this.updatedBy = updatedBy;
        this.value = value;
        this.brand = brand;
        this.description = description;
        this.accountType = accountType;
        this.accountSign = accountSign;
        this.isDocControlled = isDocControlled;
        this.c_element_id = c_element_id;
        this.isSummary = isSummary;
        this.validFrom = validFrom;
        this.validTo = validTo;
        this.postActual = postActual;
        this.postBudget = postBudget;
        this.postEncumBrance = postEncumBrance;
        this.poststatistical = poststatistical;
        this.isBankAccount = isBankAccount;
        this.c_bankaccount_id = c_bankaccount_id;
        this.isForeignCurrency = isForeignCurrency;
        this.c_currency_id = c_currency_id;
        this.isht = isht;
    }

    public String getAccountSign() {
        return accountSign;
    }

    public void setAccountSign(String accountSign) {
        this.accountSign = accountSign;
    }

    public BigDecimal getC_elementvalue_id() {
        return c_elementvalue_id;
    }

    public void setC_elementvalue_id(BigDecimal c_elementvalue_id) {
        this.c_elementvalue_id = c_elementvalue_id;
    }

    public BigDecimal getAd_client_id() {
        return ad_client_id;
    }

    public void setAd_client_id(BigDecimal ad_client_id) {
        this.ad_client_id = ad_client_id;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public BigDecimal getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(BigDecimal createdBy) {
        this.createdBy = createdBy;
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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getIsDocControlled() {
        return isDocControlled;
    }

    public void setIsDocControlled(String isDocControlled) {
        this.isDocControlled = isDocControlled;
    }

    public BigDecimal getC_element_id() {
        return c_element_id;
    }

    public void setC_element_id(BigDecimal c_element_id) {
        this.c_element_id = c_element_id;
    }

    public String getIsSummary() {
        return isSummary;
    }

    public void setIsSummary(String isSummary) {
        this.isSummary = isSummary;
    }

    public Date getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(Date validFrom) {
        this.validFrom = validFrom;
    }

    public Date getValidTo() {
        return validTo;
    }

    public void setValidTo(Date validTo) {
        this.validTo = validTo;
    }

    public String getPostActual() {
        return postActual;
    }

    public void setPostActual(String postActual) {
        this.postActual = postActual;
    }

    public String getPostBudget() {
        return postBudget;
    }

    public void setPostBudget(String postBudget) {
        this.postBudget = postBudget;
    }

    public String getPostEncumBrance() {
        return postEncumBrance;
    }

    public void setPostEncumBrance(String postEncumBrance) {
        this.postEncumBrance = postEncumBrance;
    }

    public String getPoststatistical() {
        return poststatistical;
    }

    public void setPoststatistical(String poststatistical) {
        this.poststatistical = poststatistical;
    }

    public String getIsBankAccount() {
        return isBankAccount;
    }

    public void setIsBankAccount(String isBankAccount) {
        this.isBankAccount = isBankAccount;
    }

    public BigDecimal getC_bankaccount_id() {
        return c_bankaccount_id;
    }

    public void setC_bankaccount_id(BigDecimal c_bankaccount_id) {
        this.c_bankaccount_id = c_bankaccount_id;
    }

    public String getIsForeignCurrency() {
        return isForeignCurrency;
    }

    public void setIsForeignCurrency(String isForeignCurrency) {
        this.isForeignCurrency = isForeignCurrency;
    }

    public BigDecimal getC_currency_id() {
        return c_currency_id;
    }

    public void setC_currency_id(BigDecimal c_currency_id) {
        this.c_currency_id = c_currency_id;
    }

    public String getIsht() {
        return isht;
    }

    public void setIsht(String isht) {
        this.isht = isht;
    }

    @Override
    public String toString() {
        return "C_ElementvalueDTO{" + "c_elementvalue_id=" + c_elementvalue_id + ", ad_client_id=" + ad_client_id + ", isActive=" + isActive + ", created=" + created + ", createdBy=" + createdBy + ", updated=" + updated + ", updatedBy=" + updatedBy + ", value=" + value + ", brand=" + brand + ", description=" + description + ", accountType=" + accountType + ", accountSign=" + accountSign + ", isDocControlled=" + isDocControlled + ", c_element_id=" + c_element_id + ", isSummary=" + isSummary + ", validFrom=" + validFrom + ", validTo=" + validTo + ", postActual=" + postActual + ", postBudget=" + postBudget + ", postEncumBrance=" + postEncumBrance + ", poststatistical=" + poststatistical + ", isBankAccount=" + isBankAccount + ", c_bankaccount_id=" + c_bankaccount_id + ", isForeignCurrency=" + isForeignCurrency + ", c_currency_id=" + c_currency_id + ", isht=" + isht + '}';
    }

}
