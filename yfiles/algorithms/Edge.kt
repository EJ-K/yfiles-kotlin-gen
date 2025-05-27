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

/**
 * Represents an edge, i.e., a directed connection between two nodes (represented by instances of class [Node]) in the directed graph data type [Graph].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Edge">Online Documentation</a>
 * 
 * @constructor Creates a new edge that belongs to the given graph.
 * ### Preconditions
 * - Edge `e1` must have source node `v` and edge `e2` must have target node `w`.
 * @param [v] The source node of the edge.
 * @param [e1] An edge with source node `v`.
 * @param [w] The target node of the edge.
 * @param [e2] An edge with target node `w`.
 * @param [d1] One of the object insertion specifiers [GraphElementInsertion.BEFORE] or [GraphElementInsertion.AFTER].
 * @param [d2] One of the object insertion specifiers [GraphElementInsertion.BEFORE] or [GraphElementInsertion.AFTER].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Edge%23Edge-constructor-Edge">Online Documentation</a>
 */
external open class Edge 
protected constructor ( g: Graph ,
 v: Node ,
 e1: Edge? ,
 w: Node ,
 e2: Edge? ,
 d1: GraphElementInsertion ,
 d2: GraphElementInsertion ) : GraphObject {

/**
 * Gets the graph this edge belongs to.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Edge%23graph">Online Documentation</a>
 */
final val graph: Graph?
/**
 * Gets the index of this edge within its graph G.
 * ### Preconditions
 * - This edge must belong to some graph.
 * @see [Graph.removeEdge]
 * @see [Graph.hide]
 * @see [Graph.reInsertEdge]
 * @see [Graph.unhide]
 * @see [Graph.moveToFirst]
 * @see [Graph.moveToLast]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Edge%23index">Online Documentation</a>
 */
final val index: Int
/**
 * Gets the successor of this edge in the list of incoming edges at its target node.
 * 
 * If this edge is the last incoming edge at its target node, then `null` is returned.
 * ### Preconditions
 * - This edge must belong to some graph.
 * @see [prevInEdge]
 * @see [nextOutEdge]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Edge%23nextInEdge">Online Documentation</a>
 */
final val nextInEdge: Edge?
/**
 * Gets the successor of this edge in the list of outgoing edges at its source node.
 * 
 * If this edge is the last outgoing edge at its source node, then `null` is returned.
 * ### Preconditions
 * - This edge must belong to some graph.
 * @see [prevOutEdge]
 * @see [nextInEdge]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Edge%23nextOutEdge">Online Documentation</a>
 */
final val nextOutEdge: Edge?
/**
 * Gets the predecessor of this edge in the list of incoming edges at its target node.
 * 
 * If this edge is the first incoming edge at its target node, then `null` is returned.
 * ### Preconditions
 * - This edge must belong to some graph.
 * @see [nextInEdge]
 * @see [prevOutEdge]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Edge%23prevInEdge">Online Documentation</a>
 */
final val prevInEdge: Edge?
/**
 * Gets the predecessor of this edge in the list of outgoing edges at its source node.
 * 
 * If this edge is the first outgoing edge at its source node, then `null` is returned.
 * ### Preconditions
 * - This edge must belong to some graph.
 * @see [nextOutEdge]
 * @see [prevInEdge]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Edge%23prevOutEdge">Online Documentation</a>
 */
final val prevOutEdge: Edge?
/**
 * Gets `true` if and only if this edge is a self-loop.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Edge%23selfLoop">Online Documentation</a>
 */
final val selfLoop: Boolean
/**
 * Gets the source node connected to this edge.
 * @see [target]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Edge%23source">Online Documentation</a>
 */
final val source: Node
/**
 * Gets the target node connected to this edge.
 * @see [source]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Edge%23target">Online Documentation</a>
 */
final val target: Node
/**
 * Creates a copy of this edge that will be inserted into the given graph connecting the given source and target nodes.
 * @param [g] The graph the created edge will belong to.
 * @param [v] The source node of the created edge.
 * @param [w] The target node of the created edge.
 * @return The newly created Edge object.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Edge%23Edge-method-createCopy">Online Documentation</a>
 */
 open   fun createCopy( g: Graph ,
 v: Node ,
 w: Node ):Edge
/**
 * Callback method that is invoked from a graph just before this edge will be reinserted into that graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Edge%23Edge-method-onReinsert">Online Documentation</a>
 */
 open protected   fun onReinsert()
/**
 * Returns the node at the opposite edge end with respect to the given node.
 * ### Preconditions
 * - The given node must be either the edge's source node or target node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Edge%23Edge-method-opposite">Online Documentation</a>
 */
 final   fun opposite( v: Node ):Node

companion object : ClassMetadata<Edge> {
}
}
