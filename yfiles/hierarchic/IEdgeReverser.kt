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
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject
import yfiles.layout.LayoutGraph

/**
 * This interface handles edges that should be reversed during the hierarchic layout process.
 * @see [HierarchicLayoutCore]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeReverser">Online Documentation</a>
 */
external interface IEdgeReverser : YObject {
/**
 * Reverses all edges which point to the wrong direction.
 * @param [graph] the input graph
 * @param [ldp] the [ILayoutDataProvider] containing layering information about the nodes and edges of the graph
 * @see [ILayoutDataProvider.getNodeData]
 * @see [INodeData.layer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeReverser%23IEdgeReverser-method-normalizeEdges">Online Documentation</a>
 */
   fun normalizeEdges( graph: LayoutGraph ,
 ldp: ILayoutDataProvider )
/**
 * Restores the original direction of edges marked as reversed.
 * @param [graph] the input graph
 * @param [ldp] the [ILayoutDataProvider] containing information about the nodes and edges of the graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeReverser%23IEdgeReverser-method-restoreEdgeDirections">Online Documentation</a>
 */
   fun restoreEdgeDirections( graph: LayoutGraph ,
 ldp: ILayoutDataProvider )
/**
 * Reverses a given edge which points to the wrong direction.
 * @param [graph] the input graph
 * @param [ldp] the [ILayoutDataProvider] containing layering information about the nodes and edges of the graph
 * @param [edge] the edge to be reversed
 * @see [ILayoutDataProvider.getNodeData]
 * @see [INodeData.layer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeReverser%23IEdgeReverser-method-reverse">Online Documentation</a>
 */
   fun reverse( graph: LayoutGraph ,
 ldp: ILayoutDataProvider ,
 edge: Edge )

companion object : InterfaceMetadata<IEdgeReverser> {
}
}
