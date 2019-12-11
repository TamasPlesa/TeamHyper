package hu.flowacademy;

public class MilleniumFalcon implements Urhajo, Hiperhajtomu {

    private double tapasztalat;

    public MilleniumFalcon() {
        this.tapasztalat = 100;
    }

    public double getTapasztalat() {
        return tapasztalat;
    }

    public void setTapasztalat(double tapasztalat) {
        this.tapasztalat = tapasztalat;
    }


    @Override
    public void hiperUgras() {
        this.tapasztalat += 500;
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
        return (this.tapasztalat * 2);
    }

    @Override
    public String toString() {
        return "Ez a MilleniumFalcon, neki " + tapasztalat + " tapasztalata van";
    }
}
