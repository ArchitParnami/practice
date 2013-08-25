def maxOfList(list : List[Int]) : Int = {
	if(list.length == 1)
		list.head
	else
		if(list.head > maxOfList(list.tail))
			list.head
		else
			maxOfList(list.tail)
}