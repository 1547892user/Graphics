package practice;

import javax.swing.*;
import java.awt.*;

import practice.GraphicsDrawLine.MyPanel;

public class GraphicsFill extends JFrame{
	public GraphicsFill() {
		setTitle("Fill ��� ����");
		setContentPane(new MyPanel());
		
		setSize(400,400);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		//�ڵ带 �ۼ����ּ���
	}
	
	public static void main(String args[]) {
		new GraphicsFill();
	}
}
