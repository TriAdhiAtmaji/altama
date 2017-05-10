package com.altama.forecast.application.impl;

import com.altama.forecast.application.CountForecastRecomendService;
import com.altama.forecast.domain.forecastrecomend.CountForecastRecomendRepository;
import com.altama.forecast.interfaces.web.facade.dto.assembler.forecastRecomend.CountForecastRecomendDTOAssembler;
import java.util.Map;
import org.apache.commons.lang.Validate;

/**
 *
 * @author admin
 */
public class CountForecastRecomendServiceImpl implements CountForecastRecomendService {

    CountForecastRecomendDTOAssembler countForecastRecomendDTOAssembler;
    CountForecastRecomendRepository countForecastRecomendRepository;

    public void setCountForecastRecomendDTOAssembler(CountForecastRecomendDTOAssembler countForecastRecomendDTOAssembler) {
        this.countForecastRecomendDTOAssembler = countForecastRecomendDTOAssembler;
    }

    public void setCountForecastRecomendRepository(CountForecastRecomendRepository countForecastRecomendRepository) {
        this.countForecastRecomendRepository = countForecastRecomendRepository;
    }

    @Override
    public Integer countRecord(Map map) {
        Validate.notNull(countForecastRecomendRepository);
        int i = countForecastRecomendRepository.countRecord(map);
        return i;
    }

}
