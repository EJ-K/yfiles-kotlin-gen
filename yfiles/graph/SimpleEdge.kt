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
import yfiles.lang.ClassMetadata
import yfiles.lang.YClass
import yfiles.lang.YObject
import yfiles.styles.IEdgeStyle

/**
 * A mutable implementation of the [IEdge] interface that can be used without an [IGraph].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleEdge">Online Documentation</a>
 * 
 * @constructor Creates an edge with a [default lookup][DefaultGraph.DEFAULT_EDGE_LOOKUP], and the given source and target ports.
 * @param [sourcePort] The source port for the edge.
 * @param [targetPort] The target port for the edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleEdge%23SimpleEdge-constructor-SimpleEdge">Online Documentation</a>
 * 
 * @property sourcePort
 * Gets or sets the source port instance this edge is connected to.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleEdge%23sourcePort">Online Documentation</a>
 * 
 * @property targetPort
 * Gets or sets the target port instance this edge is connected to.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleEdge%23targetPort">Online Documentation</a>
 */
external open class SimpleEdge  (
final override var sourcePort: IPort? = definedExternally,
final override var targetPort: IPort? = definedExternally) : IEdge {

/**
 * Gets or sets the collection of [bends][IBend] that describe the geometry of this edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleEdge%23bends">Online Documentation</a>
 */
final override var bends: IListEnumerable<IBend>
/**
 * Gets or sets the collection of [labels][ILabel] that are owned by this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleEdge%23labels">Online Documentation</a>
 */
final override var labels: IListEnumerable<ILabel>
/**
 * Gets or sets the [ILookup] implementation used for calls to [lookup] on this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleEdge%23lookupImplementation">Online Documentation</a>
 */
final var lookupImplementation: ILookup?
/**
 * Gets or sets the collection of [ports][IPort] that are owned by this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleEdge%23ports">Online Documentation</a>
 */
final override var ports: IListEnumerable<IPort>
/**
 * Gets or sets the style that is responsible for the visual representation of this edge in a [CanvasComponent][yfiles.view.CanvasComponent].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleEdge%23style">Online Documentation</a>
 */
final override var style: IEdgeStyle
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleEdge%23tag">Online Documentation</a>
 */
final override var tag: Tag?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleEdge%23SimpleEdge-method-lookup">Online Documentation</a>
 */
 override   fun <T : YObject>lookup( type: YClass<T> ):T?

companion object : ClassMetadata<SimpleEdge> {
}
}

inline fun SimpleEdge(
    block: SimpleEdge.() -> Unit
): SimpleEdge {
    return SimpleEdge()
        .apply(block)
}
