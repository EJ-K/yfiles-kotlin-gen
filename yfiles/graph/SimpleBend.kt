// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.geometry.IPoint
import yfiles.lang.ClassMetadata
import yfiles.lang.IClassMetadata

/**
 * A mutable implementation of the [IBend] interface that can be used without an [IGraph].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleBend">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [SimpleBend] class using the given owner and location.
 * @param [owner] The owner of the bend.
 * @param [location] The bend's location. By default, the bend is placed at [ORIGIN][yfiles.geometry.Point].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleBend%23SimpleBend-constructor-SimpleBend">Online Documentation</a>
 * 
 * @property owner
 * Gets or sets the edge this bend instance belongs to.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleBend%23owner">Online Documentation</a>
 * 
 * @property location
 * Gets or sets the location of this bend.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleBend%23location">Online Documentation</a>
 */
external class SimpleBend (
final override var owner: IEdge = definedExternally,
final override var location: IPoint = definedExternally) : IBend {
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleBend%23tag">Online Documentation</a>
   */
  final override var tag: Tag?
  
  /**
   * Gets a [BendDecorator] to modify the ports [ILookup][yfiles.collections.ILookup].
   * @return A [BendDecorator] for this instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleBend%23SimpleBend-method-getDecorator">Online Documentation</a>
   */
  fun getDecorator(): BendDecorator
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleBend%23SimpleBend-method-lookup">Online Documentation</a>
   */
  override fun <T : Any> lookup(
    type: IClassMetadata<T>,
  ): T?
  
  companion object : ClassMetadata<SimpleBend> {
  }
}

inline fun SimpleBend(
    block: SimpleBend.() -> Unit
): SimpleBend {
    return SimpleBend()
        .apply(block)
}
