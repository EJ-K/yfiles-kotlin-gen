// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.collections.IListEnumerable
import yfiles.geometry.Point
import yfiles.lang.ClassMetadata
import yfiles.lang.YClass
import yfiles.lang.YObject
import yfiles.styles.IPortStyle

/**
 * A mutable implementation of the [IPort] interface that can be used without an [IGraph].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimplePort">Online Documentation</a>
 * 
 * @constructor Creates a port with a [default lookup][DefaultGraph.DEFAULT_PORT_LOOKUP] using the given location and owner.
 * @param [owner] The port's owner.
 * @param [locationParameter] The port's location model parameter.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimplePort%23SimplePort-constructor-SimplePort">Online Documentation</a>
 * 
 * @property owner
 * Gets or sets the owner of this port.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimplePort%23owner">Online Documentation</a>
 * 
 * @property locationParameter
 * Gets or sets the [IPortLocationModelParameter] that is used to determine the location of this port.
 * @see [IGraph.setPortLocationParameter]
 * @see [IPort.location]
 * @see [IPort.dynamicLocation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimplePort%23locationParameter">Online Documentation</a>
 */
external open class SimplePort  (
final override var owner: IPortOwner? = definedExternally,
final override var locationParameter: IPortLocationModelParameter = definedExternally) : IPort {

/**
 * Gets or sets the collection of [labels][ILabel] that are owned by this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimplePort%23labels">Online Documentation</a>
 */
final override var labels: IListEnumerable<ILabel>
/**
 * Gets or sets the [ILookup] implementation used for calls to [lookup] on this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimplePort%23lookupImplementation">Online Documentation</a>
 */
final var lookupImplementation: ILookup?
/**
 * Gets or sets the style that is responsible for the visual representation of this port in a [CanvasComponent][yfiles.view.CanvasComponent].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimplePort%23style">Online Documentation</a>
 */
final override var style: IPortStyle
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimplePort%23tag">Online Documentation</a>
 */
final override var tag: Tag?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimplePort%23SimplePort-method-lookup">Online Documentation</a>
 */
 override   fun <T : YObject>lookup( type: YClass<T> ):T?
/**
 * Sets the location of this port.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimplePort%23SimplePort-method-setLocation">Online Documentation</a>
 */
 final   fun setLocation( location: Point )

companion object : ClassMetadata<SimplePort> {
}
}

inline fun SimplePort(
    block: SimplePort.() -> Unit
): SimplePort {
    return SimplePort()
        .apply(block)
}
