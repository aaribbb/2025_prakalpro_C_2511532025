package pekan8_2511532025;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OperatorAritmatikaGUI_2511532025 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtbil1;
	private JTextField txtbil2;
	private JTextField txtHasil;

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
					OperatorAritmatikaGUI_2511532025 frame = new OperatorAritmatikaGUI_2511532025();
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
	public OperatorAritmatikaGUI_2511532025() {
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(196, 11, 48, 14);
		getContentPane().add(lblNewLabel);
		setTitle("Opertor Aritmatika");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 301, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel1 = new JLabel("Operator Aritmatika");
		lblNewLabel1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel1.setBounds(10, 11, 267, 14);
		contentPane.add(lblNewLabel1);
		
		JLabel lblNewLabel_1 = new JLabel("Bilangan 1");
		lblNewLabel_1.setBounds(10, 36, 77, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Bilangan 2");
		lblNewLabel_2.setBounds(10, 61, 77, 20);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Operator");
		lblNewLabel_1_1.setBounds(10, 118, 152, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Hasil");
		lblNewLabel_1_2.setBounds(10, 174, 267, 14);
		contentPane.add(lblNewLabel_1_2);
		
		txtbil1 = new JTextField();
		txtbil1.setHorizontalAlignment(SwingConstants.CENTER);
		txtbil1.setBounds(86, 36, 54, 20);
		contentPane.add(txtbil1);
		txtbil1.setColumns(10);
		
		txtbil2 = new JTextField();
		txtbil2.setHorizontalAlignment(SwingConstants.CENTER);
		txtbil2.setColumns(10);
		txtbil2.setBounds(86, 61, 54, 20);
		contentPane.add(txtbil2);
		
		txtHasil = new JTextField();
		txtHasil.setHorizontalAlignment(SwingConstants.CENTER);
		txtHasil.setEditable(false);
		txtHasil.setColumns(10);
		txtHasil.setBounds(86, 171, 54, 20);
		contentPane.add(txtHasil);
		
		JComboBox cbOperator = new JComboBox();
		cbOperator.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "*", "/", "%"}));
		cbOperator.setBounds(86, 114, 54, 22);
		contentPane.add(cbOperator);
		
		JButton btnNewButton = new JButton("Hitung");
		btnNewButton.addActionListener(new ActionListener() {
			int Hasil;
			public void actionPerformed(ActionEvent e) {
				if(txtbil1.getText().trim().isEmpty()) {
					pesanPeringatan("Bilangan 1 harus diisi");
				} else if (txtbil2.getText().trim().isEmpty()) {
					pesanPeringatan("Bilangan 2 harus diisi");
				} else {
					try {
						
				int a = Integer.valueOf(txtbil1.getText());
				int b = Integer.valueOf(txtbil2.getText());
				int c = cbOperator.getSelectedIndex();
				if (c==0) {
					Hasil = a+b;
				}
				if (c==1) {
					Hasil = a-b;
				}
				if (c==2) {
					Hasil = a*b;
				}
				if (c==3) {
					Hasil = a/b;
				}
				if (c==4) {
					Hasil = a%b;
				} 
				txtHasil.setText(String.valueOf(Hasil));
			} catch (NumberFormatException ex) {
				pesanError("Bilangan 1 dan Bilangan 2 harus angka");
				}
			}
		}
		});
		btnNewButton.setBounds(170, 114, 88, 22);
		contentPane.add(btnNewButton);

	}
}

