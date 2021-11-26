/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Equipo
 */
public class Contador {
    
    public static void contar(int inicio, int fin){
        if(inicio > fin){
            System.out.println("El número inicial debe ser menor al final");
            return;
        }
        
        System.out.println("Iniciando conteo del número: "+ inicio+" hasta el número: "+fin);
        contarRecursivo(inicio, fin);
    }
    
    private static void contarRecursivo(int i, int f){
        imprimirCaracteristicasNumero(i);
        if(i < f )
            contarRecursivo(i+1, f);
        
    }
    
    public static boolean esPar(int n){
        return n%2 == 0;
    }
    
    
    public static boolean esPrimo(int numero) {
        if (numero == 0 || numero == 1 || numero == 4) {
            return false;
        }
        for (int x = 2; x < numero / 2; x++) {
            if (numero % x == 0)
                return false;
        }
        return true;
    }
    
    public static boolean esOrdinal(int n) {
        return n%5 == 0 && n%2 == 0; 
    }
    
    private static void imprimirCaracteristicasNumero(int n){
        System.out.println(n);
        if(esPar(n))
            System.out.println(n+" es par");
        if(esPrimo(n))
            System.out.println(n+" es primo");
        if(esOrdinal(n))
            System.out.println(n+" es ordinal");
    }
}
