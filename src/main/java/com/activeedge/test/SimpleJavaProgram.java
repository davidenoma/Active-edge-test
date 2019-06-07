package com.activeedge.test;

public class SimpleJavaProgram {

  static  void sortArray( int [] fromArray){
        int test = fromArray.length;

        for (int i = 0; i < test; i++) {
            for (int j = i + 1; j < test; j++) {

                if (fromArray[i] > fromArray[j]){
                    int temp = fromArray[i];
                    fromArray[i] = fromArray[j];
                    fromArray[j] = temp;

                }
            }

        }




    }
    private static int findLeastNonOccuring(int [] sortedArray){
      int i = 0;
        int diff = 0;
        int result =  0;
        for( ; i < sortedArray.length; i++) {

            while (i + 1 < sortedArray.length){
                 diff = sortedArray[i + 1 ] - sortedArray[i];
            }

            if(diff == 1 && diff != 0){
                continue;
            }
            else {
               result = result + 1;

           }


        }
        if (result < 0 ) return 1;

        return result;
    }
    public static void main(String[] args) {
        int[] x = new int[]{1,3,6,4,1,2};

        for (int i = 0; i < x.length; i++){
            System.out.println(x[i]);
        }
            sortArray(x);

        System.out.println("-----------------");

        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);

        }
        System.out.println("Smallest non occuring");
        System.out.println(findLeastNonOccuring(x));
    }
}
