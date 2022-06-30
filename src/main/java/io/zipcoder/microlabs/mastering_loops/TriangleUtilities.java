package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String variable = "";
        for (int i=1; i <numberOfRows; i++){
        //i is just a variable for the counter, the start.
        //when i<numberofRows, run the body. In this case, it is another loop.
            for (int j=0; j<i; j++){
            // new variable j introduced for counting purposes.
            // when j<i, run the body.
            // variable = variable + "*" means we are adding start to the string "variable"
            //"variable" is like a container, storing the value.
            // when inside loop's condition is false, return to continue outside loop.
                variable = variable + "*";
             }
        //the outside loop is adding a new line (\n) to the stored value in "variable"
        //continue through until outer loop condition is false, meaning i is no longer less than numberOfRows.
            variable = variable + "\n";
        }
        return variable;
    }

    public static String getRow(int numberOfStars) {
        String variable = "";
        for (int i=0; i <numberOfStars; i++){
            String j = "*";
            variable = variable + j;
        }
        return variable;
    }

    public static String getSmallTriangle() {
        String variable = "";
        for (int i=1; i<5; i++){
            for (int j=0; j<i; j++){
                variable = variable + "*";
            }
            variable = variable + "\n";
        }
        return variable;
    }

    public static String getLargeTriangle() {
        String variable = "";
        for (int i=1; i <10; i++){
            for (int j=0; j<i; j++){
                variable = variable + "*";
            }
            variable = variable + "\n";
        }
        return variable;
    }
}
