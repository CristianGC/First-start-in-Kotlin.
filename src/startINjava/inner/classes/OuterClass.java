package startINjava.inner.classes;

public class OuterClass {
    int x = 10;

    class InnerClass {
        int y = 5;

        public int myInnerMethod() {
            return x;
        }
    }

    static class StaticInnerClass {
        int y = 30;

    }
}
