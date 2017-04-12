/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.altama.forecast.domain.c_elementvalue;

import java.math.BigDecimal;
import java.util.Date;

public class C_ElementvalueBuilder {

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

    public C_ElementvalueBuilder() {
    }

    public C_ElementvalueBuilder setC_elementvalue_id(BigDecimal c_elementvalue_id) {
        this.c_elementvalue_id = c_elementvalue_id;
        return this;
    }

    public C_ElementvalueBuilder setAd_client_id(BigDecimal ad_client_id) {
        this.ad_client_id = ad_client_id;
        return this;
    }

    public C_ElementvalueBuilder setIsActive(String isActive) {
        this.isActive = isActive;
        return this;
    }

    public C_ElementvalueBuilder setCreated(Date created) {
        this.created = created;
        return this;
    }

    public C_ElementvalueBuilder setCreatedBy(BigDecimal createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public C_ElementvalueBuilder setUpdated(Date updated) {
        this.updated = updated;
        return this;
    }

    public C_ElementvalueBuilder setUpdatedBy(BigDecimal updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    public C_ElementvalueBuilder setValue(String value) {
        this.value = value;
        return this;
    }

    public C_ElementvalueBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public C_ElementvalueBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public C_ElementvalueBuilder setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }

    public C_ElementvalueBuilder setAccountSign(String accountSign) {
        this.accountSign = accountSign;
        return this;
    }

    public C_ElementvalueBuilder setIsDocControlled(String isDocControlled) {
        this.isDocControlled = isDocControlled;
        return this;
    }

    public C_ElementvalueBuilder setC_element_id(BigDecimal c_element_id) {
        this.c_element_id = c_element_id;
        return this;
    }

    public C_ElementvalueBuilder setIsSummary(String isSummary) {
        this.isSummary = isSummary;
        return this;
    }

    public C_ElementvalueBuilder setValidFrom(Date validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    public C_ElementvalueBuilder setValidTo(Date validTo) {
        this.validTo = validTo;
        return this;
    }

    public C_ElementvalueBuilder setPostActual(String postActual) {
        this.postActual = postActual;
        return this;
    }

    public C_ElementvalueBuilder setPostBudget(String postBudget) {
        this.postBudget = postBudget;
        return this;
    }

    public C_ElementvalueBuilder setPostEncumBrance(String postEncumBrance) {
        this.postEncumBrance = postEncumBrance;
        return this;
    }

    public C_ElementvalueBuilder setPoststatistical(String poststatistical) {
        this.poststatistical = poststatistical;
        return this;
    }

    public C_ElementvalueBuilder setIsBankAccount(String isBankAccount) {
        this.isBankAccount = isBankAccount;
        return this;
    }

    public C_ElementvalueBuilder setC_bankaccount_id(BigDecimal c_bankaccount_id) {
        this.c_bankaccount_id = c_bankaccount_id;
        return this;
    }

    public C_ElementvalueBuilder setIsForeignCurrency(String isForeignCurrency) {
        this.isForeignCurrency = isForeignCurrency;
        return this;
    }

    public C_ElementvalueBuilder setC_currency_id(BigDecimal c_currency_id) {
        this.c_currency_id = c_currency_id;
        return this;
    }

    public C_ElementvalueBuilder setIsht(String isht) {
        this.isht = isht;
        return this;
    }

    public C_Elementvalue createC_Elementvalue() {
        return new C_Elementvalue(c_elementvalue_id, ad_client_id, isActive, created, createdBy, updated, updatedBy, value, name, description, accountType, accountSign, isDocControlled, c_element_id, isSummary, validFrom, validTo, postActual, postBudget, postEncumBrance, poststatistical, isBankAccount, c_bankaccount_id, isForeignCurrency, c_currency_id, isht);
    }

}
