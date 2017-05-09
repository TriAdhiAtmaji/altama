package com.altama.forecast.application.impl;

import com.altama.forecast.application.ForecastRecomendService;
import com.altama.forecast.domain.forecastrecomend.ForecastRecomend;
import com.altama.forecast.domain.forecastrecomend.ForecastRecomendRepository;
import com.altama.forecast.interfaces.web.facade.dto.assembler.forecastRecomend.ForecastRecomendDTOAssembler;
import com.altama.forecast.interfaces.web.facade.dto.forecastRecomendDTO.ForecastRecomendDTO;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang.Validate;

/**
 *
 * @author admin
 */
public class ForecastRecomendServiceImpl implements ForecastRecomendService {

    private ForecastRecomendRepository forecastRecomendRepository;
    private ForecastRecomendDTOAssembler forecastRecomendDTOAssembler;

    public void setForecastRecomendRepository(ForecastRecomendRepository forecastRecomendRepository) {
        this.forecastRecomendRepository = forecastRecomendRepository;
    }

    public void setForecastRecomendDTOAssembler(ForecastRecomendDTOAssembler forecastRecomendDTOAssembler) {
        this.forecastRecomendDTOAssembler = forecastRecomendDTOAssembler;
    }

    @Override
    public ForecastRecomendDTO getDummy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ForecastRecomendDTO findByID(BigDecimal m_product_id) {
        Validate.notNull(forecastRecomendRepository);
        ForecastRecomend f = forecastRecomendRepository.findByID(m_product_id);
        if (f != null) {
            return forecastRecomendDTOAssembler.toDTO(f);
        }
        return null;
    }

    @Override
    public List<ForecastRecomendDTO> findAll() {
        Validate.notNull(forecastRecomendRepository);
        return forecastRecomendDTOAssembler.toDTOs((List<ForecastRecomend>) forecastRecomendRepository.findAll());
    }

    @Override
    public List<ForecastRecomendDTO> findByParams(Map map, int offset, int limit) {
        Validate.notNull(forecastRecomendRepository);
        List<ForecastRecomend> listForecastRecomend = forecastRecomendRepository.findByParam(map, offset, limit);
        if (listForecastRecomend != null) {
            return (List<ForecastRecomendDTO>) forecastRecomendDTOAssembler.toDTOs(listForecastRecomend);
        }
        return null;
    }

    @Override
    public Integer countRecord(Map map) {
        Validate.notNull(forecastRecomendRepository);
        int i = forecastRecomendRepository.countRecord(map);
        return i;
    }

    @Override
    public List<ForecastRecomendDTO> findByParamsMap(Map map) {
        Validate.notNull(forecastRecomendRepository);
        List<ForecastRecomend> listForecastRecomend = forecastRecomendRepository.findByParamMap(map);
        if (listForecastRecomend != null) {
            return (List<ForecastRecomendDTO>) forecastRecomendDTOAssembler.toDTOs(listForecastRecomend);
        }
        return null;
    }

}
