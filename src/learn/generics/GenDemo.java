package learn.generics;

/**
 * Created by lowes on 10/8/2016.
 */
public class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb;
        iOb = new Gen<Integer>(88);
        iOb.showType();

        int v = iOb.getOb();
        System.out.println("value : " + v);
        System.out.println();
        Gen<String> strOb = new Gen<String>("Hello Generic String");
        strOb.showType();

        String str = strOb.getOb();
        System.out.println("value: " + str);

    }
}
