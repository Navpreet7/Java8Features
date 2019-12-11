package main.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

interface Drawable {
	String draw();
}

public class LambdaExpression {
	public static void main(String[] args) {
		//simple example
		Drawable d = () -> {
			return "abc";
		};
		System.out.println(d.draw());
		// thread example without lambda expression
		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("thread is running");
			}
		};
		//thread example with lambda expression
		Thread t1 = new Thread(r1);
		t1.start();

		Runnable r2 = () -> {
			System.out.println("thread 2 is running");
		};
		Thread t2 = new Thread(r2);
		t2.start();

		//comparator using lambda expression
		List<String> list = new ArrayList<String>();
		list.add("NAV");
		list.add("tarun");
		list.add("talha");
		list.add("himanshu");

		Collections.sort(list, (p1, p2) -> {
			return p1.compareToIgnoreCase(p2);
		});

		System.out.println(list.toString());

		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String p1, String p2) {
				// TODO Auto-generated method stub
				return p1.compareTo(p2);
			}
		});
		System.out.println(list.toString());
		//event listener using lambda expression
		JTextField tf = new JTextField();
		tf.setBounds(50, 50, 150, 20);
		JButton b = new JButton("click");
		b.setBounds(80, 100, 70, 30);

		b.addActionListener(e -> {
			tf.setText("hello babay");
		});
		JFrame f = new JFrame();
		f.add(tf);
		f.add(b);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);
		f.setSize(300, 200);
		f.setVisible(true);
	}

}
