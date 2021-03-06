package com.altama.forecast.interfaces.web.facade.dto.assembler.z_m_product_factory;

import com.altama.forecast.domain.z_m_product_factory.Z_m_product_factory;
import com.altama.forecast.domain.z_m_product_factory.Z_m_product_factoryBuilder;
import com.altama.forecast.interfaces.web.facade.dto.assembler.IObjectAssembler;
import com.altama.forecast.interfaces.web.facade.dto.z_m_product_factory.Z_m_product_factoryDTO;
import com.altama.forecast.interfaces.web.facade.dto.z_m_product_factory.Z_m_product_factoryDTOBuilder;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class Z_m_product_factoryDTOAssembler implements IObjectAssembler<Z_m_product_factory, Z_m_product_factoryDTO> {

    @Override
    public Z_m_product_factoryDTO toDTO(Z_m_product_factory domainObject) {
        return new Z_m_product_factoryDTOBuilder()
                .setIscurrentvendor(domainObject.getIscurrentvendor())
                .setM_product_id(domainObject.getM_product_id())
                .setZ_m_factory_id(domainObject.getZ_m_factory_id())
                .setZ_m_product_factory_id(domainObject.getZ_m_product_factory_id())
                .setZ_m_factory(domainObject.getZ_m_factory())
                .createZ_m_product_factoryDTO();
    }

    @Override
    public Z_m_product_factory toDomain(Z_m_product_factoryDTO dtoObject) {
        return new Z_m_product_factoryBuilder()
                .setIscurrentvendor(dtoObject.getIscurrentvendor())
                .setM_product_id(dtoObject.getM_product_id())
                .setZ_m_factory_id(dtoObject.getZ_m_factory_id())
                .setZ_m_product_factory_id(dtoObject.getZ_m_product_factory_id())
                .setZ_m_factory(dtoObject.getZ_m_factory())
                .createZ_m_product_factory();
    }

    public List<Z_m_product_factory> toDomains(List<Z_m_product_factoryDTO> arg0) {
        List<Z_m_product_factory> res = new ArrayList<Z_m_product_factory>();
        for (Z_m_product_factoryDTO t : arg0) {
            res.add(new Z_m_product_factoryDTOAssembler().toDomain(t));
        }
        return res;
    }

    public List<Z_m_product_factoryDTO> toDTOs(List<Z_m_product_factory> arg0) {
        List<Z_m_product_factoryDTO> res = new ArrayList<Z_m_product_factoryDTO>();
        for (Z_m_product_factory t : arg0) {
            res.add(this.toDTO(t));
        }
        return res;
    }

}
