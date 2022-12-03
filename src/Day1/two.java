package Day1;

import helper.loadFileToArrayList;

import java.util.ArrayList;

public class two {
    public static void main(String[] args) {
        //use the input.txt.txt file as input.txt
        //make arraylist of lines
        ArrayList<String> lines = loadFileToArrayList.load("1");

        //add each row of numbers until a blank line is reached
        // find the max three sum of the rows
        // combine the max three sums
        // print the result
        ArrayList<Integer> sums = new ArrayList<>();
        int sum = 0;
        for (String line : lines) {
            if (line.equals("")) {
                sums.add(sum);
                sum = 0;
            } else {
                String[] numbers = line.split(" ");
                for (String number : numbers) {
                    sum += Integer.parseInt(number);
                }
            }
        }
        sums.sort(Integer::compareTo);
        System.out.println(sums.get(sums.size() - 1) + sums.get(sums.size() - 2) + sums.get(sums.size() - 3));
    }
}
