// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.router

import yfiles.collections.ItemMapping
import yfiles.geometry.Insets
import yfiles.lang.ClassMetadata
import yfiles.lang.Id
import yfiles.layout.EdgeLabelPreferredPlacement
import yfiles.layout.LayoutData
import yfiles.layout.LayoutGridData

/**
 * Specifies the layout data for the [CurveRoutingStage].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CurveRoutingStageData">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CurveRoutingStageData%23CurveRoutingStageData-constructor-CurveRoutingStageData">Online Documentation</a>
 */
external class CurveRoutingStageData<TNode, TEdge, TNodeLabel, TEdgeLabel> () : LayoutData<TNode, TEdge, TNodeLabel, TEdgeLabel> {
  /**
   * Gets or sets the mapping of edges to their [CurveRoutingEdgeDescriptor]
   * @see [CurveRoutingStage.EDGE_DESCRIPTOR_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CurveRoutingStageData%23edgeDescriptors">Online Documentation</a>
   */
  final var edgeDescriptors: ItemMapping<TEdge, CurveRoutingEdgeDescriptor>
  
  /**
   * Gets or sets the mapping that provides an [EdgeLabelPreferredPlacement] instance for edge labels.
   * @see [EdgeLabelPreferredPlacement]
   * @see [EdgeLabelPreferredPlacement.EDGE_LABEL_PREFERRED_PLACEMENT_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CurveRoutingStageData%23edgeLabelPreferredPlacements">Online Documentation</a>
   */
  final var edgeLabelPreferredPlacements: ItemMapping<TEdgeLabel, EdgeLabelPreferredPlacement>
  
  /**
   * Gets or sets the [LayoutGrid][yfiles.layout.LayoutGrid] layout data.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CurveRoutingStageData%23layoutGridData">Online Documentation</a>
   */
  final var layoutGridData: LayoutGridData<TNode, TEdge, TNodeLabel, TEdgeLabel>
  
  /**
   * Gets or sets the mapping from nodes to their margins.
   * @see [LayoutKeys.NODE_MARGIN_DATA_KEY][yfiles.layout.LayoutKeys.NODE_MARGIN_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CurveRoutingStageData%23nodeMargins">Online Documentation</a>
   */
  final var nodeMargins: ItemMapping<TNode, Insets>
  
  /**
   * Gets or sets the subset of edges that are in scope for the [CurveRoutingStage].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CurveRoutingStageData%23scope">Online Documentation</a>
   */
  final val scope: EdgeScopeData<TNode, TEdge, TNodeLabel, TEdgeLabel, Boolean>
  
  /**
   * Gets or sets a mapping from edges to an object representing their source edge group.
   * @see [targetGroupIds]
   * @see [LayoutKeys.SOURCE_EDGE_GROUP_ID_DATA_KEY][yfiles.layout.LayoutKeys.SOURCE_EDGE_GROUP_ID_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CurveRoutingStageData%23sourceGroupIds">Online Documentation</a>
   */
  final var sourceGroupIds: ItemMapping<TEdge, Id>
  
  /**
   * Gets or sets a mapping from edges to an object representing their target edge group.
   * @see [sourceGroupIds]
   * @see [LayoutKeys.TARGET_EDGE_GROUP_ID_DATA_KEY][yfiles.layout.LayoutKeys.TARGET_EDGE_GROUP_ID_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CurveRoutingStageData%23targetGroupIds">Online Documentation</a>
   */
  final var targetGroupIds: ItemMapping<TEdge, Id>
  
  companion object : ClassMetadata<CurveRoutingStageData<*, *, *, *>> {
  }
}
