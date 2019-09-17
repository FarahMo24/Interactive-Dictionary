package dictionary;

public enum DataSource {

	PLACEHOLDER_1("Placeholder","adjective","To be updated..."),
	PLACEHOLDER_2("Placeholder","adjective","To be updated..."),
	PLACEHOLDER_3("Placeholder","adverb","To be updated..."),
	PLACEHOLDER_4("Placeholder","conjunction","To be updated..."),
	PLACEHOLDER_5("Placeholder","interjection","To be updated..."),
	PLACEHOLDER_6("Placeholder","noun","To be updated..."),
	PLACEHOLDER_7("Placeholder","noun","To be updated..."),
	PLACEHOLDER_8("Placeholder","noun","To be updated..."),
	PLACEHOLDER_9("Placeholder","preposition","To be updated..."),
	PLACEHOLDER_10("Placeholder","pronoun","To be updated..."),
	PLACEHOLDER_11("Placeholder","verb","To be updated..."),
	
	
	
	ADJECTIVE_1("Adjective","noun","Adjective is a word that describes a person or thing, for example big, red and clever in a big house red wine and a clever idea"),
	
	ADVERB_1("Adverb","noun","Adverb is a word that adds more information about place, time, manner cause or degree to a verb, an adjective, a phrase or another adverb"),
	
	ARROW_1("Arrow","noun","Here is one arrow: <IMG> -=>> </IMG>"),
	
	BOOK_1("Book","noun","A set of pages"),
	BOOK_2("Book","noun","A written work published in printed or electronic form"),
	BOOK_3("Book","verb","To arrange for someone to have a seat on a plan"),
	BOOK_4("Book","verb","To arrange something on a particular date"),
	
	
	// BOOKABLE not found in Sample Output or Assignment 01 Short Outputs
	
	CSC210_1("CSC210","adjective","Comfortable with objects and Classes"),
	CSC210_2("CSC210","adjective","Ready for CSC220"),
	CSC210_3("CSC210","noun","Intro to Java"),
	CSC210_4("CSC210","verb","To lean Java"),
	
	CSC220_1("CSC220","adjective","Ready to create complex data structure"),
	CSC220_2("CSC220","noun","Data Structures"),
	CSC220_3("CSC220","verb","To create Data Structures"),
	
	CSC340_1("CSC340","noun","A CS Upper Division Course "),
	CSC340_2("CSC340","noun","Many hours of outside class"),
	CSC340_3("CSC340","noun","Programming Methodology"),
	
	INTERJECTION_1("Interjection","noun","Interjection is a short sound, word or phrase spoken suddenly to express an emotion. Oh!, Look out! and Ow! are interjections."),
	
	VERB_1("Verb","noun","Verb is a word or group of words tht expresses");
	
	
	// data fields
	private String words;
	private String partOfSpeech;
	private String definitions;
	
	private DataSource(String words, String partOfSpeech, String definitions) {
		
		this.words = words;
		this.partOfSpeech = partOfSpeech;
		this.definitions = definitions;
	
	}
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
		return "\t" + this.words + " [" + this.partOfSpeech + "]" + " : " + this.definitions;
	}
	
}
