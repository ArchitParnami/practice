def append[T](xs : List[T], ys : List[T]) : List[T] = xs match {
	case List() => ys
	case x :: xs1 => x :: append(xs1, ys)
}

def length[T](xs : List[T]) : Int = xs match {
	case List() => 0
	case _ :: ys => 1 + length(ys)
}

def reverse[T](xs : List[T]) : List[T] = 
	(List[T]() /: xs ) ((ys,elem) => elem :: ys )