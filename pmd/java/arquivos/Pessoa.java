package arquivos;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Pessoa implements Serializable {

	private static final long serialVersionUID = 8825790449977200059L;
	private int rg;
	private String nome;
	
	public Pessoa(int rg, String nome) {
		this.rg = rg;
		this.nome = nome;
	}
	
	public int getRg() {
		return rg;
	}
	
	public void setRg(int rg) {
		this.rg = rg;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Pessoa [rg=" + rg + ", nome=" + nome + ", getClass()=" + getClass() +
			", hashCode()=" + hashCode() + "]";
	}
	
	
	public static void main(String[] args) {
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		int op = 1; 
		while (op != 0) {
			op = Integer.parseInt(
				JOptionPane.showInputDialog("0 - SAIR\n1 - Cadastrar pessoa"));
			if (op == 1) {
				int r = Integer.parseInt(
						JOptionPane.showInputDialog("Digite o RG:"));
				String n = JOptionPane.showInputDialog("Digite o nome:");
				pessoas.add(new Pessoa(r, n));				
			}
		}
		
		try {
			Path arq = Paths.get("arquivos\\pessoas.txt");
			if (!Files.exists(arq))
				Files.createFile(arq);
			
			FileOutputStream fos = new FileOutputStream(arq.toString());
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			ObjectOutputStream oos = new ObjectOutputStream(bos);
			
			for (Pessoa p : pessoas) {
				oos.writeObject(p);
			}
			
			oos.close();
			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	

}
