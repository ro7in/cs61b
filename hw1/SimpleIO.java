/* SimpleIO.java */

import java.io.*;

/** A class to test some I/O from the keyboard. */
class SimpleIO {
  /** Gets a line of input from the user and prints it out.
   *  @param arg is not used.
   */
  public static void main (String [] arg) throws IOException {
    System.out.println("type a line of text");
    BufferedReader keybd = 
      new BufferedReader(new InputStreamReader(System.in));
    System.out.println(keybd.readLine());
  }
}
