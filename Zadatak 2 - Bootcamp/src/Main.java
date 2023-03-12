import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double brojKilometara;

        try{
            System.out.println("Unesi broj kilometara: ");
            brojKilometara = scanner.nextDouble();

            if(brojKilometara < 0) {
                throw new IllegalArgumentException("Broj kilometara ne smije biti manje od 0. Napišite opet!");
            }}

            catch(Exception e) {

                System.out.println("Upozorenje: " + e.getMessage());
                return;
            }

        double konverzijskiFaktor;

        try{
            System.out.println("Unesi konverzijski faktor: ");
            konverzijskiFaktor = scanner.nextDouble();

            if(konverzijskiFaktor < 0) {
                throw new IllegalArgumentException("Konverzijski faktor ne smije biti manje od 0. Napišite opet!");
            }}

        catch(Exception e) {

            System.out.println("Upozorenje: " + e.getMessage());
            return;
        }

        int milje = (int) Math.round(brojKilometara / konverzijskiFaktor);

        try {
            File file = new File("Konverzijski faktor.txt");

            FileWriter fileWriter = new FileWriter(file);

            fileWriter.write(Double.toString(konverzijskiFaktor));

            fileWriter.close();
        }
        catch (IOException e) {
            System.out.println("Pogreška: " + e.getMessage());
            return;
        }

        double procitaniKonverzijskiFaktor;
        try {
            File file = new File("Konverzijski faktor.txt");

            Scanner scanner2 = new Scanner(file);
            procitaniKonverzijskiFaktor = Double.parseDouble(scanner2.nextLine());

            scanner2.close();

            if (konverzijskiFaktor != procitaniKonverzijskiFaktor) {
                throw new IllegalArgumentException("Nije jednako");
            }}

        catch (IOException e) {
            System.out.println("Pogreška: " + e.getMessage());
            return;

        }

        System.out.println("Iz datoteke: konverzijski faktor = "+ procitaniKonverzijskiFaktor);

        System.out.println("Uneseno je: " + brojKilometara + " kilometara što je " + milje + " milja");















            }



        }