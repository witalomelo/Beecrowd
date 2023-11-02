import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bee2729 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int qtdTeste = sc.nextInt();
        sc.nextLine(); //consumir quebra de linha

        for(int i=0; i<qtdTeste; i++){
            String lsCompras = sc.nextLine();
            String[] itens = lsCompras.split(" "); //vetor com itens duplicados
            ArrayList<String> itensUnicos = new ArrayList<>(); //instanciando arrar itensUnicos

            for(String item : itens){ //para cada string item da minha lista de itens
                if(!itensUnicos.contains(item)){//se na lista itensUnicos contem  item retorna true
                    itensUnicos.add(item);
                }
            }


        Collections.sort(itensUnicos); //organizando elementos da lista em ordem crescente
        String lsOrdenada = String.join(" ", itensUnicos); //construindo unica string a partir da lista itensUnicos
        System.out.println(lsOrdenada);

        }
     
    }
    
}
