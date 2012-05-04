//(9) 各行を２コラム目，１コラム目の優先順位で辞書の逆順ソートしたもの（注意: 各行の内容は変更せずに並び替えよ）．確認にはsortコマンドを用いよ（この問題は結果が合わなくてもよい）．
import scala.io.Source
val r = Source.fromFile(args(0)).getLines.toList.map(_.split("\t"))
        .sortWith((a, b) => a(0).compareTo(b(0)) < 0)
        .sortWith((a, b) => if(a(0) == b(0)) a(1).compareTo(b(1)) < 0 else false)
r.foreach(a => println(a(1) + ":" + a(0)))
