package cricket.score.counter;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;

public class CounterCricket {

	private JFrame frame;
	
	JLabel lblShowRuns;
	JLabel lblShowWkt;
	JLabel lblShowBall;
	JLabel lblShowOvers;
	JLabel lblShowWhite;
	JLabel lblShowExtra;
	JLabel lblShowNo;
	JRadioButton rbP1;
	JRadioButton rbP2;
	JLabel lbP1Run;
	JLabel lbP1ball;
	JLabel lbP1six;
	JLabel lbP14;
	JLabel lbP2Run;
	JLabel lbP2six;
	JLabel lbP24;
	JLabel lbP2ball;
	JLabel label_30;
	JLabel label_31,label_32,label_33,label_34,label_119;
	JLabel label_1,label_2,label_3,label_4,label_5,label_10;
	JRadioButton rdbtnNewRadioButton,rdbtnBaller,rdbtnBaller_1,rdbtnBaller_2,rdbtnBaller_3,rdbtnBaller_4;
	JLabel label_11;
	JLabel label_97,label_98,label_99,label_100,label_101,label_102,label_103,label_104,label_105,label_106,label_107,label_108;
	JLabel label_17;
	JLabel label_18,label_19,label_20,label_21,label_22,label_23,label_24,label_25,label_26,label_27,label_28;
	JLabel p1s,p1ba,p2s,p2ba;
	
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CounterCricket window = new CounterCricket();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public CounterCricket() {
		initialize();
	}

	
	private void initialize() {
		
		
		
		frame = new JFrame();
		frame.setSize(1380,740);;
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 69, 0));
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel.setBounds(20, 11, 376, 679);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Score Counter");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(10, 11, 356, 36);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Runs");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(27, 97, 46, 14);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("6");
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnNewRadioButton.isSelected())
				{
					int brun = Integer.parseInt(label_1.getText());
					int newbrun = brun + 6;
					String NewBRun = String.format("%s", newbrun);
					label_1.setText(NewBRun);
				}
				else if(rdbtnBaller.isSelected())
				{
					int brun = Integer.parseInt(label_2.getText());
					int newbrun = brun + 6;
					String NewBRun = String.format("%s", newbrun);
					label_2.setText(NewBRun);
				}
				else if(rdbtnBaller_1.isSelected())
				{
					int brun = Integer.parseInt(label_3.getText());
					int newbrun = brun + 6;
					String NewBRun = String.format("%s", newbrun);
					label_3.setText(NewBRun);
				}
				else if(rdbtnBaller_2.isSelected())
				{
					int brun = Integer.parseInt(label_4.getText());
					int newbrun = brun + 6;
					String NewBRun = String.format("%s", newbrun);
					label_4.setText(NewBRun);
				}
				else if(rdbtnBaller_3.isSelected())
				{
					int brun = Integer.parseInt(label_5.getText());
					int newbrun = brun + 6;
					String NewBRun = String.format("%s", newbrun);
					label_5.setText(NewBRun);
				}
				else if(rdbtnBaller_4.isSelected())
				{
					int brun = Integer.parseInt(label_10.getText());
					int newbrun = brun + 6;
					String NewBRun = String.format("%s", newbrun);
					label_10.setText(NewBRun);
				}
				
				int runs = Integer.parseInt(lblShowRuns.getText());
				int newrun = runs + 6;
				String Nrun = String.format("%s", newrun);
				lblShowRuns.setText(Nrun);
				
