package com.altama.forecast.application;

import com.altama.forecast.interfaces.web.facade.dto.m_productDTO.M_productDTO;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 *
 * @author admin
 */
public interface M_productService {

    void saveAd_treenodeu1(M_productDTO m_product);

    void delete(M_productDTO m_product);

    M_productDTO getDummy();

    M_productDTO findByID(BigDecimal m_product_id);

    List<M_productDTO> findAll();

    List<M_productDTO> findByParams(Map map);
}
