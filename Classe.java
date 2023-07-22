/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp.senai.br.projeto_final;

/**
 *
 * @author aluno
 */
public class Classe {
    
    
    public  String nome;
    public Double pontosVida;
    public Double pontosMana;
    public Double pontosStamina;
    public Double forca;
    public Double energia;
    public Double agilidade;
    public Double vitalidade;
    
    public static Classe setMago(){
        
    Classe Personagem = new Classe();
    
    Personagem.nome = "Mago";
    Personagem.pontosVida    = 100.00;
    Personagem.pontosMana    = 350.00;
    Personagem.pontosStamina = 50.00;
    Personagem.forca         = 10.00;
    Personagem.energia       = 250.00;
    Personagem.agilidade     = 30.00;
    Personagem.vitalidade    = 200.00;

    return Personagem;
    
    }
        public static Classe setIron(){
        
    Classe Personagem = new Classe();
    
    Personagem.nome = "Iron";
    Personagem.pontosVida    = 350.00;
    Personagem.pontosMana    = 100.00;
    Personagem.pontosStamina = 200.00;
    Personagem.forca         = 250.00;
    Personagem.energia       = 250.00;
    Personagem.agilidade     = 10.00;
    Personagem.vitalidade    = 500.00;

    return Personagem;
    
    }
    public static Classe setDuelista(){
        
    Classe Personagem = new Classe();
    
    Personagem.nome = "Duelista";
    Personagem.pontosVida    = 150.00;
    Personagem.pontosMana    = 100.00;
    Personagem.pontosStamina = 200.00;
    Personagem.forca         = 500.00;
    Personagem.energia       = 250.00;
    Personagem.agilidade     = 100.00;
    Personagem.vitalidade    = 150.00;

    return Personagem;
    
    }
    public static Classe setFaker(){
        
    Classe Personagem = new Classe();
    
    Personagem.nome = "Faker";
    Personagem.pontosVida    = 100.00;
    Personagem.pontosMana    = 150.00;
    Personagem.pontosStamina = 100.00;
    Personagem.forca         = 250.00;
    Personagem.energia       = 250.00;
    Personagem.agilidade     = 650.00;
    Personagem.vitalidade    = 90.00;

    return Personagem;
    
    }
}
