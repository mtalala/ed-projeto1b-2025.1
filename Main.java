import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        System.out.println("---MENU---");    
        System.out.println("1. Carregar dados do arquivo");    
        System.out.println("2. Exibir os 5 países que têm a tarifa premium mais cara");    
        System.out.println("3. Exibir todos os registros em ordem crescente de tarifa básica");    
        System.out.println("4. Comparar preço entre dois países");    
        System.out.println("5. Estatísticas ");    
        System.out.println("6. Sair");
        
        Scanner sc = new Scanner(System.in);
        int op;
        Vetor lerArquivo = null;
        do{
            System.out.println("Escolha sua opção: ");
            op = sc.nextInt();
            switch (op){
                case 1:
                    lerArquivo = LeitorArquivo.carregarArquivo("Netflix.txt");
                    lerArquivo.show();
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;  
                case 5:
                    double mediaB = lerArquivo.mediaBasica();
                    double mediaS = lerArquivo.mediaStandard();
                    double mediaP = lerArquivo.mediaPremium();
                    int totalTitulos = lerArquivo.size();
                    
                    System.out.println("---ESTATÍSTICAS---");
                    System.out.printf("Média de tarifas básicas dos países: %.2f \n", mediaB);
                    System.out.printf("Média de tarifas standards dos países: %.2f \n", mediaS);
                    System.out.printf("Média de tarifas premiuns dos países: %.2f \n", mediaP);
                    System.out.println("Soma total dos títulos do catálogo: " + totalTitulos);
                    //System.out.println("País com a tarifa mais cara: " primeiro item da lista ordenada em ordem crescente de tarifa);
                    break;
                default:
            }
        }while(op!=6);
        
        
    } 
}