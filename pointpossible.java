import java.util.Scanner;

public class pointpossible {
    public static void main(String args[]) {
//Task: Create a program/algorithm that can take a nba score and post the different possiblities that scored has been tallied. (Do wit NFL SCORES next?)

/*Scoring elements: Technical fouls(1 point attempt)
Free throws (2 or 3 point attempt)
Two point basket
3 point basket*/ //Don't count opponent self made basket (or have some kind of exception/caveat for it)

/*Keep in mind: There can only be so many technicals/normal fouls before all the members of oppsoing team can't play anymore*/

//boolean loop1over = false;
//boolean loop2over = false;
int totalTD = 0;
int totalFG = 0;
int totalsafety = 0;
int totalxpoints = 0;
int totaloutcomes = 0;

Scanner scan = new Scanner (System.in);

System.out.print("Enter sport (Football or Basketball: ");
if( scan.hasNextLine()){

String sport = scan.nextLine();

//System.out.print("Enter the point total of one player"); //For basketball






if(sport.equals("Football")){
    System.out.print("Enter the point total of one team: ");
    int totalpoints = scan.nextInt();

/*Football scoring elements:
Touchdowns (6 points), Extra points (1 point), Safety (2 points), Field goals (3 points)     */

//Create a for loop, that first starts with trying to subtract TD's from the total, and if theres a remainder



/* 
for (int x=totalpoints-1; x>0; x=x-6;){

}*/


//ArrayList <String,String> array1 = new ArrayList<>();
int check1 = 0;
for (int x=totalpoints; x>=7 ; x=x-7){
++totalTD;    
check1 = x-7;
}

   for (int x=check1; x>=3; x=x-3){ //if(check%3=0){
        ++totalFG;
        check1 = x-3;
    }
     for (int x=check1; x>=2; x=x-2){ //if(check%3=0){
        ++totalsafety;
        check1 = x-2;
    }
    ++totaloutcomes;
    System.out.print("Outcome Number:"+ totaloutcomes + "\n");
System.out.println("Total TD's: " + totalTD+ "\n Total Field Goals: " + totalFG + "\n Total Safeties: " + totalsafety + "\n Total Extra Points: " + totalxpoints);



//New priority

totalTD =0;
totalFG=0; 
totalsafety=0;
 check1 = 0;

   for (int x=totalpoints; x>=3; x=x-3){ 
        ++totalFG;
        check1 = x-3;
    }
     for (int x=check1; x>=2; x=x-2){ 
        ++totalsafety;
        check1 = x-2;
    }
    ++totaloutcomes;
    System.out.print("\n" + "Outcome Number:"+ totaloutcomes + "\n");
System.out.println("Total TD's: " + totalTD+ "\n Total Field Goals: " + totalFG + "\n Total Safeties: " + totalsafety + "\n Total Extra Points: " + totalxpoints);

//New priority (#3)

totalTD =0;
totalFG=0; 
totalsafety=0;
 check1 = 0;


     for (int x=totalpoints; x>=2; x=x-2){ 
        ++totalsafety;
        check1 = x-2;
    }
    ++totaloutcomes;
    System.out.print("\n" + "Outcome Number:"+ totaloutcomes + "\n");
System.out.println("Total TD's: " + totalTD+ "\n Total Field Goals: " + totalFG + "\n Total Safeties: " + totalsafety + "\n Total Extra Points: " + totalxpoints);



/* 
totalTD =0;    
for (int x=totalpoints; x>0; x=x-3;){

}

for (int x=totalpoints; x>0; x=x-2;){

}

for (int x=totalpoints-1; x>0; x=x-6;){ 
    //Missed extra points option

}*/


//Above is what we need to work on; How do we create different outcomes and variants?


/* 
System.out.println("Going through points...");
while (totalpoints>5 ){
   // ++totaloutcomes;
    totalpoints= totalpoints -6; //integrate extra points
    ++totalTD;
    System.out.println(totalpoints);
    if(totalpoints<6){

   loop1over = true;
        
    }
    
    
    }
  
    
    if (totalpoints>0){
        
    
System.out.println("Continued Calculating:");
    while(totalpoints>0){
        if(totalpoints-3>=0){
            totalpoints= totalpoints -3;
            ++totalFG;
            System.out.print(totalpoints);
            System.out.println(" Continued Calculating1:");
        }
        else if(totalpoints-2>=0){
            totalpoints= totalpoints -2;
            ++totalsafety;
            System.out.println("Continued Calculating2:");
        }

        else if(totalpoints-1>=0){
            totalpoints= totalpoints -1;
            ++totalxpoints;
            System.out.println("Continued Calculating3:");
        }
    }

   
}*/
/*
System.out.print("Total number of outcomes:"+ totaloutcomes + "\n");
System.out.print("Total TD's: " + totalTD+ "\n Total Field Goals: " + totalFG + "\n Total Safeties: " + totalsafety + "\n Total Extra Points: " + totalxpoints);*/
}

else{
    System.out.print("Incorrect input: please try again");
    sport = scan.nextLine();
}


}
    
    }
}