import java.awt.*;

public class Platform {


    private int x, y;

    private final int WIDTH = 50, HEIGHT = 10;

    Board board;
    Game game;
    Ball ball;

    public Platform(Board board, Game game, Ball ball){

        x = 0;
        y = 0;

        this.board = board;
        this.game = game;
        this.ball = ball;
    }

    public void move(){
        if(game.isLeftPressed()){
            if(x > 0){
                x -= 10;
            }
        }
        if(game.isRightPressed()){
            if(x + WIDTH < board.getWidth()){
                x += 10;
            }
        }
    }

    public Rectangle getBounds(){
        return new Rectangle(x , y, WIDTH, HEIGHT);
    }

    public void setPosition(int x, int y){
        this.x = x - WIDTH/2;
        this.y = y - HEIGHT/2;
    }



    public void paint(Graphics g){
        g.fillRect(x, y, WIDTH, HEIGHT);
    }


}