object Prime {
	def main(args : Array[String] ): Unit = {

		val total = args(0).toInt
		var count = 0
		var j=2
		while( count != total) {
			if(isPrime(j)) {
				print(j + " ")
				count += 1
			}
			j += 1
		}

	}

	def isPrime(n : Int) : Boolean = {
		var flag = true
		
		if(n == 2)
			flag = true
		else if (n %2 == 0){
			flag = false
		}
		else {
			var i = 3
			while( i <= n/2 && flag){
				if(n%i == 0)
					flag = false
				i = i + 2
			}	
		}
		flag
	}
}