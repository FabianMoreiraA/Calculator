package sample.calculator;



public class Calculator {
    //ADD
    public int add(int a, int b){
        int result=0;
        if(a>0 && b>0){
            result = a+b;
        }
        return result;
    }
    //SUBSTRACT
    public int substract(int a, int b){
        int result=0;
        if(a>0 && b>0){
            result = a-b;
        }
        return result;
    }
    //MULTIPLY
    public int multiply(int a, int b){
        int result=0;
        if(a>0 && a>0){
            result = a*b;
        }
        return result;
    }
    //DIVIDE
    public int divide(int a, int b){
        int result=0;
        if (a>0 && b>0){
            result=a/b;
        }
        return result;
    }

}

