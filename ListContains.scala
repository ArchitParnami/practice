def listContains(list : List[Int], n : Int) : Boolean = {
	if (list == Nil)
		false
	else
		if (list.head == n || listContains(list.tail, n))
			true
		else
			false
}