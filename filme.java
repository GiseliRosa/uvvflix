package uvvflix;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alunolab10
 */
public class filme {
    int idfilme;
    String titulo, genero;
    long duracao;
    List<ator> atores = new ArrayList<>(); 
    
    List<filme> filmes = new ArrayList<>();

    public filme(String titulo, String genero, long duracao) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracao = duracao;
    }

    void adicionarAtor(Ator ator) {
        atores.add(ator);
    }
    
    String getTitulo() {
        return titulo;
    }

     String getGenero() {
        return genero;
    }

     String getDuracao() {
        return duracao;
    }

     ArrayList<Ator> getAtores() {
        return atores;
    }

}
