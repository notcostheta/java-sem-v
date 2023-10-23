/*
     <applet code="Slip12" width=400 height=400>
     </applet>
*/
import java.applet.*;
import java.awt.*;
public class Slip12 extends Applet
{
    public void paint(Graphics g)
    {
	// Oval
	g.setColor(Color.red);	
	g.drawOval(200 , 10, 50,80);
	g.setColor(Color.yellow);	
	g.fillOval(201 , 11, 49,79);

	//Rectangle
	g.setColor(Color.blue);	
	g.drawRect(100 , 100, 50,100);
	g.setColor(Color.cyan);	
	g.fillRect(101 , 101, 49,99);

	// line 
	g.setColor(Color.black);
	g.drawLine(0 , 220 , 100 , 220);

	// text
	g.setColor(Color.green);
	g.drawString("Welcome" , 100 ,250);
    }
}