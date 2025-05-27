// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.algorithms

import js.array.ReadonlyArray
import yfiles.collections.IEnumerable
import yfiles.collections.IEnumerator
import yfiles.lang.ClassMetadata

/**
 * Specialized list implementation for instances of type [Edge].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeList">Online Documentation</a>
 * 
 * @constructor Creates an empty edge list.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeList%23EdgeList-constructor-EdgeList()">Online Documentation</a>
 */
external open class EdgeList  () : YList<Edge>, IEnumerable<Edge> {
/**
 * Creates a list that is initialized with the edges provided by the given array of edges.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeList%23EdgeList-constructor-EdgeList(Edge[])">Online Documentation</a>
 */
 constructor( a: ReadonlyArray<Edge> )
/**
 * Creates a list that is initialized with the edges provided by the given [IEdgeCursor] object.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeList%23EdgeList-constructor-EdgeList(IEdgeCursor)">Online Documentation</a>
 */
 constructor( c: IEdgeCursor )
/**
 * Creates a list that is initialized with a single edge provided.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeList%23EdgeList-constructor-EdgeList(Edge)">Online Documentation</a>
 */
 constructor( e: Edge )
/**
 * Creates a list that is initialized with a given other [EdgeList].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeList%23EdgeList-constructor-EdgeList(EdgeList)">Online Documentation</a>
 */
 constructor( edgeList: EdgeList )
/**
 * Creates a list that is initialized with those edges from the given EdgeCursor object for which the given data provider returns `true` upon calling its [getBool][IDataProvider.getBoolean] method.
 * @param [ec] An edge cursor providing edges that should be added to this list.
 * @param [predicate] A data provider that acts as a inclusion predicate for each edge accessible by the given edge cursor.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeList%23EdgeList-constructor-EdgeList(IEdgeCursor,IDataProvider)">Online Documentation</a>
 */
 constructor( ec: IEdgeCursor ,
 predicate: IDataProvider<Edge, Boolean> )

/**
 * Returns an edge cursor for this edge list.
 * @return An edge cursor granting access to the edges within this list.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeList%23EdgeList-method-edges">Online Documentation</a>
 */
 final   fun edges():IEdgeCursor
/**
 * Returns the first edge in this list, or `null` when the list is empty.
 * @return The first edge in the list.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeList%23EdgeList-method-firstEdge">Online Documentation</a>
 */
 final   fun firstEdge():Edge?
/**
 * Returns an enumerator for this collection.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeList%23EdgeList-method-getEnumerator">Online Documentation</a>
 */
 final override   fun getEnumerator():IEnumerator<Edge>
/**
 * Returns the last edge in this list, or `null` when the list is empty.
 * @return The last edge in the list.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeList%23EdgeList-method-lastEdge">Online Documentation</a>
 */
 final   fun lastEdge():Edge?
/**
 * Removes the first edge from this list and returns it.
 * @return The first edge from the list.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeList%23EdgeList-method-popEdge">Online Documentation</a>
 */
 final   fun popEdge():Edge?
/**
 * Returns an edge array containing all elements of this list in the canonical order.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeList%23EdgeList-method-toEdgeArray">Online Documentation</a>
 */
 final   fun toEdgeArray():ReadonlyArray<Edge>

companion object : ClassMetadata<EdgeList> {
}
}
