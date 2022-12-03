package Day1;

import helper.loadFileToArrayList;

import java.util.ArrayList;

public class one {
    public static void main(String[] args) {
        //use the input.txt.txt file as input.txt
        //make arraylist of lines
        ArrayList<String> lines = loadFileToArrayList.load("1");

        //add each row of numbers until a blank line is reached
        // find the max sum of the rows
        // print the max sum
        int maxSum = 0;
        int sum = 0;
        for (int i = 0; i < lines.size(); i++) {
            if (lines.get(i).equals("")) {
                if (sum > maxSum) {
                    maxSum = sum;
                }
                sum = 0;
            } else {
                String[] numbers = lines.get(i).split(" ");
                for (int j = 0; j < numbers.length; j++) {
                    sum += Integer.parseInt(numbers[j]);
                }
            }
        }
        System.out.println(maxSum);
    }
}
