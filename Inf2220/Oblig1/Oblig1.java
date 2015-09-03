import java.util.*;
import java.io.*;

class Oblig1{
    Node root = null;






    public static void main(String args[])throws Exception{
	Oblig1 ny = new Oblig1();
	ny.kjor();

    }
    void kjor()throws Exception{
	lesInn();
    }



    Node search(){
	return null;
    }
    void delete(){
    }
    void ui(){
    }
    void lesInn() throws Exception{
	Scanner inn = new Scanner(new File("dictionary.txt"));
	int i = 0;
	while(inn.hasNext()){
	    Node ny = new Node(inn.nextLine());
	    if(root == null){
		root = ny;
		i++;
	    }
	    else{
		root.insert(ny);
		i++;
	    }
	}
	System.out.println(i + " ord lest inn.");
    }




}




class Node{

    String element = null;
    Node barnV = null;
    Node barnH = null;

    Node(String inn){
	this.element = inn;
    }
    void setBarnV(Node inn){
	this.barnV = inn;
    }
    void setBarnH(Node inn){
	this.barnH = inn;
    }
    Node barnH(){
	return barnH;
    }
    Node barnV(){
	return barnV;
    }
    String element(){
	return element;
    }
    void insert(Node inn){
	if(inn.element().compareTo(this.element()) < 0){
	    if(barnV == null){
		barnV = inn;
	    }
	    else{
		barnV.insert(inn);
	    }
	}
	else if(inn.element().compareTo(this.element()) > 0){
	    if(barnH == null){
		barnH = inn;
	    }
	    else{
		barnH.insert(inn);
	    }
	}
	else{
	    System.out.println("Nå skjedde det noe rart! Fikk ikke lagt inn element!");
	}


    }
}

