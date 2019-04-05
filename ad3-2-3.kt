fun main(args:Array<String>) {
	val superheroes = arrayListOf("Superman", "Spider man", "Wonder woman", "Thor", "Black Panther", "Batman", "Cat", "Invisible Woman", "Iron man", "Hulk", "Aquaman")
	val powers = arrayListOf("100","85","90","95","80","92","75","92","97","85","75")
    val genders = arrayListOf("M","M","F","M","M","M","F","F","M","M","M")
	val mapHero = HashMap<String,List<String>>()
    var choose: String
	val size: Int

	size = superheroes.size-1
	for(i in 0..size) mapHero.put(superheroes[i], listOf( powers[i], genders[i]))

	choose = "Batman"
	println("Name $choose")
	println("[Power, Gender] ${mapHero[choose]}")

	choose = "100"
	for(pow in mapHero.keys){
		val power = (mapHero[pow] as List)[0]
		if(power == choose) println("\nThe Superhero who has $choose power is $pow.")
	}
 }