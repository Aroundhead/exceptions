import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();
        int indice = 7;
        try {
            System.out.printf("El carácter en el índice %d de la cadena %s es %s", indice, entrada, caracterEn.caracterEn(entrada, indice));
        } catch(Exception e) {
            System.out.printf(" Error. El índice %d es mayor que la longitud de la cadena %s", indice, entrada);
        }
    }
}