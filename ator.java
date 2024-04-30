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
    
      String getNome() {
        return nome;
    }

     String getPapel() {
        return papel;
    }
}
