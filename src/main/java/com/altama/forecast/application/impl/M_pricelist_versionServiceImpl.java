package com.altama.forecast.application.impl;

import com.altama.forecast.application.M_pricelist_versionService;
import com.altama.forecast.domain.m_pricelist_version.M_pricelist_version;
import com.altama.forecast.domain.m_pricelist_version.M_pricelist_versionRepository;
import com.altama.forecast.interfaces.web.facade.dto.assembler.m_pricelist_version.M_pricelist_versionDTOAssembler;
import com.altama.forecast.interfaces.web.facade.dto.m_pricelist_versionDTO.M_pricelist_versionDTO;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang.Validate;

/**
 *
 * @author admin
 */
public class M_pricelist_versionServiceImpl implements M_pricelist_versionService {

    private M_pricelist_versionRepository m_pricelist_versionRepository;
    private M_pricelist_versionDTOAssembler m_pricelist_versionDTOAssembler;

    public void setM_pricelist_versionRepository(M_pricelist_versionRepository m_pricelist_versionRepository) {
        this.m_pricelist_versionRepository = m_pricelist_versionRepository;
    }

    public void setM_pricelist_versionDTOAssembler(M_pricelist_versionDTOAssembler m_pricelist_versionDTOAssembler) {
        this.m_pricelist_versionDTOAssembler = m_pricelist_versionDTOAssembler;
    }

    @Override
    public void saveAd_treenodeu1(M_pricelist_versionDTO M_pricelist_version) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(M_pricelist_versionDTO M_pricelist_version) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public M_pricelist_versionDTO getDummy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public M_pricelist_versionDTO findByID(BigDecimal m_product_id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<M_pricelist_versionDTO> findAll() {
        Validate.notNull(m_pricelist_versionRepository);
        return (List<M_pricelist_versionDTO>) m_pricelist_versionDTOAssembler.toDTOs((List<M_pricelist_version>) m_pricelist_versionRepository.findAll());
    }

    @Override
    public List<M_pricelist_versionDTO> findByParams(Map map) {
        Validate.notNull(m_pricelist_versionRepository);
        List<M_pricelist_version> listPrice = m_pricelist_versionRepository.findByParams(map);
        if (listPrice != null) {
            return (List<M_pricelist_versionDTO>) m_pricelist_versionDTOAssembler.toDTOs(listPrice);
        }
        return null;
    }

}
