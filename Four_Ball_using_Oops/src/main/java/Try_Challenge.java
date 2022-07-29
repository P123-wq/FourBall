import processing.core.PApplet;

public class Try_Challenge extends PApplet {
    public static final int WIDTH = 648;
    public static final float HEIGHT = 500;


    public static void main(String[] args) {

        PApplet.main("Try_Challenge", args);

    }


    @Override
    public void settings() {
        super.settings();
        size(WIDTH, (int) HEIGHT);

    }

    @Override
    public void setup() {

    }
    Four_Ball ball1=new Four_Ball(1,100);
    Four_Ball ball2=new Four_Ball(2,100);
    Four_Ball ball3=new Four_Ball(3,100);
    Four_Ball ball4=new Four_Ball(4,100);





    @Override
    public void draw() {
        Draw_cir();

    }


int P1=0,P2=0,P3=0,P4=0;


    private void Draw_cir() {


        ellipse(P1+=ball1.getSPEED(),HEIGHT/5,ball1.getDIAMETER()/6,ball1.getDIAMETER()/6);
        ellipse(P2+=ball2.getSPEED(),HEIGHT *2/5,ball2.getDIAMETER()/6,ball2.getDIAMETER()/6);
        ellipse(P3+=ball3.getSPEED(),HEIGHT *3/5,ball3.getDIAMETER()/6,ball3.getDIAMETER()/6);
        ellipse(P4+=ball4.getSPEED(),HEIGHT*4/5,ball4.getDIAMETER()/6,ball4.getDIAMETER()/6);

    }


}






