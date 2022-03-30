package Thread;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.TextArea;

public class ThreadFormApp extends JFrame {

	private JPanel contentPane;
	private JTextField txtBirinciSayi;
	private JTextField txtIkinciSayi;
	private JTextField txtYazdirmaMiktari;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThreadFormApp frame = new ThreadFormApp();
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
	public ThreadFormApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnBasla = new JButton("New button");
		btnBasla.setBounds(152, 137, 89, 23);
		contentPane.add(btnBasla);
		
		txtBirinciSayi = new JTextField();
		txtBirinciSayi.setBounds(155, 11, 86, 20);
		contentPane.add(txtBirinciSayi);
		txtBirinciSayi.setColumns(10);
		
		txtIkinciSayi = new JTextField();
		txtIkinciSayi.setBounds(155, 52, 86, 20);
		contentPane.add(txtIkinciSayi);
		txtIkinciSayi.setColumns(10);
		
		TextArea txtAreaBirinciSayi = new TextArea();
		txtAreaBirinciSayi.setBounds(10, 11, 132, 227);
		contentPane.add(txtAreaBirinciSayi);
		
		TextArea txtAreaIkinciSayi = new TextArea();
		txtAreaIkinciSayi.setBounds(281, 11, 132, 227);
		contentPane.add(txtAreaIkinciSayi);
		
		txtYazdirmaMiktari = new JTextField();
		txtYazdirmaMiktari.setBounds(155, 94, 86, 20);
		contentPane.add(txtYazdirmaMiktari);
		txtYazdirmaMiktari.setColumns(10);
		
		// Button event
		btnBasla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int ym = Integer.parseInt(txtYazdirmaMiktari.getText());
				
				Thread t1 = new Thread(new Runnable() {
					public void run() {
						for(int i=0; i<ym; i++)
							txtAreaBirinciSayi.setText(txtAreaBirinciSayi.getText()+txtBirinciSayi.getText());
					}
				});
				
				Thread t2 = new Thread(new Runnable() {
					public void run() {
						for(int i=0; i<ym; i++)
							txtAreaIkinciSayi.setText(txtAreaIkinciSayi.getText()+txtIkinciSayi.getText());
					}
				});
				
				t1.start();
				t2.start();
				
			}
		});
		
		
		
		
		
	}
}
