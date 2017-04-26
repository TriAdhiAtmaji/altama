package com.altama.forecast.infrastructure.persistence.hibernate;

import com.altama.forecast.application.util.StringUtil;
import com.altama.forecast.domain.c_elementvalue.C_Elementvalue;
import com.altama.forecast.domain.c_elementvalue.C_ElementvalueRepository;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author admin
 */
@Repository
@Transactional
public class C_ElementvalueHibernateRepository extends HibernateRepository implements C_ElementvalueRepository {

    @Override
    public void saveOrUpdate(C_Elementvalue c_Elementvalue) {
        getSession().saveOrUpdate(c_Elementvalue);
    }

    @Override
    public void deleteData(C_Elementvalue c_Elementvalue) {
        Query query = getSession().createQuery("delete from com.altama.forecast.domain.c_elementvalue.C_Elementvalue where c_elementvalue_id = :cID");
        query.setParameter("cID", c_Elementvalue.getC_elementvalue_id());
        query.executeUpdate();

    }

    @Override
    public C_Elementvalue findByID(long c_elementvalue_id) {
        return (C_Elementvalue) getSession()
                .createQuery("from com.altama.forecast.domain.c_elementvalue.C_Elementvalue where c_elementvalue_id = :tid")
                .setParameter("tid", c_elementvalue_id)
                .uniqueResult();
    }

    @Override
    public List<C_Elementvalue> findAll() {
        Criteria criteria = getSession().createCriteria(C_Elementvalue.class, "elementvalueAlias");
//        criteria.createCriteria("elementvalueAlias.ad_treenodeu1", "join");
        return (List<C_Elementvalue>) criteria.list();

    }
//    @Override
//    public List<C_Elementvalue> findAll() {
//        Query query = getSession().createQuery("from com.altama.forecast.domain.c_elementvalue.C_Elementvalue as elementvalue join elementvalue.ad_treenodeu1");
//        return (List<C_Elementvalue>) query.list();
//    }

    @Override
    public List<C_Elementvalue> findByParams(Map map) {
        Criteria criteria = getSession().createCriteria(C_Elementvalue.class);

        if (StringUtil.hasValue(map.get("c_elementvalue_id"))) {
            criteria.add(Restrictions.eq("c_elementvalue_id", map.get("c_elementvalue_id")));
        }

        if (StringUtil.hasValue(map.get("name"))) {
            criteria.add(Restrictions.eq("name", map.get("name")));
        }
        return criteria.list();
    }

}
