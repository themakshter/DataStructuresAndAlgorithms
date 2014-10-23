package algorithms;

/**
 * Algorithm to solve 
 * @author Mohammad Ali
 *
 */
public class Combinations {

	public static void main(String[] args) {
		String[][] words = {{"quick","lazy"},
							{"brown","black","grey"},
							{"fox","dog"}
					};
		combinations(words);
		
	}
	
	public static void combinations(String[][] words){
		String[] combinations = combineAt(words,0);
		for(String combination : combinations){
			System.out.println(combination);
		}
		System.out.println(combinations.length);
	}
	
	public static String[] combineAt(String[][] words, int index){
		if(index == words.length - 1){
			return words[words.length-1];
		}
		return combine(words[index],combineAt(words,index+1));
	}
	
	public static String[] combine(String[] words1,String[] words2){
		String[] combined = new String[words1.length * words2.length];
		int k = 0;
		for(int i = 0; i < words1.length;i++){
			for(int j = 0; j < words2.length;j++){
				combined[k] = words1[i] + " " + words2[j];
				k++;
			}
		}
		return combined;
	}
}
