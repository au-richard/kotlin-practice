import java.util.UUID

enum class EntityType {
  EASY, MEDIUM, HARD
}
object EntityFactory {
  fun create(type: EntityType) : Entity {
    val id = UUID.randomUUID().toString()
    val name = when(type) {
      EntityType.EASY -> "Easy"
      EntityType.MEDIUM -> "Medium"
      EntityType.HARD -> "Hard"

    }
    return Entity(id, name)
  }

}

class Entity constructor(val id: String, val name: String) {
  override fun toString(): String {
    return "id:$id name:$name"
  }

}

fun main () {
  val entity = EntityFactory.create(EntityType.EASY)
  println(entity)

  val mediumEntity = EntityFactory.create(EntityType.MEDIUM)
  println(mediumEntity)
}