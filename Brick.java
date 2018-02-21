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

    public void paint(Graphics g){

        g.fillRect(x, y, Width, Height);

    }





}