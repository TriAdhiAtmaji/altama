package com.altama.forecast.application.impl;

import com.altama.forecast.application.Ad_treenodeu1Service;
import com.altama.forecast.domain.ad_treenodeu1.Ad_treenodeu1;
import com.altama.forecast.domain.ad_treenodeu1.Ad_treenodeu1Builder;
import com.altama.forecast.domain.ad_treenodeu1.Ad_treenodeu1Repository;
import com.altama.forecast.interfaces.web.facade.dto.ad_treenodeu1.Ad_treenodeu1DTO;
import com.altama.forecast.interfaces.web.facade.dto.assembler.ad_treenodeu1.Ad_treenodeu1DTOAssembler;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang.Validate;

/**
 *
 * @author admin
 */
public class Ad_treenodeu1ServiceImpl implements Ad_treenodeu1Service {

    private Ad_treenodeu1Repository ad_treenodeu1Repository;
    private Ad_treenodeu1DTOAssembler ad_treenodeu1DTOAssembler;

    public void setAd_treenodeu1Repository(Ad_treenodeu1Repository ad_treenodeu1Repository) {
        this.ad_treenodeu1Repository = ad_treenodeu1Repository;
    }

    public void setAd_treenodeu1DTOAssembler(Ad_treenodeu1DTOAssembler ad_treenodeu1DTOAssembler) {
        this.ad_treenodeu1DTOAssembler = ad_treenodeu1DTOAssembler;
    }

    @Override
    public void saveAd_treenodeu1(Ad_treenodeu1DTO ad_treenodeu1) {
        Ad_treenodeu1 ad = ad_treenodeu1Repository.findByID(ad_treenodeu1.getAd_tree_id());
        if (ad == null) {
            ad = ad_treenodeu1DTOAssembler.toDomain(ad_treenodeu1);
        } else {
            /* update specification */
            ad.assignNewAd_treenodeu1(ad_treenodeu1DTOAssembler.toDomain(ad_treenodeu1));
        }
        ad_treenodeu1Repository.saveOrUpdate(ad);
    }

    @Override
    public void delete(Ad_treenodeu1DTO ad_treenodeu1) {
        Ad_treenodeu1 t = ad_treenodeu1DTOAssembler.toDomain(ad_treenodeu1);
        ad_treenodeu1Repository.deleteData(t);
    }

    @Override
    public Ad_treenodeu1DTO getDummy() {
        Ad_treenodeu1 ad_treenodeu1 = new Ad_treenodeu1Builder()
                .setAd_tree_id(BigDecimal.valueOf(10))
                .setAd_client_id(BigDecimal.valueOf(12))
                .setAd_org_id(BigDecimal.valueOf(14))
                .createAd_treenodeu1();
        return ad_treenodeu1DTOAssembler.toDTO(ad_treenodeu1);
    }

    @Override
    public List<Ad_treenodeu1DTO> findAll() {
        Validate.notNull(ad_treenodeu1Repository);
        return (List<Ad_treenodeu1DTO>) ad_treenodeu1DTOAssembler.toDTOs((List<Ad_treenodeu1>) ad_treenodeu1Repository.findAll());
    }

    @Override
    public List<Ad_treenodeu1DTO> findByParams(Map map) {
        Validate.notNull(ad_treenodeu1Repository);
        List<Ad_treenodeu1> listAdTree = (List<Ad_treenodeu1>) ad_treenodeu1Repository.findByParams(map);
        if (listAdTree != null) {
            return (List<Ad_treenodeu1DTO>) ad_treenodeu1DTOAssembler.toDTOs(listAdTree);
        }
        return null;
    }

    @Override
    public Ad_treenodeu1DTO findByID(BigDecimal Ad_tree_id) {
        Validate.notNull(ad_treenodeu1Repository);
        Ad_treenodeu1 b = (Ad_treenodeu1) ad_treenodeu1Repository.findByID(Ad_tree_id);
        if (b != null) {
            return ad_treenodeu1DTOAssembler.toDTO(b);
        }
        return null;
    }

}
