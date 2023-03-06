import javax.xml.bind.ValidationEvent;

public class ListaDeInteiros {
    private int dados[];
    private int tamanho;
    /**
     Contrutor
     @param c é a capacidade maxima da lista.
     */
    public ListaDeInteiros(int c){
        dados = new int[c];
        /* V Não é preciso declarar pois o valor por padrão é null */  
        tamanho = 0;
    }
    /**
     Metodo de verificação de lista vazia;
     @return true se a lista ESTA vazia, false se lista NÃO estiver vazia.
     */
    public boolean vazia(){
        return tamanho == 0;
    }
    /**
      Metodo de verificação de lista cheia;
      @return true se a lista esta cheia, false se estiver faltando;
     */
    public boolean cheia(){
        return dados.length == tamanho;
    }
    /*Sempre que existir "+"=Public; */

    public void adicionaFinal(int e){
        /*Verif se esta cheia */
        if(cheia()){
            /* cheia = encerra metodo
            erro*/
            System.out.println("Lista ja esta cheia! ");
        }else{
        /*!cheia = add elemento no indice
         */             // V PARAMETRO "adicionaFinal(int e)"
          dados[tamanho] = e;
          tamanho++;      

        }
    }
    public int removerF(){
        int r = -1;
        //verificaçao de lista vazia;
        if (vazia()){
            //lista = vazia, finalizar;
            System.out.println("Lista vazia! ");
        } else{
            //lista != vazia, remover elemento;
            r = dados[tamanho - 1];
            tamanho--;
        }
        return r;
    }
    public String toString(){  
        String s = "";
        for (int i = 0; i < dados.length; i++){
        s = s + dados[i] + '\n';    
        }
        s = s +"total elementos da lista: " + tamanho;
        return s;
    }
}
