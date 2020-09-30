/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commu.process.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author informatica
 */
public class CommunicationProcess {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            String[] tree = {"/bin/bash","-c","echo 2020informatica| sudo -S ls -la | tr 'd' 'D'"};
            Process p = Runtime.getRuntime().exec(tree);
            
            String line;
            BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));

            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
            in.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
