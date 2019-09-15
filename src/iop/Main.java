package iop;

/**
 * Created by emakarov on 27.01.2016.
 */
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // put your code here
        //try {
        BufferedReader br;
        BufferedWriter bw;
        String temp;

        //BufferedInputStream fr;
        //OutputStream bw;

        //FileReader fr = new FileReader("./test1.txt");
        //FileWriter wr = new FileWriter("./test2.txt");

        //bw = new BufferedWriter(wr);
        //br = new BufferedReader(fr);

        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //Map<String, Integer> store = new HashMap<String, Integer>();
        Map<String, Integer> keys = new HashMap<String,Integer>();
        Integer[] mass_count;
        // Map<String, Integer> count = new HashMap<String, Integer>();

        try {
            while ((temp = br.readLine()) != null) {
                int pos1 = temp.indexOf("\t");
                while (!temp.isEmpty()) {

                    String word1 ="";
                    if (pos1 > 0) {word1 = temp.substring(0,pos1)+ temp.substring(pos1+1,temp.length());temp="";}



                 }
                }
            System.out.println(word1 + "\t" + "1"+ "\n");
            bw.write(word1 + "\t" + "1"+ "\n");
            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

    } /*catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/
}