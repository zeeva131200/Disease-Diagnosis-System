/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROJECT;

import java.util.Scanner;

public class MedicDiag {
   Scanner sc = new Scanner(System.in);
   private String symp;
   private String [] symptoms;
   private final String [] covid19 = {"fever","dry","cough","tiredness","difficulty","breathing","shortness","breath","chest","pain","pressure","loss","speech","movement"};
   private final String [] flu = {"fever","dry","cough","headache","muscle","joint","pain","sore","throat","runny","nose"};
   private final String [] tb = {"prolonged","cough","chest","pain","weakness","fatigue","weight","loss","fever","night","sweats",};
   private final String [] rubella = {"rash","fever","nausea","mild","conjunctivitis","swollen","lymph","nodes","ears","neck",};
   private final String [] measles = {"fever","runny","nose","cough","red","watery","eyes","white","spots","cheeks","rash"};
   private final String [] hiv = {"fever","headache","rash","sore","throat","weight","loss","diarrhoea","cough","swollen","lymph","nodes"};
   private final String [] epilepsy = {"loss","awareness","consciousness","mood","swings","vision","hearing","taste","cognitive","functions","disturbances"};
   private final String [] muscu = {"pain","restricted","movement","mobility"};
   private final String [] hypertension = {"nosebleeds","headache","irregular","heart","rythms","vision","changes","buzzing","ears","fatigue","nausea","vomiting","confusion","anxiety","chest","pain","muscle","tremors"};
   private final String [] depression = {"sadness","loss","interest","pleasure","guilt","low","self","worth","sleep","appetite","tiredness","poor","concentration","suicidal"};
   private final String [] asthma = {"breathlessness","coughing","wheezing"};
   private final String [] bipolar = {"manic","depressive","episodes","separated","periods","normal","mood"};
   private final String [] schiz = {"hallucinations","delusion","abnormal","behaviour","disorganised","speech","changes","disturbances","emotions"};
   private final String [] dementia = {"forgetfullness","loss","track","time","lost","familiar","places","faces"};
   private final String [] bronch = {"breathlessness","chronic","cough","mucous","sputum","production"};
   private final String [] heart = {"pain","discomfort","centre","chest","arms","left","shoulder","elbows","jaw","back"};
   private final String [] stroke = {"sudden","weakness","face","arm","leg","one","side","body","numbness"};
   private final String [] rheumatic = {"shortness","breath","fatigue","irregular","heartbeats","chest","pain","fainting"};
   private final String [] diabetes = {"excessive","excretion","urine","thirst","constant","hunger","weight","loss","vision","changes","fatigue","kidney","failure","leg","nerve","pain","damage"};
   private final String [] plague = {"fever","chills","head","nausea","vomiting"};
   private final String [] COP = {"breathlessness","chronic","cough","sputum","mucous","production"};
   private final String [] cancer = {"lumps","sores","not","heal","abnormal","bleeding","persistent","indigestion","hoarseness"};
   private final String [] hepatitis = {"fever","malaise","loss","appetite","diarhoea","abdominal","discomfort","dark","coloured","urine","nausea","jaundice"};
   private final String [] ebola = {"fever","muscle","pain","headache","sore","throat","diarrhea","rash","impaired","fatigue","nausea","vomiting","kidney","liver","functions"};
   private final String [] anaemia = {"fatigue","weakness","dizziness","drowsiness"};
   private final String [] dengue = {"fever","headache","pain","behind","eyes","muscle","joint","pain","rash","swollen","nausea","glands","fatigue"};
   private final String [] diarr = {"restlessness","irritability","sunken","eyes","thirsty"};
   private final String [] ele = {"acute","attack","pain","swelling","fever","chills","damage","kidneys","lymphatic","lymphoedema","tissue","skin","thickening","limbs","scrotal","pain"};
   private final String [] polio = {"fever","headache","fatigue","stiffness","neck","pain","limbs","paralysis","vomiting"};
   private final String [] rabie = {"fever","pain","tingling","prickling","burning","sensation","wound","site","unusual"};
   private final String [] salmon = {"fever","abdominal","pain","nausea","vomiting","diarrhoea"};
   private final String [] taen = {"abdominal","pain","diarrhoea","nausea"};
   private final String [] tetan = {"jaw","cramping","triggered","sudden","noises","trouble","swallowing","seizures","headache","fever","sweating","changes","blood","pressure","muscle","spasms"};
   private final String [] typh = {"prolonged","headache","fever","abdominal","constipation","diarrhea","rash","fatigue","nausea","pain"};
   private final String [] yellow = {"fever","headache","backache","prominent","loss","appetite","nausea","vomiting","pain","muscle"};
   private final String [] zika = {"fever","rash","conjunctivitis","joint","malaise","headache","pain","muscle"};
   private final String [] malaria = {"fever","headache","chills","anaemia","vomiting"};
   private final String [] smallpox = {"high","fever","fatigue","rash",};
   private final String [] cholera = {"severe","acute","watery","diarrhoea","severe","dehydration"};
   private final String [] pneu = {"cough","difficulty","irregular","breathing","fast","low","fever"};
   private final String [] leprosy = {"skin","lesion","sensory","loss","thickened","nerves","skin","smears"};
   private final String [] mening = {"headache","stiff","neck","sensitivity","light","confusion","vomiting","high","fever"};
   private final String [] marburg = {"severe","headache","high","fever","malaise","cramping","nausea","vomiting","abdominal","watery","diarrhea","pain","muscle","ache"};
   private final String [] spinal = {"partial","complete","loss","sensory","functions","motor","control","arms","legs","body"};
   private final String [] Ecoli = {"abdominal","cramps","vomiting","diarrhea","fever"};
   private final String [] HFM = {"fever","sores","mouth","rash","blisters","hands","feets","buttocks","painful"};
   private final String [] rhini = {"headache","nasal","yellow","secretions","cold","hay","fever","nasal","polyps"};
   private final String [] psori = {"sores","scaling","skin"};
   private final String [] lupus = {"large","ulcers","face","neck"};
   private final String [] melanoma = {"new","mole","colour","changes","shape","size","sensation","old","spot","freckle","mole"};

