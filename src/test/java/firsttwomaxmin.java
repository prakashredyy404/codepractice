public class firsttwomaxmin {
    public static void main(String[] args) {
        int a[] ={1,5,6,8,6,8,6,9,5};
        int fl = 0;
        int sl = 0;
        for (int i=0;i<a.length; i++)//
        {
            if (sl<a[i]){

                sl= fl;
                fl=a[i];}
         else if(fl <a[i]){
            sl=a[i];
        }}
        System.out.println( "sec:"+  sl+ "frst:"  + fl );




                //5<1

                //
            }
        }

