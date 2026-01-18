package calculadora;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import calculadora.Calculadora;
public class Menu {

    public static void menu(){
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        List<Double> listaNumeros = new ArrayList<>();
        int opcion = 0;


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



            switch(opcion){
                case 1:
                    while (!dato.equals("=")){
                        dato = scanner.next();
                        if (dato.equals("=") ){
                            double resultado = calculadora.sumar(listaNumeros);
                            System.out.println(resultado);
                            break;
                        }else{
                            listaNumeros.add(Double.parseDouble(dato));
                            System.out.println("+");
                        }
                    }
                    break;

                case 2:
                    while (!dato.equals("=")){
                        dato = scanner.next();
                        if (dato.equals("=") ){
                            double resultado = calculadora.restar(listaNumeros);
                            System.out.println(resultado);
                            break;
                        }else{
                            listaNumeros.add(Double.parseDouble(dato));
                            System.out.println("-");
                        }
                    }
                    break;
                case 3:
                    while (!dato.equals("=")){
                        dato = scanner.next();
                        if (dato.equals("=") ){
                            double resultado = calculadora.multiplicar(listaNumeros);
                            System.out.println(resultado);
                            break;
                        }else{
                            listaNumeros.add(Double.parseDouble(dato));
                            System.out.println("*");
                        }
                    }
                    break;

                case 4:
                    while (!dato.equals("=")){
                        dato = scanner.next();
                        if (dato.equals("=") ){
                            double resultado = calculadora.dividir(listaNumeros);
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

