/* StringUse.java */

/** Try some simple examples of using Strings. */
class StringUse {
  public static void main (String[] argv) {
    String s1;                  // step 1
    s1 = new String();          // step 2
    String s2 = "special";      // steps 1 & 2, combined
    System.out.println("s1 is: " + s1 + ", s2 is: " + s2);
    s1 = s2;                    // assignment -- now they refer to the same object
    System.out.println("s1 is: " + s1 + ", s2 is: " + s2);
    s1 = s1.substring(0,4);     // now they refere to different objects
            // note: method invocation on s1
    System.out.println("s1 is: " + s1 + ", s2 is: " + s2);
    s1 = s1.concat("k");        
    System.out.println("s1 is: " + s1 + ", s2 is: " + s2);
    System.out.println("the length of s1 is: " + s1.length());
  }
}
