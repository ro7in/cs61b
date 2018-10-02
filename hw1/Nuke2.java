/* Nuke2.java */

import java.io.*;

/** A class to test some I/O from the keyboard. */
class Nuke2 {
  /** Gets a line of input from the user and prints it out.
   *  @param arg is not used.
   */
  public static void main (String [] arg) throws IOException {
    BufferedReader keyboard; 
    String input;
    String nuke2 = "";

    System.out.println("type a line of text");
    keyboard = new BufferedReader(new InputStreamReader(System.in));
    input = keyboard.readLine();

    for(int i = 0; i < input.length(); i++){
        if(i != 1){
            nuke2 += input.charAt(i);
        }
    }

    System.out.println(nuke2);
  }
}
