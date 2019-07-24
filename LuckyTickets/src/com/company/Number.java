package com.company;

import java.util.ArrayList;

public class Number implements GetDigitFromNum{
    int number;
    private ArrayList digits = new ArrayList();

    @Override
    public ArrayList getDigit(int num) {
            while(num>0)
            {
                digits.add(num%10);
                num=num/10;
            }
            return digits;
    }

    public ArrayList getArray()
    {
        return digits;
    }
}
