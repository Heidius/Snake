import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class GamePanel extends JPanel implements ActionListener {

	//Drawing the size of the panel
	static final int SCREEN_WIDTH = 600;
	static final int SCREEN_HEIGHT = 600;
	static final int UNIT_SIZE = 20;
	static final int GAME_UNITS =(SCREEN_WIDTH*SCREEN_HEIGHT)/UNIT_SIZE;
	static final int DELAY = 75;
	
	
	// This array is going to hold all the X coordinates of the snake's bodyparts
	final int x[] = new int[GAME_UNITS];
	//This another array holds the Y's coordinates of the snake's bodyparts
	final int y[] = new int[GAME_UNITS];
	
	int bodyParts = 6;
	int applesEaten;
	
	//The following coordinates are for the apple and generated randomly.
	int appleX;
	int appleY;
	
	//The game startes with the snakes going torwards right direction.
	char direction = 'R';
	boolean running = false;
	Timer timer;
	Random random;
	
    GamePanel() {
    	random = new Random();
    	this.setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_HEIGHT));
    	this.setBackground(Color.black);
    	this.setFocusable(true);
    	this.addKeyListener(new MyKeyAdapter());
    	startGame();
    }

    public void startGame() {
    	newApple();
    	running = true;
    	timer = new Timer(DELAY,this);
    	timer.start();

    }

    public void paintComponent(Graphics g) {
    	super.paintComponent(g);
    	draw(g);

    }

    public void draw(Graphics g) {
	//The following 'for' loop draws a grid on the background of the game so it is easier to visualize the things.
		for(int i=0;i<SCREEN_HEIGHT/UNIT_SIZE;i++){
			g.drawLine(i*UNIT_SIZE, 0, i*UNIT_SIZE, SCREEN_HEIGHT);
			g.drawLine(0, i*UNIT_SIZE, SCREEN_WIDTH, SCREEN_HEIGHT);

		}

    }
    public void newApple() {
    	appleX = random.nextInt((int)(SCREEN_WIDTH/UNIT_SIZE))*UNIT_SIZE;
		appleY = random.nextInt((int)(SCREEN_HEIGHT/UNIT_SIZE))*UNIT_SIZE;
    }
    
    public void move() {

    }

    public void checkApple() {

    }

    public void checkCollisions() {

    }

    public void gameOver(Graphics g) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public class MyKeyAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {

        }

    }
}
