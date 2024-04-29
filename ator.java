package uvvflix;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alunolab10
 */
public class ator {
     int idAtor;
    String nome, papel;
    List<ator> atores = new ArrayList<>();

    
    public ator (String nome, String papel){
    this.nome = nome;
    this.papel = papel;
}
    
     void cadastrar (ator at){
        atores.add(at);
    }
    
    void lerator (ator at) {
        int index;
        index = InOut.LeInt(frase:"Escreva o id do ator que queira ler:");
        InOut.MsgInformacao(cabecalho:"ator" + Listafilme.get(index-1)); (frase:"nome: "+ this.nome + "\npapel: "+ this.papel);
    }
    
    void removerator (ator at){
        int index;
        index = IntOut.LeInt(frase:"Digite o Id do ator que vai ser removido:");
        Listasala.remove(index: index - 1);
        InOut.MsgdeInformacao(cabecalho:"ator", frase: "Removido")
    }
    
    void alterarator (ator at){
        int index;
        String var;
        index = inOut.LeInt(frase:"Digite o id do ator que vai ser alterado:");
        
    }

}
