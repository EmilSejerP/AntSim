import processing.core.PApplet;
import processing.core.PVector;

public class Main extends PApplet {

    Ant ant1 = new Ant(new PVector(100,100));
    Home home = new Home(new PVector(800,400));
    Food food = new Food(new PVector(1500,700));

    public static void main(String[] args) {
        PApplet.main("Main");
    }

    public void settings(){
        size(1600,800);
    }

    public void setup(){

    }

    public void draw(){
        background(255);
        ant1.Draw(this);
        ant1.MoveTo(home.Position);
        ant1.Position = new PVector(mouseX,mouseY);
        home.Draw(this);
        food.Draw(this);


    }
}
