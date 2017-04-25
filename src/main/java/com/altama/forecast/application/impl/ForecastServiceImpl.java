package com.altama.forecast.application.impl;

import com.altama.forecast.application.ForecastService;
import com.altama.forecast.domain.forecast.Forecast;
import com.altama.forecast.domain.forecast.ForecastBuilder;
import com.altama.forecast.domain.forecast.ForecastRepository;
import com.altama.forecast.domain.forecast.IsDiscontinued;
import com.altama.forecast.interfaces.web.facade.dto.assembler.forecast.ForecastDTOAssembler;
import com.altama.forecast.interfaces.web.facade.dto.forecast.ForecastDTO;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang.Validate;

/**
 *
 * @author 3AD
 */
public class ForecastServiceImpl implements ForecastService {

    private ForecastRepository forecastRepository;
    private ForecastDTOAssembler forecastDTOAssembler;

    public void setForecastRepository(ForecastRepository forecastRepository) {
        this.forecastRepository = forecastRepository;
    }

    public void setForecastDTOAssembler(ForecastDTOAssembler forecastDTOAssembler) {
        this.forecastDTOAssembler = forecastDTOAssembler;
    }

    @Override
    public void saveForecast(ForecastDTO forecast) {
        Forecast ad = forecastRepository.findByID(forecast.getBrandID());
        if (ad == null) {
            ad = forecastDTOAssembler.toDomain(forecast);
        } else {
            /* update specification */
            ad.assignNewForecast(forecastDTOAssembler.toDomain(forecast));
        }
        forecastRepository.saveOrUpdate(ad);
    }

    @Override
    public ForecastDTO getDummy() {
        Forecast forecast = new ForecastBuilder()
                .setBrand("Tekiro")
                .setBrandID(11.0)
                .setCurrencyLastPCS(12.0)
                .setFactory("AHM")
                .setIsDiscontinued(IsDiscontinued.YES)
                .setLeadTime(11.0)
                .setMoq(12.0)
                .setPriceListJual(13.0)
                .setPriceListLastPCS(18.0)
                .setPriceVersion("RP")
                .setProduct("Tekiro 12")
                .setQtyAvalilable(14.0)
                .setQtyAverage(14.0)
                .setQtyBatasAtas(17.0)
                .setQtyOnOrdered(19.0)
                .setQtyPCSperMasterBox(20.0)
                .setRekomendasiQtyPO(18.0)
                .setSuplier("PT WWW")
                .setTotalMasterBox(20.0)
                .createForecast();
        return forecastDTOAssembler.toDTO(forecast);
    }

    @Override
    public ForecastDTO findByID(Double brandID) {
        Validate.notNull(forecastRepository);
        Forecast b = (Forecast) forecastRepository.findByID(brandID);
        if (b != null) {
            return forecastDTOAssembler.toDTO(b);
        }
        return null;
    }

    @Override
    public List<ForecastDTO> findAll() {
        Validate.notNull(forecastRepository);
        return (List<ForecastDTO>) forecastDTOAssembler.toDTOs((List<Forecast>) forecastRepository.findAll());
    }

    @Override
    public List<ForecastDTO> findByParams(Map map) {
        Validate.notNull(forecastRepository);
        List<Forecast> listForecast = forecastRepository.findByParams(map);
        if (listForecast != null) {
            return (List<ForecastDTO>) forecastDTOAssembler.toDTOs(listForecast);
        }
        return null;
    }

    @Override
    public ForecastDTO getDummy2() {
        Forecast forecast = new ForecastBuilder()
                .setBrand("ARALDITE")
                .setBrandID(11.0)
                .setCurrencyLastPCS(12.0)
                .setFactory("ASA")
                .setIsDiscontinued(IsDiscontinued.NO)
                .setLeadTime(11.0)
                .setMoq(12.0)
                .setPriceListJual(13.0)
                .setPriceListLastPCS(18.0)
                .setPriceVersion("US")
                .setProduct("Araldite 12")
                .setQtyAvalilable(14.0)
                .setQtyAverage(14.0)
                .setQtyBatasAtas(17.0)
                .setQtyOnOrdered(19.0)
                .setQtyPCSperMasterBox(20.0)
                .setRekomendasiQtyPO(18.0)
                .setSuplier("PT CCC")
                .setTotalMasterBox(20.0)
                .createForecast();
        return forecastDTOAssembler.toDTO(forecast);
    }

}
