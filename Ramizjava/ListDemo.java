import java.awt.*;
import java.applet.*;
/*
<applet code="ListDemo" width=300 height=180>
</applet>
*/
public class ListDemo extends Applet
{
 List os, browser;
 String msg = "";
 public void init()
 {
 os = new List(4, true);
 browser = new List(4, false);
 os.add("Windows 98/XP");
 os.add("Windows NT/2000");
 os.add("Solaris");
 os.add("MacOS");
 browser.add("Netscape 3.x");
 browser.add("Netscape 4.x");
 browser.add("Netscape 5.x");
 browser.add("Netscape 6.x");
 browser.add("Internet Explorer 4.0");
 browser.add("Internet Explorer 5.0");
 browser.add("Internet Explorer 6.0");
 browser.add("Lynx 2.4");
 browser.select(1);
 add(os);
 add(browser);
 }
 public void paint(Graphics g)
 {
 int idx[];
 msg = "Current OS: ";
 idx = os.getSelectedIndexes();
 for(int i=0; i<idx.length; i++)
 msg += os.getItem(idx[i]) + " ";
 g.drawString(msg, 6, 120);
 msg = "Current Browser: ";
 msg += browser.getSelectedItem();
 g.drawString(msg, 6, 140);
 }
// public ListDemo() {
// }
}