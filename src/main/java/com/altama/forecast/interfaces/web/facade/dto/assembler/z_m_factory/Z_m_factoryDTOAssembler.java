package com.altama.forecast.interfaces.web.facade.dto.assembler.z_m_factory;

import com.altama.forecast.domain.z_m_factory.Z_m_factory;
import com.altama.forecast.domain.z_m_factory.Z_m_factoryBuilder;
import com.altama.forecast.domain.z_m_product_factory.Z_m_product_factoryRepository;
import com.altama.forecast.interfaces.web.facade.dto.assembler.IObjectAssembler;
import com.altama.forecast.interfaces.web.facade.dto.assembler.z_m_product_factory.Z_m_product_factoryDTOAssembler;
import com.altama.forecast.interfaces.web.facade.dto.z_m_factory.Z_m_factoryDTO;
import com.altama.forecast.interfaces.web.facade.dto.z_m_factory.Z_m_factoryDTOBuilder;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class Z_m_factoryDTOAssembler implements IObjectAssembler<Z_m_factory, Z_m_factoryDTO> {

    private Z_m_product_factoryDTOAssembler z_m_product_factoryDTOAssembler;
    private Z_m_product_factoryRepository z_m_product_factoryRepository;

    public void setZ_m_product_factoryDTOAssembler(Z_m_product_factoryDTOAssembler z_m_product_factoryDTOAssembler) {
        this.z_m_product_factoryDTOAssembler = z_m_product_factoryDTOAssembler;
    }

    public void setZ_m_product_factoryRepository(Z_m_product_factoryRepository z_m_product_factoryRepository) {
        this.z_m_product_factoryRepository = z_m_product_factoryRepository;
    }

    @Override
    public Z_m_factoryDTO toDTO(Z_m_factory domainObject) {
        return new Z_m_factoryDTOBuilder()
                .setAd_client_id(domainObject.getAd_client_id())
                .setAd_org_id(domainObject.getAd_org_id())
                .setC_bpartner_id(domainObject.getC_bpartner_id())
                .setCreated(domainObject.getCreated())
                .setCreatedby(domainObject.getCreatedby())
                .setIsactive(domainObject.getIsactive())
                .setName(domainObject.getName())
                .setUpdated(domainObject.getUpdated())
                .setUpdatedby(domainObject.getUpdatedby())
                .setZ_m_factory_id(domainObject.getZ_m_factory_id())
                .setZ_m_product_factory(domainObject.getZ_m_product_factory())
                .createZ_m_factoryDTO();
    }

    @Override
    public Z_m_factory toDomain(Z_m_factoryDTO dtoObject) {
        return new Z_m_factoryBuilder()
                .setAd_client_id(dtoObject.getAd_client_id())
                .setAd_org_id(dtoObject.getAd_org_id())
                .setC_bpartner_id(dtoObject.getC_bpartner_id())
                .setCreated(dtoObject.getCreated())
                .setCreatedby(dtoObject.getCreatedby())
                .setIsactive(dtoObject.getIsactive())
                .setName(dtoObject.getName())
                .setUpdated(dtoObject.getUpdated())
                .setUpdatedby(dtoObject.getUpdatedby())
                .setZ_m_factory_id(dtoObject.getZ_m_factory_id())
                .setZ_m_product_factory(dtoObject.getZ_m_product_factory())
                .createZ_m_factory();
    }

    public List<Z_m_factory> toDomains(List<Z_m_factoryDTO> arg0) {
        List<Z_m_factory> res = new ArrayList<>();
        for (Z_m_factoryDTO t : arg0) {
            res.add(new Z_m_factoryDTOAssembler().toDomain(t));
        }
        return res;
    }

    public List<Z_m_factoryDTO> toDTOs(List<Z_m_factory> arg0) {
        List<Z_m_factoryDTO> res = new ArrayList<>();
        if (arg0 != null) {
            for (Z_m_factory t : arg0) {
                res.add(this.toDTO(t));
            }
        }
        return res;
    }

}
