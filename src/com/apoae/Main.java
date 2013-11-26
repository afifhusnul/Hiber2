/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apoae;

import com.apoae.model.bukuModel;
import com.apoae.service.bukuService;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
        
    
/**
 *
 * @author NUSNAFIF
 */
public class Main {
      
    /**
     * @param args the command line arguments
     */
    private static bukuService bukuService;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        ApplicationContext appContext=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        bukuService = (bukuService) appContext.getBean("bukuService");
        
//        bukuModel bk= new bukuModel();
//        b.setJudulBuku("Opo Wae");
//        b.setHrgBuku(150000);
//        bukuService.save(b);
        
        List<bukuModel> buku=bukuService.getAll();
        for (bukuModel p: buku) {
                System.out.println(p.getId()+ ' '+ p.getJudulBuku()+ ' '+ p.getHrgBuku());
        }
    }
//        public static bukuService getbukuService() {
//            return bukuService;
//    }
                    
    
}
