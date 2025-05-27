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
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * This interface retrieves [INodeData] and [IEdgeData] instances for elements in the current layout graph.
 * @see [HierarchicLayoutCore]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILayoutDataProvider">Online Documentation</a>
 */
external interface ILayoutDataProvider : YObject {
/**
 * Returns the [IEdgeData] instance associated with the given [Edge].
 * @param [edge] the given edge
 * @return the [IEdgeData] instance associated with the edge
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILayoutDataProvider%23ILayoutDataProvider-method-getEdgeData">Online Documentation</a>
 */
   fun getEdgeData( edge: Edge ):IEdgeData
/**
 * Returns the [INodeData] instance associated with the given [Node].
 * @param [node] the given node
 * @return the [INodeData] instance associated with the node
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILayoutDataProvider%23ILayoutDataProvider-method-getNodeData">Online Documentation</a>
 */
   fun getNodeData( node: Node ):INodeData

companion object : InterfaceMetadata<ILayoutDataProvider> {
}
}
