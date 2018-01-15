
public class ArrayStructures {

	
	private int[] theArray=new int [50];
	private int arraySize=10;
	
	public void generateRandomArray() {
		for(int i=0; i<arraySize; i++) {
			theArray[i]=(int) (Math.random()*10)+10;
		}
	}

	public void printArray() {
		
		for(int i=0; i< arraySize; i++) {
			System.out.print(" | "+i+ " | ");
			System.out.print(theArray[i]);
			
		}
		System.out.println("\n");
	}
	
	public int getArrayIndex(int index) {
		if(index < arraySize) {
			return theArray[index];
		}
		return 0; 
		
	}
	
	public boolean doesArrayContain (int searchValue) {
		
		boolean valueIn = false;
		for(int i=0; i<arraySize; i++) {
			if (searchValue==theArray[i]) {
				valueIn= true;
			}
		}
		return valueIn;
	}
	
	public void deleteArray(int index) {
		if (index < arraySize) {
			for(int i=index; i < (arraySize-1); i++) {
				theArray [i] = theArray [i+1];
			}
			
			arraySize--;
		}
	}
	
	public void insertValue(int value) {
		if(arraySize < 50) {
			theArray[arraySize]= value;
			
			arraySize++;
		}
	}
	
	public String linearSearchValue(int value) {
		
		boolean valueArray = false;
		
		String indexValue= "";
		
		System.out.print("The value " + value + " was found in the following: ");
		
		for (int i=0; i<arraySize; i++) {
			if (theArray[i]==value) {
				System.out.print(i+ " ");
				 valueArray = true;
				 indexValue = i + " ";
			}
		}
		if(!valueArray) {
			indexValue= "None";
			System.out.print(indexValue);
		}
		System.out.println();
		return indexValue;
	}
	public static void main(String args []) {
		
		ArrayStructures newArray= new ArrayStructures();
		newArray.generateRandomArray();
		newArray.printArray();
		
	}
}
