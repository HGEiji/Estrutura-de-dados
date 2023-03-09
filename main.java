import java.util.Scanner;
public class main {
    public static void main(String[] args){
        listaMetodo lista1 = new listaMetodo(10);
        Scanner sc = new Scanner(System.in);
        int op = 0;
       
        while(op!=6){
            System.out.println("1 - add elemento no final da lista");
            System.out.println("2 - add elemento no começo da lista");
            System.out.println("3 - remover elemento no inicio da lista");
            System.out.println("4 - remover elemento no final da lista");
            System.out.println("5 - mostrar lista");
            System.out.println("6 - sair");

            op = sc.nextInt();
            switch (op){
                case 01:
                System.out.println("Valor a ser adicionado ao final da lista: ");
                int element = sc.nextInt();
                lista1.addFinal(element);
                
                break;
                case 02 :
                System.out.println("Valor a ser adicionado no começo da lista: ");
                int element1 = sc.nextInt();
                lista1.addInicio(element1);
                break;
                case 03:
                int remoEle = lista1.removerF();
                System.out.println("Numero" + remoEle +" removido da lista");
                break;
                case 04 :
                int remoEle1 = lista1.removerF();
                System.out.println("Numero" + remoEle1 +" removido da lista");
                break;
                case 05:
                System.out.println(lista1.toString());
                break;
                case 06:
                System.out.println("Programa fechado!");
                break;
                default:
                System.out.println("Erro, opção invalida");
            }
        }

        
    }
}
