import java.io.*;
import java.util.*;

public class Day1
{
  public static void main(String [] args) throws IOException
  {
    int result = counter("FuelCounterInput.txt");
    System.out.println("Result: " + result);
  }

  public static int counter(String filename) throws IOException
  {
    Scanner scnr = new Scanner(new File(filename));
    int finalSum = 0;
    int moduleSum;
    int moduleWeight;
    while(scnr.hasNextInt())
    {
      moduleWeight = scnr.nextInt();
      moduleSum = (moduleWeight / 3) - 2;
      while(moduleSum > 0)
      {
        finalSum += moduleSum;
        moduleSum = (moduleSum / 3) - 2;
        // System.out.println("moduleSum: " + moduleSum);
      }
    }
    return finalSum;
  }
}
