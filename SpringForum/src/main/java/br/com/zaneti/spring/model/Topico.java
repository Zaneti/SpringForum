/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.zaneti.spring.model;

/**
 *
 * @author rafaelz
 */
public class Topico {
    
    private Usuario usuario;
    private Assunto assunto;

    public Topico(Usuario usuario, Assunto assunto) {
        this.usuario = usuario;
        this.assunto = assunto;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public Assunto getAssunto() {
        return assunto;
    }

    public void setAssunto(Assunto assunto) {
        this.assunto = assunto;
    }
        
}
