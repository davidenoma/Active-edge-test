package com.activeedge.test;

import java.util.Arrays;

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

    static int solution( int [] sortedArray) {

        int maxValue = Arrays.stream(sortedArray).max().getAsInt();
        if (maxValue < 1)
        {
            return 1;
        }
        if (sortedArray.length == 1) {
            if (sortedArray[0] == 1) {
                return 2;
            } else {
                return 1;
            }
        }
        int i;
        int[] largeArray = new int[maxValue];

        for (i = 0; i < sortedArray.length; i++) {
            if (sortedArray[i] > 0) {
                if (largeArray[sortedArray[i] - 1] != 1)
                {
                    largeArray[sortedArray[i] - 1] = 1;
                }
            }
        }
        for (i = 0; i < sortedArray.length; i++)
        {
            if (largeArray[i] == 0) {
                return i + 1;
            }
        }

        return i+2;
    }

    public static void main(String[] args) {
        int[] x = new int[]{5, -1, -3};

        for (int i = 0; i < x.length; i++){
            System.out.println(x[i]);
        }
            sortArray(x);

        System.out.println("-----------------");

        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);

        }
        System.out.println("Smallest non occuring");
        System.out.println(solution(x));
    }
}
