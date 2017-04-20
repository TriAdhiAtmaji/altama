package com.altama.forecast.domain.m_pricelist_version;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 *
 * @author admin
 */
public interface M_pricelist_versionRepository {

    void saveOrUpdate(M_pricelist_version m_pricelist_version);

    void deleteData(M_pricelist_version m_pricelist_version);

    M_pricelist_version findByID(BigDecimal m_pricelist_version_id);

    List<M_pricelist_version> findAll();

    List<M_pricelist_version> findByParams(Map map);
}
