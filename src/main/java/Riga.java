import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Riga implements City{

    public String visit () throws IOException {
        while (true) {
            System.out.println("What would you like to do today in city?");
            System.out.println("1.Museums");
            System.out.println("2.Shopping");
            System.out.println("3.Attractions");
            System.out.print("Choice:");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String activity = reader.readLine();
            if (activity.equals("1")) {
                return rigaAttractions();
            } else if (activity.equals("2")) {
                return rigaShopping();
            } else if (activity.equals("3")) {
                return rigaMuseum();
            }

            System.out.println("Unknown choice, please try again");
        }

    }

    public String rigaAttractions () throws IOException {
        while(true) {
            System.out.println("1. The Freedom Monument");
            System.out.println("2. House of the Blackheads");
            System.out.println("3. Riga Cathedral");
            System.out.print("Choice:");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String activity = reader.readLine();
            if (activity.equals("1")) {
                return "Freedom Boulevard";
            }

            else if (activity.equals("2")) {
                return "Ratslaukums 7, Riga";
            }

            else if (activity.equals("3")) {
                return "Doma laukums 1, Rīga";
            }

            System.out.println("Unknown choice, please try again");
        }
    }
    public String rigaShopping() throws IOException {
        while(true) {
            System.out.println("1. Alfa parks (Jugla)");
            System.out.println("2. Galleria Riga (Center)");
            System.out.println("3. SPICE & SPICE HOME (Near Riga-Rix)");
            System.out.print("Choice:");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String activity = reader.readLine();
            if (activity.equals("1")) {
                return "Alfa parks\n" +
                        "Brīvības gatve 372, Rīga\n" +
                        "Alfa Every day 8.00 - 23.00\n" +
                        "Rimi Every day 08:00 - 23:00\n" +
                        "Čili Pica Every day 10:00 - 23:00\n" +
                        "Narvesen (C entrance) Every day 09:00 - 22:00\n" +
                        "Song Wash Working days 08:00 - 22:00\n" +
                        "Weekend 09:00 - 22:00\n" +
                        "Banks Every day 10.00 - 21.00\n" +
                        "Sa 10.00 - 20.00\n" +
                        "Sun 10.00 - 19.00 \n";
            }

            else if (activity.equals("2")) {
                return "Galleria Riga\n" +
                        "Dzirnavu iela 67, Rīga\n" +
                        "RIMI Mon.-Fri 7:30 – 23:00\n" +
                        "Saturday, Sunday 8:00 - 23:00\n" +
                        "SEB bank Working days 10:00 – 20:00\n" +
                        "Saturday 10:00 – 16:00; Sunday Closed\n" +
                        "1. – 6. floors M.T.W.T.F.S. 10:00 – 21:00\n" +
                        "Sunday 10:00 – 20:00\n" +
                        "7. floor Individual working hours for each restaurant\n";
            }

            else if (activity.equals("3")) {
                return "SPICE & SPICE HOME\n" +
                        "Lielirbes iela 29, Rīga\n" +
                        "SPICE Monday - Sunday 10.00 - 22.00\n" +
                        "SPICE HOME Monday - Saturday 10.00 - 21.00\n" +
                        "Sunday 10.00 - 20.00\n";
            }

            System.out.println("Unknown choice, please try again");
        }
    }
    public String rigaMuseum() throws IOException {
        while(true) {
            System.out.println("1. Art museum");
            System.out.println("2. History museum");
            System.out.println("3. Medicine museum");
            System.out.print("Choice:");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String activity = reader.readLine();
            if (activity.equals("1")) {
                return "Latvian National Museum of Art\n" +
                        "Jaņa Rozentāla laukums 1, Rīga LV-1010, Latvija\n" +
                        "Monday  Closed\nTuesday  10.00 - 18.00\n" +
                        "Wednesda   10.00 - 18.00\n" +
                        "Thursday 10.00 - 18.00\n" +
                        "Friday  10.00 - 20.00\n" +
                        "Saturday  10.00 - 17.00\n" +
                        "Sunday 10.00 - 17.00\n";
            }

            else if (activity.equals("2")) {
                return "National History Museum of Latvia\n" +
                        "Brīvības bulvāris 32, Rīga, LV-1050\n" +
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
                return "PAULS STRADINS MUSEUM FOR HISTORY OF MEDICINE\n" +
                        "Antonijas iela 1,Rīga\n" +
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
