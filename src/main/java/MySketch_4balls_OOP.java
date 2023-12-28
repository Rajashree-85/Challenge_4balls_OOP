import processing.core.PApplet;

public class MySketch_4balls_OOP extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;

    public static void main(String[] args){
        PApplet.main("MySketch_4balls_OOP",args);
    }

    public class Ball{
        int x;
        float diameter;
        float height;
        Ball(int x,float height,float diameter){
            this.x=x;
            this.diameter=diameter;
            this.height=height;
        }

        void display(int speed){
            ellipse(x,height,diameter,diameter);
            x+=speed;
        }
    }

    int num_Balls=4;
    Ball[] ball=new Ball[num_Balls];

    @Override
    public void settings(){
        super.settings();
        size(WIDTH, HEIGHT);
    }

    public void setup() {
        for(int i=0;i<num_Balls;i++){
            ball[i]=new Ball(0, ((float) HEIGHT /5)*(i+1),DIAMETER);
        }
    }

    public void draw(){
        for(int i=0;i<num_Balls;i++){
            ball[i].display(i+1);
        }
    }
}
