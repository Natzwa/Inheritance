/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Fiardika
 */
public class Tampil {
    public static void main(String[] args) {
        PinjamBuku p=new PinjamBuku();
        Scanner scan= new Scanner(System.in);
        System.out.println("===Data Peminjam Buku===");
        System.out.print("Nama Peminjam: ");
        String nama=scan.nextLine();
        System.out.print("ID Peminjam: ");
        String IP=scan.nextLine();
        p.ListBuku();
        System.out.println("Buku yang tersedia: " +p.JumlahBukuYangDipinjam(20));
        p.JumlahBukuYangDipinjam(5.0);
        
    }
    
}
