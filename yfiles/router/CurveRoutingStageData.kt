// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.router

import yfiles.algorithms.AbortHandler
import yfiles.graph.IEdge
import yfiles.graph.ILabel
import yfiles.graph.INode
import yfiles.lang.ClassMetadata
import yfiles.lang.Id
import yfiles.layout.DpKeyItemCollection
import yfiles.layout.ItemMapping
import yfiles.layout.LayoutData
import yfiles.layout.NodeHalo
import yfiles.layout.PartitionGridData
import yfiles.layout.PreferredPlacementDescriptor

/**
 * Specifies the layout data for the [CurveRoutingStage].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CurveRoutingStageData">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [CurveRoutingStageData] which helps configuring the [CurveRoutingStage].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CurveRoutingStageData%23CurveRoutingStageData-constructor-CurveRoutingStageData">Online Documentation</a>
 */
external open class CurveRoutingStageData  () : LayoutData {

/**
 * Gets or sets the [AbortHandler] used during the layout.
 * @see [LayoutExecutor.abortHandler][yfiles.layout.LayoutExecutor.abortHandler]
 * @see [AbortHandler.ABORT_HANDLER_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CurveRoutingStageData%23abortHandler">Online Documentation</a>
 */
final var abortHandler: AbortHandler?
/**
 * Gets or sets the collection of affected edges whose paths will be replaced by curved paths.
 * @see [CurveRoutingStage.affectedEdgesDpKey]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CurveRoutingStageData%23affectedEdges">Online Documentation</a>
 */
final var affectedEdges: DpKeyItemCollection<IEdge>
/**
 * Gets or sets the collection of affected nodes, meaning that the paths of all edges adjacent to an affected node will be replaced by curved paths.
 * @see [CurveRoutingStage.affectedNodesDpKey]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CurveRoutingStageData%23affectedNodes">Online Documentation</a>
 */
final var affectedNodes: DpKeyItemCollection<INode>
/**
 * Gets or sets the mapping that provides a [PreferredPlacementDescriptor] instance for edge [ILabel]s.
 * @see [PreferredPlacementDescriptor]
 * @see [LayoutGraphAdapter.EDGE_LABEL_LAYOUT_PREFERRED_PLACEMENT_DESCRIPTOR_DP_KEY][yfiles.layout.LayoutGraphAdapter.EDGE_LABEL_LAYOUT_PREFERRED_PLACEMENT_DESCRIPTOR_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CurveRoutingStageData%23edgeLabelPreferredPlacement">Online Documentation</a>
 */
final var edgeLabelPreferredPlacement: ItemMapping<ILabel, PreferredPlacementDescriptor>
/**
 * Gets or sets the mapping of edges to their [CurveEdgeLayoutDescriptor]
 * @see [CurveRoutingStage.CURVE_EDGE_LAYOUT_DESCRIPTOR_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CurveRoutingStageData%23edgeLayoutDescriptors">Online Documentation</a>
 */
final var edgeLayoutDescriptors: ItemMapping<IEdge, CurveEdgeLayoutDescriptor>
/**
 * Gets or sets the mapping from nodes to their [NodeHalo].
 * @see [NodeHalo.NODE_HALO_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CurveRoutingStageData%23nodeHalos">Online Documentation</a>
 */
final var nodeHalos: ItemMapping<INode, NodeHalo>
/**
 * Gets or sets the [partition grid][yfiles.layout.PartitionGrid] layout data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CurveRoutingStageData%23partitionGridData">Online Documentation</a>
 */
final var partitionGridData: PartitionGridData
/**
 * Gets or sets a mapping from edges to an object representing their source edge group.
 * @see [targetGroupIds]
 * @see [PortConstraintKeys.SOURCE_GROUP_ID_DP_KEY][yfiles.layout.PortConstraintKeys.SOURCE_GROUP_ID_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CurveRoutingStageData%23sourceGroupIds">Online Documentation</a>
 */
final var sourceGroupIds: ItemMapping<IEdge, Id>
/**
 * Gets or sets a mapping from edges to an object representing their target edge group.
 * @see [sourceGroupIds]
 * @see [PortConstraintKeys.TARGET_GROUP_ID_DP_KEY][yfiles.layout.PortConstraintKeys.TARGET_GROUP_ID_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CurveRoutingStageData%23targetGroupIds">Online Documentation</a>
 */
final var targetGroupIds: ItemMapping<IEdge, Id>

companion object : ClassMetadata<CurveRoutingStageData> {
}
}

inline fun CurveRoutingStageData(
    block: CurveRoutingStageData.() -> Unit
): CurveRoutingStageData {
    return CurveRoutingStageData()
        .apply(block)
}
