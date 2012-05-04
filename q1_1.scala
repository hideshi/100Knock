//(1) 行数をカウントしたもの．確認にはwcコマンドを用いよ．
import scala.io.Source
val res = Source.fromFile(args(0))("UTF-8").getLines.length
println(res)
