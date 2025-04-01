class Pais {
    
    String sigla;
    String pais;
    int qtdeTitulos;
    int qtdeShows;
    int qtdeFilmes;
    double tarifaBasica;
    double tarifaStandard;
    double tarifaPremium;

   Pais(){
   }

   Pais (String sigla, String pais, int qtdeTitulos, int qtdeShows, int qtdeFilmes, double tarifaBasica, double tarifaStandard, double tarifaPremium){
      this.sigla = sigla;
      this.pais = pais;
      this.qtdeTitulos = qtdeTitulos;
      this.qtdeShows = qtdeShows;
      this.qtdeFilmes = qtdeFilmes;
      this.tarifaBasica = tarifaBasica;
      this.tarifaStandard = tarifaStandard;
      this.tarifaPremium = tarifaPremium;
   }
   public void mostraPais(){
       System.out.println(sigla+" - "+pais+" - "+ qtdeTitulos+" - "+ qtdeShows+" - "+ qtdeFilmes+" - "+ tarifaBasica+" - "+ tarifaStandard+" - "+ tarifaPremium);
   }
}