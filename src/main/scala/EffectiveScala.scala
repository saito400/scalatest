object EffectiveScala extends App {

  def mapF[A](l: Seq[A]) = l.map {
    case Some(x) => x
    case None => None
  }

}

