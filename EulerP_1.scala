

object EulerP_1{
	def main(args:Array[String])={
		val result = openFunction2(20)
		println(s"Summation of multiple is $result")
	}	
	//function will sum ups the multiple of 3 or 5 till the given argument as number
	def openFunction(num : Integer) = {
		var sum = 0
		for(i <- 1 to num-1){
		if(i%3 == 0 || i%5 == 0)
		sum = sum + i
		}
		sum
	}

	def openFunction2(num : Integer)={
		var sum = 0
		var i = 1
		while(i*3 < num){
		if((i*3) % 15 != 0)
			if (i*5< num)
			sum = sum + (i*3) +(i*5)
			else
			sum = sum + (i*3)
		else if(i*5 < num)
		sum = sum + (i*5)	
		i+=1
		}
	sum
	}
}
