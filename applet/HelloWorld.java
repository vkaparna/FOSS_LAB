import java.applet.Applet; 
import java.awt.Graphics; 
  
/* 
<applet code="HelloWorld" width=500 height=600> 
</applet> 
*/

public class HelloWorld extends Applet { 

    	public void paint(Graphics g) { 

        	g.drawString("Hello World", 20, 20); 
    	} 
} 

