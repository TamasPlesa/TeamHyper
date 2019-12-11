package hu.flowacademy;

public class XWing extends LazadoGep implements Hiperhajtomu{
    public XWing(double sebesseg, boolean meghibasodhatE) {
        super(150, true);
    }

    public XWing() {
        super(150, true);
    }

    @Override
    public boolean elkapjaAVonosugar() {
        if(this.meghibasodhatE() && this.getSebesseg()<1000) {
            return true;
        }
        return false;
    }

    @Override
    public boolean legyorsuljaE(Urhajo urhajo) {
        return false;
    }

    @Override
    public double milyengyors() {
        return 0;
    }

    @Override
    public void hiperUgras() {
        double random = 0 + Math.random() * (100 - 0);
        this.setSebesseg(this.getSebesseg() + random);

    }
    @Override
    public String toString() {
        return "Az XWing " + super.toString();
    }
}
