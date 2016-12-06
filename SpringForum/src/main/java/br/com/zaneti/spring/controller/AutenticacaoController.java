/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.zaneti.spring.controller;

import br.com.zaneti.spring.model.Usuario;
import br.com.zaneti.spring.model.dao.DAOUsuario;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author rafaelz
 */
@Controller
public class AutenticacaoController {

    @Autowired
    private DAOUsuario daoUsuario;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(
            @RequestParam("login") String login,
            @RequestParam("login") String senha,
            HttpSession session) {

        Usuario usuario = daoUsuario.getUsuario(login, senha);
        
        if(usuario == null){
            return "error";
        }
        session.setAttribute("login", login);                
        return "redirect:/";
    }
}
