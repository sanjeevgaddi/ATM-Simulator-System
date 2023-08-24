import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;

public class Login extends JFrame implements ActionListener{
	
	JButton login,signup,clear;
	JTextField cardTextField;
	JPasswordField pinTextField;
	Login(){
		setTitle("AUTOMATED TELLER MACHINE");
		
		setLayout(null);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
		Image i2=i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel label=new JLabel(i3);
		label.setBounds(70, 10, 100, 100);
		add(label);
		
		JLabel text=new JLabel("Welcome To ATM");
		text.setFont(new Font("Osward",Font.BOLD,38));
		text.setBounds(250, 40, 400, 40);
		add(text);
		
		JLabel cardno=new JLabel("Card No :");
		cardno.setFont(new Font("Raleway",Font.BOLD,28));
		cardno.setBounds(120, 150, 150, 30);
		add(cardno);
		
		cardTextField =new JTextField();
		cardTextField.setBounds(300,150,230,30);
		cardTextField.setFont(new Font("Arial",Font.BOLD,14));
		add(cardTextField);
		
		
		JLabel pin=new JLabel("PIN :");
		pin.setFont(new Font("Raleway",Font.BOLD,28));
		pin.setBounds(120, 220, 250, 30);
		add(pin);
		
		pinTextField =new JPasswordField();
		pinTextField.setBounds(300,220,230,30);
		pinTextField.setFont(new Font("Arial",Font.BOLD,14));
		add(pinTextField);
		
		login=new JButton("SIGN IN");
		login.setBounds(300, 300, 100, 30);
		login.setBackground(java.awt.Color.black);
		login.setForeground(java.awt.Color.white);
		login.addActionListener(this);
		add(login);
		
		clear=new JButton("CLEAR");
		clear.setBounds(430, 300, 100, 30);
		clear.setBackground(java.awt.Color.black);
		clear.setForeground(java.awt.Color.white);
		clear.addActionListener(this);
		add(clear);
		
		signup=new JButton("SIGN UP");
		signup.setBounds(300, 350, 230, 30);
		signup.setBackground(java.awt.Color.black);
		signup.setForeground(java.awt.Color.white);
		signup.addActionListener(this);
		add(signup);
		
		getContentPane().setBackground(java.awt.Color.white);
		
		setSize(800,500);
		setVisible(true);
		setLocation(350,200);
	}
	
	//@Override
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource() == clear)
		{
			cardTextField.setText("");
			pinTextField.setText("");
			
		}
		else if(ae.getSource() == login)
		{
			Conn conn=new Conn();
			String cardnumber=cardTextField.getText();
			String pinnumber=pinTextField.getText();
			String query="select * from login where CARD_NUMBER ='"+cardnumber+"' and PIN_NUMBER ='"+pinnumber+"' ";
			
			try {
				
				ResultSet rs= conn.s.executeQuery(query);
				if(rs.next())
				{
					setVisible(false);
					new Transaction(pinnumber).setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "Incorrect Card Number or PIN");
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		else//(ae.getSource() == signup );
		{
			setVisible(false);
			new SignUpOne().setVisible(true);
		}
		
	}
	
	public static void main(String[] args) {
		new Login();

	}

	

}
