import org.w3c.dom.ls.LSOutput;
import processing.core.PApplet;
import processing.core.PVector;
import static processing.core.PConstants.*;


public class Ant extends VisualObject{

    Ant(PVector Position){
        super(Position);
    }
    float rotation;
    PVector toVector;


    void Draw(PApplet PE){
        PE.ellipse(Position.x,Position.y,20,20);
        Vision(PE);

    }

    void MoveTo(PVector Position){
        toVector = PVector.sub(Position,super.Position);
        toVector.setMag(1);
        rotation = toVector.heading();
        super.Position.add(toVector);
    }

    void Vision(PApplet PE){
        PE.arc(Position.x,Position.y, 80, 80, rotation-90, PI+QUARTER_PI+rotation-90, PIE);
    }

}