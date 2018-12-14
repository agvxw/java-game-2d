
package progame;

//จัดการเคลื่อนไหว

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Keyinput extends KeyAdapter {
    Player p;
    
    public Keyinput(Player p){
        this.p = p ;
    }
    
    //กดปุ่มค้าง
    @Override
    public void keyPressed(KeyEvent e){
        p.keyPressed(e);
    }
    
    //กดปล่อย
    @Override
    public void keyReleased(KeyEvent e){
        p.keyReleased(e);
    }
}
