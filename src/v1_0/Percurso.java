package v1_0;

import javax.swing.JOptionPane;

public class Percurso {
	
	public double kmPerc;
	public double valPedag;
	public double valCombs;
	
	public Percurso() {
		this(0,0,0);
	}

	public Percurso(double kwPerc, double valPedag, double valCombs) {
		this.kmPerc = kwPerc;
		this.valPedag = valPedag;
		this.valCombs = valCombs;
	}

	
	public double getKmPerc() {
		return kmPerc;
	}

	public void setKmPerc(double kmPerc) {
		this.kmPerc = kmPerc;
	}

	public double getValPedag() {
		return valPedag;
	}

	public void setValPedag(double valPedag) {
		this.valPedag = valPedag;
	}

	public double getValCombs() {
		return valCombs;
	}

	public void setValCombs(double valCombs) {
		this.valCombs = valCombs;
	}
	
	public void cadasPerc() {
		
		this.setKmPerc(Double.parseDouble(JOptionPane.showInputDialog(null, "Qual a quilometragem percorrida?", "Travel's Km", 3)));
		
		this.setValCombs(Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o valor gasto em combutível durante a viagem?", "Travel's Km", 3)));
		
		this.setValPedag(Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o valor gasto nos pedágios durante a viagem?", "Travel's Km", 3)));
		
	}
	
	public void listarPerc() {
		
		JOptionPane.showMessageDialog(null, "Dados da Viagem:\nQuilômetragem: " + this.getKmPerc() + " km\nCombustível: R$:" + this.getValCombs() + "\nPedágios: " + this.getValPedag(), "Travl's Km", 1);
		
	}
	

}
