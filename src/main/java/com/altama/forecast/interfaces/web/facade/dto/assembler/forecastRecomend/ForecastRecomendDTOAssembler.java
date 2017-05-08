package com.altama.forecast.interfaces.web.facade.dto.assembler.forecastRecomend;

import com.altama.forecast.domain.forecastrecomend.ForecastRecomend;
import com.altama.forecast.domain.forecastrecomend.ForecastRecomendBuilder;
import com.altama.forecast.interfaces.web.facade.dto.assembler.IObjectAssembler;
import com.altama.forecast.interfaces.web.facade.dto.forecastRecomendDTO.ForecastRecomendDTO;
import com.altama.forecast.interfaces.web.facade.dto.forecastRecomendDTO.ForecastRecomendDTOBuilder;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class ForecastRecomendDTOAssembler implements IObjectAssembler<ForecastRecomend, ForecastRecomendDTO> {

    @Override
    public ForecastRecomendDTO toDTO(ForecastRecomend domainObject) {
        return new ForecastRecomendDTOBuilder()
                .setC_bpartner_id(domainObject.getC_bpartner_id())
                .setC_elementvalue_id(domainObject.getC_elementvalue_id())
                .setCurrencyListPO(domainObject.getCurrencyListPO())
                .setLeadTime(domainObject.getLeadTime())
                .setM_pricelist_version_id(domainObject.getM_pricelist_version_id())
                .setM_product_id(domainObject.getM_product_id())
                .setMoq(domainObject.getMoq())
                .setPriceListJual(domainObject.getPriceListJual())
                .setPriceListLastPO(domainObject.getPriceListLastPO())
                .setProduct(domainObject.getProduct())
                .setQtyAvailable(domainObject.getQtyAvailable())
                .setQtyAverage(domainObject.getQtyAverage())
                .setQtyBatasAtas(domainObject.getQtyBatasAtas())
                .setQtyOnOrdered(domainObject.getQtyOnOrdered())
                .setQtyPcsPerMasterBox(domainObject.getQtyPcsPerMasterBox())
                .setRecomendQtyPOPcs(domainObject.getRecomendQtyPOPcs())
                .setTotalMasterBox(domainObject.getTotalMasterBox())
                .setIsDiscontinue(domainObject.getIsDiscontinue())
                .createForecastRecomendDTO();
    }

    @Override
    public ForecastRecomend toDomain(ForecastRecomendDTO dtoObject) {
        return new ForecastRecomendBuilder()
                .setC_bpartner_id(dtoObject.getC_bpartner_id())
                .setC_elementvalue_id(dtoObject.getC_elementvalue_id())
                .setCurrencyListPO(dtoObject.getCurrencyListPO())
                .setLeadTime(dtoObject.getLeadTime())
                .setM_pricelist_version_id(dtoObject.getM_pricelist_version_id())
                .setM_product_id(dtoObject.getM_product_id())
                .setMoq(dtoObject.getMoq())
                .setPriceListJual(dtoObject.getPriceListJual())
                .setPriceListLastPO(dtoObject.getPriceListLastPO())
                .setProduct(dtoObject.getProduct())
                .setQtyAvailable(dtoObject.getQtyAvailable())
                .setQtyAverage(dtoObject.getQtyAverage())
                .setQtyBatasAtas(dtoObject.getQtyBatasAtas())
                .setQtyOnOrdered(dtoObject.getQtyOnOrdered())
                .setQtyPcsPerMasterBox(dtoObject.getQtyPcsPerMasterBox())
                .setRecomendQtyPOPcs(dtoObject.getRecomendQtyPOPcs())
                .setTotalMasterBox(dtoObject.getTotalMasterBox())
                .setIsDiscontinue(dtoObject.getIsDiscontinue())
                .createForecastRecomend();
    }

    public List<ForecastRecomend> toDomains(List<ForecastRecomendDTO> arg0) {
        List<ForecastRecomend> res = new ArrayList<>();
        for (ForecastRecomendDTO f : arg0) {
            res.add(new ForecastRecomendDTOAssembler().toDomain(f));
        }
        return res;
    }

    public List<ForecastRecomendDTO> toDTOs(List<ForecastRecomend> arg0) {
        List<ForecastRecomendDTO> res = new ArrayList<>();
        for (ForecastRecomend f : arg0) {
            res.add(this.toDTO(f));
        }
        return res;
    }

}
