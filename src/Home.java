import processing.core.PApplet;
import processing.core.PVector;

public class Home extends VisualObject{

    Home(PVector Position){ super(Position); }

    void Draw(PApplet PE){
        PE.ellipse(Position.x,Position.y,100,100);
    }
}
