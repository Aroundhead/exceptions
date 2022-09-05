
import java.util.Scanner;
import java.lang.Math;
public class Ejercicio3 {

    public static void main(String[] args) throws numeronegativoexception{
    Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el valor númerico");
        float r= sc.nextFloat();
        if (r>0){
            float raiz= (float) Math.sqrt(r);
            System.out.println("La raiz cuadrada de "+r+" es "+raiz);
        }else{
            throw new numeronegativoexception("El número ingresado es negativo");
        }
    }
}
