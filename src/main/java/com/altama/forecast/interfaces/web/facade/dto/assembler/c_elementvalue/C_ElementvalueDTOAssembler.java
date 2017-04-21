package com.altama.forecast.interfaces.web.facade.dto.assembler.c_elementvalue;

import com.altama.forecast.domain.c_elementvalue.C_Elementvalue;
import com.altama.forecast.domain.c_elementvalue.C_ElementvalueBuilder;
import com.altama.forecast.interfaces.web.facade.dto.assembler.IObjectAssembler;
import com.altama.forecast.interfaces.web.facade.dto.c_elementvalue.C_ElementvalueDTO;
import com.altama.forecast.interfaces.web.facade.dto.c_elementvalue.C_ElementvalueDTOBuilder;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class C_ElementvalueDTOAssembler implements IObjectAssembler<C_Elementvalue, C_ElementvalueDTO> {

    @Override
    public C_ElementvalueDTO toDTO(C_Elementvalue domainObject) {
        return new C_ElementvalueDTOBuilder()
                .setC_elementvalue_id(domainObject.getC_elementvalue_id())
                .setAd_client_id(domainObject.getAd_client_id())
                .setIsActive(domainObject.getIsActive())
                .setCreated(domainObject.getCreated())
                .setCreatedBy(domainObject.getCreatedBy())
                .setUpdated(domainObject.getUpdated())
                .setUpdatedBy(domainObject.getUpdatedBy())
                .setValue(domainObject.getValue())
                .setBrand(domainObject.getBrand())
                .setDescription(domainObject.getDescription())
                .setAccountType(domainObject.getAccountType())
                .setAccountSign(domainObject.getAccountSign())
                .setIsDocControlled(domainObject.getIsDocControlled())
                .setC_element_id(domainObject.getC_element_id())
                .setIsSummary(domainObject.getIsSummary())
                .setValidFrom(domainObject.getValidFrom())
                .setValidTo(domainObject.getValidTo())
                .setPostActual(domainObject.getPostActual())
                .setPostBudget(domainObject.getPostBudget())
                .setPostEncumBrance(domainObject.getPostEncumBrance())
                .setPoststatistical(domainObject.getPoststatistical())
                .setIsBankAccount(domainObject.getIsBankAccount())
                .setC_bankaccount_id(domainObject.getC_bankaccount_id())
                .setIsForeignCurrency(domainObject.getIsForeignCurrency())
                .setC_currency_id(domainObject.getC_currency_id())
                .setIsht(domainObject.getIsht())
                .createC_ElementvalueDTO();

    }

    @Override
    public C_Elementvalue toDomain(C_ElementvalueDTO dtoObject) {
        return new C_ElementvalueBuilder()
                .setC_elementvalue_id(dtoObject.getC_elementvalue_id())
                .setAd_client_id(dtoObject.getAd_client_id())
                .setIsActive(dtoObject.getIsActive())
                .setCreated(dtoObject.getCreated())
                .setCreatedBy(dtoObject.getCreatedBy())
                .setUpdated(dtoObject.getUpdated())
                .setUpdatedBy(dtoObject.getUpdatedBy())
                .setValue(dtoObject.getValue())
                .setBrand(dtoObject.getBrand())
                .setDescription(dtoObject.getDescription())
                .setAccountType(dtoObject.getAccountType())
                .setAccountSign(dtoObject.getAccountSign())
                .setIsDocControlled(dtoObject.getIsDocControlled())
                .setC_element_id(dtoObject.getC_element_id())
                .setIsSummary(dtoObject.getIsSummary())
                .setValidFrom(dtoObject.getValidFrom())
                .setValidTo(dtoObject.getValidTo())
                .setPostActual(dtoObject.getPostActual())
                .setPostBudget(dtoObject.getPostBudget())
                .setPostEncumBrance(dtoObject.getPostEncumBrance())
                .setPoststatistical(dtoObject.getPoststatistical())
                .setIsBankAccount(dtoObject.getIsBankAccount())
                .setC_bankaccount_id(dtoObject.getC_bankaccount_id())
                .setIsForeignCurrency(dtoObject.getIsForeignCurrency())
                .setC_currency_id(dtoObject.getC_currency_id())
                .setIsht(dtoObject.getIsht())
                .createC_Elementvalue();

    }

    public List<C_Elementvalue> toDomain(List<C_ElementvalueDTO> arg0) {
        List<C_Elementvalue> res = new ArrayList<>();
        for (C_ElementvalueDTO t : arg0) {
            res.add(new C_ElementvalueDTOAssembler().toDomain(t));
        }
        return res;
    }

    public List<C_ElementvalueDTO> toDTO(List<C_Elementvalue> arg0) {
        List<C_ElementvalueDTO> res = new ArrayList<>();
        for (C_Elementvalue t : arg0) {
            res.add(this.toDTO(t));
        }
        return res;
    }

}
