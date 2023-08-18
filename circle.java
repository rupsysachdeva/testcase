import java.util.*;
class circle
{
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        int r=read.nextInt();
        System.out.println("Area is:"+(double)(3.14*r*r));
    }
}