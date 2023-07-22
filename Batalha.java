/*
 * Click nbfs://nbhost/SystemFileSystem/Temp lates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp.senai.br.projeto_final;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Batalha {

    private int qtdTurnoLimite;
    private int qtdTurnoAtual;



    public void setEmAdamento(boolean emAdamento) {
        this.emAdamento = emAdamento;
    }
    
    private Ataque ataqueUm;
    private Ataque ataqueDois;
    
    public Personagem PersonagemUm;
    public Personagem PersonagemDois;
    
    public int PersonagemUmVitoria;
    public int PersonagemDoisVitoria;
    
    public boolean emAdamento = true;
    
    public int getQtdTurnoLimite() {
        return qtdTurnoLimite;
    }

    public void setQtdTurnoLimite(int qtdTurnoLimite) {
        this.qtdTurnoLimite = qtdTurnoLimite;
    }

    public int getQtdTurnoAtual() {
        return qtdTurnoAtual;
    }

    public void setQtdTurnoAtual(int qtdTurnoAtual) {
        this.qtdTurnoAtual = qtdTurnoAtual;
    }

    public Personagem getPersonagemUm() {
        return PersonagemUm;
    }

    public void setPersonagemUm(Personagem PersonagemUm) {
        this.PersonagemUm = PersonagemUm;
    }

    public Personagem getPersonagemDois() {
        return PersonagemDois;
    }

    public void setPersonagemDois(Personagem PersonagemDois) {
        this.PersonagemDois = PersonagemDois;
    }
    
        public void setAtaqueUm(Ataque ataqueUm) {
        this.ataqueUm = ataqueUm;
    }

    public void setAtaqueDois(Ataque ataqueDois) {
        this.ataqueDois = ataqueDois;
    }

    public int getPersonagemUmVitoria() {
        return PersonagemUmVitoria;
    }

    public void setPersonagemUmVitoria(int PersonagemUmVitoria) {
        this.PersonagemUmVitoria = PersonagemUmVitoria;
    }

    public int getPersonagemDoisVitoria() {
        return PersonagemDoisVitoria;
    }

    public void setPersonagemDoisVitoria(int PersonagemDoisVitoria) {
        this.PersonagemDoisVitoria = PersonagemDoisVitoria;
    }
    public void ataquePersonagemUm(){
        this.PersonagemUm.consumirMana(ataqueUm.getRequisitoMana());
        this.PersonagemUm.consumirStamina(ataqueUm.getRequisitoStamina());
        
        this.PersonagemDois.sofrerDanoFisico(this.ataqueUm.getDanoFisico());
        this.PersonagemDois.sofrerDanoMagico(this.ataqueUm.getDanoMagico());
        System.out.printf("%s atacou > %s\n",this.PersonagemUm.getNome(),this.PersonagemDois.getNome());

    }
    public void ataquePersonagemDois(){
        this.PersonagemDois.consumirMana(this.ataqueDois.getRequisitoMana());
        this.PersonagemDois.consumirStamina(this.ataqueDois.getRequisitoStamina());
        
        this.PersonagemUm.sofrerDanoFisico(this.ataqueDois.getDanoFisico());
        this.PersonagemUm.sofrerDanoMagico(this.ataqueDois.getDanoMagico()); 
        System.out.printf("%s atacou > %s\n",this.PersonagemDois.getNome(),this.PersonagemUm.getNome());

    }
       public Scanner teclado = new Scanner(System.in);

    public void setNomes(){
        
          System.out.println("Qual o nome do personagem1?");
          String Nome1 = teclado.next();
          
          this.PersonagemUm.setNome(Nome1);
    
          System.out.println("Qual o nome do personagem2?");
          String Nome2 = teclado.next();
          
          this.PersonagemDois.setNome(Nome2);
    }
    
    public void setClasses(){
        System.out.println("por favor selecione a classe do personagem 1:");
        System.out.println("[1] - Mago | [2] - Duelista | [3] - Iron | [4] - Faker");
        int classe = teclado.nextInt();
        
        if( classe == 1){
            this.PersonagemUm.setClasse(Classe.setMago());
        }else if( classe == 2){
            this.PersonagemUm.setClasse(Classe.setDuelista());
        }else if( classe == 3){
            this.PersonagemUm.setClasse(Classe.setIron());
        }else if( classe == 4){
            this.PersonagemUm.setClasse(Classe.setFaker());
        }else{
            System.out.println("Digite uma opcao valida!!!!!");
        }
        int classe_2 = teclado.nextInt();
        if( classe_2 == 1){
            this.PersonagemUm.setClasse(Classe.setMago());
        }else if( classe_2 == 2){
            this.PersonagemUm.setClasse(Classe.setDuelista());
        }else if( classe_2 == 3){
            this.PersonagemUm.setClasse(Classe.setIron());
        }else if( classe_2 == 4){
            this.PersonagemUm.setClasse(Classe.setFaker());
        }else{
            System.out.println("Digite uma opcao valida!!!!!");
        }
        System.out.printf("Class %s Vida: %f",this.PersonagemUm.getClasse().nome,this.PersonagemUm.getClasse().pontosVida);
    }
}
