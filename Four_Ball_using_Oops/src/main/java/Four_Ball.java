import processing.core.PApplet;

public class Four_Ball  extends PApplet {
    private float DIAMETER;
    private int SPEED;

    public Four_Ball(int SPEED, float DIAMETER){
        this.DIAMETER=DIAMETER;
        this.SPEED=SPEED;

    }

    public float getDIAMETER() {
        return DIAMETER;
    }

    public int getSPEED() {
        return SPEED;
    }



    public void setDIAMETER(float DIAMETER) {
        this.DIAMETER = DIAMETER;
    }

    public void setSPEED(int SPEED) {
        this.SPEED = SPEED;
    }


}
