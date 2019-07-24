package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<Integer> reverseArrayList(ArrayList<Integer> num)
    {
        ArrayList<Integer> revarray = new ArrayList<>();
        for (int i = num.size() - 1; i >= 0; i--) {
            revarray.add(num.get(i));
        }
        return revarray;
    }

    public static int getLuckyFromRangeFirst(int min, int max, ArrayList<Integer> digits, Number number)
    {
        int count = 0;
        LuckyTicketFirst lucky = new LuckyTicketFirst() {
            @Override
            public boolean isLucky(ArrayList<Integer> digits) {
                return super.isLucky(digits);
            }
        };
        for (int i = min; i<max; i++)
        {
            digits = number.getDigit(i);
            lucky.setDigits(digits);
            if(lucky.isLucky(digits)){
                count++;
                System.out.println(reverseArrayList(digits));
            }
            digits.clear();
        }
        return count;
    }

    public static int getLuckyFromRangeSecond(int min, int max, ArrayList<Integer> digits, Number number)
    {
        int count = 0;
        LuckyTicketSecond lucky = new LuckyTicketSecond() {
        @Override
        public boolean isLucky(ArrayList<Integer> digits) {
            return super.isLucky(digits);
            }
        };
        for (int i = min; i<max; i++)
        {
            digits = number.getDigit(i);
            lucky.setDigits(digits);
            if(lucky.isLucky(digits)){
                count++;
                System.out.println(reverseArrayList(digits));
            }
            digits.clear();
        }
        return  count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer min = in.nextInt();
        Integer max = in.nextInt();

        Number number = new Number();
        ArrayList<Integer> digits = new ArrayList();

        int countfirst = getLuckyFromRangeFirst(min,max,digits,number);
        int countsecond = getLuckyFromRangeSecond(min,max,digits,number);

        if(countfirst>countsecond)
        {
            System.out.println("First method is better. Count of tickets: " + countfirst);
        }
        else
        {
            System.out.println("First method is better. Count of tickets: " + countsecond);
        }

    }

}

