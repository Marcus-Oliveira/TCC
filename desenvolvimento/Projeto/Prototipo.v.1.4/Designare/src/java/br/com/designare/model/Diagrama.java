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
    private Projeto projeto;
    
    
    public Diagrama(Projeto projeto) {//Constutor para Inserção
        this.projeto = projeto;
    }
    
    public Diagrama(long id, Projeto projeto) {//Construtor para demias funções
        this.id = id;
        this.projeto = projeto;
    }
    
    //Getters e Setters
    public long getId() {
        return id;
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

    public Projeto getProjeto() {
        return projeto;
    }    
}
