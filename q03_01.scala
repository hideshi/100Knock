//(21) 標準入力から英語のテキストを読み込み，ピリオドを文の区切りと見なし，１行１文の形式で標準出力に書き出せ．
import scala.io.Source
val lines = Source.fromFile(args(0)).getLines.toList
val row = lines.foldLeft("")(_ + _).split("""\.""").map(_.replaceAll("\"", "") + ".")
import java.io.PrintWriter
val out = new PrintWriter(args(0) + ".sent")
row.foreach(out.println(_))
out.close
