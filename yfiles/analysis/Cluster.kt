// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.analysis

import yfiles.graph.INode
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * Represents a cluster, that is, a group of nodes that by some measure belong closely together.
 * @see [BiconnectedComponentClustering]
 * @see [EdgeBetweennessClustering]
 * @see [HierarchicalClustering]
 * @see [KMeansClustering]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Cluster">Online Documentation</a>
 */
external  class Cluster 
private constructor () : YObject {

/**
 * Gets a collection of all nodes in the cluster.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Cluster%23nodes">Online Documentation</a>
 */
final val nodes: ResultItemCollection<INode>

companion object : ClassMetadata<Cluster> {
}
}
