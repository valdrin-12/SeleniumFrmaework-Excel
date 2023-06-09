package utilities;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

	public static void main(String[] args) throws IOException {
		
		//System.out.println("the path is : " +System.getProperty("user.dir"));
		

		FileReader fr=new FileReader(System.getProperty("user.dir")+"/src/test/resources/configfiles/Config.properties");
		Properties p=new Properties();
		p.load(fr);
		System.out.println(p.getProperty("browser"));
		System.out.println(p.getProperty("testurl"));

	}

}
