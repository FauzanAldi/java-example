import java.awt.Graphics;
import java.util.Scanner;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class membuatlingkaran extends JPanel {

    public int x = 100;
    int y = 100;
    int width = 100;
    int height = 100;

    public void paint(Graphics g) {
        {
            g.setColor(Color.blue);
            g.fillOval(this.x, this.y, this.width, this.height);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Pusat Lingkaran (x y): ");
        String pusat = input.nextLine();
        String koordinat[] = pusat.split(" ", 2);

        System.out.print("Jari Jari Lingkaran (r): ");
        String jarijari = input.nextLine();

        membuatlingkaran obj = new membuatlingkaran();
        obj.x = Integer.parseInt(koordinat[0]);
        obj.y = Integer.parseInt(koordinat[1]);
        obj.width = Integer.parseInt(jarijari) * 2;
        obj.height = Integer.parseInt(jarijari) * 2;
        obj.setToolTipText("Mouse Berada di Dalam Lingkaran");

        JFrame frame = new JFrame();
        frame.getContentPane().add(obj);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}