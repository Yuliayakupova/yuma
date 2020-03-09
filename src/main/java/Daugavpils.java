import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Daugavpils implements City {

    public String visit() throws IOException {

        while (true) {
            System.out.println("What would you like to do today in city?");
            System.out.println("1.Museums");
            System.out.println("2.Shopping");
            System.out.println("3.Attractions");
            System.out.print("Choice:");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String activity = reader.readLine();
            if (activity.equals("1")) {
                return daugavpilsAttractions();
            } else if (activity.equals("2")) {
                return daugavpilsShopping();
            } else if (activity.equals("3")) {
                return daugavpilsMuseum();
            }

            System.out.println("Unknown choice, please try again");
        }

    }

    public String daugavpilsAttractions() throws IOException {
        while (true) {
            System.out.println("1. Daugavpils Fortress");
            System.out.println("2. The Saints Boris and Gleb Cathedral");
            System.out.println("3. Daugavpils Shot Factory");
            System.out.print("Choice:");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String activity = reader.readLine();
            if (activity.equals("1")) {
                return "Hospitala Street";
            }

           else if (activity.equals("2")) {
                return "Tautas Street, 2";
            }

            else if (activity.equals("3")) {
                return "Varshavas Street, 28";
            }

            System.out.println("Unknown choice, please try again");
        }
    }

    public String daugavpilsShopping () throws IOException {
        while(true) {
            System.out.println("1. SOLO");
            System.out.println("2. Ditton Nams");
            System.out.println("3. DEPO");
            System.out.print("Choice:");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String activity = reader.readLine();
            if (activity.equals("1")) {
                return "SOLO\nRīgas iela 9, Daugavpils\n" +
                        "Every day 08:00 – 22:00\n";
            }

            else if (activity.equals("2")) {
                return "Ditton Nams\nCietokšņa iela 60, Daugavpils\n" +
                        "Every day 09:00 – 17:00\n";
            }

            else if (activity.equals("3")) {
                return "DEPO\nStacijas iela 129K, Daugavpils\n" +
                        "Every day 08:00 – 20:00\n";
            }

            System.out.println("Unknown choice, please try again");
        }
    }

    public String daugavpilsMuseum () throws IOException {
        while(true) {
            System.out.println("1. Art museum");
            System.out.println("2. Sience museum");
            System.out.println("3. Military museum");
            System.out.print("Choice:");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String activity = reader.readLine();
            if (activity.equals("1")) {
                return "Daugavpils Mark Rothko Art Centre\n" +
                        "Mihaila iela 3, Daugavpils, Latvija\n" +
                        "Monday  Closed\nTuesday  10.00 - 18.00\n" +
                        "Wednesda   10.00 - 18.00\n" +
                        "Thursday 10.00 - 18.00\n" +
                        "Friday  10.00 - 20.00\n" +
                        "Saturday  10.00 - 17.00\n" +
                        "Sunday 10.00 - 17.00\n";
            }

            else if (activity.equals("2")) {
                return "Zinoo\n" +
                        "Vienibas iela 30, Daugavpils\n" +
                        "Monday – closed\n" +
                        "Tuesday 10.00–17.00\n" +
                        "Wednesday 10.00–17.00\n" +
                        "Thursday 10.00–17.00\n" +
                        "Friday 10.00–17.00\n" +
                        "Saturday 10.00–17.00\n" +
                        "Sunday 10.00–17.00\n" +
                        "In summer (June-August) on Tuesdays 11.00–19.00\n";
            }

            else if (activity.equals("3")) {
                return "Svente Manor and the Museum of Military Vehicles\n" +
                        "Alejas iela 7 | Svente,Daugavpils\n" +
                        "Mon. closed\n" +
                        "Tues. 11.00 - 17.00\n" +
                        "Wed. 11.00 - 17.00\n" +
                        "Thu. 11.00 - 19.00\n" +
                        "Fri. 11.00 - 17.00\n" +
                        "Sat. 11.00 - 17.00\n" +
                        "Sun. 11.00 - 16.00\n";
            }

            System.out.println("Unknown choice, please try again");
        }
    }
}
