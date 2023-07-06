package TIP.others;

public class Parameter {
    /*
     * A pass-by-value parameter is named so because it sends its VALUE to the
     * method.
     * It does NOT send the variable itself! It sends a COPY of the data the
     * variable was storing.
     * In these cases, when you use a variable as a parameter for a method, if that
     * method changes the value of its parameter, it will NOT change the value of
     * the original variable!
     * The value doesn't get changed because the method only receives a COPY of what
     * the variable was storing -- not the variable itself!F
     * A pass-by-reference parameter is named so because it sends a REFERENCE to
     * original data.
     * This means that the method is given a reference to the variable��s location
     * in memory.
     * When you use a pass-by-reference variable as a parameter for a method, if
     * that method changes the value of the parameter, it WILL change value of the
     * original variable!
     * The value gets changed because the is using the location in memory where the
     * variable is stored -- it is directly changing the data of the original
     * variable!
     */
    /*
     * Most variables are pass-by-value parameters. They send a COPY of their data
     * when you use them as a parameter.
     * If you change the values of these parameters during the run of your methods,
     * the original values are not changed.
     * 
     * 
     * Complex data types, like arrays, are pass-by-reference parameters. They send
     * the ACTUAL variable when used as a parameter.
     * If you change the values in these data types during the run of your methods,
     * the changes will be made to your original values as well!
     * 
     */
}
