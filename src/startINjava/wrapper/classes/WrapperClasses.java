package startINjava.wrapper.classes;

public class WrapperClasses {
    public static void main(String[] args) {

        Byte myByte = 127;
        Short myShort = 5635;
        Integer myInteger = 65465464;
        Long myLongr = 64564596465656L;
        Float myFloat = 454.044f;
        Double myDouble = 5456516156.044564;
        Boolean myBoolean = true;
        Character myChar = 'G';

        System.out.println(myByte.byteValue());
        System.out.println(myShort.shortValue());
        System.out.println(myInteger.intValue());
        System.out.println(myLongr.longValue());
        System.out.println(myFloat.floatValue());
        System.out.println(myDouble.doubleValue());
        System.out.println(myBoolean.booleanValue());
        System.out.println(myChar.charValue());
    }
}
