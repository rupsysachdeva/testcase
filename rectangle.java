import java.util.Scanner;

class rectangle {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("Enter the length of a rectangle");
        int l=read.nextInt();
        System.out.println("Enter the breadth of a rectangle");
        int b=read.nextInt();
        System.out.println("Area is:"+(l*b));
    }
}
