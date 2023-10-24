import java.util.Date

class Etape constructor(var nom:String, var date_debut:String, var  date_fin:String ,var  Difficute:Difficulte)

enum class  Difficulte(){
    FACILE, DiFACILE
}
enum class nationnalite{
    MAROC, TUNISIE, EGYPTE, ALGERIE , MOURITANTE
}
class  Resulatat constructor( var nom:String , var prenom:String,var Age:Int, var nationnalite:nationnalite,list: MutableList<Equipe>)

class Cycliste (){
    var list= hashMapOf<Etape,Resulatat>()
    // adding list  etape resulatat en chack element
    fun nouvelleEtape(etape: Etape,resulatat: Resulatat):Boolean{
        if ( list.containsKey(etape))
        {
            return false
        }
        list.put(etape, resulatat)
        return  true
    }

    // Question  06  creation class data   termne
    data class  termne constructor(var tempsEffecutue:Int, var timePreform:Int)
    // Question  07  creation class data abandonne
    data class  abandonne constructor(var distanceParconurue:Int, var raison:String




   // override function toString
    override fun toString(): String {
        return super.toString()
    }
    //7  Au niveau  du programme principal , effec
    fun modifacation(key: Etape,value:Resulatat){
        if (list.containsKey(key)){
            list[key]= value
        }
        else {
            println(" nothing key in list Cycliste")
        }

    }
}