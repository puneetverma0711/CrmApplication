package datastructures;

import java.util.Stack;



public class BalancedBracketusingstack {

	static String isMatched(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (char c : s.toCharArray()) {
			if (c == '(' || c == '[' || c == '{') {
				stack.push(c);
			} else {
				// occurs if "}])" appear initially instead of "([{"
				if(stack.isEmpty()) {
					return "NO";
				}

				char top = stack.pop();
				if (!((c == ')' && top == '(') || (c == ']' && top == '[') || (c == '}' && top == '{'))) {
					return "NO";
				}
			}
		}
		
		
		if(stack.isEmpty()) {
			return "YES";
		}else {
			return "NO";
		}
		
		}	
	
	 
	
	public static void main(String[] args) {
		//{[()]} balanced string
		//{[(])} unbalanced string because [is followed by ) it should be ]
		
	/* }][}}(}][))] 
			[](){()}
			()
			({}([][]))[]()
			{)[](}]}]}))}(())(
			([[)  */
			
		String name="[{(";   
		String result=isMatched(name);
	 System.out.println(result);  
				
		
		
	}

}
