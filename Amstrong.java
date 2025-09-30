public class Amstrong{
    public static void main(String args[]){
        int n=1634;
        int reverse=0;
        int temp=n;
        while(temp>0){
            int digit=temp%10;
            reverse=reverse*10+digit;
            n=n/10;
        }
        if(reverse==n){
        System.out.println("amstrong ");
        }
        else{
            System.out.println("Not");
        }
    }
}