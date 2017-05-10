package com.altama.forecast.interfaces.web.facade.dto.assembler.c_bpartner;

import com.altama.forecast.domain.c_bpartner.C_bpartner;
import com.altama.forecast.domain.c_bpartner.C_bpartnerBuilder;
import com.altama.forecast.interfaces.web.facade.dto.assembler.IObjectAssembler;
import com.altama.forecast.interfaces.web.facade.dto.c_bpartner.C_bpartnerDTO;
import com.altama.forecast.interfaces.web.facade.dto.c_bpartner.C_bpartnerDTOBuilder;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class C_bpartnerDTOAssembler implements IObjectAssembler<C_bpartner, C_bpartnerDTO> {

    @Override
    public C_bpartnerDTO toDTO(C_bpartner domainObject) {
        return new C_bpartnerDTOBuilder()
                .setAd_client_id(domainObject.getAd_client_id())
                .setAd_org_id(domainObject.getAd_org_id())
                .setBpartner_parent_id(domainObject.getBpartner_parent_id())
                .setC_bp_group_id(domainObject.getC_bp_group_id())
                .setC_bpartner_id(domainObject.getC_bpartner_id())
                .setC_dunning_id(domainObject.getC_dunning_id())
                .setC_greeting_id(domainObject.getC_greeting_id())
                .setC_invoiceschedule_id(domainObject.getC_invoiceschedule_id())
                .setC_paymentterm_id(domainObject.getC_paymentterm_id())
                .setDescription(domainObject.getDescription())
                .setDocumentcopies(domainObject.getDocumentcopies())
                .setIsvendor(domainObject.getIsvendor())
                .setM_discountschema_id(domainObject.getM_discountschema_id())
                .setM_pricelist_id(domainObject.getM_pricelist_id())
                .setSuplier(domainObject.getSuplier())
                .setSuplier2(domainObject.getSuplier2())
                .setPo_discountschema_id(domainObject.getPo_discountschema_id())
                .setPo_paymentterm_id(domainObject.getPo_paymentterm_id())
                .setPo_pricelist_id(domainObject.getPo_pricelist_id())
                .setSalesrep_id(domainObject.getSalesrep_id())
                .setSendemail(domainObject.getSendemail())
                .setValue(domainObject.getValue())
                .createC_bpartnerDTO();
    }

    @Override
    public C_bpartner toDomain(C_bpartnerDTO dtoObject) {
        return new C_bpartnerBuilder()
                .setAd_client_id(dtoObject.getAd_client_id())
                .setAd_org_id(dtoObject.getAd_org_id())
                .setBpartner_parent_id(dtoObject.getBpartner_parent_id())
                .setC_bp_group_id(dtoObject.getC_bp_group_id())
                .setC_bpartner_id(dtoObject.getC_bpartner_id())
                .setC_dunning_id(dtoObject.getC_dunning_id())
                .setC_greeting_id(dtoObject.getC_greeting_id())
                .setC_invoiceschedule_id(dtoObject.getC_invoiceschedule_id())
                .setC_paymentterm_id(dtoObject.getC_paymentterm_id())
                .setDescription(dtoObject.getDescription())
                .setDocumentcopies(dtoObject.getDocumentcopies())
                .setIsvendor(dtoObject.getIsvendor())
                .setM_discountschema_id(dtoObject.getM_discountschema_id())
                .setM_pricelist_id(dtoObject.getM_pricelist_id())
                .setSuplier(dtoObject.getSuplier())
                .setSuplier2(dtoObject.getSuplier2())
                .setPo_discountschema_id(dtoObject.getPo_discountschema_id())
                .setPo_paymentterm_id(dtoObject.getPo_paymentterm_id())
                .setPo_pricelist_id(dtoObject.getPo_pricelist_id())
                .setSalesrep_id(dtoObject.getSalesrep_id())
                .setSendemail(dtoObject.getSendemail())
                .setValue(dtoObject.getValue())
                .createC_bpartner();
    }

    public List<C_bpartner> toDomains(List<C_bpartnerDTO> arg0) {
        List<C_bpartner> res = new ArrayList<C_bpartner>();
        for (C_bpartnerDTO t : arg0) {
            res.add(new C_bpartnerDTOAssembler().toDomain(t));
        }
        return res;
    }

    public List<C_bpartnerDTO> toDTOs(List<C_bpartner> arg0) {
        List<C_bpartnerDTO> res = new ArrayList<C_bpartnerDTO>();
        for (C_bpartner t : arg0) {
            res.add(this.toDTO(t));
        }
        return res;
    }

}
