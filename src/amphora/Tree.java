package amphora;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Tree {
	
	public static void main(String args[]){
		
		Node root=new Node(91,"ko");
		Node k =new Node(68,"kaa");
		Node v=new Node(66,"vaa");
		Node s=new Node(64,"saa");
		
		List<Node> pl=new ArrayList<>();
		pl.add(k);
		pl.add(v);
		pl.add(s);
		root.setChaild(pl);

		Node r=new Node(47,"raa");
		Node t=new Node(45,"taa");
		
		List<Node> pl1=new ArrayList<>();
		pl1.add(r);
		pl1.add(t);
		s.setChaild(pl1);
		
		Node q=new Node(35,"qaa");
		List<Node> plq=new ArrayList<>();
		plq.add(q);
		r.setChaild(plq);
		
		Node w=new Node(15,"waa");
		List<Node> plw=new ArrayList<>();
		plw.add(w);
		q.setChaild(plw);
		
		
		
		
		
		//System.out.println(k.getParent().getName());
		//System.out.println(s.getChaild().get(0).getName());
		
		showFamily(root);
	}
	
	public static void showFamily(Node root){
		
		
		if (root == null) 
			return; 

		ArrayList<Node> aln=new ArrayList<>();
		
	
		Queue<Node > q = new LinkedList<>(); 
		q.add(root); 
		while (!q.isEmpty()) 
		{ 
			int n = q.size(); 

			// If this node has children 
			while (n > 0) 
			{ 
				
				Node p = q.peek(); 
				q.remove(); 
				aln.add(p);
				System.out.println(p.getName() +" "+ p.getAge()+ "- "); 

				
				if(p.getChaild()!=null){
				for (int i = 0; i < p.getChaild().size(); i++) {
					q.add(p.getChaild().get(i)); 

				}}
				n--; 
			} 
			
			System.out.println(); 
		} 
		
				}
	}

	