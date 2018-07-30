import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class tictactoe_v2 extends JFrame {
	int kolejka=0;
	JButton przycisk;
	
//	JLabel credits;
	
	Color NAVY = Color.decode( "#34485D" ); 
	Color RED = Color.decode("#660000");
	String Player_X = ("x");
	String Player_O = ("o");
	
	
	
	ImageIcon icon = new ImageIcon("C:\\Users\\tom\\Desktop\\O.png");
	ImageIcon krzyzyk = new ImageIcon("C:\\Users\\tom\\Desktop\\x.png");
	
	
	
	public tictactoe_v2() {
		setSize(800,800);
		setTitle("Kó³ko i krzy¿yk");
		setLayout(new GridLayout(3, 3));
//		credits = new JLabel("by gurtoc");
//		add(credits, BorderLayout.SOUTH);
		
		for(int i=1; i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				przycisk=new JButton();
				add(przycisk);
				przycisk.setBackground(NAVY);
				przycisk.setFont(new Font("Calibri", Font.BOLD, 130));
				DzialanieMyszka click = new DzialanieMyszka();
				przycisk.addMouseListener(click);
				przycisk.setEnabled(false);
//				przycisk.addActionListener(this);
				
				
			}
				
		}
			
			
					}	
		
		
	
	
	public static void main(String[]args)
	{
		tictactoe_v2 ramka = new tictactoe_v2();
		ramka.setVisible(true);
		ramka.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	

	
//	public void actionPerformed(ActionEvent e) {
//		przycisk=(JButton) e.getSource();
//		if(kolejka %2 == 0)
//		{
//			przycisk.setIcon(icon);
//		}
//		else
//		{
//			przycisk.setIcon(krzyzyk);
//		}
//		przycisk.setEnabled(false);
//		kolejka++;
//	}

	
	
	
	public class DzialanieMyszka implements  MouseListener {

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		przycisk=(JButton) e.getSource();
		przycisk.setBackground(Color.darkGray);
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		przycisk=(JButton) e.getSource();
		przycisk.setBackground(NAVY);
		
		
	}

	

	@Override
	public void mouseClicked(MouseEvent e) {
		przycisk=(JButton) e.getSource();
		if(kolejka %2 == 0)
		{
			przycisk.setText(Player_O);
		}
		else
		{
//			przycisk.setIcon(krzyzyk);
			przycisk.setText(Player_X);
		}
		przycisk.setEnabled(false);
		kolejka++;
		
	}
	}
	
}
