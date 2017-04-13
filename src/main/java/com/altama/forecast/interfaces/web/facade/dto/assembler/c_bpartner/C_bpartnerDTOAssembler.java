package com.altama.forecast.interfaces.web.facade.dto.assembler.c_bpartner;

import com.altama.forecast.domain.c_bpartner.C_bpartner;
import com.altama.forecast.interfaces.web.facade.dto.assembler.IObjectAssembler;
import com.altama.forecast.interfaces.web.facade.dto.c_bpartner.C_bpartnerDTO;
import com.altama.forecast.interfaces.web.facade.dto.c_bpartner.C_bpartnerDTOBuilder;

/**
 *
 * @author admin
 */
public class C_bpartnerDTOAssembler implements IObjectAssembler<C_bpartner, C_bpartnerDTO> {

    @Override
    public C_bpartnerDTO toDTO(C_bpartner domainObject) {
        return new C_bpartnerDTOBuilder()
                .setAcqusitioncost(domainObject.getAcqusitioncost())
                .setActuallifetimevalue(domainObject.getActuallifetimevalue())
                .setAd_client_id(domainObject.getAd_client_id())
                .setAd_language(domainObject.getAd_language())
                .setAd_org_id(domainObject.getAd_org_id())
                .setAd_orgbp_id(domainObject.getAd_orgbp_id())
                .setAlias(domainObject.getAlias())
                .setBpartner_parent_id(domainObject.getBpartner_parent_id())
                .setC_bp_group_id(domainObject.getC_bp_group_id())
                .setC_bpartner_id(domainObject.getBpartner_parent_id())
                .setC_dunning_id(domainObject.getC_dunning_id())
                .setC_greeting_id(domainObject.getC_greeting_id())
                .setC_invoiceschedule_id(domainObject.getC_invoiceschedule_id())
                .setC_paymentterm_id(domainObject.getC_paymentterm_id())
                .setC_paymentterm_invoice_id(domainObject.getC_paymentterm_invoice_id())
                .setC_salesregion_id(domainObject.getC_salesregion_id())
                .setCreated(domainObject.getCreated())
                .setCreatedby(domainObject.getCreatedby())
                .createC_bpartnerDTO();
    }

    @Override
    public C_bpartner toDomain(C_bpartnerDTO dtoObject) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
