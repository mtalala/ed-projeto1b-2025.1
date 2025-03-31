import java.io.*;

public class LeitorArquivo{
    public static Vetor carregarArquivo(String arquivo) throws Exception{
        
            Vetor lista = new Vetor(100);

            FileReader arq = new FileReader("C:\\Users\\carol\\OneDrive - Instituto Presbiteriano Mackenzie\\Semestre_03\\Estrutura_Dados\\ed2-projeto-1b-1\\Netflix\\src\\Netflix.txt");
            BufferedReader br = new BufferedReader(arq);
            String linha = null;
            linha = br.readLine();  
            int cont = 0;
    
            while (linha!=null){
                
                String [] dados = linha.split(",");
                Pais p = new Pais();
                
                p.sigla = dados[0];
                p.pais = dados[1];
                p.qtdeTitulos = Integer.parseInt(dados[2]);
                p.qtdeShows = Integer.parseInt(dados[3]);
                p.qtdeFilmes = Integer.parseInt(dados[4]);
                p.tarifaBasica = Double.parseDouble(dados[5]);
                p.tarifaStandard = Double.parseDouble(dados[6]);
                p.tarifaPremium =  Double.parseDouble(dados[7]);
                lista.add(cont,p);
                linha = br.readLine(); 
                cont++;
            }
            return lista;
    }
        
}