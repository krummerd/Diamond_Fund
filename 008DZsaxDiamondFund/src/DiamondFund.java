import java.util.List;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;


public class DiamondFund {

	public static void main(String[] args) {
		
		try{
			SAXParser parser = SAXParserFactory.newInstance().newSAXParser();
			MySAXParser myPars = new MySAXParser(); 
			parser.parse("Diamonds.xml", myPars);
			
			List<Gem> result = myPars.getList();
			
			System.out.println();
			for (Gem temp : result){
				System.out.println(temp.getName());
				System.out.println(temp.getOrigin());
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
