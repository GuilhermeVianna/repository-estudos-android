package com.gvdev.devmobile.papo10.model;

/**
 * Created by guilhermevianna on 30/05/17.
 */
public class Contato {

    private String idContato;
    private String nome;
    private String email;

    public Contato() {
    }

    public String getIdContato() {
        return idContato;
    }

    public void setIdContato(String idContato) {
        this.idContato = idContato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
