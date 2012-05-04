//(2) タブ１文字につきスペース１文字に置換したもの．
//確認にはsedコマンド，trコマンド，もしくはexpandコマンドを用いよ．
import scala.io.Source
val res = Source.fromFile(args(0))("UTF-8").getLines.map(_.replaceAll("\t", " "))
res.foreach(println(_))
