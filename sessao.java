import java.util.ArrayList;
import java.util.List;
import uvvflix.filme;

public class sessao {

    boolean statusSessao;
    String horario;
    List<filme> filmes = new ArrayList<>();

    
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

}
