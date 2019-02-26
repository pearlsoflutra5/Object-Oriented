import java.util.Scanner;

class CH12xtras2 {
	public static void main(String[] args) {
		try {
					java.net.URL url = new java.net.URL("http://cs.armstrong.edu/liang/Lincoln.txt"); 
					int count = 0;
					Scanner input = new Scanner(url.openStream());
					while (input.hasNext()) {
						String line = input.nextLine();
						count += line.length();
					} 
					
					System.out.println("The file size is " + count + " characters");
				}
				catch (java.net.MalformedURLException ex) {
					System.out.println("Invalid URL");
				}
				catch (java.io.IOException ex) {
					System.out.println("IO Errors");
				}
	}
}