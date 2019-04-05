fun main(args:Array<String>){
 val superheros = arrayListOf("Superman", "Spider man", "Wonder woman", "Thor", "Black Panther", "Batman", "Cat", "Invisible Woman", "Iron man", "Hulk", "Aquaman")
 val powers = arrayListOf("100", "85", "90", "95", "80", "92", "75", "92", "97", "85", "75")
 val genders = arrayListOf("M", "M", "F", "M", "M", "M", "F", "F", "M", "M", "M")
 val mapHero = HashMap<String,List<String>>()
 val size: Int


 size = superheros.size-1
 for(i in 0..size) mapHero.put(superheros[i], listOf(powers[i], genders[i]))

 println("Superhero Name, Power, Gender")
 for(num in mapHero.keys) {
 	println("$num ${mapHero[num]}")
 }
 print("\n")

 println("Male Heroes")
 print("\n")
 for(num in mapHero.keys){
   val male = (mapHero[num] as List)[1]
   if(male == "M") println(num)
 }
 print("\n")

 println("Heros who has power level above 90")
 print("\n")
 for(num in mapHero.keys){
   val power = (mapHero[num] as List)[0].toInt()
   if(power > 90) println(num)
 }
}