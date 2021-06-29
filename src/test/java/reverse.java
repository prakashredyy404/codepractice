public class reverse {
    public static void main(String[] args) {
        int rev = 0;
        int number  =12345;
        int reminder = 0;
        while(number>=1){
          rev = rev*10+number%10;
       number= number/10;}
        System.out.println(rev);






    }
}
