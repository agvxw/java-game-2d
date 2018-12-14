/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progame;
import javax.swing.*;
/**
 *
 * @author MiniDragon
 */
public class Progame {
    //สร้างหน้าจอ
    public static final int WIDTH = 320;
    public static final int HIGHT =640;
    public static void main(String[] args) {
        JFrame window=new JFrame("2D GAME BASIC");
        window.setSize(WIDTH,HIGHT);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.add(new Game());
        window.setVisible(true);
    }
    
}
