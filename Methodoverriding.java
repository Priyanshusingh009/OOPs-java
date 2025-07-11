class A{
     public int meth1() {
        return 4;

     }
     public void meth2(){
        System.out.println("i am method of class A");

     }
}
class B extends A{
    @Override               //-------------> this shows that method is overridded
    public void meth2(){
        System.out.println("i am method of class B");

    }

}

    

public class Methodoverriding {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();

        B b = new B();
        b.meth2();
    }
    
}