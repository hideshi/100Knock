//(7) １コラム目の文字列の異なり数（種類数）．
//確認にはcut, sort, uniq, wcコマンドを用いよ．
import scala.io.Source
val r = Source.fromFile(args(0)).getLines.toSet.toList.size
println(r)
