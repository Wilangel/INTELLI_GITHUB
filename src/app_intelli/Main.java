package app_intelli;

public class Main {
    public static void main(String[] args) {


        CapturaNumeros Cap = new CapturaNumeros();
        Calculadora Cal = new Calculadora();

        Cap.Capturar();


        System.out.println("El Resultado es: " + Cal.Calcular(Cap.num1, Cap.num2) );

    }
}
