// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.algorithms.EdgeDpKey
import yfiles.lang.ClassMetadata

/**
 * This [ILayoutStage] offers generic support for [partition grid structures][PartitionGrid].
 * @see [PartitionGrid]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericPartitionGridStage">Online Documentation</a>
 * 
 * @constructor Creates a new instance using the given [core layout algorithm][LayoutStageBase.coreLayout].
 * @param [coreLayout] the core layout algorithm
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericPartitionGridStage%23GenericPartitionGridStage-constructor-GenericPartitionGridStage">Online Documentation</a>
 */
external open class GenericPartitionGridStage  ( coreLayout: ILayoutAlgorithm?  = definedExternally) : LayoutStageBase {

/**
 * Gets or sets whether or not to take node and edge labels into account when calculating the bounding box of the partition cells.
 * 
 * Default value - `true`. Node and edge labels are included in the bounds of the partition cells.
 * @see [splitMultiCellComponents]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericPartitionGridStage%23considerLabels">Online Documentation</a>
 */
open var considerLabels: Boolean
/**
 * Gets or sets the current edge routing algorithm for handling inter-edges.
 * 
 * Default value - `null`. Inter-edges are routed as straight lines.
 * @see [interEdgesDpKey]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericPartitionGridStage%23interEdgeRouter">Online Documentation</a>
 */
open var interEdgeRouter: ILayoutAlgorithm?
/**
 * Gets or sets the key for marking the inter-edges to be routed.
 * 
 * Default value - [LayoutKeys.AFFECTED_EDGES_DP_KEY]
 * @see [interEdgeRouter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericPartitionGridStage%23interEdgesDpKey">Online Documentation</a>
 */
open var interEdgesDpKey: EdgeDpKey<Boolean>
/**
 * Gets or sets whether or not the algorithm should split connected components that have nodes associated with different partition cells.
 * 
 * Default value - `true`. Components with nodes of different partition cells are split.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericPartitionGridStage%23splitMultiCellComponents">Online Documentation</a>
 */
open var splitMultiCellComponents: Boolean
/**
 * Starts the layout.
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericPartitionGridStage%23GenericPartitionGridStage-method-applyLayout">Online Documentation</a>
 */
 override   fun applyLayout( graph: LayoutGraph )

companion object : ClassMetadata<GenericPartitionGridStage> {
/**
 * A data provider key for explicitly marking (some) edges that should not be considered when calculating the sub-components.
 * @see [interEdgeRouter]
 * @see [splitMultiCellComponents]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericPartitionGridStage%23SPLIT_EDGES_DP_KEY">Online Documentation</a>
 */
 val SPLIT_EDGES_DP_KEY: EdgeDpKey<Boolean>
}
}

inline fun GenericPartitionGridStage(
    block: GenericPartitionGridStage.() -> Unit
): GenericPartitionGridStage {
    return GenericPartitionGridStage()
        .apply(block)
}
