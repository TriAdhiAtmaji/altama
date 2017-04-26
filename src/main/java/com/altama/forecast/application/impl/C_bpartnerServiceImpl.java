package com.altama.forecast.application.impl;

import com.altama.forecast.application.C_bpartnerService;
import com.altama.forecast.domain.c_bpartner.C_bpartner;
import com.altama.forecast.domain.c_bpartner.C_bpartnerRepository;
import com.altama.forecast.interfaces.web.facade.dto.assembler.c_bpartner.C_bpartnerDTOAssembler;
import com.altama.forecast.interfaces.web.facade.dto.c_bpartner.C_bpartnerDTO;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang.Validate;

/**
 *
 * @author admin
 */
public class C_bpartnerServiceImpl implements C_bpartnerService {

    private C_bpartnerRepository c_bpartnerRepository;
    private C_bpartnerDTOAssembler c_bpartnerDTOAssembler;

    public void setC_bpartnerRepository(C_bpartnerRepository c_bpartnerRepository) {
        this.c_bpartnerRepository = c_bpartnerRepository;
    }

    public void setC_bpartnerDTOAssembler(C_bpartnerDTOAssembler c_bpartnerDTOAssembler) {
        this.c_bpartnerDTOAssembler = c_bpartnerDTOAssembler;
    }

    @Override
    public void save(C_bpartnerDTO c_bpartner) {
        C_bpartner ad = c_bpartnerRepository.findByID(c_bpartner.getC_bpartner_id());
        if (ad == null) {
            ad = c_bpartnerDTOAssembler.toDomain(c_bpartner);
        } else {
            /* update specification */
            ad.assignNewC_bpartner(c_bpartnerDTOAssembler.toDomain(c_bpartner));
        }
        c_bpartnerRepository.saveOrUpdate(ad);
    }

    @Override
    public void delete(C_bpartnerDTO c_bpartner) {
        C_bpartner t = c_bpartnerDTOAssembler.toDomain(c_bpartner);
        c_bpartnerRepository.deleteData(t);
    }

    @Override
    public C_bpartnerDTO getDummy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public C_bpartnerDTO getDummy2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public C_bpartnerDTO findByID(BigDecimal c_bpartner_id) {
        Validate.notNull(c_bpartnerRepository);
        C_bpartner b = (C_bpartner) c_bpartnerRepository.findByID(c_bpartner_id);
        if (b != null) {
            return c_bpartnerDTOAssembler.toDTO(b);
        }
        return null;
    }

    @Override
    public List<C_bpartnerDTO> findAll() {
        Validate.notNull(c_bpartnerRepository);
        return (List<C_bpartnerDTO>) c_bpartnerDTOAssembler.toDTOs((List<C_bpartner>) c_bpartnerRepository.findAll());
    }

    @Override
    public List<C_bpartnerDTO> findByParams(Map map) {
        Validate.notNull(c_bpartnerRepository);
        List<C_bpartner> listC_Bpartner = c_bpartnerRepository.findByParams(map);
        if (listC_Bpartner != null) {
            return (List<C_bpartnerDTO>) c_bpartnerDTOAssembler.toDTOs(listC_Bpartner);
        }
        return null;
    }

}
