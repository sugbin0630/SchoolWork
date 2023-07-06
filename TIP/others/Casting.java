package TIP.others;

public class Casting {
    byte by;    // 1 byte
    short sh;   // 2 byte
    int in;     // 4 byte
    long lo;    // 8 byte
    
    float fl;   // 4 byte
    double db;  // 8 byte

    char ch;
    boolean bo; 

    /* 
    Cast smaller one: Automatically cast
    Cast bigger one: Eventually cast
    ex) long lo = in;
        int in = (int)lo;
        double db = fl;
        float fl = (float)db;

    cast decimal into integer: Eventually cast
    integer into decimal: Automatically
    ex) double db = in;
        int in = (int)double;

    ex) double * int = double
    */
}
