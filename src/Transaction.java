import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Transaction extends JFrame implements ActionListener{

	JButton deposit,withdrawl,ministatement,pinchange,fastcash,balance,exit;
	String pinnumber;
	public Transaction(String pinnumber) {
		this.pinnumber=pinnumber;
		setLayout(null);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
		Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image=new JLabel(i3);
		image.setBounds(0, 0, 900, 900);
		add(image);
		
		JLabel text=new JLabel("Please select your Transaction");
		text.setBounds(210, 300, 700, 35);
		text.setForeground(Color.white);
		text.setFont(new Font("Raleway",Font.BOLD,16));
		image.add(text);
		
		deposit=new JButton("Deposit");
		deposit.setBounds(170, 415, 150, 30);
		deposit.addActionListener(this);
		image.add(deposit);
		
		withdrawl=new JButton("Withdrawl");
		withdrawl.setBounds(355, 415, 150, 30);
		withdrawl.addActionListener(this);
		image.add(withdrawl);
		
		fastcash=new JButton("FastCash");
		fastcash.setBounds(170, 450, 150, 30);
		fastcash.addActionListener(this);
		image.add(fastcash);
		
		ministatement=new JButton("Mini Statement");
		ministatement.setBounds(355, 450, 150, 30);
		ministatement.addActionListener(this);
		image.add(ministatement);
		
		pinchange=new JButton("PIN Change");
		pinchange.setBounds(170, 485, 150, 30);
		pinchange.addActionListener(this);
		image.add(pinchange);
		
		balance=new JButton("Balance Enquiry");
		balance.setBounds(355, 485, 150, 30);
		balance.addActionListener(this);
		image.add(balance);
		
		exit=new JButton("EXIT");
		exit.setBounds(355, 520, 150, 30);
		exit.addActionListener(this);
		image.add(exit);
		
		
		setSize(900,900);
		setLocation(300,0);
		setUndecorated(true);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==exit)
		{
			System.exit(0);
		}
		else if(ae.getSource()==deposit)
		{
			setVisible(false);
			new Deposit(pinnumber).setVisible(true);	
		}
		else if(ae.getSource()==withdrawl)
		{
			setVisible(false);
			new Withdraw(pinnumber).setVisible(true);	
		}
		else if(ae.getSource()==fastcash)
		{
			setVisible(false);
			new Fastcash(pinnumber).setVisible(true);
		}
		else if(ae.getSource()==pinchange)
		{
			setVisible(false);
			new PinChange(pinnumber).setVisible(true);	
		}
		else if(ae.getSource()==balance)
		{
			setVisible(false);
			new BalanceEnquiry(pinnumber).setVisible(true);	
		}
		else if(ae.getSource()==ministatement)
		{
			//setVisible(false);
			new MiniStatement(pinnumber).setVisible(true);	
		}
	}
	
	public static void main(String[] args) {
		new Transaction("");

	}
	

}
