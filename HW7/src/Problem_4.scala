object Problem_4
{
  def main(args: Array[String])
  {
    def curried(f: Int => Boolean) :List[Int] => List[Int] =
    {
      def applyCurry(xs: List[Int]) : List[Int] = {
        if (xs.isEmpty) Nil
        else if (f(xs.head) == true) xs.head::applyCurry(xs.tail)
        else applyCurry(xs.tail)
      }
      applyCurry
    }
    
    def arr = List(1, 2, 5, 6)
    def arr2 = List(4, 5, 6, 20)
    
    def findEven = curried(x=> x % 2 == 0)
    def findEvenArr = findEven(arr)
    
    println(curried(x => x % 2 == 0)(arr))
    
    def great10 = curried(x=> x > 10)
    def great10Arr = great10(arr2)
    println(curried(x => x > 10)(arr2))
  }
}