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
import yfiles.lang.YClass
import yfiles.lang.YObject

/**
 * A mutable implementation of the [IBend] interface that can be used without an [IGraph].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleBend">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [SimpleBend] class using the given owner and location.
 * @param [owner] The owner of the bend.
 * @param [location] The bend's location.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleBend%23SimpleBend-constructor-SimpleBend">Online Documentation</a>
 * 
 * @property owner
 * Gets or sets the edge this bend instance belongs to.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleBend%23owner">Online Documentation</a>
 * 
 * @property location
 * Gets or sets the location of this bend.
 * @see [x]
 * @see [y]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleBend%23location">Online Documentation</a>
 */
external open class SimpleBend  (
final override var owner: IEdge? = definedExternally,
final override var location: IPoint = definedExternally) : IBend {

/**
 * Gets or sets the [ILookup] implementation used for calls to [lookup] on this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleBend%23lookupImplementation">Online Documentation</a>
 */
final var lookupImplementation: ILookup?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleBend%23tag">Online Documentation</a>
 */
final override var tag: Tag?
/**
 * Gets the current x coordinate of this bend.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleBend%23x">Online Documentation</a>
 */
final val x: Double
/**
 * Gets the current y coordinate of this bend.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleBend%23y">Online Documentation</a>
 */
final val y: Double
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleBend%23SimpleBend-method-lookup">Online Documentation</a>
 */
 override   fun <T : YObject>lookup( type: YClass<T> ):T?

companion object : ClassMetadata<SimpleBend> {
}
}

inline fun SimpleBend(
    block: SimpleBend.() -> Unit
): SimpleBend {
    return SimpleBend()
        .apply(block)
}
