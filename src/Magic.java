import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Magic {
	
	String username; 
	String password;
	String uri;
	String folderName;
	String commitMessage;
	
	public Magic(String username, char[] cs, String uri, String folderName, String commitMessage){
		this.username = username;
		password = new String(cs);
		this.uri = uri;
		this.folderName = folderName;
		this.commitMessage = commitMessage;
		
		System.out.println(username + " " + password);
		
		Runtime runtime = Runtime.getRuntime();
		Process process;
		try {
			process = runtime.exec("git add " + folderName);
			
			InputStream is = process.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			String line;
			
			

			while ((line = br.readLine()) != null) {
			    System.out.println(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // you might need the full path
		
		
		

		
		
		
		
	}
	
}
