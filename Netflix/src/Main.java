import java.util.Scanner;
//SRS PROFESSORES, ALTEREM O CAMINHO DO ARQUIVO NETFLIX.TXT PARA QUE O CODIGO FUNCIONE CORRETAMENTE! OBRIGADA
public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int op;
        do{

            System.out.println("\n----------  MENU  ----------");    
            System.out.println("1. Carregar dados do arquivo");    
            System.out.println("2. Exibir os 5 países que têm a tarifa premium mais cara");    
            System.out.println("3. Exibir todos os registros em ordem crescente de tarifa básica");    
            System.out.println("4. Comparar preço entre dois países");    
            System.out.println("5. Estatísticas ");    
            System.out.println("6. Sair");
            System.out.println("\nEscolha sua opção: ");
            op = sc.nextInt();
            switch (op){
                case 1:
                    Vetor lerArquivo = LeitorArquivo.carregarArquivo("Netflix.txt");
                    lerArquivo.show();
                    break;
                case 2:
                    Vetor ordenaPremium = LeitorArquivo.carregarArquivo("Netflix.txt");
                    ordenaPremium.ordenaPremiumDecrescente();
                    break;
                case 3:
                    Vetor ordenaBasica= LeitorArquivo.carregarArquivo("Netflix.txt");
                    ordenaBasica.ordenaBasicaCrescente();
                    break;
                    
                case 4:
                    Vetor comparaPais= LeitorArquivo.carregarArquivo("Netflix.txt");
                    Scanner entrada = new Scanner(System.in);

                    String sigla1;
                    String sigla2;

                    System.out.println("Digite a sigla do primeiro país que deseja comparar");
                    sigla1 = entrada.nextLine();
                    System.out.println("Digite a sigla do segundo país que deseja comparar");
                    sigla2 = entrada.nextLine();

                    comparaPais.compararTarifasEntrePaises(sigla1,sigla2);

                    break;
                case 5:
                    Vetor estatistica= LeitorArquivo.carregarArquivo("Netflix.txt");
                    estatistica.estatisticaTarifas();

                    break;
                case 6: 
                System.out.println("Link para o vídeo de apresentação do projeto: https://youtu.be/Fw0JwOl3wUY?si=rcA8ol-WL07vDXPY");
                    break;
                default:
            }
        }while(op!=6);
        
        
    }    
}
