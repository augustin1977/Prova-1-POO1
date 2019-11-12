package prova1pooexercicio2;

import java.util.Scanner;

public class Prova1POOExercicio2 {

    public static int buscaAgenda(String nome[], String buscaNome){
        int i=0;
        boolean busca=true;
        while(i<nome.length && busca ){
            if (nome[i]==(buscaNome)){
                busca=false;
                
            }
            i++;
        }
        if (!busca){
            return i-1;
        }
        else{
            return -1;
        }
    }
    
    public static void main(String[] args) {
        int n,i;
        System.out.printf("Quanto telefones deseja entrar?\n:");
        Scanner input= new Scanner(System.in);
        n=Integer.parseInt(input.nextLine());
        String buscaNome;
        String[] tele=new String[n];
        String[] nome=new String[n];
        //nome[0]=input.nextLine();// esta linha não tem função é só para apagar o buffer to teclado, pois não conheço o comando de apagamento do buffer de teclado
        for(i=0;i<n;i++){
            System.out.printf("digite o Telefone do %dº telefone\n:",i+1);
            tele[i]= input.nextLine();
            System.out.printf("digite o Nome do %dº telefone\n:",i+1);
            nome[i]=input.nextLine();
        }
        System.out.println("Qual nome deseja buscar na agenda?");
        buscaNome=input.nextLine();
        i=buscaAgenda(nome,buscaNome);
        if(i==-1){
            System.out.printf("O nome %s não está na agenda!!\n",buscaNome);
       
        }
        else{
            System.out.printf("O numero de %s é %s\n",nome[i],tele[i]);
        }
        
    }

}