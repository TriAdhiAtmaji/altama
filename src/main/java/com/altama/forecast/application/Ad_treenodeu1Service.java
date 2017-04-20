package com.altama.forecast.application;

import com.altama.forecast.interfaces.web.facade.dto.ad_treenodeu1.Ad_treenodeu1DTO;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 *
 * @author admin
 */
public interface Ad_treenodeu1Service {

    void saveAd_treenodeu1(Ad_treenodeu1DTO ad_treenodeu1);

    void delete(Ad_treenodeu1DTO ad_treenodeu1);

    Ad_treenodeu1DTO getDummy();

    Ad_treenodeu1DTO findByID(BigDecimal Ad_tree_id);

    List<Ad_treenodeu1DTO> findAll();

    List<Ad_treenodeu1DTO> findByParams(String name);

}
