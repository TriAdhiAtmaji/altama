package com.altama.forecast.infrastructure.persistence.hibernate;

import com.altama.forecast.application.util.StringUtil;
import com.altama.forecast.domain.m_product.M_product;
import com.altama.forecast.domain.m_product.M_productRepository;
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
public class M_productHibernateRepository extends HibernateRepository implements M_productRepository {

    @Override
    public void saveOrUpdate(M_product m_product) {
        getSession().saveOrUpdate(m_product);
    }

    @Override
    public void deleteData(M_product m_product) {
        Query query = getSession().createQuery("delete from com.altama.forecast.domain.m_product.M_product where m_product_id = :cID");
        query.setParameter("cID", m_product.getM_product_id());
        query.executeUpdate();
    }

    @Override
    public M_product findByID(BigDecimal m_product_id) {
        return (M_product) getSession()
                .createQuery("from com.altama.forecast.domain.m_product.M_product where m_product_id = :tid")
                .setParameter("tid", m_product_id)
                .uniqueResult();
    }

    @Override
    public List<M_product> findAll() {
        Criteria criteria = getSession().createCriteria(M_product.class);
        System.out.println(criteria.list().isEmpty());
        return (List<M_product>) criteria.list();
    }

    @Override
    public List<M_product> findByParams(Map map) {
        Criteria criteria = getSession().createCriteria(M_product.class);

        if (StringUtil.hasValue(map.get("m_product_id"))) {
            criteria.add(Restrictions.eq("m_product_id", map.get("m_product_id")));
        }

        if (StringUtil.hasValue(map.get("name"))) {
            criteria.add(Restrictions.eq("name", map.get("name")));
        }
        return criteria.list();
    }

}
