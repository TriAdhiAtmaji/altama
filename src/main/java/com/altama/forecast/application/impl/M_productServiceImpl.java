package com.altama.forecast.application.impl;

import com.altama.forecast.application.M_productService;
import com.altama.forecast.domain.m_product.M_product;
import com.altama.forecast.domain.m_product.M_productBuilder;
import com.altama.forecast.domain.m_product.M_productRepository;
import com.altama.forecast.interfaces.web.facade.dto.assembler.m_product.M_productDTOAssembler;
import com.altama.forecast.interfaces.web.facade.dto.m_productDTO.M_productDTO;
import java.math.BigDecimal;
import java.util.Date;
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
        M_product m_product = new M_productBuilder()
                .setM_product_id(BigDecimal.valueOf(4))
                .setAd_client_id(BigDecimal.valueOf(8))
                .setAd_org_id(BigDecimal.valueOf(8))
                .setIsactive("Y")
                .setCreated(new Date())
                .setCreatedby(BigDecimal.valueOf(3))
                .setUpdated(new Date())
                .setUpdatedBy(BigDecimal.valueOf(3))
                .setValue("Y")
                .setName("TEK")
                .setDescription("AW")
                .setDocumentnote("WK")
                .setHelp("Y")
                .setUpc("Y")
                .setVolume(BigDecimal.valueOf(9))
                .setWeight(BigDecimal.valueOf(3))
                .setWmsvalue("Y")
                .createM_product();
        return m_productDTOAssembler.toDTO(m_product);
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

    @Override
    public M_productDTO getDummy2() {
        M_product m_product = new M_productBuilder()
                .setM_product_id(BigDecimal.valueOf(4))
                .setAd_client_id(BigDecimal.valueOf(8))
                .setAd_org_id(BigDecimal.valueOf(8))
                .setIsactive("Y")
                .setCreated(new Date())
                .setCreatedby(BigDecimal.valueOf(3))
                .setUpdated(new Date())
                .setUpdatedBy(BigDecimal.valueOf(3))
                .setValue("Y")
                .setName("AER")
                .setDescription("AW")
                .setDocumentnote("WK")
                .setHelp("Y")
                .setUpc("Y")
                .setVolume(BigDecimal.valueOf(9))
                .setWeight(BigDecimal.valueOf(3))
                .setWmsvalue("Y")
                .createM_product();
        return m_productDTOAssembler.toDTO(m_product);
    }

}
