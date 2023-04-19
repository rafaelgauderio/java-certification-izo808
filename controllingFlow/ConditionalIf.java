package controllingFlow;

public class ConditionalIf {

    public static void main(String[] args) {
        example01(15);
        example01(10);
        exemple02();
        example3("Rafael");
        example3("João");
        example3("Claudia");
        example04(true);
        example04(false);
    }

    public static void example01(int x) {
        if (x == 10) { // só entre nesse bloco se x =10
            x++;
        } else { // entre no bloco else
            x--;
        }
        System.out.println("x:" + x);
        System.out.println("--------------------------");

    }

    public static void exemple02() {
        int x = 17;
        int y = 12;
        boolean b1 = false;

        if ((b1 = true) == true) { // ao trocar a o valor da variábel b1 para true vai entrar nesse bloco
            x++;
            y = y - 2;
        } else if (y > 1) { // como entrou no primeiro bloco, nem avalia esse
            x++;
            y--;
        } else {
            y = y - 10;
            x = x + 5;
        }

        System.out.println("x:" + x); //x=18
        System.out.println("y:" + y); // y=10
        System.out.println("--------------------------");
    }

    public static void example3(String name) {

        if (name == "João") {
            System.out.println("The name is João");
        } else if ((name = "Clarisse") == "Clarisse") { // var entrar aqui por alterei o nome para Clarisse antes
            // de fazer a condição booleana, caso não entrar no primeiro caso

            System.out.println("The name is Clarisse");
        } else {
            System.out.println("O nome é diferente de João");
        }
        System.out.println("--------------------------");

    }

    public static void example04 (boolean b1) {

        if(b1)
            if(b1==true)
                System.out.println("Entre nesse bloco caso b1 verdadeiro.\n" +
                        "Se tem apenas uma linha de código, não precisa das chaves");
            else
                System.out.println("Nunca vai entrar nesse bloco"); // nunca vai passar por aqui
                // pq se b for verdadeiro ele executa a primeira condição. se for falso
                // pula direto para o else do primeiro bloco if
       else
            System.out.println("Entra aqui se b1 for falso");
        System.out.println("--------------------------"); // sempre executa esse bloco ao final do código
    }
}
