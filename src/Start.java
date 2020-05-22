

//импорт библиотек
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Start extends JFrame
{
 int count = 0;//количество попыток входа
Start()
 {
 super("Вход"); //Название окна
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //действие при нажатии на крестик
 //Графические элементы
 JPanel panel0 = new JPanel();
 JTextField tf2 = new JTextField(16);
 JTextField tf3 = new JTextField(17);
 JButton btEnter = new JButton("Вход");
 JLabel timer = new JLabel();
 //дабовление элементов 
 panel0.add(new JLabel("Введите логин"));
 panel0.add(tf3);
 panel0.add(new JLabel("Введите пароль"));
 panel0.add(tf2);
 panel0.add(btEnter);
 panel0.add(timer);
 
 setContentPane(panel0);//настройка отображения
 setSize(350, 150);
 setVisible(true);
 
 
 //кнопка вход
 btEnter.addMouseListener(new MouseAdapter(){
	 public void mouseClicked(MouseEvent event) {
	if(tf3.getText().equals("login")) {// логин 
		 if (tf2.getText().equals("123")) { //пароль
			
			Calculator forms =new Calculator();//открытие калькулятора
			forms.setVisible(true); 
			setVisible(false);
		 }
		 else {//ход не выполнен
			 JOptionPane.showMessageDialog(null, "Вход НЕ выполнен");
			 count++;
			 if (count == 2) {
				 JOptionPane.showMessageDialog(null, "Пожалуйста проверьте данные ");//вход не выполнен второй раз
				 System.exit(EXIT_ON_CLOSE);
				 
			 }
		 }
 }else {//ход не выполнен
	 JOptionPane.showMessageDialog(null, "Вход НЕ выполнен");
	 count++;
	 if (count == 2) {
		 JOptionPane.showMessageDialog(null, "Пожалуйста проверьте данные ");//вход не выполнен второй раз
		 System.exit(EXIT_ON_CLOSE);
		 
	 }
 }
 }});
 

 }
public static void main(String[] args)
{
	 new Start();//запуск 
}
}