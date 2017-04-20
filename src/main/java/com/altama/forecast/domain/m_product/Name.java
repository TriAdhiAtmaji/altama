/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.altama.forecast.domain.m_product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class Name {

    private BigDecimal id;
//    private List<Name> listOfName = new ArrayList<Name>();
    private String name;

//    public Name(BigDecimal id, String nama) {
//        this.setId(new BigDecimal(1));
//        this.setName("Tekiro");
//
//    }
    public Name(BigDecimal id, String name) {
        this.id = id;
        this.name = name;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public List<Name> getListOfName() {
//        return listOfName;
//    }
//
//    public void setListOfName(List<Name> listOfName) {
//        this.listOfName = listOfName;
//    }
    public static void main(String[] args) {
        Name n1 = new Name(BigDecimal.valueOf(1), "Tekiro");
        Name n2 = new Name(BigDecimal.valueOf(2), "Ryu");

        List<Name> listName = new ArrayList<Name>();
        listName.add(n1);
        listName.add(n2);

        System.out.println(n1.getId().toString());
    }
}
