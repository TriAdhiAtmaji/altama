package com.altama.forecast.viewModel;

import com.altama.forecast.application.Ad_treenodeu1Service;
import com.altama.forecast.application.C_ElementvalueService;
import com.altama.forecast.common.zul.PageNavigation;
import com.altama.forecast.interfaces.web.facade.dto.ad_treenodeu1.Ad_treenodeu1DTO;
import com.altama.forecast.interfaces.web.facade.dto.c_elementvalue.C_ElementvalueDTO;
import java.util.ArrayList;
import java.util.List;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.WireVariable;

/**
 *
 * @author admin
 */
@VariableResolver(org.zkoss.zkplus.spring.DelegatingVariableResolver.class)
public class ForecastVM {

    @WireVariable
    Ad_treenodeu1Service ad_treenodeu1Service;

    @WireVariable
    C_ElementvalueService c_ElementvalueService;

    private Ad_treenodeu1DTO ad_treenodeu1DTO = new Ad_treenodeu1DTO();
    private List<Ad_treenodeu1DTO> ad_treenodeu1DTOs = new ArrayList<>();

    private C_ElementvalueDTO c_ElementvalueDTO = new C_ElementvalueDTO();
    private List<C_ElementvalueDTO> c_ElementvalueDTOs = new ArrayList<>();

    private String namaC_Elementvalue;
    private String nameProduct;
    private String suplier;
    private String factory;
    private String pricelist;

    //    Setting List
    private PageNavigation previous;
    private boolean checked;
    private int pageSize = 5;
    private int activePage = 0;
    private int selectedIndex;
    private int totalSize = 0;

}
