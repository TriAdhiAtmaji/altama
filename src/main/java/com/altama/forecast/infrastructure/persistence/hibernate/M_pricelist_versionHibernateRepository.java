package com.altama.forecast.infrastructure.persistence.hibernate;

import com.altama.forecast.application.util.StringUtil;
import com.altama.forecast.domain.m_pricelist_version.M_pricelist_version;
import com.altama.forecast.domain.m_pricelist_version.M_pricelist_versionRepository;
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
public class M_pricelist_versionHibernateRepository extends HibernateRepository implements M_pricelist_versionRepository {

    @Override
    public void saveOrUpdate(M_pricelist_version m_pricelist_version) {
        getSession().saveOrUpdate(m_pricelist_version);
    }

    @Override
    public void deleteData(M_pricelist_version m_pricelist_version) {
        Query query = getSession().createQuery("delete from com.altama.forecast.domain.m_pricelist_version.M_pricelist_version where m_pricelist_version_id = :atID");
        query.setParameter("atID", m_pricelist_version.getM_pricelist_version_id());
        query.executeUpdate();
    }

    @Override
    public M_pricelist_version findByID(BigDecimal m_pricelist_version_id) {
        return (M_pricelist_version) getSession()
                .createQuery("from com.altama.forecast.domain.m_pricelist_version.M_pricelist_version where m_pricelist_version_id = :tid")
                .setParameter("tid", m_pricelist_version_id)
                .uniqueResult();
    }

    @Override
    public List<M_pricelist_version> findAll() {
        Query query = getSession().createQuery("FROM com.altama.forecast.domain.m_pricelist_version.M_pricelist_version WHERE namePricelist LIKE 'US%'");
        return (List<M_pricelist_version>) query.list();

//        Criteria criteria = getSession().createCriteria(M_pricelist_version.class);
//        return (List<M_pricelist_version>) criteria.list();
    }

    @Override
    public List<M_pricelist_version> findByParams(Map map) {
        Criteria criteria = getSession().createCriteria(M_pricelist_version.class);

        if (StringUtil.hasValue(map.get("m_pricelist_version_id"))) {
            criteria.add(Restrictions.eq("m_pricelist_version_id", map.get("m_pricelist_version_id")));
        }

        if (StringUtil.hasValue(map.get("m_pricelist_version_id"))) {
            criteria.add(Restrictions.eq("namePricelist", map.get("namePricelist")));
        }
        return criteria.list();
    }

}
