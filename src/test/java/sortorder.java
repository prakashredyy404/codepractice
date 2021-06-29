import java.util.ArrayList;
import java.util.Arrays;

public class sortorder {
    public static void main(String[] args) {
        String[] arr ={ "hi","bi","hi ","by","bi","hi","mau"};
        Arrays.sort(arr ,String.CASE_INSENSITIVE_ORDER);
        for ( String newarr:arr){

        System.out.println (newarr);}


    }
}
