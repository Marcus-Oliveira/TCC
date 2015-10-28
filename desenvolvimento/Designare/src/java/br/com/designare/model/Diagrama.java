package br.com.designare.model;
/**
 *
 * @author kenedy
 */
public class Diagrama {
    
    //Atributos do diagrama
    private long id;
    private String nome;
    private String tipo;
    
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
