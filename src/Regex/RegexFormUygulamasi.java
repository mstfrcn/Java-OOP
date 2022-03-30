package Regex;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class RegexFormUygulamasi extends JFrame {

	private JPanel contentPane;
	private JTextField txtGirilenMetin;
	private JTextField txtAranilcakMetin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegexFormUygulamasi frame = new RegexFormUygulamasi();
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
	public RegexFormUygulamasi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 374);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnBul = new JButton("ARA");
		btnBul.setBounds(160, 206, 89, 23);
		contentPane.add(btnBul);
		
		txtGirilenMetin = new JTextField();
		txtGirilenMetin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtGirilenMetin.setBounds(10, 11, 414, 88);
		contentPane.add(txtGirilenMetin);
		txtGirilenMetin.setColumns(10);
		
		txtAranilcakMetin = new JTextField();
		txtAranilcakMetin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtAranilcakMetin.setBounds(10, 110, 414, 85);
		contentPane.add(txtAranilcakMetin);
		txtAranilcakMetin.setColumns(10);
		
		JLabel lblSonuc = new JLabel("");
		lblSonuc.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSonuc.setBounds(10, 240, 414, 84);
		contentPane.add(lblSonuc);
		
		
		btnBul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String girilenMetin = txtGirilenMetin.getText();
				String aranilcakMetin = txtAranilcakMetin.getText();
				
				Pattern p1 = Pattern.compile(aranilcakMetin);
				Matcher m1 = p1.matcher(girilenMetin);
				int sayac=0;
				while(m1.find())
					sayac++;
				lblSonuc.setText("Iz Bulundu: "+sayac);
				
			}
		});
		
		
		
		
		
		
	}
}
