/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.altama.forecast.interfaces.web.facade.dto.c_elementvalue;

import java.math.BigDecimal;
import java.util.Date;

public class C_ElementvalueDTOBuilder {

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

    public C_ElementvalueDTOBuilder() {
    }

    public C_ElementvalueDTOBuilder setC_elementvalue_id(BigDecimal c_elementvalue_id) {
        this.c_elementvalue_id = c_elementvalue_id;
        return this;
    }

    public C_ElementvalueDTOBuilder setAd_client_id(BigDecimal ad_client_id) {
        this.ad_client_id = ad_client_id;
        return this;
    }

    public C_ElementvalueDTOBuilder setIsActive(String isActive) {
        this.isActive = isActive;
        return this;
    }

    public C_ElementvalueDTOBuilder setCreated(Date created) {
        this.created = created;
        return this;
    }

    public C_ElementvalueDTOBuilder setCreatedBy(BigDecimal createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public C_ElementvalueDTOBuilder setUpdated(Date updated) {
        this.updated = updated;
        return this;
    }

    public C_ElementvalueDTOBuilder setUpdatedBy(BigDecimal updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    public C_ElementvalueDTOBuilder setValue(String value) {
        this.value = value;
        return this;
    }

    public C_ElementvalueDTOBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public C_ElementvalueDTOBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public C_ElementvalueDTOBuilder setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }

    public C_ElementvalueDTOBuilder setAccountSign(String accountSign) {
        this.accountSign = accountSign;
        return this;
    }

    public C_ElementvalueDTOBuilder setIsDocControlled(String isDocControlled) {
        this.isDocControlled = isDocControlled;
        return this;
    }

    public C_ElementvalueDTOBuilder setC_element_id(BigDecimal c_element_id) {
        this.c_element_id = c_element_id;
        return this;
    }

    public C_ElementvalueDTOBuilder setIsSummary(String isSummary) {
        this.isSummary = isSummary;
        return this;
    }

    public C_ElementvalueDTOBuilder setValidFrom(Date validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    public C_ElementvalueDTOBuilder setValidTo(Date validTo) {
        this.validTo = validTo;
        return this;
    }

    public C_ElementvalueDTOBuilder setPostActual(String postActual) {
        this.postActual = postActual;
        return this;
    }

    public C_ElementvalueDTOBuilder setPostBudget(String postBudget) {
        this.postBudget = postBudget;
        return this;
    }

    public C_ElementvalueDTOBuilder setPostEncumBrance(String postEncumBrance) {
        this.postEncumBrance = postEncumBrance;
        return this;
    }

    public C_ElementvalueDTOBuilder setPoststatistical(String poststatistical) {
        this.poststatistical = poststatistical;
        return this;
    }

    public C_ElementvalueDTOBuilder setIsBankAccount(String isBankAccount) {
        this.isBankAccount = isBankAccount;
        return this;
    }

    public C_ElementvalueDTOBuilder setC_bankaccount_id(BigDecimal c_bankaccount_id) {
        this.c_bankaccount_id = c_bankaccount_id;
        return this;
    }

    public C_ElementvalueDTOBuilder setIsForeignCurrency(String isForeignCurrency) {
        this.isForeignCurrency = isForeignCurrency;
        return this;
    }

    public C_ElementvalueDTOBuilder setC_currency_id(BigDecimal c_currency_id) {
        this.c_currency_id = c_currency_id;
        return this;
    }

    public C_ElementvalueDTOBuilder setIsht(String isht) {
        this.isht = isht;
        return this;
    }

    public C_ElementvalueDTO createC_ElementvalueDTO() {
        return new C_ElementvalueDTO(c_elementvalue_id, ad_client_id, isActive, created, createdBy, updated, updatedBy, value, brand, description, accountType, accountSign, isDocControlled, c_element_id, isSummary, validFrom, validTo, postActual, postBudget, postEncumBrance, poststatistical, isBankAccount, c_bankaccount_id, isForeignCurrency, c_currency_id, isht);
    }

}
