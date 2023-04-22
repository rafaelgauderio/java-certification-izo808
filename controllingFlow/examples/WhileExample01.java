package controllingFlow.examples;

public class WhileExample01 {

        private int j;

        void showJ(){

            System.out.println(j);
            while(j<=5){

                for(int j=1; j <= 5;){

                    System.out.print(j+" ");

                    j++;

                }
                System.out.println();

                j++;

            }

        }
        public static void main(String[] args) {

            new WhileExample01().showJ();

        }

    }

