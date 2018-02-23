import java.awt.*;
import java.lang.reflect.Array;

public class Brick {

    final int Height = 5;
    final int Width = Board.WIDTH/10;

    public int x,y;

    Board board;
    Game game;
    Ball ball;
    Bricks bricks;

    public void setPosition(int x, int y){
        this.x = x - Width/2;
        this.y = y - Height/2;
    }

    public void paint(Graphics g){

        g.fillRect(x, y, Width, Height);

    }





}