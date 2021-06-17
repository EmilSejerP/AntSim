import processing.core.PApplet;
import processing.core.PVector;

public class Food extends VisualObject {

    Food (PVector Position){
        super(Position);
    }

    void Draw(PApplet PE){
        PE.fill(0);
        PE.ellipse(Position.x,Position.y,10,10);
        PE.noFill();

    }
}
