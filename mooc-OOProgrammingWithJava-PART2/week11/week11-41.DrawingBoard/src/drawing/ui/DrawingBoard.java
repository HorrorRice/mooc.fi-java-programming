/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawing.ui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Rifqi
 */
public class DrawingBoard extends JPanel {

    public DrawingBoard() {
        super.setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        
        setBackground(Color.RED);
        graphics.fillRect(100, 50, 50, 50); // left eye
        graphics.fillRect(250, 50, 50, 50); // right eye
        
        graphics.fillRect(50, 200, 50, 50); // left cheek
        graphics.fillRect(300, 200, 50, 50); // right cheek
        
        graphics.fillRect(100, 250, 200, 50); // mouth
    }
    
    private void createComponents(Container container) {
        container.add(new DrawingBoard());
    }

}
