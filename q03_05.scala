//(25) (24)の出力を標準入力から１行（１単語）を読み込む毎に，その単語を小文字に
//変換した文字列を各行の最終列にタブ区切り形式で追加し，標準出力に書き出せ．
import scala.io.Source
val lines = Source.fromFile(args(0)).getLines.toList
val row = lines.map(_.split(" "))
import java.io.PrintWriter
val out = new PrintWriter(args(0) + ".tok")
row.foreach(_.foreach(t =>
			if(t.contains(".")) out.println(t + "\t" + t.toLowerCase + "\n")
			else out.println(t + "\t" + t.toLowerCase) 
		))
