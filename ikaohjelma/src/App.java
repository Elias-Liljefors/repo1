

public class App {
    public static void main(String[] args) throws Exception {

        int ika = 100;
        // Tulostusehdot

        // Ikäryhmä 0-17
        if (ika > 0 && ika < 18) {
            System.out.println("Olet alaikäinen"); }
        else {
            System.out.println("Olet aikuinen"); }
        if (ika == 15) {
            System.out.println("Saat ajaa mopoa"); }
        if (ika >= 16 && ika <= 17) {
            System.out.println("Saat ajaa kevaria"); }
            

    }
}
