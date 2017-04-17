/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.altama.forecast.domain.m_product;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class Name {

//    private ArrayList<String> listnama = new ArrayList<String>();
    private List<M_product> listproduct = new ArrayList<M_product>();

    public Name() {
        listproduct.add(new M_product());
    }

}
