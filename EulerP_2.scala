object EulerP_2{
	def main( args : Array[String])
	{
		fibonasssi_even(10)
	}
	
	def fibonasssi_even(num:Integer)={
		var sum = 1 
		for(a <-0 to num )
		{
			sum = sum + a
			if(sum % 2 == 0 ) print(s"$sum ")
		}
	}
}