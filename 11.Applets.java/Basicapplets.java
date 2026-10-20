import java.applet.*;
import java.awt.*;
public class Basicapplets extends Applet{
    String str;
    public void init(){
        str=getParameter("pName");
    }
    public void paint(Graphics g){
        g.drawString(str, 100, 100);
    }    
}