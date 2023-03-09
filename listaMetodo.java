
import javax.xml.bind.ValidationEvent;

public class listaMetodo{
    private int dados[];
    private int tamanho;

    public listaMetodo(int c){
        dados = new int[c];
        tamanho = 0;
    }
    public boolean vazia(){
        return tamanho == 0;
    }
    public boolean cheia(){
        return dados.length == tamanho;
    }
    public void addFinal(int e){
        if (cheia()){
            System.out.println("Lista Cheia");
    }else{
        dados[tamanho] = e;
        tamanho++;
    }
}
    public void addInicio(int e){
        tamanho = 0;
        if (cheia()){
            System.out.println("Lista Cheia");
        }else{
            dados[tamanho]= e;
            tamanho ++;
        }
    }

    public int removerF(){
        int r = -1;
        if(vazia()){
            System.out.println("Lista Vazia! ");

        }else{
            r = dados[tamanho-1];
            tamanho--;
        }
        return r;
    }
    public String toString(){
        String s = "";
        for(int i = 0;i< dados.length;i++){
            s = s + dados[i] + '\n';
        }
        s = s +"Total de elementos da lista" + tamanho;
        return s;
    }
}
