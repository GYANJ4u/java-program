import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Test extends JFrame implements MouseListener, MouseMotionListener {
    JLabel statusLabel;
    int x = 0, y = 0;

    public Test() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200, 200);

        statusLabel = new JLabel("Status");
        statusLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(statusLabel, BorderLayout.SOUTH);
        addMouseListener(this);
        addMouseMotionListener(this);

        setVisible(true);
    }

    public void mouseClicked(MouseEvent m) {
        x = m.getX();
        y = m.getY();
        updateStatusLabel("Mouse Clicked at " + x + ", " + y);
    }

    public void mouseEntered(MouseEvent m) {
        updateStatusLabel("Mouse Entered");
    }

    public void mouseExited(MouseEvent m) {
        updateStatusLabel("Mouse Exited");
    }

    public void mousePressed(MouseEvent m) {
        x = m.getX();
        y = m.getY();
        updateStatusLabel("Mouse Pressed at " + x + ", " + y);
    }

    public void mouseReleased(MouseEvent m) {
        x = m.getX();
        y = m.getY();
        updateStatusLabel("Mouse Released at " + x + ", " + y);
    }

    public void mouseDragged(MouseEvent m) {
        x = m.getX();
        y = m.getY();
        updateStatusLabel("Dragging mouse at " + x + ", " + y);
    }

    public void mouseMoved(MouseEvent m) {
        x = m.getX();
        y = m.getY();
        updateStatusLabel("Moving mouse at " + x + ", " + y);
    }

    private void updateStatusLabel(String message) {
        statusLabel.setText(message);
    }

    public static void main(String[] args) {
        new Test();
    }
}
