package arrays;

import java.util.Arrays;

public class InitialisingTwoDimension {

    public static void main(String [] args) {

        int [] [] grades = { {0,1,2,3,4} , {9,7}, {10,8}, {4, 9,6,2}, {4,7,1} ,null};

        for(int i=0; i < grades.length ; i++ ) {
            for (int j=0; grades[i] !=null && j < grades[i].length ; j++) {
                System.out.print("[" + grades[i][j] + "]");
            }
            System.out.println();
        }

        System.out.println("\nImprimindo Array mesmo se estiver apontando pra null");
        for (int[] nickname : grades) {
            System.out.println(Arrays.toString(nickname));
        }


        System.out.println("\nImprimindo os itens do array com for-each");
        for(int [] vetorBidimentional : grades) {
            if( vetorBidimentional != null) {
                for(int apelido : vetorBidimentional) {
                    System.out.print("[" + apelido + "]");
                }
            }
            System.out.println();
        }

        Book [] [] teachingBooks = {
                {new Book("Livro de Química"), new Book("Livro de Física")},
                {new Book("Biologia celular"), new Book("Cálculo diferencial"), new Book("Gramática")}
        };

        for(Book [] apelido : teachingBooks) {
            System.out.println(Arrays.toString(apelido));
        }


    }
}
