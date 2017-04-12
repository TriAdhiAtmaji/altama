package com.altama.forecast.application.impl;

import com.altama.forecast.application.M_productService;
import com.altama.forecast.domain.m_product.M_product;
import com.altama.forecast.domain.m_product.M_productRepository;
import com.altama.forecast.interfaces.web.facade.dto.assembler.m_product.M_productDTOAssembler;
import com.altama.forecast.interfaces.web.facade.dto.m_productDTO.M_productDTO;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang.Validate;

/**
 *
 * @author admin
 */
public class M_productServiceImpl implements M_productService {

    private M_productRepository m_productRepository;
    private M_productDTOAssembler m_productDTOAssembler;

    public void setM_productRepository(M_productRepository m_productRepository) {
        this.m_productRepository = m_productRepository;
    }

    public void setM_productDTOAssembler(M_productDTOAssembler m_productDTOAssembler) {
        this.m_productDTOAssembler = m_productDTOAssembler;
    }

    @Override
    public void saveAd_treenodeu1(M_productDTO m_product) {
        M_product ad = m_productRepository.findByID(m_product.getM_product_id());
        if (ad == null) {
            ad = m_productDTOAssembler.toDomain(m_product);
        } else {
            /* update specification */
            ad.assignNewM_product(m_productDTOAssembler.toDomain(m_product));
        }
        m_productRepository.saveOrUpdate(ad);
    }

    @Override
    public void delete(M_productDTO m_product) {
        M_product t = m_productDTOAssembler.toDomain(m_product);
        m_productRepository.deleteData(t);
    }

    @Override
    public M_productDTO getDummy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public M_productDTO findByID(BigDecimal m_product_id) {
        Validate.notNull(m_productRepository);
        M_product b = (M_product) m_productRepository.findByID(m_product_id);
        if (b != null) {
            return m_productDTOAssembler.toDTO(b);
        }
        return null;
    }

    @Override
    public List<M_productDTO> findAll() {
        Validate.notNull(m_productRepository);
        return (List<M_productDTO>) m_productDTOAssembler.toDTO((List<M_product>) m_productRepository.findAll());
    }

    @Override
    public List<M_productDTO> findByParams(Map map) {
        Validate.notNull(m_productRepository);
        List<M_product> listM_product = m_productRepository.findByParams(map);
        if (listM_product != null) {
            return (List<M_productDTO>) m_productDTOAssembler.toDTO(listM_product);
        }
        return null;
    }

}
