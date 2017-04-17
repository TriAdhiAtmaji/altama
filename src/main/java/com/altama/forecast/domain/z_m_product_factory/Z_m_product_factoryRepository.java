/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.altama.forecast.domain.z_m_product_factory;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 *
 * @author admin
 */
public interface Z_m_product_factoryRepository {

    void saveOrUpdate(Z_m_product_factory z_m_product_factory);

    void deleteData(Z_m_product_factory z_m_product_factory);

    Z_m_product_factory findByID(BigDecimal z_m_factory_id);

    List<Z_m_product_factory> findAll();

    List<Z_m_product_factory> findByParams(Map map);
}
