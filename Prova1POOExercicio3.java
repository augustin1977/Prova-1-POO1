package prova1pooexercicio3;

import java.util.Scanner;

public class Prova1POOExercicio3 {

    public static float[] leiaLados( float[] triangulo){
        int i;
        Scanner input=new Scanner(System.in);
        
        for(i=0;i<3;i++){
            System.out.printf("Digite o %dº lado do triangulo\n:",i+1);
            triangulo[i]=input.nextFloat();
        }
        return triangulo;
    }
    public static boolean eValido(float[] triangulo){
        return (triangulo[2]<triangulo[0]+triangulo[1]) &&
                (triangulo[1]<triangulo[0]+triangulo[2]) &&
                (triangulo[0]<triangulo[2]+triangulo[1]);
    }
    public static String tipodeTrinagulo(float[] triangulo){
        if (triangulo[0]==triangulo[1]&& triangulo[1]==triangulo[2]){
            return "Equilátero";
        }
        else if (triangulo[0]!= triangulo[1] && triangulo [1]!= triangulo[2] && triangulo[2]!=triangulo[0]){
            return "Escaleno";
        }else{
            return "Isóceles";
        }
    }
    public static void main(String[] args) {
        System.out.println("Inicio");
        float triangulo[]=new float[3];
        boolean verdadeiro;
        triangulo=leiaLados(triangulo);
        verdadeiro=eValido(triangulo);
        if (verdadeiro){
            System.out.println("O Trinagulo é válido e "+tipodeTrinagulo(triangulo));
        }
        else{
            System.out.println("O triangulo não é valido");
        }
    }

}


