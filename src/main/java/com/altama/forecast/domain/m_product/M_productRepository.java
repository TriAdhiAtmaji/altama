package com.altama.forecast.domain.m_product;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 *
 * @author admin
 */
public interface M_productRepository {

    void saveOrUpdate(M_product m_product);

    void deleteData(M_product m_product);

    M_product findByID(BigDecimal m_product_id);

    List<M_product> findAll();

    List<M_product> findByParams(Map map);
}
