import java.util.Scanner;

public class Assignment1Program2 {
  public static void main(String[] args) {
    int base,adjust,max,remainder;
    int convertedNum;

    System.out.println("Base Conversion Program \n");
    System.out.print("Please enter a base (2 - 9): ");

    Scanner scan = new Scanner(System.in);
    base = scan.nextInt();

    //Calculate the maximum 4-digit number allowed in base
    adjust = base -1;
    max = (adjust*1000)+(adjust*100)+ (adjust *10) + adjust;

    convertedNum = (adjust * base * base * base) + (adjust * base * base)+(adjust * base)+ (adjust*1);

    System.out.println("\n The maximum, 4-digit, base 10 number in base " + base+ " is " +convertedNum);
    System.out.println("Now enter a base 10 number in the range 0 to " + convertedNum + " to convert: ");

    int baseNum = scan.nextInt();
        
    if (baseNum > 0){
      baseNum = baseNum / base;
      remainder = baseNum % base;
      convertedNum += remainder;
    }

    if (baseNum > 0){
      baseNum = baseNum / base;
      remainder = baseNum % base;
      convertedNum += remainder;
    }
    if (baseNum > 0){
      baseNum = baseNum / base;
      remainder = baseNum % base;
      convertedNum += remainder;
    }

    if (baseNum > 0){
      baseNum = baseNum / base;
      remainder = baseNum % base;
      convertedNum += remainder;
    }

    if (baseNum > 0){
      baseNum = baseNum / base;
      remainder = baseNum % base;
      convertedNum += remainder;
    }

    if (baseNum > 0){
      baseNum = baseNum / base;
      remainder = baseNum % base;
      convertedNum += remainder;
    }

    if (baseNum > 0){
      baseNum = baseNum / base;
      remainder = baseNum % base;
      convertedNum += remainder;
    }
    System.out.print(convertedNum);
    
  }
}
