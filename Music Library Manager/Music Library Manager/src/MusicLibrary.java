import java.util.ArrayList;
import java.util.Scanner;
public class MusicLibrary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner Input
        ArrayList<Music> musicLibrary = new ArrayList<>(); // Arraylist Defined
        int choice;

        do { // main menu stuuf
            System.out.println("_______________________");
            System.out.println("\nMusic Library Manager");
            System.out.println("\n1. Add Song");
            System.out.println("\n2. Add Podcast");
            System.out.println("\n3. Display Music Library");
            System.out.println("\n4. Exit");
            System.out.println("_______________________");
            System.out.print("\nEnter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // go to next line

            if(choice == 1){
                System.out.print("\nEnter song title: ");
                String title = scanner.nextLine();
                musicLibrary.add(new Song(title));
            } else if(choice == 2){
                System.out.print("\nEnter podcast title: ");
                String title = scanner.nextLine();
                musicLibrary.add(new Podcast(title));
            } else if(choice == 3){
                System.out.print("\n--- Music Library ---\n");
                for (Music item : musicLibrary){
                    System.out.println("\n" + item.getDetails() + "\n");
                }
            }
        }  while (choice != 4);
            System.out.println("Goodbye! ");
            scanner.close();
        // Its been a pleasure to be in your class if you are reading this Mr. Peters - From Karthick Arun Period 2 AP CSA

    }
}