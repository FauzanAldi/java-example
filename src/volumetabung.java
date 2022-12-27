import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

class volumetabung extends JFrame implements ActionListener {
    // create a frame
    static JFrame f;

    // create a textfield
    static JTextField r, t, hasil;

    static JLabel rl, tl, hasill;

    // store operator and operands
    String s0, s1, s2;

    // main function
    public static void main(String args[]) {
        // create a frame
        f = new JFrame("Menghitung Volume Tabung");

        try {
            // set look and feel
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        // create a object of class
        volumetabung c = new volumetabung();

        rl = new JLabel();
        tl = new JLabel();
        hasill = new JLabel();

        // add text to label
        rl.setText("Jari Jari");
        tl.setText("Tinggi");
        hasill.setText("                  Hasil                    ");

        // create a textfield
        r = new JTextField(3);
        t = new JTextField(3);
        hasil = new JTextField(20);

        // set the textfield to non editable
        hasil.setEditable(false);

        // create number buttons and some operators
        JButton beq1;

        // equals button
        beq1 = new JButton("Hitung");

        // create a panel
        JPanel p = new JPanel();

        beq1.addActionListener(c);

        // add elements to panel
        p.add(rl);
        p.add(r);
        p.add(tl);
        p.add(t);
        p.add(beq1);
        p.add(hasill);
        p.add(hasil);

        // set Background of panel
        p.setBackground(Color.blue);

        // add panel to frame
        f.add(p);

        f.setSize(200, 220);
        f.show();
    }

    public void actionPerformed(ActionEvent e) {

        try {
            int volumetabungnya = ((Integer.parseInt(r.getText()) * Integer.parseInt(r.getText()) * 22
                    * Integer.parseInt(t.getText())) / 7);
            hasil.setText(Integer.toString(volumetabungnya));
        } catch (Exception x) {
            hasil.setText("Format Tidak Sesuai");
        }

    }

}