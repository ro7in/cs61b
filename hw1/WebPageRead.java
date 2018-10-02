import java.net.*;
import java.io.*;

class WebPageRead {
    public static void main(String[] arg) throws Exception {
	URL u = new URL("http://www.chinatour.com/");
	InputStream ins =  u.openStream();
	InputStreamReader isr = new InputStreamReader(ins);
	BufferedReader webPage = new BufferedReader(isr);
	
	System.out.println(webPage.readLine());
	System.out.println(webPage.readLine());
	System.out.println(webPage.readLine());
	System.out.println(webPage.readLine());
	System.out.println(webPage.readLine());
    }
}
