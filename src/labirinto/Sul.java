/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labirinto;

import java.util.Random;

/**
 *
 * @author Gabriel
 */
public class Sul {
    Random r = new Random();
    public String[] Sul(int d){
        int num = 1000;
        String evento = null,stats="3",score="3";
        if (d==1)
            do{
                num =r.nextInt(10);
                if (num%2==0)
                    break;
            }while(num != 100);
        if (d==2)
            num =r.nextInt(10);
        if (d==3)
            do{
                num=r.nextInt(10);
                if (num %2 != 0)
                    break;
            }while (num!=100);
        switch (num){
            case (0):
                oBau n= new oBau();
                n.setVisible(true);
                break;
            case (1):
                evento="Perna quebrada";
                break;
            case (2):
                evento="Armadilha";
                break;
            case (3):
                evento="Coisa doida";
                break;
            case (4):
                evento="Moeda";
                break;
            case (5):
                evento="Omae wa mou shindeiru";
                break;
            case (6):
                evento="Reliquia";
                break;
            case (7):
                evento="Armadilha dnv";
                break;
            case (8):
                evento="Voce encontrou o templo perdido";
                break;
            case (9):
                evento="Aranhas gigantes";
                break;
        }
        String[] retorno= new String[]{evento,stats,score};
        return retorno;
        
}
}
