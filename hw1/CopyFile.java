/* CopyFile.java */

import java.io.*;

/** A class to copy one line of a file to a backup version */

class CopyFile {

  /** Prompts the user for a file to backup and writes one line
   *  of that file to a file with the same name, but with the
   *  ".copy" extension added.
   */
  public static void main(String arg[]) throws Exception {
    // Get both file names
    BufferedReader keybd =
      new BufferedReader(new InputStreamReader(System.in));
    System.out.print("name of file to copy: ");		
    System.out.flush();
    String fileNameOrig = keybd.readLine();
    String fileNameCopy = fileNameOrig.concat(".copy");

    // Arrange to read from original file
    BufferedReader readerOrig =
      new BufferedReader(new InputStreamReader(
        new FileInputStream(new File(fileNameOrig))));

    // Arrange to write to backup file
    PrintWriter writerCopy = new PrintWriter(
      new FileOutputStream(
        new File(fileNameCopy)), true);

    // Read a line from original file and write to backup copy
    writerCopy.println(readerOrig.readLine());
    }
}
