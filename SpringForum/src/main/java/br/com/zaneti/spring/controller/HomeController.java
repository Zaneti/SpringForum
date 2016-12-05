/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.zaneti.spring.controller;

import br.com.zaneti.spring.model.dao.DAOAssunto;
import br.com.zaneti.spring.model.dao.DAOUsuario;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author rafaelz
 */
@Controller
public class HomeController {

    @Autowired
    private DAOAssunto daoAssunto;
    @Autowired
    private DAOUsuario daoUsuario;

    @RequestMapping("/")
    public String index(Map<String, Object> model) {
        model.put("assuntos", getDaoAssunto().list());
        model.put("usuarios", getDaoUsuario().list());
        return "index";
    }

    public DAOAssunto getDaoAssunto() {
        return daoAssunto;
    }

    public void setDaoAssunto(DAOAssunto daoAssunto) {
        this.daoAssunto = daoAssunto;
    }

    public DAOUsuario getDaoUsuario() {
        return daoUsuario;
    }

    public void setDaoUsuario(DAOUsuario daoUsuario) {
        this.daoUsuario = daoUsuario;
    }

}
