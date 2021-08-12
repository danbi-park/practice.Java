package main.array;

import java.util.Arrays;

public class ArrayShuffle {
    public static void main(String[] args) {
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i+1;  //0부터지만 1을 더해서 1,2,3,4,5  .. 라고 나옴

        }
        System.out.println(Arrays.toString(nums));
        //index의 처음과 랜덤한 어느 index와 자리바꿈을
        //for문이 돌아갈 때 까지 바꿈한다. 바뀌고 바뀌고 바뀌고
        for (int i = 0; i < nums.length; i++) {
            int rand = (int)(Math.random()*10);

            int temp = nums[i];
            nums[i] = nums[rand];
            nums[rand] = temp;
        }
        System.out.println(Arrays.toString(nums));
    }
}
