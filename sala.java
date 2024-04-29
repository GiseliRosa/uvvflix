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
    
    void cadastrar (sala sa){
        salas.add(sa);
    }
    
    void lersala (sala sa){
        int index;
        index = InOut.LeInt(frase:"Escreva o id da sala que queira ler:");
        InOut.MsgInformacao(cabecalho:"sala" + ListaSala.get(index-1)); (frase:"assentos: "+ this.numAssentos + "\ntipoTela: "+ this.tipoTela + "\nlocalização" + this.localizacao + "Id:" + this.idSala);
    }
    
    void removersala (sala sa){
        int index;
        index = IntOut.LeInt(frase:"Digite o Id da sala que vai ser removido:");
        Listasala.remove(index: index - 1);
        InOut.MsgdeInformacao(cabecalho:"sala", frase: "Removida")
    }
    
    void alterarsala (sala sa){
        int index;
        String var;
        index = inOut.LeInt(frase:"Digite o id da sala que vai ser alterada:");
        
    }
}
