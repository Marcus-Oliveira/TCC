package br.com.designare.model;
/**
 *
 * @author kenedy
 */
public class Componente {
    
    //Atributos do componente
    private long id;
    private String nome;
    private long ligacao;
    private String tipo;
    private String associacao;
    
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

    public long getLigacao() {
        return ligacao;
    }

    public void setLigacao(long ligacao) {
        this.ligacao = ligacao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAssociacao() {
        return associacao;
    }

    public void setAssociacao(String associacao) {
        this.associacao = associacao;
    }
    
}
