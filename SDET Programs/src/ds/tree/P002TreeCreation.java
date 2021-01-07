package ds.tree;

import java.util.ArrayList;
import java.util.List;

public class P002TreeCreation {

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	/*
	 * 1. Preorder current input => Original root node left-side || Original
	 * root node right-side?
	 * 
	 * 2. Current root node will traverse in Preorder once left and right
	 * indices were visited in inorder...
	 * 
	 */

	public static TreeNode build(int[] preorder, int[] inorder, TreeNode node) {
		// TODO
//		TreeNode originalRootNode = preorder[0];
		int left = 1;
		int right = 2;
		
		
		
		
		return null;
	}

	public static TreeNode waste(int[] preorder, int[] inorder) {

		// List<TreeNode> list =
		// Arrays.stream(preorder).,mapToObj(TreeNode::new).collect(Collectors.toList());

		List<Integer> output = new ArrayList<>();
		
		int originalRootNode = preorder[0];
		
		output.add(originalRootNode);
		
		int mid=0;
        List<Integer> leftList = new ArrayList<>();
        List<Integer> rightList = new ArrayList<>();
        
        
        for(int i=0;i<inorder.length;i++){
            if(preorder[0]!=inorder[i]){
                leftList.add(inorder[i]);
                mid =i+1;
            }else{
                break;
            }
        }

        
        for(int i=mid+1;i<inorder.length;i++){
            rightList.add(inorder[i]);
        }

		
		return null;
	}
	
	public static TreeNode buildTree(List<Integer> leftInorder, List<Integer> rightInorder, int[] preorder, int[] inorder) {
		// TODO
		
		for(int i=1; i < preorder.length; i++){
			
		}
		
		
		
		return null;
	}

	
	

	public static void main(String[] args) {

		int[] preorder = { 3, 9, 20, 15, 7 };
		
		int[] inorder = { 9, 3, 15, 20, 7 };

		// Expected - [3,9,20,null,null,15,7]

		System.out.println(waste(preorder, inorder));

	}

}
