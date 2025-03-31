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
        do{
            System.out.println("Escolha sua opção: ");
            op = sc.nextInt();
            switch (op){
                case 1:
                    Vetor lerArquivo = LeitorArquivo.carregarArquivo("Netflix.txt");
                    lerArquivo.show();
                case 2:
                    Vetor ordenaPremium = LeitorArquivo.carregarArquivo("Netflix.txt");
                    ordenaPremium.ordenaPremiumDecrescente();
                case 3:
                    Vetor ordenaBasica= LeitorArquivo.carregarArquivo("Netflix.txt");
                    ordenaBasica.ordenaBasicaCrescente();
                    
                case 4:
                case 5:
                
                default:
            }
        }while(op!=6);
        
        
    }    
}
