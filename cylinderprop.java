//create a class cylinder and use getter and setter to set its radius and height
class cylinder {
    double radius;
    double height;
    public void setter(double rad,double len){
         radius=rad;
         height=len;

    }
    public void getter(){
        System.out.println("radius of cylinder is = "+ radius);
        System.out.println("height of cylinder is = " + height);
    }
    public double surfaceArea(){
        return 2*radius*3.14*(height + radius);
    }
    public double volume(){
        return 2*3.14*radius*height;


    }
   
}
public class cylinderprop {

    public static void main(String[] args) {
        cylinder cylinder1=new cylinder();
        cylinder1.setter(5, 8);
        cylinder1.getter();
        System.out.println("surface area is = "+cylinder1.surfaceArea());
        System.out.println("volume is = "+cylinder1.volume());
    }
}

