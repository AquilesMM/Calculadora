package calculadora;

import java.util.List;

public class Herramientas {
    public static List validador(List<Double> listaNumeros, double resultado) {
        System.out.print(resultado);
        listaNumeros.clear();
        listaNumeros.add(resultado);
        return listaNumeros;
    }
}
