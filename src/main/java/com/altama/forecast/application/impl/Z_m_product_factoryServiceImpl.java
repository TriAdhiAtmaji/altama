package com.altama.forecast.application.impl;

import com.altama.forecast.application.Z_m_product_factoryService;
import com.altama.forecast.domain.z_m_product_factory.Z_m_product_factory;
import com.altama.forecast.domain.z_m_product_factory.Z_m_product_factoryBuilder;
import com.altama.forecast.domain.z_m_product_factory.Z_m_product_factoryRepository;
import com.altama.forecast.interfaces.web.facade.dto.assembler.z_m_product_factory.Z_m_product_factoryDTOAssembler;
import com.altama.forecast.interfaces.web.facade.dto.z_m_product_factory.Z_m_product_factoryDTO;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.commons.lang.Validate;

/**
 *
 * @author admin
 */
public class Z_m_product_factoryServiceImpl implements Z_m_product_factoryService {

    private Z_m_product_factoryRepository z_m_product_factoryRepository;
    private Z_m_product_factoryDTOAssembler z_m_product_factoryDTOAssembler;

    public void setZ_m_product_factoryRepository(Z_m_product_factoryRepository z_m_product_factoryRepository) {
        this.z_m_product_factoryRepository = z_m_product_factoryRepository;
    }

    public void setZ_m_product_factoryDTOAssembler(Z_m_product_factoryDTOAssembler z_m_product_factoryDTOAssembler) {
        this.z_m_product_factoryDTOAssembler = z_m_product_factoryDTOAssembler;
    }

    @Override
    public void saveZMFactory(Z_m_product_factoryDTO z_m_product_factory) {
        Z_m_product_factory ad = z_m_product_factoryRepository.findByID(z_m_product_factory.getZ_m_product_factory_id());
        if (ad == null) {
            ad = z_m_product_factoryDTOAssembler.toDomain(z_m_product_factory);
        } else {
            /* update specification */
            ad.assignNewZ_m_product_factory(z_m_product_factoryDTOAssembler.toDomain(z_m_product_factory));
        }
        z_m_product_factoryRepository.saveOrUpdate(ad);
    }

    @Override
    public void delete(Z_m_product_factoryDTO z_m_product_factory) {
        Z_m_product_factory t = z_m_product_factoryDTOAssembler.toDomain(z_m_product_factory);
        z_m_product_factoryRepository.deleteData(t);
    }

    @Override
    public Z_m_product_factoryDTO getDummy() {
        Z_m_product_factory z_m_product_factory = new Z_m_product_factoryBuilder()
                .setIscurrentvendor("Y")
                .setM_product_id(BigDecimal.valueOf(123))
                .setZ_m_factory_id(BigDecimal.valueOf(321))
                .setZ_m_product_factory_id(BigDecimal.valueOf(345))
                .createZ_m_product_factory();
        return z_m_product_factoryDTOAssembler.toDTO(z_m_product_factory);
    }

    @Override
    public Z_m_product_factoryDTO getDummy2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Z_m_product_factoryDTO findByID(BigDecimal z_m_product_factory_id) {
        Validate.notNull(z_m_product_factoryRepository);
        Z_m_product_factory b = (Z_m_product_factory) z_m_product_factoryRepository.findByID(z_m_product_factory_id);
        if (b != null) {
            return z_m_product_factoryDTOAssembler.toDTO(b);
        }
        return null;
    }

    @Override
    public Set<Z_m_product_factoryDTO> findAll() {
        Validate.notNull(z_m_product_factoryRepository);
        return (Set<Z_m_product_factoryDTO>) z_m_product_factoryDTOAssembler.toDTOs((Set<Z_m_product_factory>) z_m_product_factoryRepository.findAll());
    }

}
