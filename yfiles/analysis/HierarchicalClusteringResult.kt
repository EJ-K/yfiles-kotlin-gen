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
 * Represents clusters in the graph and the dendrogram as computed by [HierarchicalClustering].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicalClusteringResult">Online Documentation</a>
 */
external  class HierarchicalClusteringResult 
private constructor () : YObject {

/**
 * Gets a collection of all clusters in the graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicalClusteringResult%23clusters">Online Documentation</a>
 */
final val clusters: ResultItemCollection<Cluster>
/**
 * Gets the root of the dendrogram which is used internally to generate the [clusters].
 * @see [getDendrogramNode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicalClusteringResult%23dendrogramRoot">Online Documentation</a>
 */
final val dendrogramRoot: DendrogramNode?
/**
 * Gets a mapping from each node to its cluster ID.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicalClusteringResult%23nodeClusterIds">Online Documentation</a>
 */
final val nodeClusterIds: ResultItemMapping<INode, Int>
/**
 * Gets a mapping from each node to its cluster.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicalClusteringResult%23nodeClusters">Online Documentation</a>
 */
final val nodeClusters: ResultItemMapping<INode, Cluster>
/**
 * Creates a new [HierarchicalClusteringResult] with the given numbers of clusters.
 * @param [clusterCount] The cluster count. Must be positive; if it's greater than the number of nodes in the graph, the number of clusters in the result is equal to the number of nodes.
 * @return A new [HierarchicalClusteringResult] with the same [dendrogramRoot] and [clusters] calculated based on that dendrogram and the `clusterCount`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicalClusteringResult%23HierarchicalClusteringResult-method-changeClusterCount">Online Documentation</a>
 */
 final   fun changeClusterCount( clusterCount: Int ):HierarchicalClusteringResult
/**
 * Creates a new [HierarchicalClusteringResult] with clusters based on the given cutoff value.
 * @param [cutoff] The cutoff value for the clusters' dissimilarity.
 * @return A new [HierarchicalClusteringResult] with the same [dendrogramRoot] and [clusters] calculated based on that dendrogram and `cutoff`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicalClusteringResult%23HierarchicalClusteringResult-method-changeCutoff">Online Documentation</a>
 */
 final   fun changeCutoff( cutoff: Double ):HierarchicalClusteringResult
/**
 * Gets the representative of `node` in the dendrogram.
 * @see [dendrogramRoot]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicalClusteringResult%23HierarchicalClusteringResult-method-getDendrogramNode">Online Documentation</a>
 */
 final   fun getDendrogramNode( node: INode ):DendrogramNode

companion object : ClassMetadata<HierarchicalClusteringResult> {
}
}
