package hu.flowacademy;

public class Main {

    public static void main(String[] args) {

        LazadoGep egyes = new LazadoGep(200.1, true) {
            @Override
            public boolean elkapjaAVonosugar() {
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
        };

        


    }
}
