/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package odevtakipprogrami;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author aybukearslan
 */


public class OdevTakipProgrami {

    public static void main(String[] args) {
        // TODO code application logic here
        //ogrenci bilgilerini bir arraylistte topla
        
        OgrenciBilgileri o1=new OgrenciBilgileri("Emre"," ARSLAN",19,171418002);
        OgrenciBilgileri o2=new OgrenciBilgileri("Tuğbanur Aybüke"," ARSLAN",19,170418035);
        OgrenciBilgileri o3=new OgrenciBilgileri("Yusuf Hayri","ERTÜRK",21,171418034);
        OgrenciBilgileri o4=new OgrenciBilgileri("İsmet Haktan ","KOÇYİĞİT",19,171418026);
        OgrenciBilgileri o5=new OgrenciBilgileri("Ömer Faruk","YEŞİLYURT",19,170418025);

        OgrenciBilgileri ogrenci1=new OgrenciBilgileri("Emre"," ARSLAN",19,171418002,6,3);
        OgrenciBilgileri ogrenci2=new OgrenciBilgileri("Tuğbanur Aybüke"," ARSLAN",19,170418035,9,0);
        OgrenciBilgileri ogrenci3=new OgrenciBilgileri("Yusuf Hayri","ERTÜRK",21,171418034,7,2);
        OgrenciBilgileri ogrenci4=new OgrenciBilgileri("İsmet Haktan ","KOÇYİĞİT",19,171418026,5,4);
        OgrenciBilgileri ogrenci5=new OgrenciBilgileri("Ömer Faruk","YEŞİLYURT",19,170418025,1,8);
      
                
        ArrayList d= new ArrayList();
        d.add("Programlama1");
        d.add("Programlama2");
        d.add("Nesne Yönemli Programlama");
        d.add("Mantık Devreleri");
        d.add("Bilgisayar Mühendisliğine Giriş");
        
        Dersler d1=new Dersler(d);
       
        
                
        ArrayList<OgrenciBilgileri> liste=new ArrayList<>();
        liste.add(o1);
        liste.add(o2);
        liste.add(o3);
        liste.add(o4);
        liste.add(o5);
        

        
        ArrayList<Dersler> liste1=new ArrayList<>();
        liste1.add(d1);

        ArrayList a=new ArrayList();
        
        Odevler odev1=new Odevler(a);
        
        ArrayList<Odevler> liste2=new ArrayList<>();
        
        
        
        
        System.out.println("Ödevini kontrol etmek istediğiniz öğrenci numarasını seçiniz:");
        
        Scanner secim=new Scanner(System.in);
        int ogrenciNo1;
        ogrenciNo1=secim.nextInt();
        
        for(OgrenciBilgileri ogrenci:liste){
            if(ogrenci.getOgrenciNo()==ogrenciNo1){
                System.out.println(ogrenci.AdSoyadYasOgrenciNo());
                System.out.println("\n");
                for(Dersler ders:liste1){
                   ogrenci.DersSecme(d1);
               
                }
            }
                
        }
       
        System.out.println( "Ogrencinin "+ogrenci1.getYapilan_odev_sayisi()+" tane odev yapılmıştır, "+ogrenci1.getYapilmayan_odev_sayisi()+" tane odev yapılmamıştır.");
 
}
}

