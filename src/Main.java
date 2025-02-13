package src;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("入力してください: ");
    String input = scanner.nextLine();
    String[] inputArray = input.split("");
    for (String str : inputArray) {
      Integer num = Integer.parseInt(str);
      for (int i = 1; i <= (inputArray.length - num); i++) {
        System.out.printf(" ");
      }
      for (int i = 1; i < num; i++) {
        System.out.printf(String.valueOf(i));
      }
      System.out.printf(str);
      for (int i = 1; i < num; i++) {
        System.out.printf(String.valueOf(num - i));
      }
      System.out.printf("%n");
    }
    scanner.close();
  }
}
