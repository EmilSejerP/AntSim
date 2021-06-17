import processing.core.PApplet;
import processing.core.PVector;

public abstract class VisualObject {

    PVector Position;
    VisualObject(PVector Position){
        this.Position = Position;
    }
}
