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
import yfiles.lang.YObject
import yfiles.layout.INodeType
import yfiles.layout.ItemCollection
import yfiles.layout.ItemMapping

/**
 * Detects [SubstructureItems]s that represent the (undirected) cliques in the specified graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CliqueSubstructures">Online Documentation</a>
 * 
 * @constructor Creates a new instance of this class.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CliqueSubstructures%23CliqueSubstructures-constructor-CliqueSubstructures">Online Documentation</a>
 */
external open class CliqueSubstructures  () : YObject {

/**
 * Gets or sets the minimum size of a clique.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CliqueSubstructures%23minimumSize">Online Documentation</a>
 */
final var minimumSize: Double
/**
 * Gets or sets a mapping which maps the type of each node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CliqueSubstructures%23nodeTypes">Online Documentation</a>
 */
final var nodeTypes: ItemMapping<INode, INodeType>
/**
 * Gets or sets the collection of [edges][IEdge] which define a subset of the graph for the algorithms to work on.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CliqueSubstructures%23subgraphEdges">Online Documentation</a>
 */
final var subgraphEdges: ItemCollection<IEdge>
/**
 * Gets or sets the collection of [nodes][INode] which define a subset of the graph for the algorithms to work on.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CliqueSubstructures%23subgraphNodes">Online Documentation</a>
 */
final var subgraphNodes: ItemCollection<INode>
/**
 * Returns a list of [SubstructureItems]s that represent the (undirected) cliques in the specified graph.
 * @param [graph] The graph to find the substructures in.
 * @return A list of [SubstructureItems]s that represent the cliques.
 * @throws InvalidOperationError If the algorithm can't create a valid result due to an invalid graph structure or wrongly configured properties.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CliqueSubstructures%23CliqueSubstructures-method-run">Online Documentation</a>
 */
 final   fun run( graph: IGraph ):CliqueSubstructuresResult

companion object : ClassMetadata<CliqueSubstructures> {
}
}

inline fun CliqueSubstructures(
    block: CliqueSubstructures.() -> Unit
): CliqueSubstructures {
    return CliqueSubstructures()
        .apply(block)
}
