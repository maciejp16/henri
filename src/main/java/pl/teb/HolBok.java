package pl.teb;

import java.io.*;

public class HolBok {
    public void readLinesFromFile(String filePath) throws Exception {
        File file = new File(filePath);
        FileReader r = new FileReader(file);
        BufferedReader br = new BufferedReader(r);
        String st = br.readLine();
        while (st != null) {
            System.out.println(st);
            st = br.readLine();
        }
    }

    public void pisz(String filePath) throws Exception {
        File file = new File(filePath);
        FileWriter w = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(w);

        bw.write("Hello World");
        bw.newLine();
        bw.flush();
        bw.close();
    }
}
