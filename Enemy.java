/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progame;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Random;

/**
 *
 * @author MiniDragon
 */
public class Enemy {
    Player player;
    private int x,y;
    public static float speedy =1;
    public Enemy (int x, int y){
        this.x=x;
        this.y=y;
                
    }
    //วาดภาพลงบนจอ
    public void draw (Graphics2D g2d){
        Random rand = new Random(); 
        int value = rand.nextInt(255);
        float rgb = value;
        g2d.setColor(Color.getHSBColor(rgb, rgb, rgb));
        g2d.fillRect(x, y, 32, 32);   
    }
    
    public void update(){
        y+=speedy;
        if(y>640){
            y=0;
            Player.score++;
        }
        if (Player.score%20==0 && Player.score>0){
            speedy+=0.001;
        }
        
    }
    public Rectangle getBounds(){
        return new Rectangle(x,y,32,32);
        
    }
    
}
