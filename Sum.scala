object Sum {
	def main(args : Array[String]) : Unit = {
		val sum = sumOfMultiples(args(1).toInt, args(2).toInt, args(0).toInt)
		println(sum)
	}

	def total(n : Int) : Int = 
		if (n==0)
			0
		else n + total(n-1)

	def sumOfMultiples(x : Int, y: Int, n : Int) : Int = {
		var sum = 0
		for ( i  <- 1 to n if (i % 3 == 0 || i % 5 == 0))
			sum += i
		sum
	}
}