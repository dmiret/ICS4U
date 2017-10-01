package com.bayviewglen.dayfive;

public class LinkedList {

	private IntNode head;
	private IntNode tail;
	private int numNodes=0;
	private boolean isvalid=false;


	public LinkedList() {
		head = null;
		tail = null;
		numNodes = 0;
	}

	public void addFirst(int x) {//Inserts the specified element at the beginning of this list.
		IntNode base =new IntNode(x,null);
		if(numNodes==0) {
			head =base;
			tail=base;
		}
		base.setLink(head);
		head=base;
		
		numNodes++;
	}

	public void add(int index, int x){//Inserts the specified element at the specified position in this list.
		if(numNodes==0) {
			addFirst(x);
			
		}else {

			IntNode previousLink = new IntNode(x,head);
			for(int i = 0;i<index-1;i++) {
				previousLink=previousLink.getLink();
			}
			IntNode newLink = new IntNode(x,previousLink);
			previousLink.setLink(newLink);
	
			numNodes++;
		}
	}

	public boolean add(int x) { //Appends the specified element to the end of this list.
		if(numNodes==0) {
			addFirst(x);
		}else {
			tail.setLink(new IntNode(x,null));
			tail = tail.getLink();
		}
		numNodes++;
		return isvalid;
	}

	public void clear() {//Removes all of the elements from this list.
		head = null;
		tail = null;
		numNodes=0;
	}

	public int remove() {// removes first element
		if(numNodes == 0) {
			throw new NullPointerException();
		}
		int temp = head.getData();
		head = head.getLink();
		return temp;

	}

	public int remove(int index) {//Removes element at specified index
		if(numNodes == 0) {
			throw new NullPointerException();
		}
		int temp = 0;
		IntNode removable=head;

		for(int i = 0;i<index-1;i++) {
			removable=removable.getLink();
		}
		temp=removable.getData();
		removable.setLink(removable.getLink());
		return temp;

	}

	public int removelast() {//removes last element in list
		if(numNodes == 0) {
			throw new NullPointerException();
		}

		IntNode last = head;
		for(int i = 0;i<numNodes-1;i++) {
			last = last.getLink();
		}
		int temp;
		temp=tail.getData();
		last.setLink(null);

		return temp;

	}

	public boolean removeFirstOccurrence(int o) {//Remove the first occurrence of an element
		if(numNodes == 0) {
			throw new NullPointerException();
		}
		IntNode temp = head;
		for(int i = 0;i<numNodes-1;i++) {
			if(temp.equals(head)&&temp.getData()==o) {
				if(temp.getLink().getData()==o) {
					isvalid = true;
					temp.setLink(temp.getLink().getLink());
				}
			}else if(temp.getLink().getData()==o) {
				isvalid = true;
				temp.setLink(temp.getLink().getLink());

			}
			temp=temp.getLink();


		}

		return isvalid;


	}
	public boolean removeLastOccurrence(int o) {//Removes the last occurence of an Element
		if(numNodes == 0) {
			throw new NullPointerException();
		}
		IntNode temp = head;
		IntNode last = null;
		for(int i = 0;i<numNodes-1;i++) {
			if(temp.equals(head)&&temp.getData()==o) {
				head=temp.getLink();
				isvalid=true;
			}else if(temp.getLink().getData()==o) {
				last=temp.getLink();
				temp.setLink(temp.getLink().getLink());
				isvalid=true;
			}else {
				isvalid=false;
			}
			temp=temp.getLink();
		}


		return isvalid;

	}
	public int set(int index,int x) {//Set an element at specified index
		if(numNodes==0) {
			throw new NullPointerException();
		}
		IntNode temp = head;

		for(int i = 0;i<index-1;i++) {
			temp=temp.getLink();
		}
		IntNode newInt =new IntNode(x,temp.getLink());
		temp.setLink(newInt);
		return newInt.getData();
	}
	public int size() {//Size
		return numNodes;

	}
	public int[] toArray(){//Changes it to an array
		int[] listed =new int[numNodes-1];
		IntNode temp= head;
		for(int i=0;i<numNodes-1;i++) {
			listed[i]=temp.getData();
			temp=temp.getLink();
		}

		return listed;
	}
	public boolean contains(int x) {//Checks if it contains the described element
		IntNode temp = head;
		for(int i=0;i<numNodes-1;i++) {
			if(temp.getData()==x) {
				isvalid=true;
			}

			temp=temp.getLink();
		}

		return isvalid;

	}
	public int get(int index) {//get the element at described index
		IntNode temp =head;
		int num = 0;
		
		for(int i = 0;i<index-1;i++) {
			num=temp.getData();
			temp=temp.getLink();
		}
		
		return num;

	}
	public int getFirst() {//get first
		int num = 0;
		num=head.getData();
		return num;

	}
	public int getLast() {//get Last
		int num = 0;
		num=tail.getData();
		return num;

	}





}
