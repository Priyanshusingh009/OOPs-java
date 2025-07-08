//create a class cylinder and use getter and setter to set its radius and height
class cylinder {
    int radius;
    int height;
    public void setter(int rad,int len){
        radius=rad;
        height=len;

    }
    public void getter(){
        System.out.println("radius of cylinder is = "+ radius);
        System.out.println("height of cylinder is = " + height);
    }
   
}
public class cylinderprop {

    public static void main(String[] args) {
        cylinder cylinder1=new cylinder();
        cylinder1.setter(5, 8);
        cylinder1.getter();
    }
}

