import javax.swing.*;
import javax.swing.text.EditorKit;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Board extends JPanel implements ActionListener{

    Ball ball;
    Platform platform;
    Bricks bricks;
    Brick brick;

    Timer timer;

    private final int EDGESPACE = 50;


    public Board(Game game) {

        setPreferredSize(new Dimension(800, 600));

        setBackground(Color.BLACK);
        ball = new Ball(this);
        bricks = new Bricks(this, game, ball, brick);
        platform = new Platform(this, game, ball);

    }

    public void GameStart(){
        ball.setPosition(getWidth()/2, getHeight()/2);
        platform.setPosition(EDGESPACE, getHeight() - EDGESPACE);
        timer = new Timer(1000 / 60, this);
        timer.start();
    }

    public void gameReset(){
        ball.setPosition(getWidth()/2, getHeight()/2);
    }
    public void gameRestart(){
        ball.setPosition(getWidth()/2, getHeight()/2);
    }
    @Override

    public void actionPerformed(ActionEvent e) {
        if(Menus.Play()) {

            ball.move();
            platform.move();

        }
        repaint();
    }

    @Override

    public void paintComponent(Graphics g){

        super.paintComponent(g);

        g.setColor(Color.red);

        if(Menus.Play()){
            ball.paint(g);
            //bricks.paint(g);
            platform.paint(g);
        }

        else if(Menus.Menu()){
            g.setColor(Color.cyan);
            g.setFont(new Font("Times New Roman", Font.BOLD, 36));
            printSimpleString("BRICK BREAKER", getWidth(), 0, (int)getHeight()/3, g);
            printSimpleString("Press *S* to start.... Or don't. Either way is fine", getWidth(), 0, (int)(getHeight()*(2.0/3)), g);
        }

        else if(Menus.Pause()){
            g.setColor(Color.orange);
            g.setFont(new Font("Serif", Font.BOLD, 36));
            printSimpleString("Why did you pause the game?", getWidth(), 0, (int)getHeight()/3, g);
            printSimpleString("Doesn't matter, just press *P* again to resume", getWidth(), 0, (int)(getHeight()*(2.0/3)), g);
        }

    }

    public int getEDGESPACE(){

        return EDGESPACE;

    }



    private void printSimpleString(String s, int width, int XPos, int YPos, Graphics g2d){

        int stringLen = (int)g2d.getFontMetrics().getStringBounds(s, g2d).getWidth();
        int start = width/2 - stringLen/2;
        g2d.drawString(s, start + XPos, YPos);

    }

}