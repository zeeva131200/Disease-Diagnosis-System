/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.Scanner;

public class Bill {
        
        public Bill() {
            
        }
        
    public void input() {    
        Bill s = new Bill ();
        Scanner sc= new Scanner (System.in);
        System.out.println("This system lets you to estimate your medical bill charges.");
        System.out.print("Enter your diagnosed disease: ");
         s.disease= sc.nextLine();
        System.out.println();
       
        System.out.print("Do you want to use voucher code. Enter yes or no : ");
        String input= sc.next();
        if(input.equalsIgnoreCase("yes")){
            System.out.print("Enter your voucher code: ");
            s.code= sc.next();
            System.out.println();
}
        else {
            System.out.println();
        }

        s.printBillInfo();
        s.checkDisease();
        
        try{
         if(s.code.equals("DISCOUNT5")){
                s.totalAD=(int)(s.totalBD*0.95);
                System.out.printf("%24s Total charges after %2s discount: RM%4d\n"," ","5%",s.totalAD);
            }
            else if(s.code.equals("DISCOUNT10")){
                s.totalAD=(int)(s.totalBD*0.9);
                System.out.printf("%23s Total charges after %2s discount: RM%4d\n"," ","10%",s.totalAD);
            }
            else{
                System.out.printf("%-20s %3s Total charges after %2s discount: RM%4d\n","INVALID VOUCHER CODE"," ","0%",s.totalBD);

            }
        }
        catch(NullPointerException e){
               System.out.printf("%24s Total charges after %2s discount: RM%4d\n"," ","0%",s.totalBD);
            }
              System.out.println("-----------------------------------------------------------------");

    }
    
   String disease,code; 
   int totalBD; int totalAD; double discount;
   String promoCode5= "DISCOUNT5";
   Scanner sc = new Scanner(System.in);   
    public void printBillInfo(){
 
            String patientName = "";
            System.out.print("Enter patient's name : ");
            patientName = sc.nextLine();
            System.out.println();
            System.out.println();
            System.out.println("-----------------------------------------------------------------");
            System.out.printf("PATIENT NAME: %5s \n" ,patientName.toUpperCase());
            System.out.printf("BILL DATE   : " + java.time.LocalDate.now());
            System.out.println();
            System.out.println();
}
    
