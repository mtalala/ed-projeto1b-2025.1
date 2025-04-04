class Vetor {
    Pais[ ] A; // armazena os elementos do vetor
    int capacity; // capacidade do vetor - length
    int size; // elementos no vetor - qtde elementos
    
    public Vetor(int capacity) {
        A = new Pais[capacity];
        this.size = 0;
        this.capacity = capacity;
    }
    
    public boolean isEmpty() {
        //verifica se o Vetor está vazio ou não
        if (size==0)
            return true;
        else
            return false;
    }

    public boolean isFull() {
        //verifica se o Vetor está cheio
        if (size==capacity)
            return true;
        else
            return false;            
    }
            
    public int size() {
        // retorna a qtde de elementos no Vetor
        return size;
    }
    
    public Pais get(int i) throws Exception {
        // retorna o elemento da posição i
        if (i<0 || i>=size)
            throw new Exception("Posição inválida!!");
        return A[i];
    }
    
    public void set(int i, Pais n) throws Exception {
        //substitui o conteúdo da posição i por n
        if (i<0 || i>=size)
            throw new Exception("Posição inválida!!");
        A[i]=n;
    }
    
    public void add(int i, Pais n) throws Exception {
        //adiciona o elemento n na posição i
        if (isFull()) {
            throw new Exception("A lista está cheia!! Impossível inserir");
        }
        if (i<0 || i > size) {
            throw new Exception("Posição inválida!!");
        }
        for (int p = size; p > i; p--) {
            A[p] = A[p - 1];
        }
        A[i] = n;
        size++;
    }
    
    public void remove(int i) throws Exception {
        //remove o elemento da posição i
        if (isEmpty())
            throw new Exception("A lista está vazia!! Impossível remover");
        if (i<0 || i > size-1) {
            throw new Exception("Posição inválida!!");
        }
        for (int p = i; p<=size-2;p++){
            A[p]=A[p+1];
        }
        size--;
    }
    
    public int search(String n) {
        // busca o valor n na lista - retornando a posição ou -1, se não existir
        for (int i=0;i<size;i++)
            if (A[i].sigla.equalsIgnoreCase(n))
                return i;
        return -1;
    }
    
    public void show() {
       // mostra todo o conteúdo da lista
       for (int i=0;i<size;i++)
           A[i].mostraPais();
        
       System.out.println("\nFim da lista!!");
    }
    
    public void ordenaBasicaCrescente (){
        // inicia o Bubble Sort
        for(int j=0; j<size; j++)
            for(int i=1; i<size-j;i++)
                if(A[i-1].getTarifaBasica()>A[i].getTarifaBasica()){
                //troca os elementos
                Pais temp = A[i];
                A[i]=A[i-1];
                A[i-1] = temp;
                }
        for(int i =0;i<size;i++){
            A[i].mostraPais();
        }   
    }

    public void ordenaPremiumDecrescente(){
        // inicia o Bubble Sort
        for(int j=0; j<size-1; j++){
            for(int i=0; i<size-1-j;i++){
                if(A[i].getTarifaPremium()<A[i+1].getTarifaPremium()){
                    //troca os elementos
                    Pais temp = A[i];
                    A[i]=A[i+1];
                    A[i+1]=temp;
                }   
            }
        }
        for(int i =0;i<5;i++){
            A[i].mostraPais();
        }
    }

    // Método que compara as tarifas de dois países a partir de suas siglas
    public void compararTarifasEntrePaises(String sigla1, String sigla2) {
        // Busca as posições (índices) das siglas informadas no vetor
        int index1 = search(sigla1);
        int index2 = search(sigla2);

        // Verifica se algum dos países não foi encontrado
        if (index1 == -1 || index2 == -1) {
            if (index1 == -1)
                System.out.println("País com sigla '" + sigla1 + "' não encontrado.");
            if (index2 == -1)
                System.out.println("País com sigla '" + sigla2 + "' não encontrado.");
        } else {
            // Recupera os objetos Pais correspondentes
            Pais p1 = A[index1];
            Pais p2 = A[index2];

            System.out.println("\n--- Comparação de Tarifas ---");
            System.out.printf("%-10s %-20s %-10s %-10s %-10s%n", "Sigla", "País", "Básica", "Standard", "Premium"); // formatar as informações
            System.out.printf("%-10s %-20s %-10.2f %-10.2f %-10.2f%n", p1.sigla, p1.pais, p1.getTarifaBasica(), p1.getTarifaStandard(), p1.getTarifaPremium());
            System.out.printf("%-10s %-20s %-10.2f %-10.2f %-10.2f%n", p2.sigla, p2.pais, p2.getTarifaBasica(), p2.getTarifaStandard(), p2.getTarifaPremium());
        }
    }

    public void mediaTarifaBasica(){


    }

}