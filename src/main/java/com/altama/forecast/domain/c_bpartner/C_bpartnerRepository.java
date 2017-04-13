package com.altama.forecast.domain.c_bpartner;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 *
 * @author admin
 */
public interface C_bpartnerRepository {

    void saveOrUpdate(C_bpartner c_bpartner);

    void deleteData(C_bpartner c_bpartner);

    C_bpartner findByID(BigDecimal c_bpartner_id);

    List<C_bpartner> findAll();

    List<C_bpartner> findByParams(Map map);
}
