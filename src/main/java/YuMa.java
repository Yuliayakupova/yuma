import com.sun.org.apache.xalan.internal.xsltc.dom.SimpleResultTreeImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class YuMa {
    public static void main(String[] args) throws IOException {
        YuMa app = new YuMa();

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String route = "";
        String choice = "";

        int i = 1;
        while (choice.equals("n") == false) {
            route = route + (i++) + " " + app.run() + "\n";
            System.out.println("Do you want to continue? If no, type N, if yes, then type Y");
            choice = input.readLine();
        }

        System.out.println(route);

    }

    public String run() throws IOException {
        while (true) {
            System.out.println("Hello! \n Choice city");
            System.out.println("1.Riga");
            System.out.println("2.Daugavpils");
            System.out.println("3.Cesis");
            System.out.print("Choice:");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String activity = reader.readLine();

            if (activity.equals("1")) {
                City city = new Riga();
                return city.visit();
            } else if (activity.equals("2")) {
                City city = new Daugavpils();
                return city.visit();
            } else if (activity.equals("3")) {
                City city = new Cesis();
                return city.visit();
            }

            System.out.println("Unknown choice, please try again");
        }

    }

}
