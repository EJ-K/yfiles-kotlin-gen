// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.analysis

import yfiles.graph.IEdge
import yfiles.graph.IGraph
import yfiles.graph.INode
import yfiles.lang.ClassMetadata
import yfiles.lang.Func3
import yfiles.lang.YObject
import yfiles.layout.ItemCollection

/**
 * Partitions the graph into clusters using hierarchical clustering.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicalClustering">Online Documentation</a>
 * 
 * @constructor Creates a new [HierarchicalClustering] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicalClustering%23HierarchicalClustering-constructor-HierarchicalClustering">Online Documentation</a>
 */
external open class HierarchicalClustering  () : YObject {

/**
 * Gets or sets the number of clusters.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicalClustering%23clusterCount">Online Documentation</a>
 */
final var clusterCount: Int
/**
 * Gets or sets the cut-off value.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicalClustering%23cutoff">Online Documentation</a>
 */
final var cutoff: Double
/**
 * Gets or sets the method how the distance between clusters is determined.
 * 
 * The default is [LinkageMethod.SINGLE].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicalClustering%23linkage">Online Documentation</a>
 */
final var linkage: LinkageMethod
/**
 * Gets or sets a function which returns the distance between any two nodes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicalClustering%23metric">Online Documentation</a>
 */
final var metric: Func3<INode, INode, Double>
/**
 * Gets or sets the collection of [edges][IEdge] which define a subset of the graph for the algorithms to work on.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicalClustering%23subgraphEdges">Online Documentation</a>
 */
final var subgraphEdges: ItemCollection<IEdge>
/**
 * Gets or sets the collection of [nodes][INode] which define a subset of the graph for the algorithms to work on.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicalClustering%23subgraphNodes">Online Documentation</a>
 */
final var subgraphNodes: ItemCollection<INode>
/**
 * Partitions the graph into clusters using hierarchical clustering.
 * @param [graph] The input graph to run the algorithm on.
 * @return A [HierarchicalClusteringResult] containing the computed clusters and [dendrogram][HierarchicalClusteringResult.dendrogramRoot].
 * @throws InvalidOperationError If the algorithm can't create a valid result due to an invalid graph structure or wrongly configured properties.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicalClustering%23HierarchicalClustering-method-run">Online Documentation</a>
 */
 final   fun run( graph: IGraph ):HierarchicalClusteringResult

companion object : ClassMetadata<HierarchicalClustering> {
/**
 * A predefined [metric] for Euclidean distance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicalClustering%23EUCLIDEAN">Online Documentation</a>
 */
 val EUCLIDEAN: Func3<INode, INode, Double>
/**
 * A predefined [metric] for squared Euclidean distance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicalClustering%23EUCLIDEAN_SQUARED">Online Documentation</a>
 */
 val EUCLIDEAN_SQUARED: Func3<INode, INode, Double>
/**
 * A predefined [metric] for Manhattan distance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicalClustering%23MANHATTAN">Online Documentation</a>
 */
 val MANHATTAN: Func3<INode, INode, Double>
}
}

inline fun HierarchicalClustering(
    block: HierarchicalClustering.() -> Unit
): HierarchicalClustering {
    return HierarchicalClustering()
        .apply(block)
}
