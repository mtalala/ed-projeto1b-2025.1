public class Pais {
    
    protected String sigla;
    protected String pais;
    protected int qtdeTitulos;
    protected int qtdeShows;
    protected int qtdeFilmes;
    protected double tarifaBasica;
    protected double tarifaStandard;
    protected double tarifaPremium;
    public Pais(){
        
    }
    //construtor
    public Pais(String sigla, String pais, int qtdeTitulos, int qtdeShows, int qtdeFilmes, double tarifaBasica, double tarifaStandard, double tarifaPremium){
        this.sigla=sigla;
        this.pais=pais;
        this.qtdeTitulos=qtdeTitulos;
        this.qtdeShows=qtdeShows;
        this.qtdeFilmes=qtdeFilmes;
        this.tarifaBasica=tarifaBasica;
        this.tarifaStandard=tarifaStandard;
        this.tarifaPremium=tarifaPremium;
    }
    public double getTarifaBasica() {
        return tarifaBasica;
    }
    public double getTarifaStandard(){
        return tarifaStandard;
    }
    public double getTarifaPremium(){
        return tarifaPremium;
    }

    public void setTarifaStandard(double tarifaStandard){
        this.tarifaStandard=tarifaStandard;
    }
    public void setTarifaBasica(double tarifaBasica){
        this.tarifaBasica=tarifaBasica;
    }
    public void setTarifaPremium(double tarifaPremium){
        this.tarifaPremium=tarifaPremium;
    }


    public void mostraPais(){
        System.out.println (sigla + " - " + pais + " - " + qtdeTitulos + " - " + qtdeShows + " - "+ qtdeFilmes + " - "+ tarifaBasica+ " - "+ tarifaStandard+ " - "+tarifaPremium);
    }
}