    public void checkDisease(){
        
        if(disease.equalsIgnoreCase("covid19")|| disease.equalsIgnoreCase("coronavirus")){
              System.out.println("Medical package for COVID19 treatment ");
              System.out.println("-----------------------------------------------------------------");
                     for(int i=0; i<covid19.length;i++){
                       System.out.printf("%-50s \t | RM%3d",Tcovid19[i],covid19[i]);
                       System.out.println();
                       this.totalBD=+covid19[i];
            }
              System.out.println("-----------------------------------------------------------------");
              System.out.printf("%26s Total charges before discount: RM%4d\n"," ",totalBD);
        } 
        else if(disease.equalsIgnoreCase("TB")||disease.equalsIgnoreCase("tuberculosis")){
              System.out.println("Medical package for TB treatment ");
              System.out.println("-----------------------------------------------------------------");
                     for(int i=0; i<tb.length;i++){
                         System.out.printf("%-50s \t | RM%3d",Ttb[i],tb[i]);
                         System.out.println();
                         this.totalBD+=tb[i];
            }
              System.out.println("-----------------------------------------------------------------");
              System.out.printf("%26s Total charges before discount: RM%4d\n"," ",totalBD);
        }
        else if(disease.equalsIgnoreCase("rubella")){
             System.out.println("Medical package for RUBELLA treatment ");
              System.out.println("-----------------------------------------------------------------");
                     for(int i=0; i<rubella.length;i++){
                         System.out.printf("%-50s \t | RM%3d",Trubella[i],rubella[i]);
                         System.out.println();
                         this.totalBD+=rubella[i];
            }
              System.out.println("-----------------------------------------------------------------");
              System.out.printf("%26s Total charges before discount: RM%4d\n"," ",totalBD);
        }
        else if(disease.equalsIgnoreCase("measles")){
           System.out.println("Medical package for MEASLES treatment ");
              System.out.println("-----------------------------------------------------------------");
                     for(int i=0; i<measles.length;i++){
                         System.out.printf("%-50s \t | RM%3d",Tmeasles[i],measles[i]);
                         System.out.println();
                         this.totalBD+=measles[i];
            }
              System.out.println("-----------------------------------------------------------------");
              System.out.printf("%26s Total charges before discount: RM%4d\n"," ",totalBD);  
        }
        else if(disease.equalsIgnoreCase("HIV")||disease.equalsIgnoreCase("AIDS")){
             System.out.println("Medical package for HIV treatment ");
              System.out.println("-----------------------------------------------------------------");
                     for(int i=0; i<hiv.length;i++){
                         System.out.printf("%-50s \t | RM%3d",Thiv[i],hiv[i]);
                         System.out.println();
                         this.totalBD+=hiv[i];
            }
              System.out.println("-----------------------------------------------------------------");
              System.out.printf("%26s Total charges before discount: RM%4d\n"," ",totalBD);
        }
        else if(disease.equalsIgnoreCase("epilepsy")){
            System.out.println("Medical package for EPILEPSY treatment ");
              System.out.println("-----------------------------------------------------------------");
                     for(int i=0; i<epilepsy.length;i++){
                         System.out.printf("%-50s \t | RM%3d",Tepilepsy[i],epilepsy[i]);
                         System.out.println();
                         this.totalBD+=epilepsy[i];
            }
              System.out.println("-----------------------------------------------------------------");
              System.out.printf("%26s Total charges before discount: RM%4d\n"," ",totalBD); 
        }
        else if(disease.equalsIgnoreCase("musculoskeletal conditions")){
            System.out.println("Medical package for MUSCULOSKELETAL treatment ");
              System.out.println("-----------------------------------------------------------------");
                     for(int i=0; i<muscu.length;i++){
                         System.out.printf("%-50s \t | RM%3d",Tmuscu[i],muscu[i]);
                         System.out.println();
                         this.totalBD+=muscu[i];
            }
              System.out.println("-----------------------------------------------------------------");
              System.out.printf("%26s Total charges before discount: RM%4d\n"," ",totalBD); 
        }
        else if(disease.equalsIgnoreCase("hypertension")){
         System.out.println("Medical package for HYPERTENSION treatment ");
              System.out.println("-----------------------------------------------------------------");
                     for(int i=0; i<hypertension.length;i++){
                         System.out.printf("%-50s \t | RM%3d",Thypertension[i],hypertension[i]);
                         System.out.println();
                         this.totalBD+=hypertension[i];
            }
              System.out.println("-----------------------------------------------------------------");
              System.out.printf("%26s Total charges before discount: RM%4d\n"," ",totalBD);    
        }
        else if(disease.equalsIgnoreCase("depression")){
            System.out.println("Medical package for DEPRESSION treatment ");
              System.out.println("-----------------------------------------------------------------");
                     for(int i=0; i<depression.length;i++){
                         System.out.printf("%-50s \t | RM%3d",Tdepression[i],depression[i]);
                         System.out.println();
                         this.totalBD+=depression[i];
            }
              System.out.println("-----------------------------------------------------------------");
              System.out.printf("%26s Total charges before discount: RM%4d\n"," ",totalBD);  
        }
        else if(disease.equalsIgnoreCase("asthma")){
             System.out.println("Medical package for ASTHMA treatment ");
              System.out.println("-----------------------------------------------------------------");
                     for(int i=0; i<asthma.length;i++){
                         System.out.printf("%-50s \t | RM%3d",Tasthma[i],asthma[i]);
                         System.out.println();
                         this.totalBD+=asthma[i];
            }
              System.out.println("-----------------------------------------------------------------");
              System.out.printf("%26s Total charges before discount: RM%4d\n"," ",totalBD);  
        }
        else if(disease.equalsIgnoreCase("bipolar disorder")){
             System.out.println("Medical package for BIPOLAR DISORDER treatment ");
              System.out.println("-----------------------------------------------------------------");
                     for(int i=0; i<bipolar.length;i++){
                         System.out.printf("%-50s \t | RM%3d",Tbipolar[i],bipolar[i]);
                         System.out.println();
                         this.totalBD+=bipolar[i];
            }
              System.out.println("-----------------------------------------------------------------");
              System.out.printf("%26s Total charges before discount: RM%4d\n"," ",totalBD);  
        }
        else if(disease.equalsIgnoreCase("schizophrenia")){
             System.out.println("Medical package for SCHIZOPHRENIA treatment ");
              System.out.println("-----------------------------------------------------------------");
                     for(int i=0; i<schiz.length;i++){
                         System.out.printf("%-50s \t | RM%3d",Tschiz[i],schiz[i]);
                         System.out.println();
                         this.totalBD+=schiz[i];
            }
              System.out.println("-----------------------------------------------------------------");
              System.out.printf("%26s Total charges before discount: RM%4d\n"," ",totalBD);  
        }
        else if(disease.equalsIgnoreCase("dementia")){
             System.out.println("Medical package for DEMENTIA treatment ");
              System.out.println("-----------------------------------------------------------------");
                     for(int i=0; i<dementia.length;i++){
                         System.out.printf("%-50s \t | RM%3d",Tdementia[i],dementia[i]);
                         System.out.println();
                         this.totalBD+=dementia[i];
            }
              System.out.println("-----------------------------------------------------------------");
              System.out.printf("%26s Total charges before discount: RM%4d\n"," ",totalBD);  
        }
        else if(disease.equalsIgnoreCase("bronchitis")){
             System.out.println("Medical package for HYPERTENSION treatment ");
              System.out.println("-----------------------------------------------------------------");
                     for(int i=0; i<hypertension.length;i++){
                         System.out.printf("%-50s \t | RM%3d",Thypertension[i],hypertension[i]);
                         System.out.println();
                         this.totalBD+=hypertension[i];
            }
              System.out.println("-----------------------------------------------------------------");
              System.out.printf("%26s Total charges before discount: RM%4d\n"," ",totalBD);  
        }
        else if(disease.equalsIgnoreCase("heart attack")){
             System.out.println("Medical package for HEART ATTACK treatment ");
              System.out.println("-----------------------------------------------------------------");
                     for(int i=0; i<heartattack.length;i++){
                         System.out.printf("%-50s \t | RM%3d",Theartattack[i],heartattack[i]);
                         System.out.println();
                         this.totalBD+=heartattack[i];
            }
              System.out.println("-----------------------------------------------------------------");
              System.out.printf("%26s Total charges before discount: RM%4d\n"," ",totalBD);  
        }
        else if(disease.equalsIgnoreCase("stroke")){
             System.out.println("Medical package for STROKE treatment ");
              System.out.println("-----------------------------------------------------------------");
                     for(int i=0; i<stroke.length;i++){
                         System.out.printf("%-50s \t | RM%3d",Tstroke[i],stroke[i]);
                         System.out.println();
                         this.totalBD+=stroke[i];
            }
              System.out.println("-----------------------------------------------------------------");
              System.out.printf("%26s Total charges before discount: RM%4d\n"," ",totalBD);  
        }
        else if(disease.equalsIgnoreCase("rheumatic heart disease")){
             System.out.println("Medical package for RHEUMATIC HEART DISEASE treatment ");
              System.out.println("-----------------------------------------------------------------");
                     for(int i=0; i<rheumatic.length;i++){
                         System.out.printf("%-50s \t | RM%3d",Trheumatic[i],rheumatic[i]);
                         System.out.println();
                         this.totalBD+=rheumatic[i];
            }
              System.out.println("-----------------------------------------------------------------");
              System.out.printf("%26s Total charges before discount: RM%4d\n"," ",totalBD);  
        }
        else if(disease.equalsIgnoreCase("diabetes")){
             System.out.println("Medical package for DIABETES treatment ");
              System.out.println("-----------------------------------------------------------------");
                     for(int i=0; i<diabetes.length;i++){
                         System.out.printf("%-50s \t | RM%3d",Tdiabetes[i],diabetes[i]);
                         System.out.println();
                         this.totalBD+=diabetes[i];
            }
              System.out.println("-----------------------------------------------------------------");
              System.out.printf("%26s Total charges before discount: RM%4d\n"," ",totalBD);  
        }
         else if(disease.equalsIgnoreCase("plague")){
              System.out.println("Medical package for PLAGUE treatment ");
              System.out.println("-----------------------------------------------------------------");
                     for(int i=0; i<plague.length;i++){
                         System.out.printf("%-50s \t | RM%3d",Tplague[i],plague[i]);
                         System.out.println();
                         this.totalBD+=plague[i];
            }
              System.out.println("-----------------------------------------------------------------");
              System.out.printf("%26s Total charges before discount: RM%4d\n"," ",totalBD);  
         }
        else if(disease.equalsIgnoreCase("chronic obstructive pulmonary disease")){
             System.out.println("Medical package for CHRONIC OBSTRUCTIVE PULMONARY treatment ");
              System.out.println("-----------------------------------------------------------------");
                     for(int i=0; i<COP.length;i++){
                         System.out.printf("%-50s \t | RM%3d",TCOP[i],COP[i]);
                         System.out.println();
                         this.totalBD+=COP[i];
            }
              System.out.println("-----------------------------------------------------------------");
              System.out.printf("%26s Total charges before discount: RM%4d\n"," ",totalBD);  
        }
        else if(disease.equalsIgnoreCase("cancer")){
             System.out.println("Medical package for CANCER treatment ");
              System.out.println("-----------------------------------------------------------------");
                     for(int i=0; i<cancer.length;i++){
                         System.out.printf("%-50s \t | RM%3d",Tcancer[i],cancer[i]);
                         System.out.println();
                         this.totalBD+=cancer[i];
            }
              System.out.println("-----------------------------------------------------------------");
              System.out.printf("%26s Total charges before discount: RM%4d\n"," ",totalBD);  
        }
        else if(disease.equalsIgnoreCase("hepatitis")||disease.equalsIgnoreCase("hepatitis (A,B,C)")){
             System.out.println("Medical package for HEPATITIS treatment ");
              System.out.println("-----------------------------------------------------------------");
                     for(int i=0; i<hepatitis.length;i++){
                         System.out.printf("%-50s \t | RM%3d",Thepatitis[i],hepatitis[i]);
                         System.out.println();
                         this.totalBD+=hepatitis[i];
            }
              System.out.println("-----------------------------------------------------------------");
              System.out.printf("%26s Total charges before discount: RM%4d\n"," ",totalBD);  
        }
        else if(disease.equalsIgnoreCase("ebola")){
             System.out.println("Medical package for EBOLA treatment ");
              System.out.println("-----------------------------------------------------------------");
                     for(int i=0; i<ebola.length;i++){
                         System.out.printf("%-50s \t | RM%3d",Tebola[i],ebola[i]);
                         System.out.println();
                         this.totalBD+=ebola[i];
            }
              System.out.println("-----------------------------------------------------------------");
              System.out.printf("%26s Total charges before discount: RM%4d\n"," ",totalBD);  
        }
        else if(disease.equalsIgnoreCase("anaemia")){
             System.out.println("Medical package for ANAEMIA treatment ");
              System.out.println("-----------------------------------------------------------------");
                     for(int i=0; i<anaemia.length;i++){
                         System.out.printf("%-50s \t | RM%3d",Tanaemia[i],anaemia[i]);
                         System.out.println();
                         this.totalBD+=anaemia[i];
            }
              System.out.println("-----------------------------------------------------------------");
              System.out.printf("%26s Total charges before discount: RM%4d\n"," ",totalBD);  
        }
        else if(disease.equalsIgnoreCase("dengue")){
             System.out.println("Medical package for HYPERTENSION treatment ");
              System.out.println("-----------------------------------------------------------------");
                     for(int i=0; i<hypertension.length;i++){
                         System.out.printf("%-50s \t | RM%3d",Thypertension[i],hypertension[i]);
                         System.out.println();
                         this.totalBD+=hypertension[i];
            }
              System.out.println("-----------------------------------------------------------------");
              System.out.printf("%26s Total charges before discount: RM%4d\n"," ",totalBD);  
        }
        else if(disease.equalsIgnoreCase("diarrhoeal disease")){
             System.out.println("Medical package for DIARRHOEAL DISEASE treatment ");
              System.out.println("-----------------------------------------------------------------");
                     for(int i=0; i<diarr.length;i++){
                         System.out.printf("%-50s \t | RM%3d",Tdiarr[i],diarr[i]);
                         System.out.println();
                         this.totalBD+=diarr[i];
            }
              System.out.println("-----------------------------------------------------------------");
              System.out.printf("%26s Total charges before discount: RM%4d\n"," ",totalBD);  
        }
        else if(disease.equalsIgnoreCase("lymphatic filariasis")||disease.equalsIgnoreCase("elephantiasis")){
             System.out.println("Medical package for ELEPHANTIASIS treatment ");
              System.out.println("-----------------------------------------------------------------");
                     for(int i=0; i<ele.length;i++){
                         System.out.printf("%-50s \t | RM%3d",Tele[i],ele[i]);
                         System.out.println();
                         this.totalBD+=ele[i];
            }
              System.out.println("-----------------------------------------------------------------");
              System.out.printf("%26s Total charges before discount: RM%4d\n"," ",totalBD);  
        }
        else if(disease.equalsIgnoreCase("polio")||disease.equalsIgnoreCase("poliomyelitis")){
             System.out.println("Medical package for POLIO treatment ");
              System.out.println("-----------------------------------------------------------------");
                     for(int i=0; i<polio.length;i++){
                         System.out.printf("%-50s \t | RM%3d",Tpolio[i],polio[i]);
                         System.out.println();
                         this.totalBD+=polio[i];
            }
              System.out.println("-----------------------------------------------------------------");
              System.out.printf("%26s Total charges before discount: RM%4d\n"," ",totalBD);  
        }
        else if(disease.equalsIgnoreCase("rabies")){
             System.out.println("Medical package for RABIES treatment ");
              System.out.println("-----------------------------------------------------------------");
                     for(int i=0; i<rabie.length;i++){
                         System.out.printf("%-50s \t | RM%3d",Trabie[i],rabie[i]);
                         System.out.println();
                         this.totalBD+=rabie[i];
            }
              System.out.println("-----------------------------------------------------------------");
              System.out.printf("%26s Total charges before discount: RM%4d\n"," ",totalBD);  
        }
        else if(disease.equalsIgnoreCase("salmonella")){
             System.out.println("Medical package for SALMONELLA treatment ");
              System.out.println("-----------------------------------------------------------------");
                     for(int i=0; i<salmon.length;i++){
                         System.out.printf("%-50s \t | RM%3d",Tsalmon[i],salmon[i]);
                         System.out.println();
                         this.totalBD+=salmon[i];
            }
              System.out.println("-----------------------------------------------------------------");
              System.out.printf("%26s Total charges before discount: RM%4d\n"," ",totalBD);  
        }
        else if(disease.equalsIgnoreCase("taeniasis")){
             System.out.println("Medical package for TAENIASIS treatment ");
              System.out.println("-----------------------------------------------------------------");
                     for(int i=0; i<taen.length;i++){
                         System.out.printf("%-50s \t | RM%3d",Ttaen[i],taen[i]);
                         System.out.println();
                         this.totalBD+=taen[i];
            }
              System.out.println("-----------------------------------------------------------------");
              System.out.printf("%26s Total charges before discount: RM%4d\n"," ",totalBD);  
        }
        else if(disease.equalsIgnoreCase("tetanus")){
             System.out.println("Medical package for TETANUS treatment ");
              System.out.println("-----------------------------------------------------------------");
                     for(int i=0; i<tetan.length;i++){
                         System.out.printf("%-50s \t | RM%3d",Ttetan[i],tetan[i]);
                         System.out.println();
                         this.totalBD+=tetan[i];
            }
              System.out.println("-----------------------------------------------------------------");
              System.out.printf("%26s Total charges before discount: RM%4d\n"," ",totalBD);  
        }
         else if(disease.equalsIgnoreCase("Typhoid")){
              System.out.println("Medical package for TYPHOID treatment ");
              System.out.println("-----------------------------------------------------------------");
                     for(int i=0; i<typh.length;i++){
                         System.out.printf("%-50s \t | RM%3d",Ttyph[i],typh[i]);
                         System.out.println();
                         this.totalBD+=typh[i];
            }
              System.out.println("-----------------------------------------------------------------");
              System.out.printf("%26s Total charges before discount: RM%4d\n"," ",totalBD);  
         }
        else if(disease.equalsIgnoreCase("yellow fever")){
             System.out.println("Medical package for YELLOW FEVER treatment ");
              System.out.println("-----------------------------------------------------------------");
                     for(int i=0; i<yellow.length;i++){
                         System.out.printf("%-50s \t | RM%3d",yellow[i],yellow[i]);
                         System.out.println();
                         this.totalBD+=yellow[i];
            }
              System.out.println("-----------------------------------------------------------------");
              System.out.printf("%26s Total charges before discount: RM%4d\n"," ",totalBD);  
        }
        else if(disease.equalsIgnoreCase("zika virus")){
             System.out.println("Medical package for ZIKA VIRUS treatment ");
              System.out.println("-----------------------------------------------------------------");
                     for(int i=0; i<zika.length;i++){
                         System.out.printf("%-50s \t | RM%3d",Tzika[i],zika[i]);
                         System.out.println();
                         this.totalBD+=zika[i];
            }
              System.out.println("-----------------------------------------------------------------");
              System.out.printf("%26s Total charges before discount: RM%4d\n"," ",totalBD);  
        }
        else if(disease.equalsIgnoreCase("malaria")){
             System.out.println("Medical package for MALARIA treatment ");
              System.out.println("-----------------------------------------------------------------");
                     for(int i=0; i<malaria.length;i++){
                         System.out.printf("%-50s \t | RM%3d",Tmalaria[i],malaria[i]);
                         System.out.println();
                         this.totalBD+=malaria[i];
            }
              System.out.println("-----------------------------------------------------------------");
              System.out.printf("%26s Total charges before discount: RM%4d\n"," ",totalBD);  
        }
        else if(disease.equalsIgnoreCase("smallpox")){
             System.out.println("Medical package for SMALLPOX treatment ");
              System.out.println("-----------------------------------------------------------------");
                     for(int i=0; i<smallpox.length;i++){
                         System.out.printf("%-50s \t | RM%3d",Tsmallpox[i],smallpox[i]);
                         System.out.println();
                         this.totalBD+=smallpox[i];
            }
              System.out.println("-----------------------------------------------------------------");
              System.out.printf("%26s Total charges before discount: RM%4d\n"," ",totalBD);  
        }
        else if(disease.equalsIgnoreCase("cholera")){
             System.out.println("Medical package for CHOLERA treatment ");
              System.out.println("-----------------------------------------------------------------");
                     for(int i=0; i<cholera.length;i++){
                         System.out.printf("%-50s \t | RM%3d",Tcholera[i],cholera[i]);
                         System.out.println();
                         this.totalBD+=cholera[i];
            }
              System.out.println("-----------------------------------------------------------------");
              System.out.printf("%26s Total charges before discount: RM%4d\n"," ",totalBD);  
        }
        else if(disease.equalsIgnoreCase("pneumonia")){
             System.out.println("Medical package for PNEUMONIA treatment ");
              System.out.println("-----------------------------------------------------------------");
                     for(int i=0; i<pneu.length;i++){
                         System.out.printf("%-50s \t | RM%3d",Tpneu[i],pneu[i]);
                         System.out.println();
                         this.totalBD+=pneu[i];
            }
              System.out.println("-----------------------------------------------------------------");
              System.out.printf("%26s Total charges before discount: RM%4d\n"," ",totalBD);  
        }
        else if(disease.equalsIgnoreCase("leprosy")){
             System.out.println("Medical package for LEPROSY treatment ");
              System.out.println("-----------------------------------------------------------------");
                     for(int i=0; i<leprosy.length;i++){
                         System.out.printf("%-50s \t | RM%3d",Tleprosy[i],leprosy[i]);
                         System.out.println();
                         this.totalBD+=leprosy[i];
            }
              System.out.println("-----------------------------------------------------------------");
              System.out.printf("%26s Total charges before discount: RM%4d\n"," ",totalBD);  
        }
        else if(disease.equalsIgnoreCase("meningitis")){
             System.out.println("Medical package for MENINGITIS treatment ");
              System.out.println("-----------------------------------------------------------------");
                     for(int i=0; i<mening.length;i++){
                         System.out.printf("%-50s \t | RM%3d",Tmening[i],mening[i]);
                         System.out.println();
                         this.totalBD+=mening[i];
            }
              System.out.println("-----------------------------------------------------------------");
              System.out.printf("%26s Total charges before discount: RM%4d\n"," ",totalBD);  
        }
        else if(disease.equalsIgnoreCase("marburg virus")){
             System.out.println("Medical package for MARBURG VIRUS treatment ");
              System.out.println("-----------------------------------------------------------------");
                     for(int i=0; i<marburg.length;i++){
                         System.out.printf("%-50s \t | RM%3d",Tmarburg[i],marburg[i]);
                         System.out.println();
                         this.totalBD+=marburg[i];
            }
              System.out.println("-----------------------------------------------------------------");
              System.out.printf("%26s Total charges before discount: RM%4d\n"," ",totalBD);  
        }
        else if(disease.equalsIgnoreCase("spinal cord injury")){
             System.out.println("Medical package for SPINAL CORD INJURY treatment ");
              System.out.println("-----------------------------------------------------------------");
                     for(int i=0; i<spinal.length;i++){
                         System.out.printf("%-50s \t | RM%3d",Tspinal[i],spinal[i]);
                         System.out.println();
                         this.totalBD+=spinal[i];
            }
              System.out.println("-----------------------------------------------------------------");
              System.out.printf("%26s Total charges before discount: RM%4d\n"," ",totalBD);  
        }
        else if(disease.equalsIgnoreCase("E.coli")||disease.equalsIgnoreCase("E coli")){
             System.out.println("Medical package for E.COLI treatment ");
              System.out.println("-----------------------------------------------------------------");
                     for(int i=0; i<Ecoli.length;i++){
                         System.out.printf("%-50s \t | RM%3d",TEcoli[i],Ecoli[i]);
                         System.out.println();
                         this.totalBD+=Ecoli[i];
            }
              System.out.println("-----------------------------------------------------------------");
              System.out.printf("%26s Total charges before discount: RM%4d\n"," ",totalBD);  
        }
        else if(disease.equalsIgnoreCase("hand foot and mouth disease")){
             System.out.println("Medical package for HFM DISEASE treatment ");
              System.out.println("-----------------------------------------------------------------");
                     for(int i=0; i<hypertension.length;i++){
                         System.out.printf("%-50s \t | RM%3d",THFM[i],HFM[i]);
                         System.out.println();
                         this.totalBD+=HFM[i];
            }
              System.out.println("-----------------------------------------------------------------");
              System.out.printf("%26s Total charges before discount: RM%4d\n"," ",totalBD);  
        }
        else if(disease.equalsIgnoreCase("allergic rhinitis")||disease.equalsIgnoreCase("rhinitis")){
             System.out.println("Medical package for ELLERGIC RHINITIS treatment ");
              System.out.println("-----------------------------------------------------------------");
                     for(int i=0; i<rhini.length;i++){
                         System.out.printf("%-50s \t | RM%3d",Trhini[i],rhini[i]);
                         System.out.println();
                         this.totalBD+=rhini[i];
            }
              System.out.println("-----------------------------------------------------------------");
              System.out.printf("%26s Total charges before discount: RM%4d\n"," ",totalBD);  
        }
        else if(disease.equalsIgnoreCase("psoriasis")){
            System.out.println("Medical package for PSORIASIS treatment ");
                         System.out.println("-----------------------------------------------------------------");

             for(int i=0; i<psori.length;i++){
            System.out.printf("%-50s \t | RM%3d",Tpsori[i],psori[i]);
                 System.out.println();
            this.totalBD+=psori[i];
            }
             System.out.println("-----------------------------------------------------------------");
              System.out.printf("%26s Total charges before discount: RM%4d \n"," ",totalBD);

        }
        else if(disease.equalsIgnoreCase("lupus")||disease.equalsIgnoreCase("lupus vulgaris")){
             System.out.println("Medical package for LUPUS treatment ");
              System.out.println("-----------------------------------------------------------------");
                     for(int i=0; i<lupus.length;i++){
                         System.out.printf("%-50s \t | RM%3d",Tlupus[i],lupus[i]);
                         System.out.println();
                         this.totalBD+=lupus[i];
            }
              System.out.println("-----------------------------------------------------------------");
              System.out.printf("%26s Total charges before discount: RM%4d\n"," ",totalBD);  
        }
        else if(disease.equalsIgnoreCase("melanoma")){
             System.out.println("Medical package for MELANOMA treatment ");
              System.out.println("-----------------------------------------------------------------");
                     for(int i=0; i<melanoma.length;i++){
                         System.out.printf("%-50s \t | RM%3d",Tmelanoma[i],melanoma[i]);
                         System.out.println();
                         this.totalBD+=melanoma[i];
            }
              System.out.println("-----------------------------------------------------------------");
              System.out.printf("%26s Total charges before discount: RM%4d\n"," ",totalBD);  
        }
        else{
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Bill can't print out");
        System.out.println("Disease NOT FOUND in our database");
        System.out.println("-----------------------------------------------------------------");
        }
    }
    
    
         String []Tcovid19= {"Consultation fee"};
         String [] Tflu ={"Acetaminophen", "Consultation fee"};
         String [] Ttb ={"Antibiotics", "Consultation fee"};
         String [] Trubella ={"Consultation fee"};
         String [] Tmeasles ={"Tylenol", "Vitamin A", "Consultation fee"};
         String [] Thiv ={"Antiretroviral therapy", "Consultation fee"};
         String [] Tepilepsy ={"Surgery", "Anti-epileptic pill","Consultation fee"};
         String [] Tmuscu ={"Tylenol"," Aspirin"," Advil", "Corticosteroid injection", "Physical therapy", "Consultation fee"};
         String [] Thypertension ={"Diuretics", "Calcium channel blockers", "Consultation fee"};
         String [] Tdepression ={"Psychotherapy", "Antidepressants", "Consultation fee"};
         String [] Tasthma ={"Anti-inflammatories", "Anticholinergics", "Long-acting bronchodilators", "Consultation fee"};
         String [] Tbipolar ={"Treatment fee"};
         String [] Tschiz ={"Therapy", "Antipsychotics", "Consultation fee"};
         String [] Tdementia =  {"Occuptional therapy", "Mmemantine","Consultation fee"}; 
         String [] Theartattack=  {"Cough medicine", "Consultation fee"};
         String [] Tbronch =  {"Coronary angioplasty and stenting", "Aspirin", "Pain killer", "Consultation fee"}; 
         String [] Tstroke =  {"Treatment fee"};     
         String [] Trheumatic = {"Antibiotics", "Blood thinning medicine", "Surgery", "Consultation fee"}; 
         String [] Tdiabetes =   {"Insulin", "Consultation fee"};  
         String [] Tplague =   {"Gentamin", "Doxycycline"," Levofloxacin", "Consultation fee"};
         String [] TCOP =   {"Antibiotics", "Vaccines", "Consultation fee"};  
         String [] Tcancer =   {"Chemotherapy", "Consultation fee"}; 
         String [] Thepatitis ={"Antiviral pills", "Consultation fee"};
         String [] Tebola =    {"Consultation fee"};    
         String [] Tanaemia =    {"Treatment fee"};   
         String [] Tdengue =    {"Pain killers", "Consultation fee"};    
         String [] Tdiarr =   {"Paracetamol", "Consultation fee"};     
         String [] Tele =  {"Mectizan" , "Consultation fee"};       
         String [] Tpolio =    {"Vaccine", "Consultation fee"};   
         String [] Trabie ={"Consultation fee"};
         String [] Tsalmon =     {"Anti-diarrheals", "Antibiotics", "Consultation fee"};   
         String [] Ttaen =      {"Praziquantel " , "Albendazole ", "Consultation fee"};   
         String [] Ttetan =    {"Antitoxin", "Antibiotics", "Vaccine", "Consultation fee"};    
         String [] Ttyph =    {"Ciprofloxacin ", "Azithromycin ", "Ceftriaxone", "Consultation fee"};   
         String [] Tyellow =     {"Consultation fee"};   
         String [] Tzika =      {"Consultation fee"};   
         String [] Tmalaria =      {"Artemisinin-based combination therapy", "Consultation fee"};    
         String [] Tsmallpox =    {"Consultation fee"};     
         String [] Tcholera =      {"Antibiotics", "Zinc supplements", "Consultation fee"};   
         String [] Tpneu =      {"Antibiotics", "Cough medicine", "Painkiller", "Consultation fee"};   
         String [] Tleprosy =       {"Antibiotics" , "Anti-inflammatory pills", "Consultation fee"}; 
         String [] Tmening ={"Treatment fee"};
         String [] Tmarburg =    {"Consultation fee"};
         String [] Tspinal ={"Surgery", "Consultation fee"};
         String [] TEcoli ={"Consultation fee"};
         String [] THFM =       {"Consultation fee"};
         String [] Trhini =    {"Antihistamines", "Decongestants", "Nasal corticosteroids", "Leukotriene receptor antagonists", "Cromolyn sodium", "Consultation fee"}; 
         String [] Tpsori =    {"Corticosteroids", "Vitamin D",  "Retinoids", "Calcineurin inhibitors", "Salicylic acid", "Goeckerman therapy", "Anthralin", "Consultation fee"};   
         String [] Tlupus ={"Therapy", "Consultation fee"};
         String [] Tmelanoma ={"Surgery", "Chemotherapy","Consultation fee"};
         
    
    
    
         int []covid19= {50};
         int [] flu ={10,50};
         int [] tb ={6,50};
         int [] rubella ={50};
         int [] measles ={12,10,50};
         int [] hiv ={120,50};
         int [] epilepsy ={600,15,50};
         int [] muscu ={18,10,12,80,50};
         int [] hypertension ={14,26,50};
         int [] depression ={80,12,50};
         int [] asthma ={22,30,850,50};
         int [] bipolar ={100};
         int [] schiz ={120,23,50};
         int [] dementia =  {150,26,50};  
         int [] heartattack= {9,30};
         int [] bronch =  {850,15,10,50};
         int [] stroke =   {60};   
         int [] rheumatic =  {10,17,560,50};   
         int [] diabetes =   {21,30}; 
         int [] plague =   {23,14,17,30};  
         int [] COP =   {20,60,40};  
         int [] cancer =   {560,50}; 
         int [] hepatitis ={25,40};
         int [] ebola =    {50};    
         int [] anaemia =    {50};   
         int [] dengue =    {10,20};    
         int [] diarr =   {8,20};     
         int [] ele =  {19,30};       
         int [] polio =    {56,40};   
         int [] rabie ={30};
         int [] salmon =     {21,11,30};   
         int [] taen =      {23,14,40};   
         int [] tetan =    {20,11,69,50};    
         int [] typh =    {15,16,21,40};   
         int [] yellow =     {40};   
         int [] zika =      {40};   
         int [] malaria =      {180,50};    
         int [] smallpox =    {50};     
         int [] cholera =      {11,20,40};   
         int [] pneu =      {11,8,10,30};   
         int [] leprosy =       {11,18,30}; 
         int [] mening ={40};
         int [] marburg =    {50};
         int [] spinal ={560,50};
         int [] Ecoli ={50};
         int [] HFM =       {50};
         int [] rhini =    {16,21,24,43,15,50}; 
         int [] psori =    {19,15,24,16,43,78,55,50};   
         int [] lupus ={60,50};
         int [] melanoma ={230,670,80};

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getTotalBD() {
        return totalBD;
    }

