// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.algorithms

import yfiles.collections.IComparer
import yfiles.collections.IEnumerable
import yfiles.lang.ClassMetadata

/**
 * Represents a so-called node in the directed graph data type [Graph].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YNode">Online Documentation</a>
 * 
 * @constructor Instantiates a new [Node] that will be part of the given graph.
 * @param [g] The graph that the created node will belong to.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YNode%23Node-constructor-Node">Online Documentation</a>
 */
@JsName("YNode")
external open class Node 
protected constructor ( g: Graph ) : GraphObject {

/**
 * Gets the overall number of incoming and outgoing edges at this node.
 * @see [Edge]
 * @see [inDegree]
 * @see [outDegree]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YNode%23degree">Online Documentation</a>
 */
final val degree: Int
/**
 * Yields a dynamic [IEnumerable] for [Edge]s that can be used to iterate over the adjacent edges at this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YNode%23edges">Online Documentation</a>
 */
open val edges: IEnumerable<Edge>
/**
 * Gets the first incoming edge at this node, or `null` if it does not exist.
 * @see [firstOutEdge]
 * @see [lastInEdge]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YNode%23firstInEdge">Online Documentation</a>
 */
final val firstInEdge: Edge?
/**
 * Gets the first outgoing edge at this node, or `null` if it does not exist.
 * @see [firstInEdge]
 * @see [lastOutEdge]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YNode%23firstOutEdge">Online Documentation</a>
 */
final val firstOutEdge: Edge?
/**
 * Gets the graph this node belongs to.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YNode%23graph">Online Documentation</a>
 */
final val graph: Graph?
/**
 * Gets the number of incoming edges at this node.
 * @see [degree]
 * @see [outDegree]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YNode%23inDegree">Online Documentation</a>
 */
final val inDegree: Int
/**
 * Yields a dynamic [IEnumerable] for [Edge]s that can be used to iterate over ingoing edges at this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YNode%23inEdges">Online Documentation</a>
 */
open val inEdges: IEnumerable<Edge>
/**
 * Gets the index of this node within its graph G.
 * ### Preconditions
 * - This node must belong to some graph.
 * @see [Graph.removeNode]
 * @see [Graph.hide]
 * @see [Graph.reInsertNode]
 * @see [Graph.unhide]
 * @see [Graph.moveToFirst]
 * @see [Graph.moveToLast]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YNode%23index">Online Documentation</a>
 */
final val index: Int
/**
 * Gets the last incoming edge at this node, or `null` if it does not exist.
 * @see [firstInEdge]
 * @see [lastOutEdge]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YNode%23lastInEdge">Online Documentation</a>
 */
final val lastInEdge: Edge?
/**
 * Gets the last outgoing edge at this node, or `null` if it does not exist.
 * @see [firstOutEdge]
 * @see [lastInEdge]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YNode%23lastOutEdge">Online Documentation</a>
 */
final val lastOutEdge: Edge?
/**
 * Yields a dynamic [IEnumerable] for [Node]s that can be used to iterate over the opposite sides of adjacent adjacent edges at this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YNode%23neighbors">Online Documentation</a>
 */
open val neighbors: IEnumerable<Node>
/**
 * Gets the number of outgoing edges at this node.
 * @see [degree]
 * @see [inDegree]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YNode%23outDegree">Online Documentation</a>
 */
final val outDegree: Int
/**
 * Yields a dynamic [IEnumerable] for [Edge]s that can be used to iterate over outgoing edges at this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YNode%23outEdges">Online Documentation</a>
 */
final val outEdges: IEnumerable<Edge>
/**
 * Yields a dynamic [IEnumerable] for [Node]s that can be used to iterate over the opposite sides of adjacent incoming edges at this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YNode%23predecessors">Online Documentation</a>
 */
open val predecessors: IEnumerable<Node>
/**
 * Yields a dynamic [IEnumerable] for [Node]s that can be used to iterate over the opposite sides of adjacent outgoing edges at this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YNode%23successors">Online Documentation</a>
 */
open val successors: IEnumerable<Node>
/**
 * Creates a copy of this node that will be inserted into the given graph.
 * @param [g] The graph that the created node will belong to.
 * @return The newly created Node object.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YNode%23Node-method-createCopy">Online Documentation</a>
 */
 open   fun createCopy( g: Graph ):Node
/**
 * Returns an edge that connects this node with the given node, if such an edge exists.
 * @see [getEdgeFrom]
 * @see [getEdgeTo]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YNode%23Node-method-getEdge">Online Documentation</a>
 */
 final   fun getEdge( opposite: Node ):Edge?
/**
 * Returns an edge cursor for all incoming and outgoing edges at this node.
 * @see [getInEdgeCursor]
 * @see [getOutEdgeCursor]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YNode%23Node-method-getEdgeCursor">Online Documentation</a>
 */
 final   fun getEdgeCursor():IEdgeCursor
/**
 * Returns an incoming edge that connects the given node with this node, if such an edge exists.
 * @see [getEdge]
 * @see [getEdgeTo]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YNode%23Node-method-getEdgeFrom">Online Documentation</a>
 */
 final   fun getEdgeFrom( source: Node ):Edge?
/**
 * Returns an outgoing edge that connects this node with the given node, if such an edge exists.
 * @see [getEdge]
 * @see [getEdgeFrom]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YNode%23Node-method-getEdgeTo">Online Documentation</a>
 */
 final   fun getEdgeTo( target: Node ):Edge?
/**
 * Returns an edge cursor for incoming edges at this node.
 * ### Preconditions
 * - `startEdge` is an incoming edge at this node.
 * @param [startEdge] The first edge being accessed by the returned cursor.
 * @see [getOutEdgeCursor]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YNode%23Node-method-getInEdgeCursor">Online Documentation</a>
 */
 final   fun getInEdgeCursor( startEdge: Edge?  = definedExternally):IEdgeCursor
/**
 * Returns a node cursor for all neighbor nodes of this node.
 * @see [getPredecessorCursor]
 * @see [getSuccessorCursor]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YNode%23Node-method-getNeighborCursor">Online Documentation</a>
 */
 final   fun getNeighborCursor():INodeCursor
/**
 * Returns an edge cursor for outgoing edges at this node.
 * ### Preconditions
 * - `startEdge` is an outgoing edge at this node.
 * @param [startEdge] The first edge being accessed by the returned cursor.
 * @see [getInEdgeCursor]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YNode%23Node-method-getOutEdgeCursor">Online Documentation</a>
 */
 final   fun getOutEdgeCursor( startEdge: Edge?  = definedExternally):IEdgeCursor
/**
 * Returns a node cursor for all predecessor nodes of this node.
 * @see [getSuccessorCursor]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YNode%23Node-method-getPredecessorCursor">Online Documentation</a>
 */
 final   fun getPredecessorCursor():INodeCursor
/**
 * Returns a node cursor for all successor nodes of this node.
 * @see [getPredecessorCursor]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YNode%23Node-method-getSuccessorCursor">Online Documentation</a>
 */
 final   fun getSuccessorCursor():INodeCursor
/**
 * Sorts incoming edges at this node according to the given comparator.
 * @see [sortOutEdges]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YNode%23Node-method-sortInEdges">Online Documentation</a>
 */
 final   fun sortInEdges( c: IComparer<in Edge> )
/**
 * Sorts outgoing edges at this node according to the given comparator.
 * @see [sortInEdges]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YNode%23Node-method-sortOutEdges">Online Documentation</a>
 */
 final   fun sortOutEdges( c: IComparer<in Edge> )

companion object : ClassMetadata<Node> {
}
}
