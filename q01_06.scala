//(6) 自然数Nをコマンドライン引数にとり，入力のうち末尾のN行だけ．確認にはtailコマンドを用いよ．
import scala.io.Source
val r = Source.fromFile(args(0)).getLines.toList.takeRight(args(1).toInt)
r.foreach(println(_))
