public class reversewithoutbuffer {
    public static   void main(String[] args) {
        String a = "haribari";
        char[] cr = a.toCharArray();
        //a.toCharArray();
         int length =cr .length ;

        String invert ="";
        for (int i=length -1; i>=0; i--){
          //
             System.out.println(  + cr [i]) ;
        }
        //return invert;

        }


        
       /* String original = "str";
         int length = original.length();
        //String invert = "";
        for (int i = length - 1; i >= 0; i--) {
            invert = invert + original.charAt(i);
        }
        return invert;*/
    }

