package calculadora;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import calculadora.Calculadora;
import calculadora.Herramientas;
public class Menu {

    public static void menu(){
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        List<Double> listaNumeros = new ArrayList<>();
        int opcion = 0;
        double resultado = 0;
        Herramientas herramientas = new Herramientas();


        while(opcion != 6) {
            System.out.println("CALCULADORA");
            System.out.println("1- Sumar");
            System.out.println("2- Restar");
            System.out.println("3- Multiplicar");
            System.out.println("4- Dividir");
            System.out.println("5- Limpiar");
            System.out.println("6- Salir");
            System.out.print("Ingrese la opcion que desee: ");
            opcion = scanner.nextInt();
            String dato = ".";
            System.out.print(": ");



            switch(opcion) {
                case 1:
                    if (!listaNumeros.isEmpty()) {
                        listaNumeros = herramientas.validador(listaNumeros, resultado);
                        System.out.print(" + ");
                    }
                    while (!dato.equals("=")) {
                        dato = scanner.next();
                        if (dato.equals("=")) {
                            resultado = calculadora.sumar(listaNumeros);
                            System.out.println(resultado);
                            break;
                        } else {
                            listaNumeros.add(Double.parseDouble(dato));
                            System.out.print(" + ");
                        }
                    }
                    break;
                case 2:
                    if (!listaNumeros.isEmpty()) {
                        listaNumeros = herramientas.validador(listaNumeros, resultado);
                        System.out.print(" - ");
                    }
                    while (!dato.equals("=")){
                        dato = scanner.next();
                        if (dato.equals("=") ){
                            resultado = calculadora.restar(listaNumeros);
                            System.out.println(resultado);
                            break;
                        }else{
                            listaNumeros.add(Double.parseDouble(dato));
                            System.out.println("-");
                        }
                    }
                    break;
                case 3:
                    if (!listaNumeros.isEmpty()) {
                        listaNumeros = herramientas.validador(listaNumeros, resultado);
                        System.out.print(" * ");
                    }
                    while (!dato.equals("=")){
                        dato = scanner.next();
                        if (dato.equals("=") ){
                            resultado = calculadora.multiplicar(listaNumeros);
                            System.out.println(resultado);
                            break;
                        }else{
                            listaNumeros.add(Double.parseDouble(dato));
                            System.out.println("*");
                        }
                    }
                    break;
                case 4:
                    if (!listaNumeros.isEmpty()) {
                        listaNumeros = herramientas.validador(listaNumeros, resultado);
                        System.out.print(" / ");
                    }
                    while (!dato.equals("=")){
                        dato = scanner.next();
                        if (dato.equals("=") ){
                            resultado = calculadora.dividir(listaNumeros);
                            System.out.println(resultado);
                            break;
                        }else{
                            listaNumeros.add(Double.parseDouble(dato));
                            System.out.println("/");
                        }
                    }
                    break;
                    case 5:
                        listaNumeros.clear();
                        break;
                    case 6:
                        System.out.println("FIN DEL PROGRAMA");
                        break;
                    default:
                        System.out.println("Opcion Incorrecta");
            }

        }
    }

}

