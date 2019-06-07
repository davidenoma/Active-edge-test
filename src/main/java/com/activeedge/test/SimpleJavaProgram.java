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

    }
}
