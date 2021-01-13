package com.tts;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List <Integer> intList=new ArrayList<Integer>();
        int sum = 0;
        int product = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter any series of 5 numbers separated by a space: ");
        String[] strNums = null;
        if (scanner.hasNextLine()) {
            strNums = scanner.nextLine().split(" ");
        }
        if (strNums != null) {
            for (String strNum: strNums) {
                try {
                    intList.add(Integer.parseInt(strNum.trim()));
                } catch (Exception e) {
                    System.out.println("Invalid input");
                    break;
                }
            }
            Integer[] nums = intList.toArray(new Integer[0]);
            System.out.println(Arrays.toString(nums));
            for(int num: nums) {
                sum = sum + num;
            }
            for(int num: nums){
                product = product * num;
            }
        }
        int maxBig = Collections.max(intList);
        int minSmall = Collections.min(intList);
        System.out.println("Sum of the elements of the array ::"+sum);
        System.out.println("Product of the elements of the array ::"+product);
        System.out.println("Your largest element is  "+ maxBig);
        System.out.println("Your smallest element is  "+ minSmall);
        }
}