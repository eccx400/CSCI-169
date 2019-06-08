object Problem_3 
{
  def main(args:Array[String])
  {
    val arr = List(2, 4, 6, 8, 10)
    
    def findlast(xs:List[Int], x:Int):Int = {
      def index(ys:List[Int], y:Boolean, num:Int, i:Int):Int = {
        ys match {
        case Nil => if(num!= -1) -1 else num
        case r::rs => if(r == x) index(rs, true, i, i + 1) else if(y) index(rs, true, num, i + 1) else index(rs, false, num, i + 1)
        }
      }
      index(xs,false, 0, 0)
        
    }
    println(findlast(arr, 8))
    
  }
}