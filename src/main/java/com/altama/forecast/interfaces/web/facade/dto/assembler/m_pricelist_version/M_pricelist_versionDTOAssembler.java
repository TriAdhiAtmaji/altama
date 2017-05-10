package com.altama.forecast.interfaces.web.facade.dto.assembler.m_pricelist_version;

import com.altama.forecast.domain.m_pricelist_version.M_pricelist_version;
import com.altama.forecast.domain.m_pricelist_version.M_pricelist_versionBuilder;
import com.altama.forecast.interfaces.web.facade.dto.assembler.IObjectAssembler;
import com.altama.forecast.interfaces.web.facade.dto.m_pricelist_versionDTO.M_pricelist_versionDTO;
import com.altama.forecast.interfaces.web.facade.dto.m_pricelist_versionDTO.M_pricelist_versionDTOBuilder;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class M_pricelist_versionDTOAssembler implements IObjectAssembler<M_pricelist_version, M_pricelist_versionDTO> {

    @Override
    public M_pricelist_versionDTO toDTO(M_pricelist_version domainObject) {
        return new M_pricelist_versionDTOBuilder()
                .setM_pricelist_version_id(domainObject.getM_pricelist_version_id())
                .setNamePricelist(domainObject.getNamePricelist())
                .createM_pricelist_versionDTO();
    }

    @Override
    public M_pricelist_version toDomain(M_pricelist_versionDTO dtoObject) {
        return new M_pricelist_versionBuilder()
                .setM_pricelist_version_id(dtoObject.getM_pricelist_version_id())
                .setNamePricelist(dtoObject.getNamePricelist())
                .createM_pricelist_version();
    }

    public List<M_pricelist_version> toDomains(List<M_pricelist_versionDTO> arg0) {
        List<M_pricelist_version> res = new ArrayList<M_pricelist_version>();
        for (M_pricelist_versionDTO t : arg0) {
            res.add(new M_pricelist_versionDTOAssembler().toDomain(t));
        }
        return res;
    }

    public List<M_pricelist_versionDTO> toDTOs(List<M_pricelist_version> arg0) {
        List<M_pricelist_versionDTO> res = new ArrayList<M_pricelist_versionDTO>();
        for (M_pricelist_version t : arg0) {
            res.add(this.toDTO(t));
        }
        return res;
    }

}
