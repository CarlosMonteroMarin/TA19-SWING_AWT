package Ejercicio3;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSlider;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Encuestas extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Encuestas() {
		setTitle("Encuesta");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//ETIQUETAS
		JLabel lblNewLabel = new JLabel("Elije un sistema operativo");
		lblNewLabel.setBounds(40, 30, 154, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Elije tu especialidad");
		lblNewLabel_1.setBounds(40, 136, 144, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Horas dedicadas en el ordenador");
		lblNewLabel_2.setBounds(224, 30, 200, 14);
		contentPane.add(lblNewLabel_2);
		
		//RADIOBUTTON
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Windows");
		rdbtnNewRadioButton.setBounds(50, 51, 134, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Linux");
		rdbtnNewRadioButton_1.setBounds(50, 77, 134, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Mac");
		rdbtnNewRadioButton_2.setBounds(50, 106, 134, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnNewRadioButton);
		group.add(rdbtnNewRadioButton_1);
		group.add(rdbtnNewRadioButton_2);

		
		//CHECKBOX
		JCheckBox checkBox1 = new JCheckBox("Programación",false);
		checkBox1.setBounds(50, 157, 134, 23);
		contentPane.add(checkBox1);
		
		JCheckBox checkBox2 = new JCheckBox("Diseño gráfico", false);
		checkBox2.setBounds(50, 183, 134, 23);
		contentPane.add(checkBox2);
		
		JCheckBox checkBox3 = new JCheckBox("Administración", false);
		checkBox3.setBounds(50, 209, 134, 23);
		contentPane.add(checkBox3);
		
		//SLIDER
		JSlider slider = new JSlider();
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.setMajorTickSpacing(1);
		slider.setValue(5);
		slider.setMaximum(10);
		slider.setBounds(224, 55, 200, 45);
		contentPane.add(slider);
		
		//BOTON ENVIAR
		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.setBounds(270, 157, 89, 23);
		contentPane.add(btnNewButton);
		

		
		//EVENTOS
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//OBTENER RESULTADOS RADIOBUTTON
				String resultado_radiobutton="";
				if (rdbtnNewRadioButton.isSelected()) {
		            resultado_radiobutton = rdbtnNewRadioButton.getText();
		        }
		        if (rdbtnNewRadioButton_1.isSelected()) {
		        	resultado_radiobutton =  rdbtnNewRadioButton_1.getText();
		        }
		        if (rdbtnNewRadioButton_2.isSelected()) {
		        	resultado_radiobutton = rdbtnNewRadioButton_2.getText();
		        }        
		        
		        //OBTENER RESULTADOS CHEKBOX
		        String cad="";
		        if (checkBox1.isSelected()==true) {
		            cad=cad+", "+checkBox1.getText();
		        }
		        if (checkBox2.isSelected()==true) {
		            cad=cad+", "+checkBox2.getText();
		        }
		        if (checkBox3.isSelected()==true) {
		            cad=cad+", "+checkBox3.getText();
		        }
		        

		      
				JOptionPane.showMessageDialog(btnNewButton, "Sistema operativo: "+resultado_radiobutton
						+"\nEspecialidad: "+cad
						+"\nHoras dedicadas: "+slider.getValue()+group.getSelection());
				
			}
		});
		
	}
}

