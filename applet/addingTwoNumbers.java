import java.awt.*;
import java.awt.event.*;
import java.applet.*;

import javax.swing.border.Border;

  
/* 
<applet code="addingTwoNumbers" width=500 height=600> 
</applet> 
*/

public class addingTwoNumbers extends Applet implements ActionListener {
      
	TextField text1, text2;

	Button button;

	Label label1;  

 	public void actionPerformed(ActionEvent evt) {

		String str;

		int a, b, result;

              	if (evt.getSource() == button) {

			str = text1.getText();
          
			a = Integer.parseInt(str);
          
			str = text2.getText();
          
			b = Integer.parseInt(str);
          	
			result = a + b;
          
			str = String.valueOf(result);

			label1.setText(str);
		} 

               	repaint();
	}

	public void init() {

           	text1 = new TextField(10);
           
		text2 = new TextField(10);

		Border border = LineBorder.createGrayLineBorder();
           
		add(text1);
           
		add(text2);
           
		text1.setText("10");

		text1.setBounds(1000,100,50,50);
           
		text2.setText("20");

		text2.setBounds(10,10,50,50);

		button = new Button("Sum");
        
		button.setBounds(150,170,100,20);
        
		add(button);

		button.addActionListener(this);
	
		label1 = new Label("Result will be shown here:");  

		label1.setBorder(border);

		add(label1);
     	}

     	public void paint(Graphics g) {
          
		g.drawString("Please click the button to compute the sum",0,100);
     	}
}

