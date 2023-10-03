import java.util.Scanner;

public class PRAK005_2210817220019_dheaaprilindautami {
    public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                long t=sc.nextLong();
                for(int i=0;i<t;i++){
                    long k=sc.nextLong();
                    long sum=0;
                    for(int j=0;j<k;j++){
                        long c=sc.nextLong();
                        sum=(sum+c)%k;
                    }
                    if(sum==0){
                        System.out.println("YES");
                    }else{
                        System.out.println("NO");
                    }
                }
    }
}
