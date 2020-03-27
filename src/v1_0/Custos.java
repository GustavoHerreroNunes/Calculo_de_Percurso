package v1_0;

public class Custos {
	
	private double totalCustos;
	
	public Custos() {
		this(0);
	}

	public Custos(double totalCustos) {
		this.totalCustos = totalCustos;
	}

	
	public double getTotalCustos() {
		return totalCustos;
	}

	public void setTotalCustos(double totalCustos) {
		this.totalCustos = totalCustos;
	}
	
	public void calcViagem(Percurso p) {
		 this.setTotalCustos((p.kmPerc*p.valCombs) + p.valPedag);
	}
}