   private final int [] count = new int [50];
   private int do0=0,do1=0,do2=0,do3=0,do4=0,do5=0,do6=0,do7=0,do8=0,do9=0,do10=0,do11=0,do12=0,do13=0,do14=0,do15=0,do16=0,do17=0,do18=0,do19=0,do20=0,do21=0,do22=0,do23=0,do24=0,do25=0,do26=0,do27=0,do28=0,do29=0,do30=0,do31=0,do32=0,do33=0,do34=0,do35=0,do36=0,do37=0,do38=0,do39=0,do40=0,do41=0,do42=0,do43=0,do44=0,do45=0,do46=0,do47=0,do48=0,do49=0,do50=0;
   public MedicDiag() {
   
    }
    
    public void input() {
        System.out.println("We will now try to identify a disease based on the symptoms you experience.");
        System.out.print("Please enter your symptoms (without comma) : ");
        symp = sc.nextLine();
         String [] symps = symp.split(" ");
         this.symptoms = symps;
    }
    
    public void check() {
         for(int j=0;j<symptoms.length;j++) {
            String x = symptoms[j];
            
        for(int i=0;i<covid19.length;i++) {
            if(x.equalsIgnoreCase(covid19[i])) {
                do0=1;
                count[0]+=do0;
            }
            }

        for(int i=0;i<flu.length;i++) {
            if(x.equalsIgnoreCase(flu[i])) {
                 do1=1;
                 count[1]+=do1;
            }
            }

        for(int i=0;i<tb.length;i++) {
            if(x.equalsIgnoreCase(tb[i])) {
                  do2=1;
                 count[2]+=do2;
                 }
            }
        
        for(int i=0;i<rubella.length;i++) {
            if(x.equalsIgnoreCase(rubella[i])) {
                  do3=1;
                 count[3]+=do3;
                 }
            }

        for(int i=0;i<measles.length;i++) {
            if(x.equalsIgnoreCase(measles[i])) {
                  do4=1;
                 count[4]+=do4;
                 }
            }
        
        for(int i=0;i<hiv.length;i++) {
            if(x.equalsIgnoreCase(hiv[i])) {
                  do5=1;
                 count[5]+=do5;
                 }
            }
        
        for(int i=0;i<epilepsy.length;i++) {
            if(x.equalsIgnoreCase(epilepsy[i])) {
                  do6=1;
                 count[6]+=do6;
                 }
            }
        
        for(int i=0;i<muscu.length;i++) {
            if(x.equalsIgnoreCase(muscu[i])) {
                  do7=1;
                 count[7]+=do7;
                 }
            }
        
        for(int i=0;i<hypertension.length;i++) {
            if(x.equalsIgnoreCase(hypertension[i])) {
                  do8=1;
                 count[8]+=do8;
                 }
            }
        
        for(int i=0;i<depression.length;i++) {
            if(x.equalsIgnoreCase(depression[i])) {
                  do9=1;
                 count[9]+=do9;
                 }
            }
        
        for(int i=0;i<asthma.length;i++) {
            if(x.equalsIgnoreCase(asthma[i])) {
                  do10=1;
                 count[10]+=do10;
                 }
            }
        
        for(int i=0;i<bipolar.length;i++) {
            if(x.equalsIgnoreCase(bipolar[i])) {
                  do11=1;
                 count[11]+=do11;
                 }
            }
        
        for(int i=0;i<schiz.length;i++) {
            if(x.equalsIgnoreCase(schiz[i])) {
                  do12=1;
                 count[12]+=do12;
                 }
            }
        
        for(int i=0;i<dementia.length;i++) {
            if(x.equalsIgnoreCase(dementia[i])) {
                  do13=1;
                 count[13]+=do13;
                 }
            }
        
        for(int i=0;i<bronch.length;i++) {
            if(x.equalsIgnoreCase(bronch[i])) {
                  do14=1;
                 count[14]+=do14;
                 }
            }
        
        for(int i=0;i<heart.length;i++) {
            if(x.equalsIgnoreCase(heart[i])) {
                  do15=1;
                 count[15]+=do15;
                 }
            }
        
        for(int i=0;i<stroke.length;i++) {
            if(x.equalsIgnoreCase(stroke[i])) {
                  do16=1;
                 count[16]+=do16;
                 }
            }
        
        for(int i=0;i<rheumatic.length;i++) {
            if(x.equalsIgnoreCase(rheumatic[i])) {
                  do17=1;
                 count[17]+=do17;
                 }
            }
        
        for(int i=0;i<diabetes.length;i++) {
            if(x.equalsIgnoreCase(diabetes[i])) {
                  do18=1;
                 count[18]+=do18;
                 }
            }
        
        for(int i=0;i<plague.length;i++) {
            if(x.equalsIgnoreCase(plague[i])) {
                  do19=1;
                 count[19]+=do19;
                 }
            }
        
        for(int i=0;i<COP.length;i++) {
            if(x.equalsIgnoreCase(COP[i])) {
                  do20=1;
                 count[20]+=do20;
                 }
            }
        
        for(int i=0;i<cancer.length;i++) {
            if(x.equalsIgnoreCase(cancer[i])) {
                  do21=1;
                 count[21]+=do21;
                 }
            }
        
        for(int i=0;i<hepatitis.length;i++) {
            if(x.equalsIgnoreCase(hepatitis[i])) {
                  do22=1;
                 count[22]+=do22;
                 }
            }
        
        for(int i=0;i<ebola.length;i++) {
            if(x.equalsIgnoreCase(ebola[i])) {
                  do23=1;
                 count[23]+=do23;
                 }
            }
        
        for(int i=0;i<anaemia.length;i++) {
            if(x.equalsIgnoreCase(anaemia[i])) {
                  do24=1;
                 count[24]+=do24;
                 }
            }
        
        for(int i=0;i<dengue.length;i++) {
            if(x.equalsIgnoreCase(dengue[i])) {
                  do25=1;
                 count[25]+=do25;
                 }
            }
        
        for(int i=0;i<diarr.length;i++) {
            if(x.equalsIgnoreCase(diarr[i])) {
                  do26=1;
                 count[26]+=do26;
                 }
            }
        
        for(int i=0;i<ele.length;i++) {
            if(x.equalsIgnoreCase(ele[i])) {
                  do27=1;
                 count[27]+=do27;
                 }
            }
        
        for(int i=0;i<polio.length;i++) {
            if(x.equalsIgnoreCase(polio[i])) {
                  do28=1;
                 count[28]+=do28;
                 }
            }
        
        for(int i=0;i<rabie.length;i++) {
            if(x.equalsIgnoreCase(rabie[i])) {
                  do29=1;
                 count[29]+=do29;
                 }
            }
        
        for(int i=0;i<salmon.length;i++) {
            if(x.equalsIgnoreCase(salmon[i])) {
                  do30=1;
                 count[30]+=do30;
                 }
            }
        
        for(int i=0;i<taen.length;i++) {
            if(x.equalsIgnoreCase(taen[i])) {
                  do31=1;
                 count[31]+=do31;
                 }
            }
        
        for(int i=0;i<tetan.length;i++) {
            if(x.equalsIgnoreCase(tetan[i])) {
                  do32=1;
                 count[32]+=do32;
                 }
            }
        
        for(int i=0;i<typh.length;i++) {
            if(x.equalsIgnoreCase(typh[i])) {
                  do33=1;
                 count[33]+=do33;
                 }
            }
        
        for(int i=0;i<yellow.length;i++) {
            if(x.equalsIgnoreCase(yellow[i])) {
                  do34=1;
                 count[34]+=do34;
                 }
            }
        
        for(int i=0;i<zika.length;i++) {
            if(x.equalsIgnoreCase(zika[i])) {
                  do35=1;
                 count[35]+=do35;
                 }
            }
        
        for(int i=0;i<malaria.length;i++) {
            if(x.equalsIgnoreCase(malaria[i])) {
                  do36=1;
                 count[36]+=do36;
                 }
            }
        
        for(int i=0;i<smallpox.length;i++) {
            if(x.equalsIgnoreCase(smallpox[i])) {
                  do37=1;
                 count[37]+=do37;
                 }
            }
        
        for(int i=0;i<cholera.length;i++) {
            if(x.equalsIgnoreCase(cholera[i])) {
                  do38=1;
                 count[38]+=do38;
                 }
            }
        
        for(int i=0;i<pneu.length;i++) {
            if(x.equalsIgnoreCase(pneu[i])) {
                  do39=1;
                 count[39]+=do39;
                 }
            }
        
        for(int i=0;i<leprosy.length;i++) {
            if(x.equalsIgnoreCase(leprosy[i])) {
                  do40=1;
                 count[40]+=do40;
                 }
            }
        
        for(int i=0;i<mening.length;i++) {
            if(x.equalsIgnoreCase(mening[i])) {
                  do41=1;
                 count[41]+=do41;
                 }
            }
        
        for(int i=0;i<marburg.length;i++) {
            if(x.equalsIgnoreCase(marburg[i])) {
                  do42=1;
                 count[42]+=do42;
                 }
            }
        
        for(int i=0;i<spinal.length;i++) {
            if(x.equalsIgnoreCase(spinal[i])) {
                  do43=1;
                 count[43]+=do43;
                 }
            }
        
        for(int i=0;i<Ecoli.length;i++) {
            if(x.equalsIgnoreCase(Ecoli[i])) {
                  do44=1;
                 count[44]+=do44;
                 }
            }
        
        for(int i=0;i<HFM.length;i++) {
            if(x.equalsIgnoreCase(HFM[i])) {
                  do45=1;
                 count[45]+=do45;
                 }
            }
        
        for(int i=0;i<rhini.length;i++) {
            if(x.equalsIgnoreCase(rhini[i])) {
                  do46=1;
                 count[46]+=do46;
                 }
            }
        
        for(int i=0;i<psori.length;i++) {
            if(x.equalsIgnoreCase(psori[i])) {
                  do47=1;
                 count[47]+=do47;
                 }
            }
        
        for(int i=0;i<lupus.length;i++) {
            if(x.equalsIgnoreCase(lupus[i])) {
                  do48=1;
                 count[48]+=do48;
                 }
            }
        
        for(int i=0;i<melanoma.length;i++) {
            if(x.equalsIgnoreCase(melanoma[i])) {
                  do49=1;
                 count[49]+=do49;
                 }
            }
        }
    }
    
