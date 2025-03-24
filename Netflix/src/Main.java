import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // int opcao;

        // System.out.println("---Menu---");
        // System.out.println("1. Carregar dados do arquivo");
        // System.out.println("2. Exibir os 5 países que têm a tarifa premium mais cara");
        // System.out.println("3. Exibir todos os registros em ordem crescente de tarifa básica");
        // System.out.println("4. Comparar preço entre dois países");
        // System.out.println("5. Estatísticas");
        // System.out.println("6. Sair");

        // Scanner sc = new Scanner(System.in);
        // opcao= sc.nextInt();

        // switch (opcao) {
        //     case 1:
        //     //carrega arq
        //         break;

        //     case 2: 
        //         break;

        //     case 3:
        //         break;

        //     case 4:

        //         break;

        //     case 5: 
        //         break;
        //     case 6:
        //         break;


        //     default:
        //     break;

        // }
        Vetor lista = new Vetor(100);
        
        FileReader arquivo = new FileReader("Netflix.txt");
        BufferedReader br = new BufferedReader(arquivo);
        String linha= null;
        linha =br.readLine();
        int cont =0;

        while(linha!=null){
            String [] dados = linha.split(",");
            Pais p = new Pais();
            p.sigla= dados[0];
            p.pais=dados[1];
            p.qtdeTitulos=Integer.parseInt(dados[2]);
            p.qtdeShows=Integer.parseInt(dados[3]);
            p.qtdeFilmes=Integer.parseInt(dados[4]);
            p.tarifaBasica=Double.parseDouble(dados[5]);
            p.tarifaStandard=Double.parseDouble(dados[6]);
            p.tarifaPremium=Double.parseDouble(dados[7]);

            lista.add(cont,p);
            linha=br.readLine();
            cont++;
        }
        lista.show();

    }

       
    }

    //public void carregar(){
        



//}
