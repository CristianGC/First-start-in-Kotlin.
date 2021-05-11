package startINjava.inner.classes;

public class InnerClasses {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x + myInner.myInnerMethod());

        OuterClass.StaticInnerClass myStaticInner = new OuterClass.StaticInnerClass();
        System.out.println(myStaticInner.y);
    }
}
