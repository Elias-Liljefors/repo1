

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
            
        //Ikäryhmä 18-64
        if (ika == 18) {
            System.out.println("Olet juuri tullut täysi-ikäiseksi ja saat ajaa autoa"); }
        else if (ika >= 40 && ika <= 50) {
            System.out.println("Hyvää parasta keski-ikää"); }
        else if (ika >= 58 && ika < 65) {
            System.out.println("Voit mennä varhaiseläkkeelle"); }

         // Ikäryhmä 65-100
         if (ika == 65) {
            System.out.println("Hyviä eläpäiviä!"); }
        if (ika > 65) {
            System.out.println("Olet eläkeläinen"); }
        if (ika == 100) {
            System.out.println("Onneksi\n"+ "olkoon\n"+"vaan, 100-vuotias!"); } 

         // Tasavuodet
         if (ika < 100 && ika % 10 == 0) {
            System.out.println("Onneksi olkoon täytit pyöreitä!"); }

    }
}
