package Vorlesung_Tutorials;

import java.util.Arrays;

public class ProgP1_11 {

    public static void main(String[] args) {

        int[] sortedNumberArray = {5, 10, 34, 100, 3003, 40000};



    }

    public static int elemEnthaltenIn(int[] sortedNumberArray, int elem){
        if (sortedNumberArray.length > 1) {
            if (sortedNumberArray[sortedNumberArray.length / 2] == elem) {
                return sortedNumberArray.length / 2;

            } else if (sortedNumberArray[sortedNumberArray.length / 2] > elem) {
                int [] newArray = new int[sortedNumberArray.length / 2];

                return sortedNumberArray.length / 2;

            } else if (sortedNumberArray[sortedNumberArray.length / 2] < elem) {
                int [] newArray = new int[sortedNumberArray.length / 2];


                return sortedNumberArray.length / 2;

            }
        }else {
            if (sortedNumberArray[0] == elem){
                return 0; //TODO
            }else {
                return -1;
            }
        }
//        int [] newArray
        return elem;
    }
}
