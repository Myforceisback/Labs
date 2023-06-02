import java.awt.*;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import javax.swing.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author sdxop
 */

class GraphForm extends JPanel{
    
    int HEIGHT, WIDTH;
    int X_MIN, X_MAX, Y_MIN, Y_MAX;
    String FORML;
    ArrayList<Double> resList = new ArrayList<>();
    
    GraphForm(ArrayList resList, int x_min, int x_max, int y_min, int y_max){
        this.HEIGHT = 1080;
        this.WIDTH = 1080;
        this.resList = resList;
        this.X_MIN = x_min;
        this.X_MAX = x_max;
        this.Y_MIN = y_min;
        this.Y_MAX = y_max;
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D G2D = (Graphics2D)g;
        G2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        G2D.draw(new Line2D.Double(0, HEIGHT / 2, WIDTH, HEIGHT / 2));
        G2D.draw(new Line2D.Double(WIDTH / 2, 0, WIDTH / 2, HEIGHT));
        int step = 0;
        //int s = WIDTH / (X_MAX - X_MIN);
        for (int i = X_MIN; i <= X_MAX; i++) {
            if (i != 0) {
                G2D.drawString(String.valueOf(i), step, HEIGHT / 2 - 5);
                G2D.drawString("|", step, HEIGHT / 2 + 5);
            }
            step += WIDTH / (X_MAX - X_MIN);
        }

        step = 0;
        for (int i = Y_MIN; i <= Y_MAX; i++) {
            if (i != 0) {
                G2D.drawString(String.valueOf(-i), WIDTH / 2 + 10, step);
                G2D.drawString("—", WIDTH / 2 - 5, step);
            }

            step += HEIGHT / (Y_MAX - Y_MIN);
        }
        
    
        G2D.setPaint(Color.RED);
        for (int i = 0; i < resList.size() - 1; i++) {
            G2D.draw(new Line2D.Double(i, -resList.get(i) + HEIGHT / 2, i + 1, -resList.get(i + 1) + HEIGHT / 2));
        }
    }

    @FunctionalInterface
    public interface Operation {
        double execute(int num);
    }
}
//Добавить лямбда выражения - done
//Сделать цифры на сетке масштабируемыми
//Перенести на сервер построение графика