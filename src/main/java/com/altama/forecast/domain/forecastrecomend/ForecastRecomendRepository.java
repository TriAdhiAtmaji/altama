package com.altama.forecast.domain.forecastrecomend;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 *
 * @author admin
 */
public interface ForecastRecomendRepository {

    ForecastRecomend findByID(BigDecimal m_product_id);

    List<ForecastRecomend> findAll();

    Integer countRecord(int count);

    List<ForecastRecomend> findByParam(Map map, int offset, int limit);
}
