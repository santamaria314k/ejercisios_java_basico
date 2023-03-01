
import java.util.Scanner;



public class carasello {

    public static void main(String[] args) {
        Scanner imprimir = new Scanner (System.in);
        int valorn=1;
int variableale =0 ;

System.out.println("Debes escribir( cara o sello)");
imprimir.nextLine ();
 

variableale =  (int) (Math.random()*2+1) ;

        if (valorn != variableale ) {
            System.out.println("lo siento has perdido  :(");
        } else {
            System.out.println("has ganado  buena suerte :)");
        }


        imprimir.close();

    }
}
