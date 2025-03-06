package forloop.java;

public class perfectarmstrongno {
    public static void main(String[] args) {
        int n=30;
        int temp1=n;
        int temp2=n;
        int count=0;
        while(temp1!=0){
            count++;
            temp2=temp1/10;
        }
        while(n!=0){
            int rem=n%10;
            int mult=1;
            int sum=0;
            for(int i=1;i<=count;i++){
                mult=mult*rem;
            }
            sum=sum+mult;
            n=n/10;

        }
        if(temp2==sum){
            System.out.println("armstrong no");
        }
        else{
            System.out.println("not armstrong");
        }

    }
    
}
