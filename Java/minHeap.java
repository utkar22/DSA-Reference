public class minHeap {
	int[] heap;
	int size;
	int maxsize;
	
	int front = 1;
	
	minHeap(int maxsize){
		this.maxsize = maxsize;
		this.size = 0;
		
		heap = new int[maxsize+1];
		heap[0] = Integer.MIN_VALUE;
	}
	
	int parent(int p){
		return (p/2);
	}
	
	int leftChild(int p){
		return (p*2);
	}
	int rightChild(int p){
		return ((p*2)+1);
	}
	
	boolean isLeaf(int p){
		if (p>size/2&&p<=size){
			return (true);
		}
		else{
			return (false);
		}
	}
	
	void swap(int a, int b){
		int temp = heap[a];
		heap[a] = heap[b];
		heap[b] = temp;
	}
	
	void minHeapify(int pos){
		if (!isLeaf(pos)){
			if (heap[pos]>heap[leftChild(pos)]){
				swap(pos, leftChild(pos));
				minHeapify(leftChild(pos));
			}
			else if(heap[pos]>heap[rightChild(pos)]){
				swap(pos, rightChild(pos));
				minHeapify(rightChild(pos));
			}
		}
	}
	
	void insert(int data){
		if (size>=maxsize){
			return;
		}
		
		size++;
		heap[size]=data;
		
		int current = size;
		
		while (heap[current]<heap[(parent(current))]){
			swap(current, parent(current));
			current = parent(current);
		}
	}
	
	int extractMIN(){
		int popped = heap[front];
		heap[front]=heap[size];
		size--;
		minHeapify(front);
		
		return (popped);
	}
	

}
