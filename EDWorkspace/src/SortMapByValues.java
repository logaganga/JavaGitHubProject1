
import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;

public class SortMapByValues {
	
    //private static final Logger log = LogManager.getLogger(SortMapByValues.class);

	public static void main(String[] args) {
		
		//log.info("Entering main method");
		Map<String, String> unsortedMap = new HashMap<String, String>();
		unsortedMap.put("Product1", "50000");
		unsortedMap.put("Product2", "12000");
		unsortedMap.put("Product3", "45000");
		unsortedMap.put("Product4", "85000");
		
		List<Entry<String,String>> list = new ArrayList<Entry<String,String>>(unsortedMap.entrySet());
		
		if(list.isEmpty()) {
			//log.error("Error:List Empty");
			
		}else {
		
		Collections.sort(list,new Comparator<Entry<String,String>>(){
			public int compare(Entry<String, String> o1, Entry<String, String> o2) {
				return o2.getValue().compareTo(o1.getValue());
			}
		});
		
		Map<String, String> sortedMap = new LinkedHashMap<String, String>();
        for(Map.Entry<String, String> entry:list){
        	sortedMap.put(entry.getKey(), entry.getValue());
            System.out.println("Key:"+entry.getKey()+ " Value:"+entry.getValue());
        }
		
      // log.info("Exit main method");
	}
	}	
		
}
