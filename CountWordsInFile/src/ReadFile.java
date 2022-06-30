import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
  public static void main(String[] args) {
    int counter = 0;
    //If larger than main memory, store the counter in file and change it there
    try {
      File file = new File("readFileTest.txt");
      System.out.println("Reading file: " + file.getName());
      Scanner scanner = new Scanner(new FileInputStream(file));

      while(scanner.hasNext()) {
        counter++;
        scanner.next();
      }
    } catch(FileNotFoundException e) {
      System.out.println("File not found");
      e.printStackTrace();
    }

    System.out.println("The total number of words is: " + counter);
  }
}
