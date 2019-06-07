object bs {
  
  
def main(args:Array[String]){
  val t = new Node(5, Leaf, Leaf)
  val t2 = t.insert(3).insert(7).insert(6).insert(2).insert(1)
  println(t2.toString)//toString included to help with debugging.

  
}

abstract class BSTree{ //Can't be instantiated - can't make an object of type BSTree.
  //CAN have variable whose type is BSTree, but the object it references will be a Leaf or Node
	def member(x: Int): Boolean//Tells us if x is in the BSTree
	def insert(x: Int): BSTree//creates a new tree that is the same as this one, but with x added
	def equal(other:BSTree):Boolean//Returns true if the two trees have identical values and structure, false o/w
	//def merge(other:BSTree): BSTree//Creates a new tree which contains all elements of this and of other
}


case object Leaf extends BSTree{//"object" means we only create one Leaf object - but this is OK because we can have as many references to it as we like.
	def member(x: Int): Boolean = false//Nothing is in the empty tree
	def insert(x: Int): BSTree = new Node(x, Leaf, Leaf)
	def equal(other:BSTree):Boolean = {
	  this==other
	}
	/*
	def equal(other:BSTree):Boolean = {
	 other match{
       case Leaf => true
       case Node(_, _, _) => false//_ don't care
     }
	}
	*/
	override def toString = "."
}

case class Node(value: Int, left: BSTree, right: BSTree) extends BSTree{
  def member(x: Int): Boolean = {
    if(value == x) true
    else if(x<value) left.member(x)
         else right member x
  }
    

   def insert(x:Int):BSTree = {//creates a new tree that is the same as this one, but with x added
     //No duplicates
     if(x<value)new Node(value, left.insert(x), right)       //Return type is boolean.  Recursion - recurse down both left and right or just one?
     else if (x>value)new Node(value, left, right insert x) 
     else this//new Node(left, right)
   }
   def equal(other:BSTree):Boolean = {
     other match{
       case Leaf => false
       case Node(v, l, r) =>  (value==v) && (left equal l) &&  (right equal r) 
     }
     
   }
   /*
   def insert(x:Int):BSTree = {//creates a new tree that is the same as this one, but with x added
     //No duplicates
     if(this member x) this
     else if(x<value)new Node(value, left.insert(x), right)       //recurse left//Recursion - recurse down both left and right or just one?
     else new Node(value, left, right insert x) 
   
   }
    */
    override def toString = "{"+left.toString+value.toString+right.toString+"}"
}

  




}