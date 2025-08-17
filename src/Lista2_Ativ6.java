import javax.swing.JOptionPane;

public class Lista2_Ativ6 {

	public static void main(String[] args) {
		int[] vet = {5, 1, 7, 8, 11, 4, 7, 8, 3, 10};
		int b = vet.length - 1;
		int[] a = rec(vet, b, 0);
		
		String x = "";
		for (int i = 0; i <= b; i++) {
			x += " " + a[i] + ", ";
		}
		
		JOptionPane.showMessageDialog(null, "O vetor trocado é: " + x);
	}

	public static int[] rec(int[] vet, int b, int cont){
		
		if (cont >= b) {
			return vet;
		} else  {
			// troca = auxiliar; b = final; cont = inicio;
			int troca = vet[cont];
	        vet[cont] = vet[b];
	        vet[b] = troca;
	        
			return rec(vet, b - 1, cont + 1);
		}
	}
}