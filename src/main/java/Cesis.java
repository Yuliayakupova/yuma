import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cesis implements City {
    public String visit() throws IOException {

        while (true) {
            int a = 0;
            System.out.println("What would you like to do today in city?");
            System.out.println("1.Museums");
            System.out.println("2.Shopping");
            System.out.println("3.Attractions");
            System.out.print("Choice:");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String activity = reader.readLine();
            if (activity.equals("1")) {
                return cesisAttractions();
            } else if (activity.equals("2")) {
                return сesisShopping();
            } else if (activity.equals("3")) {
                return cesisMuseum();
            }

            System.out.println("Unknown choice, please try again");
        }


    }

    public String cesisAttractions() throws IOException {
        while (true) {
            System.out.println("1. Araisi Lake Dwelling Site");
            System.out.println("2. Rozu Square");
            System.out.println("3. Sarkanas Cliffs and Springs");
            System.out.print("Choice:");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String activity = reader.readLine();
            if (activity.equals("1")) {
                return "Araisu Ezerpils, Araisi, Drabesu Pagasts";
            } else if (activity.equals("2")) {
                return "Rožu laukums";
            } else if (activity.equals("3")) {
                return "Cesis";
            }

            System.out.println("Unknown choice, please try again");
        }

    }

    public String сesisShopping() throws IOException {
        while (true) {
            System.out.println("1. Nodus");
            System.out.println("2. Ķimene");
            System.out.println("3. Solo");
            System.out.print("Choice:");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String activity = reader.readLine();
            if (activity.equals("1")) {
                return "Nodus\n" +
                        "Piebalgas 85, Cēsu nov. Vaives pag.\n" +
                        "Every day 7:30-8:00\n";
            } else if (activity.equals("2")) {
                return "Ķimene\n" +
                        "Rīgas iela 18, Cēsis, Cēsu pilsēta\n" +
                        "Every day 10:00 - 18:00\n";
            } else if (activity.equals("3")) {
                return "Solo\n" +
                        "Lenču iela 36, Cēsis, Cēsu pilsēta\n" +
                        "Every day 12:00 - 20:00\n";
            }

            System.out.println("Unknown choice, please try again");
        }

    }

    public String cesisMuseum() throws IOException {
        while (true) {
            System.out.println("1. Historical museum");
            System.out.println("2. Sience museum");
            System.out.println("3. Castle");
            System.out.print("Choice:");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String activity = reader.readLine();
            if (activity.equals("1")) {
                return "Burning Conscience\n"
                        + "Pils iela 12 | In the Courtyard, Cesis, Latvija\n" +
                        "Monday  Closed\n" +
                        "Tuesday  10.00 - 18.00\n" +
                        "Wednesda   10.00 - 18.00\n" +
                        "Thursday 10.00 - 18.00\n" +
                        "Friday  10.00 - 20.00\n" +
                        "Saturday  10.00 - 17.00\n" +
                        "Sunday 10.00 - 17.00\n";
            }

            else if (activity.equals("2")) {
                return "Zinoo\n" +
                        "Jana Poruka iela 8 | (entrace from Lapsu iela (street)), Cesis\n" +
                        "Monday – closed\n" +
                        "Tuesday 10.00–17.00\n" +
                        "Wednesday 10.00–17.00\n" +
                        "Thursday 10.00–17.00\n" +
                        "Friday 10.00–17.00\n" +
                        "Saturday 10.00–17.00\n" +
                        "Sunday 10.00–17.00In summer (June-August) on Tuesdays 11.00–19.00\n";
            }

            else if (activity.equals("3")) {
                return "Cesis Medieval Castle\n" +
                        "Pils Laukums 9, Cesis\n" +
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
