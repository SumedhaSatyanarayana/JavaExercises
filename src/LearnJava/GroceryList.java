package LearnJava;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryList {
	private static Scanner scanner = new Scanner(System.in);
	public static ArrayList<String> GroceryList = new ArrayList<String>();
	// ArrayList<String> - this means u r creating an array list with data type String
	// groceryList is the ArrayList variable name
	// ArrayList is a class. so it can have constructor

	public static void addGroceryItem(String Item){
		GroceryList.add(Item);
	}

	public void printGroceryList(){
		System.out.println("There are " + GroceryList.size()+ " items present in your grocery list");
		for (int i=0; i<GroceryList.size(); i++){
			System.out.println( (i+1) + "." + GroceryList.get(i));
		}
	}

	private static void modifyGroceryItem(int position, String newItem){
		GroceryList.set(position, newItem);
		System.out.println("Grocery Item has been modified");
	}

	public static void modifyGroceryItem(String currentItem, String newItem){
		int position = findItem(currentItem);
		if (position >=0){
			modifyGroceryItem(position, newItem);
		}
	}
	public static void removeGroceryItem(String item) {
		int position = findItem(item);
		if(position >= 0) {
			removeGroceryItem(position);
		}
	}
	private static void removeGroceryItem(int position){
		GroceryList.remove(position);
		System.out.println("Item has been removed from the list");
	}
	public static int findItem(String searchItem){
		//boolean exist = GroceryList.contains(searchItem);
		/*int position = GroceryList.indexOf(searchItem);
		if (position >=0){
			return GroceryList.get(position);
		}
		return null;*/
		return GroceryList.indexOf(searchItem);
	}
	public static boolean onFile(String searchItem) {
		int position = findItem(searchItem);
		if(position >=0) {
			return true;
		}

		return false;
	}

	public static void main(String[]args){
		boolean quit = false;
		int choice =0;
		GroceryList groceryList = new GroceryList();
		printInstructions();
		while(!quit){
			System.out.println("Enter your choice ");
			choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice){
			case 0 :
				printInstructions();
				break;
			case 1 :
				groceryList.printGroceryList();
				break;
			case 2 :
				addItem();
				break;
			case 3 :
				modifyItem();
				break;
			case 4 :
				removeItem();
				break;
			case 5 :
				searchForItem();
				break;
			case 6:
                processArrayList();
			case 7 :
				quit = true;
				break;
			}
		}	
	}
	public static void processArrayList() {
		ArrayList<String> newArray = new ArrayList<String>();
		newArray.addAll(GroceryList);
		ArrayList<String> nextArray = new ArrayList<String>(GroceryList); // another way to copy
		String[] myarr = new String[GroceryList.size()];
		myarr = GroceryList.toArray(myarr);
		for (int i=0; i<myarr.length; i++){
			System.out.println( (i+1) + "." + myarr[i]);
		}
		
	}

	public static void printInstructions() {
		System.out.println("\nPress ");
		System.out.println("\t 0 - To print choice options.");
		System.out.println("\t 1 - To print the list of grocery items.");
		System.out.println("\t 2 - To add an item to the list.");
		System.out.println("\t 3 - To modify an item in the list.");
		System.out.println("\t 4 - To remove an item from the list.");
		System.out.println("\t 5 - To search for an item in the list.");
		System.out.println("\t 6 - To quit the application.");
	}
	private static void searchForItem() {
		System.out.print("Item to search for: ");

		String searchItem = scanner.nextLine();
		if(onFile(searchItem)) {
			System.out.println("Found " + searchItem + " in  our grocery list");
		} else {
			System.out.println(searchItem + " is not in the shopping list");
		}

	}

	private static void removeItem() {
		//System.out.print("Enter item number: ");
		System.out.print("Enter item name to be removed: ");
		//int itemNo = scanner.nextInt();
		String itemNo = scanner.nextLine();
		//scanner.nextLine();
		//removeGroceryItem(itemNo-1);
		removeGroceryItem(itemNo);
	}

	private static void modifyItem() {
		//System.out.print("Enter item number: ");
		System.out.print("Current item name: ");
		//int itemNo = scanner.nextInt();
		String itemName = scanner.nextLine();
		//scanner.nextLine();
		System.out.print("Enter replacement item name: ");
		String newItem = scanner.nextLine();
		//modifyGroceryItem(itemNo-1, newItem);
		modifyGroceryItem(itemName, newItem);
	}


	public static void addItem() {
		System.out.print("Please enter the grocery item: ");
		addGroceryItem(scanner.nextLine());
	}
}
