package MapSetVeKume;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DropMode;

public class MapFormApp extends JFrame {

	private JPanel contentPane;
	private JTextField txtGirilenSayi;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MapFormApp frame = new MapFormApp();
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
	public MapFormApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 286);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtGirilenSayi = new JTextField();
		txtGirilenSayi.setDropMode(DropMode.INSERT);
		txtGirilenSayi.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtGirilenSayi.setBounds(118, 49, 181, 38);
		contentPane.add(txtGirilenSayi);
		txtGirilenSayi.setColumns(10);
		
		JButton btnCevir = new JButton("Cevir");
		btnCevir.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCevir.setBounds(151, 126, 102, 23);
		contentPane.add(btnCevir);
		
		JLabel lblSonucSayi = new JLabel("Sonuc: ");
		lblSonucSayi.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSonucSayi.setBounds(118, 198, 181, 23);
		contentPane.add(lblSonucSayi);
		
		// Buton event
		btnCevir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MapCalisma mc = new MapCalisma();
				lblSonucSayi.setText("Sonuc: "+mc.yaziyaCevir(txtGirilenSayi.getText()));
				txtGirilenSayi.setText("");
				
			}
		});
		
		
	}

}
