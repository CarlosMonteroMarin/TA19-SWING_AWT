package Ejercicio2;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Peliculas extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Create the frame.
	 */
	public Peliculas() {
		setTitle("Peliculas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(263, 84, 140, 22);
		contentPane.add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(48, 84, 174, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Añadir");
		
		btnNewButton.setBounds(48, 117, 76, 23);
		contentPane.add(btnNewButton);
		
		
		
		JLabel lblNewLabel = new JLabel("Escribe el título de una película");
		lblNewLabel.setBounds(48, 40, 184, 14);
		contentPane.add(lblNewLabel);
		
		//EVENTOS
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox.addItem(textField.getText());
			}
		});
	}
}
