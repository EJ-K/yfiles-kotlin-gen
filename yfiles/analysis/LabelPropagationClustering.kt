// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.analysis

import yfiles.algorithms.EdgeDirectedness
import yfiles.graph.IEdge
import yfiles.graph.IGraph
import yfiles.graph.INode
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject
import yfiles.layout.ItemCollection
import yfiles.layout.ItemMapping

/**
 * Detects the communities in the specified input graph by applying a label propagation algorithm.
 * @see [Groups.labelPropagation][yfiles.algorithms.Groups.labelPropagation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelPropagationClustering">Online Documentation</a>
 * 
 * @constructor Creates a new instance of this class.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelPropagationClustering%23LabelPropagationClustering-constructor-LabelPropagationClustering">Online Documentation</a>
 */
external open class LabelPropagationClustering  () : YObject {

/**
 * Gets or sets a mapping that stores the directedness of the edges.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelPropagationClustering%23edgeDirectedness">Online Documentation</a>
 */
final var edgeDirectedness: ItemMapping<IEdge, EdgeDirectedness>
/**
 * Gets or sets a mapping for edge weights.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelPropagationClustering%23edgeWeights">Online Documentation</a>
 */
final var edgeWeights: ItemMapping<IEdge, Double>
/**
 * Gets or sets a mapping that stores the initial integer labels of each node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelPropagationClustering%23initialLabels">Online Documentation</a>
 */
final var initialLabels: ItemMapping<INode, Double>
/**
 * Gets or sets a mapping for node weights.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelPropagationClustering%23nodeWeights">Online Documentation</a>
 */
final var nodeWeights: ItemMapping<INode, Double>
/**
 * Gets or sets the collection of [edges][IEdge] which define a subset of the graph for the algorithms to work on.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelPropagationClustering%23subgraphEdges">Online Documentation</a>
 */
final var subgraphEdges: ItemCollection<IEdge>
/**
 * Gets or sets the collection of [nodes][INode] which define a subset of the graph for the algorithms to work on.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelPropagationClustering%23subgraphNodes">Online Documentation</a>
 */
final var subgraphNodes: ItemCollection<INode>
/**
 * Detects the communities in the specified input graph by applying a label propagation algorithm.
 * @param [graph] The undirected input graph.
 * @return The resulting clusters.
 * @throws InvalidOperationError If the algorithm can't create a valid result due to an invalid graph structure or wrongly configured properties.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelPropagationClustering%23LabelPropagationClustering-method-run">Online Documentation</a>
 */
 final   fun run( graph: IGraph ):LabelPropagationClusteringResult

companion object : ClassMetadata<LabelPropagationClustering> {
}
}

inline fun LabelPropagationClustering(
    block: LabelPropagationClustering.() -> Unit
): LabelPropagationClustering {
    return LabelPropagationClustering()
        .apply(block)
}
