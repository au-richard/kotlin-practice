import java.util.*

enum class EntityType {
  HELP, EASY, MEDIUM, HARD;

  fun getFormattedName() = name.lowercase()
    .replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
}
object EntityFactory {
  fun create(type: EntityType) : Entity {
    val id = UUID.randomUUID().toString()
    val name = when(type) {
      EntityType.EASY -> type.name
      EntityType.MEDIUM -> type.getFormattedName()
      EntityType.HARD -> "HARD"
      EntityType.HELP -> type.getFormattedName()

    }
    return when (type) {
      EntityType.EASY -> Entity.Easy(id, name)
      EntityType.MEDIUM -> Entity.Medium(id, name)
      EntityType.HARD -> Entity.Hard(id, name, multiplier = 2f)
      EntityType.HELP -> Entity.Help
    }
  }

}

sealed class Entity() {
  object Help: Entity() {
    val name = "Help"
  }

  data class Easy(val id: String, val name: String): Entity() {
    override fun equals(other: Any?): Boolean {
      return super.equals(other)
    }

    override fun hashCode(): Int {
      return super.hashCode()
    }
  }

  data class Medium(val id: String, val name: String): Entity()
  data class Hard(val id: String, val name: String, val multiplier: Float) : Entity()

}

fun main() {
  val entity1 = Entity.Easy(id = "id", name = "name")
  val entity2 = entity1.copy(name = "John")

  if (entity1 == entity2) {
    println("they are equal")
  } else {
    println("they are not equal")
  }
}