    public void disease() {
        int max = count[0];
        for(int k=0;k<count.length;k++) {
            if(count[k]>max) {
             max = count[k];   
            }     
        }
        
        if(max==count[0]) {
            System.out.println(" you most probably have Covid 19");
        }
        else if (max==count[1]) {
            System.out.println("you most probably have Common Cold");
        }
        else if (max==count[2]) {
            System.out.println("you most probably have Tuberculosis");
        }
        else if (max==count[3]) {
            System.out.println("you most probably have Rubella");
        }
        else if (max==count[4]) {
            System.out.println("you most probably have Measles");
        }
        else if (max==count[5]) {
            System.out.println("you most probably have HIV/AIDS");
        }
        else if (max==count[6]) {
            System.out.println("you most probably have Epilepsy");
        }
        else if (max==count[7]) {
            System.out.println("you most probably have Musculoskeletal condition");
        }
        else if (max==count[8]) {
            System.out.println("you most probably have Hypertension");
        }
        else if (max==count[9]) {
            System.out.println("you most probably have Depression");
        }
        else if (max==count[10]) {
            System.out.println("you most probably have Asthma");
        }
        else if (max==count[11]) {
            System.out.println("you most probably have Bipolar Disorder");
        }
        else if (max==count[12]) {
            System.out.println("you most probably have Schizophrenia");
        }
        else if (max==count[13]) {
            System.out.println("you most probably have Dementia");
        }
        else if (max==count[14]) {
            System.out.println("you most probably have Bronchitis");
        }
        else if (max==count[15]) {
            System.out.println("you most probably have Heart Attack");
        }
        else if (max==count[16]) {
            System.out.println("you most probably have Stroke");
        }
        else if (max==count[17]) {
            System.out.println("you most probably have Rheumatic heart disease");
        }
        else if (max==count[18]) {
            System.out.println("you most probably have Diabetes");
        }
        else if (max==count[19]) {
            System.out.println("you most probably have Plague");
        }
        else if (max==count[20]) {
            System.out.println("you most probably have Chronic Obstructive Pulmonary");
        }
        else if (max==count[21]) {
            System.out.println("you most probably have Cancer");
        }
        else if (max==count[22]) {
            System.out.println("you most probably have Hepatitis (A/B/C)");
        }
        else if (max==count[23]) {
            System.out.println("you most probably have Ebola Virus");
        }
        else if (max==count[24]) {
            System.out.println("you most probably have Anaemia");
        }
        else if (max==count[25]) {
            System.out.println("you most probably have Dengue");
        }
        else if (max==count[26]) {
            System.out.println("you most probably have Diarrhoeal disease");
        }
        else if (max==count[27]) {
            System.out.println("you most probably have Lympahatic Filariasis (Elephantiasis)");
        }
        else if (max==count[28]) {
            System.out.println("you most probably have Polio (Poliomyelitis)");
        }
        else if (max==count[29]) {
            System.out.println("you most probably have Rabies");
        }
        else if (max==count[30]) {
            System.out.println("you most probably have Salmonella");
        }
        else if (max==count[31]) {
            System.out.println("you most probably have Taeniasis");
        }
        else if (max==count[32]) {
            System.out.println("you most probably have Tetanus");
        }
        else if (max==count[33]) {
            System.out.println("you most probably have Typhoid");
        }
        else if (max==count[34]) {
            System.out.println("you most probably have Yellow Fever");
        }
        else if (max==count[35]) {
            System.out.println("you most probably have Zika Virus");
        }
        else if (max==count[36]) {
            System.out.println("you most probably have Malaria");
        }
        else if (max==count[37]) {
            System.out.println("you most probably have Smallpox");
        }
        else if (max==count[38]) {
            System.out.println("you most probably have Cholera");
        }
        else if (max==count[39]) {
            System.out.println("you most probably have Pneumonia");
        }
        else if (max==count[40]) {
            System.out.println("you most probably have Leprosy");
        }
        else if (max==count[41]) {
            System.out.println("you most probably have Meningitis");
        }
        else if (max==count[42]) {
            System.out.println("you most probably have Marburg Virus disease");
        }
        else if (max==count[43]) {
            System.out.println("you most probably have Spinal Cord injury");
        }
        else if (max==count[44]) {
            System.out.println("you most probably have E.Coli");
        }
        else if (max==count[45]) {
            System.out.println("you most probably have Hands,Foot and Mouth disease");
        }
        else if (max==count[46]) {
            System.out.println("you most probably have Allergic Rhinitis");
        }
        else if (max==count[47]) {
            System.out.println("you most probably have Psoriasis");
        }
        else if (max==count[48]) {
            System.out.println("you most probably have Lupus Vulgaris");
        }
        else if (max==count[49]) {
            System.out.println("you most probably have Melanoma");
        }
        else
            System.out.println("Sorry. No symptoms match!");
    }
    
