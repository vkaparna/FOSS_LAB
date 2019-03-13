import java.awt.*;
import java.awt.event.*;
import java.applet.*;

  
/* 
<applet code="HelloWorld" width=500 height=600> 
</applet> 
*/

public class HelloWorld extends Applet implements ActionListener {

    	String str;
  
    	int a,b,result;
      
	TextField t1, t2, t3;

	Button button;

 	public void actionPerformed(ActionEvent evt) {

              	if (evt.getSource() == button) {

			str=t1.getText();
          
			a=Integer.parseInt(str);
          
			str=t2.getText();
          
			b=Integer.parseInt(str);
          	
			result=a+b;
          
			str=String.valueOf(result);

			t3.setText(str);
		} 

               	repaint();
	}

	public void init() {

           	t1=new TextField(10);
           
		t2=new TextField(10);

		t3=new TextField(10);
           
		add(t1);
           
		add(t2);

		add(t3);
           
		t1.setText("10");
           
		t2.setText("20");

		t3.setText("30");

		button = new Button("Sum");
        
		button.setBounds(150,170,100,20);
        
		add(button);

		button.addActionListener(this);
     	}

     	public void paint(Graphics g) {
          
		str=t1.getText();
          
		a=Integer.parseInt(str);
          
		str=t2.getText();
          
		b=Integer.parseInt(str);
          	
		result=a+b;
          
		str=String.valueOf(result);
          
		g.drawString("Addition of both the field is :  "+str,0,100);
     	}
}

