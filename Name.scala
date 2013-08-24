object Name {

	def main(args: Array[String]): Unit = {
	  	
	  	for(name <- args if name == "Alice" || name == "Bob")
	  		println("Hi" + name)
	}
	
}