/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uvvflix;

/**
 *
 * @author alunolab10
 */
public class sessao {
    boolean statusSessao;
    String horario;
    

    public String gethorario (){
        return horario;
        
}
    public void exibirhorario(){
        System.out.println("O horário da sessão é:" + this.horario);
    }
    
}
