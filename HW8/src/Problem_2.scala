object Problem_2
{
  def main(arg: Array[String])
  {
    def setList(xs: List[Int]):Int => Boolean = {
      x=>if(xs.head == x) true else setList(xs.tail) == false 
    }
    
    def filter(s: Int=>Boolean, p:Int=>Boolean): Int=>Boolean = {
       x=>p(x) && s(x)
    }
     
    def forall(s:Int=>Boolean, p:Int=>Boolean):Boolean = {
       if (s == p) true else false
    }
    
    def a = List(0, 1, 2, 3, 5, 7, 9)
    def b = List(0, 2, 4, 6, 8, 10)
    
    val setA = setList(a)
    val setB = setList(b)
    
    println(filter(setA, setB)(0))
    println(forall(setA, setB))
  }
}