package com.MazeGame;

import java.awt.Color;					//
import java.awt.GradientPaint;			//
import java.awt.Graphics;				//
import java.awt.event.KeyEvent;			// bazı method ve classları projemize dahil ediyoruz
import java.awt.event.KeyListener;		//
import javax.swing.JPanel;				//


public class Dortgenciz extends JPanel implements KeyListener  {
	
	DortgenKontrol a;// ana karemiz
	DortgenKontrol[] digerleri; //kare array imiz
	int adim = 10;//tuşa tek basışta kaç piksel hareket edecek
	int kenar=20;//karemizin bir kenarı
	int elemansayisi=374;//penceredeki kare sayımız
	public Dortgenciz(){//constructor
		super();
		addKeyListener(this);// klavye girişlerini uygulamamıza yarar
		//Buradan sonra dörtgenlerimizi tanımlıyoruz. ilk başta olmadı ama karelerimiz döngü ilede çizdirebiliriz.
		a = new DortgenKontrol(0,9*kenar,kenar,kenar);
		digerleri = new DortgenKontrol[374];
		for(int i=0; i<31; i++)
		{
			digerleri[i]=new DortgenKontrol((i*kenar),0,kenar,kenar);
		}
		int j=1;
		for(int i=31; i<39; i++)
		{
			digerleri[i]=new DortgenKontrol(0,(j*kenar),kenar,kenar);
			j++;
		}
		j=10;
		for(int i=39; i<51; i++)
		{
			digerleri[i]=new DortgenKontrol(0,(j*kenar),kenar,kenar);
			j++;
		}
		int k =1;
		for(int i=51; i<81; i++)
		{
			digerleri[i]=new DortgenKontrol((k*kenar),420,kenar,kenar);
			k++;
		}
		j=0;
		for(int i=81; i<95; i++)
		{
			digerleri[i]=new DortgenKontrol(600,(j*kenar),kenar,kenar);
			j++;
		}
		j=15;
		for(int i=95; i<101; i++)
		{
			digerleri[i]=new DortgenKontrol(600,(j*kenar),kenar,kenar);
			j++;
		}
		digerleri[101]=new DortgenKontrol((4*kenar),kenar,kenar,kenar);
		digerleri[102]=new DortgenKontrol((10*kenar),kenar,kenar,kenar);
		digerleri[103]=new DortgenKontrol((16*kenar),kenar,kenar,kenar);
		digerleri[104]=new DortgenKontrol((18*kenar),kenar,kenar,kenar);
		digerleri[105]=new DortgenKontrol((2*kenar),(2*kenar),kenar,kenar);
		digerleri[106]=new DortgenKontrol((2*kenar),(3*kenar),kenar,kenar);
		digerleri[107]=new DortgenKontrol((4*kenar),(2*kenar),kenar,kenar);
		digerleri[108]=new DortgenKontrol((4*kenar),(3*kenar),kenar,kenar);
		int a=2;
		for(int i=109; i<116; i++)
		{
			digerleri[i]=new DortgenKontrol((a*kenar),(4*kenar),kenar,kenar);
			a++;
		}
		digerleri[116]=new DortgenKontrol((6*kenar),(2*kenar),kenar,kenar);
		digerleri[117]=new DortgenKontrol((7*kenar),(2*kenar),kenar,kenar);
		digerleri[118]=new DortgenKontrol((8*kenar),(2*kenar),kenar,kenar);
		digerleri[119]=new DortgenKontrol((8*kenar),(3*kenar),kenar,kenar);
		digerleri[120]=new DortgenKontrol((10*kenar),(2*kenar),kenar,kenar);
		digerleri[121]=new DortgenKontrol((11*kenar),(2*kenar),kenar,kenar);
		digerleri[122]=new DortgenKontrol((12*kenar),(2*kenar),kenar,kenar);
		digerleri[123]=new DortgenKontrol((13*kenar),(2*kenar),kenar,kenar);
		digerleri[124]=new DortgenKontrol((14*kenar),(2*kenar),kenar,kenar);
		digerleri[125]=new DortgenKontrol((14*kenar),(3*kenar),kenar,kenar);
		digerleri[126]=new DortgenKontrol((12*kenar),(4*kenar),kenar,kenar);
		digerleri[127]=new DortgenKontrol((13*kenar),(4*kenar),kenar,kenar);
		digerleri[128]=new DortgenKontrol((14*kenar),(4*kenar),kenar,kenar);
		digerleri[129]=new DortgenKontrol((16*kenar),(1*kenar),kenar,kenar);
		digerleri[130]=new DortgenKontrol((16*kenar),(2*kenar),kenar,kenar);
		digerleri[131]=new DortgenKontrol((16*kenar),(3*kenar),kenar,kenar);
		digerleri[132]=new DortgenKontrol((16*kenar),(4*kenar),kenar,kenar);
		digerleri[133]=new DortgenKontrol((16*kenar),(5*kenar),kenar,kenar);
		digerleri[134]=new DortgenKontrol((16*kenar),(6*kenar),kenar,kenar);
		digerleri[135]=new DortgenKontrol((12*kenar),(6*kenar),kenar,kenar);
		digerleri[136]=new DortgenKontrol((13*kenar),(6*kenar),kenar,kenar);
		digerleri[137]=new DortgenKontrol((14*kenar),(6*kenar),kenar,kenar);
		digerleri[138]=new DortgenKontrol((15*kenar),(6*kenar),kenar,kenar);
		digerleri[139]=new DortgenKontrol((12*kenar),(7*kenar),kenar,kenar);
		digerleri[140]=new DortgenKontrol((12*kenar),(8*kenar),kenar,kenar);
		digerleri[141]=new DortgenKontrol((12*kenar),(9*kenar),kenar,kenar);
		digerleri[142]=new DortgenKontrol((12*kenar),(10*kenar),kenar,kenar);
		digerleri[143]=new DortgenKontrol((2*kenar),(6*kenar),kenar,kenar);
		digerleri[144]=new DortgenKontrol((3*kenar),(6*kenar),kenar,kenar);
		digerleri[145]=new DortgenKontrol((4*kenar),(6*kenar),kenar,kenar);
		digerleri[146]=new DortgenKontrol((2*kenar),(7*kenar),kenar,kenar);
		digerleri[147]=new DortgenKontrol((2*kenar),(8*kenar),kenar,kenar);
		digerleri[148]=new DortgenKontrol((3*kenar),(8*kenar),kenar,kenar);
		digerleri[149]=new DortgenKontrol((4*kenar),(8*kenar),kenar,kenar);
		digerleri[150]=new DortgenKontrol((5*kenar),(8*kenar),kenar,kenar);
		digerleri[151]=new DortgenKontrol((6*kenar),(8*kenar),kenar,kenar);
		digerleri[152]=new DortgenKontrol((6*kenar),(7*kenar),kenar,kenar);
		digerleri[153]=new DortgenKontrol((6*kenar),(6*kenar),kenar,kenar);
		digerleri[154]=new DortgenKontrol((7*kenar),(6*kenar),kenar,kenar);
		digerleri[155]=new DortgenKontrol((8*kenar),(6*kenar),kenar,kenar);
		digerleri[156]=new DortgenKontrol((9*kenar),(6*kenar),kenar,kenar);
		digerleri[157]=new DortgenKontrol((10*kenar),(4*kenar),kenar,kenar);
		digerleri[158]=new DortgenKontrol((10*kenar),(5*kenar),kenar,kenar);
		digerleri[159]=new DortgenKontrol((10*kenar),(6*kenar),kenar,kenar);
		digerleri[160]=new DortgenKontrol((10*kenar),(7*kenar),kenar,kenar);
		digerleri[161]=new DortgenKontrol((10*kenar),(8*kenar),kenar,kenar);
		digerleri[162]=new DortgenKontrol((10*kenar),(9*kenar),kenar,kenar);
		digerleri[163]=new DortgenKontrol((10*kenar),(10*kenar),kenar,kenar);
		digerleri[164]=new DortgenKontrol((10*kenar),(11*kenar),kenar,kenar);
		digerleri[165]=new DortgenKontrol((10*kenar),(12*kenar),kenar,kenar);
		digerleri[166]=new DortgenKontrol((11*kenar),(12*kenar),kenar,kenar);
		digerleri[167]=new DortgenKontrol((12*kenar),(12*kenar),kenar,kenar);
		digerleri[168]=new DortgenKontrol((13*kenar),(12*kenar),kenar,kenar);
		digerleri[169]=new DortgenKontrol((14*kenar),(12*kenar),kenar,kenar);
		digerleri[170]=new DortgenKontrol((1*kenar),(10*kenar),kenar,kenar);
		digerleri[171]=new DortgenKontrol((2*kenar),(10*kenar),kenar,kenar);
		digerleri[172]=new DortgenKontrol((3*kenar),(10*kenar),kenar,kenar);
		digerleri[173]=new DortgenKontrol((4*kenar),(10*kenar),kenar,kenar);
		digerleri[174]=new DortgenKontrol((6*kenar),(9*kenar),kenar,kenar);
		digerleri[175]=new DortgenKontrol((6*kenar),(10*kenar),kenar,kenar);
		digerleri[176]=new DortgenKontrol((6*kenar),(11*kenar),kenar,kenar);
		digerleri[177]=new DortgenKontrol((2*kenar),(12*kenar),kenar,kenar);
		digerleri[178]=new DortgenKontrol((3*kenar),(12*kenar),kenar,kenar);
		digerleri[179]=new DortgenKontrol((4*kenar),(12*kenar),kenar,kenar);
		digerleri[180]=new DortgenKontrol((5*kenar),(12*kenar),kenar,kenar);
		digerleri[181]=new DortgenKontrol((6*kenar),(12*kenar),kenar,kenar);
		digerleri[182]=new DortgenKontrol((7*kenar),(12*kenar),kenar,kenar);
		digerleri[183]=new DortgenKontrol((8*kenar),(8*kenar),kenar,kenar);
		digerleri[184]=new DortgenKontrol((8*kenar),(9*kenar),kenar,kenar);
		digerleri[185]=new DortgenKontrol((8*kenar),(10*kenar),kenar,kenar);
		digerleri[186]=new DortgenKontrol((8*kenar),(11*kenar),kenar,kenar);
		digerleri[187]=new DortgenKontrol((8*kenar),(12*kenar),kenar,kenar);
		digerleri[188]=new DortgenKontrol((8*kenar),(14*kenar),kenar,kenar);
		digerleri[189]=new DortgenKontrol((8*kenar),(15*kenar),kenar,kenar);
		digerleri[190]=new DortgenKontrol((14*kenar),(8*kenar),kenar,kenar);
		digerleri[191]=new DortgenKontrol((14*kenar),(9*kenar),kenar,kenar);
		digerleri[192]=new DortgenKontrol((14*kenar),(10*kenar),kenar,kenar);
		digerleri[193]=new DortgenKontrol((14*kenar),(11*kenar),kenar,kenar);
		digerleri[194]=new DortgenKontrol((15*kenar),(8*kenar),kenar,kenar);
		digerleri[195]=new DortgenKontrol((16*kenar),(8*kenar),kenar,kenar);
		digerleri[196]=new DortgenKontrol((16*kenar),(9*kenar),kenar,kenar);
		digerleri[197]=new DortgenKontrol((16*kenar),(10*kenar),kenar,kenar);
		digerleri[198]=new DortgenKontrol((16*kenar),(11*kenar),kenar,kenar);
		digerleri[199]=new DortgenKontrol((16*kenar),(12*kenar),kenar,kenar);
		digerleri[200]=new DortgenKontrol((16*kenar),(13*kenar),kenar,kenar);
		digerleri[201]=new DortgenKontrol((16*kenar),(14*kenar),kenar,kenar);
		digerleri[202]=new DortgenKontrol((16*kenar),(15*kenar),kenar,kenar);
		digerleri[203]=new DortgenKontrol((18*kenar),(2*kenar),kenar,kenar);
		digerleri[204]=new DortgenKontrol((18*kenar),(3*kenar),kenar,kenar);
		digerleri[205]=new DortgenKontrol((18*kenar),(5*kenar),kenar,kenar);
		digerleri[206]=new DortgenKontrol((18*kenar),(6*kenar),kenar,kenar);
		digerleri[207]=new DortgenKontrol((18*kenar),(7*kenar),kenar,kenar);
		digerleri[208]=new DortgenKontrol((18*kenar),(8*kenar),kenar,kenar);
		digerleri[209]=new DortgenKontrol((18*kenar),(9*kenar),kenar,kenar);
		digerleri[210]=new DortgenKontrol((18*kenar),(10*kenar),kenar,kenar);
		digerleri[211]=new DortgenKontrol((18*kenar),(11*kenar),kenar,kenar);
		digerleri[212]=new DortgenKontrol((18*kenar),(12*kenar),kenar,kenar);
		digerleri[213]=new DortgenKontrol((18*kenar),(13*kenar),kenar,kenar);
		digerleri[214]=new DortgenKontrol((18*kenar),(14*kenar),kenar,kenar);
		digerleri[215]=new DortgenKontrol((19*kenar),(12*kenar),kenar,kenar);
		digerleri[216]=new DortgenKontrol((1*kenar),(16*kenar),kenar,kenar);
		digerleri[217]=new DortgenKontrol((2*kenar),(16*kenar),kenar,kenar);
		digerleri[218]=new DortgenKontrol((4*kenar),(16*kenar),kenar,kenar);
		digerleri[219]=new DortgenKontrol((5*kenar),(16*kenar),kenar,kenar);
		digerleri[220]=new DortgenKontrol((6*kenar),(16*kenar),kenar,kenar);
		digerleri[221]=new DortgenKontrol((7*kenar),(16*kenar),kenar,kenar);
		digerleri[222]=new DortgenKontrol((8*kenar),(16*kenar),kenar,kenar);
		digerleri[223]=new DortgenKontrol((9*kenar),(16*kenar),kenar,kenar);
		digerleri[224]=new DortgenKontrol((11*kenar),(16*kenar),kenar,kenar);
		digerleri[225]=new DortgenKontrol((12*kenar),(16*kenar),kenar,kenar);
		digerleri[226]=new DortgenKontrol((13*kenar),(16*kenar),kenar,kenar);
		digerleri[227]=new DortgenKontrol((15*kenar),(16*kenar),kenar,kenar);
		digerleri[228]=new DortgenKontrol((16*kenar),(16*kenar),kenar,kenar);
		digerleri[229]=new DortgenKontrol((18*kenar),(16*kenar),kenar,kenar);
		digerleri[230]=new DortgenKontrol((19*kenar),(16*kenar),kenar,kenar);
		digerleri[231]=new DortgenKontrol((20*kenar),(16*kenar),kenar,kenar);
		digerleri[232]=new DortgenKontrol((20*kenar),(1*kenar),kenar,kenar);
		digerleri[233]=new DortgenKontrol((20*kenar),(2*kenar),kenar,kenar);
		digerleri[234]=new DortgenKontrol((20*kenar),(3*kenar),kenar,kenar);
		digerleri[235]=new DortgenKontrol((20*kenar),(4*kenar),kenar,kenar);
		digerleri[236]=new DortgenKontrol((20*kenar),(5*kenar),kenar,kenar);
		digerleri[237]=new DortgenKontrol((20*kenar),(6*kenar),kenar,kenar);
		digerleri[238]=new DortgenKontrol((20*kenar),(7*kenar),kenar,kenar);
		digerleri[239]=new DortgenKontrol((20*kenar),(8*kenar),kenar,kenar);
		digerleri[240]=new DortgenKontrol((20*kenar),(9*kenar),kenar,kenar);
		digerleri[241]=new DortgenKontrol((20*kenar),(10*kenar),kenar,kenar);
		digerleri[242]=new DortgenKontrol((20*kenar),(12*kenar),kenar,kenar);
		digerleri[243]=new DortgenKontrol((20*kenar),(13*kenar),kenar,kenar);
		digerleri[244]=new DortgenKontrol((20*kenar),(14*kenar),kenar,kenar);
		digerleri[245]=new DortgenKontrol((20*kenar),(15*kenar),kenar,kenar);
		digerleri[246]=new DortgenKontrol((20*kenar),(16*kenar),kenar,kenar);
		digerleri[247]=new DortgenKontrol((2*kenar),(14*kenar),kenar,kenar);
		digerleri[248]=new DortgenKontrol((3*kenar),(14*kenar),kenar,kenar);
		digerleri[249]=new DortgenKontrol((4*kenar),(14*kenar),kenar,kenar);
		digerleri[250]=new DortgenKontrol((5*kenar),(14*kenar),kenar,kenar);
		digerleri[251]=new DortgenKontrol((6*kenar),(14*kenar),kenar,kenar);
		digerleri[252]=new DortgenKontrol((7*kenar),(14*kenar),kenar,kenar);
		digerleri[253]=new DortgenKontrol((10*kenar),(14*kenar),kenar,kenar);
		digerleri[254]=new DortgenKontrol((11*kenar),(14*kenar),kenar,kenar);
		digerleri[255]=new DortgenKontrol((12*kenar),(14*kenar),kenar,kenar);
		digerleri[256]=new DortgenKontrol((13*kenar),(14*kenar),kenar,kenar);
		digerleri[257]=new DortgenKontrol((14*kenar),(14*kenar),kenar,kenar);
		digerleri[258]=new DortgenKontrol((15*kenar),(14*kenar),kenar,kenar);
		digerleri[259]=new DortgenKontrol((22*kenar),(1*kenar),kenar,kenar);
		digerleri[260]=new DortgenKontrol((22*kenar),(2*kenar),kenar,kenar); 
		digerleri[261]=new DortgenKontrol((22*kenar),(4*kenar),kenar,kenar);
		digerleri[262]=new DortgenKontrol((22*kenar),(5*kenar),kenar,kenar);
		digerleri[263]=new DortgenKontrol((22*kenar),(6*kenar),kenar,kenar);
		digerleri[264]=new DortgenKontrol((1*kenar),(20*kenar),kenar,kenar);
		digerleri[265]=new DortgenKontrol((2*kenar),(20*kenar),kenar,kenar);
		digerleri[266]=new DortgenKontrol((2*kenar),(18*kenar),kenar,kenar);
		digerleri[267]=new DortgenKontrol((3*kenar),(18*kenar),kenar,kenar);
		digerleri[268]=new DortgenKontrol((4*kenar),(18*kenar),kenar,kenar);
		digerleri[269]=new DortgenKontrol((4*kenar),(19*kenar),kenar,kenar);
		digerleri[270]=new DortgenKontrol((4*kenar),(20*kenar),kenar,kenar);
		digerleri[271]=new DortgenKontrol((6*kenar),(17*kenar),kenar,kenar);
		digerleri[272]=new DortgenKontrol((6*kenar),(18*kenar),kenar,kenar);
		digerleri[273]=new DortgenKontrol((6*kenar),(19*kenar),kenar,kenar);
		digerleri[274]=new DortgenKontrol((6*kenar),(20*kenar),kenar,kenar);
		digerleri[275]=new DortgenKontrol((7*kenar),(18*kenar),kenar,kenar);
		digerleri[276]=new DortgenKontrol((8*kenar),(18*kenar),kenar,kenar);
		digerleri[277]=new DortgenKontrol((9*kenar),(18*kenar),kenar,kenar);
		digerleri[278]=new DortgenKontrol((10*kenar),(18*kenar),kenar,kenar);
		digerleri[279]=new DortgenKontrol((11*kenar),(18*kenar),kenar,kenar);
		digerleri[280]=new DortgenKontrol((11*kenar),(17*kenar),kenar,kenar);
		digerleri[281]=new DortgenKontrol((13*kenar),(17*kenar),kenar,kenar);
		digerleri[282]=new DortgenKontrol((13*kenar),(18*kenar),kenar,kenar);
		digerleri[283]=new DortgenKontrol((13*kenar),(19*kenar),kenar,kenar);
		digerleri[284]=new DortgenKontrol((13*kenar),(20*kenar),kenar,kenar);
		digerleri[285]=new DortgenKontrol((8*kenar),(20*kenar),kenar,kenar);
		digerleri[286]=new DortgenKontrol((9*kenar),(20*kenar),kenar,kenar);
		digerleri[287]=new DortgenKontrol((10*kenar),(20*kenar),kenar,kenar);
		digerleri[288]=new DortgenKontrol((11*kenar),(20*kenar),kenar,kenar);
		digerleri[289]=new DortgenKontrol((12*kenar),(20*kenar),kenar,kenar);
		digerleri[290]=new DortgenKontrol((15*kenar),(17*kenar),kenar,kenar);
		digerleri[291]=new DortgenKontrol((15*kenar),(18*kenar),kenar,kenar);
		digerleri[292]=new DortgenKontrol((15*kenar),(19*kenar),kenar,kenar);
		digerleri[293]=new DortgenKontrol((15*kenar),(20*kenar),kenar,kenar);
		digerleri[294]=new DortgenKontrol((18*kenar),(17*kenar),kenar,kenar);
		digerleri[295]=new DortgenKontrol((18*kenar),(18*kenar),kenar,kenar);
		digerleri[296]=new DortgenKontrol((17*kenar),(18*kenar),kenar,kenar);
		digerleri[297]=new DortgenKontrol((17*kenar),(19*kenar),kenar,kenar);
		digerleri[298]=new DortgenKontrol((17*kenar),(20*kenar),kenar,kenar);
		digerleri[299]=new DortgenKontrol((19*kenar),(20*kenar),kenar,kenar);
		digerleri[300]=new DortgenKontrol((20*kenar),(20*kenar),kenar,kenar);
		digerleri[301]=new DortgenKontrol((21*kenar),(20*kenar),kenar,kenar);
		digerleri[302]=new DortgenKontrol((22*kenar),(20*kenar),kenar,kenar);
		digerleri[303]=new DortgenKontrol((24*kenar),(2*kenar),kenar,kenar);
		digerleri[304]=new DortgenKontrol((25*kenar),(2*kenar),kenar,kenar);
		digerleri[305]=new DortgenKontrol((26*kenar),(2*kenar),kenar,kenar);
		digerleri[306]=new DortgenKontrol((24*kenar),(3*kenar),kenar,kenar);
		digerleri[307]=new DortgenKontrol((23*kenar),(4*kenar),kenar,kenar);
		digerleri[308]=new DortgenKontrol((24*kenar),(4*kenar),kenar,kenar);
		digerleri[309]=new DortgenKontrol((28*kenar),(2*kenar),kenar,kenar);
		digerleri[310]=new DortgenKontrol((28*kenar),(3*kenar),kenar,kenar);
		digerleri[311]=new DortgenKontrol((26*kenar),(4*kenar),kenar,kenar);
		digerleri[312]=new DortgenKontrol((27*kenar),(4*kenar),kenar,kenar);
		digerleri[313]=new DortgenKontrol((28*kenar),(4*kenar),kenar,kenar);
		digerleri[314]=new DortgenKontrol((29*kenar),(4*kenar),kenar,kenar);
		digerleri[315]=new DortgenKontrol((26*kenar),(5*kenar),kenar,kenar);
		digerleri[316]=new DortgenKontrol((23*kenar),(6*kenar),kenar,kenar);
		digerleri[317]=new DortgenKontrol((24*kenar),(6*kenar),kenar,kenar);
		digerleri[318]=new DortgenKontrol((25*kenar),(6*kenar),kenar,kenar);
		digerleri[319]=new DortgenKontrol((26*kenar),(6*kenar),kenar,kenar);
		digerleri[320]=new DortgenKontrol((21*kenar),(8*kenar),kenar,kenar);
		digerleri[321]=new DortgenKontrol((22*kenar),(8*kenar),kenar,kenar);
		digerleri[322]=new DortgenKontrol((21*kenar),(10*kenar),kenar,kenar);
		digerleri[323]=new DortgenKontrol((22*kenar),(10*kenar),kenar,kenar);
		digerleri[324]=new DortgenKontrol((28*kenar),(6*kenar),kenar,kenar);
		digerleri[325]=new DortgenKontrol((29*kenar),(6*kenar),kenar,kenar);
		digerleri[326]=new DortgenKontrol((24*kenar),(7*kenar),kenar,kenar);
		digerleri[327]=new DortgenKontrol((24*kenar),(8*kenar),kenar,kenar);
		digerleri[328]=new DortgenKontrol((24*kenar),(9*kenar),kenar,kenar);
		digerleri[329]=new DortgenKontrol((24*kenar),(10*kenar),kenar,kenar);
		digerleri[330]=new DortgenKontrol((26*kenar),(8*kenar),kenar,kenar);
		digerleri[331]=new DortgenKontrol((27*kenar),(8*kenar),kenar,kenar);
		digerleri[332]=new DortgenKontrol((28*kenar),(8*kenar),kenar,kenar);
		digerleri[333]=new DortgenKontrol((29*kenar),(8*kenar),kenar,kenar);
		digerleri[334]=new DortgenKontrol((26*kenar),(9*kenar),kenar,kenar);
		digerleri[335]=new DortgenKontrol((26*kenar),(10*kenar),kenar,kenar);
		digerleri[336]=new DortgenKontrol((22*kenar),(12*kenar),kenar,kenar);
		digerleri[337]=new DortgenKontrol((23*kenar),(12*kenar),kenar,kenar);
		digerleri[338]=new DortgenKontrol((24*kenar),(12*kenar),kenar,kenar);
		digerleri[339]=new DortgenKontrol((25*kenar),(12*kenar),kenar,kenar);
		digerleri[340]=new DortgenKontrol((26*kenar),(12*kenar),kenar,kenar);
		digerleri[341]=new DortgenKontrol((27*kenar),(12*kenar),kenar,kenar);
		digerleri[342]=new DortgenKontrol((28*kenar),(10*kenar),kenar,kenar);
		digerleri[343]=new DortgenKontrol((28*kenar),(11*kenar),kenar,kenar);
		digerleri[344]=new DortgenKontrol((28*kenar),(12*kenar),kenar,kenar);
		digerleri[345]=new DortgenKontrol((28*kenar),(13*kenar),kenar,kenar);
		digerleri[346]=new DortgenKontrol((28*kenar),(14*kenar),kenar,kenar);
		digerleri[347]=new DortgenKontrol((28*kenar),(15*kenar),kenar,kenar);
		digerleri[348]=new DortgenKontrol((29*kenar),(15*kenar),kenar,kenar);
		digerleri[349]=new DortgenKontrol((21*kenar),(14*kenar),kenar,kenar);
		digerleri[350]=new DortgenKontrol((22*kenar),(14*kenar),kenar,kenar);
		digerleri[351]=new DortgenKontrol((23*kenar),(14*kenar),kenar,kenar);
		digerleri[352]=new DortgenKontrol((24*kenar),(14*kenar),kenar,kenar);
		digerleri[353]=new DortgenKontrol((24*kenar),(15*kenar),kenar,kenar);
		digerleri[354]=new DortgenKontrol((22*kenar),(16*kenar),kenar,kenar);
		digerleri[355]=new DortgenKontrol((23*kenar),(16*kenar),kenar,kenar);
		digerleri[356]=new DortgenKontrol((24*kenar),(16*kenar),kenar,kenar);
		digerleri[357]=new DortgenKontrol((26*kenar),(14*kenar),kenar,kenar);
		digerleri[358]=new DortgenKontrol((26*kenar),(15*kenar),kenar,kenar);
		digerleri[359]=new DortgenKontrol((26*kenar),(16*kenar),kenar,kenar);
		digerleri[360]=new DortgenKontrol((26*kenar),(17*kenar),kenar,kenar);
		digerleri[361]=new DortgenKontrol((26*kenar),(18*kenar),kenar,kenar);
		digerleri[362]=new DortgenKontrol((20*kenar),(18*kenar),kenar,kenar);
		digerleri[363]=new DortgenKontrol((21*kenar),(18*kenar),kenar,kenar);
		digerleri[364]=new DortgenKontrol((22*kenar),(18*kenar),kenar,kenar);
		digerleri[365]=new DortgenKontrol((23*kenar),(18*kenar),kenar,kenar);
		digerleri[366]=new DortgenKontrol((24*kenar),(18*kenar),kenar,kenar);
		digerleri[367]=new DortgenKontrol((25*kenar),(18*kenar),kenar,kenar);
		digerleri[368]=new DortgenKontrol((28*kenar),(17*kenar),kenar,kenar);
		digerleri[369]=new DortgenKontrol((29*kenar),(17*kenar),kenar,kenar);
		digerleri[370]=new DortgenKontrol((28*kenar),(19*kenar),kenar,kenar);
		digerleri[371]=new DortgenKontrol((29*kenar),(19*kenar),kenar,kenar);
		digerleri[372]=new DortgenKontrol((24*kenar),(20*kenar),kenar,kenar);
		digerleri[373]=new DortgenKontrol((26*kenar),(20*kenar),kenar,kenar);		
	}
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		a.anakareciz(g);		//ana karemizi çizdiriyoruz
		for(int i = 0; i<elemansayisi; i++)
		{
			digerleri[i].ekranaCiz(g);// döngü yardımıyla dörtgenlerimizi çizdiriyoruz
		}
		
	}
	@Override
	public void keyPressed(KeyEvent e) { 
		if(e.getKeyCode()== e.VK_UP)// klavyeden yukarı tuşuna basınca hareket et methodumuzu kullanarak karemizi hareket ettiriyoruz
		{
			a.hareketet(0, -adim,digerleri,elemansayisi);
			repaint();//tekrar çizdiriyoruz
		}
		else if(e.getKeyCode()== e.VK_DOWN)// klavyeden aşağı tuşuna basınca hareket et methodumuzu kullanarak karemizi hareket ettiriyoruz
		{
			a.hareketet(0, adim,digerleri,elemansayisi);
			repaint();
		}
		else if(e.getKeyCode()== e.VK_LEFT)// klavyeden sol tuşuna basınca hareket et methodumuzu kullanarak karemizi hareket ettiriyoruz
		{
			a.hareketet(-adim,0 ,digerleri,elemansayisi);
			repaint();
		}
		else if(e.getKeyCode()== e.VK_RIGHT)// klavyeden sağ tuşuna basınca hareket et methodumuzu kullanarak karemizi hareket ettiriyoruz
		{
			a.hareketet(adim,0,digerleri,elemansayisi);
			repaint();
		}
		
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		
		
	}

}