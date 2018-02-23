import java.awt.*;

public class Ball {
    final int diam = 10;
    final int speed = 5;
    int x,y;
    double dx = speed, dy = speed;
    Board board;
    Platform platform;
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

    public void checkCollision(){
        if(getBounds().intersects(platform.getBounds())){
            if(y+(diam/2) > platform.HEIGHT){
                dy*= -1;
            }
        }

        if(getBounds().intersects(board.getBounds())){
            Menus.decreaseLives();
        }
    }

    public Rectangle getBounds(){
        return new Rectangle(x, y, diam, diam);
    }


    public void paint(Graphics g){

        g.fillOval(x, y, diam, diam);

    }



}
