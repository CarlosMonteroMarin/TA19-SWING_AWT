package Ejercicio1;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Saludador extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Create the frame.
	 */
	public Saludador() {
		setTitle("Saludador");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 523, 349);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(157, 128, 172, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Escribe un nombre para saludar");
		lblNewLabel.setBounds(157, 81, 249, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("¡Saludar!");
		
		btnNewButton.setBounds(198, 181, 89, 23);
		contentPane.add(btnNewButton);
		
		//EVENTOS
		btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnNewButton, "¡Hola "+textField.getText()+"!");
			}
			
		});
		
		
	}
}
