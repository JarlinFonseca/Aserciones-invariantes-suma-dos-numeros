
import java.util.*;

public class Operaciones {

    private long numero1;
    private long numero2;

    public Operaciones(long num1, long num2) {
        this.numero1 = num1;
        this.numero2 = num2;
        invariante();
    }

    /**
     * Metodo que contiene las aserciones invariantes que se deben cumplir.
     */
    private void invariante() {
        //Los numeros tienen que ser positivos 
        assert (this.numero1 >= 0 && this.numero2 >= 0) : "Los numeros deben ser positivos";
        //La resta de la suma y el numero2 debe ser siempre igual al numero1
        assert (this.numero1 == this.sumarNumeros() - this.numero2) : "El numero " + numero1
                + " debe ser igual a la resta de la suma " + sumarNumeros() + " y el numero " + numero2;
    }

    /**
     *
     * Metodo Decorador que retorna un long de sumarNumeros2()
     */
    public long sumarNumeros() {
        return this.sumarNumeros2();
    }

    /**
     *
     * Metodo que retorna un long de la suma de dos numeros.
     */
    private long sumarNumeros2() {
        return this.numero1 + this.numero2;

    }

    @Override
    public String toString() {
        return "La suma del numero " + this.numero1 + " y el numero " + this.numero2 + " es: " + this.sumarNumeros();
    }

    public long getNumero1() {
        return numero1;
    }

    public void setNumero1(long numero1) {
        this.numero1 = numero1;
    }

    public long getNumero2() {
        return numero2;
    }

    public void setNumero2(long numero2) {
        this.numero2 = numero2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long numero1 = sc.nextLong();
        long numero2 = sc.nextLong();
        Operaciones o = new Operaciones(numero1, numero2);
        System.out.println(o.toString());

    }

}
