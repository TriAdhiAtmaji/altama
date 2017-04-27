package com.altama.forecast.application;

import com.altama.forecast.interfaces.web.facade.dto.z_m_product_factory.Z_m_product_factoryDTO;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author admin
 */
public interface Z_m_product_factoryService {

    void saveZMFactory(Z_m_product_factoryDTO z_m_product_factory);

    void delete(Z_m_product_factoryDTO z_m_product_factory);

    Z_m_product_factoryDTO getDummy();

    Z_m_product_factoryDTO getDummy2();

    Z_m_product_factoryDTO findByID(BigDecimal z_m_product_factory_id);

    List<Z_m_product_factoryDTO> findAll();
}
