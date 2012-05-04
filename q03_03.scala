//(23) (22)の出力を標準入力から１行（１文）を読み込む毎に，スペースで単語列に分割し，１行１単語形式で標準出力に書き出せ．文の終端を表すため，文が終わる毎に空行を出力せよ．
import scala.io.Source
val lines = Source.fromFile(args(0)).getLines.toList
val row = lines.map(_.split(" "))
import java.io.PrintWriter
val out = new PrintWriter(args(0) + ".tok")
row.foreach(_.foreach(t =>
			if(t.contains(".")) out.println(t + "\n")
			else out.println(t)
		))
