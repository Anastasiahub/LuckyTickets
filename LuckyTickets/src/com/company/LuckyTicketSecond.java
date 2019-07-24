package com.company;

import java.util.ArrayList;

abstract public class LuckyTicketSecond {
    private ArrayList<Integer> digits = new ArrayList<>();

    public void setDigits(ArrayList digits)
    {
        this.digits = digits;
    }

    public int sumofEven(ArrayList<Integer> digits)
    {
        int sum = 0;
        for (int i = 1; i<digits.size(); i+=2)
        {
            sum+=digits.get(i);
        }
        return sum;
    }

    public int sumofOdd(ArrayList<Integer> digits)
    {
        int sum = 0;
        for (int i = 0; i<digits.size(); i+=2)
        {
            sum+=digits.get(i);
        }
        return sum;
    }

    public boolean isLucky(ArrayList<Integer> digits)
    {
        return sumofEven(digits)==sumofOdd(digits);
    }

}
