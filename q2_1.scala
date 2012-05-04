//(11) 「拡散希望」という文字列を含むツイートを抽出せよ．
import scala.io.Source
val r = Source.fromFile(args(0)).getLines.toList.filter(_.contains("拡散希望"))
r.foreach(println(_))
