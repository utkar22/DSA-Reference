public class Stack_Array {
	class Stack{
		int max_length;
		int pointer=0;
		int[] stack_array;
		
		public Stack(int max_length){
			this.max_length=max_length;
			this.stack_array = new int[max_length];
		}
	}
	
	public Stack create_stack(int max_length){
		Stack stack = new Stack(max_length);
		return (stack);
	}
	
	public Stack push(Stack stack, int data){
		if (stack.pointer<stack.max_length){
			stack.stack_array[stack.pointer]=data;
			stack.pointer++;
		}
		return (stack);
	}
	
	public Stack pop(Stack stack){
		if (stack.pointer>=0){
			stack.stack_array[stack.pointer]=0;
			stack.pointer--;
		}
		return (stack);
	}
	
	public int top(Stack stack){
		int i = stack.stack_array[stack.pointer];
		return (i);
	}
	
	

}
