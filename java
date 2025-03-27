import java.util.Scanner;
public class studentdetails
{
    public static void main(String[]args)
    {
        Scanner Obj = new Scanner (System.in);
        String a,c,d;
        int b;
      
        System.out.print("enter your name:-");
        a=Obj.nextLine();
      
        System.out.print("enter your roll number:-");
        b=Obj.nextInt();
        Obj.nextLine();
      
        System.out.print("enter your course:-");
        c=Obj.nextLine();
      
        System.out.print("enter your subject:-");
        d=Obj.nextLine ();
      
        System.out.print("name:-"+a);
        System.out.print(" roll number:-"+b);
        System.out.print(" course:-"+c);
        System.out.print(" subject:-"+d);
    }
    
}
