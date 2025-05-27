// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.algorithms

import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * Provides functionality to hide and unhide nodes and edges of a graph temporarily for algorithmic operations.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphHider">Online Documentation</a>
 * 
 * @constructor Instantiates a new GraphHider for the given graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphHider%23LayoutGraphHider-constructor-LayoutGraphHider">Online Documentation</a>
 * 
 * @property graph
 * Gets the `Graph` for which this `GraphHider` was created.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphHider%23graph">Online Documentation</a>
 */
external open class LayoutGraphHider  (
open val graph: Graph) : YObject {

/**
 * Gets or sets whether or not this hider should fire graph events.
 * 
 * By default the hider does not fire graph events.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphHider%23fireGraphEvents">Online Documentation</a>
 */
open var fireGraphEvents: Boolean
/**
 * holds the list of the hidden edges in stack order
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphHider%23hiddenEdges">Online Documentation</a>
 */
protected final var hiddenEdges: EdgeList
/**
 * holds the list of the hidden nodes in stack order
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphHider%23hiddenNodes">Online Documentation</a>
 */
protected final var hiddenNodes: NodeList
/**
 * The edges that are currently hidden
 * @return a cursor of the currently hidden edges
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphHider%23LayoutGraphHider-method-getHiddenEdgeCursor">Online Documentation</a>
 */
 open   fun getHiddenEdgeCursor():IEdgeCursor
/**
 * The nodes that are currently hidden
 * @return a cursor of the currently hidden nodes
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphHider%23LayoutGraphHider-method-getHiddenNodeCursor">Online Documentation</a>
 */
 open   fun getHiddenNodeCursor():INodeCursor
/**
 * Hides the given node and all it's adjacent edges from the graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphHider%23LayoutGraphHider-method-hide(Node)">Online Documentation</a>
 */
 open   fun hide( v: Node )
/**
 * Hides the given edge from the graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphHider%23LayoutGraphHider-method-hide(Edge)">Online Documentation</a>
 */
 open   fun hide( e: Edge )
/**
 * Hides the given list of edges from the graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphHider%23LayoutGraphHider-method-hide(EdgeList)">Online Documentation</a>
 */
 open   fun hide( el: EdgeList )
/**
 * Hides the given list of nodes from the graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphHider%23LayoutGraphHider-method-hide(NodeList)">Online Documentation</a>
 */
 open   fun hide( nl: NodeList )
/**
 * Hides all nodes and edges from this graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphHider%23LayoutGraphHider-method-hideAll">Online Documentation</a>
 */
 open   fun hideAll()
/**
 * Hides the given edges from the graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphHider%23LayoutGraphHider-method-hideEdgeCursor">Online Documentation</a>
 */
 open   fun hideEdgeCursor( ec: IEdgeCursor )
/**
 * Hides all edges from this graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphHider%23LayoutGraphHider-method-hideEdges">Online Documentation</a>
 */
 open   fun hideEdges()
/**
 * Hides the given elements from the graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphHider%23LayoutGraphHider-method-hideItemCursor">Online Documentation</a>
 */
 open   fun hideItemCursor( cursor: ICursor<GraphObject> )
/**
 * Hides multiple edges from the graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphHider%23LayoutGraphHider-method-hideMultipleEdges">Online Documentation</a>
 */
 open   fun hideMultipleEdges()
/**
 * Hides the given nodes from the graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphHider%23LayoutGraphHider-method-hideNodeCursor">Online Documentation</a>
 */
 open   fun hideNodeCursor( nc: INodeCursor )
/**
 * Hides all self-loop edges from this graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphHider%23LayoutGraphHider-method-hideSelfLoops">Online Documentation</a>
 */
 open   fun hideSelfLoops()
/**
 * Hides all self-loops and multiple edges from the graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphHider%23LayoutGraphHider-method-simplifyGraph">Online Documentation</a>
 */
 open   fun simplifyGraph()
/**
 * This method will be called whenever the hider is requested to unhide the given edge from the graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphHider%23LayoutGraphHider-method-unhide(Edge)">Online Documentation</a>
 */
 open protected   fun unhide( e: Edge )
/**
 * This method will be called whenever the hider is requested to unhide the given node from the graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphHider%23LayoutGraphHider-method-unhide(Node)">Online Documentation</a>
 */
 open protected   fun unhide( v: Node )
/**
 * Unhides all formerly hidden elements in the graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphHider%23LayoutGraphHider-method-unhideAll">Online Documentation</a>
 */
 open   fun unhideAll()
/**
 * Unhides the given edge.
 * @param [e] the edge that will be unhidden
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphHider%23LayoutGraphHider-method-unhideEdge">Online Documentation</a>
 */
 open   fun unhideEdge( e: Edge )
/**
 * Unhides all formerly hidden edges in the graph.
 * ### Preconditions
 * - Both source or target node of all such edges must be contained in the graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphHider%23LayoutGraphHider-method-unhideEdges()">Online Documentation</a>
 */
 open   fun unhideEdges()
/**
 * Unhides the given edges.
 * @param [edges] the edges that will be unhidden
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphHider%23LayoutGraphHider-method-unhideEdges(EdgeList)">Online Documentation</a>
 */
 open   fun unhideEdges( edges: EdgeList )
/**
 * Unhides the given node and if requested its adjacent edges.
 * @param [v] the node that will be unhidden
 * @param [unhideAdjacentEdges] whether of not to unhide previously hidden edges connected at `v` whose other end point is not hidden, i.e. it is part of the graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphHider%23LayoutGraphHider-method-unhideNode">Online Documentation</a>
 */
 open   fun unhideNode( v: Node ,
 unhideAdjacentEdges: Boolean )
/**
 * Unhides all formerly hidden nodes in the graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphHider%23LayoutGraphHider-method-unhideNodes()">Online Documentation</a>
 */
 open   fun unhideNodes()
/**
 * Unhides the given nodes and if requested its adjacent edges.
 * @param [nodes] the nodes that will be unhidden
 * @param [unhideAdjacentEdges] whether of not to unhide previously hidden edges connected at the given nodes whose other end point is not hidden, i.e. it is part of the graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphHider%23LayoutGraphHider-method-unhideNodes(NodeList,boolean)">Online Documentation</a>
 */
 open   fun unhideNodes( nodes: NodeList ,
 unhideAdjacentEdges: Boolean )

companion object : ClassMetadata<LayoutGraphHider> {
/**
 * Hides the subgraph induced by the given edges from the given graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphHider%23LayoutGraphHider-method-hideSubgraph">Online Documentation</a>
 */
 final   fun Graph.hideSubgraph( ec: IEdgeCursor )
/**
 * Unhides the subgraph induced by the given edges in the given graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphHider%23LayoutGraphHider-method-unhideSubgraph">Online Documentation</a>
 */
 final   fun Graph.unhideSubgraph( ec: IEdgeCursor )
}
}
