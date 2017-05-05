package com.altama.forecast.application;

import com.altama.forecast.interfaces.web.facade.dto.c_elementvalue.C_ElementvalueDTO;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 *
 * @author admin
 */
public interface C_ElementvalueService {

    void saveC_Element(C_ElementvalueDTO c_Elementvalue);

    void delete(C_ElementvalueDTO c_Elementvalue);

    C_ElementvalueDTO getDummy();

    C_ElementvalueDTO findByID(BigDecimal c_elementvalue_id);

    List<C_ElementvalueDTO> findAll();

    List<C_ElementvalueDTO> findByParams(Map map);
}
