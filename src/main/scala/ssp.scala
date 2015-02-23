import java.io.File

object ssp extends App {


  def fileMatching(query: String, matcher: (String, String) => Boolean) = {
    for (file <- filesHere; if matcher(file.getName, query))
    yield file
  }




  private def filesHere(): Seq[File] = {
    Seq(new File("file1"), new File("file2"), new File("file3"))
  }
}
