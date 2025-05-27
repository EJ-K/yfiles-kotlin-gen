// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.multipage

import yfiles.algorithms.Edge
import yfiles.algorithms.Node
import yfiles.lang.ClassMetadata
import yfiles.lang.Id
import yfiles.layout.IEdgeLabelLayout
import yfiles.layout.INodeLabelLayout
import yfiles.layout.LayoutGraph

/**
 * This class represents the layout context.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutContext">Online Documentation</a>
 */
external open class LayoutContext  : IElementInfoManager {

/**
 * Gets the relevant graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutContext%23graph">Online Documentation</a>
 */
open val graph: LayoutGraph
/**
 * Gets the layouter object that belongs to this layout context.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutContext%23layout">Online Documentation</a>
 */
open val layout: MultiPageLayout
/**
 * Adds a label to a given edge.
 * @param [label] the label that should be added to the given edge
 * @param [labeledElement] the edge to which the label should be added
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutContext%23LayoutContext-method-addEdgeLabel">Online Documentation</a>
 */
 open   fun addEdgeLabel( label: IEdgeLabelLayout ,
 labeledElement: Edge )
/**
 * Adds a label to a given node.
 * @param [label] the label that should be added to the given node
 * @param [labeledElement] the node to which the label should be added
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutContext%23LayoutContext-method-addNodeLabel">Online Documentation</a>
 */
 open   fun addNodeLabel( label: INodeLabelLayout ,
 labeledElement: Node )
/**
 * All methods of the [IElementFactory] have to use this method to create an edge.
 * @param [source] the source of the edge
 * @param [target] the target of the edge
 * @param [sameDataElementId] the ID of the edge whose data should be copied to the created edge (or `null` if no data should be copied)
 * @return the created edge
 * @see [IElementFactory]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutContext%23LayoutContext-method-createEdge">Online Documentation</a>
 */
 open   fun createEdge( source: Node ,
 target: Node ,
 sameDataElementId: Id ):Edge
/**
 * All methods of the [IElementFactory] have to use this method to create a node.
 * @param [sameDataElementId] the ID of the node whose data should be copied to the created node (or `null` if no data should be copied)
 * @return the created node
 * @see [IElementFactory]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutContext%23LayoutContext-method-createNode">Online Documentation</a>
 */
 open   fun createNode( sameDataElementId: Id ):Node
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutContext%23LayoutContext-method-getEdgeInfo">Online Documentation</a>
 */
 override   fun getEdgeInfo( edge: Edge ):IEdgeInfo?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutContext%23LayoutContext-method-getEdgeLabelInfo">Online Documentation</a>
 */
 override   fun getEdgeLabelInfo( edgeLabelLayout: IEdgeLabelLayout ):IEdgeLabelInfo?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutContext%23LayoutContext-method-getNodeInfo">Online Documentation</a>
 */
 override   fun getNodeInfo( node: Node ):INodeInfo?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutContext%23LayoutContext-method-getNodeLabelInfo">Online Documentation</a>
 */
 override   fun getNodeLabelInfo( nodeLabelLayout: INodeLabelLayout ):INodeLabelInfo?
/**
 * Returns the edge of the input graph with the given ID or `null` if there is no such edge.
 * @param [id] the ID of the edge that should be returned
 * @return the edge of the input graph with the given ID or `null` if there is no such edge
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutContext%23LayoutContext-method-getOriginalEdge">Online Documentation</a>
 */
 open   fun getOriginalEdge( id: Id ):Edge?
/**
 * Returns the node of the input graph with the given ID or `null` if there is no such node.
 * @param [id] the ID of the node that should be returned
 * @return the node of the input graph with the given ID or `null` if there is no such node
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutContext%23LayoutContext-method-getOriginalNode">Online Documentation</a>
 */
 open   fun getOriginalNode( id: Id ):Node?
/**
 * Returns the edge of a page graph (a graph that represents the result of the multi-page layout) with the given ID or `null` if there is no such edge.
 * @param [id] the ID of the edge that should be returned
 * @return the edge of a page graph with the given ID or `null` if there is no such edge
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutContext%23LayoutContext-method-getPageEdge">Online Documentation</a>
 */
 open   fun getPageEdge( id: Id ):Edge?
/**
 * Returns the node of a page graph (a graph that represents the result of the multi-page layout) with the given ID or `null` if there is no such node.
 * @param [id] the ID of the node that should be returned
 * @return the node of a page graph with the given ID or `null` if there is no such node
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutContext%23LayoutContext-method-getPageNode">Online Documentation</a>
 */
 open   fun getPageNode( id: Id ):Node?
/**
 * Removes a label from a given edge.
 * @param [label] the label that should be removed
 * @param [labeledElement] the edge owning the label
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutContext%23LayoutContext-method-removeEdgeLabel">Online Documentation</a>
 */
 open   fun removeEdgeLabel( label: IEdgeLabelLayout ,
 labeledElement: Edge ):Boolean
/**
 * Removes a label from a given node.
 * @param [label] the label that should be removed
 * @param [labeledElement] the node owning the label
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutContext%23LayoutContext-method-removeNodeLabel">Online Documentation</a>
 */
 open   fun removeNodeLabel( label: INodeLabelLayout ,
 labeledElement: Node ):Boolean

companion object : ClassMetadata<LayoutContext> {
}
}
