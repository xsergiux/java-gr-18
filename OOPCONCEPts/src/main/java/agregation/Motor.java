package agregation;

public class Motor {
    private int putere;
    private double capacitate;

    public Motor(){
        this.capacitate = 0.8;
        this.putere = 75;
    }

    public int getPutere() {
        return putere;
    }

    public void setPutere(int putere) {
        if (putere < 75) {
            System.out.println("NU PUTETI INTRODUCE O VALOARE MAI MICA DECAT 75 PENTRU PUTERE");
        }else{
            this.putere = putere;
        }
    }

    public double getCapacitate() {
        return capacitate;
    }

    public void setCapacitate(double capacitate) {
        if (capacitate < 0.8 ) {
            System.out.println("NU PUTETI INTRODUCE O VALOARE MAI MICA DECAT 0.8 PENTRU CAPACITATE");
        }else{
            this.capacitate = capacitate;
        }
    }
}
