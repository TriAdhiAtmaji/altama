package com.altama.forecast.domain.c_elementvalue;

import com.altama.forecast.domain.shared.EntityObject;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author admin
 */
public class C_Elementvalue implements EntityObject<C_Elementvalue> {

    long id;

    private BigDecimal c_elementvalue_id;
    private BigDecimal ad_client_id;
    private String isActive;
    private Date created;
    private BigDecimal createdBy;
    private Date updated;
    private BigDecimal updatedBy;
    private String value;
    private String name;
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

    public C_Elementvalue() {
    }

    public C_Elementvalue(BigDecimal c_elementvalue_id, BigDecimal ad_client_id, String isActive, Date created, BigDecimal createdBy, Date updated, BigDecimal updatedBy, String value, String name, String description, String accountType, String accountSign, String isDocControlled, BigDecimal c_element_id, String isSummary, Date validFrom, Date validTo, String postActual, String postBudget, String postEncumBrance, String poststatistical, String isBankAccount, BigDecimal c_bankaccount_id, String isForeignCurrency, BigDecimal c_currency_id, String isht) {
        this.c_elementvalue_id = c_elementvalue_id;
        this.ad_client_id = ad_client_id;
        this.isActive = isActive;
        this.created = created;
        this.createdBy = createdBy;
        this.updated = updated;
        this.updatedBy = updatedBy;
        this.value = value;
        this.name = name;
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

    public void assignNEWc_elemenvalue(C_Elementvalue c_Elementvalue) {
        this.c_elementvalue_id = c_Elementvalue.c_elementvalue_id;
        this.ad_client_id = c_Elementvalue.ad_client_id;
        this.isActive = c_Elementvalue.isActive;
        this.created = c_Elementvalue.created;
        this.createdBy = c_Elementvalue.createdBy;
        this.updated = c_Elementvalue.updated;
        this.updatedBy = c_Elementvalue.updatedBy;
        this.value = c_Elementvalue.value;
        this.name = c_Elementvalue.name;
        this.description = c_Elementvalue.description;
        this.accountType = c_Elementvalue.accountType;
        this.accountSign = c_Elementvalue.accountSign;
        this.isDocControlled = c_Elementvalue.isDocControlled;
        this.c_element_id = c_Elementvalue.c_element_id;
        this.isSummary = c_Elementvalue.isSummary;
        this.validFrom = c_Elementvalue.validFrom;
        this.validTo = c_Elementvalue.validTo;
        this.postActual = c_Elementvalue.postActual;
        this.postBudget = c_Elementvalue.postBudget;
        this.postEncumBrance = c_Elementvalue.postEncumBrance;
        this.poststatistical = c_Elementvalue.poststatistical;
        this.isBankAccount = c_Elementvalue.isBankAccount;
        this.c_bankaccount_id = c_Elementvalue.c_bankaccount_id;
        this.isForeignCurrency = c_Elementvalue.isForeignCurrency;
        this.c_currency_id = c_Elementvalue.c_currency_id;
        this.isht = c_Elementvalue.isht;

    }

    public String getAccountSign() {
        return accountSign;
    }

    public void setAccountSign(String accountSign) {
        this.accountSign = accountSign;
    }

    public BigDecimal getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(BigDecimal updatedBy) {
        this.updatedBy = updatedBy;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.c_elementvalue_id);
        hash = 37 * hash + Objects.hashCode(this.ad_client_id);
        hash = 37 * hash + Objects.hashCode(this.isActive);
        hash = 37 * hash + Objects.hashCode(this.created);
        hash = 37 * hash + Objects.hashCode(this.createdBy);
        hash = 37 * hash + Objects.hashCode(this.updated);
        hash = 37 * hash + Objects.hashCode(this.updatedBy);
        hash = 37 * hash + Objects.hashCode(this.value);
        hash = 37 * hash + Objects.hashCode(this.name);
        hash = 37 * hash + Objects.hashCode(this.description);
        hash = 37 * hash + Objects.hashCode(this.accountType);
        hash = 37 * hash + Objects.hashCode(this.accountSign);
        hash = 37 * hash + Objects.hashCode(this.isDocControlled);
        hash = 37 * hash + Objects.hashCode(this.c_element_id);
        hash = 37 * hash + Objects.hashCode(this.isSummary);
        hash = 37 * hash + Objects.hashCode(this.validFrom);
        hash = 37 * hash + Objects.hashCode(this.validTo);
        hash = 37 * hash + Objects.hashCode(this.postActual);
        hash = 37 * hash + Objects.hashCode(this.postBudget);
        hash = 37 * hash + Objects.hashCode(this.postEncumBrance);
        hash = 37 * hash + Objects.hashCode(this.poststatistical);
        hash = 37 * hash + Objects.hashCode(this.isBankAccount);
        hash = 37 * hash + Objects.hashCode(this.c_bankaccount_id);
        hash = 37 * hash + Objects.hashCode(this.isForeignCurrency);
        hash = 37 * hash + Objects.hashCode(this.c_currency_id);
        hash = 37 * hash + Objects.hashCode(this.isht);
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
        final C_Elementvalue other = (C_Elementvalue) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

//    @Override
//    public boolean sameValueAs(C_Elementvalue other) {
//        return this.equals(other);
//    }

    @Override
    public boolean sameIdentityAs(C_Elementvalue other) {
        return this.equals(other);
    }

}
