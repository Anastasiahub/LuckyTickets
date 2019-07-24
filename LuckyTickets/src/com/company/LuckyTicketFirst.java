package com.company;
import java.util.ArrayList;


abstract public class LuckyTicketFirst{
    private ArrayList<Integer> digits = new ArrayList();

    public void setDigits(ArrayList digits)
    {
        this.digits = digits;
    }

    public int sumOfRightDigits(ArrayList<Integer> digits){
        int sum = 0;
        for (int i = 0; i<=2; i++)
        {
            sum+=digits.get(i);
        }
        return sum;
    }

    public int sumOfLeftDigits(ArrayList<Integer> digits){
        int sum = 0;
        for (int i = 3; i<digits.size(); i++)
        {
            sum+=digits.get(i);
        }
        return sum;
    }

    public boolean isLucky(ArrayList<Integer> digits)
    {
        return sumOfLeftDigits(digits)==sumOfRightDigits(digits);
    }
}


