//(8) 各行を２コラム目の辞書順にソートしたもの（注意: 各行の内容は変更せずに並び替えよ）．
//確認にはsortコマンドを用いよ（この問題は結果が合わなくてもよい）．
import scala.io.Source
val r = Source.fromFile(args(0)).getLines.toList.sortWith(_.compareTo(_) < 0)
println(r)
