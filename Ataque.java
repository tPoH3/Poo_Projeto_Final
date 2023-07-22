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
public class Ataque {
    public String nome;
    private Double qtdMana;
    private Double danoMagico;
    private Double danoFisico;
    private Double requisitoMana;
    private Double requisitoStamina;
    
    public void setAtributos(Double requisitoMana,Double requisitoStamina,Double danoMagico, Double danoFisico){
        
        this.danoMagico       = danoMagico;
        this.danoFisico       = danoFisico;
        this.requisitoMana    = requisitoMana;
        this.requisitoStamina = requisitoStamina;
                
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getQtdMana() {
        return qtdMana;
    }

    public void setQtdMana(Double qtdMana) {
        this.qtdMana = qtdMana;
    }

    public Double getDanoMagico() {
        return danoMagico;
    }

    public void setDanoMagico(Double danoMagico) {
        this.danoMagico = danoMagico;
    }

    public Double getDanoFisico() {
        return danoFisico;
    }

    public void setDanoFisico(Double danoFisico) {
        this.danoFisico = danoFisico;
    }

    public Double getRequisitoMana() {
        return requisitoMana;
    }

    public void setRequisitoMana(Double requisitoMana) {
        this.requisitoMana = requisitoMana;
    }

    public Double getRequisitoStamina() {
        return requisitoStamina;
    }

    public void setRequisitoStamina(Double requisitoStamina) {
        this.requisitoStamina = requisitoStamina;
    }
    public Scanner teclado = new Scanner(System.in);
    public void setAtaqueUm (Double requisitoMana, Double requisitoStamina, Double danoMagico, Double danoFisico){
        
        
        
        System.out.println("Por favor distribua os atributos da forma que desejar:");
        System.out.println("Voce so tem 100 pontos pra distribuir");
        
        
        
        System.out.println("Por favor Indique o quanto vc quer colocar de Mana do ataque 1");
        this.requisitoMana = requisitoMana;
        requisitoMana      = teclado.nextDouble();
        
        System.out.println("Por favor Indique o quanto vc quer colocar de Stamina do ataque 1");
        this.requisitoStamina = requisitoStamina;
        requisitoStamina      = teclado.nextDouble();
        
        
        System.out.println("Por favor Indique o quanto vc quer colocar de Dano Fisico do ataque 1");
        this.danoFisico = danoFisico;
        danoFisico      = teclado.nextDouble();
        
        
        System.out.println("Por favor Indique o quanto vc quer colocar de Dano Magico do ataque 1");
        this.danoMagico      = this.danoMagico;
        this.danoMagico      = teclado.nextDouble();
        
        if(requisitoMana + requisitoStamina + danoFisico + danoMagico > 100){
            System.out.println("A soma dos atributos utapassou o numero 100!!!");
        }
        
        System.out.println("Por favor Indique o quanto vc quer colocar de Mana do ataque 2");
        this.requisitoMana = requisitoMana;
        requisitoMana      = teclado.nextDouble();
        
        System.out.println("Por favor Indique o quanto vc quer colocar de Stamina do ataque 2");
        this.requisitoStamina = requisitoStamina;
        requisitoStamina      = teclado.nextDouble();
        
        
        System.out.println("Por favor Indique o quanto vc quer colocar de Dano Fisico do ataque 2");
        this.danoFisico = danoFisico;
        danoFisico      = teclado.nextDouble();
        
        
        System.out.println("Por favor Indique o quanto vc quer colocar de Dano Magico do ataque 2");
        this.danoMagico      = this.danoMagico;
        this.danoMagico      = teclado.nextDouble();
        
        if(requisitoMana + requisitoStamina + danoFisico + danoMagico > 100){
            System.out.println("A soma dos atributos utapassou o numero 100!!!");
        }
        
        
    }
    
    
}
