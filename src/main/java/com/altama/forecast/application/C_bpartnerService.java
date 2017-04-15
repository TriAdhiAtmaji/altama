package com.altama.forecast.application;

import com.altama.forecast.interfaces.web.facade.dto.c_bpartner.C_bpartnerDTO;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 *
 * @author admin
 */
public interface C_bpartnerService {

    void save(C_bpartnerDTO c_bpartner);

    void delete(C_bpartnerDTO c_bpartner);

    C_bpartnerDTO getDummy();

    C_bpartnerDTO getDummy2();

    C_bpartnerDTO findByID(BigDecimal c_bpartner_id);

    List<C_bpartnerDTO> findAll();

    List<C_bpartnerDTO> findByParams(Map map);
}
