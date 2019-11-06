
package boletin.pkg6.pkg3;

import java.util.Scanner;

public class Clase3 {
    Scanner sc=new Scanner(System.in);
    private int edad;

    public Clase3(){
    }

   public Clase3(int edad){
        this.edad=edad;
    }
    
    public void setedad(){
        this.edad=edad;
    }
        public int getedad(){
        return edad; 
    }
    public void Paso(int años){
        if (años==0)
            System.out.println("EL RESULTADO ES 0");
        else if(años >=0)
            System.out.println("EL RESULTADO ES +"+años);
        else
            System.out.println("EL RESULTADO ES "+años);
    } 
    public int pedirInt(){

       System.out.println("La edad es: ");
       int ed=sc.nextInt();
       return ed;
    }

    }

