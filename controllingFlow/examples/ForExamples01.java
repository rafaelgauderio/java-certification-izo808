package controllingFlow.examples;


class ForExamples01 {

    public static void main(String args[]){

        int c = 0;

        A: for(var i = 0; i < 2; i++){ // 'var' equivalent to 'int' here i.e. int i = 0;
            System.out.println("exit i block");

            B: for(var j = 0; j < 2; j++){// 'var' equivalent to 'int' here i.e. int j = 0;
                System.out.println("exit j block ");

                C: for(var k = 0; k < 3; k++){// 'var' equivalent to 'int' here i.e. int k = 0;
                    c++;
                    System.out.println(c);
                    System.out.println("exit k block");
                    if(k>j) break;
                }
            }
        }
        System.out.println(c);
    }
}

