// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.algorithms.INodeMap
import yfiles.lang.Id
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * A [IPartitionFinder] is responsible for partitioning the input graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPartitionFinder">Online Documentation</a>
 */
external interface IPartitionFinder : YObject {
/**
 * Returns a partition ID for each node of an input graph.
 * @param [graph] the input graph
 * @param [partitionIDMap] the map that is filled with the resulting partition IDs
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPartitionFinder%23IPartitionFinder-method-findPartitions">Online Documentation</a>
 */
   fun findPartitions( graph: LayoutGraph ,
 partitionIDMap: INodeMap<Id> )

companion object : InterfaceMetadata<IPartitionFinder> {
}
}
