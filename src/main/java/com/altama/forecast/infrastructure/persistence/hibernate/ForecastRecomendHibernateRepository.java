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

/**
 *
 * @author admin
 */
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
        Query query = getSession().createSQLQuery("SELECT mp.m_product_id, pp.m_pricelist_version_id, mfac.z_m_factory_id, ol.c_bpartner_id, ev.c_elementvalue_id,"
                + "mp.name AS product,bomqtyavailable(mp.m_product_id, 1000000, 0) AS QtyAvailable,af_product_power_average_so(mp.m_product_id, '2016-05-01', '2017-04-30', 0) AS QtyAverage,"
                + "mfac.deliverytime_promised AS LeadTime,bomqtyordered(mp.m_product_id, 1000000, 0) AS QtyOnOrdered, pp.pricelist AS PriceListJual,"
                + "c.iso_code AS CurrencyLastPO, ol.priceactual AS PriceListLastPO,mfac.order_min AS MOQ, mp.qty_per_ctn AS QtyPcsPerMasterBox"
                + "FROM m_product AS mp"
                + "INNER JOIN m_productprice AS pp"
                + "	ON mp.m_product_id = pp.m_product_id"
                + "INNER JOIN c_orderline as ol"
                + "	ON ol.m_product_id = mp.m_product_id"
                + "INNER JOIN z_m_product_factory AS mfac"
                + "	ON mp.m_product_id = mfac.m_product_id"
                + "INNER JOIN c_order AS o"
                + "	ON ol.c_order_id = o.c_order_id"
                + "INNER JOIN c_currency AS c"
                + "	ON c.c_currency_id = ol.c_currency_id"
                + "INNER JOIN c_elementvalue AS ev"
                + "	ON ev.c_elementvalue_id = mp.user1_id"
                + "WHERE (mfac.iscurrentvendor = 'Y') AND "
                + "(o.docstatus = 'CO' OR o.docstatus = 'CL') AND"
                + "(o.c_doctype_id = 1000050 OR o.c_doctype_id = 1000051 OR o.c_doctype_id = 1000052 OR o.c_doctype_id = 1000016)").addEntity(ForecastRecomend.class);
        query.setResultTransformer(null);
        return query.list();
    }

    @Override
    public List<ForecastRecomend> findByParam(Map map) {
        Criteria criteria = getSession().createCriteria(ForecastRecomend.class);

        if (StringUtil.hasValue(map.get("c_elementvalue_id"))) {
            criteria.add(Restrictions.eq("c_elementvalue_id", map.get("c_elementvalue_id")));
        }

        if (StringUtil.hasValue(map.get("product"))) {
            criteria.add(Restrictions.eq("product", map.get("product")));
        }

        if (StringUtil.hasValue(map.get("c_bpartner_id"))) {
            criteria.add(Restrictions.eq("c_bpartner_id", map.get("c_bpartner_id")));
        }

        if (StringUtil.hasValue(map.get("z_m_factory_id"))) {
            criteria.add(Restrictions.eq("z_m_factory_id", map.get("z_m_factory_id")));
        }

//        if (StringUtil.hasValue(map.get("isDiscontinued"))) {
//            criteria.add(Restrictions.eq("isDiscontinued", map.get("isDiscontinued")));
//        }
        if (StringUtil.hasValue(map.get("m_pricelist_version_id"))) {
            criteria.add(Restrictions.eq("m_pricelist_version_id", map.get("m_pricelist_version_id")));
        }

        return criteria.list();
    }

}
