/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyccrypt;

import java.io.File;

/**
 *
 * @author DELL
 */
public class PYCCrypt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Encrypt en = Encrypt.getEncrypter(true);
        Decrypt de = Decrypt.getDecrypter(true);
        
        File src = new File("D:\\ekripsi\\Input (masukin sini kalo mau enkripsi)");
		File enc = new File("D:\\ekripsi\\Output");
		File dec = new File("D:\\ekripsi\\Decry");
		
		en.encrypt(src, enc);
//		de.decrypt(enc, dec);
    }
    
}