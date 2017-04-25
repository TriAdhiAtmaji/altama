package com.altama.forecast.interfaces.web.facade.dto.assembler.forecast;

import com.altama.forecast.domain.forecast.Forecast;
import com.altama.forecast.domain.forecast.ForecastBuilder;
import com.altama.forecast.interfaces.web.facade.dto.assembler.IObjectAssembler;
import com.altama.forecast.interfaces.web.facade.dto.forecast.ForecastDTO;
import com.altama.forecast.interfaces.web.facade.dto.forecast.ForecastDTOBuilder;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 3AD
 */
public class ForecastDTOAssembler implements IObjectAssembler<Forecast, ForecastDTO> {

    @Override
    public ForecastDTO toDTO(Forecast domainObject) {
        return new ForecastDTOBuilder()
                .setBrand(domainObject.getBrand())
                .setBrandID(domainObject.getBrandID())
                .setCurrencyLastPCS(domainObject.getCurrencyLastPCS())
                .setFactory(domainObject.getFactory())
                .setIsDiscontinued(domainObject.getIsDiscontinued())
                .setLeadTime(domainObject.getLeadTime())
                .setMoq(domainObject.getMoq())
                .setPriceListJual(domainObject.getPriceListJual())
                .setPriceListLastPCS(domainObject.getPriceListLastPCS())
                .setPriceVersion(domainObject.getPriceVersion())
                .setProduct(domainObject.getProduct())
                .setQtyAvalilable(domainObject.getQtyAvalilable())
                .setQtyAverage(domainObject.getQtyAverage())
                .setQtyBatasAtas(domainObject.getQtyBatasAtas())
                .setQtyOnOrdered(domainObject.getQtyOnOrdered())
                .setQtyPCSperMasterBox(domainObject.getQtyPCSperMasterBox())
                .setRekomendasiQtyPO(domainObject.getRekomendasiQtyPO())
                .createForecastDTO();
    }

    @Override
    public Forecast toDomain(ForecastDTO dtoObject) {
        return new ForecastBuilder()
                .setBrand(dtoObject.getBrand())
                .setBrandID(dtoObject.getBrandID())
                .setCurrencyLastPCS(dtoObject.getCurrencyLastPCS())
                .setFactory(dtoObject.getFactory())
                .setIsDiscontinued(dtoObject.getIsDiscontinued())
                .setLeadTime(dtoObject.getLeadTime())
                .setMoq(dtoObject.getMoq())
                .setPriceListJual(dtoObject.getPriceListJual())
                .setPriceListLastPCS(dtoObject.getPriceListLastPCS())
                .setPriceVersion(dtoObject.getPriceVersion())
                .setProduct(dtoObject.getProduct())
                .setQtyAvalilable(dtoObject.getQtyAvalilable())
                .setQtyAverage(dtoObject.getQtyAverage())
                .setQtyBatasAtas(dtoObject.getQtyBatasAtas())
                .setQtyOnOrdered(dtoObject.getQtyOnOrdered())
                .setQtyPCSperMasterBox(dtoObject.getQtyPCSperMasterBox())
                .setRekomendasiQtyPO(dtoObject.getRekomendasiQtyPO())
                .createForecast();

    }

    public List<Forecast> toDomains(List<ForecastDTO> arg0) {
        List<Forecast> res = new ArrayList<>();
        for (ForecastDTO t : arg0) {
            res.add(new ForecastDTOAssembler().toDomain(t));
        }
        return res;
    }

    public List<ForecastDTO> toDTOs(List<Forecast> arg0) {
        List<ForecastDTO> res = new ArrayList<>();
        for (Forecast t : arg0) {
            res.add(this.toDTO(t));
        }
        return res;
    }

}
