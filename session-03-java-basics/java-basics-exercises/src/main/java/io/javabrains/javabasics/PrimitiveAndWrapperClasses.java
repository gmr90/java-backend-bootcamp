package io.javabrains.javabasics;

public class PrimitiveAndWrapperClasses {
    public static void main(String[] args) {
        // Step 1: Declare primitive variables
        int age = 25;
        double price = 24.72;
        boolean isCondition= true;
        char x = 'x';

        // Step 2: Convert primitive variables to wrapper objects
        //Integer ageObj = new Integer("age");
        Integer ageObj = age; // auto basking

        // Step 3: Print the values of the wrapper objects
        System.out.println("ageObj = "+ageObj);

        // Step 4: Convert wrapper objects back to primitive variables
                age = ageObj;
        // Step 5: Print the values of the primitive variables
        System.out.println("age = "+age);
    }
}
