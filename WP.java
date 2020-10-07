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
    private Button btnAdd = new Button("Add");
    private Button btnSub = new Button("Sub");
    private Button btnExt = new Button("Exit");
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
        btnAdd.setLocation(160,150);
        btnAdd.setSize(80,25);
        btnAdd.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                n+=1;
                fun1(n);
        }
        });
        this.add(btnAdd);
        btnSub.setLocation(60,150);
        btnSub.setSize(80,25);
        btnSub.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                n-=1;
                fun1(n);
        }
        });
        this.add(btnSub);
        btnExt.setLocation(280,150);
        btnExt.setSize(80,25);
        btnExt.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                System.exit(0);
        }
        });
        this.add(btnExt);
    }
    private void fun1(int n){
        this.setTitle(Integer.toString(n));
    }
}