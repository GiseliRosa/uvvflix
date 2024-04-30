package uvvflix;
import java.util.ArrayList;


public class UVVFLIX {

 
    public static void main(String[] args) {
 
    ator ator01= new ator( "Timothee Chalamet", "Paul");
    ator ator02 = new ator( "Hailee Steinfeld", "Emily Dickinson");

    filme filme1 = new filme("Duna", "Ficção Científica", 148);
    filme filme2 = new filme("Interstellar", "Ficção Científica", 169);

   
    sala sala1 = new sala(1, 100, "3D", "Centro");
    sala sala2 = new sala(2, 80, "2D", "Lateral");
    
    private ArrayList<Sala> salas;


     uvvflix() {
        salas = new ArrayList<>();
    }

     void iniciarCadastro() {
        int numeroSalas = InOut.leInt("Quantas salas você deseja cadastrar?");

        for (int i = 0; i < numSalas; i++) {
            int assentos = InOut.leInt("Número de assentos da sala " + (i + 1)+":");
            String tela = InOut.leString("tela da sala  " + (i + 1)+" (ex: IMAX):");
            String local = InOut.leString("Local da sala " + (i + 1)+":");

            Sala sa = new Sala(assentos, tela, local);
            cadastrarSessoes(sala);

            salas.add(sa);
        }
    }

     void cadastrarSessoes(Sala sa) {
        int numSessoes = InOut.leInt("Quantas sessões para a sala " + sala.getLocal() + "?");
        for (int i = 0; i < numSessoes; i++) {
            String status = InOut.leString("Status da sessão" + (i + 1)+" (ex: disponível, lotado):");
            String horario =InOut.leString("Horário da sessão  " + (i + 1)+"(HH:mm):");

            Sessao se = new Sessao(status, horario);
            cadastrarFilmes(se);

            sala.adicionarSessao(se);
        }
    }

     void cadastrarFilmes(Sessao se) {
        int numFilmes = InOut.leInt("Quantos filmes para a sessão às " + sessao.getHorario() + "?");

        for (int i = 0; i < numFilmes; i++) {
            String titulo = InOut.leString("Título do filme " + (i + 1)+":");
            String genero = InOut.leString("Gênero do filme " + (i + 1)+":");
            String duracao = InOut.leString("Duração do filme " + (i + 1)+" (em minutos):");

            Filme fi = new Filme(titulo, genero, duracao);
            cadastrarAtores(filme);

            sessao.adicionarFilme(fi);
        }
    }

     void cadastrarAtores(Filme fi) {
        int numAtores = InOut.leInt("Quantos atores para o filme " + filme.getTitulo() + "?");

        for (int i = 0; i < numAtores; i++) {
            String nome = InOut.leString("Nome do ator " + (i + 1)+":");
            String papel = InOut.leString("Papel do ator " + (i + 1)+":");

            Ator ator = new Ator(nome, papel);
            filme.adicionarAtor(ator);
        }
    }
