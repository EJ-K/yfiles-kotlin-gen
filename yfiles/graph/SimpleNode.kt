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
import yfiles.geometry.IRectangle
import yfiles.lang.ClassMetadata
import yfiles.lang.YClass
import yfiles.lang.YObject
import yfiles.styles.INodeStyle

/**
 * A mutable implementation of the [INode] interface that can be used without an [IGraph].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleNode">Online Documentation</a>
 * 
 * @constructor Creates a default node with default [lookup][DefaultGraph.DEFAULT_NODE_LOOKUP], an instance of [VoidNodeStyle][yfiles.styles.VoidNodeStyle], empty [layout] and no labels or ports.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleNode%23SimpleNode-constructor-SimpleNode">Online Documentation</a>
 */
external open class SimpleNode  () : INode {

/**
 * Gets or sets the collection of [labels][ILabel] that are owned by this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleNode%23labels">Online Documentation</a>
 */
final override var labels: IListEnumerable<ILabel>
/**
 * Gets or sets the layout of the node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleNode%23layout">Online Documentation</a>
 */
final override var layout: IRectangle
/**
 * Gets or sets the [ILookup] implementation used for calls to [lookup] on this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleNode%23lookupImplementation">Online Documentation</a>
 */
final var lookupImplementation: ILookup?
/**
 * Gets or sets the collection of [ports][IPort] that are owned by this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleNode%23ports">Online Documentation</a>
 */
final override var ports: IListEnumerable<IPort>
/**
 * Gets or sets the style that is responsible for the visual representation of this node in a [CanvasComponent][yfiles.view.CanvasComponent].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleNode%23style">Online Documentation</a>
 */
final override var style: INodeStyle
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleNode%23tag">Online Documentation</a>
 */
final override var tag: Tag?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleNode%23SimpleNode-method-lookup">Online Documentation</a>
 */
 override   fun <T : YObject>lookup( type: YClass<T> ):T?

companion object : ClassMetadata<SimpleNode> {
}
}

inline fun SimpleNode(
    block: SimpleNode.() -> Unit
): SimpleNode {
    return SimpleNode()
        .apply(block)
}
