import java.awt.*;
import java.awt.event.*;
public class WP {
public static void main(String[] args) {
    MainFrame mFrm = new MainFrame();
    mFrm.setVisible(true);
}
}
class MainFrame extends Frame{
    private int n =0;
    private Button btnPush = new Button("Push");
    public MainFrame(){
        initComp();
    }
    private void initComp(){
        this.setLocation(100,200);
        this.setSize(400,300);
        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
        this.setBackground(Color.WHITE);
        this.setLayout(null);
        btnPush.setLocation(200,150);
        btnPush.setSize(80,25);
        btnPush.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                n+=1;
                fun1(n);
        }
        });
        this.add(btnPush);
    }
    private void fun1(int n){
        this.setTitle(Integer.toString(n));
    }
}