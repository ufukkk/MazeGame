package com.MazeGame;

import java.awt.Color;		//
import java.awt.Graphics;	// bazı method ve classları projemize dahil ediyoruz
import java.awt.Rectangle;  //


public class DortgenKontrol {
	
	Rectangle r;
	
	public DortgenKontrol(int x,int y,int width,int height)// DortgenKontrol classımız için constructor 
	{
		r=new Rectangle(x,y,width,height);
	}
	
	public void ekranaCiz(Graphics g){// dörtgenleri ekrana çizmemize yarayan method
		g.drawRect((int)r.getX(), (int)r.getY(), (int)r.getWidth(), (int)r.getHeight());
		
	}
	public void anakareciz(Graphics g){ // Ana karemizi yani hareketli karemizi çizmemize yarayan method
		g.setColor(Color.blue); //renk değiştirmemizi sağlar.
	    g.fillRect((int)r.getX(), (int)r.getY(), (int)r.getWidth(), (int)r.getHeight());//fillRect methodu kullanarak içi dolu kare çizdiriyoruz
	}
	
	
	public void hareketet(int x,int y, DortgenKontrol[] digerleri,int sayi)
	{
		Rectangle gecici = new Rectangle(r); //geçici bir kare oluşturuyoruz çarpma durumunu kontrol etmek için
		gecici.setLocation((int)gecici.getX()+x,(int)gecici.getY()+y); // gececi karemizin konumunu belirliyor
		boolean carpma = false; // çarpma değerini kontrol eden boolean değeri
		for(int i=0; i<sayi; i++) //tüm kareleri kontrol etmek için kulanılan döngü
		{
			if(gecici.intersects(digerleri[i].getRectangle()))// dörtgenimizin başka dörtgenlerle çakışıp çakışmadığını anlamak için intersects 
			{												  // adında bir method kullanıyoruz. Başka bir dörtgeni parametre olarak alıyor.eğer
				carpma=true;								  // kesişim varsa carpma değerini true yapıyor.
			}
		}	
		if(gecici.getX() < 0 || gecici.getY() < 0 || // Burada penceremizin kenarlarından dışarı çıkmaması için kullanılan if koşulu
				gecici.getX() >640-gecici.getWidth() || gecici.getY() > 480-gecici.getHeight())
		{
			carpma = true;
		}
		if(carpma==false)// Eğer çarpışma yoksa dörtgenimizi hareket ettirebiliriz
		{
			r.setLocation((int)r.getX()+x,(int)r.getY()+y);
		}
	}
	
	public Rectangle getRectangle()// oluşturulan kareleri döndüren gets methodu
	{
		return r;
	}
}