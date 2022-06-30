import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class ReadFileTest {

  File file;
  Scanner scanner;

  @TestInstance(TestInstance.Lifecycle.PER_CLASS)
  public void init() throws FileNotFoundException {
    file = new File("readFileTest.txt");
    scanner = new Scanner(new FileInputStream(file));
  }

  @Test
  void main() {
    int counter = 0;
    while(scanner.hasNext()) {
      counter++;
      scanner.next();
    }
    assertEquals(6,counter);
  }
}