class Vetor {
    Pais[ ] lista; // armazena os elementos do vetor
    int capacity; // capacidade do vetor - length
    int size; // elementos no vetor - qtde elementos
    
    public Vetor(int capacity) {
        lista = new Pais[capacity];
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
        return lista[i];
    }
    
    public void set(int i, Pais n) throws Exception {
        //substitui o conteúdo da posição i por n
        if (i<0 || i>=size)
            throw new Exception("Posição inválida!!");
        lista[i]=n;
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
            lista[p] = lista[p - 1];
        }
        lista[i] = n;
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
            lista[p]=lista[p+1];
        }
        size--;
    }
    
    public int search(String sigla) {
        // busca o valor n na lista - retornando a posição ou -1, se não existir
        for (int i=0;i<size;i++)
            if (lista[i].sigla.equals(sigla))
                return i;
        return -1;
    }
    
    public void show() {
       // mostra todo o conteúdo da lista
       for (int i=0;i<size;i++)
           lista[i].mostraPais();
        
       System.out.println("\nFim da lista!!");
    }

    public double mediaBasica(){
        double somaB = 0;
        for (int i=0;i<size;i++){
            somaB += lista[i].tarifaBasica;
        }
        return somaB/size;
    }
    public double mediaStandard(){
        double somaS = 0;
        for (int i=0;i<size;i++){
            somaS += lista[i].tarifaStandard;
        }
        return somaS/size;
    }
    public double mediaPremium(){
        double somaP = 0;
        for (int i=0;i<size;i++){
            somaP += lista[i].tarifaPremium;
        }
        return somaP/size;
    }
}