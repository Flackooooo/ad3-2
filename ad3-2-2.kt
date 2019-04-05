fun main(){
	val superheroes = arrayListOf("Superman", "Spider man", "Wonder woman", "Thor", "Black Panther", "Batman", "Cat", "Invisible Woman", "Iron man", "Hulk", "Aquaman")
	
	superheroes.add("Black Widow")
	superheroes.add("Ant Man")
	superheroes.add("Captain Marvel")
	superheroes.add("Flash")
	superheroes.add("Green Lantern")
	
	println("Superheros(after add)")
	print("\n")
	for(i in superheroes){ 
		println(i)	
	}
}