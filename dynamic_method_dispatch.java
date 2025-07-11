//Run-time polymorphism or dynamic method dispatch involves overriding a method at run-time instead of compile-time.
class Colour {
    void paint() {
        System.out.println("I'm Painting.");
    }
}
    
class RedPaint extends Colour {
    void paint() {
        System.out.println("I'm Painting with Red Colour.");
    }
}
    
class BluePaint extends Colour {
    void paint() {
        System.out.println("I'm Painting with Blue Colour.");
    }
}
public class dynamic_method_dispatch {
     public static void main(String[] args) {
        Colour c;   // at this point c can hold Colour class object but not holding any object yet
        c = new RedPaint();
        c.paint();
        c = new BluePaint();
        c.paint();
    }
    
}
