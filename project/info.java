/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROJECT;

import java.util.Scanner;

public class info {
    Scanner sc = new Scanner(System.in);
private String input;

    public info() {
    
    }
    
    public void information() {
    System.out.print("Enter the name of disease that you would like to learn about : ");
    input = sc.nextLine();
        System.out.println("");
    
    if(input.equalsIgnoreCase("influenza")||input.equalsIgnoreCase("flu")){
        System.out.println("INFORMATION : ");
        System.out.println("Influenza is a viral infection that attacks your respiratory system — your nose, throat and lungs.");
        System.out.println("");
        System.out.println("FAQ : ");
        System.out.println("Is influenza really that serious?");
        System.out.println("Most people recover from fever and other symptoms within a week without requiring medical attention. However, influenza can cause severe disease and death");
        System.out.println("Who is at higher risk of health complications from influenza?");
        System.out.println("pregnant women; individuals with chronic heart or lung diseases, people over a nationally defined age limit,children aged 6–59 months");
        System.out.println("When should a person get vaccinated and how often?");
        System.out.println("It is best to get vaccinated before the influenza season starts.");
        System.out.println("Can an influenza vaccine cause influenza?");
        System.out.println("No, influenza vaccines are safe and do not cause influenza.");
        System.out.println("How is the vaccine made?");
        System.out.println("Influenza vaccines are most commonly made using an egg-based manufacturing process.");
        System.out.println("");
        System.out.println("STATISTICS : ");
        System.out.println("CDC estimates that influenza has resulted in between 9 million – 45 million illnesses, between 140,000 – 810,000 hospitalizations and between 12,000 – 61,000 deaths annually since 2010.");
        System.out.println("");
        System.out.println("TREATMENT :");
        System.out.println("drink plenty of liquids, rest , take pain relievers (acetaminophen)");
        System.out.println("");
        System.out.println("PREVENTION");
        System.out.println("wash hands regularly, avoid crowds during flu outbreak, cover mouth and nose when sneezing and coughing, stay at home when devlop fever");
    }
    
    else if(input.equalsIgnoreCase("TB")||input.equalsIgnoreCase("tuberculosis")){
        System.out.println("INFORMATION : ");
        System.out.println("Tuberculosis (TB) is a disease caused by bacteria called Mycobacterium tuberculosis. The bacteria usually attack the lungs, but they can also damage other parts of the body.");
        System.out.println("");
        System.out.println("FAQ : ");
        System.out.println("How tuberculosis spreads?");
        System.out.println("Tuberculosis (TB) is spread from one person to other through the air.");
        System.out.println("Are all patients with TB disease infectious?");
        System.out.println("No. In practice only a person with tuberculosis (TB) disease of the lungs can spread it.");
        System.out.println("Can I get tuberculosis even if I am completely healthy and have taken good care of myself?");
        System.out.println("Yes you can.");
        System.out.println("Is TB disease in people infected with HIV similar to others?");
        System.out.println("People with HIV infection have more often TB in places other than the lungs compared to those who do not have HIV.");
        System.out.println("Can I get infected when I shake hands or embrace a person with TB disease?");
        System.out.println("No. Tuberculosis is not spread through touch or contact with skin.");
        System.out.println("");
        System.out.println("STATISTICS : ");
        System.out.println("In 2018, an estimated 10 million people fell ill with tuberculosis(TB) worldwide. 5.7 million men, 3.2 million women and 1.1 million children.");
        System.out.println("");
        System.out.println("TREATMENT :");
        System.out.println("combination of antibiotics as prescribed by doctor");
        System.out.println("");
        System.out.println("PREVENTION");
        System.out.println("cover mouth and nose when sneezing and coughing, wear mask, wash hands with soap ");
    }
   
     else if(input.equalsIgnoreCase("rubella")){
        System.out.println("INFORMATION : ");
        System.out.println("Rubella virus is the pathogenic agent of the disease rubella, and is the main cause of congenital rubella syndrome when infection occurs during the first weeks of pregnancy");
        System.out.println("");
        System.out.println("FAQ : ");
        System.out.println("What causes rubella in a child?");
        System.out.println("Rubella is caused by a virus.");
        System.out.println("Which children are at risk for rubella?");
        System.out.println("A child is more at risk for rubella if he or she is around a person with rubella and has not had the vaccine.");
        System.out.println("What are possible complications of rubella in a child?");
        System.out.println("Cataracts in the eyes, Deafness, Heart problems, Skin lesions");
        System.out.println("When should I call my child’s healthcare provider?");
        System.out.println("Symptoms that don’t get better, or get worse");
        System.out.println("How can I help prevent rubella in my child?");
        System.out.println("Rubella can be prevented with the rubella vaccine.");
        System.out.println("");
        System.out.println("STATISTICS : ");
        System.out.println("Reported rubella cases declined 97%, from 670 894 cases in 102 countries in 2000 to 14 621 cases in 151 countries in 2018.");
        System.out.println("");
        System.out.println("TREATMENT :");
        System.out.println("rest well, drink plenty of liquids");
        System.out.println("");
        System.out.println("PREVENTION");
        System.out.println("rubella vaccine");
    }
    
     else if(input.equalsIgnoreCase("measles")){
        System.out.println("INFORMATION : ");
        System.out.println("Measles is a highly contagious infectious disease caused by measles virus.");
        System.out.println("");
        System.out.println("FAQ : ");
        System.out.println("How serious is measles?");
        System.out.println("Measles is a very serious disease.");
        System.out.println("How is measles prevented?");
        System.out.println("Getting vaccinated is the best protection against measles");
        System.out.println("Is Vitamin A used to prevent or treat measles?");
        System.out.println("It is only used to prevent severe complications, including death. It cannot prevent or cure the measles and it is not prescribed for every child.");
        System.out.println("Who is at risk from measles?");
        System.out.println("Pregnant women, young kids, and people with weakened immune systems are at highest risk for complications from measles.");
        System.out.println("What if someone in my family may have measles or was exposed to someone with measles?");
        System.out.println("Try to stay away from other people until at least four days after the rash starts or a test proves it’s not measles.");
        System.out.println("");
        System.out.println("STATISTICS : ");
        System.out.println("During 2000- 2018, measles vaccination prevented an estimated 23.2 million deaths making measles vaccine one of the best buys in public health.");
        System.out.println("");
        System.out.println("TREATMENT :");
        System.out.println("acetaminophen (Tylenol) or ibuprofen (Advil) to reduce fever, rest well, drink plenty of liquids, humidifier to ease cough and sore throat, vitamin A supplements");
        System.out.println("");
        System.out.println("PREVENTION");
        System.out.println("measles vaccine, practise good hygiene");
    }
    
     else if(input.equalsIgnoreCase("HIV")||input.equalsIgnoreCase("AIDS")){
        System.out.println("INFORMATION : ");
        System.out.println("Human immunodeficiency virus infection and acquired immune deficiency syndrome (HIV/AIDS) is a spectrum of conditions caused by infection with the human immunodeficiency virus (HIV).");
        System.out.println("");
        System.out.println("FAQ : ");
        System.out.println("How Is HIV Passed From One Person to Another?");
        System.out.println("Having sex (anal, vaginal, or oral) with a person who has HIV; Sharing drug needles or other drug equipment with someone who has HIV");
        System.out.println("Can Latex Condoms Prevent HIV?");
        System.out.println("When used consistently and correctly, they're very good at stopping the spread of HIV during sex. But condom use can't give you perfect protection.");
        System.out.println("Can I Get HIV From Oral Sex?");
        System.out.println("Yes, it's possible");
        System.out.println("Where Can I Get an HIV Test?");
        System.out.println("Common places include your local health department, a clinic, your doctor's office, a hospital, and other sites set up specifically for HIV testing.");
        System.out.println("How Do I Get Tested for HIV?");
        System.out.println("Most often, a technician or doctor will draw blood from your vein and check it to see if there are antibodies for HIV.");
        System.out.println("");
        System.out.println("STATISTICS : ");
        System.out.println("It was estimated that 87,122 people were living with HIV (PLHIV) in 2017 in which 83% (adults and children) knew their status (Table 2) and majority were male- predominant");
        System.out.println("");
        System.out.println("TREATMENT :");
        System.out.println("Antiretroviral therapy as prescribed by doctor");
        System.out.println("");
        System.out.println("PREVENTION");
        System.out.println("get tested and treated, take safety measures during intercourse, avoid sharing injections, pre-exposure prophylaxis");
    }
    
     else if(input.equalsIgnoreCase("epilepsy")){
        System.out.println("INFORMATION : ");
        System.out.println("Epilepsy is a central nervous system (neurological) disorder in which brain activity becomes abnormal, causing seizures or periods of unusual behavior, sensations, and sometimes loss of awareness. Anyone can develop epilepsy.");
        System.out.println("");
        System.out.println("FAQ : ");
        System.out.println("How long do seizures usually last?");
        System.out.println("Usually, a seizure lasts from a few seconds to a few minutes. It depends on the type of seizure.");
        System.out.println("If I have a seizure, does that mean I have epilepsy?");
        System.out.println("Not always. Seizures can also happen because of other medical problems");
        System.out.println("Who treats epilepsy?");
        System.out.println("Primary care providers such as family physicians, pediatricians, and nurse practitioners");
        System.out.println("How do I find an epilepsy specialist?");
        System.out.println("There are several ways you can find a neurologist or an epileptologist near you.");
        System.out.println("Can a person die from epilepsy?");
        System.out.println("Most people with epilepsy live a full life. However, the risk of early death is higher for some.");
        System.out.println("");
        System.out.println("STATISTICS : ");
        System.out.println("It's estimated that about 1.2 percent of U.S. people have active epilepsy. This comes out to about 3.4 million people nationwide — and more than 65 million globally.");
        System.out.println("");
        System.out.println("TREATMENT :");
        System.out.println("anti-epileptic drugs, surgery, procedure of inserting of small electrical device in the body, ketogenic diet");
        System.out.println("");
        System.out.println("PREVENTION");
        System.out.println("get plenty of sleep, avoid alcohol and drugs, skip screen time, avoid video games, practise healthy diet, stress management, avoid bright visual stimuli,");
    }
    
     else if(input.equalsIgnoreCase("musculoskeletal conditions")){
        System.out.println("INFORMATION : ");
        System.out.println("Musculoskeletal disorders (MSDs) are conditions that can affect your muscles, bones, and joints.");
        System.out.println("");
        System.out.println("FAQ : ");
        System.out.println("Why is worker participation essential for MSD prevention?");
        System.out.println("Having the full participation of workers is especially important for MSD prevention.");
        System.out.println("Workplace solutions that work for MSD prevention?");
        System.out.println("Changing the work and the workplace with new tools and equipment are the most effective and sustainable way to solve MSD.");
        System.out.println("What do workplaces need to know about MSD prevention?");
        System.out.println("MSD prevention shares many features with other Health and Safety issue.");
        System.out.println("Why does one worker get MSD, and another does not?");
        System.out.println("People differ in the level of MSD hazard that causes injuries and disorders, just like any other occupational hazard, such as noise.");
        System.out.println("How do I support workers with MSD?");
        System.out.println("Supportive supervisor behaviour is critical to prevent any disability from MSD increasing and during return to work.");
        System.out.println("");
        System.out.println("STATISTICS : ");
        System.out.println("DALYs for musculoskeletal conditions increased by 61.6% between 1990 and 2016, with an increase of 19.6% between 2006 and 2016.");
        System.out.println("");
        System.out.println("TREATMENT :");
        System.out.println("medication : acetaminophen (Tylenol), (NSAIDs) such as aspirin, ibuprofen (Advil, Motrin) or naproxen (Aleve), corticosteroid injections into the painful area, opioids (only for more severe pain) therapy : therapeutic massage, chiropractic/osteopathic manipulation, physical therapy");
        System.out.println("");
        System.out.println("PREVENTION");
        System.out.println("proper exercise and stretching, proper diet");
    }
    
     else if(input.equalsIgnoreCase("hypertension")){
        System.out.println("INFORMATION : ");
        System.out.println("Hypertension (HTN or HT), also known as high blood pressure (HBP), is a long-term medical condition in which the blood pressure in the arteries is persistently elevated.");
        System.out.println("");
        System.out.println("FAQ : ");
        System.out.println("Why is hypertension a problem?");
        System.out.println("The higher your blood pressure, the higher your risk of stroke, heart attack, congestive heart failure, kidney disease");
        System.out.println("Won’t pills cure the problem?");
        System.out.println("Not really.");
        System.out.println("What are the results of the Pritikin Program on hypertension?");
        System.out.println("Blood pressure falls so dramatically, studies on the Pritikin Program have found, that many people no longer require hypertension drugs, or have their dosages significantly reduced.");
        System.out.println("Is there a cure for hypertension?");
        System.out.println("You cannot “cure” hypertension, but there’s a very good chance that with lifestyle treatment");
        System.out.println("Is hypertension inevitable?");
        System.out.println("in recent years anthropologists have found a wide variety of primitive people who consumed diets with little or no added salt and whose blood pressure did not rise with age.");
        System.out.println("");
        System.out.println("STATISTICS : ");
        System.out.println("Nearly half of adults in the United States (108 million, or 45%) have hypertension");
        System.out.println("");
        System.out.println("TREATMENT :");
        System.out.println("medicine as prescribed by doctor. Angiotensin-converting enzyme (ACE) inhibitors, Angiotensin II receptor blockers (ARBs), Diuretics, Beta-blockers, Calcium channel blockers, Alpha-blockers, Alpha-agonists, Renin inhibitors, Combination medications");
        System.out.println("");
        System.out.println("PREVENTION");
        System.out.println("quit smoking, limit alcohol consumption, reduce intake of sodium, regular aerobic exercise, lose weight if obesity, healthy diet");
    }
    
     else if(input.equalsIgnoreCase("depression")){
        System.out.println("INFORMATION : ");
        System.out.println("Depression is a mood disorder that involves a persistent feeling of sadness and loss of interest. It is different from the mood fluctuations that people regularly experience as a part of life.");
        System.out.println("");
        System.out.println("FAQ : ");
        System.out.println("Is depression a mental illness?");
        System.out.println("Yes. Depression is a serious but treatable mental illness.");
        System.out.println("Do children get depression?");
        System.out.println("Yes. Children are subject to the same factors that cause depression in adults.");
        System.out.println("Can lack of sleep cause depression?");
        System.out.println("No. Lack of sleep alone cannot cause depression, but it does play a role.");
        System.out.println("Why are women more likely to get depression?");
        System.out.println("Women develop depression twice as often as men. One reason may be the various changes in hormone levels that women experience.");
        System.out.println("Do most people with depression commit suicide?");
        System.out.println("No. Most people who have depression do not attempt suicide. However, about 90% of people who have committed suicide had mental illness and substance abuse problems.");
        System.out.println("");
        System.out.println("STATISTICS : ");
        System.out.println("Globally, more than 264 million people of all ages suffer from depression.");
        System.out.println("");
        System.out.println("TREATMENT :");
        System.out.println("psychotherapy, antidepressants as prescribed by doctor");
        System.out.println("");
        System.out.println("PREVENTION");
        System.out.println("stresss management, take good care of overall health, get regular medical check ups");
    }
    
     else if(input.equalsIgnoreCase("asthma")){
        System.out.println("INFORMATION : ");
        System.out.println("Asthma is a long-term disease of the lungs. You might hear your doctor call it a chronic respiratory disease. It causes your airways to get inflamed and narrow and makes breathing difficult.");
        System.out.println("");
        System.out.println("FAQ : ");
        System.out.println("My Asthma Worsens Whenever I Take Pain Medication. Why?");
        System.out.println("One possibility is that you are sensitive to aspirin and non-steroidal anti-inflammatory medications");
        System.out.println("Can Asthma Drugs Affect my Baby if I'm Pregnant?");
        System.out.println("if a pregnant woman has asthma, it is especially important that her asthma is well controlled not only for her own health but also for the health and development of her unborn child.");
        System.out.println("I Have Heartburn; Can It Worsen Asthma?");
        System.out.println("GERD may worsen asthma symptoms and make asthma harder to treat.");
        System.out.println("I Have Allergies to Mites and Mold; How Do I Avoid Them?");
        System.out.println( "Wash all bedding in hot water once a week");
        System.out.println("How Can I Discover my Allergies?");
        System.out.println("ask your doctor to refer you to a board certified allergist who can perform skin testing or any other procedures needed to properly identify your allergies");
        System.out.println("");
        System.out.println("STATISTICS : ");
        System.out.println("In 2016, approximately 8.3% of children in the United States had asthma. Boys were slightly more likely to have asthma than girls at a rate of 9.2% and 7.4%, respectively.");
        System.out.println("");
        System.out.println("TREATMENT :");
        System.out.println("breathing exercise, bronchial thermoplasty, medications such as anti-inflammatories, anticholinergics, long-acting bronchodilators, biologic therapy drugs as prescribed by doctor");
        System.out.println("");
        System.out.println("PREVENTION");
        System.out.println("avoid smoke and cold drinks, breathing exercise");
    }
    
     else if(input.equalsIgnoreCase("bipolar disorder")){
        System.out.println("INFORMATION : ");
        System.out.println("Bipolar disorder, formerly called manic depression, is a mental health condition that causes extreme mood swings that include emotional highs (mania or hypomania) and lows (depression).");
        System.out.println("");
        System.out.println("FAQ : ");
        System.out.println("WHAT IS THE DIFFERENCE BETWEEN DEPRESSION AND BIPOLAR DISORDER?");
        System.out.println("The main difference between bipolar disorder and major clinical depression is the presence of manic episodes. This is why depression alone is not enough to diagnose an individual with bipolar.");
        System.out.println("Is there more than one type of bipolar disorder?");
        System.out.println("There are four types of BPD: Bipolar I, Bipolar II, Cyclothymia, Bipolar disorder NOS (Not Otherwise Specified).");
        System.out.println("Is BPD dangerous?");
        System.out.println("Bipolar disorder is a potentially serious mental illness that can worsen if left untreated.");
        System.out.println("Is a normal life possible when living with BPD?");
        System.out.println("Long-term care of bipolar disorder symptoms requires a strong commitment from the patient as well as supportive friends and family.");
        System.out.println("Will I have to be hospitalized for BPD during a manic or depressive episode?");
        System.out.println("Both inpatient and outpatient bipolar disorder treatment options are available from Ascension Seton Behavioral Health.");
        System.out.println("");
        System.out.println("STATISTICS : ");
        System.out.println("An estimated 2.8% of U.S. adults had bipolar disorder in the past year");
        System.out.println("");
        System.out.println("TREATMENT :");
        System.out.println("medications as prescribed, day treatment program. continuous treament, hospitalisation, substance abuse treatment");
        System.out.println("");
        System.out.println("PREVENTION");
        System.out.println("nil");
    }
    
     else if(input.equalsIgnoreCase("schizophrenia")){
        System.out.println("INFORMATION : ");
        System.out.println("Schizophrenia is a serious mental disorder in which people interpret reality abnormally. Schizophrenia may result in some combination of hallucinations, delusions, and extremely disordered thinking and behavior that impairs daily functioning, and can be disabling.");
        System.out.println("");
        System.out.println("FAQ : ");
        System.out.println("WHAT ARE THE RISK FACTORS FOR SCHIZOPHRENIA?");
        System.out.println("Genetics, Environment, Brain chemistry, Brain structure, Brain development.");
        System.out.println("WHAT ARE THE SUBTYPES OF SCHIZOPHRENIA?");
        System.out.println("Paranoid schizophrenia, Disorganized schizophrenia, Catatonic schizophrenia, Residual schizophrenia, Schizoaffective disorder");
        System.out.println("AT WHAT AGE DO THE SYMPTOMS OF SCHIZOPHRENIA APPEAR?");
        System.out.println("Schizophrenia affects men and women equally. It occurs at similar rates in all ethnic groups around the world. Symptoms such as hallucinations and delusions usually start between ages 16 and 30.");
        System.out.println("IS THERE A CURE FOR SCHIZOPHRENIA?");
        System.out.println("While no cure exists for schizophrenia, it is treatable and manageable with medication and behavioral therapy,");
        System.out.println("CAN ELECTRICAL STIMULATION IMPROVE COGNITION IN PEOPLE LIVING WITH SCHIZOPHRENIA");
        System.out.println("A method called transcranial direct current stimulation (tDCS) can potentially help the brain activity and inhibiting competing brain regions.");
        System.out.println("");
        System.out.println("STATISTICS : ");
        System.out.println("Schizophrenia is a chronic and severe mental disorder affecting 20 million people worldwide");
        System.out.println("");
        System.out.println("TREATMENT :");
        System.out.println("individual therapy, family therapy, antipsychotics as per prescription");
        System.out.println("");
        System.out.println("PREVENTION");
        System.out.println("avoid street drugs and alcohol, develop social skilss, avoid social isolation, stress and anxiety management");
    }
    
     else if(input.equalsIgnoreCase("dementia")){
        System.out.println("INFORMATION : ");
        System.out.println("Dementia is a collective term used to describe various symptoms of cognitive decline, such as forgetfulness.");
        System.out.println("");
        System.out.println("FAQ : ");
        System.out.println("Once you develop dementia, is there anything that you can do?");
        System.out.println("Although there is no cure, there are steps that you can take to potentially stabilise the course of dementia");
        System.out.println("Can I reduce my risk of dementia?");
        System.out.println("There is growing evidence that leading a healthy, active lifestyle may help maintain brain health.");
        System.out.println("Does dementia only affect older people?");
        System.out.println("While dementia is more common in people over 65, younger people can develop dementia too.");
        System.out.println("I keep forgetting things, have I got dementia?");
        System.out.println("At the earliest stages, dementia can be confused with age-related forgetfulness that we can all experience. It's not unusual for people to forget names or where they have put their keys.");
        System.out.println("Is dementia a natural part of aging?");
        System.out.println("Although dementia usually affects people as they get older, it’s not a normal part of aging.");
        System.out.println("");
        System.out.println("STATISTICS : ");
        System.out.println("Worldwide, around 50 million people have dementia, with nearly 60% living in low- and middle-income countries. Every year, there are nearly 10 million new cases.");
        System.out.println("");
        System.out.println("TREATMENT :");
        System.out.println("occupationl therapy, cholinesterase inhibitors, mmemantine, other medications as per prescription");
        System.out.println("");
        System.out.println("PREVENTION");
        System.out.println("exercise, avoid smoking, healthy diet, be socially active, stay mentally alert");
    }
    
     else if(input.equalsIgnoreCase("bronchitis")){
        System.out.println("INFORMATION : ");
        System.out.println("Bronchitis is an inflammation of the lining of your bronchial tubes, which carry air to and from your lungs.");
        System.out.println("");
        System.out.println("FAQ : ");
        System.out.println("What are the two types of bronchitis?");
        System.out.println("Acute bronchitis refers to a short term bronchitis and chronic refers ongoing bronchitis.");
        System.out.println("Bacteria, viruses, and chemicals may cause acute bronchitis. True or False?");
        System.out.println("True.");
        System.out.println("What is usually the cause of chronic bronchitis?");
        System.out.println("Smoking is usually the cause of chronic bronchitis.");
        System.out.println("Bronchitis is contagious?");
        System.out.println("Bronchitis is sometimes contagious.");
        System.out.println("If you have bronchitis, it is most important to drink plenty of fluids.");
        System.out.println("If you have bronchitis, it is important to drink plenty of fluids to stay hydrated.");
        System.out.println("");
        System.out.println("STATISTICS : ");
        System.out.println("In 2016, more than 8.9 million Americans were diagnosed with chronic bronchitis and nearly 75 percent of cases involved people over the age of 45.");
        System.out.println("");
        System.out.println("TREATMENT :");
        System.out.println("pulmonary rehabilitation, cough medicine , other medications as per prescription");
        System.out.println("");
        System.out.println("PREVENTION");
        System.out.println("avoid smoking, practise good hygiene, healthy diet, avoid catching cold");
    }
    
     else if(input.equalsIgnoreCase("heart attack")){
        System.out.println("INFORMATION : ");
        System.out.println("A heart attack occurs when the flow of blood to the heart is blocked. The blockage is most often a buildup of fat, cholesterol and other substances, which form a plaque in the arteries that feed the heart (coronary arteries).");
        System.out.println("");
        System.out.println("FAQ : ");
        System.out.println("What are the risk factors for a heart attack?");
        System.out.println("Men aged over 45 years and women aged over 55 years are at a greater risk of heart attacks than younger individuals.");
        System.out.println("Is it necessary to have all the symptoms to call for help?");
        System.out.println("No, not all symptoms described above are always present");
        System.out.println("How common are heart attacks?");
        System.out.println("Heart attacks are very common worldwide. Each year, more than 1 million people in the USA have a heart attack");
        System.out.println("How is a heart attack diagnosed?");
        System.out.println("A heart attack diagnosis is based on the findings of an electrocardiogram (ECG).");
        System.out.println("What is the concern after recovering from a heart attack?");
        System.out.println("People who have had a heart attack are at a greater risk of another attack in the future.");
        System.out.println("");
        System.out.println("STATISTICS : ");
        System.out.println("About 647,000 Americans die from heart disease each year—that’s 1 in every 4 deaths.");
        System.out.println("");
        System.out.println("TREATMENT :");
        System.out.println("coronary angioplasty and stenting, coronary artery bypass surgery, aspirin, thrombolytics, antiplatelet agents, blood-thinning medications, pain reliever, nitroglycerin, beta blockers, ACE inhibitors, statins");
        System.out.println("");
        System.out.println("PREVENTION");
        System.out.println("avoid smoking and alcohol, healthy diet, exercise, healthy weight, manage stress and blood pressure");
    }
    
     else if(input.equalsIgnoreCase("stroke")){
        System.out.println("INFORMATION : ");
        System.out.println("A stroke is a sudden interruption in the blood supply of the brain. Most strokes are caused by an abrupt blockage of arteries leading to the brain (ischemic stroke). Other strokes are caused by bleeding into brain tissue when a blood vessel bursts");
        System.out.println("");
        System.out.println("FAQ : ");
        System.out.println("How long does it take to recover?");
        System.out.println("Each stroke is different. The timetable for recovery depends on the extent of the stroke");
        System.out.println("Will my loved one be the same as before the stroke?");
        System.out.println("After a stroke, the brain changes and will not be exactly the same as it was before.");
        System.out.println("How will my loved one cope with the stroke? Will he or she be depressed?");
        System.out.println("During the early stages recovery, the person with stroke may not be aware of the nature of the stroke or its consequences. As improvement occurs, increased understanding of the impact of the stroke grows.");
        System.out.println("Can I drive after the stroke?");
        System.out.println("Usually the physician will not allow you and your loved one to drive right after stroke.");
        System.out.println("What should I do to prepare the home environment for my loved one's discharge?");
        System.out.println("Your occupational therapist may need to do a home evaluation to make suggestions for adapting the home.");
        System.out.println("");
        System.out.println("STATISTICS : ");
        System.out.println("Each year, approximately 795,000 people suffer a stroke. About 600,000 of these are first attacks, and 185,000 are recurrent attacks.");
        System.out.println("");
        System.out.println("TREATMENT :");
        System.out.println("treatment as per prescription");
        System.out.println("");
        System.out.println("PREVENTION");
        System.out.println("healthy diet, regular exercise, avoid smoking and alcohol");
    }
    
     else if(input.equalsIgnoreCase("rheumatic heart disease")){
        System.out.println("INFORMATION : ");
        System.out.println("Rheumatic heart disease is a condition in which permanent damage to heart valves is caused by rheumatic fever. The heart valve is damaged by a disease process that generally begins with a strep throat caused by bacteria called Streptococcus, and may eventually cause rheumatic fever");
        System.out.println("");
        System.out.println("FAQ : ");
        System.out.println("Which doctor should I consult for rheumatic heart disease?");
        System.out.println("You can consult a cardiologist or a pediatrician for rheumatic heart disease.");
        System.out.println("What precautions are to be taken after surgery of RHD?");
        System.out.println("The patient should be given both benzathine penicillin as well as anticoagulants (drugs that prevent clotting) lifelong or as advised by the doctor.");
        System.out.println("What risk factors are related to Rheumatic Heart Disease?");
        System.out.println("Overcrowding and social disadvantage increase the risk.");
        System.out.println("How can medical services help reduce the prevalence of Rheumatic Heart Disease?");
        System.out.println("Early diagnosis of Acute Rheumatic Fever and access to relevant medical services for at-risk communities.");
        System.out.println("How do you get Rheumatic Heart Disease (RHD)?");
        System.out.println("It starts as a common bacterial infection (Group A Streptococcus) in children 5-15 years of age, and if left untreated, can lead to Acute Rheumatic Fever (ARF) and the permanent heart damage");
        System.out.println("");
        System.out.println("STATISTICS : ");
        System.out.println("Worldwide, 319,400 deaths were due to rheumatic heart disease in 2015.");
        System.out.println("");
        System.out.println("TREATMENT :");
        System.out.println("hospitalization, antibiotics treatment, blood thinning medicine, heart valve surgery, insertion of balloons in veins to open stuck valves");
        System.out.println("");
        System.out.println("PREVENTION");
        System.out.println("preventative antibiotics, practise healthy diet, regular exercise");
    }
    
     else if(input.equalsIgnoreCase("diabetes")){
        System.out.println("INFORMATION : ");
        System.out.println("Diabetes is a disease that occurs when your blood glucose, also called blood sugar, is too high.");
        System.out.println("");
        System.out.println("FAQ : ");
        System.out.println("What's the difference between type 1 and type 2 diabetes?");
        System.out.println("Type 1 diabetes is an autoimmune condition that results in the body’s inability to produce insulin.Type 2 diabetes is a disease in which either the body is able to produce insulin but is not able to produce enough or the body does not respond to the insulin that is being produced ");
        System.out.println("What should your fasting blood glucose be?");
        System.out.println("A fasting blood sugar should be less than 100 in order to be considered normal.");
        System.out.println("What is the best diet for prediabetes?");
        System.out.println("A low carbohydrate diet is the ideal diet for prediabetes.");
        System.out.println("How do you reverse prediabetes?");
        System.out.println("Prediabetes can be reversed by following a low carbohydrate diet.");
        System.out.println("What is gestational diabetes");
        System.out.println("Gestational diabetes is high blood glucose (sugar) in a pregnant woman who has never had diabetes before, and it only occurs when a woman is pregnant.");
        System.out.println("");
        System.out.println("STATISTICS : ");
        System.out.println("34.2 million people, or 10.5% of the U.S. population, have diabetes.");
        System.out.println("");
        System.out.println("TREATMENT :");
        System.out.println("insulin, medications as per prescription");
        System.out.println("");
        System.out.println("PREVENTION");
        System.out.println("reduce sugar and carbohydrates intake, regular exercise, drink plenty of water, healthy weight, quit smoking");
    }
    
     else if(input.equalsIgnoreCase("plague")){
        System.out.println("INFORMATION : ");
        System.out.println("Plague is a disease that affects humans and other mammals. It is caused by the bacterium, Yersinia pestis. Humans usually get plague after being bitten by a rodent flea that is carrying the plague bacterium or by handling an animal infected with plague");
        System.out.println("");
        System.out.println("FAQ : ");
        System.out.println("How do people become infected with plague?");
        System.out.println("People most commonly acquire plague when they are bitten by a flea that is infected with the plague bacteria.");
        System.out.println("What is the basic transmission cycle of plague?");
        System.out.println("Fleas become infected by feeding on rodents, such as chipmunks, prairie dogs, ground squirrels, mice, and other mammals that are infected with the bacterium Yersinia pestis.");
        System.out.println("Could one person get plague from another person?");
        System.out.println("Yes, when a person has plague pneumonia they may cough droplets containing the plague bacteria into air.");
        System.out.println("What is the incubation period for plague?");
        System.out.println("A person usually becomes ill with bubonic plague 2 to 6 days after being infected.");
        System.out.println("Is a vaccine available to prevent plague?");
        System.out.println("A plague vaccine is not available.");
        System.out.println("");
        System.out.println("STATISTICS : ");
        System.out.println("Over 80% of United States plague cases have been the bubonic form.");
        System.out.println("");
        System.out.println("TREATMENT :");
        System.out.println("Gentamicin, Doxycycline (Monodox, Vibramycin, others), Ciprofloxacin (Cipro), Levofloxacin, Moxifloxacin (Avelox), Chloramphenicol");
        System.out.println("");
        System.out.println("PREVENTION");
        System.out.println("careful handling of dead rodents");
    }
    
     else if(input.equalsIgnoreCase("chronic obstructive pulmonary disease")){
        System.out.println("INFORMATION : ");
        System.out.println("Chronic obstructive pulmonary disease (COPD) is a type of obstructive lung disease characterized by long-term breathing problems and poor airflow. The main symptoms include shortness of breath and cough with sputum production. COPD is a progressive disease, meaning it typically worsens over time.");
        System.out.println("");
        System.out.println("FAQ : ");
        System.out.println("Why is important to exercise for patients with COPD?");
        System.out.println("Exercise increases bone strength, muscle strength, endurance, relaxation and restful sleep. Overall, exercise will improve your quality of life.");
        System.out.println("How can I exercise when I can't breathe?");
        System.out.println("By using coordinated breathing techniques and starting out slowly, you will be able to find an exercise program that works for you.");
        System.out.println("Do I have to purse lip breathe all the time?");
        System.out.println("Pursed lip breathing can be helpful any time you are short of breath. It can help you focus on your breathing and relax.");
        System.out.println("Do I have to wear my oxygen while I exercise?");
        System.out.println("If your health care provider has prescribed oxygen for activity, it is very important that you wear it when you exercise.");
        System.out.println("Can I just take a hit of oxygen when I need it?");
        System.out.println("No. You should use your supplemental oxygen as prescribed by your health care provider.");
        System.out.println("");
        System.out.println("STATISTICS : ");
        System.out.println("Globally, it is estimated that 3.17 million deaths were caused by the disease in 2015");
        System.out.println("");
        System.out.println("TREATMENT :");
        System.out.println("Bronchodilators (inhalers), Steroids, Antibiotics, Vaccines, pneumococcal pneumonianfusions of the protein alpha-1 antitrypsin, pulmonary rehabilitation");
        System.out.println("");
        System.out.println("PREVENTION");
        System.out.println("quit smoking, clean indoors, use respiratory protective equipment");
    }
    
     else if(input.equalsIgnoreCase("cancer")){
        System.out.println("INFORMATION : ");
        System.out.println("Cancer is a group of diseases involving abnormal cell growth with the potential to invade or spread to other parts of the body. These contrast with benign tumors, which do not spread.");
        System.out.println("");
        System.out.println("FAQ : ");
        System.out.println("Cancer is the result of the uncontrolled growth of abnormal cells anywhere in the body. True or false?");
        System.out.println("TRUE");
        System.out.println("About how many types of cancer are there?");
        System.out.println("There are more than 100 types of cancer.");
        System.out.println("Across the globe, what is the most common type of cancer that kills men?");
        System.out.println("the top five most common types of cancer that kill men are, in order of frequency, lung cancer, stomach cancer, liver cancer, colorectal cancer, and esophageal cancer.");
        System.out.println("Worldwide, what is the most common cancer that kills women?");
        System.out.println("the most common type of cancer that kills women worldwide is breast cancer.");
        System.out.println("What is the most common form of cancer in all humans?");
        System.out.println("The most common form of cancer overall in both men and women is skin cancer.");
        System.out.println("");
        System.out.println("STATISTICS : ");
        System.out.println("In 2018, an estimated 1,735,350 new cases of cancer will be diagnosed in the United States and 609,640 people will die from the disease.");
        System.out.println("");
        System.out.println("TREATMENT :");
        System.out.println("surgery, chemotherapy, Radiation therapy, Bone marrow transplant, Immunotherapy, Hormone therapy, Targeted drug therapy, Cryoablation,Radiofrequency ablation");
        System.out.println("");
        System.out.println("PREVENTION");
        System.out.println("regular medical check-up, healthy diet, healthy weight, vaccine, no tobacco");
    }
    
     else if(input.equalsIgnoreCase("hepatitis")||input.equalsIgnoreCase("hepatitis (A,B,C)")){
        System.out.println("INFORMATION : ");
        System.out.println("Hepatitis is an inflammation of the liver. Viruses cause most cases of hepatitis. The type of hepatitis is named for the virus that causes it; for example, hepatitis A, hepatitis B or hepatitis C.");
        System.out.println("");
        System.out.println("FAQ : ");
        System.out.println("What does the liver do?");
        System.out.println("The liver works as a filter, removing toxins from the body. The liver is part of the immune system.");
        System.out.println("What is the difference between HAV, HBV and HCV?");
        System.out.println("HAV, HBV and HCV are caused by three distinct viruses. They have different modes of transmission. The effect on the body and the liver varies depending on the virus.");
        System.out.println("Can viral hepatitis be treated?");
        System.out.println("Individuals who contract HAV usually improve without specific medications.");
        System.out.println("Can you get hepatitis from kissing?");
        System.out.println("Catching hepatitis by kissing an infected person is unlikely -- although deep kissing that involves the exchange of large amounts of saliva might result in HBV");
        System.out.println("How long is a person with Hepatitis A contagious to others?");
        System.out.println("You are most contagious soon after you are infected and before symptoms appear.");
        System.out.println("");
        System.out.println("STATISTICS : ");
        System.out.println("2.4 million people are estimated to be living with hepatitis C in the United States. The actual number may be as high as 4.7 million or as low as 2.5 million.850,000 people in the U.S. are estimated to be living with hepatitis B. The actual number may be as high as 2.2 million or as low as 730,000.");
        System.out.println("");
        System.out.println("TREATMENT :");
        System.out.println("antiviral drugs as per prescription, liver transplant (severe liver damage)");
        System.out.println("");
        System.out.println("PREVENTION");
        System.out.println("vaccine");
    }
    
     else if(input.equalsIgnoreCase("covid-19")||input.equalsIgnoreCase("coronavirus")){
        System.out.println("INFORMATION : ");
        System.out.println("Coronaviruses are a group of related RNA viruses that cause diseases in mammals and birds. In humans, these viruses cause respiratory tract infections that can range from mild to lethal.");
        System.out.println("");
        System.out.println("FAQ : ");
        System.out.println("What is the recovery time for the coronavirus disease?");
        System.out.println("Using available preliminary data, the median time from onset to clinical recovery for mild cases is approximately 2 weeks and is 3-6 weeks for patients with severe or critical disease.");
        System.out.println("Can the coronavirus disease spread through food?");
        System.out.println("Current evidence on other coronavirus strains shows that while coronaviruses appear to be stable at low and freezing temperatures for a certain period,");
        System.out.println("Can people recover from coronavirus disease?");
        System.out.println("You can recover from the coronavirus disease (COVID-19). Catching the new coronavirus DOES NOT mean you will have it for life.");
        System.out.println("Can antibiotics treat the coronavirus disease?");
        System.out.println("No, antibiotics do not work against viruses.");
        System.out.println("Are masks effective against the coronavirus disease?");
        System.out.println("Masks are effective only when used in combination with frequent hand-cleaning with alcohol-based hand rub or soap and water. If you wear a mask, then you must know how to use it and dispose of it properly.");
        System.out.println("");
        System.out.println("STATISTICS : ");
        System.out.println("Total cases on 30 May 2020 are 6,033,875 in the world, with total death of 366,894.");
        System.out.println("");
        System.out.println("TREATMENT :");
        System.out.println("no specific treatment");
        System.out.println("");
        System.out.println("PREVENTION");
        System.out.println("practise good hygiene, social distancing, cover mouth and nose when coughing or sneezing, in case of having symptoms seek immediate medical attention");
    }
    
     else if(input.equalsIgnoreCase("ebola")){
        System.out.println("INFORMATION : ");
        System.out.println("The virus is transmitted to people from wild animals and spreads in the human population through human-to-human transmission.");
        System.out.println("");
        System.out.println("FAQ : ");
        System.out.println("How do people become infected with the Ebola virus?");
        System.out.println("People become infected with Ebola either through contact with infected animals or through contact with the bodily fluids of infected humans.");
        System.out.println("Why are mourners at burial ceremonies considered at risk of contracting Ebola?");
        System.out.println("Levels of Ebola virus remain high after death, thus bodies of those who have died from Ebola virus disease must be handled only by people wearing appropriate personal protective equipment and must be buried immediately.");
        System.out.println("Why are health-care workers at greater risk of catching Ebola?");
        System.out.println("Health-care workers are at greater risk of infection if they are not wearing correct personal protective equipment");
        System.out.println("Can Ebola be transmitted sexually?");
        System.out.println("Sexual transmission of the Ebola virus, from males to females, is a strong possibility, but has not yet been proven.");
        System.out.println("How long does it take for people to develop symptoms after being infected?");
        System.out.println("The incubation period, or the time interval from infection to onset of symptoms, is from 2 to 21 days.");
        System.out.println("");
        System.out.println("STATISTICS : ");
        System.out.println("The average EVD case fatality rate is around 50%. Case fatality rates have varied from 25% to 90% in past outbreaks.");
        System.out.println("");
        System.out.println("TREATMENT :");
        System.out.println("no specific treatment");
        System.out.println("");
        System.out.println("PREVENTION");
        System.out.println("vaccine, wear masks, gloves and goggles, avoid contact with people and animals");
    }
    
     else if(input.equalsIgnoreCase("anaemia")){
        System.out.println("INFORMATION : ");
        System.out.println("Anaemia means that either the level of red blood cells or the level of haemoglobin is lower than normal. When a person has anaemia, their heart has to work harder to pump the quantity of blood needed to get enough oxygen around their body.");
        System.out.println("");
        System.out.println("FAQ : ");
        System.out.println("Which specialist should I see if I have anemia?");
        System.out.println("You should consult a general physician.");
        System.out.println("Is anemia hereditary?");
        System.out.println("Yes, hereditary disorders can cause anemia.");
        System.out.println("Will I become anaemic if I follow a vegan diet?");
        System.out.println("Cutting out meat, dairy and eggs can increase your risk of iron deficiency anaemia, but you can lower that risk by eating smart.");
        System.out.println("What happens if I leave anaemia untreated?");
        System.out.println("Iron-deficiency anaemia can cause serious health problems if left untreated for too long.");
        System.out.println("My iron levels are back to normal. Can I stop taking my supplement?");
        System.out.println("It’s important to carry on taking your iron supplement for at least another six months to build up iron levels in your bone marrow");
        System.out.println("");
        System.out.println("STATISTICS : ");
        System.out.println("Prevalence of anemia. Within the total sample, the overall prevalence of anemia in the US population was 5.6% with 95% confidence interval of 5.1–6.1%");
        System.out.println("");
        System.out.println("TREATMENT :");
        System.out.println("treatment as per prescription and the type of anaemia");
        System.out.println("");
        System.out.println("PREVENTION");
        System.out.println("get enough vitamin B12, avoid tea and coffee, eat iron-rich and vitamin C rich food");
    }
    
     else if(input.equalsIgnoreCase("dengue")){
        System.out.println("INFORMATION : ");
        System.out.println("Dengue fever is a mosquito-borne tropical disease caused by the dengue virus. Symptoms typically begin three to fourteen days after infection.");
        System.out.println("");
        System.out.println("FAQ : ");
        System.out.println("What is severe dengue?");
        System.out.println("Severe dengue is a potentially lethal complication which can develop from dengue infections");
        System.out.println("Where does the disease occur?");
        System.out.println("Dengue is mainly transmitted by a mosquito (Aedes aegypti) and is distributed across all tropical countries");
        System.out.println("What should I do if I suspect I have dengue?");
        System.out.println("If you suspect you have dengue you need to see a doctor immediately.");
        System.out.println("Where do the mosquitoes breed?");
        System.out.println("The mosquitoes thrive in areas close to human population");
        System.out.println("What can be done to reduce the risk of acquiring dengue?");
        System.out.println("The best preventive measure for areas infested with Aedes mosquito is to eliminate the mosquitoes’ egg laying sites");
        System.out.println("");
        System.out.println("STATISTICS : ");
        System.out.println("Each year, an estimated 390 million dengue infections occur around the world. Of these, around 500,000 cases develop into severe dengue,");
        System.out.println("");
        System.out.println("TREATMENT :");
        System.out.println("drink plenty of clean water, pain killers, intravenous (IV) fluid supplementation and blood transfusion (severe case)");
        System.out.println("");
        System.out.println("PREVENTION");
        System.out.println("remove stagnant water, use mosquito repellent and net, avoid exposing skin, avoid going out at dusk and dawn");
    }
     
     else if(input.equalsIgnoreCase("diarrhoeal disease")){
        System.out.println("INFORMATION : ");
        System.out.println("Diarrhoeal disease is the second leading cause of death in children under five years old. It is both preventable and treatable.");
        System.out.println("");
        System.out.println("FAQ : ");
        System.out.println("Why is diarrhoea dangerous?");
        System.out.println("When a person gets diarrhoea, the body begins to lose a lot of water and saltst, the body starts to \"dry up\" or get dehydrated. Severe dehydration can cause death.");
        System.out.println("How long will the effects of dehydration last?");
        System.out.println("If dehydration is not treated, it can cause death. If it is treated in time,recovery is usually complete.");
        System.out.println("Why are children more vulnerable?");
        System.out.println("Children with poor nutritional status and overall health, as well as those exposed to poor environmental conditions, are more susceptible to severe diarrhoea and dehydration than healthy children");
        System.out.println("Can diarrhea make you lose weight?");
        System.out.println("People with diarrhea can lose a lot of weight if they've been sick for a while, but they're losing mostly water weight.");
        System.out.println("Is tea good for diarrhea?");
        System.out.println("It may be especially effective at treating diarrhea");
        System.out.println("");
        System.out.println("STATISTICS : ");
        System.out.println("Each year diarrhoea kills around 525 000 children under five.");
        System.out.println("");
        System.out.println("TREATMENT :");
        System.out.println("Avoid caffeine, dairy products, and greasy, high fibre, or sugary foods, take paracetamol");
        System.out.println("");
        System.out.println("PREVENTION");
        System.out.println("access to safe drinking-water; use of improved sanitation; hand washing with soap; good personal and food hygiene, rotavirus vaccination");
    }
    
     else if(input.equalsIgnoreCase("lymphatic filariasis")||input.equalsIgnoreCase("elephantiasis")){
        System.out.println("INFORMATION : ");
        System.out.println("Lymphatic filariasis is a parasitic disease caused by microscopic, thread-like worms that only live in the human lymph system, which maintains the body's fluid balance and fights infections. It is spread from person to person by mosquitoes.");
        System.out.println("");
        System.out.println("FAQ : ");
        System.out.println("Can lymphatic filariasis be cured?");
        System.out.println("Since there is no known vaccine or cure for lymphatic filariasis, the most effective method that exists to control the disease is prevention.");
        System.out.println("How long does lymphatic filariasis last?");
        System.out.println("The worms can live for approximately 6–8 years and, during their life time");
        System.out.println("Can lymphatic filariasis kill you?");
        System.out.println("People infected with adult worms can take a yearly dose of medicine, called diethylcarbamazine (DEC), that kills the microscopic worms circulating in the blood.");
        System.out.println("How can I treat filaria at home?");
        System.out.println("Wash and dry the swollen areas daily.");
        System.out.println("Does filariasis cause itching?");
        System.out.println("Early symptoms of filarial infections may include the following: Onchocerciasis: severe itching of the skin that prevents sleep");
        System.out.println("");
        System.out.println("STATISTICS : ");
        System.out.println("An estimated 120 million people in tropical and subtropical areas of the world are infected with lymphatic filariasis");
        System.out.println("");
        System.out.println("TREATMENT :");
        System.out.println("antiparasitic drugs, such as diethylcarbamazine (DEC), mectizan, and albendazole (Albenza), using good hygiene to clean the affected areas,caring for wounds in the affected areas, exercising based on a doctor’s directions, surgery in extreme cases, which may include reconstructive surgery for the affected areas or surgery to remove affected lymphatic tissue");
        System.out.println("");
        System.out.println("PREVENTION");
        System.out.println("at night Sleep in an air-conditioned room or Sleep under a mosquito net, Between dusk and dawn Wear long sleeves and trousers and Use mosquito repellent on exposed skin.");
    }
    
     else if(input.equalsIgnoreCase("polio")||input.equalsIgnoreCase("poliomyelitis")){
        System.out.println("INFORMATION : ");
        System.out.println("Polio, or poliomyelitis, is a disabling and life-threatening disease caused by the poliovirus. The virus spreads from person to person and can infect a person's spinal cord, causing paralysis");
        System.out.println("");
        System.out.println("FAQ : ");
        System.out.println("How is polio transmitted?How is polio transmitted?");
        System.out.println("Poliovirus enters the body through the mouth, in water or food that has been contaminated with faecal material from an infected person.");
        System.out.println("Who is at risk of catching polio?Who is at risk of catching polio?");
        System.out.println("Polio mainly affects children under 5 years of age.");
        System.out.println("Is there a cure for polio?Is there a cure for polio?");
        System.out.println("No there is no cure for polio.");
        System.out.println("Where does wild poliovirus continue to circulate today?");
        System.out.println("There are just three countries which have never stopped polio transmission – Afghanistan, Nigeria and Pakistan");
        System.out.println("Could polio spread to other polio-free countries?Could polio spread to other polio-free countries?");
        System.out.println("Polio does not respect borders – any unimmunized child is at risk.");
        System.out.println("");
        System.out.println("STATISTICS : ");
        System.out.println("Wild poliovirus cases have decreased by over 99% since 1988, from an estimated 350 000 cases in more than 125 endemic countries then, to 33 reported cases in 2018.");
        System.out.println("");
        System.out.println("TREATMENT :");
        System.out.println("no specific treatment");
        System.out.println("");
        System.out.println("PREVENTION");
        System.out.println("vaccine, practise good hygiene and sanitation");
    }
    
     else if(input.equalsIgnoreCase("rabies")){
        System.out.println("INFORMATION : ");
        System.out.println("Rabies is a viral disease that causes inflammation of the brain in humans and other mammals. Early symptoms can include fever and tingling at the site of exposure.");
        System.out.println("");
        System.out.println("FAQ : ");
        System.out.println("How is rabies transmitted?");
        System.out.println("The rabies virus invades the nervous system of mammals. It is primarily transmitted from the rabid animal’s saliva when it bites or scratches someone.");
        System.out.println("How does one treat an animal bite?");
        System.out.println("Wounds should be washed and flushed immediately with soap and water for 10–15 minutes");
        System.out.println("Is rabies always fatal?");
        System.out.println("Human rabies caused by the classical rabies virus continues to be almost 100% fatal,");
        System.out.println("Can consumption of meat from an infected animal transmit rabies?");
        System.out.println("The consumption of raw meat from an infected animal requires PEP. Cooked meat does not transmit rabies;");
        System.out.println("Is it possible to develop rabies from the vaccination?");
        System.out.println("No. All rabies vaccines for human use are inactivated.");
        System.out.println("");
        System.out.println("STATISTICS : ");
        System.out.println("During 2018, 54 jurisdictions reported 4,951 cases of rabies in animals and 3 cases in humans to CDC.");
        System.out.println("");
        System.out.println("TREATMENT :");
        System.out.println("no efective treatment");
        System.out.println("");
        System.out.println("PREVENTION");
        System.out.println("vaccine");
    }
    
     else if(input.equalsIgnoreCase("salmonella")){
        System.out.println("INFORMATION : ");
        System.out.println("Salmonella infection (salmonellosis) is a common bacterial disease that affects the intestinal tract. Salmonella bacteria typically live in animal and human intestines and are shed through feces");
        System.out.println("");
        System.out.println("FAQ : ");
        System.out.println("Who's at risk?");
        System.out.println("Anyone can get salmonella.");
        System.out.println("Will rinsing fruits and vegetables get rid of salmonella?");
        System.out.println("Rinsing tainted fruits and vegetables probably won't get rid of salmonella");
        System.out.println("Does cooking kill salmonella?");
        System.out.println("Thorough cooking can kill salmonella.");
        System.out.println("How does salmonella spread?	");
        System.out.println("Salmonella can pass from human or animal feces to soil, fruits, vegetables, water, or other surfaces.");
        System.out.println("How is salmonella infection diagnosed?");
        System.out.println("By a stool test.");
        System.out.println("");
        System.out.println("STATISTICS : ");
        System.out.println("there are roughly 1.2 million cases of salmonella infections each year in the US, with an annual average of 23,000 hospitalizations and 450 deaths.");
        System.out.println("");
        System.out.println("TREATMENT :");
        System.out.println("Anti-diarrheals, Antibiotics");
        System.out.println("");
        System.out.println("PREVENTION");
        System.out.println("practise good hygiene, avoid eating raw food, take pets to veterinarian");
    }
    
     else if(input.equalsIgnoreCase("taeniasis")){
        System.out.println("INFORMATION : ");
        System.out.println("Taeniasis is an infection within the intestines by adult tapeworms belonging to the genus Taenia. There are generally no or only mild symptoms.");
        System.out.println("");
        System.out.println("FAQ : ");
        System.out.println("How did I get taeniasis?");
        System.out.println("Eating raw or undercooked contaminated beef or pork is the primary risk factor for acquiring taeniasis.");
        System.out.println("Is taeniasis common?");
        System.out.println("Taeniasis is under-reported in a significant portion of the world because diagnosis is difficult in resource-poor settings");
        System.out.println("Is medication available to treat taeniasis?	");
        System.out.println("Yes. Praziquantel is the drug of choice.");
        System.out.println("Should I be concerned about spreading taeniasis to the rest of my household?");
        System.out.println("No");
        System.out.println("Can I get taeniasis from my dog or cat that was diagnosed with tapeworm infection?");
        System.out.println("In general, no.");
        System.out.println("");
        System.out.println("STATISTICS : ");
        System.out.println("More than 80% of the world's 50 million people who are affected by epilepsy live in low and lower-middle income countries.");
        System.out.println("");
        System.out.println("TREATMENT :");
        System.out.println("praziquantel (Biltricide) and albendazole (Albenza).");
        System.out.println("");
        System.out.println("PREVENTION");
        System.out.println("eat thoroughly cooked food");
    }
    
     else if(input.equalsIgnoreCase("tetanus")){
        System.out.println("INFORMATION : ");
        System.out.println("Tetanus, also called lockjaw, is a serious infection caused by Clostridium tetani. This bacterium produces a toxin that affects the brain and nervous system, leading to stiffness in the muscles.");
        System.out.println("");
        System.out.println("FAQ : ");
        System.out.println("How long do you have to get a tetanus shot after a cut?");
        System.out.println("If the injured person hasn't had a tetanus shot in the past five years and the wound is deep or dirty, your doctor may recommend a booster. The injured person should have the booster shot within 48 hours of the injury.");
        System.out.println("How long does it take for tetanus symptoms to show?	");
        System.out.println("Signs and symptoms of tetanus appear anytime from a few days to several weeks after tetanus bacteria enter your body through a wound.");
        System.out.println("Is tetanus shot necessary?	");
        System.out.println("Adults don't need a tetanus or diphtheria booster if they had the vaccines as a child");
        System.out.println("Is tetanus transferable?");
        System.out.println("Transmission. Tetanus is spread by the direct transfer of C. tetani spores from soil and excreta of animals and humans to wounds and cuts.");
        System.out.println("Can I take tetanus after 48 hours?");
        System.out.println("In those who are not up to date on their tetanus immunization, a booster should be given within 48 hours of an injury.");
        System.out.println("");
        System.out.println("STATISTICS : ");
        System.out.println("It is estimated that tetanus causes 213 000 – 293 000 deaths worldwide each year and that it is responsible for 5–7% of all neonatal deaths3,18 and 5% of maternal deaths globally.");
        System.out.println("");
        System.out.println("TREATMENT :");
        System.out.println("Antitoxin, Antibiotics, Vaccine, Sedatives, Other drugs as per prescription, no effective treatment");
        System.out.println("");
        System.out.println("PREVENTION");
        System.out.println("vaccine and good wound care");
    }
    
     else if(input.equalsIgnoreCase("Typhoid")){
        System.out.println("INFORMATION : ");
        System.out.println("Typhoid is a bacterial infection that can lead to a high fever, diarrhea, and vomiting. It can be fatal. It is caused by the bacteria Salmonella typhi.");
        System.out.println("");
        System.out.println("FAQ : ");
        System.out.println("Can a person get typhoid twice?");
        System.out.println("Although rare, re-infection may also occur and can be distinguished from relapse by molecular typing");
        System.out.println("Can typhoid fever kill you?	");
        System.out.println("Yes, typhoid fever or typhus is deadly,");
        System.out.println("How long does it take to recover from typhoid?");
        System.out.println("With appropriate antibiotic therapy, there is usually improvement within one to two days and recovery within seven to 10 days.");
        System.out.println("How does typhoid fever reproduce?");
        System.out.println("If someone else eats food or drinks water that has been contaminated with a small amount of infected faeces or urine, they can become infected with the bacteria and develop typhoid fever.");
        System.out.println("What should we not eat in typhoid?");
        System.out.println("Avoid raw, unpeeled fruits and vegetables that may have been washed with contaminated water, especially lettuce and fruits like berries that can't be peeled.");
        System.out.println("");
        System.out.println("STATISTICS : ");
        System.out.println("According to the most recent estimates, between 11 and 21 million cases and 128 000 to 161 000 typhoid-related deaths occur annually worldwide");
        System.out.println("");
        System.out.println("TREATMENT :");
        System.out.println("Ciprofloxacin (Cipro), Azithromycin (Zithromax), Ceftriaxone, drinking fluids, surgery (severe case)");
        System.out.println("");
        System.out.println("PREVENTION");
        System.out.println("vaccine, wash hands, eat hot food, avoid drinking untreated water, avoid raw fruits and vegetables");
    }
    
     else if(input.equalsIgnoreCase("yellow fever")){
        System.out.println("INFORMATION : ");
        System.out.println("Yellow fever is a viral infection transmitted by a bite from infected mosquitoes most commonly found in parts of South America and Africa.");
        System.out.println("");
        System.out.println("FAQ : ");
        System.out.println("How long does yellow fever last?");
        System.out.println("about three to four days");
        System.out.println("How dangerous is yellow fever?");
        System.out.println("In mild cases, yellow fever causes a fever, headache, nausea and vomiting. But yellow fever can become more serious");  
        System.out.println("Do I really need yellow fever vaccination?");
        System.out.println("As yellow fever is frequently fatal for those who have not been vaccinated, vaccination is recommended for all travellers");
        System.out.println("How often do you need a yellow fever shot?");
        System.out.println("recommended every 10 years for people who continued to be at risk of the infection");
        System.out.println("What part of the body does yellow fever attack?");
        System.out.println("When transmitted to humans, the yellow fever virus can damage the liver and other internal organs and be potentially fatal");
        System.out.println("");
        System.out.println("STATISTICS : ");
        System.out.println("Yellow fever virus is estimated to cause 200,000 cases of disease and 30,000 deaths each year, with 90% occurring in Africa.");
        System.out.println("");
        System.out.println("TREATMENT :");
        System.out.println("no specific treatment");
        System.out.println("");
        System.out.println("PREVENTION");
        System.out.println("vaccine, stay indoors, cover skin, use mosquito repelllent");
    }
    
     else if(input.equalsIgnoreCase("zika virus")){
        System.out.println("INFORMATION : ");
        System.out.println("Zika virus is a mosquito-borne flavivirus that was first identified in Uganda in 1947 in monkeys. It was later identified in humans in 1952 in Uganda and the United Republic of Tanzania.");
        System.out.println("");
        System.out.println("FAQ : ");
        System.out.println("How long does the Zika virus stay in your system?");
        System.out.println("half of the participants had detectable virus particles in blood serum at 14 days after the start of symptoms with five percent still detectable at 54 days.");
        System.out.println("Does Zika virus go away?");
        System.out.println("Zika virus does not seem to pose a risk of birth defects for future pregnancies.");
        System.out.println("Is Zika still a threat 2020?");
        System.out.println("As of January 2020, there are no areas with a current Zika outbreak");
        System.out.println("How many people have died from Zika virus?");
        System.out.println("Although an estimated 5,000 people were infected, representing more than 70% of the island's tiny population, no one was hospitalized and no one died.");
        System.out.println("Can I die from Zika?");
        System.out.println("the Zika virus typically is not fatal, the long-term side-effects of the virus can be devastating especially among babies infected while in-utero.");
        System.out.println("");
        System.out.println("STATISTICS : ");
        System.out.println("In 2017, it was estimated that over 120 million people in Brazil were at risk of Zika virus infections, compared to 32 million people in Mexico and 29.5 million in Columbia.");
        System.out.println("");
        System.out.println("TREATMENT :");
        System.out.println("no specific treatment");
        System.out.println("");
        System.out.println("PREVENTION");
        System.out.println("stay indoors, cover skin, use mosquito repellent");
    }
    
     else if(input.equalsIgnoreCase("malaria")){
        System.out.println("INFORMATION : ");
        System.out.println("Malaria is a serious and sometimes fatal disease caused by a parasite that commonly infects a certain type of mosquito which feeds on humans.");
        System.out.println("");
        System.out.println("FAQ : ");
        System.out.println("What happens if you leave Malaria untreated?");
        System.out.println("If malaria is left untreated, it could result in anemia, jaundice, mental confusion, kidney failure, a coma, seizures and even death");
        System.out.println("How does malaria kill you?");
        System.out.println("The parasite first travels to a human's liver to grow and multiply. It then travels in the bloodstream and infects and destroys red blood cells.");
        System.out.println("Can malaria cure itself?");
        System.out.println("With proper treatment, symptoms of malaria usually go away quickly, with a cure within two weeks");
        System.out.println("Does Malaria stay in your blood forever?");
        System.out.println("in general, if you are correctly treated for malaria, the parasites are eliminated and you are no longer infected with malaria.");
        System.out.println("What malaria feels like?");
        System.out.println("Along with high fever, shaking chills and sweating, symptoms can include: Throwing up or feeling like you're going to. Headache.");
        System.out.println("");
        System.out.println("STATISTICS : ");
        System.out.println("In 2018, there were an estimated 228 million cases of malaria worldwide.The estimated number of malaria deaths stood at 405 000 in 2018.");
        System.out.println("");
        System.out.println("TREATMENT :");
        System.out.println("Artemisinin-based combination therapies (ACTs), Chloroquine phosphate");
        System.out.println("");
        System.out.println("PREVENTION");
        System.out.println("use mosquito repellent and net, stay indoors, antimalarial tablets, in case of having symptoms seek immediate medical attention");
    }
    
     else if(input.equalsIgnoreCase("smallpox")){
        System.out.println("INFORMATION : ");
        System.out.println("Smallpox was an infectious disease caused by one of two virus variants, Variola major and Variola minor");
        System.out.println("");
        System.out.println("FAQ : ");
        System.out.println("How long does Smallpox take to kill you?");
        System.out.println("Most people with the late stage form died within 8 to 12 days of illness.");
        System.out.println("How many people did smallpox kill?");
        System.out.println("An estimated 300 million people died from smallpox in the 20th century alone.");
        System.out.println("Does smallpox still exist?");
        System.out.println("Currently, there is no evidence of naturally occurring smallpox transmission anywhere in the world.");
        System.out.println("Can you be naturally immune to smallpox?");
        System.out.println("An interesting observation during the smallpox scourge was that people who survived natural smallpox developed life-long immunity against the disease");
        System.out.println("What organs does smallpox attack?");
        System.out.println("The virus starts in the lungs. From there, the virus invades the bloodstream and spreads to the skin, intestines, lungs, kidneys, and brain.");
        System.out.println("");
        System.out.println("STATISTICS : ");
        System.out.println("Between 20 and 60% of all those infected—and over 80% of infected children—died from the disease. During the 20th century, it is estimated that smallpox was responsible for 300–500 million deaths.");
        System.out.println("");
        System.out.println("TREATMENT :");
        System.out.println("no effective treatment");
        System.out.println("");
        System.out.println("PREVENTION");
        System.out.println("vaccine and antiviral drugs");
    }
    
     else if(input.equalsIgnoreCase("cholera")){
        System.out.println("INFORMATION : ");
        System.out.println("Cholera is an infectious disease that causes severe watery diarrhea, which can lead to dehydration and even death if untreated. It is caused by eating food or drinking water contaminated with a bacterium called Vibrio cholerae.");
        System.out.println("");
        System.out.println("FAQ : ");
        System.out.println("Can a person survive cholera?");
        System.out.println("people who don't receive treatment can die of dehydration and shock hours to days after cholera symptoms first appear.");   
        System.out.println("How does cholera kill?");
        System.out.println("The nasty bacterium responsible is a one-celled microscopic organism that kills by causing an infection in the small intestine.");
        System.out.println("How is cholera caused?");
        System.out.println("Cholera is an infectious disease that causes severe watery diarrhea, which can lead to dehydration and even death if untreated");
        System.out.println("Can you be cured of cholera?");
        System.out.println("Cholera is highly treatable, but because dehydration can happen quickly, it's important to get cholera treatment right away.");
        System.out.println("Is there a vaccine for cholera?");
        System.out.println("Vaxchora is the only cholera vaccine approved by the FDA,");
        System.out.println("");
        System.out.println("STATISTICS : ");
        System.out.println("Researchers have estimated that each year there are 1.3 million to 4.0 million cases of cholera, and 21 000 to 143 000 deaths worldwide due to cholera");
        System.out.println("");
        System.out.println("TREATMENT :");
        System.out.println("Rehydration, Intravenous fluids, Antibiotics, Zinc supplements");
        System.out.println("");
        System.out.println("PREVENTION");
        System.out.println("practise good hygiene and sanitation, drink clean water, eat clean and well cooked food");
    }
    
     else if(input.equalsIgnoreCase("pneumonia")){
        System.out.println("INFORMATION : ");
        System.out.println("Pneumonia is an infection in one or both lungs. Bacteria, viruses, and fungi cause it. The infection causes inflammation in the air sacs in your lungs, which are called alveoli.");
        System.out.println("");
        System.out.println("FAQ : ");
        System.out.println("What are the 4 stages of pneumonia?	");
        System.out.println("Pneumonia has four stages, namely consolidation, red hepatization, grey hepatization and resolution.");
        System.out.println("How long can a person with pneumonia live?");
        System.out.println("However, the 30-day mortality rate is 5 to 10 percent of hospitalized patients");
        System.out.println("Can you catch pneumonia from someone who has it?");
        System.out.println("Pneumonia is a lung infection caused by bacteria, viruses, or fungi. Some of these germs do spread from person to person,");
        System.out.println("Can I have pneumonia without a fever?");
        System.out.println("While fever is a common symptom of pneumonia, it's possible to have pneumonia without a fever.");
        System.out.println("Should I go to work with pneumonia?	");
        System.out.println("Don't go back to school or work until after your temperature returns to normal and you stop coughing up mucus.");
        System.out.println("");
        System.out.println("STATISTICS : ");
        System.out.println("About 1 million adults in the US seek care in a hospital due to pneumonia every year, and 50,000 die from this disease.");
        System.out.println("");
        System.out.println("TREATMENT :");
        System.out.println("Antibiotics, Cough medicine, Fever reducers/pain relievers, hospitalisation (specific cases)");
        System.out.println("");
        System.out.println("PREVENTION");
        System.out.println("healthy diet, avoid smoking, wash hands well, rest well, avoid exposure to sick people");
    }
    
     else if(input.equalsIgnoreCase("leprosy")){
        System.out.println("INFORMATION : ");
        System.out.println("Leprosy, also known as Hansen's disease (HD), is a long-term infection by the bacteria Mycobacterium leprae or Mycobacterium lepromatosis. Infection can lead to damage of the nerves, respiratory tract, skin, and eyes");
        System.out.println("");
        System.out.println("FAQ : ");
        System.out.println("How long does leprosy take to kill you?");
        System.out.println("Symptoms may occur within 1 year but can also take as long as 20 years or even more to occur.");
        System.out.println("Can leprosy be transmitted by touch?");
        System.out.println("It is not hereditary and cannot be caught by touch");
        System.out.println("Do lepers feel pain?");
        System.out.println("This nerve damage may result in a lack of ability to feel pain");
        System.out.println("Can leprosy be cured permanently?");
        System.out.println("Leprosy is completely curable through a course of multi-drug therapy (MDT) for six months or a year.");
        System.out.println("Do body parts fall off leprosy?");
        System.out.println("In short: no. Leprosy attacks the nerves in the cooler parts of the body");
        System.out.println("");
        System.out.println("STATISTICS : ");
        System.out.println("The most recent World Health Organisation (WHO) figures state that in 2018 there were 208,619 new cases of leprosy diagnosed.");
        System.out.println("");
        System.out.println("TREATMENT :");
        System.out.println("antibiotics and anti-inflammatory drugs as per prescription");
        System.out.println("");
        System.out.println("PREVENTION");
        System.out.println("practise good hygiene, avoid exposure to sick people");
    }
    
     else if(input.equalsIgnoreCase("meningitis")){
        System.out.println("INFORMATION : ");
        System.out.println("Meningitis is an inflammation (swelling) of the protective membranes covering the brain and spinal cord. A bacterial or viral infection of the fluid surrounding the brain and spinal cord usually causes the swelling.");
        System.out.println("");
        System.out.println("FAQ : ");
        System.out.println("How quickly does meningitis kill?");
        System.out.println("Can kill within 4 hours and can affect anyone!");
        System.out.println("Can you catch meningitis from someone?");
        System.out.println("But most of the germs that can lead to bacterial meningitis aren't contagious. ... Not all bacteria that cause meningitis are spread from one person to another");
        System.out.println("Does Meningitis go away by itself?");
        System.out.println("It often goes away on its own and usually does not cause permanent damage or disability");
        System.out.println("How easy is it to get meningitis?");
        System.out.println("They easily spread through coughing and sneezing.");
        System.out.println("How long do you have to live if you have meningitis?");
        System.out.println("Most people with mild viral meningitis usually get better on their own within 7 to 10 days.");
        System.out.println("");
        System.out.println("STATISTICS : ");
        System.out.println("Of those who get meningococcal disease 10-15 percent die. Among those who survive, approximately 1 in 5 live with permanent disabilities, such as brain damage, hearing loss, loss of kidney function or limb amputations.");
        System.out.println("");
        System.out.println("TREATMENT :");
        System.out.println("medications and treatments as per prescription and type of Meningitis");
        System.out.println("");
        System.out.println("PREVENTION");
        System.out.println("vaccine based on the type of Meningitis");
    }
    
     else if(input.equalsIgnoreCase("marburg virus")){
        System.out.println("INFORMATION : ");
        System.out.println("Marburg virus disease is a highly virulent disease that causes haemorrhagic fever");
        System.out.println("");
        System.out.println("FAQ : ");
        System.out.println("Where did the virus originated?");
        System.out.println("The virus is found in sub-Saharan Africa.");
        System.out.println("What are the symptoms of this disease?");
        System.out.println("Symptoms usually appear 2 to 21 days after exposure and include sudden fever, muscle pain, headache, and intense weakness.");
        System.out.println("Is there cure for Marburg virus?");
        System.out.println("There is no specific treatment for Marburg virus disease.");
        System.out.println("How is Marburg virus transmitted?");
        System.out.println("The Marburg virus is transmitted via direct contact with the blood, bodily fluids and tissues of infected persons");
        System.out.println("Is the Marburg virus contagious?");
        System.out.println("Yes.Transmission of the virus from person to person requires extremely close contact with a patient");
        System.out.println("");
        System.out.println("STATISTICS : ");
        System.out.println("The average MVD case fatality rate is around 50%. Case fatality rates have varied from 24% to 88% in past outbreaks");
        System.out.println("");
        System.out.println("TREATMENT :");
        System.out.println("no specific treatment");
        System.out.println("");
        System.out.println("PREVENTION");
        System.out.println("avoid direct physical contact with the sick, practise good hygiene and sanitation, wear protective gowns, gloves and mask");
    }
    
     else if(input.equalsIgnoreCase("spinal cord injury")){
        System.out.println("INFORMATION : ");
        System.out.println("A spinal cord injury (SCI) is damage to the spinal cord that causes temporary or permanent changes in its function.");
        System.out.println("");
        System.out.println("FAQ : ");
        System.out.println("What are Spinal Cord Injuries?");
        System.out.println("Spinal cord injuries are those that result in damage to the spinal cord, a bundle of nerves that are located in the spinal column.");
        System.out.println("What are the Locations That Spinal Cord Injuries Can Occur?	");
        System.out.println("These injuries typically are divided into three main areas: cervical spinal cord, thoracic spinal, cord lumbar spinal cord");
        System.out.println("Is There Any Cure for Spinal Cord Injuries?	");
        System.out.println("Currently there is no all-inclusive “cure” for paralysis that results from spinal cord injuries (SCI)");
        System.out.println("What are the Chances of Recovery from a Cervical Spinal Cord Injury?");
        System.out.println("There is no way to fully reverse the damages to the cervical spine");
        System.out.println("Can People with Spinal Cord Injury Still Have Sex?	");
        System.out.println("Absolutely. After a spinal cord injury, a person can continue to be sexually active and experience a satisfying intimate relationship");
        System.out.println("");
        System.out.println("STATISTICS : ");
        System.out.println("Given the current U.S. population size of 328 million people, a recent estimate showed that the annual incidence of spinal cord injury (SCI) is approximately 54 cases per one million people in the United States, or about 17,730 new SCI cases each year.");
        System.out.println("");
        System.out.println("TREATMENT :");
        System.out.println("medications as per prescription, immobilisation, surgery");
        System.out.println("");
        System.out.println("PREVENTION");
        System.out.println("drive safely, avoid falls");
    }
    
     else if(input.equalsIgnoreCase("E.coli")||input.equalsIgnoreCase("E coli")){
        System.out.println("INFORMATION : ");
        System.out.println("Escherichia coli, also known as E. coli, is a Gram-negative, facultative anaerobic, rod-shaped, coliform bacterium of the genus Escherichia that is commonly found in the lower intestine of warm-blooded organisms.");
        System.out.println("");
        System.out.println("FAQ : ");
        System.out.println("Can you infect yourself with E coli?");
        System.out.println("It's mostly harmless, but some strains of this bacteria can cause infection and illness.");
        System.out.println("How long are you contagious with E coli?");
        System.out.println("The person is contagious as long as these bacteria can be found in their stool.");
        System.out.println("What is the best treatment for E coli?");
        System.out.println("The best way to treat E. coli infection is to drink plenty of fluids to avoid dehydration and to get as much rest as possible.");
        System.out.println("Is E coli sexually transmittable?");
        System.out.println("Yes.Sex can push bacteria further into your body through penetration, which sets up a higher likelihood of an infection.");
        System.out.println("What happens if E coli goes untreated?");
        System.out.println("If left untreated, UTIs can possibly lead to complications, including recurring infections, permanent kidney damage.");
        System.out.println("");
        System.out.println("STATISTICS : ");
        System.out.println("E.coli causes an estimated 96,000 illnesses, 3,200 hospitalizations and 31 deaths in the U.S.");
        System.out.println("");
        System.out.println("TREATMENT :");
        System.out.println("drink plenty of water, rest well, seek medical attention (severe)");
        System.out.println("");
        System.out.println("PREVENTION");
        System.out.println("washing fruits and vegetables thoroughly, avoiding cross-contamination by using clean utensils, keeping raw meats away from other foods, always defrosting meat in the refrigerator or microwave,\n" +
"refrigerating leftovers immediately, drinking only pasteurized milk products (avoiding raw milk), not preparing food if you have diarrhea");
    }
    
     else if(input.equalsIgnoreCase("hand,foot and mouth disease")){
        System.out.println("INFORMATION : ");
        System.out.println("Hand, foot, and mouth disease (HFMD) is a common infection in children that causes sores called ulcers inside or around their mouth and a rash or blisters on their hands, feet, legs, or buttocks. It can be painful, but it isn't serious.");
        System.out.println("");
        System.out.println("FAQ : ");
        System.out.println("Can adults get hand foot mouth disease from child?");
        System.out.println("older children and adults can also get HFMD");
        System.out.println("Do you have to report hand foot and mouth disease?");
        System.out.println("Call your pediatrician now or go to the ER if you suspect your child is dehydrated.");
        System.out.println("What should I do if I have been exposed to hand foot and mouth?");
        System.out.println("Clean, rinse, and sanitize toys that may have come in contact with your child's saliva");
        System.out.println("Will antibiotics help hand foot mouth disease?");
        System.out.println("Antibiotics do not work because the infection is caused by a virus");
        System.out.println("Can You Catch Hand Foot and Mouth twice?");
        System.out.println("HFMD is caused by several kinds of viruses. So even if you've had it, you can get it again");
        System.out.println("");
        System.out.println("STATISTICS : ");
        System.out.println("From 2010 to 2014, there were an estimated 3,605 to 9,271 cases of HFMD, with 1 to 3 deaths.");
        System.out.println("");
        System.out.println("TREATMENT :");
        System.out.println("no specific treatment");
        System.out.println("");
        System.out.println("PREVENTION");
        System.out.println("wash hands with soap and water, avoid ttouhing eyes, nose and mouth, avoid close contact with the sick, disinfect frequently touched surfaces");
    }
    
     else if(input.equalsIgnoreCase("allergic rhinitis")||input.equalsIgnoreCase("rhinitis")){
        System.out.println("INFORMATION : ");
        System.out.println("Allergic rhinitis, also known as hay fever, is a type of inflammation in the nose which occurs when the immune system overreacts to allergens in the air.");
        System.out.println("");
        System.out.println("FAQ : ");
        System.out.println("What can trigger allergic rhinitis?");
        System.out.println("Allergic rhinitis is triggered by breathing in tiny particles of allergens.");
        System.out.println("Is allergic rhinitis dangerous?");
        System.out.println("Although allergic rhinitis is not a life-threatening condition, complications can occur and the condition can significantly impair quality of life");
        System.out.println("Is allergic rhinitis forever?");
        System.out.println("Common short-term treatment options for allergic rhinitis include antihistamines and nasal decongestants.");
        System.out.println("Can allergic rhinitis be cured?");
        System.out.println("There is no cure for allergic rhinitis");
        System.out.println("Can rhinitis last for years?");
        System.out.println("Chronic rhinitis is best described as a set of symptoms that persists for months or even years.");
        System.out.println("");
        System.out.println("STATISTICS : ");
        System.out.println("In 2012, 7.5% or 17.6 million adults were diagnosed with hay fever in the past 12 months");
        System.out.println("");
        System.out.println("TREATMENT :");
        System.out.println("Antihistamines, Decongestants, Nasal corticosteroids, Leukotriene receptor antagonists, Cromolyn sodium");
        System.out.println("");
        System.out.println("PREVENTION");
        System.out.println("wash hands often with soap and water, avoid touching and rubbing your nose, keep bed linens and pillowcases clean, keep pets out, wear sunglasses to reduce pollen getting into the eyes");
    }
    
     else if(input.equalsIgnoreCase("psoriasis")){
        System.out.println("INFORMATION : ");
        System.out.println("Psoriasis is a skin disease that causes red, itchy scaly patches, most commonly on the knees, elbows, trunk and scalp.");
        System.out.println("");
        System.out.println("FAQ : ");
        System.out.println("What triggers psoriasis?");
        System.out.println("Cold and dry weather. Such weather can dry out your skin, which makes the chances of having a flare-up worse.");
        System.out.println("Which food is bad for psoriasis?");
        System.out.println("Red meat and dairy. Both red meat and dairy, especially eggs");
        System.out.println("Does psoriasis spread if you scratch it?");
        System.out.println("Scratching a psoriasis rash does not cause it to spread from one location to another.");
        System.out.println("How do I get rid of psoriasis fast?	");
        System.out.println("Dead Sea salts. Bath solutions, such as Dead Sea salts, oil, oilated oatmeal, or Epsom salts");
        System.out.println("Is coffee bad for psoriasis?");
        System.out.println("There have been reports that coffee increases the risk of psoriasis and that coffee helps quell psoriasis");
        System.out.println("");
        System.out.println("STATISTICS : ");
        System.out.println("According to current studies, more than 8 million Americans have psoriasis. 125 million people worldwide");
        System.out.println("");
        System.out.println("TREATMENT :");
        System.out.println("Corticosteroids, Vitamin D analogues, Retinoids. Calcineurin inhibitors, Salicylic acid, Goeckerman therapy, Anthralin. ");
        System.out.println("");
        System.out.println("PREVENTION");
        System.out.println("take care of skin and scalp, avoid dry cold weather, manage stress, maintain healthy weight");
    }
    
     else if(input.equalsIgnoreCase("lupus")||input.equalsIgnoreCase("lupus vulgaris")){
        System.out.println("INFORMATION : ");
        System.out.println("Lupus vulgaris (also known as tuberculosis luposa) are painful cutaneous tuberculosis skin lesions with nodular appearance, most often on the face around the nose, eyelids, lips, cheeks, ears and neck.");
        System.out.println("");
        System.out.println("FAQ : ");
        System.out.println("What does tuberculosis of the skin look like?");
        System.out.println("The skin lesions of acute miliary tuberculosis are nonspecific, and consist of erythematous papules, vesicles, or pustules.");
        System.out.println("Can TB cause lupus?	");
        System.out.println("Systemic Lupus Erythematosus (SLE) and Tuberculosis (TB) are intricately related with an increase in the risk of TB in SLE.");
        System.out.println("Can a lupus test be wrong?");
        System.out.println("No single laboratory test can determine whether a person has lupus.");
        System.out.println("How long do lupus patients live?");
        System.out.println("Research has shown that many people with a lupus diagnosis have been living with the disease for up to 40 years.");
        System.out.println("Does lupus affect eyesight?	");
        System.out.println("The effects lupus may have in and around the eyes include: changes in the skin around the eyelids, dry eyes, inflammation of the white outer layer of the eyeball.");
        System.out.println("");
        System.out.println("STATISTICS : ");
        System.out.println("Lupus vulgaris (LV) is the commonest form of cutaneous TB accounting for 75% of the cases.");
        System.out.println("");
        System.out.println("TREATMENT :");
        System.out.println("combination therapy of drugs used for tuberculosis as per prescription");
        System.out.println("");
        System.out.println("PREVENTION");
        System.out.println("nil");
    }
    
     else if(input.equalsIgnoreCase("melanoma")){
        System.out.println("INFORMATION : ");
        System.out.println("Melanoma, the most serious type of skin cancer, develops in the cells (melanocytes) that produce melanin — the pigment that gives your skin its color.");
        System.out.println("");
        System.out.println("FAQ : ");
        System.out.println("How long does it take for melanoma to spread?");
        System.out.println("Melanoma can grow very quickly.");
        System.out.println("How does melanoma cause death?");
        System.out.println("In situ melanomas don't spread to other parts of the body or cause death");
        System.out.println("Can you pick off melanoma?");
        System.out.println("Yes, you might be able to pick this crusty lesion off with your fingers.");
        System.out.println("Is Melanoma an aggressive cancer?");
        System.out.println("Malignant melanoma is a highly aggressive cancer that tends to spread to other parts of the body.");
        System.out.println("Can you beat melanoma cancer?");
        System.out.println("Fortunately, most cases of melanoma are caught early enough that only surgery is needed to cure the disease");
        System.out.println("");
        System.out.println("STATISTICS : ");
        System.out.println("About 100,350 new melanomas will be diagnosed (about 60,190 in men and 40,160 in women). About 6,850 people are expected to die of melanoma (about 4,610 men and 2,240 women).");
        System.out.println("");
        System.out.println("TREATMENT :");
        System.out.println("Surgery to remove affected lymph nodes, Immunotherapy, Targeted therapy, Radiation therapy, Chemotherapy");
        System.out.println("");
        System.out.println("PREVENTION");
        System.out.println("wear sunscreen, wear protective clothing");
    }
    else
        System.out.println("Sorry! No information found in database");
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }
    
    
    
}
