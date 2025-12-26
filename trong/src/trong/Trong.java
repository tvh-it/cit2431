/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trong;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
/**
 *
 * @author lienh
 */
public class Trong {
    public int canh;
// Hàm khởi tạo, đặt tên giống tên class
    Trong(int a)
    {
        this.canh= a;
    }
    void hienthi()
    {
        System.out.println("Cạnh = " + this.canh);
        //printIn()=printline
        System.out.printf("Cạnh %d", this.canh);
    }

    int dientich()
    {
        return this.canh * this.canh;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Trong t= new Trong(5);
        t.hienthi();
    }
    
}
