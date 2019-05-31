object Problem_3
{  
  def main(args: Array[String])
  {
     val a = new Set(x=>x%3 == 0)
     val b = new Set (x=> x < 10)
     
     println(b.contains(5))
     println(a/\b)
     println(a\/b)
     println(a - b)
     println(b.filter(x=> x == 5))
     println(b.forall(x=> x==2))
  }
  
  class Set(f:Int=>Boolean)
  {
    //the function f returns true for elements of the set and false for all other numbers
    def contains(elem: Int): Boolean = {
      f(elem)
    }
    //returns true if elem is in the set and false for all other numbers

    //Returns the union of this set and t.
    def \/ (t:Set):Set = new Set(x=>f(x) || contains(x))
  
    //Returns the intersection of this set and t
    def /\ (t:Set):Set = new Set(x=>f(x) && contains(x))
  
    //Returns the difference of this set and t
    def - (t:Set):Set = new Set(x=>f(x) || !contains(x))
  
     // Returns a new set that consists of the elements of s that satisfy the predicate.
    def filter(p:Int=>Boolean):Set = new Set(x=>p(x) && contains(x))
  
    //Returns true if the predicate is true for all elements of this set, and false otherwise.
    // In order to make it possible to implement this function, we will consider a predicate true for all integers if it is true for integers from -1000 to 1000.
    def forall(p:Int=>Boolean):Boolean = if(p == f) true else false
  }
}