package hu.flowacademy;

public class MilleniumFalcon implements Urhajo, Hiperhajtomu {
    private double tapasztalat;


    @Override
    public void hiperUgras() {
    }

    @Override
    public boolean legyorsuljaE() {
        if(this.milyengyors() > milyengyors()) {
            return true;
        }
        return false;
    }

    @Override
    public double milyengyors() {
        return tapasztalat * 2;
    }

    public MilleniumFalcon(double tapasztalat) {
        this.tapasztalat = 100;
    }
}
