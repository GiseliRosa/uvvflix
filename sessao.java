import java.util.ArrayList;
import java.util.List;
import uvvflix.filme;

public class sessao {

    boolean statusSessao;
    String horario;
    List<filme> filmes = new ArrayList<>();
    List<sessao> sessoes = new ArrayList<>();

    
    void cadastrar (filme f){
        filmes.add(f);
    }
    
    public sessao(String horario, boolean statusSessao) {
        this.horario = horario;
        this.statusSessao = statusSessao;
    }

    public String gethorario() {
        return horario;

    }

    public void exibirhorario() {
        System.out.println("O horário da sessão é:" + this.horario);
    }

    void cadastrar (sessao se){
        sessoes.add(se);
    }
    
    void lersessao (sessao se){
        int index;
        index = InOut.LeInt(frase:"Escreva o id da sessao que queira ler:");
        InOut.MsgInformacao(cabecalho:"sala" + ListaSala.get(index-1)); (frase:"horario: "+ this.horario + "\nstatussessao: "+ this.statusSessao);
    }
    
    void removersessao (sessao se){
        int index;
        index = IntOut.LeInt(frase:"Digite o Id da sessao que vai ser removida:");
        Listasala.remove(index: index - 1);
        InOut.MsgdeInformacao(cabecalho:"sessao", frase: "Removida")
    }
    
    void alterarsessao (sessao se){
        int index;
        String var;
        index = inOut.LeInt(frase:"Digite o id da sessao que vai ser alterada:");
        
    }
}
