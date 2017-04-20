package com.altama.forecast.application;

import com.altama.forecast.interfaces.web.facade.dto.m_pricelist_versionDTO.M_pricelist_versionDTO;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 *
 * @author admin
 */
public interface M_pricelist_versionService {

    void saveAd_treenodeu1(M_pricelist_versionDTO M_pricelist_version);

    void delete(M_pricelist_versionDTO M_pricelist_version);

    M_pricelist_versionDTO getDummy();

    M_pricelist_versionDTO findByID(BigDecimal m_product_id);

    List<M_pricelist_versionDTO> findAll();

    List<M_pricelist_versionDTO> findByParams(Map map);
}
