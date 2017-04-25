package com.altama.forecast.domain.forecast;

import java.util.List;
import java.util.Map;

/**
 *
 * @author 3AD
 */
public interface ForecastRepository {

    void saveOrUpdate(Forecast forecast);

    void deleteData(Forecast forecast);

    Forecast findByID(double brandID);

    List<Forecast> findAll();

    List<Forecast> findByParams(Map map);
}
