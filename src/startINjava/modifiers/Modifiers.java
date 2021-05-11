package startINjava.modifiers;

public class Modifiers {
    public void publicAccessModifiers() {
        staticAccessModifiers();
    }

    static void staticAccessModifiers() {

    }

    public static void main(String[] args) {
        staticAccessModifiers();

        AccessModifiers.staticAccessModifiers();
        NonAccessModifiers.staticAccessModifiers();

        AccessModifiers myAccessModifiers = new AccessModifiers();
        myAccessModifiers.access0 = 4;
        myAccessModifiers.access1 = 5;
        myAccessModifiers.access3 = 7;
        myAccessModifiers.publicAccessModifiers();

        NonAccessModifiers myNonAccessModifiers = new AbstractAccessModifiers();
        myNonAccessModifiers.access0 = 55;
        //myNonAccessModifiers.access1 = 55;
        myNonAccessModifiers.abstractAccessModifiers();

        Modifiers.staticAccessModifiers();

        Modifiers myModifiers = new Modifiers();
        myModifiers.publicAccessModifiers();
    }
}

class AccessModifiers {

    transient int access0;
    transient public int access1;
    volatile private int access2;
    volatile protected int access3;

    public void publicAccessModifiers() {
        staticAccessModifiers();
    }

    static void staticAccessModifiers() {

    }
}

abstract class NonAccessModifiers {

    volatile int access0;
    transient final int access1 = 4;

    abstract void abstractAccessModifiers();

    static void staticAccessModifiers() {

    }
}

class AbstractAccessModifiers extends NonAccessModifiers {

    @Override
    final void abstractAccessModifiers() {

    }
}
