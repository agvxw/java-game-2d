/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progame;

//ออกแบบ Player

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.util.LinkedList;

public class Player {
    private int x;
    private int y;
    //กำหนดความเร็วเตลื่อนที่
    private float speedx =0;
    private float speedy = 0;
    private float speedz = Enemy.speedy;
    private LinkedList<Enemy>e=ControlEnemy.getEnemyBounds();
    public static int score=0;
    
    public Player(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    //การจัดการการเคลื่อนไหว
    public void update (){
        x+=speedx;
        y+=speedy;
        if(x<100){
            x=100;
        }
        if(y<0){
            y=0;
        }
        if(x>200){
            x=200;
        }
        if(y>560){
            y=560;
        }
        colision();
       
    }
    
    //วาดตัวละคร
    public void draw (Graphics2D g2d){
        g2d.setColor(Color.red);
        g2d.fillRect(x, y, 32, 32);
        
    }

    public void keyPressed(KeyEvent e){
        int key=e.getKeyCode();
        if (key == KeyEvent.VK_RIGHT){
            speedx=8+speedz;
        }
        if (key == KeyEvent.VK_LEFT){
            speedx=-8-speedz;
        }
        if (key == KeyEvent.VK_UP){
            speedy=-8-speedz;
        }
        if (key == KeyEvent.VK_DOWN){
            speedy=8+speedz;
        }
           
    }
    
    public void keyReleased(KeyEvent e){
        int key=e.getKeyCode();
        if (key == KeyEvent.VK_RIGHT){
            speedx=0;
        }
        if (key == KeyEvent.VK_LEFT){
            speedx=0;
        }
        if (key == KeyEvent.VK_UP){
            speedy=0;
        }
        if (key == KeyEvent.VK_DOWN){
            speedy=0;
        }
        
    }
    
    public Rectangle getBounds(){
        return new Rectangle(x,y,32,32);
        
    }
    //ตรวจเช็คการชน
    public void colision(){
        for (int i=0; i<e.size();i++){
            if(getBounds().intersects(e.get(i).getBounds())){
                score--;
            }
        }
    } 
            
    
}
