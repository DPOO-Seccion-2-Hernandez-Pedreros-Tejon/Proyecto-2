package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Window;

import javax.swing.SwingConstants;
import java.awt.Color;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import javax.swing.border.LineBorder;
import java.awt.FlowLayout;
import java.awt.Component;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import java.awt.SystemColor;

public class Inicio {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

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
		
		JPanel principal = new JPanel();
		frame.getContentPane().add(principal, BorderLayout.CENTER);
		principal.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBackground(new Color(102, 153, 204));
		principal.add(panel_2, BorderLayout.NORTH);
		panel_2.setLayout(new MigLayout("", "[][100px,grow,fill][leading][100px:n]", "[]"));
		
		JLabel lblNewLabel_1 = new JLabel("");
		panel_2.add(lblNewLabel_1, "cell 0 0");
		
		JLabel lblNewLabel_2 = new JLabel("Fecha:");
		panel_2.add(lblNewLabel_2, "cell 2 0,alignx trailing,growy");
		
		JLabel lblNewLabel = new JLabel("Project Manager");
		lblNewLabel.setLabelFor(panel_2);
		
		JLabel lblNewLabel_5 = new JLabel(darFechaddMM());
		panel_2.add(lblNewLabel_5, "cell 3 0");
		
		
		crearPanelNuevoProyecto(principal);
		
		
			
	}
	
	
	public void crearPanelInicioSesion(JPanel panel_1)

	{
		JPanel panelInicioSesion = new JPanel();
		panelInicioSesion.setForeground(new Color(255, 255, 255));
		panelInicioSesion.setBackground(Color.DARK_GRAY);
		panel_1.add(panelInicioSesion, BorderLayout.CENTER);
		panelInicioSesion.setLayout(new MigLayout("", "[grow][][grow]", "[grow]"));
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(255, 255, 255));
		panel.setBackground(Color.DARK_GRAY);
		panelInicioSesion.add(panel, "cell 0 0,grow");
		panel.setLayout(new MigLayout("", "[grow]", "[grow,center][grow,center][grow,center][grow,center]"));
		
		JLabel lblNewLabel_4 = new JLabel("Inicia t\u00FA sesi\u00F3n");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBackground(Color.DARK_GRAY);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_4, "cell 0 0,growx");
		
		JPanel panel_5 = new JPanel();
		panel_5.setForeground(new Color(255, 255, 255));
		panel_5.setBackground(Color.DARK_GRAY);
		panel.add(panel_5, "cell 0 1,grow");
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_4_1 = new JLabel("Ingrese su nombre de usuario:");
		lblNewLabel_4_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_4_1.setBackground(Color.DARK_GRAY);
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setBounds(0, 39, 451, 13);
		panel_5.add(lblNewLabel_4_1);
		
		JTextField textField_1 = new JTextField();
		textField_1.setForeground(new Color(255, 255, 255));
		textField_1.setBackground(Color.DARK_GRAY);
		textField_1.setBounds(155, 77, 142, 20);
		panel_5.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel_6 = new JPanel();
		panel_6.setForeground(new Color(255, 255, 255));
		panel_6.setBackground(Color.DARK_GRAY);
		panel.add(panel_6, "cell 0 2,grow");
		panel_6.setLayout(null);
		
		JButton btnNewButton = new JButton("Continuar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				panelInicioSesion.setVisible(false);
				panel_1.remove(panelInicioSesion);
				crearPanelNuevoProyecto(panel_1);
			}
		});
		btnNewButton.setBackground(new Color(102, 153, 255));
		btnNewButton.setBounds(160, 52, 125, 21);
		panel_6.add(btnNewButton);
		
		JPanel panel_7 = new JPanel();
		panel_7.setForeground(new Color(255, 255, 255));
		panel_7.setBackground(Color.DARK_GRAY);
		panel.add(panel_7, "cell 0 3,grow");
		
		JLabel lblNewLabel_3 = new JLabel("\u00D3");
		lblNewLabel_3.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel_3.setOpaque(true);
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBackground(Color.DARK_GRAY);
		panelInicioSesion.add(lblNewLabel_3, "flowx,cell 1 0");
		
		JPanel panel_4 = new JPanel();
		panel_4.setForeground(new Color(255, 255, 255));
		panel_4.setBackground(Color.DARK_GRAY);
		panelInicioSesion.add(panel_4, "cell 2 0,grow");
		panel_4.setLayout(new MigLayout("", "[grow]", "[grow,center][grow,center][grow,center][grow,center]"));
		
		JLabel lblNewLabel_4_2 = new JLabel("Crea un usuario nuevo");
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_4_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_4_2.setBackground(Color.DARK_GRAY);
		lblNewLabel_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblNewLabel_4_2, "cell 0 0,alignx center");
		
		JPanel panel_5_1 = new JPanel();
		panel_5_1.setForeground(new Color(255, 255, 255));
		panel_5_1.setBackground(Color.DARK_GRAY);
		panel_5_1.setLayout(null);
		panel_4.add(panel_5_1, "cell 0 1,grow");
		
		JTextField textField_2 = new JTextField();
		textField_2.setForeground(new Color(255, 255, 255));
		textField_2.setBackground(Color.DARK_GRAY);
		textField_2.setColumns(10);
		textField_2.setBounds(177, 77, 142, 20);
		panel_5_1.add(textField_2);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Ingrese su nombre de usuario:");
		lblNewLabel_4_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_4_1_1.setBackground(Color.DARK_GRAY);
		lblNewLabel_4_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_1.setBounds(0, 37, 480, 13);
		panel_5_1.add(lblNewLabel_4_1_1);
		
		JPanel panel_5_2 = new JPanel();
		panel_5_2.setForeground(new Color(255, 255, 255));
		panel_5_2.setBackground(Color.DARK_GRAY);
		panel_5_2.setLayout(null);
		panel_4.add(panel_5_2, "cell 0 2,grow");
		
		JTextField textField_3 = new JTextField();
		textField_3.setForeground(new Color(255, 255, 255));
		textField_3.setBackground(Color.DARK_GRAY);
		textField_3.setColumns(10);
		textField_3.setBounds(175, 77, 142, 20);
		panel_5_2.add(textField_3);
		
		JLabel lblNewLabel_4_1_2 = new JLabel("Ingrese su nombre de usuario:");
		lblNewLabel_4_1_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_4_1_2.setBackground(Color.DARK_GRAY);
		lblNewLabel_4_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_2.setBounds(0, 36, 480, 13);
		panel_5_2.add(lblNewLabel_4_1_2);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.DARK_GRAY);
		panel_4.add(panel_8, "cell 0 3,grow");
		panel_8.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Continuar");
		btnNewButton_1.setBackground(new Color(102, 153, 255));
		btnNewButton_1.setBounds(184, 49, 125, 21);
		panel_8.add(btnNewButton_1);
	}

	public void crearPanelNuevoProyecto(JPanel principal)
	{
		JPanel panelCrearProyecto = new JPanel();
		panelCrearProyecto.setForeground(new Color(255, 255, 255));
		panelCrearProyecto.setBackground(Color.DARK_GRAY);
		principal.add(panelCrearProyecto, BorderLayout.CENTER);
		panelCrearProyecto.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(7, 7, 190, 622);
		panel.setForeground(new Color(255, 255, 255));
		panel.setBackground(Color.DARK_GRAY);
		panelCrearProyecto.add(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		panel.add(scrollPane);
		
		JList list = new JList();
		list.setFont(new Font("Tahoma", Font.PLAIN, 20));
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"dd", "dd", "dd", "dd", "dd", "dd", "dd", "dd", "dd", "dd", "dd", "dd", "dd", "dd", "dd", "dd", "dd", "dd", "dd", "dd", "dd", "dd", "dd", "dd", "dd", "dd", "dd", "dd", "dd", "dd", "dd", "dd", "dd", "dd", "dd", "dd", "dd", "dd", "dd", "dd", "dd", "dd", "dd", "dd", "dd"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane.setViewportView(list);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(211, 7, 821, 622);
		panel_4.setForeground(new Color(255, 255, 255));
		panel_4.setBackground(Color.DARK_GRAY);
		panelCrearProyecto.add(panel_4);
		panel_4.setLayout(null);
		
		JPanel panel_5_1 = new JPanel();
		panel_5_1.setBounds(16, 63, 789, 265);
		panel_5_1.setForeground(new Color(255, 255, 255));
		panel_5_1.setBackground(Color.DARK_GRAY);
		panel_5_1.setLayout(null);
		panel_4.add(panel_5_1);
		
		JTextField textField_2 = new JTextField();
		textField_2.setForeground(new Color(255, 255, 255));
		textField_2.setBackground(Color.DARK_GRAY);
		textField_2.setColumns(10);
		textField_2.setBounds(386, 33, 289, 25);
		panel_5_1.add(textField_2);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Nombre del Proyecto");
		lblNewLabel_4_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_4_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_4_1_1.setBackground(Color.DARK_GRAY);
		lblNewLabel_4_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_1.setBounds(6, 25, 331, 30);
		panel_5_1.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4_1_1_1 = new JLabel("Descripción");
		lblNewLabel_4_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_4_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_4_1_1_1.setBackground(Color.DARK_GRAY);
		lblNewLabel_4_1_1_1.setBounds(6, 115, 331, 30);
		panel_5_1.add(lblNewLabel_4_1_1_1);
		
		textField = new JTextField();
		textField.setForeground(Color.WHITE);
		textField.setColumns(10);
		textField.setBackground(Color.DARK_GRAY);
		textField.setBounds(386, 65, 289, 137);
		panel_5_1.add(textField);
		
		JLabel lblNewLabel_4_1_1_1_1 = new JLabel("Fecha estimada de finalización");
		lblNewLabel_4_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_4_1_1_1_1.setBackground(Color.DARK_GRAY);
		lblNewLabel_4_1_1_1_1.setBounds(6, 205, 331, 35);
		panel_5_1.add(lblNewLabel_4_1_1_1_1);
		
		textField_4 = new JTextField();
		textField_4.setForeground(Color.WHITE);
		textField_4.setColumns(10);
		textField_4.setBackground(Color.DARK_GRAY);
		textField_4.setBounds(386, 214, 289, 25);
		panel_5_1.add(textField_4);
		
		JButton btnNewButton_2 = new JButton("Listo");
		btnNewButton_2.setIcon(null);
		btnNewButton_2.setBounds(695, 210, 70, 30);
		panel_5_1.add(btnNewButton_2);
		
		JPanel panel_5_2 = new JPanel();
		panel_5_2.setBounds(0, 328, 821, 56);
		panel_5_2.setToolTipText("Reporte");
		panel_5_2.setForeground(new Color(255, 255, 255));
		panel_5_2.setBackground(new Color(102, 153, 204));
		panel_5_2.setLayout(null);
		panel_4.add(panel_5_2);
		
		JLabel lblNewLabel_7 = new JLabel("Reporte");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_7.setForeground(new Color(0, 0, 0));
		lblNewLabel_7.setBounds(331, 6, 104, 33);
		panel_5_2.add(lblNewLabel_7);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(16, 388, 789, 218);
		panel_8.setBackground(Color.DARK_GRAY);
		panel_4.add(panel_8);
		panel_8.setLayout(null);
		
		JButton btnNewButton_2_1 = new JButton("Listo");
		btnNewButton_2_1.setBounds(701, 171, 70, 30);
		panel_8.add(btnNewButton_2_1);
		
		JLabel lblNewLabel_4_1_1_2 = new JLabel("Nombre de usuario");
		lblNewLabel_4_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_4_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_4_1_1_2.setBackground(Color.DARK_GRAY);
		lblNewLabel_4_1_1_2.setBounds(24, 28, 331, 30);
		panel_8.add(lblNewLabel_4_1_1_2);
		
		textField_5 = new JTextField();
		textField_5.setForeground(Color.WHITE);
		textField_5.setColumns(10);
		textField_5.setBackground(Color.DARK_GRAY);
		textField_5.setBounds(390, 33, 289, 25);
		panel_8.add(textField_5);
		
		JLabel lblNewLabel_4_1_1_1_2 = new JLabel("Reporte");
		lblNewLabel_4_1_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_4_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_4_1_1_1_2.setBackground(Color.DARK_GRAY);
		lblNewLabel_4_1_1_1_2.setBounds(24, 117, 331, 30);
		panel_8.add(lblNewLabel_4_1_1_1_2);
		
		textField_6 = new JTextField();
		textField_6.setForeground(Color.WHITE);
		textField_6.setColumns(10);
		textField_6.setBackground(Color.DARK_GRAY);
		textField_6.setBounds(390, 65, 289, 137);
		panel_8.add(textField_6);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(102, 153, 255));
		panel_1.setBounds(0, 6, 821, 55);
		panel_4.add(panel_1);
		
		JLabel lblNewLabel_6 = new JLabel("Crear Proyecto");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel_1.add(lblNewLabel_6);
		panelCrearProyecto.setVisible(true);
	}

	public static String darFechaddMM() {
		LocalDateTime date = LocalDateTime.now();
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	    String strDate = date.format(myFormatObj);
		return strDate;
	}
}
