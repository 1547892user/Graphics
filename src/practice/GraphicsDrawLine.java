package practice;
import javax.swing.*;
import java.awt.*;

public class GraphicsDrawLine extends JFrame {
	public GraphicsDrawLine() {
		setTitle("drawLine ��� ����");
		setContentPane(new MyPanel());
		
		setSize(250,250);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		//�ڵ带 �ۼ����ּ���
	}
	
	public static void main(String args[]) {
		new GraphicsDrawLine();
	}
	
}
