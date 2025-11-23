package pekan8_2511532025;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

public class TugasAlproPekan8_2511532025 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField bil1;
	private JTextField bil2;
	private JTextField truefalse;

	private void pesanPeringatan(String pesan) {
		JOptionPane.showMessageDialog(this, pesan, "Peringatan", JOptionPane.WARNING_MESSAGE);
	}
	private void pesanError(String pesan) {
		JOptionPane.showMessageDialog(this, pesan, "Kesalahan", JOptionPane.ERROR_MESSAGE);
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TugasAlproPekan8_2511532025 frame = new TugasAlproPekan8_2511532025();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TugasAlproPekan8_2511532025() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Operator Relasional");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 10, 260, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Bilangan 1");
		lblNewLabel_1.setBounds(20, 38, 70, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Bilangan 2");
		lblNewLabel_2.setBounds(20, 62, 70, 20);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Operator");
		lblNewLabel_2_1.setBounds(20, 120, 70, 20);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("True/False");
		lblNewLabel_2_2.setBounds(20, 180, 70, 20);
		contentPane.add(lblNewLabel_2_2);
		
		bil1 = new JTextField();
		bil1.setBounds(90, 38, 70, 20);
		contentPane.add(bil1);
		bil1.setColumns(10);
		
		bil2 = new JTextField();
		bil2.setColumns(10);
		bil2.setBounds(90, 62, 70, 20);
		contentPane.add(bil2);
		
		truefalse = new JTextField();
		truefalse.setColumns(10);
		truefalse.setBounds(90, 180, 70, 20);
		contentPane.add(truefalse);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {">", "<", ">=", "<=", "==", "!="}));
		comboBox.setBounds(90, 120, 70, 20);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("Cek");
		btnNewButton.setBounds(180, 120, 70, 20);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bil1.getText().trim().isEmpty()) {
					pesanPeringatan("Bilangan 1 harus diisi");
					return;
				} else if(bil2.getText().trim().isEmpty()) {
					pesanPeringatan("Bilangan 2 harus diisi");
					return;
				} 
					try {
				int a = Integer.valueOf(bil1.getText());
				int b = Integer.valueOf(bil2.getText());
				String op = comboBox.getSelectedItem().toString();
				boolean hasil = false;
				
				switch (op) {
				case ">": hasil = a > b; break;
				case "<": hasil = a < b; break;
				case ">=": hasil = a >= b; break;
				case "<=": hasil = a <= b; break;
				case "==": hasil = a == b; break;
				case "!=": hasil = a != b; break;
				}
				truefalse.setText(String.valueOf(hasil));
					} catch (Exception err) {
						pesanError("Input harus berupa angka");
					}
				}
			});
		contentPane.add(btnNewButton);
	}
}
