package modelPlatform;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ModelPlatformImpl implements ModelPlatform {
	
	
	

	

	@Override
	public ValuesAssetImpl dataFeed() {
		// TODO Auto-generated method stub
		
		String csvFile = "datasrc/DAT_MT_EURUSD_M1_201602.csv";
		BufferedReader br = null;
		String line = "";
		ValuesAssetImpl value=null;

		try {

			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {

			       
				String[] quote = line.split(",");
				value=new ValuesAssetImpl(Double.parseDouble(quote[2]),Double.parseDouble(quote[3]),Double.parseDouble(quote[4]),Double.parseDouble(quote[5]),Double.parseDouble(quote[6]));
			 
				


			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		
		return value;
	}
	
	

}