//				
				
				if(rbP1.isSelected())
				{
					int runp1 = Integer.parseInt(lbP1Run.getText());
					int newrunp1 = runp1 + 6;
					String NewRunP1 = String.format("%s", newrunp1);
					lbP1Run.setText(NewRunP1);
					
					int p1b6 = Integer.parseInt(lbP1six.getText());
					int newp1b6 = p1b6 + 1;
					String NewP1B6 = String.format("%s", newp1b6);
					lbP1six.setText(NewP1B6);
					
					
				}
				else if(rbP2.isSelected())
				{
					int runp2 =  Integer.parseInt(lbP2Run.getText());;
					int newrun2 = runp2 + 6;
					String NewRunP2 = String.format("%s", newrun2);
					lbP2Run.setText(NewRunP2);
					
					int p2b6 = Integer.parseInt(lbP2six.getText());
					int newp2b6 = p2b6 + 1;
					String NewP2B6 = String.format("%s", newp2b6);
					lbP2six.setText(NewP2B6);
				}
				
				if (rdbtnNewRadioButton.isSelected())
				{
					int b6 = Integer.parseInt(label_17.getText());
					int nb6 = b6+1;
					String Nb6 = String.format("%s", nb6);
					label_17.setText(Nb6);
				}
				else if (rdbtnBaller.isSelected())
				{
					int b6 = Integer.parseInt(label_18.getText());
					int nb6 = b6+1;
					String Nb6 = String.format("%s", nb6);
					label_18.setText(Nb6);
				}
				else if (rdbtnBaller_1.isSelected())
				{
					int b6 = Integer.parseInt(label_19.getText());
					int nb6 = b6+1;
					String Nb6 = String.format("%s", nb6);
					label_19.setText(Nb6);
				}
				else if (rdbtnBaller_2.isSelected())
				{
					int b6 = Integer.parseInt(label_20.getText());
					int nb6 = b6+1;
					String Nb6 = String.format("%s", nb6);
					label_20.setText(Nb6);
				}
				else if (rdbtnBaller_3.isSelected())
				{
					int b6 = Integer.parseInt(label_21.getText());
					int nb6 = b6+1;
					String Nb6 = String.format("%s", nb6);
					label_21.setText(Nb6);
				}
				else if (rdbtnBaller_4.isSelected())
				{
					int b6 = Integer.parseInt(label_22.getText());
					int nb6 = b6+1;
					String Nb6 = String.format("%s", nb6);
					label_22.setText(Nb6);
				}
				
				
				
				
				
				   
					
				    
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 28));
		btnNewButton.setBounds(27, 122, 75, 75);
		panel.add(btnNewButton);
		
		JButton button = new JButton("5");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnNewRadioButton.isSelected())
				{
					int brun = Integer.parseInt(label_1.getText());
					int newbrun = brun + 5;
					String NewBRun = String.format("%s", newbrun);
					label_1.setText(NewBRun);
				}
				else if(rdbtnBaller.isSelected())
				{
					int brun = Integer.parseInt(label_2.getText());
					int newbrun = brun + 5;
					String NewBRun = String.format("%s", newbrun);
					label_2.setText(NewBRun);
				}
				else if(rdbtnBaller_1.isSelected())
				{
					int brun = Integer.parseInt(label_3.getText());
					int newbrun = brun + 5;
					String NewBRun = String.format("%s", newbrun);
					label_3.setText(NewBRun);
				}
				else if(rdbtnBaller_2.isSelected())
				{
					int brun = Integer.parseInt(label_4.getText());
					int newbrun = brun + 5;
					String NewBRun = String.format("%s", newbrun);
					label_4.setText(NewBRun);
				}
				else if(rdbtnBaller_3.isSelected())
				{
					int brun = Integer.parseInt(label_4.getText());
					int newbrun = brun + 5;
					String NewBRun = String.format("%s", newbrun);
					label_4.setText(NewBRun);
				}
				else if(rdbtnBaller_4.isSelected())
				{
					int brun = Integer.parseInt(label_10.getText());
					int newbrun = brun + 5;
					String NewBRun = String.format("%s", newbrun);
					label_10.setText(NewBRun);
				}
				
				int runs = Integer.parseInt(lblShowRuns.getText());
				int newrun = runs + 5;
				String Nrun = String.format("%s", newrun);
				lblShowRuns.setText(Nrun);
				
				if(rbP1.isSelected())
				{
					int runp1 = Integer.parseInt(lbP1Run.getText());
					int newrunp1 = runp1 + 5;
					String NewRunP1 = String.format("%s", newrunp1);
					lbP1Run.setText(NewRunP1);
				}
				else if(rbP2.isSelected())
				{
					int runp2 =  Integer.parseInt(lbP2Run.getText());;
					int newrun2 = runp2 + 5;
					String NewRunP2 = String.format("%s", newrun2);
					lbP2Run.setText(NewRunP2);
				}
			}
		});
		
		button.setFont(new Font("Tahoma", Font.BOLD, 28));
		button.setBounds(131, 122, 75, 75);
		panel.add(button);
		
		JButton button_1 = new JButton("4");
		button_1.setForeground(Color.BLUE);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnNewRadioButton.isSelected())
				{
					int brun = Integer.parseInt(label_1.getText());
					int newbrun = brun + 4;
					String NewBRun = String.format("%s", newbrun);
					label_1.setText(NewBRun);
				}
				else if(rdbtnBaller.isSelected())
				{
					int brun = Integer.parseInt(label_2.getText());
					int newbrun = brun + 4;
					String NewBRun = String.format("%s", newbrun);
					label_2.setText(NewBRun);
				}
				else if(rdbtnBaller_1.isSelected())
				{
					int brun = Integer.parseInt(label_3.getText());
					int newbrun = brun + 4;
					String NewBRun = String.format("%s", newbrun);
					label_3.setText(NewBRun);
				}
				else if(rdbtnBaller_2.isSelected())
				{
					int brun = Integer.parseInt(label_4.getText());
					int newbrun = brun + 4;
					String NewBRun = String.format("%s", newbrun);
					label_4.setText(NewBRun);
				}
				else if(rdbtnBaller_3.isSelected())
				{
					int brun = Integer.parseInt(label_4.getText());
					int newbrun = brun + 4;
					String NewBRun = String.format("%s", newbrun);
					label_4.setText(NewBRun);
				}
				else if(rdbtnBaller_4.isSelected())
				{
					int brun = Integer.parseInt(label_10.getText());
					int newbrun = brun + 4;
					String NewBRun = String.format("%s", newbrun);
					label_10.setText(NewBRun);
				}
				
				int runs = Integer.parseInt(lblShowRuns.getText());
				int newrun = runs + 4;
				String Nrun = String.format("%s", newrun);
				lblShowRuns.setText(Nrun);
				
				if(rbP1.isSelected())
				{
					int runp1 = Integer.parseInt(lbP1Run.getText());
					int newrunp1 = runp1 + 4;
					String NewRunP1 = String.format("%s", newrunp1);
					lbP1Run.setText(NewRunP1);
					
					int p1b4 = Integer.parseInt(lbP14.getText());
					int newp1b4 = p1b4 + 1;
					String NewP1B4 = String.format("%s", newp1b4);
					lbP14.setText(NewP1B4);
				}
				else if(rbP2.isSelected())
				{
					int runp2 =  Integer.parseInt(lbP2Run.getText());;
					int newrun2 = runp2 + 4;
					String NewRunP2 = String.format("%s", newrun2);
					lbP2Run.setText(NewRunP2);
					
					int p2b4 = Integer.parseInt(lbP24.getText());
					int newp2b4 = p2b4 + 1;
					String NewP2B4 = String.format("%s", newp2b4);
					lbP24.setText(NewP2B4);
				}
				
				if (rdbtnNewRadioButton.isSelected())
				{
					int b6 = Integer.parseInt(label_23.getText());
					int nb6 = b6+1;
					String Nb6 = String.format("%s", nb6);
					label_23.setText(Nb6);
				}
				else if (rdbtnBaller.isSelected())
				{
					int b6 = Integer.parseInt(label_24.getText());
					int nb6 = b6+1;
					String Nb6 = String.format("%s", nb6);
					label_24.setText(Nb6);
				}
				else if (rdbtnBaller_1.isSelected())
				{
					int b6 = Integer.parseInt(label_25.getText());
					int nb6 = b6+1;
					String Nb6 = String.format("%s", nb6);
					label_25.setText(Nb6);
				}
				else if (rdbtnBaller_2.isSelected())
				{
					int b6 = Integer.parseInt(label_26.getText());
					int nb6 = b6+1;
					String Nb6 = String.format("%s", nb6);
					label_26.setText(Nb6);
				}
				else if (rdbtnBaller_3.isSelected())
				{
					int b6 = Integer.parseInt(label_27.getText());
					int nb6 = b6+1;
					String Nb6 = String.format("%s", nb6);
					label_27.setText(Nb6);
				}
				else if (rdbtnBaller_4.isSelected())
				{
					int b6 = Integer.parseInt(label_28.getText());
					int nb6 = b6+1;
					String Nb6 = String.format("%s", nb6);
					label_28.setText(Nb6);
				}
				
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 28));
		button_1.setBounds(232, 122, 75, 75);
		panel.add(button_1);
		
		JButton button_2 = new JButton("3");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnNewRadioButton.isSelected())
				{
					int brun = Integer.parseInt(label_1.getText());
					int newbrun = brun + 3;
					String NewBRun = String.format("%s", newbrun);
					label_1.setText(NewBRun);
				}
				else if(rdbtnBaller.isSelected())
				{
					int brun = Integer.parseInt(label_2.getText());
					int newbrun = brun + 3;
					String NewBRun = String.format("%s", newbrun);
					label_2.setText(NewBRun);
				}
				else if(rdbtnBaller_1.isSelected())
				{
					int brun = Integer.parseInt(label_3.getText());
					int newbrun = brun + 3;
					String NewBRun = String.format("%s", newbrun);
					label_3.setText(NewBRun);
				}
				else if(rdbtnBaller_2.isSelected())
				{
					int brun = Integer.parseInt(label_4.getText());
					int newbrun = brun + 3;
					String NewBRun = String.format("%s", newbrun);
					label_4.setText(NewBRun);
				}
				else if(rdbtnBaller_3.isSelected())
				{
					int brun = Integer.parseInt(label_4.getText());
					int newbrun = brun + 3;
					String NewBRun = String.format("%s", newbrun);
					label_4.setText(NewBRun);
				}
				else if(rdbtnBaller_4.isSelected())
				{
					int brun = Integer.parseInt(label_10.getText());
					int newbrun = brun + 3;
					String NewBRun = String.format("%s", newbrun);
					label_10.setText(NewBRun);
				}
				
				int runs = Integer.parseInt(lblShowRuns.getText());
				int newrun = runs + 3;
				String Nrun = String.format("%s", newrun);
				lblShowRuns.setText(Nrun);
				
				if(rbP1.isSelected())
				{
					int runp1 = Integer.parseInt(lbP1Run.getText());
					int newrunp1 = runp1 + 3;
					String NewRunP1 = String.format("%s", newrunp1);
					lbP1Run.setText(NewRunP1);
				}
				else if(rbP2.isSelected())
				{
					int runp2 =  Integer.parseInt(lbP2Run.getText());;
					int newrun2 = runp2 + 3;
					String NewRunP2 = String.format("%s", newrun2);
					lbP2Run.setText(NewRunP2);
				}
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 28));
		button_2.setBounds(27, 208, 75, 75);
		panel.add(button_2);
		
		JButton button_3 = new JButton("2");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnNewRadioButton.isSelected())
				{
					int brun = Integer.parseInt(label_1.getText());
					int newbrun = brun + 2;
					String NewBRun = String.format("%s", newbrun);
					label_1.setText(NewBRun);
				}
				else if(rdbtnBaller.isSelected())
				{
					int brun = Integer.parseInt(label_2.getText());
					int newbrun = brun + 2;
					String NewBRun = String.format("%s", newbrun);
					label_2.setText(NewBRun);
				}
				else if(rdbtnBaller_1.isSelected())
				{
					int brun = Integer.parseInt(label_3.getText());
					int newbrun = brun + 2;
					String NewBRun = String.format("%s", newbrun);
					label_3.setText(NewBRun);
				}
				else if(rdbtnBaller_2.isSelected())
				{
					int brun = Integer.parseInt(label_4.getText());
					int newbrun = brun + 2;
					String NewBRun = String.format("%s", newbrun);
					label_4.setText(NewBRun);
				}
				else if(rdbtnBaller_3.isSelected())
				{
					int brun = Integer.parseInt(label_4.getText());
					int newbrun = brun + 2;
					String NewBRun = String.format("%s", newbrun);
					label_4.setText(NewBRun);
				}
				else if(rdbtnBaller_4.isSelected())
				{
					int brun = Integer.parseInt(label_10.getText());
					int newbrun = brun + 2;
					String NewBRun = String.format("%s", newbrun);
					label_10.setText(NewBRun);
				}
				
				int runs = Integer.parseInt(lblShowRuns.getText());
				int newrun = runs + 2;
				String Nrun = String.format("%s", newrun);
				lblShowRuns.setText(Nrun);
				
				if(rbP1.isSelected())
				{
					int runp1 = Integer.parseInt(lbP1Run.getText());
					int newrunp1 = runp1 + 2;
					String NewRunP1 = String.format("%s", newrunp1);
					lbP1Run.setText(NewRunP1);
				}
				else if(rbP2.isSelected())
				{
					int runp2 =  Integer.parseInt(lbP2Run.getText());;
					int newrun2 = runp2 + 2;
					String NewRunP2 = String.format("%s", newrun2);
					lbP2Run.setText(NewRunP2);
				}
			}
		});
		button_3.setFont(new Font("Tahoma", Font.BOLD, 28));
		button_3.setBounds(131, 208, 75, 75);
		panel.add(button_3);
		
		JButton button_4 = new JButton("1");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if(rdbtnNewRadioButton.isSelected())
				{
					int brun = Integer.parseInt(label_1.getText());
					int newbrun = brun + 1;
					String NewBRun = String.format("%s", newbrun);
					label_1.setText(NewBRun);
				}
				else if(rdbtnBaller.isSelected())
				{
					int brun = Integer.parseInt(label_2.getText());
					int newbrun = brun + 1;
					String NewBRun = String.format("%s", newbrun);
					label_2.setText(NewBRun);
				}
				else if(rdbtnBaller_1.isSelected())
				{
					int brun = Integer.parseInt(label_3.getText());
					int newbrun = brun + 1;
					String NewBRun = String.format("%s", newbrun);
					label_3.setText(NewBRun);
				}
				else if(rdbtnBaller_2.isSelected())
				{
					int brun = Integer.parseInt(label_4.getText());
					int newbrun = brun + 1;
					String NewBRun = String.format("%s", newbrun);
					label_4.setText(NewBRun);
				}
				else if(rdbtnBaller_3.isSelected())
				{
					int brun = Integer.parseInt(label_4.getText());
					int newbrun = brun + 1;
					String NewBRun = String.format("%s", newbrun);
					label_4.setText(NewBRun);
				}
				else if(rdbtnBaller_4.isSelected())
				{
					int brun = Integer.parseInt(label_10.getText());
					int newbrun = brun + 1;
					String NewBRun = String.format("%s", newbrun);
					label_10.setText(NewBRun);
				}
				
				int runs = Integer.parseInt(lblShowRuns.getText());
				int newrun = runs + 1;
				String Nrun = String.format("%s", newrun);
				lblShowRuns.setText(Nrun);
				
				if(rbP1.isSelected())
				{
					int runp1 = Integer.parseInt(lbP1Run.getText());
					int newrunp1 = runp1 + 1;
					String NewRunP1 = String.format("%s", newrunp1);
					lbP1Run.setText(NewRunP1);
					
					double p1a = Double.parseDouble(p1ba.getText());
					double p1b = Double.parseDouble(lbP1ball.getText());
					double np1a = (p1a/p1b);
					String Np1a = String.format("%.2f", np1a);
					p1ba.setText(Np1a);
//					int p1a = Integer.parseInt(p1ba.getText());
//					int p1b = Integer.parseInt(lbP1ball.getText());
//					int np1a = (p1a/p1b);
//					String Np1a = String.format("%s", np1a);
//					p1ba.setText(Np1a);
					
					double p1sr = Double.parseDouble(p1s.getText());
					double p1bs = Double.parseDouble(lbP1ball.getText());
					double np1s = (p1bs/p1sr)*100;
					String Np1s = String.format("%.2f", np1s);
					p1s.setText(Np1s);
				}
				else if(rbP2.isSelected())
				{
					int runp2 =  Integer.parseInt(lbP2Run.getText());;
					int newrun2 = runp2 + 1;
					String NewRunP2 = String.format("%s", newrun2);
					lbP2Run.setText(NewRunP2);
				}
				
				
			}
		});
		button_4.setFont(new Font("Tahoma", Font.BOLD, 28));
		button_4.setBounds(232, 208, 75, 75);
		panel.add(button_4);
		
		JButton btnW = new JButton("W");
		btnW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				if(rdbtnNewRadioButton.isSelected())
				{
					int bw1 = Integer.parseInt(label_30.getText());
					int nbw1 = bw1 + 1;
					String NBW1 = String.format("%s", nbw1);
					label_30.setText(NBW1);
				}
				else if(rdbtnBaller.isSelected())
				{
					int bw2 = Integer.parseInt(label_31.getText());
					int nbw2 = bw2 + 1;
					String NBW2 = String.format("%s", nbw2);
					label_31.setText(NBW2);
					
				}
				else if(rdbtnBaller_1.isSelected())
				{
					int bw3 = Integer.parseInt(label_32.getText());
					int nbw3 = bw3 + 1;
					String NBW3 = String.format("%s", nbw3);
					label_32.setText(NBW3);
					
				}
				else if(rdbtnBaller_2.isSelected())
				{
					int bw4 = Integer.parseInt(label_33.getText());
					int nbw4 = bw4 + 1;
					String NBW4 = String.format("%s", nbw4);
					label_33.setText(NBW4);
					
				}
				else if(rdbtnBaller_3.isSelected())
				{
					int bw5 = Integer.parseInt(label_34.getText());
					int nbw5 = bw5 + 1;
					String NBW5 = String.format("%s", nbw5);
					label_34.setText(NBW5);
					
				}
				else if(rdbtnBaller_4.isSelected())
				{
					int bw6 = Integer.parseInt(label_119.getText());
					int nbw6 = bw6 + 1;
					String NBW6 = String.format("%s", nbw6);
					label_119.setText(NBW6);
					
				}
				
				 int wkt = Integer.parseInt(lblShowWkt.getText());
				 int newWkt = wkt+1;
				 String Nwkt = String.format("%s", newWkt);
				 lblShowWkt.setText(Nwkt);
				 
				 if(wkt >=9)
				 {
					 lblShowWkt.setText("10");
					 
				 }
				 
				 if(rbP1.isSelected())
				 {
					 lbP1Run.setText("0");
					 lbP1ball.setText("0");
					 lbP1six.setText("0");
					 lbP14.setText("0");
					 
					 
				 }
				 else if(rbP2.isSelected())
				 {
					 lbP2Run.setText("0");
					 lbP2ball.setText("0");
					 lbP2six.setText("0");
					 lbP24.setText("0");
				 }
				 
				
			}
		});
		btnW.setForeground(Color.RED);
		btnW.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnW.setBounds(27, 344, 75, 75);
		panel.add(btnW);
		
		JButton button_5 = new JButton("");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int runs = Integer.parseInt(lblShowRuns.getText());
				int newrun = runs + 1;
				String Nrun = String.format("%s", newrun);
				lblShowRuns.setText(Nrun);
				
				int white = Integer.parseInt(lblShowWhite.getText());
				int newWhite = white+1;
				String NewWhite = String.format("%s", newWhite);
				lblShowWhite.setText(NewWhite);
				
				 int extra1 = Integer.parseInt(lblShowExtra.getText());
				 int newExtra1 = extra1 +1;
				 String NewExtra1 = String.format("%s", newExtra1);
				 lblShowExtra.setText(NewExtra1);
				
			}
		});
		button_5.setBackground(Color.WHITE);
		button_5.setForeground(Color.RED);
		button_5.setFont(new Font("Tahoma", Font.BOLD, 30));
		button_5.setBounds(131, 482, 75, 75);
		panel.add(button_5);
		
		JButton button_6 = new JButton("");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rbP1.isSelected())
				{
					int p1b = Integer.parseInt(lbP1ball.getText());
					int newp1b = p1b +1;
					String NewP1B = String.format("%s", newp1b);
					lbP1ball.setText(NewP1B);
				}
				else if(rbP2.isSelected())
				{
					int p2b = Integer.parseInt(lbP2ball.getText());
					int newp2b = p2b + 1;
					String NewP2b = String.format("%s", newp2b);
					lbP2ball.setText(NewP2b);
				}
					
				
				int ball = Integer.parseInt(lblShowBall.getText());
				int nball = ball+1;
				String Newball = String.format("%s", nball);
				lblShowBall.setText(Newball);
				
				int sball = Integer.parseInt(lblShowBall.getText());
				
				if(sball==6)
				{
					int over = Integer.parseInt(lblShowOvers.getText());
					int newover = over +1;
					String Newover = String.format("%s", newover);
					lblShowOvers.setText(Newover);
					lblShowBall.setText("0");
					
				}
				
				