    public void displayAll(){
        input();
        check();
        disease();
    }

    public String getSymp() {
        return symp;
    }

    public void setSymp(String symp) {
        this.symp = symp;
    }

    public String[] getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String[] symptoms) {
        this.symptoms = symptoms;
    }

    public int getDo0() {
        return do0;
    }

    public void setDo0(int do0) {
        this.do0 = do0;
    }

    public int getDo1() {
        return do1;
    }

    public void setDo1(int do1) {
        this.do1 = do1;
    }

    public int getDo2() {
        return do2;
    }

    public void setDo2(int do2) {
        this.do2 = do2;
    }

    public int getDo3() {
        return do3;
    }

    public void setDo3(int do3) {
        this.do3 = do3;
    }

    public int getDo4() {
        return do4;
    }

    public void setDo4(int do4) {
        this.do4 = do4;
    }

    public int getDo5() {
        return do5;
    }

    public void setDo5(int do5) {
        this.do5 = do5;
    }

    public int getDo6() {
        return do6;
    }

    public void setDo6(int do6) {
        this.do6 = do6;
    }

    public int getDo7() {
        return do7;
    }

    public void setDo7(int do7) {
        this.do7 = do7;
    }

    public int getDo8() {
        return do8;
    }

    public void setDo8(int do8) {
        this.do8 = do8;
    }

    public int getDo9() {
        return do9;
    }

    public void setDo9(int do9) {
        this.do9 = do9;
    }

    public int getDo10() {
        return do10;
    }

    public void setDo10(int do10) {
        this.do10 = do10;
    }

    public int getDo11() {
        return do11;
    }

    public void setDo11(int do11) {
        this.do11 = do11;
    }

    public int getDo12() {
        return do12;
    }

    public void setDo12(int do12) {
        this.do12 = do12;
    }

    public int getDo13() {
        return do13;
    }

    public void setDo13(int do13) {
        this.do13 = do13;
    }

    public int getDo14() {
        return do14;
    }

    public void setDo14(int do14) {
        this.do14 = do14;
    }

    public int getDo15() {
        return do15;
    }

    public void setDo15(int do15) {
        this.do15 = do15;
    }

    public int getDo16() {
        return do16;
    }

    public void setDo16(int do16) {
        this.do16 = do16;
    }

    public int getDo17() {
        return do17;
    }

    public void setDo17(int do17) {
        this.do17 = do17;
    }

    public int getDo18() {
        return do18;
    }

    public void setDo18(int do18) {
        this.do18 = do18;
    }

    public int getDo19() {
        return do19;
    }

    public void setDo19(int do19) {
        this.do19 = do19;
    }

    public int getDo20() {
        return do20;
    }

    public void setDo20(int do20) {
        this.do20 = do20;
    }

    public int getDo21() {
        return do21;
    }

    public void setDo21(int do21) {
        this.do21 = do21;
    }

    public int getDo22() {
        return do22;
    }

    public void setDo22(int do22) {
        this.do22 = do22;
    }

    public int getDo23() {
        return do23;
    }

    public void setDo23(int do23) {
        this.do23 = do23;
    }

    public int getDo24() {
        return do24;
    }

    public void setDo24(int do24) {
        this.do24 = do24;
    }

    public int getDo25() {
        return do25;
    }

    public void setDo25(int do25) {
        this.do25 = do25;
    }

    public int getDo26() {
        return do26;
    }

    public void setDo26(int do26) {
        this.do26 = do26;
    }

    public int getDo27() {
        return do27;
    }

    public void setDo27(int do27) {
        this.do27 = do27;
    }

    public int getDo28() {
        return do28;
    }

    public void setDo28(int do28) {
        this.do28 = do28;
    }

    public int getDo29() {
        return do29;
    }

    public void setDo29(int do29) {
        this.do29 = do29;
    }

    public int getDo30() {
        return do30;
    }

    public void setDo30(int do30) {
        this.do30 = do30;
    }

    public int getDo31() {
        return do31;
    }

    public void setDo31(int do31) {
        this.do31 = do31;
    }

    public int getDo32() {
        return do32;
    }

    public void setDo32(int do32) {
        this.do32 = do32;
    }

    public int getDo33() {
        return do33;
    }

    public void setDo33(int do33) {
        this.do33 = do33;
    }

    public int getDo34() {
        return do34;
    }

    public void setDo34(int do34) {
        this.do34 = do34;
    }

    public int getDo35() {
        return do35;
    }

    public void setDo35(int do35) {
        this.do35 = do35;
    }

    public int getDo36() {
        return do36;
    }

    public void setDo36(int do36) {
        this.do36 = do36;
    }

    public int getDo37() {
        return do37;
    }

    public void setDo37(int do37) {
        this.do37 = do37;
    }

    public int getDo38() {
        return do38;
    }

    public void setDo38(int do38) {
        this.do38 = do38;
    }

    public int getDo39() {
        return do39;
    }

    public void setDo39(int do39) {
        this.do39 = do39;
    }

    public int getDo40() {
        return do40;
    }

    public void setDo40(int do40) {
        this.do40 = do40;
    }

    public int getDo41() {
        return do41;
    }

    public void setDo41(int do41) {
        this.do41 = do41;
    }

    public int getDo42() {
        return do42;
    }

    public void setDo42(int do42) {
        this.do42 = do42;
    }

    public int getDo43() {
        return do43;
    }

    public void setDo43(int do43) {
        this.do43 = do43;
    }

    public int getDo44() {
        return do44;
    }

    public void setDo44(int do44) {
        this.do44 = do44;
    }

    public int getDo45() {
        return do45;
    }

    public void setDo45(int do45) {
        this.do45 = do45;
    }

    public int getDo46() {
        return do46;
    }

    public void setDo46(int do46) {
        this.do46 = do46;
    }

    public int getDo47() {
        return do47;
    }

    public void setDo47(int do47) {
        this.do47 = do47;
    }

    public int getDo48() {
        return do48;
    }

    public void setDo48(int do48) {
        this.do48 = do48;
    }

    public int getDo49() {
        return do49;
    }

    public void setDo49(int do49) {
        this.do49 = do49;
    }

    public int getDo50() {
        return do50;
    }

    public void setDo50(int do50) {
        this.do50 = do50;
    }
    
}
