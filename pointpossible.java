import java.util.Scanner;

public class pointpossible {
    public static void main(String args[]) {
//Task: Create a program/algorithm that can take a nba score and post the different possiblities that scored has been tallied. (Do wit NFL SCORES next?)

/*Scoring elements: Technical fouls(1 point attempt)
Free throws (2 or 3 point attempt)
Two point basket
3 point basket*/ //Don't count opponent self made basket (or have some kind of exception/caveat for it)

/*Keep in mind: There can only be so many technicals/normal fouls before all the members of oppsoing team can't play anymore*/


int totalTD = 0;
int totalFG = 0;
int totalsafety = 0;
//int totalxpoints = 0;

Scanner scan = new Scanner (System.in);
System.out.print("Enter sport ( 'f' for Football or 'b' for Basketball): ");

if( scan.hasNextLine()){
String sport = scan.nextLine();
//System.out.print("Enter the point total of one player"); //For basketball

if(sport.equals("f") ){
    System.out.print("Enter the point total of one team: ");
    final int totalpoints = scan.nextInt();

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

//System.out.println("\n (There will be at least " + totalTD + " TD's, " + totalFG + " FG's and " + totalsafety + " Safeties.)");

int referenceTD = totalTD; //are these total... redundant?
int referenceFG = totalFG;
int referenceSAFE = totalsafety;

int successes = 0;
int placeholderFG = 0;
int placeholderSAFE = 0;

int testtotal = 0;

//STARTING WITH TD'S (AND ALL OF THIS IS BASED ON IT)

for(int iterator = referenceTD; iterator>=0; iterator--){
   int placeholder = iterator;
   //System.out.println("\n  Now iterating with " + iterator + " touchdown(s):");
  while(placeholder > 0  ){ 
    testtotal +=7;
    placeholder--;
  }
//System.out.println("Adding "  + testtotal);

  if(testtotal == totalpoints){
    System.out.print("\n" + "   ALL TOUCHDOWNS - ");
  }


        //IF THE TOTAL IS NOT ALL TD's


    else {
        placeholderFG = referenceFG;
        int totalplaceholder = testtotal;

  while(placeholderFG > 0 ){

        int tempFG = placeholderFG*3;
        testtotal+=tempFG;

        //System.out.println("After FG: " + testtotal);

        if(testtotal != totalpoints ){
           if(testtotal < totalpoints){
            
            placeholderSAFE = referenceSAFE;

    int totalplaceholder2 = testtotal;
  while(placeholderSAFE > 0){


    int tempSAFE = placeholderSAFE*2;
    //System.out.println("TempSAFE is " + tempSAFE +" and testtotal should be " + testtotal + "; Totalplaceholder?" + totalplaceholder2);
    testtotal+=tempSAFE;


    if(testtotal != totalpoints ){

     }

     else{
         successes++;
         System.out.println("   SUCCESSFUL RUN FOR " + testtotal + " POINT TOTAL; Success Run #" + successes);
         System.out.println("Total TD's: " + iterator + ", Total FG's: " + placeholderFG + ", Total Safeties: " + placeholderSAFE + "\n");
     }

     testtotal = totalplaceholder2;
     placeholderSAFE--;

                }
           }
        }

        else{
            successes++;
            System.out.println("    SUCCESSFUL RUN FOR " + testtotal + " POINT TOTAL; Success Run #" + successes);
            System.out.println("Total TD's: " + iterator + ", Total FG's: " + placeholderFG  + ", Total Safeties: " + placeholderSAFE   + "\n");
        }
  
        testtotal = totalplaceholder;
        placeholderFG--;

  }

}

        if(testtotal != totalpoints ){
  
        }

        else{
            successes++;
            System.out.println("SUCCESSFUL RUN WITH " + testtotal + " POINT TOTAL; Success Run #" + successes); //for ALL TD'S TOTAL
            System.out.println("Total TD's: " + iterator + ", Total FG's: " + placeholderFG + ", Total Safeties: " + placeholderSAFE  + "\n");
        }
  
testtotal = 0;

    }

    System.out.println("\nTotal number of possibilties: " + successes);
    scan.close(); //NEW FEATURE OOOO (Will result in a possible 'resource leak if not closed')

} 

else{
    System.out.print("Incorrect input: please try again");
    sport = scan.nextLine();
}


            }
    
    }
}
