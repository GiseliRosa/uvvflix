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


     String getStatus() {
        return status;
    }

     String getHorario() {
        return horario;
    }

     ArrayList<Filme> getFilmes() {
        return filmes;
    }
}
