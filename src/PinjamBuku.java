/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fiardika
 */
public class PinjamBuku extends Perpus{
    public String nama;
    public int IP;
    public int JumlahBuku;
   
    //overriding
    public void IdentitasPeminjam(){
        System.out.println("nama peminjam: " +nama);
        System.out.println("ID Peminjam: " +IP);   
    }
    public void ListBuku(){
        System.out.println("Jenis Buku: " +super.genre);
    }
    //overloading
    public int JumlahBukuYangDipinjam(int jumlahBuku){
        this.JumlahBuku=jumlahBuku;
        return JumlahBuku;
    } 
    public void JumlahBukuYangDipinjam(double TotalBuku){
        System.out.println("Jumlah buku yang dipinjam: " +TotalBuku);
    }

}
       

