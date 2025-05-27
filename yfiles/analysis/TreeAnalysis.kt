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
import yfiles.layout.ItemCollection
import yfiles.layout.SingleItem

/**
 * Analyzes a tree graph and calculates important properties of the tree structure.
 * @see [Trees][yfiles.algorithms.Trees]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeAnalysis">Online Documentation</a>
 * 
 * @constructor Creates a new instance of this class.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeAnalysis%23TreeAnalysis-constructor-TreeAnalysis">Online Documentation</a>
 */
external  class TreeAnalysis  () : YObject {

/**
 * Gets or sets the node that will be used as root of the directed rooted tree.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeAnalysis%23customRootNode">Online Documentation</a>
 */
final var customRootNode: SingleItem<INode>
/**
 * Gets or sets the collection of [edges][IEdge] which define a subset of the graph for the algorithms to work on.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeAnalysis%23subgraphEdges">Online Documentation</a>
 */
final var subgraphEdges: ItemCollection<IEdge>
/**
 * Gets or sets the collection of [nodes][INode] which define a subset of the graph for the algorithms to work on.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeAnalysis%23subgraphNodes">Online Documentation</a>
 */
final var subgraphNodes: ItemCollection<INode>
/**
 * Analyzes a tree graph and calculates relevant properties of the tree structure.
 * @param [graph] The input tree graph to run the algorithm on.
 * @return A [TreeAnalysisResult] allowing to query tree properties like the parent of a node or the tree root.
 * @throws InvalidOperationError If the graph is not a tree or due to wrongly configured properties.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeAnalysis%23TreeAnalysis-method-run">Online Documentation</a>
 */
 final   fun run( graph: IGraph ):TreeAnalysisResult

companion object : ClassMetadata<TreeAnalysis> {
}
}

inline fun TreeAnalysis(
    block: TreeAnalysis.() -> Unit
): TreeAnalysis {
    return TreeAnalysis()
        .apply(block)
}
