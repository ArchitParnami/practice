def reverseList(list : List[Int]) : List[Int] = {
	if (list.length == 0)
		Nil
	else
		list.last :: reverseList(list.init)
}