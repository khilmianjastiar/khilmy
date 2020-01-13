package Aplikasi;
import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASNA
 */
public class aplikasi {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args){
        
        Queue<String>anggotakeluarga = new LinkedList<>();
        
        anggotakeluarga.add("aldi");
        anggotakeluarga.add("ngantong");
        anggotakeluarga.add("akmalia");
        anggotakeluarga.add("aliyah");
        anggotakeluarga.add("nur auliani");
        
        System.out.println("Anggota : "+anggotakeluarga);
        
        //method.remove()
        //tampilmethod.remove()
        String nama = anggotakeluarga.remove();
        
        System.out.println("Menghapus Nama dari Anggota : " + nama + "| Daftar Anggota Baru :"+anggotakeluarga);
        
        //method.poll()
        //tampilmethod.poll()
       nama = anggotakeluarga.poll();
        
        System.out.println("Menghapus Nama dari Anggota : "+nama+ "| Daftar Anggota Baru :"+anggotakeluarga);
        
    }
}
