package com.altama.forecast.interfaces.web.facade.dto.assembler.forecastRecomend;

import com.altama.forecast.domain.forecastrecomend.CountForecastRecomend;
import com.altama.forecast.domain.forecastrecomend.CountForecastRecomendBuilder;
import com.altama.forecast.interfaces.web.facade.dto.assembler.IObjectAssembler;
import com.altama.forecast.interfaces.web.facade.dto.forecastRecomendDTO.CountForecastRecomendDTO;
import com.altama.forecast.interfaces.web.facade.dto.forecastRecomendDTO.CountForecastRecomendDTOBuilder;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class CountForecastRecomendDTOAssembler implements IObjectAssembler<CountForecastRecomend, CountForecastRecomendDTO> {

    @Override
    public CountForecastRecomendDTO toDTO(CountForecastRecomend domainObject) {
        return new CountForecastRecomendDTOBuilder()
                .setC_bpartner_id(domainObject.getC_bpartner_id())
                .setC_elementvalue_id(domainObject.getC_elementvalue_id())
                .setIsdiscontinued(domainObject.getIsdiscontinued())
                .setM_pricelist_version_id(domainObject.getM_pricelist_version_id())
                .setM_product_id(domainObject.getM_product_id())
                .setProduct(domainObject.getProduct())
                .setZ_m_factory_id(domainObject.getZ_m_factory_id())
                .createCountForecastRecomendDTO();
    }

    @Override
    public CountForecastRecomend toDomain(CountForecastRecomendDTO dtoObject) {
        return new CountForecastRecomendBuilder()
                .setC_bpartner_id(dtoObject.getC_bpartner_id())
                .setC_elementvalue_id(dtoObject.getC_elementvalue_id())
                .setIsdiscontinued(dtoObject.getIsdiscontinued())
                .setM_pricelist_version_id(dtoObject.getM_pricelist_version_id())
                .setM_product_id(dtoObject.getM_product_id())
                .setProduct(dtoObject.getProduct())
                .setZ_m_factory_id(dtoObject.getZ_m_factory_id())
                .createCountForecastRecomend();
    }

    public List<CountForecastRecomend> toDomains(List<CountForecastRecomendDTO> arg0) {
        List<CountForecastRecomend> res = new ArrayList<CountForecastRecomend>();
        for (CountForecastRecomendDTO f : arg0) {
            res.add(new CountForecastRecomendDTOAssembler().toDomain(f));
        }
        return res;
    }

    public List<CountForecastRecomendDTO> toDTOs(List<CountForecastRecomend> arg0) {
        List<CountForecastRecomendDTO> res = new ArrayList<CountForecastRecomendDTO>();
        for (CountForecastRecomend f : arg0) {
            res.add(this.toDTO(f));
        }
        return res;
    }

}
