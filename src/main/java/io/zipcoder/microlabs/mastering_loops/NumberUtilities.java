package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        //this is actually to get odd numbers on test.
        //Don't always need a variable, but in this case the method is expecting a String type return.
        //that's why we declare String variable, and we initialize it with a blank string.
        //Initializing means we are setting the variable to hold a value.
        // Rn we don't know the final value but will update this variable later.
        String variable = "";
        for (int i = start; i < stop; i++) {
            if (i % 2 != 0) {
                variable = variable + i;
                //the body of this for loop is to update the variable answer.
                //it is storing the value of answer + i into answer.
                //every time it loops, it gets store with the rest of the value.
            }
        }
        return variable;

        //if (i % 2 != 0){
        //  body...
        //}
        // if the remainder of i/2 does not = 0, then it is true and runs.

    }


    public static String getOddNumbers(int start, int stop) {
        String variable = "";
        for (int i = start; i < stop; i++) {
            if (i % 2 == 0) {
                variable = variable + i;
            }
        }
        return variable;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String variable = "";
        // do not hardcode because it will be specific to what you hardcoded.
        for (int i = start; i < stop; i=i+step) {
            int j = i*i;
            variable = variable + j;
        }
        return variable;
    }

    public static String getRange(int start) {
//        the test failed for testGetRange1A but passed for 2A and 3A.
//        1A's int stop should be 10. Changed to 10.
//        String variable = "";
//        for(int i=0;i<start;i++){
//            variable = variable + i;
//        }
//        return variable;
        return getRange(0, start, 1);
    }

    public static String getRange(int start, int stop) {
//      test failed for testGetRange3B but passed for 3A and 3B,
//      3B's String expected is incorrect, missing 102, so test failed. Added 102.
//        String answer = "";
//        for(int i=start; i<stop; i++){
//            answer = answer + i;
//        }
//        return answer;
        return getRange(start, stop, 1);
    }


    public static String getRange(int start, int stop, int step) {
//        String answer = "";
//        for(int i=start; i<stop;i = i+step){
//            answer = answer + i;
//        }
//        return answer;

        StringBuilder sb = new StringBuilder();

        for (int i = start; i < stop; i += step) {
            sb.append(i);
        }
        return sb.toString();
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String variable = "";
        for (int i = start; i < stop; i += step){
            double j = Math.pow(i,exponent);
            variable = variable + (int)j;
        }
    return variable;
    }


}

