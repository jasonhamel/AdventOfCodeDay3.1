import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            HashMap<Integer, String> rucksacks;
            rucksacks = importData();
            System.out.println(rucksacks);
            char[] dupes = dupeFinder(rucksacks);
            for (int i = 0; i < dupes.length; i++) {
                System.out.println(dupes[i]);
            }
            int sum = counter(dupes);
            System.out.println(sum);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static HashMap<Integer, String> importData() throws FileNotFoundException {
        HashMap<Integer, String> rucksacks = new HashMap<>();
        FileInputStream fis = new FileInputStream("Rucksacks.txt");
        Scanner scan = new Scanner(fis);
        int i = 0;
        while (scan.hasNextLine()) {
            rucksacks.put(i, scan.nextLine());
            i++;
        }
        return rucksacks;
    }

    public static char[] dupeFinder(HashMap<Integer, String> rucksacks) {
        char[] dupes = new char[300];

        for (int i = 0; i < rucksacks.size(); i++) {
            String container1 = rucksacks.get(i).substring(0, rucksacks.get(i).length() / 2);
            String container2 = rucksacks.get(i).substring(rucksacks.get(i).length() / 2);
            System.out.println(container1 + " " + container2);
            for (int j = 0; j < container1.length(); j++) {
                boolean breakOut = false;
                for (int k = 0; k <container2.length(); k++) {
                    if (container1.substring(j, j + 1).equals(container2.substring(k, k + 1))) {
                        dupes[i] = container2.charAt(k);
                        breakOut = true;
                        break;
                    }
                }
                if (breakOut) {
                    break;
                }
            }
        }
        return dupes;
    }

    public static int counter(char[] dupes) {
        int sum = 0;
        for (int i = 0; i < dupes.length; i++) {
            switch (dupes[i]) {
                case 'a':  sum += 1; break;
                case 'b':  sum += 2; break;
                case 'c':  sum += 3; break;
                case 'd':  sum += 4; break;
                case 'e':  sum += 5; break;
                case 'f':  sum += 6; break;
                case 'g':  sum += 7; break;
                case 'h':  sum += 8; break;
                case 'i':  sum += 9; break;
                case 'j':  sum += 10; break;
                case 'k':  sum += 11; break;
                case 'l':  sum += 12; break;
                case 'm':  sum += 13; break;
                case 'n':  sum += 14; break;
                case 'o':  sum += 15; break;
                case 'p':  sum += 16; break;
                case 'q':  sum += 17; break;
                case 'r':  sum += 18; break;
                case 's':  sum += 19; break;
                case 't':  sum += 20; break;
                case 'u':  sum += 21; break;
                case 'v':  sum += 22; break;
                case 'w':  sum += 23; break;
                case 'x':  sum += 24; break;
                case 'y':  sum += 25; break;
                case 'z':  sum += 26; break;
                case 'A':  sum += 27; break;
                case 'B':  sum += 28; break;
                case 'C':  sum += 29; break;
                case 'D':  sum += 30 ;break;
                case 'E':  sum += 31; break;
                case 'F':  sum += 32; break;
                case 'G':  sum += 33; break;
                case 'H':  sum += 34; break;
                case 'I':  sum += 35; break;
                case 'J':  sum += 36; break;
                case 'K':  sum += 37; break;
                case 'L':  sum += 38; break;
                case 'M':  sum += 39; break;
                case 'N':  sum += 40; break;
                case 'O':  sum += 41; break;
                case 'P':  sum += 42; break;
                case 'Q':  sum += 43; break;
                case 'R':  sum += 44; break;
                case 'S':  sum += 45; break;
                case 'T':  sum += 46; break;
                case 'U':  sum += 47; break;
                case 'V':  sum += 48; break;
                case 'W':  sum += 49; break;
                case 'X':  sum += 50; break;
                case 'Y':  sum += 51; break;
                case 'Z':  sum += 52; break;
            }
        }
        return sum;
    }

}