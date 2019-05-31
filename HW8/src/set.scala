object Sets {
  def main(args: Array[String]) { 
    //Represent a set with its characteristic function

    //This is a set. The type of a set is Int=>Boolean
    def neg(x:Int):Boolean = x<0    //Characteristic function for the set of negative integers?
    println(neg(7))//Looks weird
    def contains(set:Int=>Boolean, elem:Int):Boolean = set(elem)
    println(contains(neg, 7))//Easier to read
    
    //Define the set that contains just 1; S = {1}
    def oneset(x:Int):Boolean = x==1
    
    //singletonSet is NOT a set.  Its type is Int=>(Int=>Boolean)
    //Creates a singleton set {elem}
    def singletonSet(elem:Int):Int=>Boolean = {
      def ret(x:Int):Boolean = {
        x==elem
      }
      ret
    }
    def singletonSet2(elem:Int):Int=>Boolean = x=>x==elem//Use of anonymous function preferred
    
    //Is 5 in the singleton set {3}
    println(contains(singletonSet(3), 5))
    
    //Output should be a set
    //Input should be 2 sets
    def union(s1:Int=>Boolean, s2:Int=>Boolean):Int=>Boolean = 
      x=>s1(x) || s2(x)
    def intersect(s1:Int=>Boolean, s2:Int=>Boolean):Int=>Boolean = 
      x=>contains(s1, x) && contains(s2, x)  //Using contains makes it easier to read, does the same thing.
    
    def diff(s1:Int=>Boolean, s2:Int=>Boolean):Int=>Boolean = 
      x=>contains(s1, x) && !contains(s2, x) 
     
  }
  
  
  
  
  
  
  
  
  
  
  /*
   * 


object Sets {
  def main(args: Array[String]) { 
    //Represent a set with its characteristic function
    //Characteristic function for the set of negative integers?
    //The type of a set Int=>Boolean
    def neg(x:Int):Boolean = x<0//This is how we represent the set of negative ints
    println(neg(-7))//this looks weird
    
    def contains(set:Int=>Boolean, x:Int):Boolean = set(x) 
    //Define contains to make our code easier to read
    println(contains(neg, -1))//Makes it clear we're asking if neg contains -1
    println(contains(neg, -1))
    def oneset(x:Int) = x==1
    
    //singletonSet should return the set consisting of just elem.
    //The type of singletonSet is Int=>(Int=>Boolean)
    def singletonSet(elem:Int): Int=>Boolean = {//Start with named, change to anonymous
      def ret(x:Int):Boolean = {//The type of a def is Unit, because it is a side effect
        x==elem
      }
      ret
    }
     def singletonSet2(elem:Int): Int=>Boolean = x=>x==elem
     //Function calls to see if 7 is in the singleton set 2
     println(contains(singletonSet2(2), 7))
     
     //Union = result is a set, takes in two sets
     def union(s1:Int=>Boolean, s2:Int=>Boolean ): Int=>Boolean = (x:Int) =>
       s1(x) || s2(x)
     def intersect(s1:Int=>Boolean, s2:Int=>Boolean ): Int=>Boolean = (x:Int) =>
       s1(x) && s2(x)
  }
}
*/
   
}