package hu.flowacademy;

public abstract class LazadoGep implements Urhajo{
    private double sebesseg;
    private boolean meghibasodhatE;



    //konstrukktor
    public LazadoGep(double sebesseg, boolean meghibasodhatE) {
        this.sebesseg = sebesseg;
        this.meghibasodhatE = meghibasodhatE;
    }




    public abstract boolean elkapjaAVonosugar();




    //getters and setters
    public double getSebesseg() {
        return sebesseg;
    }

    public double setSebesseg(double sebesseg) {
        this.sebesseg = sebesseg;
        return sebesseg;
    }

    public boolean meghibasodhatE() {
        return meghibasodhatE;
    }

    public void setMeghibasodhatE(boolean meghibasodhatE) {
        this.meghibasodhatE = meghibasodhatE;
    }






    }

