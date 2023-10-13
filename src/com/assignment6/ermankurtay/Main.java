package com.assignment6.ermankurtay;

import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

	
    public static void main(String[] args) {
    	
    	FileService3 obj3 = new FileService3();
        List<Pojo> model3 = obj3.read3();
        
        System.out.println("Model 3 Yearly Sales Report");
        System.out.println("-----------------------");

        
        int Sales3_2017 = calculateSum.SumbyYear(model3, 2017);
        int Sales3_2018 = calculateSum.SumbyYear(model3, 2018);
        int Sales3_2019 = calculateSum.SumbyYear(model3, 2019);
       
        System.out.println("2017 -> " + Sales3_2017);
        System.out.println("2018 -> " + Sales3_2018);
        System.out.println("2019 -> " + Sales3_2019);
        
        System.out.println("The best month for Model 3 was: " + calculateSale.bestSale(model3));
        System.out.println("The worst month for Model 3 was: " + calculateSale.worstSale(model3) + "\n");

  
     
        FileServiceS objS = new FileServiceS();
        List<Pojo> modelS = objS.readS();

        System.out.println("Model S Yearly Sales Report");
        System.out.println("-----------------------");
        
        int SalesS_2016 = calculateSum.SumbyYear(modelS, 2016);
        int SalesS_2017 = calculateSum.SumbyYear(modelS, 2017);
        int SalesS_2018 = calculateSum.SumbyYear(modelS, 2018);
        int SalesS_2019 = calculateSum.SumbyYear(modelS, 2019);
        
        System.out.println("2016 -> " + SalesS_2016);
        System.out.println("2017 -> " + SalesS_2017);
        System.out.println("2018 -> " + SalesS_2018);
        System.out.println("2019 -> " + SalesS_2019);
        
        System.out.println("The best month for Model S was: "  + calculateSale.bestSale(modelS));
        System.out.println("The worst month for Model S was: " + calculateSale.worstSale(modelS)+ "\n");
             
        
        
        FileServiceX objX = new FileServiceX();
        List<Pojo> modelX = objX.readX();

        System.out.println("Model X Yearly Sales Report");
        System.out.println("-----------------------");

        int SalesX_2016 = calculateSum.SumbyYear(modelX, 2016);
        int SalesX_2017 = calculateSum.SumbyYear(modelX, 2017);
        int SalesX_2018 = calculateSum.SumbyYear(modelX, 2018);
        int SalesX_2019 = calculateSum.SumbyYear(modelX, 2019);
        
        System.out.println("2016 -> " + SalesX_2016);
        System.out.println("2017 -> " + SalesX_2017);
        System.out.println("2018 -> " + SalesX_2018);
        System.out.println("2019 -> " + SalesX_2019);
        
        System.out.println("The best month for Model X was: " + calculateSale.bestSale(modelX));
        System.out.println("The best month for Model X was: " + calculateSale.worstSale(modelX));

      
        
      
        
        
        
    }}