    public void setTotalBD(int totalBD) {
        this.totalBD = totalBD;
    }

    public int getTotalAD() {
        return totalAD;
    }

    public void setTotalAD(int totalAD) {
        this.totalAD = totalAD;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getPromoCode5() {
        return promoCode5;
    }

    public void setPromoCode5(String promoCode5) {
        this.promoCode5 = promoCode5;
    }

    public String[] getTcovid19() {
        return Tcovid19;
    }

    public void setTcovid19(String[] Tcovid19) {
        this.Tcovid19 = Tcovid19;
    }

    public String[] getTflu() {
        return Tflu;
    }

    public void setTflu(String[] Tflu) {
        this.Tflu = Tflu;
    }

    public String[] getTtb() {
        return Ttb;
    }

    public void setTtb(String[] Ttb) {
        this.Ttb = Ttb;
    }

    public String[] getTrubella() {
        return Trubella;
    }

    public void setTrubella(String[] Trubella) {
        this.Trubella = Trubella;
    }

    public String[] getTmeasles() {
        return Tmeasles;
    }

    public void setTmeasles(String[] Tmeasles) {
        this.Tmeasles = Tmeasles;
    }

    public String[] getThiv() {
        return Thiv;
    }

    public void setThiv(String[] Thiv) {
        this.Thiv = Thiv;
    }

    public String[] getTepilepsy() {
        return Tepilepsy;
    }

    public void setTepilepsy(String[] Tepilepsy) {
        this.Tepilepsy = Tepilepsy;
    }

    public String[] getTmuscu() {
        return Tmuscu;
    }

    public void setTmuscu(String[] Tmuscu) {
        this.Tmuscu = Tmuscu;
    }

    public String[] getThypertension() {
        return Thypertension;
    }

    public void setThypertension(String[] Thypertension) {
        this.Thypertension = Thypertension;
    }

    public String[] getTdepression() {
        return Tdepression;
    }

    public void setTdepression(String[] Tdepression) {
        this.Tdepression = Tdepression;
    }

    public String[] getTasthma() {
        return Tasthma;
    }

    public void setTasthma(String[] Tasthma) {
        this.Tasthma = Tasthma;
    }

    public String[] getTbipolar() {
        return Tbipolar;
    }

    public void setTbipolar(String[] Tbipolar) {
        this.Tbipolar = Tbipolar;
    }

    public String[] getTschiz() {
        return Tschiz;
    }

    public void setTschiz(String[] Tschiz) {
        this.Tschiz = Tschiz;
    }

    public String[] getTdementia() {
        return Tdementia;
    }

    public void setTdementia(String[] Tdementia) {
        this.Tdementia = Tdementia;
    }

    public String[] getTheartattack() {
        return Theartattack;
    }

    public void setTheartattack(String[] Theartattack) {
        this.Theartattack = Theartattack;
    }

    public String[] getTbronch() {
        return Tbronch;
    }

    public void setTbronch(String[] Tbronch) {
        this.Tbronch = Tbronch;
    }

    public String[] getTstroke() {
        return Tstroke;
    }

    public void setTstroke(String[] Tstroke) {
        this.Tstroke = Tstroke;
    }

    public String[] getTrheumatic() {
        return Trheumatic;
    }

    public void setTrheumatic(String[] Trheumatic) {
        this.Trheumatic = Trheumatic;
    }

    public String[] getTdiabetes() {
        return Tdiabetes;
    }

    public void setTdiabetes(String[] Tdiabetes) {
        this.Tdiabetes = Tdiabetes;
    }

    public String[] getTplague() {
        return Tplague;
    }

    public void setTplague(String[] Tplague) {
        this.Tplague = Tplague;
    }

    public String[] getTCOP() {
        return TCOP;
    }

    public void setTCOP(String[] TCOP) {
        this.TCOP = TCOP;
    }

    public String[] getTcancer() {
        return Tcancer;
    }

    public void setTcancer(String[] Tcancer) {
        this.Tcancer = Tcancer;
    }

    public String[] getThepatitis() {
        return Thepatitis;
    }

    public void setThepatitis(String[] Thepatitis) {
        this.Thepatitis = Thepatitis;
    }

    public String[] getTebola() {
        return Tebola;
    }

    public void setTebola(String[] Tebola) {
        this.Tebola = Tebola;
    }

    public String[] getTanaemia() {
        return Tanaemia;
    }

    public void setTanaemia(String[] Tanaemia) {
        this.Tanaemia = Tanaemia;
    }

    public String[] getTdengue() {
        return Tdengue;
    }

    public void setTdengue(String[] Tdengue) {
        this.Tdengue = Tdengue;
    }

    public String[] getTdiarr() {
        return Tdiarr;
    }

    public void setTdiarr(String[] Tdiarr) {
        this.Tdiarr = Tdiarr;
    }

    public String[] getTele() {
        return Tele;
    }

    public void setTele(String[] Tele) {
        this.Tele = Tele;
    }

    public String[] getTpolio() {
        return Tpolio;
    }

    public void setTpolio(String[] Tpolio) {
        this.Tpolio = Tpolio;
    }

    public String[] getTrabie() {
        return Trabie;
    }

    public void setTrabie(String[] Trabie) {
        this.Trabie = Trabie;
    }

    public String[] getTsalmon() {
        return Tsalmon;
    }

    public void setTsalmon(String[] Tsalmon) {
        this.Tsalmon = Tsalmon;
    }

    public String[] getTtaen() {
        return Ttaen;
    }

    public void setTtaen(String[] Ttaen) {
        this.Ttaen = Ttaen;
    }

    public String[] getTtetan() {
        return Ttetan;
    }

    public void setTtetan(String[] Ttetan) {
        this.Ttetan = Ttetan;
    }

    public String[] getTtyph() {
        return Ttyph;
    }

    public void setTtyph(String[] Ttyph) {
        this.Ttyph = Ttyph;
    }

    public String[] getTyellow() {
        return Tyellow;
    }

    public void setTyellow(String[] Tyellow) {
        this.Tyellow = Tyellow;
    }

    public String[] getTzika() {
        return Tzika;
    }

    public void setTzika(String[] Tzika) {
        this.Tzika = Tzika;
    }

    public String[] getTmalaria() {
        return Tmalaria;
    }

    public void setTmalaria(String[] Tmalaria) {
        this.Tmalaria = Tmalaria;
    }

    public String[] getTsmallpox() {
        return Tsmallpox;
    }

    public void setTsmallpox(String[] Tsmallpox) {
        this.Tsmallpox = Tsmallpox;
    }

    public String[] getTcholera() {
        return Tcholera;
    }

    public void setTcholera(String[] Tcholera) {
        this.Tcholera = Tcholera;
    }

    public String[] getTpneu() {
        return Tpneu;
    }

    public void setTpneu(String[] Tpneu) {
        this.Tpneu = Tpneu;
    }

    public String[] getTleprosy() {
        return Tleprosy;
    }

    public void setTleprosy(String[] Tleprosy) {
        this.Tleprosy = Tleprosy;
    }

    public String[] getTmening() {
        return Tmening;
    }

    public void setTmening(String[] Tmening) {
        this.Tmening = Tmening;
    }

    public String[] getTmarburg() {
        return Tmarburg;
    }

    public void setTmarburg(String[] Tmarburg) {
        this.Tmarburg = Tmarburg;
    }

    public String[] getTspinal() {
        return Tspinal;
    }

    public void setTspinal(String[] Tspinal) {
        this.Tspinal = Tspinal;
    }

    public String[] getTEcoli() {
        return TEcoli;
    }

    public void setTEcoli(String[] TEcoli) {
        this.TEcoli = TEcoli;
    }

    public String[] getTHFM() {
        return THFM;
    }

    public void setTHFM(String[] THFM) {
        this.THFM = THFM;
    }

    public String[] getTrhini() {
        return Trhini;
    }

    public void setTrhini(String[] Trhini) {
        this.Trhini = Trhini;
    }

    public String[] getTpsori() {
        return Tpsori;
    }

    public void setTpsori(String[] Tpsori) {
        this.Tpsori = Tpsori;
    }

    public String[] getTlupus() {
        return Tlupus;
    }

    public void setTlupus(String[] Tlupus) {
        this.Tlupus = Tlupus;
    }

    public String[] getTmelanoma() {
        return Tmelanoma;
    }

    public void setTmelanoma(String[] Tmelanoma) {
        this.Tmelanoma = Tmelanoma;
    }

    public int[] getCovid19() {
        return covid19;
    }

    public void setCovid19(int[] covid19) {
        this.covid19 = covid19;
    }

    public int[] getFlu() {
        return flu;
    }

    public void setFlu(int[] flu) {
        this.flu = flu;
    }

    public int[] getTb() {
        return tb;
    }

    public void setTb(int[] tb) {
        this.tb = tb;
    }

    public int[] getRubella() {
        return rubella;
    }

    public void setRubella(int[] rubella) {
        this.rubella = rubella;
    }

    public int[] getMeasles() {
        return measles;
    }

    public void setMeasles(int[] measles) {
        this.measles = measles;
    }

    public int[] getHiv() {
        return hiv;
    }

    public void setHiv(int[] hiv) {
        this.hiv = hiv;
    }

    public int[] getEpilepsy() {
        return epilepsy;
    }

    public void setEpilepsy(int[] epilepsy) {
        this.epilepsy = epilepsy;
    }

    public int[] getMuscu() {
        return muscu;
    }

    public void setMuscu(int[] muscu) {
        this.muscu = muscu;
    }

    public int[] getHypertension() {
        return hypertension;
    }

    public void setHypertension(int[] hypertension) {
        this.hypertension = hypertension;
    }

    public int[] getDepression() {
        return depression;
    }

    public void setDepression(int[] depression) {
        this.depression = depression;
    }

    public int[] getAsthma() {
        return asthma;
    }

    public void setAsthma(int[] asthma) {
        this.asthma = asthma;
    }

    public int[] getBipolar() {
        return bipolar;
    }

    public void setBipolar(int[] bipolar) {
        this.bipolar = bipolar;
    }

    public int[] getSchiz() {
        return schiz;
    }

    public void setSchiz(int[] schiz) {
        this.schiz = schiz;
    }

    public int[] getDementia() {
        return dementia;
    }

    public void setDementia(int[] dementia) {
        this.dementia = dementia;
    }

    public int[] getHeartattack() {
        return heartattack;
    }

    public void setHeartattack(int[] heartattack) {
        this.heartattack = heartattack;
    }

    public int[] getBronch() {
        return bronch;
    }

    public void setBronch(int[] bronch) {
        this.bronch = bronch;
    }

    public int[] getStroke() {
        return stroke;
    }

    public void setStroke(int[] stroke) {
        this.stroke = stroke;
    }

    public int[] getRheumatic() {
        return rheumatic;
    }

    public void setRheumatic(int[] rheumatic) {
        this.rheumatic = rheumatic;
    }

    public int[] getDiabetes() {
        return diabetes;
    }

    public void setDiabetes(int[] diabetes) {
        this.diabetes = diabetes;
    }

    public int[] getPlague() {
        return plague;
    }

    public void setPlague(int[] plague) {
        this.plague = plague;
    }

    public int[] getCOP() {
        return COP;
    }

    public void setCOP(int[] COP) {
        this.COP = COP;
    }

    public int[] getCancer() {
        return cancer;
    }

    public void setCancer(int[] cancer) {
        this.cancer = cancer;
    }

    public int[] getHepatitis() {
        return hepatitis;
    }

    public void setHepatitis(int[] hepatitis) {
        this.hepatitis = hepatitis;
    }

    public int[] getEbola() {
        return ebola;
    }

    public void setEbola(int[] ebola) {
        this.ebola = ebola;
    }

    public int[] getAnaemia() {
        return anaemia;
    }

    public void setAnaemia(int[] anaemia) {
        this.anaemia = anaemia;
    }

    public int[] getDengue() {
        return dengue;
    }

    public void setDengue(int[] dengue) {
        this.dengue = dengue;
    }

    public int[] getDiarr() {
        return diarr;
    }

    public void setDiarr(int[] diarr) {
        this.diarr = diarr;
    }

    public int[] getEle() {
        return ele;
    }

    public void setEle(int[] ele) {
        this.ele = ele;
    }

    public int[] getPolio() {
        return polio;
    }

    public void setPolio(int[] polio) {
        this.polio = polio;
    }

    public int[] getRabie() {
        return rabie;
    }

    public void setRabie(int[] rabie) {
        this.rabie = rabie;
    }

    public int[] getSalmon() {
        return salmon;
    }

    public void setSalmon(int[] salmon) {
        this.salmon = salmon;
    }

    public int[] getTaen() {
        return taen;
    }

    public void setTaen(int[] taen) {
        this.taen = taen;
    }

    public int[] getTetan() {
        return tetan;
    }

    public void setTetan(int[] tetan) {
        this.tetan = tetan;
    }

    public int[] getTyph() {
        return typh;
    }

    public void setTyph(int[] typh) {
        this.typh = typh;
    }

    public int[] getYellow() {
        return yellow;
    }

    public void setYellow(int[] yellow) {
        this.yellow = yellow;
    }

    public int[] getZika() {
        return zika;
    }

    public void setZika(int[] zika) {
        this.zika = zika;
    }

    public int[] getMalaria() {
        return malaria;
    }

    public void setMalaria(int[] malaria) {
        this.malaria = malaria;
    }

    public int[] getSmallpox() {
        return smallpox;
    }

    public void setSmallpox(int[] smallpox) {
        this.smallpox = smallpox;
    }

    public int[] getCholera() {
        return cholera;
    }

    public void setCholera(int[] cholera) {
        this.cholera = cholera;
    }

    public int[] getPneu() {
        return pneu;
    }

    public void setPneu(int[] pneu) {
        this.pneu = pneu;
    }

    public int[] getLeprosy() {
        return leprosy;
    }

    public void setLeprosy(int[] leprosy) {
        this.leprosy = leprosy;
    }

    public int[] getMening() {
        return mening;
    }

    public void setMening(int[] mening) {
        this.mening = mening;
    }

    public int[] getMarburg() {
        return marburg;
    }

    public void setMarburg(int[] marburg) {
        this.marburg = marburg;
    }

    public int[] getSpinal() {
        return spinal;
    }

    public void setSpinal(int[] spinal) {
        this.spinal = spinal;
    }

    public int[] getEcoli() {
        return Ecoli;
    }

    public void setEcoli(int[] Ecoli) {
        this.Ecoli = Ecoli;
    }

    public int[] getHFM() {
        return HFM;
    }

    public void setHFM(int[] HFM) {
        this.HFM = HFM;
    }

    public int[] getRhini() {
        return rhini;
    }

    public void setRhini(int[] rhini) {
        this.rhini = rhini;
    }

    public int[] getPsori() {
        return psori;
    }

    public void setPsori(int[] psori) {
        this.psori = psori;
    }

    public int[] getLupus() {
        return lupus;
    }

    public void setLupus(int[] lupus) {
        this.lupus = lupus;
    }

    public int[] getMelanoma() {
        return melanoma;
    }

    public void setMelanoma(int[] melanoma) {
        this.melanoma = melanoma;
    }
        
         
         
}
    
