package AbstractFormApp;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class form extends JFrame {

	protected static final Float FLoat = null;
	private JPanel contentPane;
	private JTextField txtUrunFiyati;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form frame = new form();
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
	public form() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 407, 458);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox cbUrunIsmi = new JComboBox();
		cbUrunIsmi.setModel(new DefaultComboBoxModel(new String[] {"Bilgisayar", "Tablet", "Telefon"}));
		cbUrunIsmi.setBounds(199, 47, 149, 27);
		contentPane.add(cbUrunIsmi);
		
		JLabel lblUrun = new JLabel("Urun Seciniz");
		lblUrun.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblUrun.setBounds(39, 45, 103, 27);
		contentPane.add(lblUrun);
		
		JLabel lblOtvOrani = new JLabel("OTV Orani Seciniz");
		lblOtvOrani.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblOtvOrani.setBounds(39, 101, 126, 27);
		contentPane.add(lblOtvOrani);
		
		JComboBox cbOtvOrani = new JComboBox();
		cbOtvOrani.setModel(new DefaultComboBoxModel( new String[] {"40","45","50"}));
		cbOtvOrani.setBounds(199, 100, 149, 27);
		contentPane.add(cbOtvOrani);
		
		JComboBox cbKdvOrani = new JComboBox();
		cbKdvOrani.setModel(new DefaultComboBoxModel(new String[] {"0","8","12","18","20"}));
		cbKdvOrani.setBounds(199, 152, 149, 27);
		contentPane.add(cbKdvOrani);
		
		JLabel lblKdvOrani = new JLabel("KDV Orani Seciniz");
		lblKdvOrani.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblKdvOrani.setBounds(39, 152, 126, 20);
		contentPane.add(lblKdvOrani);
		
		JLabel lblUrunFiyati = new JLabel("Urun Fiyati Giriniz");
		lblUrunFiyati.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblUrunFiyati.setBounds(39, 205, 126, 20);
		contentPane.add(lblUrunFiyati);
		
		txtUrunFiyati = new JTextField();
		txtUrunFiyati.setBounds(199, 207, 149, 27);
		contentPane.add(txtUrunFiyati);
		txtUrunFiyati.setColumns(10);
		
		JButton btnFaturaOlustur = new JButton("Fatura Olustur");
		btnFaturaOlustur.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnFaturaOlustur.setBounds(39, 249, 126, 52);
		contentPane.add(btnFaturaOlustur);
		
		JLabel lblSonuc = new JLabel("Fiyat: ");
		lblSonuc.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSonuc.setBounds(39, 327, 149, 37);
		contentPane.add(lblSonuc);
		
		btnFaturaOlustur.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String item = (String) cbUrunIsmi.getSelectedItem();
				item = item.toLowerCase();
				
				/*
				float fiyat = Float.parseFloat(txtUrunFiyati.getText());
				float otv = FLoat.parseFloat((String) cbOtvOrani.getSelectedItem());
				float kdv = Float.parseFloat((String) cbKdvOrani.getSelectedItem());
				*/
				
				if(item.equals("bilgisayar") ||item.equals("tablet") ||item.equals("telefon") ) {
					Kategoriler bs = new Kategoriler();
					String sonuc = Float.toString((bs.fatura(Float.parseFloat((txtUrunFiyati.getText())), Float.parseFloat((String) cbKdvOrani.getSelectedItem()) , Float.parseFloat((String) cbOtvOrani.getSelectedItem()))));
					lblSonuc.setText("Fiyat: "+sonuc);
				}
			}
		});
		
		
	}
}
