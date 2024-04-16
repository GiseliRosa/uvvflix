/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uvvflix;

/**
 *
 * @author alunolab10
 */
public class filme {
    int idfilme;
    String titulo, genero;
    long duracao;
    
    
    public filme (String titulo, String genero, long duracao) {
    this.titulo = titulo;
    this.genero = genero;
    this.duracao = duracao;
}
    public String gettitulo(){
        return titulo;
        System.out.println ("Título: " + filme.gettitulo);
        
    }
    public String getgenero(){
        return genero;
        System.out.println ("Gênero: " + filme.getgenero);
        
    }
    
    public long getduracao(){
        return duracao;
        System.out.println ("Duração: " + filme.getduracao);
    }
    
}
