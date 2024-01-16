package swingUi;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class CharacterCount {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("글자/단어 길이 판독기");
		f.setSize(400,400);
		f.setLayout(null);
		
		JLabel lb1 = new JLabel("Characters: ");
		lb1.setBounds(50,50,100,20);  
		JLabel lb2 = new JLabel("Words: ");
		lb2.setBounds(50,80,100,20);  
		f.add(lb1);
		f.add(lb2);
		
		JTextArea ta = new JTextArea();
		ta.setBounds(50,110,300,200); 
		f.add(ta);
		
		JButton b = new JButton("click");
		b.setBounds(50,320,80,30);
		f.add(b);
		
		JButton pad = new JButton("Pad Color");
		pad.setBounds(140,320,110,30);
		f.add(pad);
		
		JButton t1 = new JButton("Text Color");
		t1.setBounds(260,320,110,30);
		f.add(t1);
		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String t1 = ta.getText();
				lb1.setText("Characters: "+t1.length());
				String words[] =t1.split("\\s");
				lb2.setText("Words: "+words.length);	
			}
		});
		
		pad.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				ta.setBackground(Color.DARK_GRAY);
			}
		});
		
		t1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ta.setForeground(Color.white);
				
			}
		});
		f.setVisible(true);
	}
}
