package datastructures;

public class BTreepreorder {

	
	public static class TreeNode{
		int data;
		TreeNode lnode;
		TreeNode rnode;
		
		public TreeNode(int data) {
			this.data=data;

		}
		
	}
		public static TreeNode creatBinaryTree() {
			
			TreeNode rootnode=new TreeNode(40);
			TreeNode node20=new TreeNode(20);
			TreeNode node10=new TreeNode(10);
			TreeNode node30=new TreeNode(30);
			TreeNode node60=new TreeNode(60);
			TreeNode node50=new TreeNode(50);
			TreeNode node70=new TreeNode(70);
			
			rootnode.lnode=node20;
			rootnode.rnode=node60;
			
			
			node20.lnode=node10;
			node20.rnode=node30;
			
			node60.lnode=node50;
			node60.rnode=node70;
			
			
			return rootnode;
		}
		
		
	
	public void preordertraversal(TreeNode rootnode) {
		
		if(rootnode!=null) {
			
			System.out.println(rootnode.data);
			preordertraversal(rootnode.lnode);
			preordertraversal(rootnode.rnode);
		}
		
		
	}
	
	
	public static void main(String[] args) {
		BTreepreorder bt=new BTreepreorder();
		TreeNode rootnode=creatBinaryTree();
		bt.preordertraversal(rootnode);
		
		
		
	}

}
