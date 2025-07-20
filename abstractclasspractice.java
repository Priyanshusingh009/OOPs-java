abstract class pen {
    abstract void write();
    abstract void refill();
    abstract void changeNib();
}


class fountainPen extends pen{
    void write(){
        System.out.println("write");
    }
    void refill(){
        System.out.println("Refill");
    }
    void changeNib(){
        System.out.println("changing nib");
    }

}
class monkey{
    void jump(){
        System.out.println("jumping.....");
    };
    void bite(){
        System.out.println("biting....");
    };

}
interface basicAnimal{
    void eat();
    void sleep();
    
}
class human extends monkey{
    void speak(){
        System.out.println("hrllo sir");
    }
    void eat(){
        System.out.println("eating..");
    }
    void sleep(){
        System.out.println("sleeping");

    }
    
}


public class abstractclasspractice {
    public static void main(String[] args) {
        fountainPen pen = new fountainPen();
        pen.changeNib();

        human hum = new human();
        hum.sleep();

    }
    
}
