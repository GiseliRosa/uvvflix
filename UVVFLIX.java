/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uvvflix;

/**
 *
 * @author alunolab10
 */
public class UVVFLIX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
    Ator ator1 = new Ator(1, "Timothee Chalamet", "Paul");
    Ator ator2 = new Ator(2, "Hailee Steinfeld", "Emily Dickinson");

    Filme filme1 = new Filme(1, "Duna", "Ficção Científica", 148);
    Filme filme2 = new Filme(2, "Interstellar", "Ficção Científica", 169);

   
    Sala sala1 = new Sala(1, 100, "3D", "Centro");
    Sala sala2 = new Sala(2, 80, "2D", "Lateral");

   
    Sessao sessao1 = new Sessao("20:00", filme1, sala1);
    Sessao sessao2 = new Sessao("22:30", filme2, sala2);

    // Exibindo informações das sessões
    sessao1.exibirHorario();
    sessao2.exibirHorario();

    }
    }
    
