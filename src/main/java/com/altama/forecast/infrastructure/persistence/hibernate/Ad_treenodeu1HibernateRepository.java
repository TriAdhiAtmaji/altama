package com.altama.forecast.infrastructure.persistence.hibernate;

import com.altama.forecast.domain.ad_treenodeu1.Ad_treenodeu1;
import com.altama.forecast.domain.ad_treenodeu1.Ad_treenodeu1Repository;
import com.altama.forecast.application.util.StringUtil;
import java.math.BigDecimal;
import java.util.Arrays;
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
public class Ad_treenodeu1HibernateRepository extends HibernateRepository implements Ad_treenodeu1Repository {

    @Override
    public void saveOrUpdate(Ad_treenodeu1 ad_treenodeu1) {
        getSession().saveOrUpdate(ad_treenodeu1);
    }

    @Override
    public void deleteData(Ad_treenodeu1 ad_treenodeu1) {
        Query query = getSession().createQuery("delete from com.altama.forecast.domain.ad_treenodeu1.Ad_treenodeu1 where ad_tree_id = :atID");
        query.setParameter("atID", ad_treenodeu1.getAd_tree_id());
        query.executeUpdate();
    }

    @Override
    public Ad_treenodeu1 findByID(BigDecimal ad_tree_id) {
        return (Ad_treenodeu1) getSession()
                .createQuery("from com.altama.forecast.domain.ad_treenodeu1.Ad_treenodeu1 where ad_tree_id = :tid")
                .setParameter("tid", ad_tree_id)
                .uniqueResult();
    }

    @Override
    public List<Ad_treenodeu1> findAll() {
        Criteria criteria = getSession().createCriteria(Ad_treenodeu1.class);
        return (List<Ad_treenodeu1>) criteria.list();
    }

    @Override
    public List<Ad_treenodeu1> findByParams(Map map) {
        Criteria criteria = getSession().createCriteria(Ad_treenodeu1.class);

        if (StringUtil.hasValue(map.get("ad_tree_id"))) {
            criteria.add(Restrictions.eq("ad_tree_id", map.get("ad_tree_id")));
        }
        return criteria.list();
    }

}
