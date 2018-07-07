package LearnJava;

import java.util.Scanner;
public class Arrays {
	private static Scanner scanner = new Scanner(System.in);
	private static int[] baseData = new int [5];
	public static void main (String[]args) throws Exception{
		try {
			System.out.println("Enter 5 integers:");
	        getInput();
	        printArray(baseData);
	        resizeArray();
	        System.out.println("Enter 7 integers:");
	        getInput();
//	        baseData[10] = 67;
//	        baseData[11] = 34;
	        printArray(baseData);

	        
			//declareArrayType1();
			//declareArrayType2();
			//declareArrayType3();
			/*int myIntegers[] = getIntegers(5);
			System.out.println();
			for (int i=0; i<myIntegers.length; i++){
				System.out.println("Element"+i+  " Typed value was : " + myIntegers[i]);	
			}
			int [] retSorted = sortIntegers(myIntegers);
			printArray(retSorted);
			double avg=  getAverage(retSorted);
			System.out.println("Average is "+ avg);*/
		} catch (Exception e) {
			e.printStackTrace();
			//System.out.println(e.getMessage());
		}
	}

	public static int[] getIntegers(int number){
		System.out.println("Enter " + number + "integer values"+'\r');
		// create new array
		int[] values = new int[number];
		for (int b=0; b<values.length;b++){
			values[b] = scanner.nextInt();
		}
		return values;
	}

	public static int[] sortIntegers(int[] array){
		System.out.println(array.length);
		int [] sorted = new int [array.length];
		for(int w=0; w<array.length; w++){
			sorted[w] = array[w];
		}
		// int[] sortedArray = Arrays.copyOf(array, array.length);
		int temp;
		boolean flag = true; 
		while(flag){
			flag = false;
			for (int c=0; c<sorted.length-1; c++){
				if (sorted[c]<sorted[c+1]){
					temp = sorted[c];
					sorted[c] = sorted[c+1];
					sorted[c+1] = temp;
					flag = true;
				}
			}
		}

		return sorted;
	}

	public static double getAverage(int[] array){
		int sum = 0;
		for (int a=0; a<array.length; a++){
			sum += array[a];
		}
		return (double)sum / (double)array.length;		
	} 

/*	public static void printArray(int[] array) {
		for(int i=0; i<array.length; i++) {
			System.out.println("Element " + i + " contents " + array[i]);
		}
	}*/

	public static void declareArrayType1(){
		// How to declare an array in different ways
		int[] myarr = new int[5];
		myarr[0]=258;
		System.out.println("@ [0] = "+myarr[0]);
		System.out.println("@ [1] = "+myarr[1]);
		System.out.println("@ [2] = "+myarr[2]);
		System.out.println("@ [3] = "+myarr[3]);
		System.out.println("@ [4] = "+myarr[4]);
		System.out.println("Length of myarr is "+myarr.length);
		System.out.println();
		for (int i=0; i<myarr.length; i++){
			myarr[i]= i*15;
			System.out.println("at index "+i+  " My array elements are : " + myarr[i]);
		}
		int[] myarr2 = {1,2,3,4,5,6};
		for (int i=0; i<myarr2.length; i++){
			myarr2[i]= i*2;
			System.out.println("at index "+i+  " My array elements are : " + myarr2[i]);
		}
	}
	public static void declareArrayType2(){
		double[]myarr1 = new double[10];
		System.out.println();
		for (double j=0; j<10; j++){
			myarr1[(int) j]= j*10.0;
			System.out.println("at index "+j+  " My array elements are : " + myarr1[(int) j]);
		}
	}
	public static void declareArrayType3(){
		String[] myarr3 = {"May","The","Force","be","with","you"};
		System.out.println();
		System.out.println("Length of myarr3 is "+myarr3.length);
		for (int k=0; k<=myarr3.length-1; k++){
			System.out.println(myarr3[k]);
		}
	}
	private static void getInput()
    {
        for(int i = 0; i < baseData.length; i++)
            baseData[i] = scanner.nextInt();
    }
	private static void resizeArray()
    {
        int[] original = baseData;
        baseData = new int[7];
        for (int i = 0; i < original.length; i++)
            baseData[i] = original[i];
    }
	 private static void printArray(int[] arr)
	    {
	        for(int i = 0; i < arr.length; i++)
	            System.out.print(arr[i] + " ");
	        System.out.println();
	    }
	
}
