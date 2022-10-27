package Ejercicio4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;


public class MiniCalculadora extends JFrame {
	double resultado=0.0;
	private JPanel contentPane;
	private JTextField tfOperador1;
	private JTextField tfOperador2;
	private JTextField tfResultado;

	/**
	 * Create the frame.
	 */
	public MiniCalculadora() {
		setTitle("Mini calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tfOperador1 = new JTextField();
		tfOperador1.setBounds(120, 50, 86, 20);
		contentPane.add(tfOperador1);
		tfOperador1.setColumns(10);
				
		tfOperador2 = new JTextField();
		tfOperador2.setBounds(120, 92, 86, 20);
		contentPane.add(tfOperador2);
		tfOperador2.setColumns(10);

		tfResultado = new JTextField();
		tfResultado.setEditable(false);
		tfResultado.setBounds(120, 138, 86, 20);
		contentPane.add(tfResultado);
		tfResultado.setColumns(10);
		
		
		JButton btnDiv = new JButton("/");
		btnDiv.setBounds(288, 137, 89, 23);
		contentPane.add(btnDiv);
		
		JButton btnMulti = new JButton("x");
		btnMulti.setBounds(288, 103, 89, 23);
		contentPane.add(btnMulti);
		
		JButton btnResta = new JButton("-");
		btnResta.setBounds(288, 69, 89, 23);
		contentPane.add(btnResta);
		
		JButton btnSuma = new JButton("+");
		btnSuma.setBounds(288, 35, 89, 23);
		contentPane.add(btnSuma);
		
		JLabel lblNewLabel_1 = new JLabel("Operador 1:");
		lblNewLabel_1.setBounds(35, 53, 75, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Operador 2:");
		lblNewLabel_2.setBounds(35, 95, 69, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("Resultado:");
		lblNewLabel.setBounds(35, 141, 63, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnAbout = new JButton("About");
		btnAbout.setBounds(335, 227, 89, 23);
		contentPane.add(btnAbout);
		
		
		
		
		//EVENTOS
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double op1= Double.parseDouble(tfOperador1.getText());
				double op2= Double.parseDouble(tfOperador2.getText());
				
				DecimalFormat  df = new DecimalFormat("#.00");
				resultado=op1+op2;
				tfResultado.setText(df.format(resultado));
			}

		});
		
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double op1= Double.parseDouble(tfOperador1.getText());
				double op2= Double.parseDouble(tfOperador2.getText());
				
				DecimalFormat  df = new DecimalFormat("#.00");
				resultado=op1-op2;
				tfResultado.setText(df.format(resultado));
				
			}
		});
		
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double op1= Double.parseDouble(tfOperador1.getText());
				double op2= Double.parseDouble(tfOperador2.getText());
				
				DecimalFormat  df = new DecimalFormat("#.00");
				
				resultado=op1*op2;
				tfResultado.setText(df.format(resultado));
			}
		});
		
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double op1= Double.parseDouble(tfOperador1.getText());
				double op2= Double.parseDouble(tfOperador2.getText());
				
				DecimalFormat  df = new DecimalFormat("#.00");
				
				resultado=op1/op2;
				tfResultado.setText(df.format(resultado));
			}
		});
		
		btnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(btnAbout, "Versión: 1.0 \nDesarrollador: Carlos M.\nCopyright 2022©");
			}
		});
	}
}
