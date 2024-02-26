package arquivos;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JArquivos extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	private JButton btnNovoArq;
	private JButton btnNovoDir;
	private JButton btnApaga;
	
	public JArquivos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(200, 150);
		
		btnNovoArq = new JButton("Novo Arquivo");
		btnNovoArq.addActionListener(this);
		
		btnNovoDir = new JButton("Novo Diretório");
		btnNovoDir.addActionListener(this);
		
		btnApaga = new JButton("Apagar Arquivo/Diretório");
		btnApaga.addActionListener(this);
		
		setLayout(new FlowLayout());
		add(btnNovoArq);
		add(btnNovoDir);
		add(btnApaga);		
	}

	public static void main(String[] args) {
		new JArquivos().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		
		JFileChooser fc = new JFileChooser();
		try {
		
			if (evento.getSource() == btnNovoArq) {
				fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
				fc.showSaveDialog(this);
				Path path = Paths.get(fc.getSelectedFile().toString());
				Files.createFile(path);			
			}
			
			else if (evento.getSource() == btnNovoDir) {
				fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				fc.showSaveDialog(this);				
				Path path = Paths.get(fc.getSelectedFile().toString());
				Files.createDirectory(path);	
			}
			
			else if (evento.getSource() == btnApaga) {
				fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
				fc.showOpenDialog(this);				
				Path path = Paths.get(fc.getSelectedFile().toString());
				Files.deleteIfExists(path);	
			}		
			
		}
		catch (IOException ioe) {
			JOptionPane.showMessageDialog(this, ioe.getMessage());			
		}
		catch (NullPointerException npe) { }		
		
	}

}
