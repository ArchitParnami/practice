def listSum(ls : List[Int]) : Int = {
	var sum = 0
	ls.foreach(sum += _)
	sum
}

def listSumR(ls : List[Int] ): Int = ls match {
	case List() => 0
	case x :: xs => x + listSumR(xs)
}

def listSumF(ls : List[Int]) : Int = 
	(0 /: ls) (_ + _)

def isPalindrome(str : String) = {
	str == str.reverse
}

def perfectSquares(count : Int) = {
	val ans = for (i <- 1 to count) yield i * i
	ans.toList.toString
}

def altList[T](l1 : List[T], l2 : List[T]) : List[Any] = {
	(l1,l2).zipped.map(List(_,_)).flatten
}

def merge(l1 : List[Int], l2 : List[Int]) : List[Int] = (l1,l2) match {
	case (Nil, ys) => ys
	case (xs, Nil) => xs
	case (x :: xs, y :: ys) => if (x < y) x :: merge(xs, l2)
								else y :: merge(l1, ys)
}

def fibbo(n : Int) : String  =  {

	def f(a:Long, b:Long, n :Int) :List[Long] = {
		if (n==0) Nil
		else a :: f(b, a+b,n-1)
	}

	f(0,1,n) mkString " "
}

def intToList(n :Int) = {
	n.toString.toList
}