package com.altama.forecast.application.impl;

import com.altama.forecast.application.Z_m_factoryService;
import com.altama.forecast.domain.z_m_factory.Z_m_factory;
import com.altama.forecast.domain.z_m_factory.Z_m_factoryRepository;
import com.altama.forecast.interfaces.web.facade.dto.assembler.z_m_factory.Z_m_factoryDTOAssembler;
import com.altama.forecast.interfaces.web.facade.dto.z_m_factory.Z_m_factoryDTO;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang.Validate;

/**
 *
 * @author admin
 */
public class Z_m_factoryServiceImpl implements Z_m_factoryService {

    private Z_m_factoryRepository z_m_factoryRepository;
    private Z_m_factoryDTOAssembler z_m_factoryDTOAssembler;

    public void setZ_m_factoryRepository(Z_m_factoryRepository z_m_factoryRepository) {
        this.z_m_factoryRepository = z_m_factoryRepository;
    }

    public void setZ_m_factoryDTOAssembler(Z_m_factoryDTOAssembler z_m_factoryDTOAssembler) {
        this.z_m_factoryDTOAssembler = z_m_factoryDTOAssembler;
    }

    @Override
    public void saveZMFactory(Z_m_factoryDTO z_m_factory) {
        Z_m_factory ad = z_m_factoryRepository.findByID(z_m_factory.getZ_m_factory_id());
        if (ad == null) {
            ad = z_m_factoryDTOAssembler.toDomain(z_m_factory);
        } else {
            /* update specification */
            ad.assignNewZ_m_factory(z_m_factoryDTOAssembler.toDomain(z_m_factory));
        }
        z_m_factoryRepository.saveOrUpdate(ad);
    }

    @Override
    public void delete(Z_m_factoryDTO z_m_factory) {
        Z_m_factory t = z_m_factoryDTOAssembler.toDomain(z_m_factory);
        z_m_factoryRepository.deleteData(t);
    }

    @Override
    public Z_m_factoryDTO getDummy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Z_m_factoryDTO getDummy2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Z_m_factoryDTO findByID(BigDecimal z_m_factory_id) {
        Validate.notNull(z_m_factoryRepository);
        Z_m_factory b = (Z_m_factory) z_m_factoryRepository.findByID(z_m_factory_id);
        if (b != null) {
            return z_m_factoryDTOAssembler.toDTO(b);
        }
        return null;
    }

    @Override
    public List<Z_m_factoryDTO> findAll() {
        Validate.notNull(z_m_factoryRepository);
        return (List<Z_m_factoryDTO>) z_m_factoryDTOAssembler.toDTO((List<Z_m_factory>) z_m_factoryRepository.findAll());
    }

    @Override
    public List<Z_m_factoryDTO> findByParams(Map map) {
        Validate.notNull(z_m_factoryRepository);
        List<Z_m_factory> listZMFactory = z_m_factoryRepository.findByParams(map);
        if (listZMFactory != null) {
            return (List<Z_m_factoryDTO>) z_m_factoryDTOAssembler.toDTO(listZMFactory);
        }
        return null;
    }

}
