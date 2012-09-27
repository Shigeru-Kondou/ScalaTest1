import math._

object EquinoxHoliday {

  def main(args: Array[String]): Unit = {
  		(1980 to 2200).foreach { v =>
  		  println( v  + " 3/" + spring(v) + " 9/" + autumn(v) )
  		}
  }
  
  /*
   * 指定された年の春分の日を返す
   */
  def spring(i: Int): Int = {
     ( (20.8431 + 0.242194*(i-1980)).floor - ((i-1980)/4).floor ).toInt
  }

  /*
   * 指定された年の秋分の日を返す  		
   */
  def autumn(i: Int): Int = {
     ( (23.2488 + 0.242194*(i-1980)).floor - ((i-1980)/4).floor ).toInt
  }

}