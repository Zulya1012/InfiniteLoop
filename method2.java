import java.util.Scanner;
public class method2 {
  public static void main(String[] arg) {
    Scanner sc = new Scanner(System.in);
    for (int x = 1; x > 0; x++) {
      String a = sc.nextLine();
      if (a.equals("x")) {
        System.out.println("We come out from loop");
        break;
      }
      System.out.println(a + "*");

    }
  }
}
