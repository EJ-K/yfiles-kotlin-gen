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
 * Specialized list implementation for instances of type [Node].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YNodeList">Online Documentation</a>
 * 
 * @constructor Creates an empty node list.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YNodeList%23NodeList-constructor-NodeList()">Online Documentation</a>
 */
@JsName("YNodeList")
external open class NodeList  () : YList<Node>, IEnumerable<Node> {
/**
 * Creates a list that is initialized with the nodes provided by the given NodeCursor object.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YNodeList%23NodeList-constructor-NodeList(INodeCursor)">Online Documentation</a>
 */
 constructor( c: INodeCursor )
/**
 * Creates a list that is initialized with the nodes provided by the given array of nodes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YNodeList%23NodeList-constructor-NodeList(Node[])">Online Documentation</a>
 */
 constructor( a: ReadonlyArray<Node> )
/**
 * Creates a list that is initialized with a single node provided.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YNodeList%23NodeList-constructor-NodeList(Node)">Online Documentation</a>
 */
 constructor( v: Node )
/**
 * Creates a list that is initialized with the entries of the given list.
 * @param [list] the values are added to the new list
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YNodeList%23NodeList-constructor-NodeList(NodeList)">Online Documentation</a>
 */
 constructor( list: NodeList )
/**
 * Creates a list that is initialized with those nodes from the given NodeCursor object for which the given data provider returns `true` upon calling its [getBool][IDataProvider.getBoolean] method.
 * @param [nc] A node cursor providing nodes that should be added to this list.
 * @param [predicate] A data provider that acts as a inclusion predicate for each node accessible by the given node cursor.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YNodeList%23NodeList-constructor-NodeList(INodeCursor,IDataProvider)">Online Documentation</a>
 */
 constructor( nc: INodeCursor ,
 predicate: IDataProvider<Node, Boolean> )

/**
 * Returns the first node in this list, or `null` when the list is empty.
 * @return The first node in the list.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YNodeList%23NodeList-method-firstNode">Online Documentation</a>
 */
 final   fun firstNode():Node?
/**
 * Returns an enumerator for this collection.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YNodeList%23NodeList-method-getEnumerator">Online Documentation</a>
 */
 final override   fun getEnumerator():IEnumerator<Node>
/**
 * Returns the last node in this list, or `null` when the list is empty.
 * @return The last node in the list.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YNodeList%23NodeList-method-lastNode">Online Documentation</a>
 */
 final   fun lastNode():Node?
/**
 * Returns a node cursor for this node list.
 * @return A node cursor granting access to the nodes within this list.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YNodeList%23NodeList-method-nodes">Online Documentation</a>
 */
 final   fun nodes():INodeCursor
/**
 * Removes the first node from this list and returns it.
 * @return The first node from the list.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YNodeList%23NodeList-method-popNode">Online Documentation</a>
 */
 final   fun popNode():Node?
/**
 * Returns a node array containing all elements of this list in the canonical order.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YNodeList%23NodeList-method-toNodeArray">Online Documentation</a>
 */
 final   fun toNodeArray():ReadonlyArray<Node>

companion object : ClassMetadata<NodeList> {
}
}
