public class BinaryTreeTest
{
public static void main(String[]args)
{
   BinaryTree<String> tree = new BinaryTree<>("r");
   tree.insert("a", "r", 0);
   tree.insert("b","r",1);
   tree.insert("c","a",0);
   tree.insert("d","a",1);
   tree.insert("e","b",0);
   tree.insert("f","b",1);
   tree.insert("g","c",1);
   tree.insert("h","d",0);
   tree.insert("i","d",0);
   tree.insert("j","e",1);
   tree.insert("k","e",0);
   tree.insert("l","i",1);
   System.out.print("\n");
   tree.levelOrder();
   }
}