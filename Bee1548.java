
import java.util.Scanner;

public class Bee1548 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int M = sc.nextInt();
            int[] notas = new int[M];
            int[] indices = new int[M];

            for (int j = 0; j < M; j++) {
                notas[j] = sc.nextInt();
                indices[j] = j;
            }

            // Ordena os índices com base nas notas
            for (int j = 0; j < M - 1; j++) {
                for (int k = j + 1; k < M; k++) {
                    if (notas[indices[j]] < notas[indices[k]]) {
                        int temp = indices[j];
                        indices[j] = indices[k];
                        indices[k] = temp;
                    }
                }
            }

            // Verifique quantos alunos não precisam trocar de lugar
            int naoPrecisaTrocar = 0;
            for (int j = 0; j < M; j++) {
                if (indices[j] == j) {
                    naoPrecisaTrocar++;
                }
            }

            System.out.println(naoPrecisaTrocar);
        }

        sc.close();
    }

}
