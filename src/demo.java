import java.util.Scanner;

public class demo {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);

        try {

            int a=s.nextInt();
            int   b=s.nextInt();
            int arr[]={5,64,31};
            int index=s.nextInt();
            System.out.println(a/b);
            System.out.println(arr[index]);
        }
        catch (ArrayIndexOutOfBoundsException obj)
        {
            System.out.println(obj);

        }
    }
}
