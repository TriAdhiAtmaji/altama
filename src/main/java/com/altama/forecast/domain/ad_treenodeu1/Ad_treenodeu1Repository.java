package com.altama.forecast.domain.ad_treenodeu1;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author admin
 */
public interface Ad_treenodeu1Repository {

    void saveOrUpdate(Ad_treenodeu1 ad_treenodeu1);

    void deleteData(Ad_treenodeu1 ad_treenodeu1);

    Ad_treenodeu1 findByID(BigDecimal ad_tree_id);

    List<Ad_treenodeu1> findAll();

    List<Ad_treenodeu1> findByParams(String name);
}
