fun main(){
    val songOut = Song("We Don't talk anymore","Selena",2011,1000000)
    songOut.songDescription()
    println(songOut.isPopular)
}

class Song(
    val title: String,
    val artist: String,
    val yearPublished: Int,
    val playCount:Int
){
    val isPopular : Boolean
        get() = playCount >= 1000
    fun songDescription(){
        println("$title, performed by $artist, was released in $yearPublished , $playCount")
    }
}