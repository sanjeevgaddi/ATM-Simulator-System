import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class SignUpThree extends JFrame implements ActionListener{
	
	
	JRadioButton r1,r2,r3,r4;
	JCheckBox c1,c2,c3,c4,c5,c6,c7;
	JButton submit,cancel;
	String formno;
	public SignUpThree(String formno) {
		
		this.formno=formno;
		setLayout(null);
		setTitle("NEW ACCOUNT APPLICATION FORM-PAGE 3");
		
		JLabel l1=new JLabel("Page 3: Account Details");
		l1.setFont(new Font("raleway",Font.BOLD,22));
		l1.setBounds(280, 40, 400, 40);
		add(l1);
		
		JLabel type=new JLabel("Account Type:");
		type.setFont(new Font("raleway",Font.BOLD,22));
		type.setBounds(150, 140, 250, 30);
		add(type);
		
		r1=new JRadioButton("Saving Account");
		r1.setFont(new Font("raleway",Font.BOLD,16));
		r1.setBackground(Color.white);
		r1.setBounds(150, 180, 200, 20);
		add(r1);
		
		r2=new JRadioButton("Fixed Deposit Account");
		r2.setFont(new Font("raleway",Font.BOLD,16));
		r2.setBackground(Color.white);
		r2.setBounds(450, 180, 250, 20);
		add(r2);
		
		r3=new JRadioButton("Current Account");
		r3.setFont(new Font("raleway",Font.BOLD,16));
		r3.setBackground(Color.white);
		r3.setBounds(150, 220, 200, 20);
		add(r3);
		
		r4=new JRadioButton("Recurring Deposit Account");
		r4.setFont(new Font("raleway",Font.BOLD,16));
		r4.setBackground(Color.white);
		r4.setBounds(450, 220, 250, 20);
		add(r4);
		
		ButtonGroup groupaccount=new ButtonGroup();
		groupaccount.add(r1);
		groupaccount.add(r2);
		groupaccount.add(r3);
		groupaccount.add(r4);
		
		JLabel card=new JLabel("Card Number:");
		card.setFont(new Font("raleway",Font.BOLD,22));
		card.setBounds(150, 300, 200, 30);
		add(card);
		
		JLabel carddetails=new JLabel("Your 16 Digit Card Number");
		carddetails.setFont(new Font("raleway",Font.BOLD,12));
		carddetails.setBounds(150, 330, 200, 20);
		add(carddetails);
		
		JLabel number=new JLabel("XXXX-XXXX-XXXX-4184");
		number.setFont(new Font("raleway",Font.BOLD,22));
		number.setBounds(330, 300, 300, 30);
		add(number);
		
		JLabel pin=new JLabel("PIN:");
		pin.setFont(new Font("raleway",Font.BOLD,22));
		pin.setBounds(150, 370, 200, 30);
		add(pin);
		
		JLabel pindetails=new JLabel("Your 4 Digit PIN");
		pindetails.setFont(new Font("raleway",Font.BOLD,12));
		pindetails.setBounds(150, 400, 200, 30);
		add(pindetails);
		
		JLabel pinnumber=new JLabel("XXXX");
		pinnumber.setFont(new Font("raleway",Font.BOLD,22));
		pinnumber.setBounds(330, 370, 300, 30);
		add(pinnumber);
		
		JLabel services=new JLabel("Services Required:");
		services.setFont(new Font("raleway",Font.BOLD,22));
		services.setBounds(150, 450, 250, 30);
		add(services);
		
		c1=new JCheckBox("ATM CARD");
		c1.setBackground(Color.white);
		c1.setFont(new Font("raleway",Font.BOLD,16));
		c1.setBounds(150, 500, 200, 30);
		add(c1);
		
		c2=new JCheckBox("Internet Banking");
		c2.setBackground(Color.white);
		c2.setFont(new Font("raleway",Font.BOLD,16));
		c2.setBounds(450, 500, 250, 30);
		add(c2);
		
		c3=new JCheckBox("Mobile Banking");
		c3.setBackground(Color.white);
		c3.setFont(new Font("raleway",Font.BOLD,16));
		c3.setBounds(150, 550, 200, 30);
		add(c3);
		
		c4=new JCheckBox("EMAIL & SMS Alerts");
		c4.setBackground(Color.white);
		c4.setFont(new Font("raleway",Font.BOLD,16));
		c4.setBounds(450, 550, 250, 30);
		add(c4);
		
		c5=new JCheckBox("Cheque Book");
		c5.setBackground(Color.white);
		c5.setFont(new Font("raleway",Font.BOLD,16));
		c5.setBounds(150, 600, 200, 30);
		add(c5);
		
		c6=new JCheckBox("E-Statement");
		c6.setBackground(Color.white);
		c6.setFont(new Font("raleway",Font.BOLD,16));
		c6.setBounds(450, 600, 250, 30);
		add(c6);
		
		c7=new JCheckBox("I hearby declares that the above entered details are correct to the best of my knowledge");
		c7.setBackground(Color.white);
		c7.setFont(new Font("raleway",Font.BOLD,12));
		c7.setBounds(150, 660, 550, 30);
		add(c7);
		
		submit=new JButton("Submit");
		submit.setBackground(Color.black);
		submit.setForeground(Color.white);
		submit.setFont(new Font("raleway",Font.BOLD,14));
		submit.addActionListener(this);
		submit.setBounds(250,720,100,30);
		add(submit);
		
		cancel=new JButton("Cancel");
		cancel.setBackground(Color.black);
		cancel.setForeground(Color.white);
		cancel.setFont(new Font("raleway",Font.BOLD,14));
		cancel.setBounds(420,720,100,30);
		cancel.addActionListener(this);
		add(cancel);
		
		
		getContentPane().setBackground(Color.white);
		setSize(850,820);
		setLocation(350,0);
		setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==submit)
		{
			String accountType=null;
			if(r1.isSelected()) {
				accountType="Saving Account";
			}else if(r2.isSelected()) {
				accountType="Fixed Deposit Account";
			}else if(r3.isSelected()) {
				accountType="Current Account";
			}else if(r4.isSelected()) {
				accountType="Recuring Deposit Account";
			}
			Random random=new Random();
			String cardnumber=""+Math.abs((random.nextLong()%90000000L)+5040936000000000L);
			
			String pinnumber=""+Math.abs((random.nextLong()%9000L)+1000L);
			
			String facility="";
			
			if(c1.isSelected()) {
				facility=facility+"ATM Card";
			}else if(c2.isSelected()) {
				facility=facility+"Internet Banking";
			}else if(c3.isSelected()) {
				facility=facility+"Mobile Banking";
			}else if(c4.isSelected()) {
				facility=facility+"EMAIL & SMS Alerts";
			}else if(c5.isSelected()) {
				facility=facility+"Cheque Book";
			}else if(c6.isSelected()) {
				facility=facility+"E-Statement";
			}
			
			String declaration="";
			if(c7.isSelected()) {
				declaration="checked";
			}
			
			try 
			{
				if(accountType.equals(""))
				{
					JOptionPane.showMessageDialog(null, "Account Type is Required");
				}else if(declaration.equals("")) {
					JOptionPane.showMessageDialog(null, "Declaration is Required");
				}
				else {
					Conn con=new Conn();
					String query1="insert into signupthree values('"+formno+"','"+accountType+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
					String query2="insert into login values('"+formno+"','"+cardnumber+"','"+pinnumber+"')";
					con.s.executeUpdate(query1);
					con.s.executeUpdate(query2);
					
					JOptionPane.showMessageDialog(null, "Card Number: "+cardnumber+"\n PIN: "+pinnumber);
					//signup next object
					
					setVisible(false);
					new Deposit(pinnumber).setVisible(true);
					
					}
			}
			catch(Exception e) 
			{
				e.printStackTrace();
			}
			
		}
		else if(ae.getSource()==cancel)
		{
			setVisible(false);
			new Login().setVisible(true);
		}
		
	}


	public static void main(String[] args) {
		new SignUpThree("");

	}

	
}
