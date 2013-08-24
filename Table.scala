object Table {
	
	def main(args: Array[String]): Unit = {
	 	for (j <- 1 to 12)
	 		println(tableOf(j).mkString(" ")) 
	}

	def tableOf(n : Int) = 
		for ( i <- 1 to 10) yield n*i
	
}