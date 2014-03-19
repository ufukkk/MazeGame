package com.MazeGame;

import javax.swing.JFrame;


public class PencereCalistir {

	public static void main(String[] args) {
		JFrame pencere = new JFrame("Maze Game");//Maze Game isminde bi JFrame objesi(pencere) oluşturuyoruz
		Dortgenciz panel1=new Dortgenciz();	//yeni bir panel objesi oluşturuyoruz
		pencere.add(panel1);//penceremize panel ekliyoruz.
		pencere.addKeyListener(panel1);//panele Keylistener ekliyoruz.
		pencere.setSize(640, 480);//penceremizin boyutlarını ayarlıyoruz
		pencere.setVisible(true);//penceremizi görünür yapıyoruz

	}

}
