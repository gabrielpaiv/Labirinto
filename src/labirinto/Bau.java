/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labirinto;

import java.util.Random;

/**
 *
 * @author gabriel.paiva
 */
public class Bau {
    Random r = new Random();
    public String[] Bau(){
        String evento=null,stats=null,score=null;
        int num=r.nextInt(30);        
        switch (num){
            case (0):
                evento="Neste Baú tem apenas Pedras sem valor!";
                break;
            case (1):
                evento="É uma Cilada.";
                score="-2";
                break;
            case (2):
                evento="Encontrou algumas Moedas de ouro!";
                score="+3";
                break;
            case (3):
                evento="Armadilha Pegajosa";
                score="-2";
                break;
            case (4):
                evento="Reliquia ";
                score="+10";
                break;
            case (5):
                evento="Disparou um Alarme.";
                score="-4";
                break;
            case (6):
                evento="Uau! Uma bolsa com pedras preciosas!";
                score="+10";
                break;
            case (7):
                evento="É uma Cilada.";
                score="-2";
                break;
            case (8):
                evento="Disparou um Alarme.";
                score="-4";
                break;
            case (9):
                evento="Você encontrou uma bolsa com veneno!";
                score="-5";
                break;
            case (10):
                evento="Neste Baú tem apenas Pedras sem valor!";
                break;
            case (11):
                evento="Disparou um Alarme.";
                score="-4";
                break;
            case (12):
                evento="É uma varinha mágica!";
                score="+5";
                break;
            case (13):
                evento="Encontrou algumas Moedas de ouro!";
                score="+3";
                break;
            case (14):
                evento="Encontrou algumas Moedas de ouro!";
                score="+3";
                break;    
            case (15):
                evento="Armadilha Pegajosa";
                score="-2";
                break;
            case (16):
                evento="Você encontrou uma bolsa com veneno!";
                score="-5";
                break;
            case (17):
                evento="Encontrou algumas Moedas de ouro!";
                score="+3";
                break;
            case (18):
                evento="É uma Cilada.";
                score="-2";
                break;
            case (19):
                evento="Neste Baú tem apenas Pedras sem valor!";
                break;    
            case (20):
                evento="Você encontrou um mapa que pode te ajudar a sair!";
                score="+20";
                break;
            case (21):
                evento="Você encontrou uma bolsa com veneno!";
                score="-5";
                break;
            case (22):
                evento="Reliquia ";
                score="+10";
                break;
            case (23):
                evento="Uau! Uma bolsa com pedras preciosas!";
                score="+10";
                break;
            case (24):
                evento="Armadilha Pegajosa.";
                score="-2";
                break;
            case (25):
                evento="Reliquia.";
                score="+10";
                break;
            case (26):
                evento="Neste Baú tem apenas Pedras sem valor!";
                break;
            case (27):
                evento="Encontrou algumas Moedas de ouro!";
                score="+3";
                break;
            case (28):
                evento="Ual! Uma bolsa com pedras preciosas!";
                score="+10";
                break;
            case (29):
                evento="Armadilha Pegajosa.";
                score="-2";
                break;
        }
        String[] retorno = new String []{evento,stats,score};
        return retorno;
    }
}
