package com.altama.forecast.interfaces.web.facade.dto.assembler.m_product;

import com.altama.forecast.domain.m_product.M_product;
import com.altama.forecast.domain.m_product.M_productBuilder;
import com.altama.forecast.interfaces.web.facade.dto.assembler.IObjectAssembler;
import com.altama.forecast.interfaces.web.facade.dto.m_productDTO.M_productDTO;
import com.altama.forecast.interfaces.web.facade.dto.m_productDTO.M_productDTOBuilder;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class M_productDTOAssembler implements IObjectAssembler<M_product, M_productDTO> {

    @Override
    public M_productDTO toDTO(M_product domainObject) {
        return new M_productDTOBuilder()
                .setM_product_id(domainObject.getM_product_id())
                .setAd_client_id(domainObject.getAd_client_id())
                .setAd_org_id(domainObject.getAd_org_id())
                .setValue(domainObject.getValue())
                .setName(domainObject.getName())
                .setC_uom_id(domainObject.getC_uom_id())
                .setSalesrep_id(domainObject.getSalesrep_id())
                .setC_revenuerecognition_id(domainObject.getC_revenuerecognition_id())
                .setM_product_category_id(domainObject.getM_product_category_id())
                .setClassification(domainObject.getClassification())
                .setVolume(domainObject.getVolume())
                .setWeight(domainObject.getWeight())
                .setM_locator_id(domainObject.getM_locator_id())
                .setWmsvalue(domainObject.getWmsvalue())
                .setIsDiscontinue(domainObject.getIsDiscontinue())
                .createM_productDTO();
    }

    @Override
    public M_product toDomain(M_productDTO dtoObject) {
        return new M_productBuilder()
                .setM_product_id(dtoObject.getM_product_id())
                .setAd_client_id(dtoObject.getAd_client_id())
                .setAd_org_id(dtoObject.getAd_org_id())
                .setValue(dtoObject.getValue())
                .setName(dtoObject.getName())
                .setC_uom_id(dtoObject.getC_uom_id())
                .setSalesrep_id(dtoObject.getSalesrep_id())
                .setC_revenuerecognition_id(dtoObject.getC_revenuerecognition_id())
                .setM_product_category_id(dtoObject.getM_product_category_id())
                .setClassification(dtoObject.getClassification())
                .setVolume(dtoObject.getVolume())
                .setWeight(dtoObject.getWeight())
                .setM_locator_id(dtoObject.getM_locator_id())
                .setIsDiscontinue(dtoObject.getIsDiscontinue())
                .createM_product();
    }

    public List<M_product> toDomain(List<M_productDTO> arg0) {
        List<M_product> res = new ArrayList<M_product>();
        for (M_productDTO t : arg0) {
            res.add(new M_productDTOAssembler().toDomain(t));
        }
        return res;
    }

    public List<M_productDTO> toDTO(List<M_product> arg0) {
        List<M_productDTO> res = new ArrayList<M_productDTO>();
        for (M_product t : arg0) {
            res.add(this.toDTO(t));
        }
        return res;
    }

}
