object D4 {

def main(args:Array[String]){
  val a = new Rational(1, 2)                
  println(a.numer)
  println(a.denom)
  
  val b = new Rational(3, 4) 
  //val c = a.plus(b)
  val c = a+b
  //val d = a mult b
  println(c.numer)
  println(c.denom)
  

}
}
class Rational(x: Int, y: Int){//Primary constructor, takes the most parameters
  def this() = this(0, 1)
  def this(x:Int) = this(x, 1)
  private val g = gcd(x, y)
	val numer = x/g//Members are public by default; we also have private and protected; doesn't have Java's level between private and protected
	val denom = y/g
	private def gcd(a:Int, b:Int):Int = if(b==0) a else gcd(b, a%b)
	def +(that:Rational):Rational =
	  new Rational(this.numer*that.denom  + that.numer*this.denom,this.denom*that.denom)
	def *(that:Rational):Rational =
	  new Rational(this.numer*that.numer, this.denom*that.denom)
	def unary_- = new Rational(-this.numer, this.denom)
	def -(that:Rational):Rational = this.+(-that)
}