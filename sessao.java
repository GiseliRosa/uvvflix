/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class sessao {
    boolean statusSessao;
    String horario;
    
    ublic Sessao(String horario, Filme filme, Sala sala) {
        this.horario = horario;
        this.filme = filme;
        this.sala = sala;
        }

    public String gethorario (){
        return horario;
        
}
    public void exibirhorario(){
        System.out.println("O horário da sessão é:" + this.horario);
    }
    
}


