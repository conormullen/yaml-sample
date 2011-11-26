import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.yaml.snakeyaml.Yaml;

/**
 * 
 */

/**
 * 
 * Class used to learn the workings of reading from a YAML file.
 * 
 * @author conormullen
 *
 */
public class YamlReader {
	
	public static void main(String[] args) throws FileNotFoundException{
		
		InputStream input = new FileInputStream(new File("src/main/resources/test.yaml"));
		
		Yaml yaml = new Yaml();
		String document = "  a: 1\n  b:\n    c: 3\n    d: 4\n";
		System.out.println(document);
		System.out.println(yaml.dump(yaml.load(document)));
	}

}
