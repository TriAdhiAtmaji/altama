package com.altama.forecast.infrastructure.persistence.hibernate;

import com.altama.forecast.application.util.StringUtil;
import com.altama.forecast.domain.forecast.Forecast;
import com.altama.forecast.domain.forecast.ForecastRepository;
import java.util.List;
import java.util.Map;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author 3AD
 */
@Repository
@Transactional
public class ForecastHibernateRepository extends HibernateRepository implements ForecastRepository {

    @Override
    public void saveOrUpdate(Forecast forecast) {
        getSession().saveOrUpdate(forecast);
    }

    @Override
    public void deleteData(Forecast forecast) {
        Query query = getSession().createQuery("delete com.altama.forecast.domain.forecast.Forecast where brandID = :cbID");
        query.setParameter("cbID", forecast.getBrandID());
        query.executeUpdate();
    }

    @Override
    public Forecast findByID(double brandID) {
        return (Forecast) getSession()
                .createQuery("from com.altama.forecast.domain.forecast.Forecast where brandID = :tid")
                .setParameter("tid", brandID)
                .uniqueResult();
    }

    @Override
    public List<Forecast> findAll() {
        Criteria criteria = getSession().createCriteria(Forecast.class);
        System.out.println(criteria.list().isEmpty());
        return (List<Forecast>) criteria.list();
    }

    @Override
    public List<Forecast> findByParams(Map map) {
        Criteria criteria = getSession().createCriteria(Forecast.class);

        if (StringUtil.hasValue(map.get("brand"))) {
            criteria.add(Restrictions.eq("brand", map.get("brand")));
        }

        if (StringUtil.hasValue(map.get("product"))) {
            criteria.add(Restrictions.eq("product", map.get("product")));
        }

        if (StringUtil.hasValue(map.get("suplier"))) {
            criteria.add(Restrictions.eq("suplier", map.get("suplier")));
        }

        if (StringUtil.hasValue(map.get("factory"))) {
            criteria.add(Restrictions.eq("factory", map.get("factory")));
        }

        if (StringUtil.hasValue(map.get("isDiscontinued"))) {
            criteria.add(Restrictions.eq("isDiscontinued", map.get("isDiscontinued")));
        }

        if (StringUtil.hasValue(map.get("priceVersion"))) {
            criteria.add(Restrictions.eq("priceVersion", map.get("priceVersion")));
        }
        return criteria.list();
    }

}
