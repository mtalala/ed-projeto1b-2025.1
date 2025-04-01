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

    /*public void ordenaPreimum(){
        int i;
        for (i=size-1; i > 0 && A[i].getTarifaPremium() < n.getTarifaPremium();i--) {
            A[i+1] = A[i];
            for(int j=0;j<4;j++){
              A[i].mostraPais();
            }
        }
    }*/
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
                    //A[i-1].getTarifaPremium()= A[i].getTarifaPremium();
                }   
            }
        }
        for(int i =0;i<4;i++){
            A[i].mostraPais();
        }

    }
    public double mediaBasica(){
        double somaB = 0;
        for (int i=0;i<size;i++){
            somaB += A[i].tarifaBasica;
        }
        return somaB/size;
    }
    public double mediaStandard(){
        double somaS = 0;
        for (int i=0;i<size;i++){
            somaS += A[i].tarifaStandard;
        }
        return somaS/size;
    }
    public double mediaPremium(){
        double somaP = 0;
        for (int i=0;i<size;i++){
            somaP += A[i].tarifaPremium;
        }
        return somaP/size;
    }
}