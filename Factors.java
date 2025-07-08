import java.util.Scanner;
 public class Factors {
  
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        for(int i=3;i<a;i++){
        if(i%a==0){
        System.out.println(a);
    }}}
}
