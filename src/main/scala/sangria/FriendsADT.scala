package sangria


trait FriendsADT{
  def id: String
  def charecterName: String
  def realName: String
  def occupation:String
  def friends:List[String]
  def alsoAppearedIn:Option[List[String]]
  def age:Int
}