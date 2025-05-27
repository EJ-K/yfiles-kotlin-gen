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
import yfiles.algorithms.IDataProvider
import yfiles.algorithms.Node
import yfiles.lang.Id
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject
import yfiles.router.ChannelEdgeRouter
import yfiles.router.EdgeRouter

/**
 * An [IPartitionInterEdgeRouter] is responsible for routing inter-edges.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPartitionInterEdgeRouter">Online Documentation</a>
 */
external interface IPartitionInterEdgeRouter : YObject {
/**
 * Gets or sets whether or not to route inter-edges only.
 * 
 * Default value - `false`. All edges are routed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPartitionInterEdgeRouter%23routeInterEdgesOnly">Online Documentation</a>
 */
var routeInterEdgesOnly: Boolean
/**
 * Routes inter-edges of the partitioned graph.
 * @param [graph] the input graph
 * @param [partitionIDDP] the partition ID for each node in the graph
 * @param [interEdgeDP] the map that marks inter-edges
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPartitionInterEdgeRouter%23IPartitionInterEdgeRouter-method-routeInterEdges">Online Documentation</a>
 */
   fun routeInterEdges( graph: LayoutGraph ,
 partitionIDDP: IDataProvider<Node, Id> ,
 interEdgeDP: IDataProvider<Edge, Boolean> )

companion object : InterfaceMetadata<IPartitionInterEdgeRouter> {
/**
 * Routes inter-edges using [ChannelEdgeRouter].
 * @param [router] The router instance to use for the edge routing. If not specified, a internal instance is used.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPartitionInterEdgeRouter%23IPartitionInterEdgeRouter-defaultmethod-createChannelInterEdgeRouter">Online Documentation</a>
 */
   fun createChannelInterEdgeRouter( router: ChannelEdgeRouter  = definedExternally):IPartitionInterEdgeRouter
/**
 * Routes inter-edges using [EdgeRouter].
 * @param [router] The router instance to use for the edge routing. If not specified, an internal instance is used.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPartitionInterEdgeRouter%23IPartitionInterEdgeRouter-defaultmethod-createPolylineInterEdgeRouter">Online Documentation</a>
 */
   fun createPolylineInterEdgeRouter( router: EdgeRouter  = definedExternally):IPartitionInterEdgeRouter
}
}
