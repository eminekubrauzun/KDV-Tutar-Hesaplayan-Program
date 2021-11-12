/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kdv_hesaplama;
import java.util.Scanner;
/**
 *
 * @author MONSTER
 */
public class KDV_Hesaplama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //fiyat 0-1000 arası ise kdv tutarı %18, 1000'den yüksekse %8 kdv
        //kullanıcıdan alınan para değeri kdv'siz fiyat
        
        double tutar,kdvTutar,kdvliOran;
        Scanner s=new Scanner(System.in);
        System.out.print("Ücret Tutarını Giriniz: ");
        tutar=s.nextDouble();
       
        
        if (tutar<=1000)
        {    kdvTutar= tutar *0.18;
        System.out.println("KDV Tutarı:" + kdvTutar);
        }
        else
        {    kdvTutar= tutar * 0.08;
            System.out.println("KDV Tutarı:" + kdvTutar);
        }           
        kdvliOran= tutar + kdvTutar;
        
        System.out.println("Kdvsiz Tutar:" + tutar);
        System.out.println("Kdvli Tutar:" + kdvliOran);
        
        
        
        
             
        
        
        
        
    }
    
}
