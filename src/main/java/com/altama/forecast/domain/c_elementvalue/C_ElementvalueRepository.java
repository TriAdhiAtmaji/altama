package com.altama.forecast.domain.c_elementvalue;

import java.util.List;
import java.util.Map;

/**
 *
 * @author admin
 */
public interface C_ElementvalueRepository {

    void saveOrUpdate(C_Elementvalue c_Elementvalue);

    void deleteData(C_Elementvalue c_Elementvalue);

    C_Elementvalue findByID(long c_elementvalue_id);

    List<C_Elementvalue> findAll();

    List<C_Elementvalue> findByParams(Map map);
}
