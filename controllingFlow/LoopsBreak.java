package controllingFlow;

public class LoopsBreak {

    public static void main(String[] args) {

        nestedLoops();
        nesteLoopsString();
        normalBreakLoop();
        labellBreakLoop();
        labellInnerBreakLoop();
        normalContinueLoop();
        labelContinueLoop();
        labelInnerContinueLoop();
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

    public static void normalBreakLoop() {

        System.out.println("\nBreak out of the nested loop");
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 50; j++) {
                if (j == 4) {
                    break; // vai sair do loop de j quando j =2, então não vai ter j=2 ou maior impresso
                }
                System.out.println("i: " + i + " | j: " + j);
            }
        }
        System.out.println("-------------------------");

    }

    private static void labellBreakLoop() {

        System.out.println("Outer Loop out of the nested loop");
        OUTER:
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 50; j++) {
                if (j == 4) {
                    break OUTER;
                    // quando j =4 no loop do for, vai sair do loop do i,
                }
                System.out.println("i: " + i + " | j: " + j);
            }
        }
        System.out.println("-------------------------");

    }

    public static void labellInnerBreakLoop() {

        System.out.println("\nINNER Loop out of the nested loop");

        for (int i = 0; i <= 2; i++) {
            INNER:
            for (int j = 0; j <= 50; j++) {
                if (j == 4) {
                    break INNER;
                    // sai apenas do loop j quando for maior maior ou igual a 4
                    // executa todos os loops do bloco i
                }
                System.out.println("i: " + i + " | j: " + j);
            }
        }
        System.out.println("-------------------------");
    }

    public static void normalContinueLoop() {
        int linha =1;

        System.out.println("\nContinue bypasses each time the conditional is true");
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 10; j++) {
                if (j == 5) {
                    continue; // passa direto toda vez que j=5 e pula para o 6 e continua
                    // não vai ser impresso j=5
                }
                System.out.println("i: " + i + " | j: " + j + " | " + linha);
                linha++;
            }
        }
        System.out.println("-------------------------");

    }

    public static void labelContinueLoop() {

        System.out.println("OUTER Continue bypasses each time the conditional is true\n" +
                "Exits the inner loop and continues with OUTERLOOP");
        OUTER:
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 10; j++) {
                if (j == 5) {
                    continue OUTER; // sai do loop interno quando j=5 e continua com o loop externo
                }
                System.out.println("i: " + i + " | j: " + j);
            }
        }
        System.out.println("-------------------------");

    }

    public static void labelInnerContinueLoop() {
        int linha =1;
        System.out.println("Inner Continue bypasses each time the conditional is true\n" +
                "It will have the same behavior that the normal continue ");

        for (int i = 0; i <= 2; i++) {
            INTER:
            for (int j = 0; j <= 10; j++) {
                if (j == 5) {
                    continue INTER; // passa direto quando j=5 e pula para o j=6

                }
                System.out.println("i: " + i + " | j: " + j  + " | " + linha);
                linha++;
            }
        }
        System.out.println("-------------------------");

    }
}
