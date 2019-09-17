package dictionary;

import java.util.ArrayList;
import java.util.Scanner;



public class Main {

	
	public static void main(String[] args) {
		// Create Scanner for input
		Scanner input = new Scanner(System.in);
		// Declare Search
		String search;
		//Loading data...
		System.out.println("! Loading data...");
		
		//ArrayList of Word objects
		ArrayList<WordObj> theWords = new ArrayList<WordObj>();
		
		//ArrayList for Strings, words 
		ArrayList<String> wordList = new ArrayList<String>();
		
		//ArrayList for Strings, partofSpeech 
		ArrayList<String> partOfSpeechList = new ArrayList<String>();
		
		//ArrayList for Strings, definitions
		ArrayList<String> definitionList = new ArrayList<String>();
		
		//Using for-Loop to store data
		for(DataSource entry : DataSource.values()) {
			//Declare String word,partOfSpeech,definition and reference object for WordObj
			String words;
			String partOfSpeech;
			String definitions;
			WordObj dataPlug;
			
			//get "words" from DataSource and store it in words
			words = entry.getWords();
			//get "PartOfSpeech" from DataSource and store it in partOfSpeeech
			partOfSpeech = entry.getPartOfSpeech();
			//get "definitions" from DataSource and store it in definitions
			definitions = entry.getDefinition();
			
			//Call WordObj constructor and pass in words,partOfSpeech,definitions
			dataPlug = new WordObj(words,partOfSpeech,definitions);
			
			// Add dataPlug into the ArrayList with each iteration of the loop
			theWords.add(dataPlug);
			
			// Add each word into an ArrayList and check for duplicates
			if(!wordList.contains(words)) {
				wordList.add(words);
			}
			
			// Add each partOfSpeech into an ArrayList and check for duplicates
			if(!partOfSpeechList.contains(partOfSpeech)) {		
				partOfSpeechList.add(partOfSpeech);
			}
			
			// Add each definition into an ArrayList and check for duplicates
			if(!definitionList.contains(definitions)) {
				definitionList.add(definitions);
			}
			
		}//end of for-loop 
		// Done with Loading and storing dictionary's data
		
		System.out.println("! Loading completed...\n");
		System.out.println("-----DICTIONARY 340 JAVA-----\n");
		
		//Ask for user input
		System.out.print("Search: ");
		search = input.nextLine();
		search = search.replaceAll("\\s+"," ");
		
		//Test to see if it comes out
		//System.out.println("You searched: " + search);
		//System.out.println("stuff".equalsIgnoreCase("Stuff")); ==> true
		
		// Create a while-loop that only stops when user enters "!Q" or "!q"
		while(true) {
			//break if user types in "Quit" or "quit"
			if((search.equalsIgnoreCase("!Q"))){break;}
			
			//Test to see if user entered nothing
			if(!search.equals("")){
				
				// start when user enters input
				System.out.println("\t|");
			
			
				// Declare a string array;
				String[] split;
				
				// Split each entry by their spaces and store each word in "split" array
				split = search.split("\\s");
				
				// Test split
	//			for(int i = 0;i<split.length;i++) {
	//				System.out.println(split[i]);
	//			}	
				// Check if third word is distinct
	//			if(split.length == 3) {	
	//				split[2].equals	
	//			}
				
			
				// if we get one input
				if(split.length == 1) {
					
					
					// Go through ArrayList
					
					for(int i = 0; i<theWords.size();i++) {
						
					
						// Check if input matches
						
						if(theWords.get(i).getWords().equalsIgnoreCase(split[0])) {
						
							//print out toString
							System.out.println(theWords.get(i).toString());
						
						}// end of if
					
					}// end of for
					
				
				}// end of length == 1
			
				// if we get 2 inputs 
				else if(split.length == 2) {
			
					//System.out.println("2 inputs" );
					
					
					// Check if the second word is partOfSpeech
					if(partOfSpeechList.contains(split[1])) {
						
						for (int i = 0; i < theWords.size(); i++){
	                    
	                        //if the dictionary's entry equals the token's entry
	                        if ((theWords.get(i).getWords().toLowerCase()).equals(split[0].toLowerCase()) && ((theWords.get(i).getPartOfSpeech().toLowerCase()).equals(split[1].toLowerCase()))){
	
	                            // print out toString
	                        	System.out.println(theWords.get(i).toString());
	                            
	                        	
	                        }// end of if
	                    
						}// end of for
					
					}// end of big if
					
			
				
					// Check if second input is "distinct" or "DISTINCT" ~ destroy case sensitivity
				
					else if(split[1].equalsIgnoreCase("distinct")) {
						
						// Start a new ArrayList
						ArrayList<WordObj> check = new ArrayList<WordObj>();
						
						// Go through the word arraylist
						for(int i = 0; i < theWords.size();i++) {
							
							//if the dictionary's entry equals the token's entry
	                        if ((theWords.get(i).getWords().toUpperCase()).equals(split[0].toUpperCase())) {
	                        
	                            //check to see if the entry is distinct
	                            if (!(check.toString().contains(theWords.get(i).toString()))) {
	                            
	                                //add it to our distinct checker and print it out
	                               
	                            	check.add(theWords.get(i));
	                                
	                            	//print out toString
	                            	System.out.println(theWords.get(i).toString());
	                            
	                            }// end of if
	                        
	                        }// end of if
							
							
						}//end of for
						
						
					}// end of if
				
					
					// else return an error for user
					else {
		                   
						//print error for user
						System.out.println("\t<2nd argument must be a part of speech >");
		                
					}// end of else
					
				}//end of length ==2
				
				//if we get 3 inputs
				else if(split.length == 3) {
					//System.out.println("3 inputs");
					
					// Check if second input is a partOfSpeech, second word cannot be "distinct"
					
					if(!partOfSpeechList.contains(split[1])) {
						
						// let user know
						System.out.println("\t<2nd argument must be a part of speech>");
						
					}
					
		
					// Check if third input is "distinct"
					
					else if(!split[2].equalsIgnoreCase("distinct")) {
						
						// let user know
						System.out.println("\t<3rd argument must be \"distinct\">");
					}
					
		
					// else handle the "distinct" feature 
					
					else {
					
						//create a distinct checker ArrayList
	                    ArrayList <WordObj> distCheck = new ArrayList<WordObj>();
	
	                    //for the length of the dictionary
	                    for (int i = 0; i < theWords.size(); i++) {
	                    
	                        //if the term's entry and part of speech equals the token's entry and part of speech
	                        if ((theWords.get(i).getWords().toLowerCase()).equals(split[0].toLowerCase()) && ((theWords.get(i).getPartOfSpeech().toLowerCase()).equals(split[1].toLowerCase()))){
	                        
	                           
	                        	//check to see if the entry is distinct
	                            
	                        	if (!(distCheck.toString().contains(theWords.get(i).toString()))){
	                            
	                        		//add it to our distinct checker and print it out
	                                
	                        		distCheck.add(theWords.get(i));
	                                
	                        		System.out.println(theWords.get(i).toString());
	                             
	                        	}// end of if-statement that checks for distinct entry
	                        
	                        }// end of if-statement 
	                    
	                    }// end of for-loop
						
					}// end of else
									
				}// end of length == 1 
				
				
				// if we get no or more than 3 inputs
				
				else if(!search.isEmpty()) {
				
					System.out.println("\t"
							+ "<Not found>");
			
				}// else if end
				
			}// end of if-statement that checks if user entered anything
			
			else {
				
				System.out.println("\t<Not found>");
			
			}
			
			//Ask for user input again
			System.out.println("\t|");
			System.out.print("Search: ");
			search = input.nextLine();
			
		}// end of while-loop
		
		
	}//end of main
	
	
}// end of class

// WordObj class
class WordObj{
	
	// Datafield's
	String words;
	
	String partOfSpeech;
	
	String definitions;
	
	//Constructor
	public WordObj(String words, String partOfSpeech, String definitions) {
		
		
		this.words = words;
		
		this.partOfSpeech = partOfSpeech;
		
		this.definitions = definitions;
	}
	
	// get and set Datafield's
	
	public String getWords() {
		
		return words;
		
	}
	
	public void setWords(String words) {
		
		this.words = words;
	
	}
	
	public String getPartOfSpeech() {
		
		return this.partOfSpeech;
	
	}
	public void setPartOfSpeech(String partOfSpeech) {
		
		this.partOfSpeech = partOfSpeech;
		
	}
	
	public String getDefinition() {
		
		return this.definitions;
	
	}
	
	public void setDefiniton(String definitons) {
		
		this.definitions = definitons;
	
	}
	
	@Override
	public String toString() {
	
		return "\t"+ this.words + " [" + this.partOfSpeech + "]" + " : " + this.definitions;
	
	}
		
	
}
