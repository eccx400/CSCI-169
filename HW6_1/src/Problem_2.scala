object Problem_2
{
  def main(args: Array[String])
  {
    def apply_square = apply_combine2(x=>x*x)
    def apply_square_5 = apply_square(5)
    
    def combine(f:Int => Int, x:Int, g:(Int, Int) => Int) :Int = if (x == 1) f(1) else g(combine (f, x-1, g), f(x))
    def apply_combine2(f:Int => Int) : Int => ((Int, Int) => Int) => Int =
    {
        x => g => combine(f, x, g)
    }
    println(apply_combine2(x => x * x)(5)((x, y) => x * y))
  }
}