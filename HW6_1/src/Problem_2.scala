object Problem_2
{
  def main(args: Array[String])
  {
    def apply_combine2(f:Int => Int, x:Int, g:(Int, Int) => Int) :Int = 
    
    def apply_square = apply_combine2(x=>x*x)
    def apply_square_5 = apply_square(5)
    println(apply_combine2(x=>x*x)(5)(x=>x*x))
  }
}