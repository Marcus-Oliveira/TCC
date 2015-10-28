
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
    private Date data_criacao;
    
    //Getters e Setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getData_criacao() {
        return data_criacao;
    }

    public void setData_criacao(Date data_criacao) {
        this.data_criacao = data_criacao;
    }
}
