package dfs;
//импорт библиотек
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.applet.*;
import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.event.*;

import javax.swing.*;

public class Calculator extends JFrame {
	 double razre = 1036800;
	 double Format=0.05;
	 double Speed = 30;
	 double dayy= 1;
	 double camerss=1;
	 double  finalC= 0;
	 double help=0;
	 
	
	   private JButton razh = new JButton("Рассчитать");
	
	 JLabel label5 =new JLabel("");
	    private JLabel razr =new JLabel("Разрешение камеры:");
	    private JLabel format =new JLabel("Формат сжатия:");
	    private JLabel speed =new JLabel("Скорость записи :");
	    private JLabel days =new JLabel("Глубина архива(количество дней):");
	    private JLabel camers =new JLabel("Количество камер:");
	    String itemss[]= {// заполнение JComboBox (Кол-во камер) 
	    		"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
	   public JComboBox cams = new JComboBox(itemss);// заполнение JComboBox (кол-во дней)
	   String item1ss1[]= {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
	   public JComboBox dayss = new JComboBox(item1ss1);
	  
	    	String items[]= {//заполнение JComboBox (разрешение камер)
	    		"480p(720x480)",
	    		"720p(1080x720)",
	    		"1080p(1920x1080)"
	    	};
	    	public JComboBox razrbox =new JComboBox(items);
	   
	    			String items2[] ={// //заполнение JComboBox (формат сжатия)
	    		"MJPEG",
	    		"H.264"
	    				};
	    				public JComboBox formatbox =new JComboBox(items2);
	   
	    String items3[]= {////заполнение JComboBox (скорость записи)
	    		"30 Кадров в секунду",
	    		"25 Кадров в секунду",
	    		"20 Кадров в секунду"
	    };
	    public JComboBox speedbox = new JComboBox(items3);
	  
	
      

public static void main(String[] args) {
	Calculator app = new Calculator();
app.setVisible(true);
}



}