package calculadora;
import java.util.List;
public class Calculadora {
/*
Clase encargada de contener las funciones encargadas de realizar las operaciones basicas de la calculadora

Para recibir los valores, y no limitarnos a realizar la operacion de dos en dos valores. se utiliza el concepto de

varargs el cual es similar a trabajar con una lista, pero sin tener que definir el tamaño de la misma. Se ve reflejado

la defincion de un argumento seguido de ...  Ejemplo double...


 */
    public static double sumar(List<Double> nums){
        if(nums.isEmpty()) return 0;
        double resultado  = 0;
        for(double i : nums) {
            resultado += i;
        }
        return resultado;
    }

    public double multiplicar(List<Double> nums){
        if(nums.isEmpty()) return 0;
        double resultado = 1;

        for(double i: nums){
            resultado *= i;
        }
        return resultado;
    }

    public double dividir(List<Double> nums){
        if((nums.isEmpty()) || (nums.get(0) == 0)) return 0 ;
        double resultado = nums.get(0);

        for (int i = 1; i < nums.size(); i++){
            if(nums.get(i) == 0){ //se realiza un pequeño manejo de errores. que despues puede corregirse en la clase de dichos manejos
                return 0;
            }else{
                resultado /= nums.get(i);
            }
        }
        return resultado;
        System.out.println("Hola mundo");
    }

    public double restar(List<Double> nums){
        if(nums.isEmpty()) return 0;
        double resultado = nums.get(0);

        for (int i = 1; i < nums.size(); i++){
            resultado -= nums.get(i);
        }
        return resultado;
    }

}
