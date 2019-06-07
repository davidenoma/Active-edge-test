package com.activeedge.test;

public class SimpleJavaProgram {

    int getNonOccuring( int [] fromArray){
        int test = fromArray.length;

        for (int i = 0; i < test; i++) {
            if (fromArray[i] < fromArray[i++]){
                fromArray[i] = fromArray[i++];
            }

        }

        return 0;
    }


    public static void main(String[] args) {
        int x = {1,2,3,4,5};

    }
}
