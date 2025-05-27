// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.organic

import yfiles.algorithms.EdgeDpKey
import yfiles.algorithms.NodeDpKey
import yfiles.lang.ClassMetadata
import yfiles.layout.ILayoutAlgorithm
import yfiles.layout.ILayoutStage
import yfiles.layout.LayoutGraph

/**
 * This layout stage replaces edges by a path of *split-edges* with a specified length before it calls a [core layout algorithm][coreLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SplitEdgeStage">Online Documentation</a>
 * 
 * @constructor Creates a new [SplitEdgeStage] with default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SplitEdgeStage%23SplitEdgeStage-constructor-SplitEdgeStage">Online Documentation</a>
 */
external open class SplitEdgeStage  () : ILayoutStage {

/**
 * Gets or sets the [IDataProvider][yfiles.algorithms.IDataProvider] key to determine which edges are to be split by this layout stage.
 * 
 * Default value - [LayoutKeys.AFFECTED_EDGES_DP_KEY][yfiles.layout.LayoutKeys.AFFECTED_EDGES_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SplitEdgeStage%23affectedEdgesDpKey">Online Documentation</a>
 */
open var affectedEdgesDpKey: EdgeDpKey<Boolean>
/**
 * Gets or sets the core layout algorithm.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SplitEdgeStage%23coreLayout">Online Documentation</a>
 */
override var coreLayout: ILayoutAlgorithm?
/**
 * Gets or sets the size of the split-nodes that are inserted when splitting edges.
 * 
 * Default value - `1.0`
 * @throws ArgumentError if the given size is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SplitEdgeStage%23splitNodeSize">Online Documentation</a>
 */
open var splitNodeSize: Double
/**
 * Gets or sets the [IDataProvider][yfiles.algorithms.IDataProvider] key for marking the nodes that were created by splitting edges, i.e., the split-nodes.
 * 
 * Default value - [LayoutKeys.AFFECTED_NODES_DP_KEY][yfiles.layout.LayoutKeys.AFFECTED_NODES_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SplitEdgeStage%23splitNodesDpKey">Online Documentation</a>
 */
open var splitNodesDpKey: NodeDpKey<Boolean>
/**
 * Gets or sets the maximum length for a *split-edge*.
 * 
 * Default value - `100`
 * @throws ArgumentError if the given split segment length is smaller than or equal to zero
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SplitEdgeStage%23splitSegmentLength">Online Documentation</a>
 */
open var splitSegmentLength: Double
/**
 * Replaces the edges of the given graph by a path of split-edges, executes the [core layout algorithm][coreLayout] and restores the original edges, introducing bends at the locations of the split-nodes.
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SplitEdgeStage%23SplitEdgeStage-method-applyLayout">Online Documentation</a>
 */
 override   fun applyLayout( graph: LayoutGraph )

companion object : ClassMetadata<SplitEdgeStage> {
}
}

inline fun SplitEdgeStage(
    block: SplitEdgeStage.() -> Unit
): SplitEdgeStage {
    return SplitEdgeStage()
        .apply(block)
}
