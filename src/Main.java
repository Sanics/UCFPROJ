import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by MagicMan on 2/22/2016.
 */
public class Main {
    public static final String file = "INPUT.TXT";

    public static void main(String[] args){
        for(int n = 0; n < 100000; n++) {
            int[] ints = getFactors(n);
            System.out.print("Num: " + n + ", Factors: ");
            for (int i : ints) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static boolean isPrime(int f){
        return getFactors(f).length == 0;
    }

    public static int[] getFactors(int f){
        ArrayList<Integer> a = new ArrayList<Integer>();

        for(int i = 2; i < f; i++){
            int ceil = (int)Math.ceil((float)f / (float)i);
            int div = f / i;

            if(ceil == div){
                a.add(i);
            }
        }

        int[] ret = new int[a.size()];
        for(int i = 0; i < ret.length; i++){
            ret[i] = a.get(i);
        }

        return ret;
    }

    public ArrayList<String> readFile(String fileName){
        Scanner scan = null;
        try{
            scan = new Scanner(new FileInputStream(new File(fileName)));
        } catch(Exception e){
            e.printStackTrace();
        }
        if(scan != null){
            ArrayList<String> ret = new ArrayList<String>();

            String c = "";
            while((c = scan.nextLine()) != null){
                ret.add(c);
            }

            return ret;
        } else {
            return null;
        }
    }
}
