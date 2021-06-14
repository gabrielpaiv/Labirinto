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
public class Passagem {
    public Passagem(){
        int op;
        Random r= new Random();
        op = r.nextInt(2);
        switch (op){
            case 0:
                oBau b= new oBau();
                b.setVisible(true);
                break;
            case 1:
                Templo t=new Templo();
                t.setVisible(true);
            case 2:
                break;
        }
    }
}
