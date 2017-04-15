package com.altama.forecast.domain.z_m_factory;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 *
 * @author admin
 */
public interface Z_m_factoryRepository {

    void saveOrUpdate(Z_m_factory z_m_factory);

    void deleteData(Z_m_factory z_m_factory);

    Z_m_factory findByID(BigDecimal z_m_factory_id);

    List<Z_m_factory> findAll();

    List<Z_m_factory> findByParams(Map map);
}
