package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import javax.swing.border.LineBorder;
import java.awt.FlowLayout;

public class Inicio {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio window = new Inicio();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Inicio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1053, 703);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBackground(new Color(102, 153, 204));
		panel_1.add(panel_2, BorderLayout.NORTH);
		panel_2.setLayout(new MigLayout("", "[][100px,grow,fill][leading][100px:n]", "[]"));
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		panel_2.add(lblNewLabel_1, "cell 0 0");
		
		JLabel lblNewLabel_2 = new JLabel("Fecha:");
		panel_2.add(lblNewLabel_2, "cell 2 0,alignx trailing,growy");
		
		textField = new JTextField();
		textField.setEditable(false);
		panel_2.add(textField, "cell 3 0,growx");
		textField.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(new MigLayout("", "[grow][][grow]", "[grow]"));
		
		JPanel panel = new JPanel();
		panel_3.add(panel, "cell 0 0,grow");
		panel.setLayout(new MigLayout("", "[grow]", "[grow,center][grow,center][grow,center][grow,center]"));
		
		JLabel lblNewLabel_4 = new JLabel("Iniciar Sesi\u00F3n");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_4, "cell 0 0,growx");
		
		JPanel panel_5 = new JPanel();
		panel.add(panel_5, "cell 0 1,grow");
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_4_1 = new JLabel("Ingrese su nombre de usuario:");
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setBounds(176, 41, 151, 14);
		panel_5.add(lblNewLabel_4_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(201, 78, 96, 20);
		panel_5.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel_6 = new JPanel();
		panel.add(panel_6, "cell 0 2,grow");
		
		JPanel panel_7 = new JPanel();
		panel.add(panel_7, "cell 0 3,grow");
		
		JLabel lblNewLabel_3 = new JLabel("");
		panel_3.add(lblNewLabel_3, "cell 1 0");
		
		JPanel panel_4 = new JPanel();
		panel_3.add(panel_4, "cell 2 0,grow");
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_4_2 = new JLabel("Iniciar Sesi\u00F3n");
		lblNewLabel_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_2.setBounds(-25, 62, 520, 14);
		panel_4.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Ingrese su nombre de usuario:");
		lblNewLabel_4_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_1.setBounds(160, 174, 151, 14);
		panel_4.add(lblNewLabel_4_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(183, 216, 96, 20);
		panel_4.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(183, 333, 96, 20);
		panel_4.add(textField_3);
		
		JLabel lblNewLabel_4_1_1_1 = new JLabel("Ingrese su nombre de usuario:");
		lblNewLabel_4_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_1_1.setBounds(160, 294, 151, 14);
		panel_4.add(lblNewLabel_4_1_1_1);
		
		JLabel lblNewLabel = new JLabel("Project Manager");
		lblNewLabel.setLabelFor(panel_2);
		lblNewLabel.setBackground(new Color(51, 102, 153));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 57));
		lblNewLabel.setOpaque(true);
		frame.getContentPane().add(lblNewLabel, BorderLayout.NORTH);
	}
}
