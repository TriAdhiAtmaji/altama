package com.altama.forecast.infrastructure.persistence.hibernate;

import com.altama.forecast.application.util.StringUtil;
import com.altama.forecast.domain.z_m_product_factory.Z_m_product_factory;
import com.altama.forecast.domain.z_m_product_factory.Z_m_product_factoryRepository;
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
public class Z_m_product_factoryHibernateRepository extends HibernateRepository implements Z_m_product_factoryRepository {

    @Override
    public void saveOrUpdate(Z_m_product_factory z_m_product_factory) {
        getSession().saveOrUpdate(z_m_product_factory);
    }

    @Override
    public void deleteData(Z_m_product_factory z_m_product_factory) {
        Query query = getSession().createQuery("delete com.altama.forecast.domain.z_m_product_factory.Z_m_product_factory where z_m_product_factory_id = :cID");
        query.setParameter("cID", z_m_product_factory.getZ_m_product_factory_id());
        query.executeUpdate();
    }

    @Override
    public Z_m_product_factory findByID(BigDecimal z_m_factory_id) {
        return (Z_m_product_factory) getSession()
                .createQuery("from com.altama.forecast.domain.z_m_product_factory.Z_m_product_factory where z_m_product_factory_id = :tid")
                .setParameter("tid", z_m_factory_id)
                .uniqueResult();
    }

    @Override
    public List<Z_m_product_factory> findAll() {
        Criteria criteria = getSession().createCriteria(Z_m_product_factory.class);
        System.out.println(criteria.list().isEmpty());
        return (List<Z_m_product_factory>) criteria.list();
    }

    @Override
    public List<Z_m_product_factory> findByParams(Map map) {
        Criteria criteria = getSession().createCriteria(Z_m_product_factory.class);

        if (StringUtil.hasValue(map.get("z_m_product_factory_id"))) {
            criteria.add(Restrictions.eq("z_m_product_factory_id", map.get("z_m_product_factory_id")));
        }

        if (StringUtil.hasValue(map.get("iscurrentvendor"))) {
            criteria.add(Restrictions.eq("iscurrentvendor", map.get("iscurrentvendor")));
        }
        return criteria.list();
    }

}
