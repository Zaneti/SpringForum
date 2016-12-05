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
public class DAOUsuario {

    public DAOUsuario() {
    }
    
    public List<String> list() {
        List<String> usuarios 
                = new  ArrayList<String>();
        usuarios.add("Rafael Zaneti");
        usuarios.add("Aloíde Lima");
        usuarios.add("Vitórya Zaneti");
        usuarios.add("Beatriz Zaneti");
        return usuarios;
    }
}
