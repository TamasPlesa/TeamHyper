package hu.flowacademy;

public class XWing extends LazadoGep implements Hiperhajtomu{
    public XWing(double sebesseg, boolean meghibasodhatE) {
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
    public boolean legyorsuljaE() {
        return false;
    }

    @Override
    public double milyenGyors() {
        return 0;
    }

    @Override
    public void hiperUgras() {
        double random = 0 + Math.random() * (100 - 0);
        this.setSebesseg(this.getSebesseg() + random);
    }
}
