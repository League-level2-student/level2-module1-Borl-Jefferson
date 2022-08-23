package _01_array_list_visualizer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

import _01_array_list_visualizer.data.ArrayList;

public class VisualArrayLists implements ActionListener {
	Timer timer;
	JFrame jeff = new JFrame();
	int i;
	int tally=0;
	String search = "person";
	ArrayList<String> list = new ArrayList<String>();

	public void addThingsToList() {
		// 1. Add a bunch of items to our list (4 or 5 should be enough!)
		list.add("burger");
		list.add("taco");
		list.add("rat");
		list.add("app");
		list.add("bar");
		// 2. Set one item in our list to be something different
		list.set(3, "bat");
		// 3. Remove something from our list
		list.remove(2);
		// 4. Print the size of our list
		System.out.println(list.size());
		// 5. Check if our list contains a specific thing of your choice
		//	  and print whether it is in the list or not.
		for(i=0; i<list.size();i++) {
			if(list.get(i).contains(search)) {
			tally = 1;
			}
		}
		if(tally==0) {
			JOptionPane.showMessageDialog(null,"A " + search + " is not in the list.");
		}
		else {
			JOptionPane.showMessageDialog(null, "A " + search + " is n̶o̶t̶ in the list.");
		}
		
		// 6. Get a specific item from our list and print it out
		
		// 7. Clear our list of all items
		
		// 8. Print the size of our list again
	}
	
	
	/*
	 * ------------DON̶T̶ CHANGE ANYTHING BELOW THIS LINE-----------------------------------------
	 */
	public static void main(String[] args) {
		VisualArrayLists vcc = new VisualArrayLists();
		vcc.setup();
	}

	void setup() {
		timer = new Timer(1000 / 160, this);
		timer.start();
		jeff.setVisible(true);
		jeff.setTitle("LEAGUE ArrayList Visualizer");
		jeff.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jeff.add(list.displayPanel);
		jeff.pack();
		addThingsToList();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		list.draw();
	}
}
