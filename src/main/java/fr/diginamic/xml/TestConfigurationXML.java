package fr.diginamic.xml;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.configuration2.XMLConfiguration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;

public class TestConfigurationXML {

	public static void main(String[] args) {

		Configurations configs = new Configurations();

		try {
			XMLConfiguration config = configs.xml("configuration.xml");
			System.out.println(config.getString("database[@nom]"));

			Iterator<String> keys = config.getKeys("database");
			
			List<String> keyList = new ArrayList<String>();
			
			Map<String, String> contenu = new HashMap<String, String>();

			while (keys.hasNext()) {
				keyList.add(keys.next());
			}
			
			for (int i=0; i<keyList.size(); i++) {
				contenu.put(keyList.get(i), config.getString(keyList.get(i)));
			}
			
			for (String valeurs : contenu.keySet()) {
				System.out.println(valeurs + " " + contenu.get(valeurs));
			}

		} catch (ConfigurationException e) {
			e.printStackTrace();
		}
	}
}
