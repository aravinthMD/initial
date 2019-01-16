package com.kg.college;

    public class MyEvenOdd {
 
    public boolean isEvenNumber(int number){
         
        boolean result = false;
        if(number%2 == 0){
            result = true;
        }
        else
        {
            result=false;
        }
        return result;
    }
}
