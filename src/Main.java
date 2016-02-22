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
