package LW_02;

public class Method_Q2 {
    private int integer;
    private int NoOfDigits;
    public Method_Q2() {
    }

    public int setInteger(int integer) {
        String strinteger=String.valueOf(integer);
        NoOfDigits=strinteger.length();
        return NoOfDigits;

    }
}
