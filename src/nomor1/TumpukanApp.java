/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomor1;

/**
 *
 * @author UserPCC
 */
public class TumpukanApp {

    public static void main(String[] args) {
        Tumpukan stack = new Tumpukan(5);
        stack.push(7);
        stack.baca();
        stack.push(30);
        stack.baca();
        System.out.println("nilai teratas = " + stack.peek());
        System.out.println("Nama saya adalah maulana alamsyah");
        System.out.println("Nilai yang dihapus = " + stack.peek());
        stack.pop();
        stack.baca();
        System.out.println("");
        stack.push(40);
        stack.baca();
        stack.push(50);
        stack.baca();
       
        
    }
}
