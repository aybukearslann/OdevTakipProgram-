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
public class OgrenciBilgileri {

    //ogrencinin adi,soyadi,yasi,ogrenci numarasi,dogum tarihi yer alsın.
    
    private String ad;
    private String soyad;
    private int yas;
    private int ogrenciNo;
    private int yapilan_odev_sayisi;
    private int yapilmayan_odev_sayisi;
    public ArrayList ders= new ArrayList();
    
    
    OgrenciBilgileri(String ad,String soyad,int yas,int ogrenciNo){
        this.ad=ad;
        this.soyad=soyad;
        this.yas=yas;
        this.ogrenciNo=ogrenciNo;
        
    }
    
    OgrenciBilgileri(String ad,String soyad,int yas,int ogrenciNo,int yapilan_odev_sayisi,int yapilmayan_odev_sayisi){       //overload yapıldı.
        this(ad, soyad, yas, ogrenciNo);
        this.yapilan_odev_sayisi=yapilan_odev_sayisi;
        this.yapilmayan_odev_sayisi=yapilmayan_odev_sayisi;
        
    }
    
    
     public void setAd(String ad){
        this.ad=ad;
    }public String getAd(){
        return ad;
    }public void setSoyad(String soyad){
        this.soyad=soyad;
    }
    public String getSoyad(){
        return soyad;
    }public void setYas(int yas){
        this.yas=yas;
    }public int getYas(){
        return yas;
    }public void setOgrenciNo(int ogrenciNo){
        this.ogrenciNo=ogrenciNo;
    }public int getOgrenciNo(){
        return ogrenciNo;
    }public void setYapilan_odev_sayisi(int yapilan_odev_sayisi){
        this.yapilan_odev_sayisi=yapilan_odev_sayisi;
    }public int getYapilan_odev_sayisi(){
        return yapilan_odev_sayisi;
    }public void setYapilmayan_odev_sayisi(int yapilmayan_odev_sayisi){
        this.yapilmayan_odev_sayisi=yapilmayan_odev_sayisi;
    }public int getYapilmayan_odev_sayisi(){
        return yapilmayan_odev_sayisi;
        
        
    }public String AdSoyad(){
        return " Ad Soyad: "+ad+""+soyad;
    }
    
    
    
    
     public String AdSoyadYasOgrenciNo(){
        return " Ad Soyad: "+ad+""+soyad+"\n Yas: "+yas+"\n Öğrenci Numarasi: "+ogrenciNo+"\n";
    }
     
        
    public void DersSecme(Dersler liste1){
        int giris,i=1;
        System.out.println("lütfen kontrol etmek istediğiniz dersin numarsını (1-2-3-4-5) giriniz");
        for(Object ders:liste1.getDers()){
                 System.out.println(i+".ders "+ders);
                 i+=1;     
        }
        
        
        Scanner secim=new Scanner(System.in);
        giris=secim.nextInt();
        
        i=1;
        String harf1;
        String tercih = "evet";
        for(Object ders1:liste1.getDers()){
            if(i==giris){
                System.out.println("\n");
                System.out.println(ders1+"'i kontrol etmek istediğinize emin misiniz?");
                Scanner harf=new Scanner(System.in);
                harf1=harf.nextLine();
                if(harf1.equals(tercih)){
                    System.out.println("\n");
                    System.out.println("Ödevler kontrol ediliyor");
            }   else{
                    break;
                }
            
                
            
        }
            i+=1;
        }
        
        
        
        
        
        
        
}
}

   
    
