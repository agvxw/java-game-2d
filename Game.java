/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progame;

import java.io.*;
import sun.audio.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import javax.swing.JPanel;
import javax.swing.Timer;
public class Game extends JPanel implements ActionListener{
    Timer loop;
    Player player;
    ControlEnemy cn;
    

    
    public Game(){
        loop=new Timer (10, this);
        loop.start();
        player = new Player(100,580);
        cn = new ControlEnemy();
        addKeyListener(new Keyinput(player));
        setFocusable(true);
        
        
        
        
    }
 
    //การจัดการกราฝิก
    @Override
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2d=(Graphics2D)g;
        g2d.setColor(Color.CYAN);
        g2d.fillRect(0, 0, Progame.WIDTH, Progame.HIGHT);
        player.draw(g2d);
        cn.draw(g2d);
        g2d.setColor(Color.white);
        g2d.setFont(new Font("Tahoma",Font.BOLD,25));
        g2d.drawString("Score:"+Player.score, 150, 20);
        g2d.drawString("Speed:"+Enemy.speedy, 0, 20);


    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        player.update();
        cn.update();
        repaint();
        
    }



   
           
            
}
