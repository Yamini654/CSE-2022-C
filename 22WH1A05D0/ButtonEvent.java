package Java22wh1a05d0;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

class MyButton extends Frame {
	Button b1,b2,b3;
	MyButton(){
		this.setLayout(null);
		b1=new Button("yellow");
		b2=new Button("pink");
		b3=new Button("blue");
		b1.setBounds(100,150,100,150);
		b2.setBounds(100,200,100,50);
		b3.setBounds(100,50,100,50);
		this.add(b1);
		this.add(b2);
		this.add(b3);
		/*b1.setBackground(Color.pink);
		b2.setBackground(Color.yellow);
		b3.setBackground(Color.blue);*/
		
	}
}
public class ButtonEvent {
	public static void main(String args[]) {
		MyButton f = new MyButton();
		f.setVisible(true);
		f.setSize(350,500);
		f.addWindowListener(new MyClass());
	}
}
class MyClass extends WindowAdapter {
	public void windowClosing(WindowEvent we) {
		System.exit(0);
		}
}

