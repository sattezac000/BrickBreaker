import java.awt.*;

public class Ball {
    final int diam = 30;
    final int speed = 5;
    int x,y;
    double dx = speed, dy = speed;
    Board board;
    public Ball(Board board){
        this.board = board;
        x = 0;
        y = 0;
    }

    public void move(){
        if(y+diam > board.getHeight() || y < 0) {
            dy *= -1;
        }

        if(x + diam > board.getWidth() || x < 0){
            dx*= -1;
        }

        y += dy;
        x += dx;
    }

    public int getX(){
        return x;

    }

    public int getY(){
        return y;
    }

    public int getDiam(){
      return diam;
    }

    public void setPosition(int x, int y){
        this.x = x - diam/2;
        this.y = y - diam/2;
    }

    public void paint(Graphics g){

        g.fillOval(x, y, diam, diam);

    }



}
