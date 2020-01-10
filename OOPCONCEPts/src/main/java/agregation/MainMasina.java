package agregation;

public class MainMasina {
    public static void main(String[] args) {
        //Masina VW de culoare alba cu motor capacitate 1 si putere 75
        //Afisam mesajul: Masina X are culoarea Y si motorul de putere Z si capacitate T
        Motor motorVW = new Motor();
        motorVW.setCapacitate(1);
        motorVW.setPutere(75);

        System.out.println("MotorVW are puterea: " + motorVW.getPutere());
        System.out.println("MotorVW are capacitatea: " + motorVW.getCapacitate());

        Masina masinaVW = new Masina(motorVW, "VW");
        masinaVW.setCuloare("alb");

        System.out.println("Maxina " + masinaVW.getNume() + " are culoarea " + masinaVW.getCuloare() +
                " si motorul de putere " + masinaVW.getMotor().getPutere() +
                " si capacitate: " + masinaVW.getMotor().getCapacitate());

        masinaVW = null;

        //chiar daca obiectul masina a fost distrus motor nu e distrus pentru ca private Motor motor, nue obiect => new Motor


    }

}
