// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.algorithms.Edge
import yfiles.algorithms.EdgeList
import yfiles.algorithms.Graph
import yfiles.algorithms.INodeMap
import yfiles.algorithms.Node
import yfiles.algorithms.NodeList
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * This class provides convenient and efficient access to the hierarchic graph structure.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGroupingSupport">Online Documentation</a>
 * 
 * @constructor Creates a new [GroupingSupport] instance that represents the hierarchy of the graph.
 * @param [graph] the graph instance from which the hierarchy information is obtained
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGroupingSupport%23GroupingSupport-constructor-GroupingSupport">Online Documentation</a>
 */
@JsName("LayoutGroupingSupport")
external open class GroupingSupport  ( graph: Graph ) : YObject {

/**
 * Gets the [Graph] instance for which this [GroupingSupport] object provides hierarchy information.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGroupingSupport%23graph">Online Documentation</a>
 */
open val graph: Graph?
/**
 * Gets a [Node] instance associated with the virtual root of the hierarchy tree.
 * @see [getChildren]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGroupingSupport%23root">Online Documentation</a>
 */
open val root: Node?
/**
 * Creates a [INodeMap] to store hierarchy information for each node.
 * @param [graph] the current graph
 * @return the new instance of [INodeMap]
 * @see [init]
 * @see [disposeInfoMap]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGroupingSupport%23GroupingSupport-method-createInfoMap">Online Documentation</a>
 */
 open protected   fun createInfoMap( graph: Graph ):INodeMap<*>
/**
 * Disposes of all internal data structures held by this [instance][GroupingSupport].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGroupingSupport%23GroupingSupport-method-dispose">Online Documentation</a>
 */
 open   fun dispose()
/**
 * Disposes of the [INodeMap] created to store hierarchy information for each node.
 * @param [graph] the current graph
 * @param [infoMap] the [INodeMap] which contains the hierarchy information for each node
 * @see [dispose]
 * @see [createInfoMap]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGroupingSupport%23GroupingSupport-method-disposeInfoMap">Online Documentation</a>
 */
 open protected   fun disposeInfoMap( graph: Graph ,
 infoMap: INodeMap<Any> )
/**
 * Returns the direct children of the given group node.
 * @param [parent] the group node
 * @return a set of child nodes of the given parent node
 * @see [root]
 * @see [getParent]
 * @see [getDescendants]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGroupingSupport%23GroupingSupport-method-getChildren">Online Documentation</a>
 */
 open   fun getChildren( parent: Node ):NodeList?
/**
 * Returns all descendants of the given group node.
 * @param [parent] the group node
 * @return a set of nodes that belong to a subtree of the hierarchy tree rooted at the given parent
 * @see [root]
 * @see [getParent]
 * @see [getChildren]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGroupingSupport%23GroupingSupport-method-getDescendants">Online Documentation</a>
 */
 open   fun getDescendants( parent: Node ):NodeList
/**
 * Returns all edges crossing the bounds of the given group node such that their targets are inside the group node while their sources lie outside the group node.
 * @param [group] the group node whose bounds are crossed
 * @return a set of edges that cross the bounds of the group node starting outside the group node
 * @see [getEdgesGoingOut]
 * @see [isNormalEdge]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGroupingSupport%23GroupingSupport-method-getEdgesGoingIn">Online Documentation</a>
 */
 open   fun getEdgesGoingIn( group: Node ):EdgeList?
/**
 * Returns all edges crossing the bounds of the given group node such that their sources are inside the group node while their targets lie outside the group node.
 * @param [group] the group node whose bounds are crossed
 * @return a set of edges that cross the bounds of the group node starting inside the group node
 * @see [getEdgesGoingIn]
 * @see [isNormalEdge]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGroupingSupport%23GroupingSupport-method-getEdgesGoingOut">Online Documentation</a>
 */
 open   fun getEdgesGoingOut( group: Node ):EdgeList?
/**
 * Returns the nearest common ancestor of the given nodes in the hierarchy structure.
 * @param [node1] one of the two nodes whose common ancestor is determined
 * @param [node2] one of the two nodes whose common ancestor is determined
 * @return the nearest common ancestor node or [root]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGroupingSupport%23GroupingSupport-method-getNearestCommonAncestor">Online Documentation</a>
 */
 open   fun getNearestCommonAncestor( node1: Node ,
 node2: Node ):Node?
/**
 * Returns the parent for the given node.
 * @param [node] the node for which the parent is determined
 * @return the parent of the given node or `null` for a top-level node
 * @throws ArgumentError if the given node is `null`
 * @see [getChildren]
 * @see [getDescendants]
 * @see [getNearestCommonAncestor]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGroupingSupport%23GroupingSupport-method-getParent">Online Documentation</a>
 */
 open   fun getParent( node: Node ):Node?
/**
 * Returns an immediate child of the group node that represents the given node.
 * @param [node] the node for which a representative is searched
 * @param [group] the group node to which the representative should belong
 * @return the representative or `null` if the node is not a descendant of the group
 * @throws ArgumentError if the given node is `null`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGroupingSupport%23GroupingSupport-method-getRepresentative">Online Documentation</a>
 */
 open   fun getRepresentative( node: Node ,
 group: Node ):Node?
/**
 * Determines whether or not the given node is a group node with children.
 * @param [node] the potential parent
 * @return `true` if the given node has children, `false` otherwise
 * @see [getChildren]
 * @see [isGroupNode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGroupingSupport%23GroupingSupport-method-hasChildren">Online Documentation</a>
 */
 open   fun hasChildren( node: Node ):Boolean
/**
 * Initializes internal data structures.
 * @see [dispose]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGroupingSupport%23GroupingSupport-method-init">Online Documentation</a>
 */
 open protected   fun init()
/**
 * Determines whether or not the given node is a group node.
 * @param [node] the potential group node
 * @return `true` if the given node is a group node or is `null`, `false` otherwise
 * @see [hasChildren]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGroupingSupport%23GroupingSupport-method-isGroupNode">Online Documentation</a>
 */
 open   fun isGroupNode( node: Node ):Boolean
/**
 * Determines whether or not the given edge is a normal edge as opposed to an edge that crosses any group node bounds.
 * @param [edge] the edge to check
 * @return `true` if the given edge is normal, `false` otherwise
 * @see [getEdgesGoingIn]
 * @see [getEdgesGoingOut]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGroupingSupport%23GroupingSupport-method-isNormalEdge">Online Documentation</a>
 */
 open   fun isNormalEdge( edge: Edge ):Boolean

companion object : ClassMetadata<GroupingSupport> {
/**
 * Returns whether or not the given graph is flat.
 * @receiver the input graph
 * @return `true` if there are no groups or only empty groups in the graph, `false` otherwise
 * @see [isGrouped]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGroupingSupport%23GroupingSupport-method-isFlat">Online Documentation</a>
 */
 final   fun Graph.isFlat():Boolean
/**
 * Returns whether or not the given graph is grouped.
 * @receiver the input graph
 * @return `true` if the graph contains hierarchic information, `false` otherwise
 * @see [isFlat]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGroupingSupport%23GroupingSupport-method-isGrouped">Online Documentation</a>
 */
 final   fun Graph.isGrouped():Boolean
}
}
