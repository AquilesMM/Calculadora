package calculadora;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import calculadora.Calculadora;
public class Menu {

    public static void menu(){
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        int opcion = scanner.nextInt();
        String dato = scanner.next();
        List<Double> listaNumeros = new ArrayList<>();


        while(opcion != 5) {
            System.out.println("CALCULADORA");
            System.out.println("1- Sumar");
            System.out.println("2- Restar");
            System.out.println("3- Multiplicar");
            System.out.println("4- Dividir");
            System.out.println("5- Salir");
            System.out.print("Ingrese la opcion que desee: ");



            switch(opcion){
                case 1:
                    while (dato != "="){
                        if (dato == "="){
                            System.out.println(calculadora.sumar(listaNumeros);
                            break;
                        }else{
                            listaNumeros.add(Double.parseDouble(dato));
                        }
                    }

                case 2:
                    while (dato != "="){
                        if (dato == "="){
                            System.out.println(calculadora.restar(listaNumeros);
                            break;
                        }else{
                            listaNumeros.add(Double.parseDouble(dato));
                        }
                    }

                case 3:
                    while (dato != "="){
                        if (dato == "="){
                            System.out.println(calculadora.multiplicar(listaNumeros);
                            break;
                        }else{
                            listaNumeros.add(Double.parseDouble(dato));
                        }
                    }
                case 4:
                    while (dato != "="){
                        if (dato == "="){
                            System.out.println(calculadora.dividir(listaNumeros);
                            break;
                        }else{
                            listaNumeros.add(Double.parseDouble(dato));
                        }
                    }
                case 5:
                    System.out.println("FIN DEL PROGRAMA");
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
            }

        }
    }

}

