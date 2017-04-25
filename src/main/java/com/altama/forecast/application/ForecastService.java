package com.altama.forecast.application;

import com.altama.forecast.interfaces.web.facade.dto.forecast.ForecastDTO;
import java.util.List;
import java.util.Map;

/**
 *
 * @author 3AD
 */
public interface ForecastService {

    void saveForecast(ForecastDTO forecast);

    ForecastDTO getDummy();

    ForecastDTO getDummy2();

    ForecastDTO findByID(Double brandID);

    List<ForecastDTO> findAll();

    List<ForecastDTO> findByParams(Map map);
}
