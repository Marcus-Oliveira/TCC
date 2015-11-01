
package br.com.designare.model;

import java.util.Date;

/**
 *
 * @author kenedy
 */
public class Projeto {
    
    //Atributos do projeto
    private long id;
    private String nome;
    private String data_criacao;
    private Usuario usuario;
    
    //Getters e Setters
    
    public Projeto(Usuario usuario) {//Constutor para Inserção
        this.usuario = usuario;
    }
    
    public Projeto(long id, Usuario usuario) {//Construtor para demias funções
        this.id = id;
        this.usuario = usuario;
    }
    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData_criacao() {
        return data_criacao;
    }

    public void setData_criacao(String data_criacao) {
        this.data_criacao = data_criacao;
    }

    public Usuario getUsuario() {
        return usuario;
    }   
}
