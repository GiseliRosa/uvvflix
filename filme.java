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
    
    void cadastrar (filme fi){
        filmes.add(fi);
    }
    
    void lerfilme (filme fi) {
        int index;
        index = InOut.LeInt(frase:"Escreva o id do filme que queira ler:");
        InOut.MsgInformacao(cabecalho:"filme" + Listafilme.get(index-1)); (frase:"titulo: "+ this.titulo + "\ngenero: "+ this.genero + "\nduracao" + this.duracao);
    }
    
    void removerfilme (filme fi){
        int index;
        index = IntOut.LeInt(frase:"Digite o Id do filme que vai ser removido:");
        Listasala.remove(index: index - 1);
        InOut.MsgdeInformacao(cabecalho:"filme", frase: "Removido")
    }
    
    void alterarfilme (filme fi){
        int index;
        String var;
        index = inOut.LeInt(frase:"Digite o id do filme que vai ser alterado:");
        
    }

}
