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
public class Resposta {

    private Usuario usuario;
    private Topico topico;

    public Resposta(Usuario usuario, Topico topico) {
        this.usuario = usuario;
        this.topico = topico;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Topico getTopico() {
        return topico;
    }

    public void setTopico(Topico topico) {
        this.topico = topico;
    }

}
