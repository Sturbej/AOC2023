import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day5 {

    public static void main(String[] args) {
        try{
            File dat = new File("/Users/lukasturbej/IdeaProjects/untitled3/src/text");
            Scanner scan = new Scanner(dat);
            while(scan.hasNextLine()) {
                String x = scan.nextLine();
            }

        }
        catch (FileNotFoundException e){
            System.out.println("NAPAKA!");
            e.printStackTrace();
        }

    }
}

