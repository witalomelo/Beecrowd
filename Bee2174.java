import java.util.Scanner;

public class Bee2174{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int qtdTeste = sc.nextInt();
        sc.nextLine();

        String[] poks = new String[151]; //criando vetor com strings de temanho definido

        int contador = 0;
        for (int i = 0; i < qtdTeste; i++) { //adicionar pokemons na lista
            String pok = sc.nextLine();
            boolean capturado = false; //criando  variavel capturado como false

            for(int j = 0; j < contador; j++){ //verificar se os nomes são iguais 
                if(pok.equals(poks[j])){
                    capturado = true;
                    break;
                }
            }

            if(!capturado) { //incrementar variavel contador caso capturado for false
                poks[contador] = pok;
                contador ++;
            }
        }

        int pokFaltando = 151 - contador; //quantidade que falta

        System.out.printf("Falta(m) %d pomekon(s).\n", pokFaltando);

        sc.close();
    }
}