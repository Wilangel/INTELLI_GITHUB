package app_intelli;

public class Calculadora {

    CapturaNumeros Cap = new CapturaNumeros();

    int Resultado;

    public int Calcular(int num1, int num2){
        Resultado = num1 + num2;

        return Resultado;
    }
}
