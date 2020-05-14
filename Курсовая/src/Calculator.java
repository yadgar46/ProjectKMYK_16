


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
	  
	
      
public Calculator() {
super("Calculator");
this.setBounds(600,300,520,400);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
speedbox.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt2) {
    	JComboBox3ActionPerformed(evt2);
    }
});
dayss.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt5) {
    	jComboBox4ActionPerformed(evt5);
    }
});
cams.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt6) {
    	jComboBox5ActionPerformed(evt6);
    }
});

razrbox.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
    	jComboBox2ActionPerformed(evt);
    }
});

formatbox.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt1) {
    	JComboBoxActionPerformed(evt1);
    }
});
razh.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
    }
});

Container panel = this.getContentPane();
GridLayout layout = new GridLayout(6, 0, 15, 30);
panel.setLayout(layout);
panel.setBackground(Color.getHSBColor(30,205,135));
panel.add(razr);
panel.add(razrbox);
panel.add(format);
panel.add(formatbox);
panel.add(speed);
panel.add(speedbox);
panel.add(days);
panel.add(dayss);
panel.add(camers);
panel.add(cams);
panel.add(razh);

panel.add(label5);
}


private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt5) {
	JComboBox box = (JComboBox)evt5.getSource();
	String itemss=(String)box.getSelectedItem();
		switch(itemss) {
		case("1"):
			dayy=1;
		break;
		case("2"):
			dayy=2;
		break;
		case("3"):
			dayy=3;
		break;
		case("4"):
			dayy=4;
		break;
		case("5"):
			dayy=5;
		break;
		case("6"):
			dayy=6;
		break;
		case("7"):
			dayy=7;
		break;
		case("8"):
			dayy=8;
		break;
		case("9"):
			dayy=9;
		break;
		case("10"):
			dayy=10;
		break;
		case("11"):
			dayy=11;
		break;
		case("12"):
			dayy=12;
		break;
		case("13"):
			dayy=13;
		break;
		case("14"):
			dayy=14;
		break;
		case("15"):
			dayy=15;
		break;
		case("16"):
			dayy=16;
		break;
		case("17"):
			dayy=17;
		break;
		case("18"):
			dayy=18;
		break;
		case("19"):
			dayy=19;
		break;
		case("20"):
			dayy=20;
		break;
		case("21"):
			dayy=21;
		break;
		case("22"):
			dayy=22;
		break;
		case("23"):
			dayy=23;
		break;
		case("24"):
			dayy=24;
		break;
		case("25"):
			dayy=25;
		break;
		case("26"):
			dayy=26;
		break;
		case("27"):
			dayy=27;
		break;
		case("28"):
			dayy=28;
		break;
		case("29"):
			dayy=29;
		break;
		case("30"):
			dayy=30;
		break;
		case("31"):
			dayy=31;
		break;
		}}
private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt6) {
	JComboBox box3 = (JComboBox)evt6.getSource();
	String item5=(String)box3.getSelectedItem();
		switch(item5) {
		case("1"):
			camerss=1;
		break;
		case("2"):
			camerss=2;
		break;
		case("3"):
			camerss=3;
		break;
		case("4"):
			camerss=4;
		break;
		case("5"):
			camerss=5;
		break;
		case("6"):
			camerss=6;
		break;
		case("7"):
			camerss=7;
		break;
		case("8"):
			camerss=8;
		break;
		case("9"):
			camerss=9;
		break;
		case("10"):
			camerss=10;
		break;
		case("11"):
			camerss=11;
		break;
		case("12"):
			camerss=12;
		break;
		case("13"):
			camerss=13;
		break;
		case("14"):
			camerss=14;
		break;
		case("15"):
			camerss=15;
		break;
		case("16"):
			camerss=16;
		break;
		case("17"):
			camerss=17;
		break;
		case("18"):
			camerss=18;
		break;
		case("19"):
			camerss=19;
		break;
		case("20"):
			camerss=20;
		break;
		case("21"):
			camerss=21;
		break;
		case("22"):
			camerss=22;
		break;
		case("23"):
			camerss=23;
		break;
		case("24"):
			camerss=24;
		break;
		case("25"):
			camerss=25;
		break;
		case("26"):
			camerss=26;
		break;
		case("27"):
			camerss=27;
		break;
		case("28"):
			camerss=28;
		break;
		case("29"):
			camerss=29;
		break;
		case("30"):
			camerss=30;
		break;
		}}
		



private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {
	JComboBox box = (JComboBox)evt.getSource();
    							String items = (String)box.getSelectedItem();
    							 switch (items) {
    					           case ("480p(720x480)"):
    					               razre = 1036800;
    					               break;
    					           case ("1080p(1920x1080)"):
    					        	   razre = 6220800;
    					               break;
    					           case ("720p(1080x720)"):
    					        	   razre = 2332800;
    					               break;
    					           
    					           default:
    					               break;
    					       }}



private void JComboBoxActionPerformed(java.awt.event.ActionEvent evt1) {
	
	JComboBox box1 = (JComboBox)evt1.getSource();
						String items2 =(String)box1.getSelectedItem();
							switch(items2) {
							case ("MJPEG"):
								Format = 0.05;
							break;
							case ("H.264"):
								Format= 0.02;
							break;
							}}
private void JComboBox3ActionPerformed(java.awt.event.ActionEvent evt2) {
	JComboBox box2 =(JComboBox)evt2.getSource();
		String items3= (String)box2.getSelectedItem();
				switch(items3) {
				case("30 Кадров в секунду"):
					Speed = 30;
				break;
				case("25 Кадров в секунду"):
					Speed=25;
				break;
				case("20 Кадров в секунду"):
					Speed=20;
				break;
				}}

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt7) {                                         
   help =((razre*Format*Speed*dayy)*camerss);
   finalC=help/1000000;
     label5.setText("Объем HDD:"+String.valueOf(finalC)+"тБайт");
} 

public static void main(String[] args) {
	Calculator app = new Calculator();
app.setVisible(true);
}



}