import java.util.Random;
import java.util.Scanner;

public class ExercicioVetores {

    public static Random gera = new Random();
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        //vetParImpar();
        //mantemOrdem();
        //ordenaVetor();
        //jogueDados();

    }

    public static void vetParImpar() {

        int par[] = new int[5];
        int impar[] = new int[5];
        int contPar = 0, contImpar = 0;

        for (int i = 0; i < 15; i++) {
            int num = gera.nextInt(99);

            if (num % 2 == 0) {
                if (contPar == 5) {
                    System.out.println("Vetor de pares cheio.");
                } else {
                    par[contPar] = num;
                    contPar++;
                }
            } else {
                if (contImpar == 5) {
                    System.out.println("Vetor de ímpares cheio.");
                } else {
                    impar[contImpar] = num;
                    contImpar++;
                }
            }

            if (contPar == 5 && contImpar == 5) {
                break;
            }
        }

        if (contPar == 5) {
            System.out.println("Números pares: ");
            for (int i = 0; i < contPar; i++) {
                System.out.println(par[i]);
            }
        }

        if (contImpar == 5) {
            System.out.println("Números ímpares: ");
            for (int i = 0; i < contImpar; i++) {
                System.out.println(impar[i]);
            }
        }
    }

    public static void mantemOrdem() {

        int vet[] = { 2, 9, 15, 19, 25, 28, 0 };
        int aux;

        System.out.println("Digite o número: ");
        int num = scan.nextInt();
        for (int i = 0; i < vet.length; i++) {
            if (num < vet[i]) {
                for (int j = 6; j > i; j--) {
                    aux = vet[j];
                    vet[j] = vet[j - 1];
                    vet[j - 1] = aux;
                }

                vet[i] = num;
                break;

            }
        }

        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + " ");
        }

        System.out.println("");

    }

    public static void ordenaVetor() {

        int vet[] = { 5, 1, 8, 6, 4, 9, 3, 2, 7 };
        int aux;

        for (int i = 0; i < vet.length; i++) {
            for (int j = 0; j < vet.length - 1; j++) {
                if (vet[j] > vet[j + 1]) {
                    aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                }
            }
        }

        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + " ");
        }

        System.out.print(" ");
    }

    public static void jogueDados() {

        System.out.println("\nSorteio dados");
        gera = new Random();

        int face[] = new int[6];
        int fc;

        for (int i = 0; i < 6000; i++) {
            fc = gera.nextInt(6) + 1;

            switch (fc) {
                case 1:
                    face[0]++;
                    break;
                case 2:
                    face[1]++;
                    break;
                case 3:
                    face[2]++;
                    break;
                case 4:
                    face[3]++;
                    break;
                case 5:
                    face[4]++;
                    break;
                case 6:
                    face[5]++;
                    break;
            }
        }

        for (int i = 0; i < 6; i++) {
            System.out.printf("face[%d]: %5d vezes\n", i + 1, face[i]);

        }
    }
}