import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ArrowMan extends KeyAdapter implements ActionListener{
	JFrame f;
	JPanel p;
	ImageIcon iArrowMan,iBal1,iBal2,iBal3,iBal4,iArr;
	JLabel lArrowMan,lBal1,lBal2,lBal3,lBal4,lArr;
	Timer tBal1, tBal2, tBal3, tBal4, tArr, tb1,tb2,tb3,tb4;
	JButton shoot,he;
	Boolean shootFlag,b1Flag,b2Flag,b3Flag,b4Flag;
	JLabel ver,hor,ver2,ver3,ver4,hor2,hor3,hor4,hor5;
	Timer tVer,tHor;
	ImageIcon i;
	int count;
	public ArrowMan(){
		b1Flag = false;
		b2Flag = false;
		b3Flag = false;
		b4Flag = false;
		count = 5;
		f = new JFrame("Arrow man Game");
		shoot = new JButton("Shoot");
		shoot.addActionListener(this);
		shoot.setBounds(300,620,100,50);
		he = new JButton("Help");
		he.addActionListener(this);
		he.setBounds(500,620,100,50);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(1000,700);
		f.setVisible(true);
		f.getContentPane().setBackground(new Color(100,100,100));
		f.setLayout(null);
		f.addKeyListener(this);
		iArrowMan = new ImageIcon("arrowMan.png");
		lArrowMan = new JLabel(iArrowMan);
		
		f.add(lArrowMan);
		iBal1 = new ImageIcon("baloonBrown.png");
		iBal2 = new ImageIcon("baloonRed.png");
		iBal3 = new ImageIcon("baloonOrange.png");
		iBal4 = new ImageIcon("baloonPurple.png");
		iArr = new ImageIcon("arrow.png");
		lBal1 = new JLabel(iBal1);
		lBal2 = new JLabel(iBal2);
		lBal3 = new JLabel(iBal3);
		lBal4 = new JLabel(iBal4);
		lArr = new JLabel(iArr);
		lBal1.setBounds(550,480,90,120);
		lBal2.setBounds(650,480,90,120);
		lBal3.setBounds(750,480,90,120);
		lBal4.setBounds(850,480,90,120);
		lArrowMan.setBounds(10,10,180,160);
		lArr.setBounds(180,50,90,30);
		lArr.setVisible(false);
		f.add(lBal1);
		f.add(lBal2);
		f.add(lBal3);
		f.add(lBal4);
		f.add(shoot);
		f.add(he);
		f.add(lArr);
		ActionListener aL1 = new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				int x = lBal1.getX();
				int y = lBal1.getY();
				if(y > 10)
					lBal1.setBounds(x,y-3,90,120);
				else
					lBal1.setBounds(x,480,90,120);
			}
		};
		ActionListener aL2 = new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				int x = lBal2.getX();
				int y = lBal2.getY();
				if(y > 10)
					lBal2.setBounds(x,y-4,90,120);
				else
					lBal2.setBounds(x,480,90,120);
			}
		};
		ActionListener aL3 = new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				int x = lBal3.getX();
				int y = lBal3.getY();
				if(y > 10)
					lBal3.setBounds(x,y-5,90,120);
				else
					lBal3.setBounds(x,480,90,120);
			}
		};
		ActionListener aL4 = new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				int x = lBal4.getX();
				int y = lBal4.getY();
				if(y > 10)
					lBal4.setBounds(x,y-6,90,120);
				else
					lBal4.setBounds(x,480,90,120);
			}
		};
		
		tBal1 = new Timer(25,aL1); 
		tBal2 = new Timer(25,aL2);
		tBal3 = new Timer(25,aL3);
		tBal4 = new Timer(25,aL4);
		
		tBal1.start();
		tBal2.start();
		tBal3.start();
		tBal4.start();
		shootFlag = true;
		i = new ImageIcon("a.png");
		ver = new JLabel(i);
		ver2 = new JLabel(i);
		ver3 = new JLabel(i);
		ver4 = new JLabel(i);
		//ver5 = new JLabel(i);
		hor = new JLabel(i);
		
		hor2 = new JLabel(i);
		
		hor3 = new JLabel(i);
		hor4 = new JLabel(i);
		hor5 = new JLabel(i);
		
		ver.setBounds(200,10,10,50);
		ver2.setBounds(200,180,10,50);
		ver3.setBounds(200,350,10,50);
		ver4.setBounds(200,530,10,50);
		
		hor.setBounds(10,600,50,10);
		hor2.setBounds(200,600,50,10);
		
		hor3.setBounds(400,600,50,10);
		hor4.setBounds(600,600,50,10);
		hor5.setBounds(800,600,50,10);
		f.add(ver);
		f.add(ver2);
		f.add(ver3);
		f.add(ver4);
		
		f.add(hor);
		f.add(hor2);
		f.add(hor3);
		f.add(hor4);
		f.add(hor5);
		//ver.setBackground(new Color(0,162,232));
		//hor.setBackground(new Color(0,162,232));
		ActionListener aVer = new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				int x = ver.getX();
				int y = ver.getY();
				if(y < 700){
					ver.setBounds(x,y+10,10,50);
				}
				else ver.setBounds(200,10,10,50);
				x = ver2.getX();
				y = ver2.getY();
				if(y < 700){
					ver2.setBounds(x,y+10,10,50);
				}
				else ver2.setBounds(200,10,10,50);
				x = ver3.getX();
				y = ver3.getY();
				if(y < 700){
					ver3.setBounds(x,y+10,10,50);
				}
				else ver3.setBounds(200,10,10,50);
				x = ver4.getX();
				y = ver4.getY();
				if(y < 700){
					ver4.setBounds(x,y+10,10,50);
				}
				else ver4.setBounds(200,10,10,50);
			}
		};
		tVer = new Timer(5,aVer);
		tVer.start();
		ActionListener aHor = new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				int x = hor.getX();
				int y = hor.getY();
				if(x < 1000){
					hor.setBounds(x+10,y,50,10);
				}
				else hor.setBounds(10,600,50,10);
				x = hor2.getX();
				y = hor2.getY();
				if(x < 1000){
					hor2.setBounds(x+10,y,50,10);
				}
				else hor2.setBounds(10,600,50,10);
				x = hor3.getX();
				y = hor3.getY();
				if(x < 1000){
					hor3.setBounds(x+10,y,50,10);
				}
				else hor3.setBounds(10,600,50,10);
				x = hor4.getX();
				y = hor4.getY();
				if(x < 1000){
					hor4.setBounds(x+10,y,50,10);
				}
				else hor4.setBounds(10,600,50,10);
				x = hor5.getX();
				y = hor5.getY();
				if(x < 1000){
					hor5.setBounds(x+10,y,50,10);
				}
				else hor5.setBounds(10,600,50,10);
			}
		};
		tHor = new Timer(5,aHor);
		tHor.start();
		
	}
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource() == shoot && shootFlag){
			lArr.setBounds(lArrowMan.getX()+190,lArrowMan.getY()+45,90,30);
			lArr.setVisible(true);
			
			ActionListener arr = new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					int x = lArr.getX();
					int y = lArr.getY();
					shootFlag = false;
					if(x < 1000){
						lArr.setBounds(x+5,y,90,30);
						x = lArr.getX()+90;
						y = lArr.getY()+15;
						if(x>=lBal1.getX() && x <= (lBal1.getX()+90)&& (y >= lBal1.getY() && y <= (lBal1.getY()+100) )){
							b1Flag = true;
							ActionListener aL5 = new ActionListener(){
								public void actionPerformed(ActionEvent ae){
									int x = lBal1.getX();
									int y = lBal1.getY();
									if(y < 480)
										lBal1.setBounds(x,y+3,90,120);
									else{
										tb1.stop();
										lBal1.setVisible(false);
									}
										
								}
							};
							
							lBal1.setIcon(new ImageIcon("brown.png"));
							tBal1.stop();
							tb1 = new Timer(5,aL5);
							tb1.start();
							check();
						}
						else if(x>=lBal2.getX()&& x <= (lBal2.getX()+90) && (y >= lBal2.getY() && y <= (lBal2.getY()+100) )){
							//lBal2.setVisible(false);
							b2Flag = true;
							ActionListener aL6 = new ActionListener(){
								public void actionPerformed(ActionEvent ae){
									int x = lBal2.getX();
									int y = lBal2.getY();
									if(y < 480)
										lBal2.setBounds(x,y+3,90,120);
									else{
										tb2.stop();
										lBal2.setVisible(false);
									}
										
								}
							};
							lBal2.setIcon(new ImageIcon("red.png"));
							tBal2.stop();
							
							tb2 = new Timer(5,aL6);
							tb2.start();
							check();
							
						}
						else if(x>=lBal3.getX()&& x <= (lBal3.getX()+90) && (y >= lBal3.getY() && y <= (lBal3.getY()+100) )){
							//lBal3.setVisible(false);
							b3Flag = true;
							ActionListener aL7 = new ActionListener(){
								public void actionPerformed(ActionEvent ae){
									int x = lBal3.getX();
									int y = lBal3.getY();
									if(y < 480)
										lBal3.setBounds(x,y+3,90,120);
									else{
										tb3.stop();
										lBal3.setVisible(false);
									}
										
								}
							};
							//lBal.setIcon(new ImageIcon("red.png"));
							//tBal2.stop();
							lBal3.setIcon(new ImageIcon("orange.png"));
							tBal3.stop();
							
							tb3 = new Timer(5,aL7);
							tb3.start();
							check();
							
							
						}
						else if(x>=lBal4.getX()&& x <= (lBal4.getX()+90) && (y >= lBal4.getY() && y <= (lBal4.getY()+100) )){
							//lBal4.setVisible(false);
							b4Flag = true;
							ActionListener aL8 = new ActionListener(){
								public void actionPerformed(ActionEvent ae){
									int x = lBal4.getX();
									int y = lBal4.getY();
									if(y < 480)
										lBal4.setBounds(x,y+3,90,120);
									else{
										tb4.stop();
										lBal4.setVisible(false);
									}
										
								}
							};
							lBal4.setIcon(new ImageIcon("purple.png"));
							tBal4.stop();
							
							tb4 = new Timer(5,aL8);
							tb4.start();
							check();
							
							
						}
					}
					else {
						lArr.setVisible(false);
						lArr.setBounds(180,50,90,30);
						tArr.stop();
						JOptionPane.showMessageDialog(f,"Arrow left : "+count);
						count--;
						shootFlag = true;
					}
				}
			};
			tArr = new Timer(5,arr);
			tArr.start();
			//f.addKeyListener(this);
			if(count == 0){
				JOptionPane.showMessageDialog(f,"Game Over");
				shoot.setEnabled(false);
			}
			
			shoot.addKeyListener(this);
		}
		if(ae.getSource() == he){
			help();
		}
	}
	public void keyPressed(KeyEvent k){
		if(k.getKeyCode() == KeyEvent.VK_DOWN){
			int x = lArrowMan.getX();
			int y = lArrowMan.getY();
			if(y < 400)
				lArrowMan.setBounds(x,y+5,180,160);
		}
		else if(k.getKeyCode() == KeyEvent.VK_UP){
			int x = lArrowMan.getX();
			int y = lArrowMan.getY();
			if(y > 10){
				lArrowMan.setBounds(x,y-5,180,160);
			}
		}
	}
	public void help(){
		JOptionPane.showMessageDialog(f,"You Have maximum of Six Arrow");
		JOptionPane.showMessageDialog(f,"An arrow can burst all four ballon");
		JOptionPane.showMessageDialog(f,"All the Best");
	}
	public void check(){
		if(b1Flag&&b2Flag&&b3Flag&&b4Flag){
				shoot.setEnabled(false);
				JOptionPane.showMessageDialog(f,"CONGRATULATIONS !!!! YOU WON");
				
			}
	}
	public static void main(String[] args){
		new ArrowMan();
	}
	
}