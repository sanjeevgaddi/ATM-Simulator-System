import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class PinChange extends JFrame implements ActionListener{
	
	JPasswordField pin,repin;
	JButton change,back;
	String pinnumber;
	public PinChange(String pinnumber) {
		this.pinnumber=pinnumber;
		setLayout(null);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
		Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image=new JLabel(i3);
		image.setBounds(0, 0, 900, 900);
		add(image);
		
		JLabel pintext=new JLabel("NEW PIN:");
		pintext.setBounds(165, 320, 180, 25);
		pintext.setForeground(Color.white);
		pintext.setFont(new Font("Raleway",Font.BOLD,16));
		image.add(pintext);
		
		pin=new JPasswordField();
		pin.setFont(new Font("Raleway",Font.BOLD,25));
		pin.setBounds(320,320,180,25);
		image.add(pin);
		
		JLabel repintext=new JLabel("Re-ENTER NEW PIN:");
		repintext.setBounds(165, 360, 180, 25);
		repintext.setForeground(Color.white);
		repintext.setFont(new Font("Raleway",Font.BOLD,16));
		image.add(repintext);
		
		repin=new JPasswordField();
		repin.setFont(new Font("Raleway",Font.BOLD,25));
		repin.setBounds(320,360,180,25);
		image.add(repin);
		
		change=new JButton("CHANGE");
		change.setBounds(355,485,150,30);
		change.addActionListener(this);
		image.add(change);
		
		back=new JButton("BACK");
		back.setBounds(355,520,150,30);
		back.addActionListener(this);
		image.add(back);
		
		setSize(900,900);
		setLocation(300,0);
		//setUndecorated(true);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource()==change)
		{
			try 
			{
				String npin=pin.getText();
				String rpin=repin.getText();
			
				 if(!npin.equals(rpin))
				 {
					 JOptionPane.showMessageDialog(null, "Entered PIN does not match");
					 return;
				 }
				 if(npin.equals(""))
				 {
					 JOptionPane.showMessageDialog(null, "Please enter new PIN");
					 return;
				 }
				 if(rpin.equals(""))
				 {
					 JOptionPane.showMessageDialog(null, "Please re-enter new PIN");
					 return;
				 }
				 
				 Conn c=new Conn();
				 String query1="update bank set pin_number = '"+rpin+"' where pin_number='"+pinnumber+"'";
				 String query2="update login set pin_number = '"+rpin+"' where pin_number='"+pinnumber+"'";
				 String query3="update signupthree set pin_number = '"+rpin+"' where pin_number='"+pinnumber+"'";
				 
				 c.s.executeUpdate(query1);
				 c.s.executeUpdate(query2);
				 c.s.executeUpdate(query3);
				 
				 JOptionPane.showMessageDialog(null, "PIN changed sucessfully");
				 setVisible(false);
				 new Transaction(rpin).setVisible(true);
				 
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		else
		{
			setVisible(false);
			new Transaction(pinnumber).setVisible(true);
		}
	}

	public static void main(String[] args) {
		new PinChange("");

	}

	

}
