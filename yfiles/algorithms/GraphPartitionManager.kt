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
import yfiles.lang.Id
import yfiles.lang.YObject

/**
 * Provides functionality to hide and unhide partitions of nodes and their adjacent edges of a graph temporarily for algorithmic operations.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphPartitionManager">Online Documentation</a>
 * 
 * @constructor Instantiates a new [GraphPartitionManager] for the given graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphPartitionManager%23GraphPartitionManager-constructor-GraphPartitionManager">Online Documentation</a>
 * 
 * @property graph
 * Gets the `Graph` for which this partition manager was created.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphPartitionManager%23graph">Online Documentation</a>
 */
external open class GraphPartitionManager  (
open val graph: Graph,
 partitionId: IDataProvider<GraphObject, Id> ) : YObject {

/**
 * Assures that only nodes are visible in the graph that are associated with the given partitionId.
 * @param [partitionId] the partitionId for the nodes that will be made visible
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphPartitionManager%23GraphPartitionManager-method-displayPartition">Online Documentation</a>
 */
 open   fun displayPartition( partitionId: Id )
/**
 * Hides the given node and all it's adjacent edges from the graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphPartitionManager%23GraphPartitionManager-method-hide(Node)">Online Documentation</a>
 */
 open   fun hide( v: Node )
/**
 * Hides the given edge from the graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphPartitionManager%23GraphPartitionManager-method-hide(Edge)">Online Documentation</a>
 */
 open   fun hide( e: Edge )
/**
 * Hides the given list of edges from the graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphPartitionManager%23GraphPartitionManager-method-hide(EdgeList)">Online Documentation</a>
 */
 open   fun hide( el: EdgeList )
/**
 * Hides the given list of nodes from the graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphPartitionManager%23GraphPartitionManager-method-hide(NodeList)">Online Documentation</a>
 */
 open   fun hide( nl: NodeList )
/**
 * Hides all nodes and edges from this graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphPartitionManager%23GraphPartitionManager-method-hideAll">Online Documentation</a>
 */
 open   fun hideAll()
/**
 * Hides the given edges from the graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphPartitionManager%23GraphPartitionManager-method-hideEdgeCursor">Online Documentation</a>
 */
 open   fun hideEdgeCursor( ec: IEdgeCursor )
/**
 * Hides all edges from this graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphPartitionManager%23GraphPartitionManager-method-hideEdges">Online Documentation</a>
 */
 open   fun hideEdges()
/**
 * Hides the given elements from the graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphPartitionManager%23GraphPartitionManager-method-hideItemCursor">Online Documentation</a>
 */
 open   fun hideItemCursor( cursor: ICursor<GraphObject> )
/**
 * Hides multiple edges from the graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphPartitionManager%23GraphPartitionManager-method-hideMultipleEdges">Online Documentation</a>
 */
 open   fun hideMultipleEdges()
/**
 * Hides the given nodes from the graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphPartitionManager%23GraphPartitionManager-method-hideNodeCursor">Online Documentation</a>
 */
 open   fun hideNodeCursor( nc: INodeCursor )
/**
 * Hides nodes and adjacent edges that have the given partitionId associated.
 * @param [partitionId] the id
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphPartitionManager%23GraphPartitionManager-method-hidePartition">Online Documentation</a>
 */
 open   fun hidePartition( partitionId: Id )
/**
 * Hides all self-loop edges from this graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphPartitionManager%23GraphPartitionManager-method-hideSelfLoops">Online Documentation</a>
 */
 open   fun hideSelfLoops()
/**
 * Initializes internal data structures using the new DataProvider.
 * @param [partitionId] the data provider that holds the partitionIds for all elements.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphPartitionManager%23GraphPartitionManager-method-initPartitions">Online Documentation</a>
 */
 open   fun initPartitions( partitionId: IDataProvider<GraphObject, Id> )
/**
 * Hides all self-loops and multiple edges from the graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphPartitionManager%23GraphPartitionManager-method-simplifyGraph">Online Documentation</a>
 */
 open   fun simplifyGraph()
/**
 * This method will be called whenever the partition manager is requested to unhide the given edge from the graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphPartitionManager%23GraphPartitionManager-method-unhide(Edge)">Online Documentation</a>
 */
 open protected   fun unhide( e: Edge )
/**
 * This method will be called whenever the partition manager is requested to unhide the given node from the graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphPartitionManager%23GraphPartitionManager-method-unhide(Node)">Online Documentation</a>
 */
 open protected   fun unhide( v: Node )
/**
 * Unhides all formerly hidden elements in the graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphPartitionManager%23GraphPartitionManager-method-unhideAll">Online Documentation</a>
 */
 open   fun unhideAll()
/**
 * Unhides all formerly hidden edges in the graph.
 * ### Preconditions
 * - Both source or target node of all such edges must be contained in the graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphPartitionManager%23GraphPartitionManager-method-unhideEdges">Online Documentation</a>
 */
 open   fun unhideEdges()
/**
 * Unhides all formerly hidden nodes in the graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphPartitionManager%23GraphPartitionManager-method-unhideNodes">Online Documentation</a>
 */
 open   fun unhideNodes()
/**
 * Unhides nodes that have the given partitionId associated.
 * @param [partitionId] the id
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphPartitionManager%23GraphPartitionManager-method-unhidePartition">Online Documentation</a>
 */
 open   fun unhidePartition( partitionId: Id )

companion object : ClassMetadata<GraphPartitionManager> {
}
}
