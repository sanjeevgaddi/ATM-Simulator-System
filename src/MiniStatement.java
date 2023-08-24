import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MiniStatement extends JFrame implements ActionListener{
	
	String pinnumber;
	
	public MiniStatement(String pinnumber) {
		this.pinnumber=pinnumber;
		
		setTitle("Mini Statement");
		setLayout(null);
		
		JLabel mini=new JLabel();
		mini.setBounds(20, 140, 400, 200);
		add(mini);
		
		JLabel bank=new JLabel("SBI Bank");
		bank.setBounds(150, 20, 100, 20);
		add(bank);
		

		JLabel card=new JLabel();
		card.setBounds(20, 80, 300, 20);
		add(card);
		
		JLabel balance=new JLabel();
		balance.setBounds(20, 400, 300, 20);
		add(balance);
		
		try {
			
			Conn c=new Conn();
			ResultSet rs=c.s.executeQuery("select * from login where pin_number = '"+pinnumber+"' ");
			while(rs.next())
			{
				card.setText("Card NUmber: "+rs.getString("card_number").substring(0,4)+"XXXXXXXX"+rs.getString("card_number").substring(12));
				
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		try {
			int bal=0;
			Conn c=new Conn();
			ResultSet rs=c.s.executeQuery("select * from bank where pin_number = '"+pinnumber+"' ");
			while(rs.next())
			{
				mini.setText(mini.getText() + "<html>" + rs.getString("date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + 
							rs.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("amount") +"<br><br><html>");
				if(rs.getString("TYPE").equals("Deposit"))
				{
					bal+=Integer.parseInt(rs.getString("amount"));
				}
				else {
					bal-=Integer.parseInt(rs.getString("amount"));
				}
			}
			balance.setText("Your Current Account Balance is Rs "+bal);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		setSize(400,600);
		setLocation(20,20);
		getContentPane().setBackground(Color.white);
		
		setVisible(true);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		new MiniStatement("");

	}

	

}
