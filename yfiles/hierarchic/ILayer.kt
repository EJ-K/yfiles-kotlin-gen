// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.hierarchic

import yfiles.algorithms.Edge
import yfiles.algorithms.Node
import yfiles.algorithms.NodeList
import yfiles.algorithms.YList
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject
import yfiles.layout.RowDescriptor

/**
 * This interface describes a single layer in a hierarchic layout.
 * @see [ILayers]
 * @see [HierarchicLayoutCore]
 * @see [ILayerer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILayer">Online Documentation</a>
 */
external interface ILayer : YObject {
/**
 * Gets the index of this [ILayer] instance in the [list of all layers][ILayers].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILayer%23index">Online Documentation</a>
 */
val index: Int
/**
 * Gets a list of the [Node]s associated with this [ILayer] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILayer%23list">Online Documentation</a>
 */
val list: NodeList
/**
 * Gets or sets the [RowDescriptor] associated with this [ILayer] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILayer%23row">Online Documentation</a>
 */
var row: RowDescriptor
/**
 * Gets a list of all same-layer [Edge]s associated with this [ILayer] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILayer%23sameLayerEdges">Online Documentation</a>
 */
val sameLayerEdges: YList<Edge>
/**
 * Gets the type of this [ILayer] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILayer%23type">Online Documentation</a>
 */
val type: LayerType
/**
 * Adds a newly created [Node] to this [ILayer] instance.
 * @param [node] the [Node] to be added
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILayer%23ILayer-method-add">Online Documentation</a>
 */
   fun add( node: Node )

/**
 * Adds a newly created [Node] to this [ILayer] instance.
 * @param [node] the [Node] to be added
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILayer%23ILayer-method-add">Online Documentation</a>
 */
@JsName("add")
  final operator fun plusAssign( node: Node ):Unit = definedExternally
/**
 * Adds a same-layer [Edge] to this [ILayer] instance.
 * @param [edge] the same-layer [Edge] to be added
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILayer%23ILayer-method-addSameLayerEdge">Online Documentation</a>
 */
   fun addSameLayerEdge( edge: Edge )
/**
 * Removes the current layer from the [list of layers][ILayers].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILayer%23ILayer-method-remove()">Online Documentation</a>
 */
   fun remove()
/**
 * Removes a [Node] from this [ILayer] instance.
 * @param [node] the [Node] to be removed
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILayer%23ILayer-method-remove(Node)">Online Documentation</a>
 */
   fun remove( node: Node )

/**
 * Removes a [Node] from this [ILayer] instance.
 * @param [node] the [Node] to be removed
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILayer%23ILayer-method-remove(Node)">Online Documentation</a>
 */
@JsName("remove")
  final operator fun minusAssign( node: Node ):Unit = definedExternally
/**
 * Adjusts the order of the [Node]s of this [ILayer] instance according to the given order.
 * @param [list] the given list to be used
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILayer%23ILayer-method-setNodeOrder">Online Documentation</a>
 */
   fun setNodeOrder( list: YList<Node> )

companion object : InterfaceMetadata<ILayer> {
}
}
