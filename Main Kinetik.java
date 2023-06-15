/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W04_Encapsulation;

import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class mainKinetik {
    
    double massa, kecepatan;
    
    public double getMassa() {
        return massa;
    }
    
    public void setMassa(double massa) {
        this.massa = massa;
    }
    
    public double getKecepatan() {
        return kecepatan;
    }
    
    public void setKecepatan (double kecepatan) {
        this.kecepatan = kecepatan;
    }
    
    public double kinetik() {
    return 0.5*massa*kecepatan*kecepatan;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        mainKinetik Kinetik = new mainKinetik();
        Kinetik.setKecepatan(0);
        Kinetik.setMassa(0);

        System.out.println("Masukkan Massa =");
        double massa = scanner.nextDouble();
        
        System.out.println("Masukkan Kecepatan =");
        double kecepatan = scanner.nextDouble();
        
        mainKinetik kalkulator = new mainKinetik();
        kalkulator.setKecepatan(kecepatan);
        kalkulator.setMassa(massa);


        double mainKinetik = 
        kalkulator.kinetik();
        System.out.println("Energi Kinetik ="+ mainKinetik);
        scanner.close();

    }
    
}
