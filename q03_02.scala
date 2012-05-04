//(22) (21)のプログラムは破棄して，標準入力から英語のテキストを読み込み，ピリオド→スペース→大文字を文の区切りと見なし，１行１文の形式で標準出力に書き出せ．
import scala.io.Source
val lines = Source.fromFile(args(0)).getLines.toList
val s = lines.map(_.replaceAll("\"", "")).map(_.replace("[!?]", ".")).foldLeft("")(_ + _)
val r = """(.+?\.\s)[A-Z]""".r
var head:Char = '0'
val row = for(i <- r.findAllIn(s)) yield {
			val h = head
			head = i.last
			h.toString + i.dropRight(1)
		}
val r2 = """.+([A-Z].+)$""".r
val row2 = row.toList ::: List(r2.findFirstMatchIn(s).get.group(1))
import java.io.PrintWriter
val out = new PrintWriter(args(0) + ".sent")
row2.foreach(out.println(_))
