package objectOriented;

public class ProgramReferenceVersusValue {
    public static void main(String[] args) {
        System.out.println("Tipos referências (CLASSE)\n" +
                "\tClasses são variáveis variáveis tipo referência (ponteiros).\n" +
                "\tVáriáveis são tipo ponteiros (tentáculos) alocados na memória stack que apontam para Objetos alocados na memória Heap).\n" +
                "\tNo valor da variável existe um endereço de memória que aponta para o objeto alocado na heap.\n" +
                "\tStack (memória rápida e pequena)" +
                "\tHeap (memória lenta e maior).\n" +
                "\tObjetos alocados na memória Heap em tempo de execução. Alocação dinâmica de memória.\n" +
                "\tObjetos são estruturas complexas com vários atributos e métodos. São Classes instanciadas.\n" +
                "\tAceitam valor null: indicando que a variável não aponta para nenhum endereço de memória.\n" +
                "\tNa atribuição a variável aponta para o mesmo endereço que a outra varíavel. x=y\n" +
                "\tObjetos precisam ser instanciados usando new ou apontar para outro objeto já existente.\n" +
                "\tObjetos que não tem nenhum variável apontando para eles, são desalocados pelo gargabe collector.\n");

        System.out.println("Tipos primitivos\n" +
                "\tVáriáveis são do tipo valor (caixas).\n" +
                "\tCaixas alocadas na memória stack" +
                "\tNo valor da variável existe um valor do tipo primitivo.\n" +
                "\t'variáveis alocadas na memória stack.\n"+
                "\tOs tipos primitivos no java são boolean, char, byte, short, int, long, float, double.\n" +
                "\tNão aceitam o valor null. null significa não apontar para lugar nenhum. Só um ponteiro aceita null.\t" +
                "\tNa atribuição a variável rcebe uma cópia da outra varíavel. x=y\n" +
                "\tTipos primitivos tem que ser inicializados. Não instancia. Declarar e atribuir um valor.\n" +
                "\t'Objetos' são delalocados imediatamente quando seu escopo de execução é finalizado.\n");

    }
}
