
public class Gem {
	String id;
	String name;
	String preciousness;
	String origin;
	double value;
	VisualParameters visPar;
	
	static class VisualParameters{
		String color;
		int transparency;
		int cut;
		
		
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public int getTransparency() {
			return transparency;
		}
		public void setTransparency(int transparency) {
			this.transparency = transparency;
		}
		public int getCut() {
			return cut;
		}
		public void setCut(int cut) {
			this.cut = cut;
		}
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPreciousness() {
		return preciousness;
	}

	public void setPreciousness(String preciousness) {
		this.preciousness = preciousness;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public VisualParameters getVisPar() {
		return visPar;
	}

	public void setVisPar(VisualParameters visPar) {
		this.visPar = visPar;
	}
	
		
}
