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
                .setValue(domainObject.getValue())
                .setBrand(domainObject.getBrand())
                .setDescription(domainObject.getDescription())
                .setAd_treenodeu1(domainObject.getAd_treenodeu1())
                .createC_ElementvalueDTO();

    }

    @Override
    public C_Elementvalue toDomain(C_ElementvalueDTO dtoObject) {
        return new C_ElementvalueBuilder()
                .setC_elementvalue_id(dtoObject.getC_elementvalue_id())
                .setAd_client_id(dtoObject.getAd_client_id())
                .setValue(dtoObject.getValue())
                .setBrand(dtoObject.getBrand())
                .setDescription(dtoObject.getDescription())
                .setAd_treenodeu1(dtoObject.getAd_treenodeu1())
                .createC_Elementvalue();

    }

    public List<C_Elementvalue> toDomains(List<C_ElementvalueDTO> arg0) {
        List<C_Elementvalue> res = new ArrayList<>();
        for (C_ElementvalueDTO t : arg0) {
            res.add(new C_ElementvalueDTOAssembler().toDomain(t));
        }
        return res;
    }

    public List<C_ElementvalueDTO> toDTOs(List<C_Elementvalue> arg0) {
        List<C_ElementvalueDTO> res = new ArrayList<>();
        if (arg0 != null) {
            for (C_Elementvalue t : arg0) {
                res.add(new C_ElementvalueDTOAssembler().toDTO(t));
            }
        }
        return res;
    }

}
