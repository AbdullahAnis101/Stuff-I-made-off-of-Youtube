import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JButton;
public class JLabelTutorial extends JFrame{
    JLabel jl;
    JButton jb;
    public JLabelTutorial()
    {
        setTitle("Tutorial");
        setSize(960,960);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        jl = new JLabel("This is a message");
        add(jl);

        jb = new JButton("Press Me.");
        add(jb);

    }

    public static void main(String [] args){
        JLabelTutorial t = new JLabelTutorial();

    }
}
