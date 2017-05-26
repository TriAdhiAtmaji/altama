package com.altama.forecast.infrastructure.persistence.hibernate;

import com.altama.forecast.application.util.StringUtil;
import com.altama.forecast.domain.forecastrecomend.CountForecastRecomend;
import com.altama.forecast.domain.forecastrecomend.CountForecastRecomendRepository;
import java.util.Map;
import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author admin
 */
@Repository
@Transactional
public class CountForecastRecomendHibernateRepository extends HibernateRepository implements CountForecastRecomendRepository {

    @Override
    public Integer countRecord(Map map) {
        Criteria criteria = getSession().createCriteria(CountForecastRecomend.class).setProjection(Projections.rowCount());

        if (StringUtil.hasValue(map.get("brandSelected"))) {
            criteria.add(Restrictions.eq("c_elementvalue_id", map.get("brandSelected")));
        }

        if (StringUtil.hasValue(map.get("productSelect"))) {
            criteria.add(Restrictions.ilike("product", map.get("productSelect")));
        }

        if (StringUtil.hasValue(map.get("suplierSelect"))) {
            criteria.add(Restrictions.eq("c_bpartner_id", map.get("suplierSelect")));
        }

        if (StringUtil.hasValue(map.get("factorySelect"))) {
            criteria.add(Restrictions.eq("z_m_factory_id", map.get("factorySelect")));
        }

        if (StringUtil.hasValue(map.get("continueSelect"))) {
            criteria.add(Restrictions.eq("isdiscontinued", map.get("continueSelect")));
        }
        if (StringUtil.hasValue(map.get("priceVersionSelect"))) {
            criteria.add(Restrictions.eq("m_pricelist_version_id", map.get("priceVersionSelect")));
        }
        return (Integer) criteria.uniqueResult();
    }

}
