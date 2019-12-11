package hu.flowacademy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StarWars {

    public static List<Hiperhajtomu> list = new ArrayList<>();

    public static void spaceShips(String filePath) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line = br.readLine();

        while (line != null) {
            String[] array = line.split(" ");
            if (array[0].equals("MilleniumFalcon")) {
                MilleniumFalcon a = new MilleniumFalcon();
                for (int i = 0; i < Integer.parseInt(array[1]); i++) {
                    a.hiperUgras();

                }
                list.add(a);
            }
            if (array[0].equals("XWing")) {
                XWing b = new XWing();
                for (int i = 0; i < Integer.parseInt(array[1]); i++) {
                    b.hiperUgras();

                }
                list.add(b);
            }
            line = br.readLine();
        }
        br.close();
    }

    public static void hangar () {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }

}