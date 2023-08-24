import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;

public class SignUpTwo extends JFrame implements ActionListener{
	
	String formno;
	JTextField nameTextfield,fnameTextfield,emailTextfield,
	panTextfield,adharTextfield,stateTextfield,accTextfield;
	JButton next;
	JRadioButton syes,sno,syes1,sno1;
	JDateChooser datechooser;
	JComboBox religionv,categoryv,occupationv,educationv,incomev;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public SignUpTwo(String formno) {
		
		this.formno=formno;
		setLayout(null);
		
		setTitle("NEW ACCOUNT APPLICATION FORM-PAGE 2");
		
		
		JLabel additionalDetails=new JLabel("Page 2: Additional Details");
		additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
		additionalDetails.setBounds(290,80,400,30);
		add(additionalDetails);
		
		JLabel religion=new JLabel("Relegion:");
		religion.setFont(new Font("Raleway",Font.BOLD,20));
		religion.setBounds(100,140,100,30);
		add(religion);
		
		String valreligion[] = {"Hindu","Muslim","Sikh","Christian","Other"};
		religionv=new JComboBox(valreligion);
		religionv.setBounds(300, 140, 400, 30);
		religionv.setBackground(Color.white);
		add(religionv);
		
		JLabel category=new JLabel("Category:");
		category.setFont(new Font("Raleway",Font.BOLD,20));
		category.setBounds(100,190,200,30);
		add(category);
		
		String valcategory[] = {"General","OBC","SC","ST","Other"};
		categoryv=new JComboBox(valcategory);
		categoryv.setBounds(300, 190, 400, 30);
		categoryv.setBackground(Color.white);
		add(categoryv);
		
		JLabel income=new JLabel("Income:");
		income.setFont(new Font("Raleway",Font.BOLD,20));
		income.setBounds(100,240,200,30);
		add(income);
		
		String incomevalue[]= {"Null","<1,50,000","<2,50,000","<5,00,000","upto 10,00,000"};
		incomev=new JComboBox(incomevalue);
		incomev.setBounds(300, 240, 400, 30);
		incomev.setBackground(Color.white);
		add(incomev);
		
		
		JLabel education=new JLabel("Educational");
		education.setFont(new Font("Raleway",Font.BOLD,20));
		education.setBounds(100,290,200,30);
		add(education);
		
		String educationvalue[]= {"Non Graduation","Graduate","Post-Graduation","Doctrate","Others"};
		educationv=new JComboBox(educationvalue);
		educationv.setBounds(300, 315, 400, 30);
		educationv.setBackground(Color.white);
		add(educationv);
		
		
		JLabel qualification=new JLabel("Qulification:");
		qualification.setFont(new Font("Raleway",Font.BOLD,20));
		qualification.setBounds(100,315,200,30);
		add(qualification);
			
		JLabel occupation=new JLabel("Occupation:");
		occupation.setFont(new Font("Raleway",Font.BOLD,20));
		occupation.setBounds(100,390,200,30);
		add(occupation);
		
		String ocuupationvalue[]= {"Salaried","self-Employeed","Bussiness","Student","Retired","Others"};
		occupationv=new JComboBox(ocuupationvalue);
		occupationv.setBounds(300, 390, 400, 30);
		occupationv.setBackground(Color.white);
		add(occupationv);
		
		JLabel panno=new JLabel("PAN Number:");
		panno.setFont(new Font("Raleway",Font.BOLD,20));
		panno.setBounds(100,440,200,30);
		add(panno);
		
		panTextfield=new JTextField();
		panTextfield.setFont(new Font("Raleway",Font.BOLD,14));
		panTextfield.setBounds(300, 440, 400, 30);
		add(panTextfield);
		
		JLabel adharno=new JLabel("Adhar Number:");
		adharno.setFont(new Font("Raleway",Font.BOLD,20));
		adharno.setBounds(100,490,200,30);
		add(adharno);
		
		adharTextfield=new JTextField();
		adharTextfield.setFont(new Font("Raleway",Font.BOLD,14));
		adharTextfield.setBounds(300, 490, 400, 30);
		add(adharTextfield);
		
		JLabel scitizen=new JLabel("Senior Citizen:");
		scitizen.setFont(new Font("Raleway",Font.BOLD,20));
		scitizen.setBounds(100,540,200,30);
		add(scitizen);
		
		syes=new JRadioButton("YES");
		syes.setBounds(300, 540, 120, 30);
		syes.setBackground(Color.white);
		add(syes);
		
		sno=new JRadioButton("NO");
		sno.setBounds(420, 540, 120, 30);
		sno.setBackground(Color.white);
		add(sno);
		
		ButtonGroup scitizengroup=new ButtonGroup();
		scitizengroup.add(syes);
		scitizengroup.add(sno);
		
		
		JLabel existaccount=new JLabel("Existsting Account:");
		existaccount.setFont(new Font("Raleway",Font.BOLD,20));
		existaccount.setBounds(100,590,200,30);
		add(existaccount);
		
		syes1=new JRadioButton("YES");
		syes1.setBounds(300, 590, 120, 30);
		syes1.setBackground(Color.white);
		add(syes1);
		
		sno1=new JRadioButton("NO");
		sno1.setBounds(420, 590, 120, 30);
		sno1.setBackground(Color.white);
		add(sno1);
		
		ButtonGroup accountngroup=new ButtonGroup();
		accountngroup.add(syes1);
		accountngroup.add(sno1);
		
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

	@SuppressWarnings("unlikely-arg-type")
	@Override
	public void actionPerformed(ActionEvent e) {
		String sreligion=(String) religionv.getSelectedItem();
		String scategory=(String) categoryv.getSelectedItem();
		String sincome=(String) incomev.getSelectedItem();
		String seducation=(String) educationv.getSelectedItem();
		String soccupation=(String) occupationv.getSelectedItem();
		String scitizen=null;
		if(syes.isSelected())
		{
			scitizen = "YES";
		}
		else if(sno.isSelected())
		{
			scitizen="NO";
		}
		String account=null;
		if(syes1.isSelected())
		{
			account = "YES";
		}
		else if(sno1.isSelected())
		{
			account="NO";
		}
		String spanno=panTextfield.getText();
		String sadharno=adharTextfield.getText();
	
		try {
			if(religionv.equals(""))
			{
				JOptionPane.showMessageDialog(null, "Religion is Required");
			}
			else if(categoryv.equals(""))
			{
				JOptionPane.showMessageDialog(null, "Category is Required");
			}
			else if(incomev.equals(""))
			{
				JOptionPane.showMessageDialog(null, "Income is Required");
			}
			else if(educationv.equals(""))
			{
				JOptionPane.showMessageDialog(null, "Education is Required");
			}
			else if(occupationv.equals(""))
			{
				JOptionPane.showMessageDialog(null, "Occupation is Required");
			}
			else {
				Conn c=new Conn();
				String query="insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+scitizen+"','"+seducation+"','"+soccupation+"','"+account+"')";
				c.s.execute(query);
				
				//signup3 object
				setVisible(false);
				new SignUpThree(formno).setVisible(true);
			}
			
		}catch(Exception e1) {
			e1.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new SignUpTwo("");

	}


}
