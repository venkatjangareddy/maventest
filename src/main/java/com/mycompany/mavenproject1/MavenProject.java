/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author vjangareddy
 */
public class MavenProject {
    
    public static void main(String[] args) throws Exception {
        // We need to provide file path as the parameter: 
        // double backquote is to avoid compiler interpret words 
        // like \test as \t (ie. as a escape sequence) 
        File file = new File("C:\\Users\\vjangareddy\\Desktop\\urls.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        while ((st = br.readLine()) != null) {
            URL url = new URL(st);
            HttpURLConnection http = (HttpURLConnection) url.openConnection();
            int statusCode = http.getResponseCode();
            //System.out.println(st + " : " + statusCode);
            if (statusCode == 200) 
            {
                System.out.println(st + " : " + statusCode);
                System.out.println("working fine");
            }
            else
            {
                System.out.println(st + " : " + statusCode);
                System.out.println("check manually");
            }
        }
        
    }
}

    

