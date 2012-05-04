//(5) 自然数Nをコマンドライン引数にとり，入力のうち先頭のN行だけ．確認にはheadコマンドを用いよ．
import scala.io.Source
val r = Source.fromFile(args(0)).getLines.take(args(1).toInt)
r.foreach(println(_))
