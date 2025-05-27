// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.tree

import yfiles.algorithms.EdgeDpKey
import yfiles.algorithms.IEdgeMap
import yfiles.algorithms.ILabelLayoutDpKey
import yfiles.lang.ClassMetadata
import yfiles.layout.EdgeBundling
import yfiles.layout.ILayoutAlgorithm
import yfiles.layout.LayoutGraph
import yfiles.layout.LayoutStageBase

/**
 * The [TreeReductionStage] temporarily reduces general graphs to trees.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeReductionStage">Online Documentation</a>
 * 
 * @constructor Creates a new [TreeReductionStage] instance with the given core layout algorithm and default settings.
 * @param [coreLayout] the core layout algorithm
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeReductionStage%23TreeReductionStage-constructor-TreeReductionStage">Online Documentation</a>
 */
external open class TreeReductionStage  ( coreLayout: ILayoutAlgorithm?  = definedExternally) : LayoutStageBase {

/**
 * Gets the [EdgeBundling] instance that defines the settings of the edge bundling feature.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeReductionStage%23edgeBundling">Online Documentation</a>
 */
open val edgeBundling: EdgeBundling
/**
 * Gets or sets whether or not multi-parent structures (structures of multiple nodes that share the same predecessors as well as the same successors) are allowed.
 * 
 * Default value - `false`. The reduced graph is a normal tree.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeReductionStage%23multiParentAllowed">Online Documentation</a>
 */
open var multiParentAllowed: Boolean
/**
 * Gets or sets the key to register a [IDataProvider][yfiles.algorithms.IDataProvider] that is used by the [non-tree edge labeling algorithm][nonTreeEdgeLabelingAlgorithm] to determine which edge labels it should place.
 * 
 * Default value - `null`. There is no [IDataProvider][yfiles.algorithms.IDataProvider] key specified.
 * @see [nonTreeEdgeLabelingAlgorithm]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeReductionStage%23nonTreeEdgeLabelSelectionKey">Online Documentation</a>
 */
open var nonTreeEdgeLabelSelectionKey: ILabelLayoutDpKey<Boolean>?
/**
 * Gets or sets the labeling algorithm that is applied to all edge labels that belong to non-tree edges.
 * 
 * Default value - `null`. Edge labels of non-tree edges are not placed.
 * @see [nonTreeEdgeLabelSelectionKey]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeReductionStage%23nonTreeEdgeLabelingAlgorithm">Online Documentation</a>
 */
open var nonTreeEdgeLabelingAlgorithm: ILayoutAlgorithm?
/**
 * Gets or sets the edge routing algorithm that is applied to all non-tree edges.
 * 
 * Default value - `null`. Non-tree edges are not routed.
 * @see [nonTreeEdgeSelectionKey]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeReductionStage%23nonTreeEdgeRouter">Online Documentation</a>
 */
open var nonTreeEdgeRouter: ILayoutAlgorithm?
/**
 * Gets or sets the key to register a [IDataProvider][yfiles.algorithms.IDataProvider] that will be used by the [non-tree edge routing algorithm][nonTreeEdgeRouter] to determine the edges that need to be routed.
 * 
 * Default value - `null`. There is no [IDataProvider][yfiles.algorithms.IDataProvider] key specified.
 * @see [nonTreeEdgeRouter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeReductionStage%23nonTreeEdgeSelectionKey">Online Documentation</a>
 */
open var nonTreeEdgeSelectionKey: EdgeDpKey<Boolean>?
/**
 * Determines a spanning tree of the graph and passes it to the [core layout algorithm][LayoutStageBase.coreLayout].
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeReductionStage%23TreeReductionStage-method-applyLayout">Online Documentation</a>
 */
 override   fun applyLayout( graph: LayoutGraph )
/**
 * Creates a routing algorithm that routes edges as a single straight segment.
 * @return an edge routing algorithm that produces straight-line edges
 * @see [nonTreeEdgeRouter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeReductionStage%23TreeReductionStage-method-createStraightLineRouter">Online Documentation</a>
 */
 open   fun createStraightLineRouter():ILayoutAlgorithm
/**
 * Routes all edges that do not belong to the chosen spanning tree.
 * @param [graph] the graph containing tree and non-tree edges
 * @param [nonTreeEdgeMap] the [IEdgeMap] that marks all non-tree edges in the graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeReductionStage%23TreeReductionStage-method-routeNonTreeEdges">Online Documentation</a>
 */
 open protected   fun routeNonTreeEdges( graph: LayoutGraph ,
 nonTreeEdgeMap: IEdgeMap<Boolean> )

companion object : ClassMetadata<TreeReductionStage> {
/**
 * A data provider key for explicitly marking (some) edges that should not be considered for the tree.
 * @see [nonTreeEdgeRouter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeReductionStage%23NON_TREE_EDGES_DP_KEY">Online Documentation</a>
 */
 val NON_TREE_EDGES_DP_KEY: EdgeDpKey<Boolean>
}
}

inline fun TreeReductionStage(
    block: TreeReductionStage.() -> Unit
): TreeReductionStage {
    return TreeReductionStage()
        .apply(block)
}
