object Problem_1
{
  def main(args: Array[String])
  {
    def alternateList(x: List[Int], y: List[Int]) :List[Int]= x match 
    {
      case first :: rest => first :: alternateList(y, rest)
      case _ => y
    }
    
    def arr = List(1, 2, 3, 5, 7)
    def arr2 = List(4, 5, 6)
  
    println(alternateList(arr, arr2))
  }
}