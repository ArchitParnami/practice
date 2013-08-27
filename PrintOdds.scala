
def getOdds(list : List[Int]) : List[Int] = {
	val len = list.length
	var i = if(len % 2 ==1) len-1 else len-2
	var oddlist : List[Int] = Nil
	while(i >= 0) {
		oddlist = list(i) :: oddlist
		i = i - 2
	}
	oddlist
}