//				if(rdbtnNewRadioButton.isSelected())
//				{
//					int b=0;
//					while (b<=6);
//					{
//						if(b==6)
//						{
//							int ov = Integer.parseInt(label_11.getText());
//							int nov = ov + 1;
//							String NewOv = String.format("%s", nov);
//							label_11.setText(NewOv);//							
//						}
//						b++;
//						
//					}
//				}
				
				
				
					
			}
		});
		button_6.setBackground(Color.BLUE);
		button_6.setForeground(Color.RED);
		button_6.setFont(new Font("Tahoma", Font.BOLD, 30));
		button_6.setBounds(27, 482, 75, 75);
		panel.add(button_6);
		
		JButton button_7 = new JButton("");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int runs = Integer.parseInt(lblShowRuns.getText());
				int newrun = runs + 1;
				String Nrun = String.format("%s", newrun);
				lblShowRuns.setText(Nrun);
				
				int noball = Integer.parseInt(lblShowNo.getText());
				int newnoball = noball +1;
				String NewBall = String.format("%s", newnoball);
				lblShowNo.setText(NewBall);
				
				int extra1 = Integer.parseInt(lblShowExtra.getText());
				 int newExtra1 = extra1 +1;
				 String NewExtra1 = String.format("%s", newExtra1);
				 lblShowExtra.setText(NewExtra1);
			}
		});
		button_7.setBackground(Color.RED);
		button_7.setForeground(Color.RED);
		button_7.setFont(new Font("Tahoma", Font.BOLD, 30));
		button_7.setBounds(232, 482, 75, 75);
		panel.add(button_7);
		
		JLabel lblNewLabel_5 = new JLabel("Correct Ball");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5.setBounds(27, 457, 75, 19);
		panel.add(lblNewLabel_5);
		
		JLabel lblNoBall = new JLabel("White Ball");
		lblNoBall.setHorizontalAlignment(SwingConstants.CENTER);
		lblNoBall.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNoBall.setBounds(131, 457, 75, 19);
		panel.add(lblNoBall);
		
		JLabel lblNoBall_1 = new JLabel("No Ball");
		lblNoBall_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNoBall_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNoBall_1.setBounds(232, 457, 75, 19);
		panel.add(lblNoBall_1);
		
		JLabel lblWicket = new JLabel("Wicket");
		lblWicket.setHorizontalAlignment(SwingConstants.CENTER);
		lblWicket.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblWicket.setBounds(27, 314, 75, 19);
		panel.add(lblWicket);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.setBounds(10, 645, 89, 23);
		panel.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				lblShowWkt.setText("0");
				lblShowRuns.setText("0");
				lblShowOvers.setText("0");
				lblShowBall.setText("0");
				lblShowExtra.setText("0");
				lblShowWhite.setText("0");
				lblShowNo.setText("0");
				lbP1Run.setText("0");
				lbP2Run.setText("0");
				lbP1ball.setText("0");
				lbP1six.setText("0");
				lbP14.setText("0");
				lbP2ball.setText("0");
				lbP2six.setText("0");
				lbP24.setText("0");
				label_31.setText("0");
				label_32.setText("0");
				label_33.setText("0");
				label_34.setText("0");
				label_119.setText("0");
				label_1.setText("0");
				label_2.setText("0");
				label_3.setText("0");
				label_4.setText("0");
				label_5.setText("0");
				label_10.setText("0");
				
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setForeground(Color.RED);
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnExit.setBounds(277, 646, 89, 23);
		panel.add(btnExit);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 0));
		panel_1.setBorder(new LineBorder(Color.RED, 2, true));
		panel_1.setBounds(405, 11, 618, 228);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Score Board");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(186, 11, 227, 14);
		panel_1.add(lblNewLabel_2);
		
		lblShowWkt = new JLabel("0");
		
		lblShowWkt.setForeground(Color.RED);
		lblShowWkt.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblShowWkt.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowWkt.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblShowWkt.setBounds(47, 103, 96, 85);
		panel_1.add(lblShowWkt);
		
		lblShowRuns = new JLabel("0");
		lblShowRuns.setForeground(Color.BLUE);
		lblShowRuns.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblShowRuns.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowRuns.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblShowRuns.setBounds(186, 103, 96, 85);
		panel_1.add(lblShowRuns);
		
		JLabel lblNewLabel_3 = new JLabel("Wickets");
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(61, 78, 69, 14);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Runs");
		lblNewLabel_4.setForeground(Color.BLACK);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(186, 78, 46, 14);
		panel_1.add(lblNewLabel_4);
		
		lblShowOvers = new JLabel("0");
		lblShowOvers.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowOvers.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblShowOvers.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblShowOvers.setBounds(360, 103, 96, 85);
		panel_1.add(lblShowOvers);
		
		JLabel lblOvers = new JLabel("Overs");
		lblOvers.setForeground(Color.BLACK);
		lblOvers.setHorizontalAlignment(SwingConstants.CENTER);
		lblOvers.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblOvers.setBounds(360, 78, 46, 14);
		panel_1.add(lblOvers);
		
		lblShowBall = new JLabel("0");
		lblShowBall.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowBall.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblShowBall.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblShowBall.setBounds(501, 103, 96, 85);
		panel_1.add(lblShowBall);
		
		JLabel lblBalls = new JLabel("Balls");
		lblBalls.setForeground(Color.BLACK);
		lblBalls.setHorizontalAlignment(SwingConstants.CENTER);
		lblBalls.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblBalls.setBounds(512, 80, 46, 14);
		panel_1.add(lblBalls);
		
		JLabel lblNewLabel_6 = new JLabel(".");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 38));
		lblNewLabel_6.setBounds(456, 124, 46, 42);
		panel_1.add(lblNewLabel_6);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(Color.ORANGE, 2));
		panel_2.setBounds(833, 250, 190, 228);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(95, 7, 0, 2);
		panel_2.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 48, 170, 2);
		panel_2.add(separator_1);
		
		JLabel lblNewLabel_7 = new JLabel("Extra");
		lblNewLabel_7.setBounds(10, 7, 46, 30);
		panel_2.add(lblNewLabel_7);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		lblShowExtra = new JLabel("0");
		lblShowExtra.setBounds(133, 7, 34, 35);
		panel_2.add(lblShowExtra);
		lblShowExtra.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowExtra.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JLabel lblWhite = new JLabel("White");
		lblWhite.setBounds(10, 58, 46, 14);
		panel_2.add(lblWhite);
		lblWhite.setFont(new Font("Dialog", Font.BOLD, 12));
		
		JLabel lblNoBall_2 = new JLabel("No Ball");
		lblNoBall_2.setBounds(10, 94, 46, 14);
		panel_2.add(lblNoBall_2);
		lblNoBall_2.setFont(new Font("Dialog", Font.BOLD, 12));
		
		lblShowWhite = new JLabel("0");
		lblShowWhite.setBounds(133, 53, 34, 23);
		panel_2.add(lblShowWhite);
		lblShowWhite.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblShowWhite.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblShowNo = new JLabel("0");
		lblShowNo.setBounds(135, 89, 34, 23);
		panel_2.add(lblShowNo);
		lblShowNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowNo.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(Color.GREEN, 2));
		panel_3.setBounds(406, 250, 209, 228);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblRuns = new JLabel("Runs");
		lblRuns.setFont(new Font("Dialog", Font.BOLD, 12));
		lblRuns.setBounds(6, 48, 46, 14);
		panel_3.add(lblRuns);
		
		JLabel lblBalls_1 = new JLabel("Balls");
		lblBalls_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblBalls_1.setBounds(6, 73, 46, 14);
		panel_3.add(lblBalls_1);
		
		JLabel lbls = new JLabel("6's");
		lbls.setFont(new Font("Dialog", Font.BOLD, 12));
		lbls.setBounds(6, 96, 46, 28);
		panel_3.add(lbls);
		
		JLabel lbls_1 = new JLabel("4's");
		lbls_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lbls_1.setBounds(6, 122, 46, 24);
		panel_3.add(lbls_1);
		
		lbP1Run = new JLabel("0");
		lbP1Run.setHorizontalAlignment(SwingConstants.CENTER);
		lbP1Run.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbP1Run.setBounds(165, 46, 34, 23);
		panel_3.add(lbP1Run);
		
		lbP1ball = new JLabel("0");
		lbP1ball.setHorizontalAlignment(SwingConstants.CENTER);
		lbP1ball.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbP1ball.setBounds(165, 68, 34, 23);
		panel_3.add(lbP1ball);
		
		lbP1six = new JLabel("0");
		lbP1six.setHorizontalAlignment(SwingConstants.CENTER);
		lbP1six.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbP1six.setBounds(165, 98, 34, 23);
		panel_3.add(lbP1six);
		
		lbP14 = new JLabel("0");
		lbP14.setHorizontalAlignment(SwingConstants.CENTER);
		lbP14.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbP14.setBounds(165, 122, 34, 23);
		panel_3.add(lbP14);
		
		rbP1 = new JRadioButton("Batsman1");
		rbP1.setFont(new Font("Tahoma", Font.BOLD, 18));
		rbP1.setBounds(6, 18, 147, 23);
		panel_3.add(rbP1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new LineBorder(Color.GREEN, 2));
		panel_4.setBounds(614, 250, 209, 228);
		frame.getContentPane().add(panel_4);
		
		JLabel label_6 = new JLabel("Runs");
		label_6.setFont(new Font("Dialog", Font.BOLD, 12));
		label_6.setBounds(6, 48, 46, 14);
		panel_4.add(label_6);
		
		JLabel label_7 = new JLabel("Balls");
		label_7.setFont(new Font("Dialog", Font.BOLD, 12));
		label_7.setBounds(6, 73, 46, 14);
		panel_4.add(label_7);
		
		JLabel label_8 = new JLabel("6's");
		label_8.setFont(new Font("Dialog", Font.BOLD, 12));
		label_8.setBounds(6, 96, 46, 28);
		panel_4.add(label_8);
		
		JLabel label_9 = new JLabel("4's");
		label_9.setFont(new Font("Dialog", Font.BOLD, 12));
		label_9.setBounds(6, 122, 46, 24);
		panel_4.add(label_9);
		
		lbP24 = new JLabel("0");
		lbP24.setHorizontalAlignment(SwingConstants.CENTER);
		lbP24.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbP24.setBounds(165, 122, 34, 23);
		panel_4.add(lbP24);
		
		lbP2six = new JLabel("0");
		lbP2six.setHorizontalAlignment(SwingConstants.CENTER);
		lbP2six.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbP2six.setBounds(165, 98, 34, 23);
		panel_4.add(lbP2six);
		
		lbP2ball = new JLabel("0");
		lbP2ball.setHorizontalAlignment(SwingConstants.CENTER);
		lbP2ball.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbP2ball.setBounds(165, 68, 34, 23);
		panel_4.add(lbP2ball);
		
		lbP2Run = new JLabel("0");
		lbP2Run.setHorizontalAlignment(SwingConstants.CENTER);
		lbP2Run.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbP2Run.setBounds(165, 46, 34, 23);
		panel_4.add(lbP2Run);
		
		rbP2 = new JRadioButton("Batsman2");
		rbP2.setFont(new Font("Tahoma", Font.BOLD, 18));
		rbP2.setBounds(6, 18, 133, 23);
		panel_4.add(rbP2);
		
		ButtonGroup player = new ButtonGroup();
		{
			player.add(rbP1);
			
			JLabel lblStrikeRate = new JLabel("Strike rate");
			lblStrikeRate.setFont(new Font("Dialog", Font.BOLD, 12));
			lblStrikeRate.setBounds(6, 150, 77, 14);
			panel_3.add(lblStrikeRate);
			
			p1s = new JLabel("0");
			p1s.setHorizontalAlignment(SwingConstants.CENTER);
			p1s.setFont(new Font("Tahoma", Font.BOLD, 14));
			p1s.setBounds(165, 145, 34, 23);
			panel_3.add(p1s);
			
			JLabel lblBattingAverage = new JLabel("Batting Average");
			lblBattingAverage.setFont(new Font("Dialog", Font.BOLD, 12));
			lblBattingAverage.setBounds(6, 172, 98, 14);
			panel_3.add(lblBattingAverage);
			
			p1ba = new JLabel("0");
			p1ba.setHorizontalAlignment(SwingConstants.CENTER);
			p1ba.setFont(new Font("Tahoma", Font.BOLD, 14));
			p1ba.setBounds(165, 167, 34, 23);
			panel_3.add(p1ba);
			player.add(rbP2);
		}
		
		JLabel lblStrikeRate_1 = new JLabel("Strike rate");
		lblStrikeRate_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblStrikeRate_1.setBounds(6, 150, 72, 14);
		panel_4.add(lblStrikeRate_1);
		
		p2s = new JLabel("0");
		p2s.setHorizontalAlignment(SwingConstants.CENTER);
		p2s.setFont(new Font("Tahoma", Font.BOLD, 14));
		p2s.setBounds(165, 145, 34, 23);
		panel_4.add(p2s);
		
		JLabel lblBattingAverage_1 = new JLabel("Batting Average");
		lblBattingAverage_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblBattingAverage_1.setBounds(6, 172, 115, 14);
		panel_4.add(lblBattingAverage_1);
		
		p2ba = new JLabel("0");
		p2ba.setHorizontalAlignment(SwingConstants.CENTER);
		p2ba.setFont(new Font("Tahoma", Font.BOLD, 14));
		p2ba.setBounds(165, 167, 34, 23);
		panel_4.add(p2ba);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(new LineBorder(Color.GREEN, 2));
		panel_5.setBounds(406, 489, 617, 201);
		frame.getContentPane().add(panel_5);
		
		JLabel lblNewLabel_8 = new JLabel("Ballers");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_8.setBounds(6, 0, 77, 25);
		panel_5.add(lblNewLabel_8);
		
		rdbtnNewRadioButton = new JRadioButton("Baller 1");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnNewRadioButton.setBounds(6, 32, 109, 23);
		panel_5.add(rdbtnNewRadioButton);
		
		rdbtnBaller = new JRadioButton("Baller 2");
		rdbtnBaller.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnBaller.setBounds(6, 58, 109, 23);
		panel_5.add(rdbtnBaller);
		
		rdbtnBaller_1 = new JRadioButton("Baller 3");
		rdbtnBaller_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnBaller_1.setBounds(6, 84, 109, 23);
		panel_5.add(rdbtnBaller_1);
		
		rdbtnBaller_2 = new JRadioButton("Baller 4");
		rdbtnBaller_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnBaller_2.setBounds(6, 110, 109, 23);
		panel_5.add(rdbtnBaller_2);
		
		rdbtnBaller_3 = new JRadioButton("Baller 5");
		rdbtnBaller_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnBaller_3.setBounds(6, 136, 109, 23);
		panel_5.add(rdbtnBaller_3);
		
		rdbtnBaller_4 = new JRadioButton("Baller 6");
		rdbtnBaller_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnBaller_4.setBounds(6, 162, 109, 23);
		panel_5.add(rdbtnBaller_4);
		
		
		
		ButtonGroup baller = new ButtonGroup();
		{
			baller.add(rdbtnNewRadioButton);
			baller.add(rdbtnBaller);
			baller.add(rdbtnBaller_1);
			baller.add(rdbtnBaller_2);
			baller.add(rdbtnBaller_3);
			baller.add(rdbtnBaller_4);
		}
		
		JLabel lblBruns = new JLabel("Runs");
		lblBruns.setFont(new Font("Dialog", Font.BOLD, 12));
		lblBruns.setBounds(106, 7, 46, 14);
		panel_5.add(lblBruns);
		
		JLabel lblOvers_1 = new JLabel("Overs");
		lblOvers_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblOvers_1.setBounds(162, 7, 46, 14);
		panel_5.add(lblOvers_1);
		
		JLabel lbls_2 = new JLabel("6's");
		lbls_2.setFont(new Font("Dialog", Font.BOLD, 12));
		lbls_2.setBounds(218, 7, 46, 14);
		panel_5.add(lbls_2);
		
		JLabel lbls_3 = new JLabel("4's");
		lbls_3.setFont(new Font("Dialog", Font.BOLD, 12));
		lbls_3.setBounds(274, 7, 46, 14);
		panel_5.add(lbls_3);
		
		label_1 = new JLabel("0");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Dialog", Font.BOLD, 12));
		label_1.setBounds(106, 37, 46, 14);
		panel_5.add(label_1);
		
		label_2 = new JLabel("0");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Dialog", Font.BOLD, 12));
		label_2.setBounds(106, 62, 46, 14);
		panel_5.add(label_2);
		
		label_3 = new JLabel("0");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Dialog", Font.BOLD, 12));
		label_3.setBounds(106, 88, 46, 14);
		panel_5.add(label_3);
		
		label_4 = new JLabel("0");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Dialog", Font.BOLD, 12));
		label_4.setBounds(106, 114, 46, 14);
		panel_5.add(label_4);
		
		label_5 = new JLabel("0");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Dialog", Font.BOLD, 12));
		label_5.setBounds(106, 140, 46, 14);
		panel_5.add(label_5);
		
		label_10 = new JLabel("0");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setFont(new Font("Dialog", Font.BOLD, 12));
		label_10.setBounds(106, 166, 46, 14);
		panel_5.add(label_10);
		
		label_11 = new JLabel("0");
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setFont(new Font("Dialog", Font.BOLD, 12));
		label_11.setBounds(162, 37, 46, 14);
		panel_5.add(label_11);
		
		JLabel label_12 = new JLabel("0");
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setFont(new Font("Dialog", Font.BOLD, 12));
		label_12.setBounds(162, 63, 46, 14);
		panel_5.add(label_12);
		
		JLabel label_13 = new JLabel("0");
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setFont(new Font("Dialog", Font.BOLD, 12));
		label_13.setBounds(162, 89, 46, 14);
		panel_5.add(label_13);
		
		JLabel label_14 = new JLabel("0");
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setFont(new Font("Dialog", Font.BOLD, 12));
		label_14.setBounds(162, 115, 46, 14);
		panel_5.add(label_14);
		
		JLabel label_15 = new JLabel("0");
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		label_15.setFont(new Font("Dialog", Font.BOLD, 12));
		label_15.setBounds(162, 141, 46, 14);
		panel_5.add(label_15);
		
		JLabel label_16 = new JLabel("0");
		label_16.setHorizontalAlignment(SwingConstants.CENTER);
		label_16.setFont(new Font("Dialog", Font.BOLD, 12));
		label_16.setBounds(162, 167, 46, 14);
		panel_5.add(label_16);
		
		label_17 = new JLabel("0");
		label_17.setHorizontalAlignment(SwingConstants.CENTER);
		label_17.setFont(new Font("Dialog", Font.BOLD, 12));
		label_17.setBounds(204, 37, 46, 14);
		panel_5.add(label_17);
		
		label_18 = new JLabel("0");
		label_18.setHorizontalAlignment(SwingConstants.CENTER);
		label_18.setFont(new Font("Dialog", Font.BOLD, 12));
		label_18.setBounds(204, 63, 46, 14);
		panel_5.add(label_18);
		
		 label_19 = new JLabel("0");
		label_19.setHorizontalAlignment(SwingConstants.CENTER);
		label_19.setFont(new Font("Dialog", Font.BOLD, 12));
		label_19.setBounds(204, 89, 46, 14);
		panel_5.add(label_19);
		
		 label_20 = new JLabel("0");
		label_20.setHorizontalAlignment(SwingConstants.CENTER);
		label_20.setFont(new Font("Dialog", Font.BOLD, 12));
		label_20.setBounds(204, 115, 46, 14);
		panel_5.add(label_20);
		
		 label_21 = new JLabel("0");
		label_21.setHorizontalAlignment(SwingConstants.CENTER);
		label_21.setFont(new Font("Dialog", Font.BOLD, 12));
		label_21.setBounds(204, 141, 46, 14);
		panel_5.add(label_21);
		
		 label_22 = new JLabel("0");
		label_22.setHorizontalAlignment(SwingConstants.CENTER);
		label_22.setFont(new Font("Dialog", Font.BOLD, 12));
		label_22.setBounds(204, 167, 46, 14);
		panel_5.add(label_22);
		
		label_23 = new JLabel("0");
		label_23.setHorizontalAlignment(SwingConstants.CENTER);
		label_23.setFont(new Font("Dialog", Font.BOLD, 12));
		label_23.setBounds(260, 37, 46, 14);
		panel_5.add(label_23);
		
		label_24 = new JLabel("0");
		label_24.setHorizontalAlignment(SwingConstants.CENTER);
		label_24.setFont(new Font("Dialog", Font.BOLD, 12));
		label_24.setBounds(260, 63, 46, 14);
		panel_5.add(label_24);
		
		label_25 = new JLabel("0");
		label_25.setHorizontalAlignment(SwingConstants.CENTER);
		label_25.setFont(new Font("Dialog", Font.BOLD, 12));
		label_25.setBounds(260, 89, 46, 14);
		panel_5.add(label_25);
		
		label_26 = new JLabel("0");
		label_26.setHorizontalAlignment(SwingConstants.CENTER);
		label_26.setFont(new Font("Dialog", Font.BOLD, 12));
		label_26.setBounds(260, 115, 46, 14);
		panel_5.add(label_26);
		
		label_27 = new JLabel("0");
		label_27.setHorizontalAlignment(SwingConstants.CENTER);
		label_27.setFont(new Font("Dialog", Font.BOLD, 12));
		label_27.setBounds(260, 141, 46, 14);
		panel_5.add(label_27);
		
		label_28 = new JLabel("0");
		label_28.setHorizontalAlignment(SwingConstants.CENTER);
		label_28.setFont(new Font("Dialog", Font.BOLD, 12));
		label_28.setBounds(260, 167, 46, 14);
		panel_5.add(label_28);
		
		JLabel lblWickets = new JLabel("Wickets");
		lblWickets.setFont(new Font("Dialog", Font.BOLD, 12));
		lblWickets.setBounds(316, 7, 60, 14);
		panel_5.add(lblWickets);
		
		label_30 = new JLabel("0");
		label_30.setHorizontalAlignment(SwingConstants.CENTER);
		label_30.setFont(new Font("Dialog", Font.BOLD, 12));
		label_30.setBounds(316, 37, 46, 14);
		panel_5.add(label_30);
		
		label_31 = new JLabel("0");
		label_31.setHorizontalAlignment(SwingConstants.CENTER);
		label_31.setFont(new Font("Dialog", Font.BOLD, 12));
		label_31.setBounds(316, 63, 46, 14);
		panel_5.add(label_31);
		
		label_32 = new JLabel("0");
		label_32.setHorizontalAlignment(SwingConstants.CENTER);
		label_32.setFont(new Font("Dialog", Font.BOLD, 12));
		label_32.setBounds(316, 89, 46, 14);
		panel_5.add(label_32);
		
		label_33 = new JLabel("0");
		label_33.setHorizontalAlignment(SwingConstants.CENTER);
		label_33.setFont(new Font("Dialog", Font.BOLD, 12));
		label_33.setBounds(316, 115, 46, 14);
		panel_5.add(label_33);
		
		label_34 = new JLabel("0");
		label_34.setHorizontalAlignment(SwingConstants.CENTER);
		label_34.setFont(new Font("Dialog", Font.BOLD, 12));
		label_34.setBounds(316, 141, 46, 14);
		panel_5.add(label_34);
		
		label_119 = new JLabel("0");
		label_119.setHorizontalAlignment(SwingConstants.CENTER);
		label_119.setFont(new Font("Dialog", Font.BOLD, 12));
		label_119.setBounds(316, 167, 46, 14);
		panel_5.add(label_119);
		
		JLabel label_120 = new JLabel("Econamy");
		label_120.setFont(new Font("Dialog", Font.BOLD, 12));
		label_120.setBounds(404, 7, 60, 14);
		panel_5.add(label_120);
		
		JLabel label_121 = new JLabel("0");
		label_121.setHorizontalAlignment(SwingConstants.CENTER);
		label_121.setFont(new Font("Dialog", Font.BOLD, 12));
		label_121.setBounds(404, 37, 46, 14);
		panel_5.add(label_121);
		
		JLabel label_122 = new JLabel("0");
		label_122.setHorizontalAlignment(SwingConstants.CENTER);
		label_122.setFont(new Font("Dialog", Font.BOLD, 12));
		label_122.setBounds(404, 63, 46, 14);
		panel_5.add(label_122);
		
		JLabel label_123 = new JLabel("0");
		label_123.setHorizontalAlignment(SwingConstants.CENTER);
		label_123.setFont(new Font("Dialog", Font.BOLD, 12));
		label_123.setBounds(404, 87, 46, 14);
		panel_5.add(label_123);
		
		JLabel label_124 = new JLabel("0");
		label_124.setHorizontalAlignment(SwingConstants.CENTER);
		label_124.setFont(new Font("Dialog", Font.BOLD, 12));
		label_124.setBounds(404, 113, 46, 14);
		panel_5.add(label_124);
		
		JLabel label_125 = new JLabel("0");
		label_125.setHorizontalAlignment(SwingConstants.CENTER);
		label_125.setFont(new Font("Dialog", Font.BOLD, 12));
		label_125.setBounds(404, 140, 46, 14);
		panel_5.add(label_125);
		
		JLabel label_126 = new JLabel("0");
		label_126.setHorizontalAlignment(SwingConstants.CENTER);
		label_126.setFont(new Font("Dialog", Font.BOLD, 12));
		label_126.setBounds(404, 166, 46, 14);
		panel_5.add(label_126);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(Color.BLUE, 2, true));
		panel_6.setBounds(1033, 11, 321, 679);
		frame.getContentPane().add(panel_6);
		panel_6.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 40, 301, 628);
		panel_6.add(tabbedPane);
		
		JPanel panel_7 = new JPanel();
		tabbedPane.addTab("Team 1", null, panel_7, null);
		panel_7.setLayout(null);
		
		JLabel label_75 = new JLabel("Player 1");
		label_75.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_75.setBounds(10, 11, 60, 14);
		panel_7.add(label_75);
		
		JLabel label_76 = new JLabel("Player 1");
		label_76.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_76.setBounds(10, 36, 60, 14);
		panel_7.add(label_76);
		
		JLabel label_77 = new JLabel("Player 1");
		label_77.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_77.setBounds(10, 61, 60, 14);
		panel_7.add(label_77);
		
		JLabel label_78 = new JLabel("Player 1");
		label_78.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_78.setBounds(10, 86, 60, 14);
		panel_7.add(label_78);
		
		JLabel label_79 = new JLabel("Player 1");
		label_79.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_79.setBounds(10, 111, 60, 14);
		panel_7.add(label_79);
		
		JLabel label_80 = new JLabel("Player 1");
		label_80.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_80.setBounds(10, 136, 60, 14);
		panel_7.add(label_80);
		
		JLabel label_81 = new JLabel("Player 1");
		label_81.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_81.setBounds(10, 161, 60, 14);
		panel_7.add(label_81);
		
		JLabel label_82 = new JLabel("Player 1");
		label_82.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_82.setBounds(10, 186, 60, 14);
		panel_7.add(label_82);
		
		JLabel label_83 = new JLabel("Player 1");
		label_83.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_83.setBounds(10, 211, 60, 14);
		panel_7.add(label_83);
		
		JLabel label_84 = new JLabel("Player 1");
		label_84.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_84.setBounds(10, 236, 60, 14);
		panel_7.add(label_84);
		
		JLabel label_85 = new JLabel("Player 1");
		label_85.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_85.setBounds(10, 261, 60, 14);
		panel_7.add(label_85);
		
		JLabel label_86 = new JLabel("-");
		label_86.setBounds(80, 262, 124, 14);
		panel_7.add(label_86);
		
		JLabel label_87 = new JLabel("-");
		label_87.setBounds(80, 237, 124, 14);
		panel_7.add(label_87);
		
		JLabel label_88 = new JLabel("-");
		label_88.setBounds(80, 212, 124, 14);
		panel_7.add(label_88);
		
		JLabel label_89 = new JLabel("-");
		label_89.setBounds(80, 187, 124, 14);
		panel_7.add(label_89);
		
		JLabel label_90 = new JLabel("-");
		label_90.setBounds(80, 162, 124, 14);
		panel_7.add(label_90);
		
		JLabel label_91 = new JLabel("-");
		label_91.setBounds(80, 137, 124, 14);
		panel_7.add(label_91);
		
		JLabel label_92 = new JLabel("-");
		label_92.setBounds(80, 112, 124, 14);
		panel_7.add(label_92);
		
		JLabel label_93 = new JLabel("-");
		label_93.setBounds(80, 87, 124, 14);
		panel_7.add(label_93);
		
		JLabel label_94 = new JLabel("-");
		label_94.setBounds(80, 62, 124, 14);
		panel_7.add(label_94);
		
		JLabel label_95 = new JLabel("-");
		label_95.setBounds(80, 37, 124, 14);
		panel_7.add(label_95);
		
		JLabel label_96 = new JLabel("-");
		label_96.setBounds(80, 12, 124, 14);
		panel_7.add(label_96);
		
		label_97 = new JLabel("0");
		label_97.setHorizontalAlignment(SwingConstants.RIGHT);
		label_97.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_97.setBounds(214, 12, 46, 14);
		panel_7.add(label_97);
		
		label_98 = new JLabel("0");
		label_98.setHorizontalAlignment(SwingConstants.RIGHT);
		label_98.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_98.setBounds(214, 37, 46, 14);
		panel_7.add(label_98);
		
		label_99 = new JLabel("0");
		label_99.setHorizontalAlignment(SwingConstants.RIGHT);
		label_99.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_99.setBounds(214, 62, 46, 14);
		panel_7.add(label_99);
		
		label_100 = new JLabel("0");
		label_100.setHorizontalAlignment(SwingConstants.RIGHT);
		label_100.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_100.setBounds(214, 87, 46, 14);
		panel_7.add(label_100);
		
		label_101 = new JLabel("0");
		label_101.setHorizontalAlignment(SwingConstants.RIGHT);
		label_101.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_101.setBounds(214, 112, 46, 14);
		panel_7.add(label_101);
		
		label_102 = new JLabel("0");
		label_102.setHorizontalAlignment(SwingConstants.RIGHT);
		label_102.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_102.setBounds(214, 137, 46, 14);
		panel_7.add(label_102);
		
		label_103 = new JLabel("0");
		label_103.setHorizontalAlignment(SwingConstants.RIGHT);
		label_103.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_103.setBounds(214, 162, 46, 14);
		panel_7.add(label_103);
		
		label_104 = new JLabel("0");
		label_104.setHorizontalAlignment(SwingConstants.RIGHT);
		label_104.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_104.setBounds(214, 187, 46, 14);
		panel_7.add(label_104);
		
		label_105 = new JLabel("0");
		label_105.setHorizontalAlignment(SwingConstants.RIGHT);
		label_105.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_105.setBounds(214, 212, 46, 14);
		panel_7.add(label_105);
		
		label_106 = new JLabel("0");
		label_106.setHorizontalAlignment(SwingConstants.RIGHT);
		label_106.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_106.setBounds(214, 237, 46, 14);
		panel_7.add(label_106);
		
		label_107 = new JLabel("0");
		label_107.setHorizontalAlignment(SwingConstants.RIGHT);
		label_107.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_107.setBounds(214, 262, 46, 14);
		panel_7.add(label_107);
		
		label_108 = new JLabel("0");
		label_108.setHorizontalAlignment(SwingConstants.RIGHT);
		label_108.setBounds(270, 262, 16, 14);
		panel_7.add(label_108);
		
		JLabel label_109 = new JLabel("0");
		label_109.setHorizontalAlignment(SwingConstants.RIGHT);
		label_109.setBounds(270, 237, 16, 14);
		panel_7.add(label_109);
		
		JLabel label_110 = new JLabel("0");
		label_110.setHorizontalAlignment(SwingConstants.RIGHT);
		label_110.setBounds(270, 212, 16, 14);
		panel_7.add(label_110);
		
		JLabel label_111 = new JLabel("0");
		label_111.setHorizontalAlignment(SwingConstants.RIGHT);
		label_111.setBounds(270, 187, 16, 14);
		panel_7.add(label_111);
		
		JLabel label_112 = new JLabel("0");
		label_112.setHorizontalAlignment(SwingConstants.RIGHT);
		label_112.setBounds(270, 162, 16, 14);
		panel_7.add(label_112);
		
		JLabel label_113 = new JLabel("0");
		label_113.setHorizontalAlignment(SwingConstants.RIGHT);
		label_113.setBounds(270, 137, 16, 14);
		panel_7.add(label_113);
		
		JLabel label_114 = new JLabel("0");
		label_114.setHorizontalAlignment(SwingConstants.RIGHT);
		label_114.setBounds(270, 112, 16, 14);
		panel_7.add(label_114);
		
		JLabel label_115 = new JLabel("0");
		label_115.setHorizontalAlignment(SwingConstants.RIGHT);
		label_115.setBounds(270, 87, 16, 14);
		panel_7.add(label_115);
		
		JLabel label_116 = new JLabel("0");
		label_116.setHorizontalAlignment(SwingConstants.RIGHT);
		label_116.setBounds(270, 62, 16, 14);
		panel_7.add(label_116);
		
		JLabel label_117 = new JLabel("0");
		label_117.setHorizontalAlignment(SwingConstants.RIGHT);
		label_117.setBounds(270, 37, 16, 14);
		panel_7.add(label_117);
		
		JLabel label_118 = new JLabel("0");
		label_118.setHorizontalAlignment(SwingConstants.RIGHT);
		label_118.setBounds(270, 12, 16, 14);
		panel_7.add(label_118);
		
		JPanel panel_8 = new JPanel();
		tabbedPane.addTab("Team 2", null, panel_8, null);
		panel_8.setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel("Player 1");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_9.setBounds(10, 11, 60, 14);
		panel_8.add(lblNewLabel_9);
		
		JLabel label_35 = new JLabel("Player 1");
		label_35.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_35.setBounds(10, 36, 60, 14);
		panel_8.add(label_35);
		
		JLabel label_36 = new JLabel("Player 1");
		label_36.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_36.setBounds(10, 61, 60, 14);
		panel_8.add(label_36);
		
		JLabel label_37 = new JLabel("Player 1");
		label_37.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_37.setBounds(10, 86, 60, 14);
		panel_8.add(label_37);
		
		JLabel label_38 = new JLabel("Player 1");
		label_38.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_38.setBounds(10, 111, 60, 14);
		panel_8.add(label_38);
		
		JLabel label_39 = new JLabel("Player 1");
		label_39.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_39.setBounds(10, 136, 60, 14);
		panel_8.add(label_39);
		
		JLabel label_40 = new JLabel("Player 1");
		label_40.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_40.setBounds(10, 161, 60, 14);
		panel_8.add(label_40);
		
		JLabel label_41 = new JLabel("Player 1");
		label_41.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_41.setBounds(10, 186, 60, 14);
		panel_8.add(label_41);
		
		JLabel label_42 = new JLabel("Player 1");
		label_42.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_42.setBounds(10, 211, 60, 14);
		panel_8.add(label_42);
		
		JLabel label_43 = new JLabel("Player 1");
		label_43.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_43.setBounds(10, 236, 60, 14);
		panel_8.add(label_43);
		
		JLabel label_44 = new JLabel("Player 1");
		label_44.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_44.setBounds(10, 261, 60, 14);
		panel_8.add(label_44);
		
		JLabel lblNewLabel_10 = new JLabel("-");
		lblNewLabel_10.setBounds(80, 12, 124, 14);
		panel_8.add(lblNewLabel_10);
		
		JLabel label_45 = new JLabel("-");
		label_45.setBounds(80, 37, 124, 14);
		panel_8.add(label_45);
		
		JLabel label_46 = new JLabel("-");
		label_46.setBounds(80, 62, 124, 14);
		panel_8.add(label_46);
		
		JLabel label_47 = new JLabel("-");
		label_47.setBounds(80, 87, 124, 14);
		panel_8.add(label_47);
		
		JLabel label_48 = new JLabel("-");
		label_48.setBounds(80, 112, 124, 14);
		panel_8.add(label_48);
		
		JLabel label_49 = new JLabel("-");
		label_49.setBounds(80, 137, 124, 14);
		panel_8.add(label_49);
		
		JLabel label_50 = new JLabel("-");
		label_50.setBounds(80, 162, 124, 14);
		panel_8.add(label_50);
		
		JLabel label_51 = new JLabel("-");
		label_51.setBounds(80, 187, 124, 14);
		panel_8.add(label_51);
		
		JLabel label_52 = new JLabel("-");
		label_52.setBounds(80, 212, 124, 14);
		panel_8.add(label_52);
		
		JLabel label_53 = new JLabel("-");
		label_53.setBounds(80, 237, 124, 14);
		panel_8.add(label_53);
		
		JLabel label_54 = new JLabel("-");
		label_54.setBounds(80, 262, 124, 14);
		panel_8.add(label_54);
		
		JLabel lblNewLabel_11 = new JLabel("0");
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_11.setBounds(214, 12, 46, 14);
		panel_8.add(lblNewLabel_11);
		
		JLabel label_55 = new JLabel("0");
		label_55.setHorizontalAlignment(SwingConstants.RIGHT);
		label_55.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_55.setBounds(214, 37, 46, 14);
		panel_8.add(label_55);
		
		JLabel label_56 = new JLabel("0");
		label_56.setHorizontalAlignment(SwingConstants.RIGHT);
		label_56.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_56.setBounds(214, 62, 46, 14);
		panel_8.add(label_56);
		
		JLabel label_57 = new JLabel("0");
		label_57.setHorizontalAlignment(SwingConstants.RIGHT);
		label_57.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_57.setBounds(214, 87, 46, 14);
		panel_8.add(label_57);
		
		JLabel label_58 = new JLabel("0");
		label_58.setHorizontalAlignment(SwingConstants.RIGHT);
		label_58.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_58.setBounds(214, 112, 46, 14);
		panel_8.add(label_58);
		
		JLabel label_59 = new JLabel("0");
		label_59.setHorizontalAlignment(SwingConstants.RIGHT);
		label_59.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_59.setBounds(214, 137, 46, 14);
		panel_8.add(label_59);
		
		JLabel label_60 = new JLabel("0");
		label_60.setHorizontalAlignment(SwingConstants.RIGHT);
		label_60.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_60.setBounds(214, 162, 46, 14);
		panel_8.add(label_60);
		
		JLabel label_61 = new JLabel("0");
		label_61.setHorizontalAlignment(SwingConstants.RIGHT);
		label_61.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_61.setBounds(214, 187, 46, 14);
		panel_8.add(label_61);
		
		JLabel label_62 = new JLabel("0");
		label_62.setHorizontalAlignment(SwingConstants.RIGHT);
		label_62.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_62.setBounds(214, 212, 46, 14);
		panel_8.add(label_62);
		
		JLabel label_63 = new JLabel("0");
		label_63.setHorizontalAlignment(SwingConstants.RIGHT);
		label_63.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_63.setBounds(214, 237, 46, 14);
		panel_8.add(label_63);
		
		JLabel label_64 = new JLabel("0");
		label_64.setHorizontalAlignment(SwingConstants.RIGHT);
		label_64.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_64.setBounds(214, 262, 46, 14);
		panel_8.add(label_64);
		
		JLabel lblNewLabel_12 = new JLabel("0");
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_12.setBounds(270, 12, 16, 14);
		panel_8.add(lblNewLabel_12);
		
		JLabel label_65 = new JLabel("0");
		label_65.setHorizontalAlignment(SwingConstants.RIGHT);
		label_65.setBounds(270, 37, 16, 14);
		panel_8.add(label_65);
		
		JLabel label_66 = new JLabel("0");
		label_66.setHorizontalAlignment(SwingConstants.RIGHT);
		label_66.setBounds(270, 62, 16, 14);
		panel_8.add(label_66);
		
		JLabel label_67 = new JLabel("0");
		label_67.setHorizontalAlignment(SwingConstants.RIGHT);
		label_67.setBounds(270, 87, 16, 14);
		panel_8.add(label_67);
		
		JLabel label_68 = new JLabel("0");
		label_68.setHorizontalAlignment(SwingConstants.RIGHT);
		label_68.setBounds(270, 112, 16, 14);
		panel_8.add(label_68);
		
		JLabel label_69 = new JLabel("0");
		label_69.setHorizontalAlignment(SwingConstants.RIGHT);
		label_69.setBounds(270, 137, 16, 14);
		panel_8.add(label_69);
		
		JLabel label_70 = new JLabel("0");
		label_70.setHorizontalAlignment(SwingConstants.RIGHT);
		label_70.setBounds(270, 162, 16, 14);
		panel_8.add(label_70);
		
		JLabel label_71 = new JLabel("0");
		label_71.setHorizontalAlignment(SwingConstants.RIGHT);
		label_71.setBounds(270, 187, 16, 14);
		panel_8.add(label_71);
		
		JLabel label_72 = new JLabel("0");
		label_72.setHorizontalAlignment(SwingConstants.RIGHT);
		label_72.setBounds(270, 212, 16, 14);
		panel_8.add(label_72);
		
		JLabel label_73 = new JLabel("0");
		label_73.setHorizontalAlignment(SwingConstants.RIGHT);
		label_73.setBounds(270, 237, 16, 14);
		panel_8.add(label_73);
		
		JLabel label_74 = new JLabel("0");
		label_74.setHorizontalAlignment(SwingConstants.RIGHT);
		label_74.setBounds(270, 262, 16, 14);
		panel_8.add(label_74);
	}
}
