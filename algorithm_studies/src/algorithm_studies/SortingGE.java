package algorithm_studies;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.text.ParseException;

import javax.swing.*;
import javax.swing.text.MaskFormatter;

public class SortingGE extends JFrame {
	
	private JPanel window,display,menu;
	private JFormattedTextField d1,d2,d3,d4,d5,d6,d7,d8,d9,d10;
	private JButton sortBtn,clearBtn;
	private int [] unsort,sort=new int[10];
	
	SortingGE()
	{
		window = new JPanel(new BorderLayout());
		display = new JPanel(new GridLayout(1,10));
		menu = new JPanel(new GridLayout(1,2));
		
		MaskFormatter m;
		try {
			m = new MaskFormatter("*");
			 m.setValidCharacters("0123456789");
			d1 = new JFormattedTextField(m);
			d2 = new JFormattedTextField(m);
			d3 = new JFormattedTextField(m);
			d4 = new JFormattedTextField(m);
			d5 = new JFormattedTextField(m);
			d6 = new JFormattedTextField(m);
			d7 = new JFormattedTextField(m);
			d8 = new JFormattedTextField(m);
			d9 = new JFormattedTextField(m);
			d10 = new JFormattedTextField(m);
		} catch (ParseException e) {
			e.printStackTrace();
		} 

		
		display.add(d1);
		display.add(d2);
		display.add(d3);
		display.add(d4);
		display.add(d5);
		display.add(d6);
		display.add(d7);
		display.add(d8);
		display.add(d9);
		display.add(d10);

		sortBtn = new JButton("Sortin'");
		clearBtn = new JButton("Clear up");
		
		sortBtn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				unsort[0]=Integer.valueOf(d1.getText());
				unsort[1]=Integer.valueOf(d2.getText());
				unsort[2]=Integer.valueOf(d3.getText());
				unsort[3]=Integer.valueOf(d4.getText());
				unsort[4]=Integer.valueOf(d5.getText());
				unsort[5]=Integer.valueOf(d6.getText());
				unsort[6]=Integer.valueOf(d7.getText());
				unsort[7]=Integer.valueOf(d8.getText());
				unsort[8]=Integer.valueOf(d9.getText());
				unsort[9]=Integer.valueOf(d10.getText());
				
				sort = new Method(unsort).BubbleSort();; 
				
				d1.setText(String.valueOf(sort[0]));
				d2.setText(String.valueOf(sort[1]));
				d3.setText(String.valueOf(sort[2]));
				d4.setText(String.valueOf(sort[3]));
				d5.setText(String.valueOf(sort[4]));
				d6.setText(String.valueOf(sort[5]));
				d7.setText(String.valueOf(sort[6]));
				d8.setText(String.valueOf(sort[7]));
				d9.setText(String.valueOf(sort[8]));
				d10.setText(String.valueOf(sort[9]));
				
			}

			
		});
		
		clearBtn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				unsort = null;
				sort =null;
				
				d1.setText("");
				d2.setText("");
				d3.setText("");
				d4.setText("");
				d5.setText("");
				d6.setText("");
				d7.setText("");
				d8.setText("");
				d9.setText("");
				d10.setText("");
				
				
			}
			
		});
		
		menu.add(sortBtn);
		menu.add(clearBtn);
		
		
		window.add(display,BorderLayout.NORTH);
		window.add(menu,BorderLayout.CENTER);
		
		
		this.setContentPane(window);
		this.setSize(300, 100);
		this.setVisible(true);
		
	}

	public static void main(String[] args) 
	{
		new SortingGE();
	}

}
