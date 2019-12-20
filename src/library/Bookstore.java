package library;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bookstore {

	public static String[] items = {
			"Element 1",
			"Element 2",
			"Element 3"
	};

	public static void main(String[] args) {
		JFrame frame = new JFrame("Book Store");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//Menu
		JMenu menu1,menu2,menu3, submenu;  
		JMenuItem item1, i1, i2, i3, i4, i5;      
		JMenuBar mb=new JMenuBar();  
		menu1=new JMenu("Меню");  
		menu2=new JMenu("Справка");
		submenu=new JMenu("Библиотека");
		item1 = new JMenuItem("Главная");
		i1=new JMenuItem("О Проекте");  
		i2=new JMenuItem("Об авторе");    
		i4=new JMenuItem("Книги");  
		i5=new JMenuItem("Журналы");  
		menu2.add(i1); menu2.add(i2);
		submenu.add(i4); submenu.add(i5);  
		menu1.add(submenu);
		menu1.add(item1);
		mb.add(menu1); 
		mb.add(menu2);
		frame.setJMenuBar(mb);  
		//Menu End

		frame.setSize(900, 700);
		setNorth(frame);
		setWest(frame);
		setEast(frame);
		setCenter(frame);
		setSouth(frame);
		frame.setVisible(true);
		frame.pack();
		frame.setMinimumSize(frame.getSize());
	}

	public static void setNorth(JFrame fr) {
		JPanel myPanel1 = new JPanel();
		JLabel welcomeLabel = new JLabel("Добро пожаловать в Book Store");
		myPanel1.add(welcomeLabel);
		fr.add(myPanel1, BorderLayout.NORTH);
	}
	public static void setWest(JFrame fr) {
		ButtonGroup myGroup = new ButtonGroup();
		JPanel myPanel2 = new JPanel();
		ArrayList<JCheckBox> masRB = new ArrayList<JCheckBox>();
		myPanel2.setLayout(new GridLayout(9, 1));
		for (int i = 0; i< 9; i++) {
			int ir = i + 1;
			masRB.add(new JCheckBox("Âûáîð"+ ir)); 
			myGroup.add(masRB.get(i));
			myPanel2.add(masRB.get(i));
		}
		masRB.get(0).setSelected(true);
		fr.add(myPanel2, BorderLayout.WEST);
	}
	public static void setCenter(JFrame fr) {
		fr.setPreferredSize(new Dimension(600, 500));
		JPanel myPanel3 = new JPanel();
		myPanel3.setLayout(new FlowLayout());
		myPanel3.add(new JComboBox(items));
		myPanel3.add(new JSpinner());
		myPanel3.add(new JRadioButton ("Ðàäèîêíîïêà 1"));
		myPanel3.add(new JRadioButton ("Ðàäèîêíîïêà 2"));
		fr.add(myPanel3, FlowLayout.CENTER);

	}

	public static void setEast(JFrame fr) {
		JPanel imgPanel = new JPanel();
		JButton review = new JButton("Сохранить отзыв.");
		review.setBorderPainted(false);

		review.setFocusPainted(false);
		//review.setContentAreaFilled(false);
		imgPanel.setPreferredSize(new Dimension(140,180));
		imgPanel.setBackground(Color.CYAN);
		review.setBackground(new Color(0xb39ddb));
		review.addActionListener(new ActionListener() {
			 @Override
			    public void actionPerformed(ActionEvent e) {
				 String st = "     Спасибо!\n     Ваш отзыв отправлен!";
				 JOptionPane.showMessageDialog(null, st);
			    }
		});
		JPanel myPanel4 = new JPanel();
		myPanel4.setPreferredSize(new Dimension(150,100));
		JTextArea myText = new JTextArea("Оставьте отзыв!",8,12);
		myText.setBorder(BorderFactory.createCompoundBorder(
				myText.getBorder(), 
				BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		myPanel4.add(imgPanel);
		myPanel4.add(myText);
		myPanel4.add(review);
		myPanel4.setBackground(new Color(0xb9f6ca));
		//myPanel4.setBackground(new Color(0xbbdefb));


		fr.add(myPanel4, BorderLayout.EAST);
	}
	public static void setSouth(JFrame fr) {
		JPanel myPanel5 = new JPanel();
		myPanel5.add(new JSlider());
		myPanel5.setLayout(new FlowLayout());
		Component horizontalStrut =
				Box.createHorizontalStrut(100); myPanel5.add(horizontalStrut); fr.add(myPanel5, BorderLayout.SOUTH);
	}


}

