package Lesson4_Materials;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		/* Review of Functions
		 * 	Function Syntax
		 * 		Example: can you name each part of this function declaration?
		 * 		public static int myFunction(String myString) {
		 * 			
		 * 		}
		 * 
		 * 
		 * 	Function Overloading
		 * 		What is it?
		 * 
		 * 		What ways can you overload a function? (https://beginnersbook.com/2013/05/method-overloading/)
		 * 
		 * 	Recursion
		 * 		What is it?
		 * 
		 * 		How do you do it?
		 * 
		 * 	Static Functions (not review)
		 * 		What's the difference?
		 * 
		 * 		When do you use static functions? (https://stackoverflow.com/questions/2671496/java-when-to-use-static-methods)
		 * 
		 */
		
		/* Java Data Structures */
		
		/* Example */
		// I want to make variables for every number from 1 to 5
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		int num4 = 4;
		int num5 = 5;
		
		// I want to make variables for every number from 1 to 1000
		// Making individual variable would be too tedious
		// Using a data structure called a list can help us
		List<Integer> integerList = new ArrayList<>();
		for(int i=1;i<1001;i++) {
			integerList.add(i);
		}
		
		//System.out.println(integerList);
		
		/* Arrays */
		// An array is Java's most basic object which holds 0, 1, or more other objects
		// You can access the object by its "index"
		// Index is the number of the position in which it is stored in the list
		// Indexes start at 0 in Java
		// You must declare how many items the array will hold (its size)
		// The size of that array cannot change once it has been declared
		
		// Declare an array like this: datatype variableName[] = new datatype[size];
		int integerArray[] = new int[10];
		// This array can now hold 10 integers inside of it
		
		// Declare an array and fill it with items at the same time
		String stringArray[] = new String[]{"string1", "string2", "string3"};
		
		// Access items in the array like this: arrayName[index]
		//System.out.println(stringArray[1]);
		// Note that this prints out "string2" because the index starts at 0
		// Therefore index 1 is the second item in the array
		
		// Iterate through an array with a for loop
		for(int i=0;i<integerArray.length;i++) {
			integerArray[i] = i;
		}
		// This sets that value of the item at index i to the current value of i
		
		// One more time
		for(int i=0;i<integerArray.length;i++) {
			//System.out.println(integerArray[i]);
		}
		// Note that you cannot just print out the whole array like this:
		// System.out.println(integerArray);
		// Doing that instead prints the array's address in memory
		
		// You cannot delete an item out of an array, but you can change to 
		// something else
		integerArray[0] = -1;

		// You can see the size of the array like this: arrayName.length
		// System.out.println(stringArray.length);
		
		// Shortcoming of arrays
			// The size is fixed
			// You cannot delete elements in an array or add extra elements
			// They do not offer many extra methods for you to use
			// You cannot print them out directly using System.out.println()
		
		
		/* Lists */
		// A list is an abstraction of arrays
		// You can think of it like a fancy version of an array
		// The size of an ArrayList can change dynamically
		
		// Declare new empty Lists like this: List<Data_Type> listName = new ArrayList<>();
		List<String> sequalTrilogy = new ArrayList<>();
		
		// If you want your list to be immutable (never changing), you can do this
		List<String> originalTrilogy = Arrays.asList("A New Hope", "The Empire Strikes Back", "Return of the Jedi");
		
		// Add to a List like this: listName.add(object)
		sequalTrilogy.add("The Force Awakens");
		sequalTrilogy.add("The Last Jedi");
		
		// Note that you cannot add to an immutable list
		// originalTrilogy.add("Holiday Special"); //would result in a runtime error
		
		// Access an item in a list like this: listName.get(index)
		//System.out.println(sequalTrilogy.get(0));
		
		// Remove items in a list like this: listName.remove(index)
		sequalTrilogy.remove(0);
		
		// Or like this: listName.remove(item)
		sequalTrilogy.remove("The Last Jedi");
		// Note that removing an item by name only removes the first occurrence
		// of that item in the list
		
		// Iterate through a List with a foreach loop
		for(String movie : originalTrilogy) {
			//System.out.println(movie);
		}
		
		// Or by an traditional for loop
		for(int i=0;i<originalTrilogy.size();i++) {
			//System.out.println(originalTrilogy.get(i));
		}
		
		// Other useful functions for Lists
		// Check if the List is empty
		sequalTrilogy.isEmpty();
		
		// Clear entire List
		sequalTrilogy.clear();
		
		// Sort List
		integerList.add(0);
		// System.out.println(integerList);
		integerList.sort(null);
		// System.out.println(integerList);
		
		// For ArrayLists, see if the List contains a given object (returns true of false)
		//System.out.println(sequalTrilogy.contains("The Phantom Menace"));

		//System.out.println(originalTrilogy);
		
		/* Maps */
		
		// Maps are like Lists, but instead of implicit numeric indices,
		// you define what the index is
		// Index can be number, String, or most other objects
		// You access map elements with a "key" that you define what you
		// place the "value" into the map
		
		// Declare a Map like this: Map<String, Integer> mapName = new HashMap<>();
		Map<String, String> prequalTrilogy = new HashMap<>();
		// Note that first parameter in the <> is the key type, and the second
		// is the value
		
		// Add a key-value pair to the Map like this: mapName.put(key, value)
		prequalTrilogy.put("Episode 1", "The Phantom Menace");
		prequalTrilogy.put("Episode 2", "The Clone Wars");
		prequalTrilogy.put("Episode 3", "Revenge of the Sith");
		// Note that you can hold identical values in a map, but the keys must
		// always be different
		
		// Access value in the Map like this: mapName.get(key)
		//System.out.println(prequalTrilogy.get("Episode 2"));
		
		// Delete items in a map like this: mapName.remove(key)
		prequalTrilogy.remove("Episode 2");
		// Note this removes the key and the value, so you can now use that key again
		
		// Iterating through a map in Java is not as straightforward as with Lists
		// Iterate through a map like this
		for(String key : prequalTrilogy.keySet()) {
			//System.out.println(prequalTrilogy.get(key));
		}
		
		// Or with lambda expression
		// prequalTrilogy.forEach((episode, title) -> System.out.println(title));
		// Note that there are many different ways to iterate through a Map,
		// but the most common way is probably the first method shown,
		// using the foreach loop
		
		// Maps have many other useful methods similar to the List methods
		// Many of the useful List methods shown above also apply to Maps

		/* Other data structures */
		// Stacks - FILO
		// Queues - FIFO
		// Sets - all unique values
	}

}
