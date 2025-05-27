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

/**
 * A [IPartitionPlacer] is responsible for arranging the graph partitions.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPartitionPlacer">Online Documentation</a>
 */
external interface IPartitionPlacer : YObject {
/**
 * Arranges the graph while taking partition IDs and inter-edge information into account.
 * @param [graph] the input graph
 * @param [partitionIDDP] the partition ID for each node in the graph
 * @param [interEdgeDP] the map which marks inter-edges
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPartitionPlacer%23IPartitionPlacer-method-placePartitions">Online Documentation</a>
 */
   fun placePartitions( graph: LayoutGraph ,
 partitionIDDP: IDataProvider<Node, Id> ,
 interEdgeDP: IDataProvider<Edge, Boolean> )

companion object : InterfaceMetadata<IPartitionPlacer> {
}
}
