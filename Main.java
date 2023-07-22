/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp.senai.br.projeto_final;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Main {
    
    
    
    public static void main(String[] args) {
        
        
          Personagem personagemUm   = new Personagem();
          Personagem personagemDois = new Personagem();
          Batalha ultimateBattle    = new Batalha();
          
          Ataque ataqueUm = new Ataque();
          Ataque ataqueDois = new Ataque();
          
          

          
          personagemUm.setAtibutos(100.00, 100.00, 100.00, 25.00, 25.00,25.00,25.00);
          
          personagemDois.setAtibutos(100.00, 100.00, 100.00, 25.00, 25.00, 25.00, 25.00);
          
          ataqueUm.setAtributos(50.00, 1.00, 50.00, 0.00);
          
          ataqueDois.setAtributos(30.00, 1.00, 10.00, 0.00);
          
          ultimateBattle.setPersonagemUm(personagemUm);
          ultimateBattle.setPersonagemDois(personagemDois); 
          
          ultimateBattle.setNomes();
          ultimateBattle.setClasses();
          
          ultimateBattle.setAtaqueUm(ataqueUm);
          ultimateBattle.setAtaqueDois(ataqueDois);
          
          while(ultimateBattle.emAdamento == true){
              
              ultimateBattle.ataquePersonagemUm();
              
              if(ultimateBattle.getPersonagemDois().getPontosVida() == 0.00 ||
                   ultimateBattle.getPersonagemUm().getPontosVida() == 0.00){                    
                   ultimateBattle.emAdamento = false;    
                }
              
              ultimateBattle.ataquePersonagemDois();
              
//              System.out.println(ultimateBattle.getPersonagemDois().getPontosVida());
//              
//              System.out.println(ultimateBattle.getPersonagemUm().getPontosVida());
              

                if(ultimateBattle.getPersonagemDois().getPontosVida() == 0.00 ||
                   ultimateBattle.getPersonagemUm().getPontosVida() == 0.00){                    
                   ultimateBattle.emAdamento = false;    
                }
          }
           System.out.printf("Vida P1: %f \n", ultimateBattle.getPersonagemUm().getPontosVida());
           System.out.printf("Vida P2: %f \n", ultimateBattle.getPersonagemDois().getPontosVida());
          
    }
}
