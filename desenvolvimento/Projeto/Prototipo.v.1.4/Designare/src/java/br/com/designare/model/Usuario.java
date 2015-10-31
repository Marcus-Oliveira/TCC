
package br.com.designare.model;
/**
 *
 * @author kenedy
 */
public class Usuario {
    
   //Atributos do usuário
   private long id;
   private String nome;
   private String email;
   private String senha;
   
   public Usuario(){//Construtor para Inserção
       
   }
   
   public Usuario(long id){//COnstrutor para demais funções
       this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
   
}
