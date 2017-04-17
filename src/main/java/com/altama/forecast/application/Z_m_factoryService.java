package com.altama.forecast.application;

import com.altama.forecast.interfaces.web.facade.dto.z_m_factory.Z_m_factoryDTO;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 *
 * @author admin
 */
public interface Z_m_factoryService {

    void saveZMFactory(Z_m_factoryDTO z_m_factory);

    void delete(Z_m_factoryDTO z_m_factory);

    Z_m_factoryDTO getDummy();

    Z_m_factoryDTO getDummy2();

    Z_m_factoryDTO findByID(BigDecimal z_m_factory_id);

    List<Z_m_factoryDTO> findAll();

    List<Z_m_factoryDTO> findByParams(Map map);
}
