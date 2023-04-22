package controllingFlow;

public class LoopsBreak {

    public static void main(String[] args) {

        nestedLoops();
        nesteLoopsString();
    }

    public static void nestedLoops() {
        int linha = 1;
        // Loops aninhados
        // 3 x 3 x 3 = 27 rows
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                for (int k = 0; k <= 2; k++) {
                    System.out.println(i + " " + j + " " + k + " linha: " + linha);
                    linha++;
                }
            }
        }
        System.out.println("-------------------------");
    }

    public static void nesteLoopsString() {

        String[][] seasons = new String[2][2];

        seasons[0][0] = "Summer";
        seasons[0][1] = "Spring";
        seasons[1][0] = "Autumm";
        seasons[1][1] = "Winter";

        for (String[] rows : seasons) {
            for (int i = 0; i < rows.length; i++) {
                System.out.println(rows[i] + "\t");
            }
        }
        System.out.println("-------------------------");


    }


}
