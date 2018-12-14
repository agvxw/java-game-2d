/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progame;

import java.awt.Graphics2D;
import java.util.LinkedList;

/**
 *
 * @author MiniDragon
 */
public class ControlEnemy {
    
    static LinkedList<Enemy> e=new LinkedList<>();
    Enemy temp;
    
    public ControlEnemy(){
        addEnemy(new Enemy(100,0));
        addEnemy(new Enemy(200,-120));
        addEnemy(new Enemy(100,-240));
        addEnemy(new Enemy(200,-360));
        addEnemy(new Enemy(100,-480));
    }
    //วาดตัวละครหลายตัว
        public void draw(Graphics2D g2d){
        for (int i=0 ; i< e.size(); i++){
            temp =  e.get(i);
            temp.draw(g2d);
        }
    }
    //ตัวละครหลายตัวเคลื่อนที่
    public void update(){
        for(int i=0 ; i< e.size(); i++){
            temp=e.get(i);
            temp.update();
        }
    }
    //เพิ่ม object บนจอ
    public void addEnemy(Enemy enemy){
        e.add(enemy);
    }
    //ลบ object ออกจากจอ
    public void removeEnemy(Enemy enemy){
        e.remove(enemy);
    }
    //พื้นที่ผิวของ Enemy
    public static LinkedList<Enemy> getEnemyBounds(){
        return e;
    }
    
    
}
