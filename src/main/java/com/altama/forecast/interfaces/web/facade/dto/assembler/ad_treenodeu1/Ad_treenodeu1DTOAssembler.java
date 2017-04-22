package com.altama.forecast.interfaces.web.facade.dto.assembler.ad_treenodeu1;

import com.altama.forecast.domain.ad_treenodeu1.Ad_treenodeu1;
import com.altama.forecast.domain.ad_treenodeu1.Ad_treenodeu1Builder;
import com.altama.forecast.interfaces.web.facade.dto.ad_treenodeu1.Ad_treenodeu1DTO;
import com.altama.forecast.interfaces.web.facade.dto.ad_treenodeu1.Ad_treenodeu1DTOBuilder;
import com.altama.forecast.interfaces.web.facade.dto.assembler.IObjectAssembler;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class Ad_treenodeu1DTOAssembler implements IObjectAssembler<Ad_treenodeu1, Ad_treenodeu1DTO> {

    @Override
    public Ad_treenodeu1DTO toDTO(Ad_treenodeu1 domainObject) {
        return new Ad_treenodeu1DTOBuilder()
                .setAd_tree_id(domainObject.getAd_tree_id())
                .setNode_id(domainObject.getNode_id())
                .setAd_client_id(domainObject.getAd_client_id())
                .setAd_org_id(domainObject.getAd_org_id())
                .createAd_treenodeu1DTO();

    }

    @Override
    public Ad_treenodeu1 toDomain(Ad_treenodeu1DTO dtoObject) {
        return new Ad_treenodeu1Builder()
                .setAd_tree_id(dtoObject.getAd_tree_id())
                .setNode_id(dtoObject.getNode_id())
                .setAd_client_id(dtoObject.getAd_client_id())
                .setAd_org_id(dtoObject.getAd_org_id())
                .createAd_treenodeu1();
    }

    public List<Ad_treenodeu1> toDomain(List<Ad_treenodeu1DTO> arg0) {
        List<Ad_treenodeu1> res = new ArrayList<>();
        for (Ad_treenodeu1DTO t : arg0) {
            res.add(new Ad_treenodeu1DTOAssembler().toDomain(t));
        }
        return res;
    }

    public List<Ad_treenodeu1DTO> toDTO(List<Ad_treenodeu1> arg0) {
        List<Ad_treenodeu1DTO> res = new ArrayList<>();
        for (Ad_treenodeu1 t : arg0) {
            res.add(this.toDTO(t));
        }
        return res;
    }

}
