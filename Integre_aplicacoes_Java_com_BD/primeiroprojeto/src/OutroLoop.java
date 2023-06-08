import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Diga sua avaliação para o filme ou -1 para encerrar ");
            nota = scan.nextDouble();
            if (nota != -1){
                mediaAvaliacao += nota;
                totalDeNotas++;
            }
        }

        System.out.println("Média de avalições " + mediaAvaliacao/totalDeNotas);

    }
}

///32 22 44 36 56 25 -> 17 19 18 13 22 21
