package com.altama.forecast.infrastructure.persistence.hibernate;

import com.altama.forecast.application.util.StringUtil;
import com.altama.forecast.domain.forecastrecomend.ForecastRecomend;
import com.altama.forecast.domain.forecastrecomend.ForecastRecomendRepository;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author admin
 */
@Repository
@Transactional
public class ForecastRecomendHibernateRepository extends HibernateRepository implements ForecastRecomendRepository {

    @Override
    public ForecastRecomend findByID(BigDecimal m_product_id) {
        return (ForecastRecomend) getSession()
                .createQuery("FROM com.altama.forecast.domain.forecastrecomend.ForecastRecomend WHERE m_product_id = :pid")
                .setParameter("pid", m_product_id)
                .uniqueResult();
    }

    @Override
    public List<ForecastRecomend> findAll() {
        Query query = getSession().createQuery("SELECT DISTINCT forecast FROM com.altama.forecast.domain.forecastrecomend.ForecastRecomend AS forecast");
        return query.list();
    }

    @Override
    public List<ForecastRecomend> findByParam(Map map, int offset, int limit) {
        Criteria criteria = getSession().createCriteria(ForecastRecomend.class);

        if (StringUtil.hasValue(map.get("c_elementvalue_id"))) {
            criteria.add(Restrictions.eq("c_elementvalue_id", map.get("c_elementvalue_id")));
        }

        if (StringUtil.hasValue(map.get("productSelect"))) {
            criteria.add(Restrictions.eq("product", map.get("productSelect")));
        }

        if (StringUtil.hasValue(map.get("c_bpartner_id"))) {
            criteria.add(Restrictions.eq("c_bpartner_id", map.get("c_bpartner_id")));
        }

        if (StringUtil.hasValue(map.get("z_m_factory_id"))) {
            criteria.add(Restrictions.eq("z_m_factory_id", map.get("z_m_factory_id")));
        }

        if (StringUtil.hasValue(map.get("isDiscontinued"))) {
            criteria.add(Restrictions.eq("isDiscontinued", map.get("isDiscontinued")));
        }
        if (StringUtil.hasValue(map.get("m_pricelist_version_id"))) {
            criteria.add(Restrictions.eq("m_pricelist_version_id", map.get("m_pricelist_version_id")));
        }
        criteria.setFirstResult(offset);
        criteria.setMaxResults(limit);

        return criteria.list();
    }

    @Override
    public Integer countRecord(int count) {
        Query query = getSession().createQuery("SELECT COUNT forecast FROM com.altama.forecast.domain.forecastrecomend.ForecastRecomend AS forecast");
        return countRecord(count);
    }

}
//"SELECT COUNT * FROM com.altama.forecast.domain.forecastrecomend.ForecastRecomend"
