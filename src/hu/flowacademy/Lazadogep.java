package hu.flowacademy;

public abstract class Lazadogep implements Urhajo {
    double sebesseg;
    boolean meghibasodhatE;

    public Lazadogep(double sebesseg, boolean meghibasodhatE) {
        this.sebesseg = sebesseg;
        this.meghibasodhatE = meghibasodhatE;
    }

    public double getSebesseg() {
        return sebesseg;
    }

    public void setSebesseg(double sebesseg) {
        this.sebesseg = sebesseg;
    }

    public boolean isMeghibasodhatE() {
        return meghibasodhatE;
    }

    public void setMeghibasodhatE(boolean meghibasodhatE) {
        this.meghibasodhatE = meghibasodhatE;
    }

    public abstract boolean elkapjaAVonosugar();

    @Override
    public boolean legyorsuljaE(Urhajo urhajo) {
        if(urhajo instanceof Lazadogep) {
            if(this.getSebesseg() > ((Lazadogep) urhajo).getSebesseg() && ((Lazadogep) urhajo).isMeghibasodhatE()); {
                return true;
            }
        }
        if (urhajo instanceof  MilleniumFalcon) {
            if (this.getSebesseg() > urhajo.milyengyors() *2) {
                return true;
            }
        }
        return false;
    }

    @Override
    public double milyengyors() {
        return this.sebesseg;
    }
}
