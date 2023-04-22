package controllingFlow.examples;


class ForExamples01 {

    public static void main(String args[]){

        int c = 0;

        A: for(var i = 0; i < 2; i++){ // 'var' equivalent to 'int' here i.e. int i = 0;
            System.out.println("i: "+i);

            B: for(var j = 0; j < 2; j++){// 'var' equivalent to 'int' here i.e. int j = 0;
                System.out.println(" j: "+j);


                C: for(var k = 0; k < 3; k++){// 'var' equivalent to 'int' here i.e. int k = 0;
                    c++;
                    System.out.println(" k: "+k);
                    System.out.println("  c: " + c);
                    if(k>j) break;
                }
                System.out.println("  exit k block");
            }
            System.out.println(" exit j block ");
        }
        System.out.println("exit i block");
        System.out.println(c);
    }
}

