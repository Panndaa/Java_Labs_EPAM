import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GUI {
	public static JFrame frame,frameError;
	public static JButton CheckButton;
	public static JTextField side1,side2,side3;
	public static JLabel text1, text2, text3, answer1, answer2, answer3, isosceles, equilateral, rectangular, error,bsuir;

	public static void main (String[] args) {
		frame= new JFrame ("Laba 1. Variant 4");
		frameError= new JFrame ("Ошибка");
	 	side1 = new JTextField();
	 	side2 = new JTextField();
	 	side3 = new JTextField();
	 	CheckButton = new JButton("Проверить");
	 	text1 =new JLabel("Сторона 1");
	 	text2 =new JLabel("Сторона 2");
	 	text3 =new JLabel("Сторона 3");
		answer1=new JLabel();
		answer2=new JLabel();
		answer3=new JLabel();
		error=new JLabel("Вы ввели неправильные данные, введите заново");
		isosceles =new JLabel("Равнобедренный:");
		equilateral =new JLabel("Равносторонний:");
		rectangular=new JLabel("Прямоугольный:");
		bsuir=new JLabel("БГУИР знание и стиль жизни");
		frame.setLayout(null);
	
		frame.setSize(400,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameError.setSize(320,100);
		frameError.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frameError.setLocationRelativeTo(null);
		
		frame.add(text1);
		frame.add(text2);
		frame.add(text3);
		frame.add(side1);
		frame.add(side2);
		frame.add(side3);
		frame.add(isosceles);
		frame.add(equilateral);
		frame.add(rectangular);
		frame.add(CheckButton);
		frame.add(answer1);
		frame.add(answer2);
		frame.add(answer3);
		frameError.add(error);
		frame.add(bsuir);
		text1.setBounds(10,3,60,30);
		text2.setBounds(10,23,60,30);
		text3.setBounds(10,43,60,30);
		side1.setBounds(78,11,250,19);
		side2.setBounds(78,31,250,19);
		side3.setBounds(78,50,250,19);
		isosceles.setBounds(10,81,150,30);
		equilateral.setBounds(10,99,150,30);
		rectangular.setBounds(10,117,150,30);
		CheckButton.setBounds(250,120,100,20);
		answer1.setBounds(170, 81, 60, 30);
		answer2.setBounds(170, 99, 60, 30);
		answer3.setBounds(170, 117, 60, 30);
		bsuir.setBounds(190,110,60,30);

		CheckButton.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
        	  try {calculating(); 
        	  }
        	  catch(Exception except) {
        		  frameError.setVisible(true);
        	  }
          }
		});
	 
		frame.setVisible(true);
	
	 
	}
	public static void calculating()
	 {
		 float sideF=Float.parseFloat(side1.getText()); 
		 float sideS=Float.parseFloat(side2.getText());
		 float sideT=Float.parseFloat(side3.getText());
		 
		 float max,cat1,cat2;
		 
		 if ((sideF+sideS)>sideT&&(sideF+sideT)>sideS&&(sideS+sideT)>sideF) {
		 	
		 	if (sideF==sideT || sideT==sideS ||sideF==sideS)
		 		answer1.setText("Да");
		 	else 
			 	answer1.setText("Нет");
		 	
		 	if (sideF==sideT && sideT==sideS)
		 		answer2.setText("Да");
		 	else 
		 		answer2.setText("Нет");
		 	
		 	if (sideF>sideS) {
		 		max=sideF;
		 		cat1=sideS;
		 		}
		 	else {
		 		max=sideS;
		 		cat1=sideF;
		 		}
		 	if (sideT>max) {
		 		max=sideT;
		 		cat1=sideS;
		 		cat2=sideF;
		 		}
		 	else
		 		cat2=sideT;
		 		
		 	if ( Math.pow(max,2)==Math.pow(cat1,2)+Math.pow(cat2,2)) 
		 		answer3.setText("Да");
		 	else 
		 		answer3.setText("Нет");
		 }
		 else 
			frameError.setVisible(true);
	 } 
}
