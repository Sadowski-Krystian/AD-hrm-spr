import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class app implements ActionListener {

    JFrame win = new JFrame();
    JPanel ogolneinformacje = new JPanel();
    JPanel add = new JPanel();
    JPanel lst;
    JLabel lbl1, lbl2,lbl3, lbl4, lbl5, lbl6;
    JTextField txt1, txt2, txt3, txt4;
    JButton btnadd;


    app(){
        win.setTitle("Harmonogram zajęć");
        win.setLayout(new BorderLayout());

        add.setLayout(new FlowLayout());
        lbl1 = new JLabel();
        lbl1.setText("Liczba Godzin");
        txt1 = new JTextField("",10);
        lbl2 = new JLabel();
        lbl2.setText("Przedmiot");
        txt2 = new JTextField("", 10);
        lbl3 = new JLabel();
        lbl3.setText("Pozostało Godzin");
        lbl4 = new JLabel();

        btnadd = new JButton("+");
        btnadd.addActionListener( this);

        ogolneinformacje.add(lbl1);
        ogolneinformacje.add(txt1);
        ogolneinformacje.add(lbl2);
        ogolneinformacje.add(txt2);
        ogolneinformacje.add(lbl3);
        ogolneinformacje.add(lbl4);
        lbl6 = new JLabel();
        lbl6.setText("Liczba Godzin");
        txt4 = new JTextField("", 10);
        lbl5 = new JLabel();
        lbl5.setText("Temat");
        txt3 = new JTextField("", 10);
        win.add(ogolneinformacje, BorderLayout.PAGE_START);
        add.add(lbl5);
        add.add(txt4);
        add.add(lbl6);
        add.add(txt3);
        add.add(btnadd);
        win.add(add);
        lst = new List();
        win.add(lst, BorderLayout.PAGE_END);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setSize(700, 220);
        win.setVisible(true);

    }

    public static void main(String[] args) {
        new app();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       String ogolGodzin = txt1.getText();
        String Przedmiot = txt2.getText();
       String Temat = txt4.getText();
        String LiczbaGodzin = txt3.getText();

        lbl4.setText(Integer.toString(pozostalo(Integer.parseInt(ogolGodzin), Integer.parseInt(LiczbaGodzin))) );
        txt1.setText(Integer.toString(pozostalo(Integer.parseInt(ogolGodzin), Integer.parseInt(LiczbaGodzin))));
        List.data.addElement(Temat+" | "+LiczbaGodzin);

    }
    public int pozostalo(int ogol, int licztem){
        return ogol-=licztem;
    }

}
