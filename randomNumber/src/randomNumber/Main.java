package randomNumber;

import java.util.Random;

class Main {
  public static void main(String[] args) {

    int min = 1;
    int max = 100;

    Random r = new Random();
    int randomNumber = min + r.nextInt(max);
    System.out.println("Generated number: " + randomNumber);

    if (randomNumber % 2 == 0) {
      System.out.println("Generated number is even.");
    }
  
    else {
      System.out.println("Generated number is odd.");
    }
  }
}