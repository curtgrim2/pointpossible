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
//int totalxpoints = 0;
//int totaloutcomes = 0;

Scanner scan = new Scanner (System.in);

System.out.print("Enter sport (Football or Basketball: ");
if( scan.hasNextLine()){

String sport = scan.nextLine();

//System.out.print("Enter the point total of one player"); //For basketball

if(sport.equals("f")){
    System.out.print("Enter the point total of one team: ");
    int totalpoints = scan.nextInt();

for(int iterator = 0; iterator < totalpoints; iterator +=7){
    if(iterator + 7 > totalpoints){

    }

    else{
     totalTD++;
    }
    }

for(int iterator = 0; iterator < totalpoints; iterator +=3){
       if(iterator + 3 > totalpoints){

       }

       else{
        totalFG++;
       }
  
     }

 for(int iterator = 0; iterator < totalpoints; iterator +=2){
    if(iterator + 2 >totalpoints){

    }

    else{
     totalsafety++;
    }
}

int referenceTD = totalTD;
int referenceFG = totalFG;
int referenceSAFE =totalsafety;

/* 
totalTD = 0;
totalFG = 0;
totalsafety = 0;
*/
for(int iterator = 7; iterator>referenceTD; iterator +=7){
    int placeholder = iterator;

    for(int iterator2 = 0; iterator2<referenceFG; iterator2++){
while(iterator < totalpoints){
    iterator += 3;
}

if(iterator == totalpoints){

}

else{

}
    }
iterator = placeholder;
}


    System.out.println("There will be at least " + totalTD + " TD's, " + totalFG + " FG's and " + totalsafety + " Safeties.");
} 

else{
    System.out.print("Incorrect input: please try again");
    sport = scan.nextLine();
}


}
    
    }
}
