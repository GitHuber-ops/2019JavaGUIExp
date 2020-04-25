package com.company;

public class Main {

    public static void main(String[] args) {
        try {
            TestException testException = new TestException();
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("Program has run here!\n\n");
        }

        try{
            TestExceptionString testExceptionString = new TestExceptionString("test");
            testExceptionString.printString();
            if(testExceptionString.testString.equals("test"))
                throw new TestExceptionString("Just some test...");
        } catch (TestExceptionString e){
            System.out.println("This is just some test...");
            e.printString();
            e.printStackTrace();
        }
	// write your code here
    }
}

class TestException{
    int[] testArray = new int[5];
    int testInt = testArray[6];

    TestException(){
        int test = this.testInt;
    }
}

class TestExceptionString extends Throwable{
    static String testString = null;
    TestExceptionString(String testString){
        this.testString = testString;
    }

    static void printString(){
        System.out.println(testString);
    }
}
