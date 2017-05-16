package com.altama.forecast.infrastructure.persistence.hibernate;

import com.altama.forecast.application.util.StringUtil;
import com.altama.forecast.domain.c_bpartner.C_bpartner;
import com.altama.forecast.domain.c_bpartner.C_bpartnerRepository;
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
public class C_bpartnerHibernateRepository extends HibernateRepository implements C_bpartnerRepository {

    @Override
    public void saveOrUpdate(C_bpartner c_bpartner) {
        getSession().saveOrUpdate(c_bpartner);
    }

    @Override
    public void deleteData(C_bpartner c_bpartner) {
        Query query = getSession().createQuery("delete from com.altama.forecast.domain.c_bpartner.C_bpartner where c_bpartner_id = :cbID");
        query.setParameter("cbID", c_bpartner.getC_bpartner_id());
        query.executeUpdate();
    }

    @Override
    public C_bpartner findByID(BigDecimal c_bpartner_id) {
        return (C_bpartner) getSession()
                .createQuery("from com.altama.forecast.domain.c_bpartner.C_bpartner where ad_tree_id = :tid")
                .setParameter("tid", c_bpartner_id)
                .uniqueResult();
    }

    @Override
    public List<C_bpartner> findAll() {
        Query query = getSession().createQuery("FROM com.altama.forecast.domain.c_bpartner.C_bpartner WHERE isvendor = 'Y' ORDER BY suplier ASC");
        return (List<C_bpartner>) query.list();

//        Criteria criteria = getSession().createCriteria(C_bpartner.class, "bPartner");
//        criteria.add(Restrictions.eq("bPartner.isvendor", 'Y'));
//        return criteria.list();
    }

    @Override
    public List<C_bpartner> findByParams(Map map) {
        Criteria criteria = getSession().createCriteria(C_bpartner.class);

        if (StringUtil.hasValue(map.get("name"))) {
            criteria.add(Restrictions.eq("name", map.get("name")));
        }
        return criteria.list();
    }

}
