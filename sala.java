import java.util.ArrayList;
import java.util.List;
public class sala {

    int idSala, numAssentos;
    String tipoTela, localizacao;
    List<sessao> sessoes = new ArrayList<>();
    
    List<sala> salas = new ArrayList<>();
    

    public sala(int idSala, int numAssentos, String tipoTela, String localizacao) {
        this.idSala = idSala;
        this.numAssentos = numAssentos;
        this.tipoTela = tipoTela;
        this.localizacao = localizacao;
       
    }

    public void menu() {

    }
    
    void adicionarSessao(Sessao sessao) {
        sessoes.add(sessao);
    }

     int getNumeroAssentos() {
        return assentos;
    }

     String getTela() {
        return tela;
    }

     String getLocal() {
        return local;
    }

     ArrayList<Sessao> getSessoes() {
        return sessoes;
    }
}

