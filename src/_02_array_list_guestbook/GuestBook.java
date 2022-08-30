package _02_array_list_guestbook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import _01_array_list_visualizer.data.ArrayList;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	ArrayList<String> names = new ArrayList<String>();

	JFrame jeff = new JFrame();
	JPanel jepp = new JPanel();
	JButton jeb1 = new JButton();
	JButton jeb2 = new JButton();
	int tally=1;
void run() {
	jeb1.addActionListener(this);
	jeb2.addActionListener(this);
	jeb1.setText("Choose a name");
	jeb2.setText("List the names");
	jepp.add(jeb1);
	jepp.add(jeb2);
	jeff.add(jepp);
	jeff.pack();
	jeff.setVisible(true);
	jeff.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==jeb1) {
		String input = JOptionPane.showInputDialog("Pick a name.");
		names.add("Guest #" + tally + " " + input);
		tally++;
	}
	else {
		for(int i=0; i<names.size();i++) {
			System.out.println(names.get(i));
		}
	}
}
}
