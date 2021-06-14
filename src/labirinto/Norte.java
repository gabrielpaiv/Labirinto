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
public class Norte{
    Random r = new Random();
    public String[] Norte(int d){
        int num = 1000;
        String evento = null,stats="0",score="1";
        String[] retorno= new String[]{evento,stats,score};
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
                retorno = n.getRetorno();
                break;
            case (1):
                oBau n1= new oBau();
                n1.setVisible(true);
                retorno = n1.getRetorno();
                break;
            case (2):
                oBau n2= new oBau();
                n2.setVisible(true);
                retorno = n2.getRetorno();
                break;
            case (3):
                oBau n3= new oBau();
                n3.setVisible(true);
                retorno = n3.getRetorno();
                break;
            case (4):
                oBau n4= new oBau();
                n4.setVisible(true);
                retorno = n4.getRetorno();
                break;
            case (5):
                oBau n5= new oBau();
                n5.setVisible(true);
                retorno = n5.getRetorno();
                break;
            case (6):
                oBau n6= new oBau();
                n6.setVisible(true);
                retorno = n6.getRetorno();
                break;
            case (7):
                oBau n7= new oBau();
                n7.setVisible(true);
                retorno = n7.getRetorno();
                break;
            case (8):
                oBau n8= new oBau();
                n8.setVisible(true);
                retorno = n8.getRetorno();
                break;
            case (9):
                oBau n9= new oBau();
                n9.setVisible(true);
                retorno = n9.getRetorno();
                break;
        }        
        return retorno;
        
}
}


