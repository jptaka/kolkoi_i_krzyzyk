import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class tictactoe_podstawa extends JFrame implements ActionListener{
	int kolejka=0;
	JButton przycisk;
	
	ImageIcon icon = new ImageIcon("C:\\Users\\tom\\Desktop\\O.png");
	ImageIcon krzyzyk = new ImageIcon("C:\\Users\\tom\\Desktop\\x.png");
	
	public tictactoe_podstawa() {
		setSize(800,800);
		setTitle("Kó³ko i krzy¿yk");
		setLayout(new GridLayout(3, 3));
		for(int i=1; i<=9;i++) {
			przycisk=new JButton();
			add(przycisk);
			przycisk.addActionListener(this);
			
		}
		
	}
	
	public static void main(String[]args)
	{
		tictactoe_podstawa ramka = new tictactoe_podstawa();
		ramka.setVisible(true);
		ramka.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		przycisk=(JButton) e.getSource();
		if(kolejka %2 == 0)
		{
			przycisk.setIcon(icon);
		}
		else
		{
			przycisk.setIcon(krzyzyk);
		}
		przycisk.setEnabled(false);
		kolejka++;
	}

}
