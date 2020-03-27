package v1_0;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		Percurso trv = new Percurso();
		
		Custos preco = new Custos();
		
		trv.cadasPerc();
		trv.listarPerc();
		
		preco.calcViagem(trv);
		
		JOptionPane.showMessageDialog(null, "O preço final contabiliza:\nR$:" + preco.getTotalCustos(), "Travel's Km", 1);
	}

}
