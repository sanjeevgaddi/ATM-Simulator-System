import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;

public class SignUpOne extends JFrame implements ActionListener{
	
	long random;
	JTextField nameTextfield,fnameTextfield,emailTextfield,
	addressTextfield,cityTextfield,stateTextfield,pinTextfield;
	JButton next;
	JRadioButton male,female,other,married,unmarried,other1;
	JDateChooser datechooser;
	
	public SignUpOne() {
		setLayout(null);
		
		Random ran=new Random();
		random =Math.abs(ran.nextLong()% 9000L + 1000L);
		
		JLabel formno=new JLabel("APPLICATION FORM NO. "+random);
		formno.setFont(new Font("Raleway",Font.BOLD,38));
		formno.setBounds(140,20,600,40);
		add(formno);
		
		JLabel personalDetails=new JLabel("Page 1: Personal Details");
		personalDetails.setFont(new Font("Raleway",Font.BOLD,22));
		personalDetails.setBounds(290,80,400,30);
		add(personalDetails);
		
		JLabel name=new JLabel("Name:");
		name.setFont(new Font("Raleway",Font.BOLD,20));
		name.setBounds(100,140,100,30);
		add(name);
		
		nameTextfield=new JTextField();
		nameTextfield.setFont(new Font("Raleway",Font.BOLD,14));
		nameTextfield.setBounds(300, 140, 400, 30);
		add(nameTextfield);
		
		JLabel fname=new JLabel("fathers's Name:");
		fname.setFont(new Font("Raleway",Font.BOLD,20));
		fname.setBounds(100,190,200,30);
		add(fname);
		
		fnameTextfield=new JTextField();
		fnameTextfield.setFont(new Font("Raleway",Font.BOLD,14));
		fnameTextfield.setBounds(300, 190, 400, 30);
		add(fnameTextfield);
		
		JLabel dob=new JLabel("Date of Birth:");
		dob.setFont(new Font("Raleway",Font.BOLD,20));
		dob.setBounds(100,240,200,30);
		add(dob);
		
		datechooser=new JDateChooser();
		datechooser.setBounds(300, 240, 400, 30);
		datechooser.setFont(new Font("Raleway",Font.BOLD,14));
		datechooser.setForeground(new Color(105,105,105));
		add(datechooser);
		
		JLabel gender=new JLabel("Gender:");
		gender.setFont(new Font("Raleway",Font.BOLD,20));
		gender.setBounds(100,290,200,30);
		add(gender);
		
		male=new JRadioButton("Male");
		male.setBounds(300, 290, 60, 30);
		male.setBackground(Color.white);
		add(male);
		
		female=new JRadioButton("Female");
		female.setBounds(420, 290, 120, 30);
		female.setBackground(Color.white);
		add(female);
		
		other=new JRadioButton("Other");
		other.setBounds(540, 290, 120, 30);
		other.setBackground(Color.white);
		add(other);
		
		ButtonGroup gendergroup=new ButtonGroup();
		gendergroup.add(male);
		gendergroup.add(female);
		gendergroup.add(other);
		
		JLabel email=new JLabel("Email:");
		email.setFont(new Font("Raleway",Font.BOLD,20));
		email.setBounds(100,340,200,30);
		add(email);
		
		emailTextfield=new JTextField();
		emailTextfield.setFont(new Font("Raleway",Font.BOLD,14));
		emailTextfield.setBounds(300, 340, 400, 30);
		add(emailTextfield);
		
		JLabel marital=new JLabel("Marital Status:");
		marital.setFont(new Font("Raleway",Font.BOLD,20));
		marital.setBounds(100,390,200,30);
		add(marital);
		
		married=new JRadioButton("Married");
		married.setBounds(300, 390, 120, 30);
		married.setBackground(Color.white);
		add(married);
		
		unmarried=new JRadioButton("Unmarried");
		unmarried.setBounds(420, 390, 120, 30);
		unmarried.setBackground(Color.white);
		add(unmarried);
		
		other1=new JRadioButton("Other");
		other1.setBounds(540, 390, 120, 30);
		other1.setBackground(Color.white);
		add(other1);
		
		ButtonGroup maritalgroup=new ButtonGroup();
		maritalgroup.add(married);
		maritalgroup.add(unmarried);
		maritalgroup.add(other1);
		
		JLabel address=new JLabel("Address:");
		address.setFont(new Font("Raleway",Font.BOLD,20));
		address.setBounds(100,440,200,30);
		add(address);
		
		addressTextfield=new JTextField();
		addressTextfield.setFont(new Font("Raleway",Font.BOLD,14));
		addressTextfield.setBounds(300, 440, 400, 30);
		add(addressTextfield);
		
		JLabel city=new JLabel("City:");
		city.setFont(new Font("Raleway",Font.BOLD,20));
		city.setBounds(100,490,200,30);
		add(city);
		
		cityTextfield=new JTextField();
		cityTextfield.setFont(new Font("Raleway",Font.BOLD,14));
		cityTextfield.setBounds(300, 490, 400, 30);
		add(cityTextfield);
		
		JLabel state=new JLabel("State:");
		state.setFont(new Font("Raleway",Font.BOLD,20));
		state.setBounds(100,540,200,30);
		add(state);
		
		stateTextfield=new JTextField();
		stateTextfield.setFont(new Font("Raleway",Font.BOLD,14));
		stateTextfield.setBounds(300, 540, 400, 30);
		add(stateTextfield);
		
		JLabel pincode=new JLabel("Pin Code:");
		pincode.setFont(new Font("Raleway",Font.BOLD,20));
		pincode.setBounds(100,590,200,30);
		add(pincode);
		
		pinTextfield=new JTextField();
		pinTextfield.setFont(new Font("Raleway",Font.BOLD,14));
		pinTextfield.setBounds(300, 590, 400, 30);
		add(pinTextfield);
		
		JButton next=new JButton("Next");
		next.setBackground(Color.black);
		next.setForeground(Color.white);
		next.setFont(new Font("Raleway",Font.BOLD,14));
		next.setBounds(620, 660, 80, 30);
		next.addActionListener(this);
		add(next);
		
		getContentPane().setBackground(Color.white);
		
		setSize(850,800);
		setLocation(350,10);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String formno=""+random;
		String name=nameTextfield.getText();
		String fname=fnameTextfield.getText();
		String dob=((JTextField)datechooser.getDateEditor().getUiComponent()).getText();
		String gender=null;
		if(male.isSelected())
		{
			gender = "male";
		}
		else if(female.isSelected())
		{
			gender="female";
		}
		else if(other.isSelected())
		{
			gender="other";
		}
		String email=emailTextfield.getText();
		String marital=null;
		if(married.isSelected())
		{
			marital = "married";
		}
		else if(unmarried.isSelected())
		{
			marital="unmarried";
		}
		else if(other1.isSelected())
		{
			marital="other";
		}
		
		String address=addressTextfield.getText();
		String city=cityTextfield.getText();
		String state=stateTextfield.getText();
		String pin=pinTextfield.getText();
		
		try {
			if(name.equals(""))
			{
				JOptionPane.showMessageDialog(null, "Name is Required");
			}
			else if(fname.equals(""))
			{
				JOptionPane.showMessageDialog(null, "Father's Name is Required");
			}
			else if(dob.equals(""))
			{
				JOptionPane.showMessageDialog(null, "Date of Birth is Required");
			}
			else if(email.equals(""))
			{
				JOptionPane.showMessageDialog(null, "Email is Required");
			}
			else if(address.equals(""))
			{
				JOptionPane.showMessageDialog(null, "Address is Required");
			}
			else if(city.equals(""))
			{
				JOptionPane.showMessageDialog(null, "City is Required");
			}
			else if(state.equals(""))
			{
				JOptionPane.showMessageDialog(null, "State is Required");
			}
			else if(pin.equals(""))
			{
				JOptionPane.showMessageDialog(null, "Pincode is Required");
			}
			else {
				Conn c=new Conn();
				String query="insert into signupone values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+state+"','"+pin+"')";
				c.s.execute(query);
				
				setVisible(false);
				new SignUpTwo(formno).setVisible(true);
			}
			
		}catch(Exception e1) {
			e1.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new SignUpOne();

	}


}
