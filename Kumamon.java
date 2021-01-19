import java.awt.*;
import java.awt.geom.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JComponent;
import javax.swing.JFrame;
public class Kumamon extends Frame{

    public Kumamon() {
    	super("Kumamon");
    	setSize(700,700);
    	setVisible(true);
    }
    
    public void paint(Graphics g){
		Graphics2D g2d= (Graphics2D)g;
		
		Image img1 = Toolkit.getDefaultToolkit().getImage("qweqweqwe.jpg");
   		 g2d.drawImage(img1, 10, 10, this);
   		 g2d.finalize();
   		    		 
   		//yungnasalikodnikumamon001
		g.setColor(new Color(48,48,58));
		Area yungnasalikodnikumamon001 = new Area(new Rectangle2D.Double(0,0,700,700));
		g2d.fill(yungnasalikodnikumamon001);
		g2d.rotate(-25);
		
		//katawannikumamon001
		g.setColor(new Color(0,0,0));
		Area katawannikumamon001 = new Area(new RoundRectangle2D.Double(-50,225,800,700,900,900));
		g2d.fill(katawannikumamon001);
		
		//tapalsaharapnikumamon001
		g.setColor(new Color(255,255,255));
		Area tapalsaharapnikumamon001 = new Area(new Arc2D.Double(-900,-300,1100,1000,170,190,Arc2D.CHORD));
		g2d.fill(tapalsaharapnikumamon001);
		
		//tapalsaharapnikumamon002
		g.setColor(new Color(48,48,58));
		Area tapalsaharapnikumamon002 = new Area(new Arc2D.Double(-905,-310,1100,1000,170,190,Arc2D.CHORD));
		g2d.fill(tapalsaharapnikumamon002);
		
		//tapalsaharapnikumamon003
		g.setColor(new Color(255,255,255));
		Area tapalsaharapnikumamon003 = new Area(new Arc2D.Double(500,-300,1100,1000,170,190,Arc2D.CHORD));
		g2d.fill(tapalsaharapnikumamon003);
		
		//tapalsaharapnikumamon004
		g.setColor(new Color(48,48,58));
		Area tapalsaharapnikumamon004 = new Area(new Arc2D.Double(505,-310,1100,1000,170,190,Arc2D.CHORD));
		g2d.fill(tapalsaharapnikumamon004);
					 
   		//tapalsaharapnikumamon005
		g.setColor(new Color(48,48,58));
		Area tapalsaharapnikumamon005 = new Area(new Rectangle2D.Double(150,100,400,200));
		g2d.fill(tapalsaharapnikumamon005);
		
		//teynganikumamon001
		g.setColor(new Color(255,255,255));
		Area teynganikumamon001 = new Area(new Ellipse2D.Double(180,130,100,100));
		g2d.fill(teynganikumamon001);
				
		//teynganikumamon004
		g.setColor(new Color(255,255,255));
		Area teynganikumamon004 = new Area(new Ellipse2D.Double(420,130,100,100));
		g2d.fill(teynganikumamon004);
	    
		//ulonikumamon001
		g.setColor(new Color(255,255,255));
		Area ulonikumamon001 = new Area(new Ellipse2D.Double(190,142,320,250));
		g2d.fill(ulonikumamon001);
		
		//ulonikumamon002
		g.setColor(new Color(0,0,0));
		Area ulonikumamon002 = new Area(new Ellipse2D.Double(200,150,300,250));
		g2d.fill(ulonikumamon002);
			
		//teynganikumamon002
		g.setColor(new Color(0,0,0));
		Area teynganikumamon002 = new Area(new Ellipse2D.Double(190,140,80,80));
		g2d.fill(teynganikumamon002);
		
		//teynganikumamon003
		g.setColor(new Color(255,255,255));
		Area teynganikumamon003 = new Area(new Ellipse2D.Double(200,150,50,50));
		g2d.fill(teynganikumamon003);
				
		//teynganikumamon005
		g.setColor(new Color(0,0,0));
		Area teynganikumamon005 = new Area(new Ellipse2D.Double(430,140,80,80));
		g2d.fill(teynganikumamon005);
		
		//teynganikumamon006
		g.setColor(new Color(255,255,255));
		Area teynganikumamon006 = new Area(new Ellipse2D.Double(450,150,50,50));
		g2d.fill(teynganikumamon006);
				
		
		//kilaynikumamon001
		g.setColor(new Color(232,21,27));
		Area kilaynikumamon001 = new Area(new Ellipse2D.Double(245,190,70,60));
		g2d.fill(kilaynikumamon001);
		
		//kilaynikumamon002
		g.setColor(new Color(0,0,0));
		Area kilaynikumamon002 = new Area(new Ellipse2D.Double(235,200,90,60));
		g2d.fill(kilaynikumamon002);
				
		//kilaynikumamon003
		g.setColor(new Color(232,21,27));
		Area kilaynikumamon003 = new Area(new Ellipse2D.Double(385,190,70,60));
		g2d.fill(kilaynikumamon003);
				
		//kilaynikumamon004
		g.setColor(new Color(0,0,0));
		Area kilaynikumamon004 = new Area(new Ellipse2D.Double(375,200,90,60));
		g2d.fill(kilaynikumamon004);
		
		//bunganganikumamon001
		g.setColor(new Color(255,255,255));
		Area bunganganikumamon001 = new Area(new Ellipse2D.Double(285,280,130,100));
		g2d.fill(bunganganikumamon001);
		
		//bibignikumamon001
		g.setColor(new Color(0,0,0));
		Area bibignikumamon001 = new Area(new Ellipse2D.Double(340,325,20,50));
		g2d.fill(bibignikumamon001);
				
		//ilongnikumamon001
		g.setColor(new Color(0,0,0));
		Area ilongnikumamon001 = new Area(new Ellipse2D.Double(332,290,35,25));
		g2d.fill(ilongnikumamon001);
				
		//matanikumamon001
		g.setColor(new Color(255,255,255));
		Area matanikumamon001 = new Area(new Ellipse2D.Double(265,230,50,50));
		g2d.fill(matanikumamon001);
		
		//matanikumamon002
		g.setColor(new Color(0,0,0));
		Area matanikumamon002 = new Area(new Ellipse2D.Double(280,245,20,20));
		g2d.fill(matanikumamon002);
		
		//matanikumamon003
		g.setColor(new Color(255,255,255));
		Area matanikumamon003 = new Area(new Ellipse2D.Double(385,230,50,50));
		g2d.fill(matanikumamon003);
				
		//matanikumamon004
		g.setColor(new Color(0,0,0));
		Area matanikumamon004 = new Area(new Ellipse2D.Double(400,245,20,20));
		g2d.fill(matanikumamon004);
				
		//pisngikumamon001
		g.setColor(new Color(232,21,27));
		Area pisngikumamon001 = new Area(new Ellipse2D.Double(175,270,90,90));
		g2d.fill(pisngikumamon001);
		
		//pisngikumamon002
		g.setColor(new Color(232,21,27));
		Area pisngikumamon002 = new Area(new Ellipse2D.Double(435,270,90,90));
		g2d.fill(pisngikumamon002);
				//MOON
		g.setColor(new Color(139,214,217));
		Area moonkumamon002 = new Area(new Ellipse2D.Double(65,100,90,90));
		g2d.fill(moonkumamon002);
		
						//MOONYELLOW
		g.setColor(new Color(247,245,145));
		Area moonyellowkumamon002 = new Area(new Ellipse2D.Double(500,5,90,90));
		g2d.fill(moonyellowkumamon002);
				       		
				       								//MOONYELLOWPATCH
		g.setColor(new Color(48,48,58));
		Area moonyellowpatchkumamon002 = new Area(new Ellipse2D.Double(510,-10,90,90));
		g2d.fill(moonyellowpatchkumamon002);
				       							//MOONWHITE
		g.setColor(new Color(200,201,203));
		Area moonwhitekumamon002 = new Area(new Ellipse2D.Double(600,170,90,90));
		g2d.fill(moonwhitekumamon002);
						       							//MOONWHITEPATCH
		g.setColor(new Color(146,147,151));
		Area moonwhitepatchkumamon002 = new Area(new Ellipse2D.Double(610,185,15,15));
		g2d.fill(moonwhitepatchkumamon002);
   						       							//MOONWHITEPATCH2
		g.setColor(new Color(146,147,151));
		Area moonwhitepatchkumamon003 = new Area(new Ellipse2D.Double(608,190,15,15));
		g2d.fill(moonwhitepatchkumamon003);
		
		   						       							//MOONWHITEPATCH3
		g.setColor(new Color(146,147,151));
		Area moonwhitepatchkumamon004 = new Area(new Ellipse2D.Double(650,200,15,15));
		g2d.fill(moonwhitepatchkumamon004);
		
				   						       							//MOONWHITEPATCH4
		g.setColor(new Color(146,147,151));
		Area moonwhitepatchkumamon005 = new Area(new Ellipse2D.Double(647,205,15,15));
		g2d.fill(moonwhitepatchkumamon005);
		
						   						       							//MOONWHITEPATCH5
		g.setColor(new Color(146,147,151));
		Area moonwhitepatchkumamon006 = new Area(new Ellipse2D.Double(630,203,8,8));
		g2d.fill(moonwhitepatchkumamon006);
		
								   						       							//MOONWHITEPATCH5
		g.setColor(new Color(146,147,151));
		Area moonwhitepatchkumamon007 = new Area(new Ellipse2D.Double(650,235,20,20));
		g2d.fill(moonwhitepatchkumamon007);
		
									   						       							//MOONWHITEPATCH7
		g.setColor(new Color(146,147,151));
		Area moonwhitepatchkumamon008 = new Area(new Ellipse2D.Double(640,235,25,25));
		g2d.fill(moonwhitepatchkumamon008);
		
											   						       							//MOONWHITEPATCH7
		g.setColor(new Color(146,147,151));
		Area moonwhitepatchkumamon009 = new Area(new Ellipse2D.Double(609,225,25,25));
		g2d.fill(moonwhitepatchkumamon009);
				//MOONPATCH1
		g.setColor(new Color(129,182,188));
		Area moonyellowpatch1kumamon002 = new Area(new Ellipse2D.Double(75,120,15,15));
		g2d.fill(moonyellowpatch1kumamon002);
				//MOONPATCH2
		g.setColor(new Color(129,182,188));
		Area moonpatch2kumamon002 = new Area(new Ellipse2D.Double(95,160,10,10));
		g2d.fill(moonpatch2kumamon002);
		
						//MOONPATCH3
		g.setColor(new Color(129,182,188));
		Area moonpatch2kumamon003 = new Area(new Ellipse2D.Double(75,130,10,10));
		g2d.fill(moonpatch2kumamon003);
		
								//MOONPATCH3
		g.setColor(new Color(129,182,188));
		Area moonpatch2kumamon004 = new Area(new Ellipse2D.Double(90,165,10,10));
		g2d.fill(moonpatch2kumamon004);
				       								//MOONPATCH3
		g.setColor(new Color(129,182,188));
		Area moonpatch2kumamon005 = new Area(new Ellipse2D.Double(99,100,10,10));
		g2d.fill(moonpatch2kumamon005);
		
				g.setColor(new Color(129,182,188));
		Area moonpatch2kumamon006 = new Area(new Ellipse2D.Double(103,135,20,20));
		g2d.fill(moonpatch2kumamon006);
		
				g.setColor(new Color(129,182,188));
		Area moonpatch2kumamon007 = new Area(new Ellipse2D.Double(140,130,10,10));
		g2d.fill(moonpatch2kumamon007);
		//MOONORANGE
						g.setColor(new Color(223,181,139));
		Area moonorangekumamon007 = new Area(new Ellipse2D.Double(50,50,30,30));
		g2d.fill(moonorangekumamon007);
		
				//MOONORANGE2
						g.setColor(new Color(223,181,139));
		Area moonorange2kumamon007 = new Area(new Ellipse2D.Double(647,350,30,30));
		g2d.fill(moonorange2kumamon007);
		
						//STARS
						g.setColor(new Color(255,255,255));
		Area starkumamon001 = new Area(new Ellipse2D.Double(100,350,15,15));
		g2d.fill(starkumamon001);
		
								//STARS
						g.setColor(new Color(255,255,255));
		Area starkumamon002 = new Area(new Ellipse2D.Double(600,350,15,15));
		g2d.fill(starkumamon002);
								//STARS
						g.setColor(new Color(255,255,255));
		Area starkumamon003 = new Area(new Ellipse2D.Double(500,80,10,10));
		g2d.fill(starkumamon003);
			//STARS
						g.setColor(new Color(255,255,255));
		Area starkumamon004 = new Area(new Ellipse2D.Double(700,500,12,12));
		g2d.fill(starkumamon004);
		//STARS
						g.setColor(new Color(255,255,255));
		Area starkumamon005 = new Area(new Ellipse2D.Double(200,30,22,22));
		g2d.fill(starkumamon005);
		//STARS
						g.setColor(new Color(255,255,255));
		Area starkumamon006 = new Area(new Ellipse2D.Double(400,30,13,13));
		g2d.fill(starkumamon006);
		//STARS
						g.setColor(new Color(255,255,255));
		Area starkumamon007 = new Area(new Ellipse2D.Double(245,30,5,5));
		g2d.fill(starkumamon007);
		//STARS
						g.setColor(new Color(255,255,255));
		Area starkumamon008 = new Area(new Ellipse2D.Double(350,30,10,10));
		g2d.fill(starkumamon008);
		//STARS
						g.setColor(new Color(255,255,255));
		Area starkumamon009= new Area(new Ellipse2D.Double(415,69,9,9));
		g2d.fill(starkumamon009);
		//STARS
						g.setColor(new Color(255,255,255));
		Area starkumamon0010 = new Area(new Ellipse2D.Double(265,60,10,10));
		g2d.fill(starkumamon0010);
		//STARS
						g.setColor(new Color(255,255,255));
		Area starkumamon0011 = new Area(new Ellipse2D.Double(304,60,5,5));
		g2d.fill(starkumamon0011);
		
		//STARS
						g.setColor(new Color(255,255,255));
		Area starkumamon0012 = new Area(new Ellipse2D.Double(100,350,10,10));
		g2d.fill(starkumamon0012);
		
								//STARS
						g.setColor(new Color(255,255,255));
		Area starkumamon0013 = new Area(new Ellipse2D.Double(535,200,7,7));
		g2d.fill(starkumamon0013);
								//STARS
						g.setColor(new Color(255,255,255));
		Area starkumamon0014= new Area(new Ellipse2D.Double(450,100,6,6));
		g2d.fill(starkumamon0014);
		//STARS
						g.setColor(new Color(255,255,255));
		Area starkumamon0015 = new Area(new Ellipse2D.Double(245,82,2,2));
		g2d.fill(starkumamon0015);
		//STARS
						g.setColor(new Color(255,255,255));
		Area starkumamon0016 = new Area(new Ellipse2D.Double(462,73,10,10));
		g2d.fill(starkumamon0016);
		//STARS
						g.setColor(new Color(255,255,255));
		Area starkumamon0017= new Area(new Ellipse2D.Double(310,69,12,12));
		g2d.fill(starkumamon0017);
			//STARS
						g.setColor(new Color(255,255,255));
		Area starkumamon0018 = new Area(new Ellipse2D.Double(245,696,15,15));
		g2d.fill(starkumamon0018);
		//STARS
						g.setColor(new Color(255,255,255));
		Area starkumamon0019 = new Area(new Ellipse2D.Double(600,25,8,8));
		g2d.fill(starkumamon0019);
		//STARS
						g.setColor(new Color(255,255,255));
		Area starkumamon0020= new Area(new Ellipse2D.Double(105,696,11,11));
		g2d.fill(starkumamon0020);
		//STARS
						g.setColor(new Color(255,255,255));
		Area starkumamon0021 = new Area(new Ellipse2D.Double(655,25,18,18));
		g2d.fill(starkumamon0021);
		//STARS
						g.setColor(new Color(255,255,255));
		Area starkumamon0022 = new Area(new Ellipse2D.Double(636,300,11,11));
		g2d.fill(starkumamon0022);
			//STARS
						g.setColor(new Color(255,255,255));
		Area starkumamon0023 = new Area(new Ellipse2D.Double(636,396,8,8));
		g2d.fill(starkumamon0023);
		//STARS
						g.setColor(new Color(255,255,255));
		Area starkumamon0024 = new Area(new Ellipse2D.Double(556,296,6,6));
		g2d.fill(starkumamon0024);
			//STARS
						g.setColor(new Color(255,255,255));
		Area starkumamon0025 = new Area(new Ellipse2D.Double(696,310,8,8));
		g2d.fill(starkumamon0025);
		//STARS
						g.setColor(new Color(255,255,255));
		Area starkumamon0026 = new Area(new Ellipse2D.Double(666,150,12,13));
		g2d.fill(starkumamon0026);
		//STARS
						g.setColor(new Color(255,255,255));
		Area starkumamon0027 = new Area(new Ellipse2D.Double(50,250,15,15));
		g2d.fill(starkumamon0027);
		//STARS
						g.setColor(new Color(255,255,255));
		Area starkumamon0028 = new Area(new Ellipse2D.Double(60,282,5,5));
		g2d.fill(starkumamon0028);
		//STARS
						g.setColor(new Color(255,255,255));
		Area starkumamon0029 = new Area(new Ellipse2D.Double(150,245,15,15));
		g2d.fill(starkumamon0029);
		//STARS
						g.setColor(new Color(255,255,255));
		Area starkumamon0030 = new Area(new Ellipse2D.Double(110,206,9,9));
		g2d.fill(starkumamon0030);
		//STARS
						g.setColor(new Color(255,255,255));
		Area starkumamon0031 = new Area(new Ellipse2D.Double(130,286,9,9));
		g2d.fill(starkumamon0031);
    }
    public static void main(String[] args){
    	new Kumamon();
   	
   	JFrame window = new JFrame();
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setBounds(10, 10, 300, 300);
    window.getContentPane().add(new Kumamon());
    window.setVisible(true);
    }
}