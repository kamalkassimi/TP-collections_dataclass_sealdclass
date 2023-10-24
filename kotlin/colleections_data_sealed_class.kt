data class  Joueur constructor( var nom:String , var numero:Int , var number:Int ,var Equipe1:Equipe ,var points:Int,var Pays:Pays )

enum class  Equipe(){
    OCS, OCK
}

enum class  Pays(){
    MAROC, TUNISIE, EGYPTE, ALGERIE , MOURITANTE
}
class  Equiope{
     var listEquipe= mutableListOf<Joueur>()
     fun Ajout(j:Joueur):Boolean{
          var valide= recherche(j)
          if (valide==-1){
               return false
               }else
             listEquipe.add(j)
            return true
     }
     fun recherche(j:Joueur):Int{
          for (i in listEquipe){
               if (i.nom == j.nom){
                    return  listEquipe.indexOf(i)
               }
          }
          return -1
     }
     fun supperssion(j:Joueur):Boolean{
          for (i in listEquipe){
               if (i.numero == j.numero){
                    var index= listEquipe.indexOf(i)
                    listEquipe.removeAt(index)
                    return true
               }
          }
          return false
     }
     fun setPoints(j:Joueur,points: Int ){
          for (i in listEquipe){
          if (i.numero == j.numero){
               i.points += points
          }
     }
     }
}
//data class  joue constructor(var numero:Int ,var nom:String ,var points:Int )
fun main() {
     var list = mutableListOf<Joueur>()
     var j0= Joueur("kamal",5,8, Equipe.OCK,14,Pays.ALGERIE)
     var j1= Joueur("Amine",7,9, Equipe.OCS,18,Pays.EGYPTE)
     var j3= Joueur("Othman",4,4, Equipe.OCK,30,Pays.MAROC)
     var j4= Joueur("Ayoub",4,4, Equipe.OCK,30,Pays.MOURITANTE)
     j0.nom = "saad kassimi"
     j1.Equipe1= Equipe.OCK
     list.add(j0)
     list.add(j1)
     list.add(j3)
     list.add(j4)
     println(list)
     var Equipe1=  Equiope()
      println(Equipe1.Ajout(j0))
      println(Equipe1.Ajout(j1))
     println(Equipe1.recherche(j1))
      println(Equipe1.listEquipe)
}