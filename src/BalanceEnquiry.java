import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BalanceEnquiry  extends JFrame implements ActionListener{
	
	JButton back;
	String pinnumber;
	public BalanceEnquiry(String pinnumber){
		this.pinnumber=pinnumber;
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
		Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image=new JLabel(i3);
		image.setBounds(0, 0, 900, 900);
		add(image);
		
		back=new JButton("Back");
		back.setBounds(355, 520, 150, 30);
		back.addActionListener(this);
		image.add(back);
		
		int balance=0;
		Conn c=new Conn();
		try {
			ResultSet rs=c.s.executeQuery("select * from bank where pin_number ='"+pinnumber+"'");
			while(rs.next())
			{
				if(rs.getString("TYPE").equals("Deposit"))
				{
					balance+=Integer.parseInt(rs.getString("amount"));
				}
				else 
				{
					balance-=Integer.parseInt(rs.getString("amount"));
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		JLabel text=new JLabel("Your Current balance is RS "+balance);
		text.setBounds(210, 320, 700, 35);
		text.setForeground(Color.white);
		text.setFont(new Font("Raleway",Font.BOLD,16));
		image.add(text);
		
		setSize(900,900);
		setLocation(300,0);
		setUndecorated(true);
		setVisible(true);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		setVisible(false);
		new Transaction(pinnumber).setVisible(true);
		
	}

	public static void main(String[] args) {
		new BalanceEnquiry("");

	}

	

}
