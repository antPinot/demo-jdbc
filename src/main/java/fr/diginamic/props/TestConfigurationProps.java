/**
 * 
 */
package fr.diginamic.props;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ResourceBundle;

import org.apache.commons.configuration2.ex.ConfigurationException;

/**
 * @author antPinot
 *
 */
public class TestConfigurationProps {

	/**
	 * @param args
	 * @throws ConfigurationException 
	 */
	public static void main(String[] args) throws ConfigurationException {
		
		ResourceBundle config = ResourceBundle.getBundle("database");
		String valeur1 = config.getString("database.valeur1");
		//System.out.println(valeur1);
		
		//Iterator<String> keysIte = config.keySet().iterator();
		
		
		/*while (keysIte.hasNext()) {
			System.out.println(keysIte.next()); 
		}*/
		

		Enumeration<String> keys = config.getKeys();
		
		Map<String, String> contenu = new HashMap<String, String>();
		
		while (keys.hasMoreElements()) {
			String clés = keys.nextElement();
			contenu.put(clés, config.getString(clés));	
		}
		
		for (String valeurs : contenu.keySet()) {
			System.out.println(valeurs + " " + contenu.get(valeurs));
		}
	}

}
