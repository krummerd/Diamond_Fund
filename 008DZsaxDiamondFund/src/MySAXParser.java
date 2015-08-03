import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


public class MySAXParser extends DefaultHandler {
	
	List<Gem> list = new ArrayList<>();
	Gem gem;
	int current = 0;

	@Override
	public void startDocument() throws SAXException {
		System.out.println("start parsing...");
	}
	
	@Override
	public void endDocument() throws SAXException {
		System.out.println("stop parsing.");
	}
	
	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attr) throws SAXException {
		switch (qName){
		case "diamond" :{
			gem = new Gem();
			String id = attr.getValue("id");
			gem.setId(id);
			current = 1;
			break;
		}
		
		case "name":{
			current = 2;
			break;
		}
		
		case "preciousness":{
			current = 3;
			break;
		}
		
		case "origin" :{
			current = 4;
			break;
		}
		
		case "visualparameters" :{
			gem.visPar = new Gem.VisualParameters();
			current = 5;
			break;
		}
		
		case "color" :{
			current = 6;
			break;
		}
		
		case "transparency" :{
			current = 7;
			break;
		}
		
		case "cut" :{
			current = 8;
			break;
		}
		
		case "value" :{
			current = 9;
			break;
		}
					
		}
	}
	
	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		String text = new String(ch, start, length);
		
		switch (current){
		
		case 2: {
			gem.setName(text);
			break;
		}
		
		case 4: {
			gem.setOrigin(text);
			break;
		}
		
		case 3: {
			gem.setPreciousness(text);
			break;
		}
		
		case 6: {
			gem.visPar.setColor(text);
			break;
		}
		
		case 7: {
			int transp = Integer.parseInt(text);
			gem.visPar.setTransparency(transp);
			break;
		}
		
		case 8: {
			int cut = Integer.parseInt(text);
			gem.visPar.setCut(cut);
			break;
		}
		
		case 9: {
			double value = Double.parseDouble(text);
			gem.setValue(value);
			break;
		}
		}
		current = 0;
	}	
	
	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		switch (qName){
		case "diamond" :{
			list.add(gem);
			break;
		}
		}
	}

	public List<Gem> getList() {
		return list;
	}

	public void setList(List<Gem> list) {
		this.list = list;
	}

	public Gem getGem() {
		return gem;
	}

	public void setGem(Gem gem) {
		this.gem = gem;
	}

	public int getCurrent() {
		return current;
	}

	public void setCurrent(int current) {
		this.current = current;
	}






	
}
