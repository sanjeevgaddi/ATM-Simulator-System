import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Withdraw extends JFrame implements ActionListener{
	
	JTextField amount;
	JButton withdraw,back;
	String pinnumber;
	
	public Withdraw(String pinnumber) {
		this.pinnumber=pinnumber;
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
		Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image=new JLabel(i3);
		image.setBounds(0, 0, 900, 900);
		add(image);
		
		JLabel text=new JLabel("Enter the amount you want to Withdraw");
		text.setBounds(190, 300, 400, 35);
		text.setForeground(Color.white);
		text.setFont(new Font("Raleway",Font.BOLD,16));
		image.add(text);
		
		amount=new JTextField();
		amount.setFont(new Font("Raleway",Font.BOLD,14));
		amount.setBounds(190, 350, 300, 25);
		image.add(amount);
		
		withdraw=new JButton("Withdraw");
		withdraw.setBounds(355, 455, 150, 30);
		withdraw.addActionListener(this);
		image.add(withdraw);
		
		back=new JButton("Back");
		back.setBounds(355, 490, 150, 30);
		back.addActionListener(this);
		image.add(back);
		
		
		setSize(900,900);
		setLocation(300,0);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==withdraw)
		{
			String number=amount.getText();
			Date date=new Date();
			if(number.equals(""))
			{
				JOptionPane.showMessageDialog(null, "Please enter the amount you want to Withdraw");
			}
			else {
				try {
				Conn conn=new Conn();
				String query="insert into bank values('"+pinnumber+"','"+date+"','Withdrawl','"+number+"')";
				conn.s.executeUpdate(query);
				JOptionPane.showMessageDialog(null, "Rs. "+number+" Withdrawl Sucessfully");
				setVisible(false);
				new Transaction(pinnumber).setVisible(true);
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		}
		else if(ae.getSource()==back)
		{
			setVisible(false);
			new Transaction(pinnumber).setVisible(true);
		}
		
	}

	public static void main(String[] args) {
		new Withdraw("");

	}

	

}
