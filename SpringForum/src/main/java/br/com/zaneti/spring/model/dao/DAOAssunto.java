/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.zaneti.spring.model.dao;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author rafaelz
 */
@Repository
public class DAOAssunto {

    public DAOAssunto() {
    }

    public List<String> list() {
        List<String> assuntos 
                = new  ArrayList<String>();
        assuntos.add("Spring");
        assuntos.add("Annotations");
        assuntos.add("MVC");
        assuntos.add("AOP");
        assuntos.add("Hibernate");
        return assuntos;
    }
}
