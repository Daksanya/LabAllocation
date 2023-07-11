import java.util.Scanner;

public class LabAllocation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int n=sc.nextInt();
        int min=1000;
        String lab=" ";
        if(x>=n&&x-n<min){
            min=x-n;
            lab="L1";
        }
        if(y>=n&&y-n<min){
            min=y-n;
            lab="L2";
        }
        if(z>=n&&z-n<min){
            min=z-n;
            lab="L3";;
        }
        System.out.println(lab);
    }
}
