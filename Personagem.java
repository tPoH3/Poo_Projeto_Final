/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp.senai.br.projeto_final;

/**
 *
 * @author aluno
 */
public class Personagem {
    private String nome;
    private Double pontosVida;
    private Double pontosMana;
    private Double pontosStamina;
    private Double forca;
    private Double energia;
    private Double agilidade;
    private Double vitalidade;
    public Classe classe;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setAtibutos(double vida, double forca, double mana, double stamina, double agilidade, double energia, double vitalidade){
        this.pontosVida    = vida;
        this.pontosMana    = mana;
        this.pontosStamina = stamina;
        this.forca         = forca;
        this.energia       = energia;
        this.agilidade     = agilidade; 
        this.vitalidade    = vitalidade;
    }
         
    public Double getPontosVida() {
        return pontosVida;
    }

    public void setPontosVida(Double pontosVida) {
        this.pontosVida = pontosVida;
    }

    
   
    
    
    public Double getPontosMana() {
        return pontosMana;
    }

    public void setPontosMana(Double pontosMana) {
        this.pontosMana = pontosMana;
    }

    public Double getPontosStamina() {
        return pontosStamina;
    }

    public void setPontoStamina(Double pontosStamina) {
        this.pontosStamina = pontosStamina;
    }

    public Double getForca() {
        return forca;
    }

    public void setForca(Double forca) {
        this.forca = forca;
    }

    public Double getEnergia() {
        return energia;
    }

    public void setEnergia(Double energia) {
        this.energia = energia;
    }

    public Double getAgilidade() {
        return agilidade;
    }

    public void setAgilidade(Double agilidade) {
        this.agilidade = agilidade;
    }

    public Double getVitalidade() {
        return vitalidade;
    }

    public void setVitalidade(Double vitalidade) {
        this.vitalidade = vitalidade;
    }
    
    public void consumirMana(double mana){
        this.pontosMana -= mana;
    }
    public void consumirStamina(double stamina){
        this.pontosStamina -= stamina;
    }
    public void sofrerDanoFisico(double dano){
        this.pontosVida -= dano;
    }
    public void sofrerDanoMagico(double dano){
        this.pontosVida -= dano;

    }
        public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        
    this.classe = classe;
    this.pontosVida = classe.pontosVida;
    this.pontosMana = classe.pontosMana;
    this.pontosStamina = classe.pontosStamina;
    this.forca = classe.forca;
    this.energia  = classe.energia;
    this.agilidade = classe.agilidade;
    this.vitalidade = classe.vitalidade;
    }
}