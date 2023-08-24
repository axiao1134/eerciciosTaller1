import java.util.Random;

import java.util.Scanner;
class numeroMagico {
    public static void main(String[] args) {

    }
    public static void menu(){
        int[][] matriz = new int[3][3];
        while(true){
            System.out.println("opcion-1");
            System.out.println("opcion-2");
            System.out.println("opcion-3");

        }

    }
    public static int ingresarOpcion(){
        Scanner opcion = new Scanner(System.in);
        int opcion1 = opcion.nextInt();

    return opcion1;
    }
    public static int[][] ingresarNumeroMtriz(int[][] matriz){
        Random random = new Random();
        int numeroAleatorio = random.nextInt(9) + 1;
        for (int i=0;i <3;i++){
            for (int j=0;j<3;j++){
                matriz[i][j]=numeroAleatorio;

            }

        }

        return matriz;
    }
}
