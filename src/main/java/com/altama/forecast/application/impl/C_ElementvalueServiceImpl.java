package com.altama.forecast.application.impl;

import com.altama.forecast.application.C_ElementvalueService;
import com.altama.forecast.domain.c_elementvalue.C_Elementvalue;
import com.altama.forecast.domain.c_elementvalue.C_ElementvalueBuilder;
import com.altama.forecast.domain.c_elementvalue.C_ElementvalueRepository;
import com.altama.forecast.interfaces.web.facade.dto.assembler.c_elementvalue.C_ElementvalueDTOAssembler;
import com.altama.forecast.interfaces.web.facade.dto.c_elementvalue.C_ElementvalueDTO;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang.Validate;

/**
 *
 * @author admin
 */
public class C_ElementvalueServiceImpl implements C_ElementvalueService {

    private C_ElementvalueRepository c_ElementvalueRepository;
    private C_ElementvalueDTOAssembler c_ElementvalueDTOAssembler;

    public void setC_ElementvalueRepository(C_ElementvalueRepository c_ElementvalueRepository) {
        this.c_ElementvalueRepository = c_ElementvalueRepository;
    }

    public void setC_ElementvalueDTOAssembler(C_ElementvalueDTOAssembler c_ElementvalueDTOAssembler) {
        this.c_ElementvalueDTOAssembler = c_ElementvalueDTOAssembler;
    }

    @Override
    public void saveC_Element(C_ElementvalueDTO c_Elementvalue) {
        C_Elementvalue ad = c_ElementvalueRepository.findByID(c_Elementvalue.getC_elementvalue_id());
        if (ad == null) {
            ad = c_ElementvalueDTOAssembler.toDomain(c_Elementvalue);
        } else {
            /* update specification */
            ad.assignNEWc_elemenvalue(c_ElementvalueDTOAssembler.toDomain(c_Elementvalue));
        }
        c_ElementvalueRepository.saveOrUpdate(ad);
    }

    @Override
    public void delete(C_ElementvalueDTO c_Elementvalue) {
        C_Elementvalue t = c_ElementvalueDTOAssembler.toDomain(c_Elementvalue);
        c_ElementvalueRepository.deleteData(t);
    }

    @Override
    public C_ElementvalueDTO getDummy() {
        C_Elementvalue c_Elementvalue = new C_ElementvalueBuilder()
                .setC_elementvalue_id(BigDecimal.valueOf(1))
                .setAd_client_id(BigDecimal.valueOf(12))
                .setIsActive("Aw")
                .setCreated(new Date())
                .setCreatedBy(BigDecimal.valueOf(12))
                .setUpdated(new Date())
                .setUpdatedBy(BigDecimal.valueOf(12))
                .setValue("h")
                .setBrand("Tekiro")
                .setDescription("ak")
                .setAccountType("y")
                .setAccountSign("b")
                .setIsDocControlled("e")
                .setC_element_id(BigDecimal.valueOf(3))
                .setIsSummary("ba")
                .setValidFrom(new Date())
                .setValidTo(new Date())
                .setPostActual("ok")
                .setPostBudget("goo")
                .setPostEncumBrance("nice")
                .setPoststatistical("oh")
                .setIsBankAccount("noce")
                .setC_bankaccount_id(BigDecimal.valueOf(12))
                .setIsForeignCurrency("asa")
                .setC_currency_id(BigDecimal.TEN)
                .setIsht("ok")
                .createC_Elementvalue();
        return c_ElementvalueDTOAssembler.toDTO(c_Elementvalue);
    }

    @Override
    public C_ElementvalueDTO findByID(BigDecimal c_elementvalue_id) {
        Validate.notNull(c_ElementvalueRepository);
        C_Elementvalue b = (C_Elementvalue) c_ElementvalueRepository.findByID(c_elementvalue_id);
        if (b != null) {
            return c_ElementvalueDTOAssembler.toDTO(b);
        }
        return null;
    }

    @Override
    public List<C_ElementvalueDTO> findAll() {
        Validate.notNull(c_ElementvalueRepository);
        return (List<C_ElementvalueDTO>) c_ElementvalueDTOAssembler.toDTO((List<C_Elementvalue>) c_ElementvalueRepository.findAll());
    }

    @Override
    public List<C_ElementvalueDTO> findByParams(Map map) {
        Validate.notNull(c_ElementvalueRepository);
        List<C_Elementvalue> listC_Element = c_ElementvalueRepository.findByParams(map);
        if (listC_Element != null) {
            return (List<C_ElementvalueDTO>) c_ElementvalueDTOAssembler.toDTO(listC_Element);
        }
        return null;
    }

}
