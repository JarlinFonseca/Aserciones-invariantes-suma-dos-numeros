
import java.util.*;

public class Suma {

    public static int suma2(int numero1, int numero2) {
        return numero1 + numero2;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite solo numeros positivos: ");
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();
        int resultado = suma2(numero1, numero2);

        boolean verificar = true;
        if ((numero1 < 0 && verificar)&&numero2>=0) {
            assert !verificar : "El numeros "+numero1+" ingresado debe ser positivo.";
        } else if ((numero2 < 0 && verificar)&&numero1>=0) {
            assert !verificar : "El numeros "+numero2+" ingresado debe ser positivo.";
        }else  {
            assert resultado>=0 : "Ambos numeros ingresados deben ser positivos (" + numero1 + " y " + numero2 + "), y "
                   + "respectivamente su resultado siempre sera negativo.";
        }

        System.out.println("El resultado de la suma de numeros positivos (" + numero1 + " y " + numero2 + ") es: " + resultado);
    }
}
