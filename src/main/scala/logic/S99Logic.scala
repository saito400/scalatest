package logic {
  object S99Logic {

    def p46And(a: Boolean, b: Boolean) : Boolean = (a, b) match {
      case (true, true) => true
      case _ => false
    }

    //TODO didn't work
//    def p49(i: Int): List[String] = {
//      if (i == 0)  List[String]("")
//      else {
//        val lower:List[String] =  p49(i - 1)
//        (lower map { "0" + _ }) ::: (lower.reverse map { "1" + _ })
//      }
//    }





 }
}
