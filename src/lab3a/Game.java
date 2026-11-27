package lab3a;


import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;


public class Game extends Canvas {
public static void main(String[] args) {
new Game();
}

Ball[] balls = new Ball[3]; //create an array of 3 new balls 

int x = 0;

Game() {
    balls[0] = new Ball(80, 20, 30, 50, 15, 8);
    balls[1] = new Ball(10, 20, 30, 50, 20, 30);
    balls[2] = new Ball(10, 20, 30, 50, 5, 20); // index to each ball in the array and create a new ball and set values

    JFrame frame = new JFrame();
    this.setSize(400, 400);
    frame.add(this);
    frame.pack();
    frame.setVisible(true);

    Timer t = new Timer();
    TimerTask tt = new TimerTask() {
        @Override
        public void run() {
            draw();
        }
    };

    t.schedule(tt, 0, 50);

    frame.addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e) {
            t.cancel();
            tt.cancel();
        }
    });
}

public void draw() {
    this.repaint();
}

public void paint(Graphics g) {
    g.setColor(Color.RED);
    g.fillRect(0, 0, 300, 300);
// move each ball and then draw
g.setColor(Color.blue);
for(int i = 0; i <balls.length; i++) {
	balls[i].Move();
g.fillOval(balls[i].x, balls[i].y, balls[i].w, balls[i].h);
//for each ball in the balls array, move it and give it the corresponding values found in the array, assigned previously
}
}
}
