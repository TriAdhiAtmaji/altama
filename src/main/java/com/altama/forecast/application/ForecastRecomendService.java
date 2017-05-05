package com.altama.forecast.application;

import com.altama.forecast.interfaces.web.facade.dto.forecastRecomendDTO.ForecastRecomendDTO;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 *
 * @author admin
 */
public interface ForecastRecomendService {

    ForecastRecomendDTO getDummy();

    ForecastRecomendDTO findByID(BigDecimal m_product_id);

    List<ForecastRecomendDTO> findAll();

    List<ForecastRecomendDTO> findByParams(Map map);
}
