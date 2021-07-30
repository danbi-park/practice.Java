package array;

public class ArrayMinMax {
    public static void main(String[] args) {
        int[] score = {79,88,91,33,100,55,95};
        int max = score[0];
        int min = score[0];
        int total = 0;

        //자기 자신을 갱신하여 안에 값을 넣음
        for (int i = 0; i < score.length ; i++) {
            if ( score[i] > max) max = score[i];
            if ( score[i] < min) min = score[i];
            total += score[i];
            }
            System.out.println("최대값: " +max);
            System.out.println("최소값: " +min);
            System.out.printf("총합 %3d %n", total);
            System.out.printf("평균 %5.2f %n", (float)total/score.length);
        }
    }
