package com.altama.forecast.infrastructure.persistence.hibernate;

import com.altama.forecast.application.util.StringUtil;
import com.altama.forecast.domain.forecastrecomend.ForecastRecomend;
import com.altama.forecast.domain.forecastrecomend.ForecastRecomendRepository;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import org.hibernate.Criteria;
import org.hibernate.Query;
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
        Query query = getSession().createQuery("SELECT forecast FROM com.altama.forecast.domain.forecastrecomend.ForecastRecomend AS forecast");
        return query.list();
    }

    @Override
    public List<ForecastRecomend> findByParam(Map map, int offset, int limit) {
        Criteria criteria = getSession().createCriteria(ForecastRecomend.class);

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
            criteria.add(Restrictions.eq("isDiscontinue", map.get("continueSelect")));
        }
        if (StringUtil.hasValue(map.get("priceVersionSelect"))) {
            criteria.add(Restrictions.eq("m_pricelist_version_id", map.get("priceVersionSelect")));
        }
        criteria.setFirstResult(offset);
        criteria.setMaxResults(limit);

        return criteria.list();
    }

    @Override
    public Integer countRecord(Map map) {
        Criteria criteria = getSession().createCriteria(ForecastRecomend.class).setProjection(Projections.rowCount());

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
            criteria.add(Restrictions.eq("isDiscontinue", map.get("continueSelect")));
        }
        if (StringUtil.hasValue(map.get("priceVersionSelect"))) {
            criteria.add(Restrictions.eq("m_pricelist_version_id", map.get("priceVersionSelect")));
        }
        return criteria.hashCode();
    }

    @Override
    public List<ForecastRecomend> findByParamMap(Map map) {
        Criteria criteria = getSession().createCriteria(ForecastRecomend.class);

        if (StringUtil.hasValue(map.get("brandSelected"))) {
            criteria.add(Restrictions.eq("c_elementvalue_id", map.get("brandSelected")));
        }

        if (StringUtil.hasValue(map.get("productSelect"))) {
            criteria.add(Restrictions.eq("product", map.get("productSelect")));
        }

        if (StringUtil.hasValue(map.get("suplierSelect"))) {
            criteria.add(Restrictions.eq("c_bpartner_id", map.get("suplierSelect")));
        }

        if (StringUtil.hasValue(map.get("factorySelect"))) {
            criteria.add(Restrictions.eq("z_m_factory_id", map.get("factorySelect")));
        }

        if (StringUtil.hasValue(map.get("continueSelect"))) {
            criteria.add(Restrictions.eq("isDiscontinue", map.get("continueSelect")));
        }
        if (StringUtil.hasValue(map.get("priceVersionSelect"))) {
            criteria.add(Restrictions.eq("m_pricelist_version_id", map.get("priceVersionSelect")));
        }
        return criteria.list();
    }

}
