/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trung;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author ADMIN
 */
public class Trung {
    int canh;
    Trung(int a){
        this.canh = a;
    }
    
    void hienthi(){
        System.out.println("Cạnh = " + this.canh);
        //println() = printline
        System.out.printf("Cạnh %d", this.canh);
        //int = %d
        //double = %f
        //Chuỗi = %s
        //Ký tự = %c
        //Boolean = %b
        //Xuống dòng = %n
        //Số thập phân 2 chữ số: %.2f
    }
    int dientich(){
        return this.canh * this.canh;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        // TODO code application logic here
        Trung j = new Trung(5);
        j.hienthi();
        j.dientich();
    }
    
}
