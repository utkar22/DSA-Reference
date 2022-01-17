public class Queue_Array {
	class Queue{
		int max_length;
		int queue_array[];
		
		int front = 0;
		int rear = -1;
		int count = 0;
		
		public Queue(int max_length){
			this.max_length=max_length;
			this.queue_array=new int[max_length];
		}
		
		public boolean isEmpty(){
			return (this.count==0);
		}
		public boolean isFull(){
			return (this.count==this.max_length);
		}
		
		public void enqueue(int data){
			if (!isFull()){
				this.rear=(this.rear+1)%this.max_length;
				this.queue_array[rear]=data;
				count++;
			}
		}
		public void dequeue(){
			if (!isEmpty()){
				this.front=(this.front+1)%this.max_length;
				count--;
			}
		}
		
		public int front(){
			if (!isEmpty()){
				int i = this.queue_array[front];
				return (i);
			} return (-1);
			
		}
		
		public int size(){
			return (this.count);
		}
		
	}
	
	
}
