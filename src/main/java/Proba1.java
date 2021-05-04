/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DAM1_Alu13
 */
public class Proba1 {
    
    public static int suma(int a, int b){
        return a+b;
    }
    
    public static float suma(float a, float b){
        return a+b;
    }
    
    public static int produto(int a, int b){
        return a*b;
    }
    
    public static float produto(float a, float b){
        return a*b;
    }
    
    public static int numCaracteres(String persoa){
       return persoa.length();
    }
    
    public static void saudo(){
        System.out.println("Ola ");
    }
    
    public static void saudo2(){
        System.out.println("Ola2 ");
    }
    
    public static void main(String[] args) {
        System.out.println("Primeiro saúdo");
        System.out.println("Paquito ten: "+numCaracteres("Paquito")+" caracteres");
    }
}
