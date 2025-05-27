// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.router

import yfiles.collections.ItemCollectionMapping
import yfiles.collections.ItemMapping
import yfiles.geometry.Insets
import yfiles.lang.ClassMetadata
import yfiles.lang.Comparison1
import yfiles.lang.Id
import yfiles.layout.BasicPortData
import yfiles.layout.EdgeLabelPreferredPlacement
import yfiles.layout.LayoutData
import yfiles.layout.LayoutGridData

/**
 * Specifies custom data for the [EdgeRouter].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterData">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterData%23EdgeRouterData-constructor-EdgeRouterData">Online Documentation</a>
 */
external class EdgeRouterData<TNode, TEdge, TNodeLabel, TEdgeLabel> () : LayoutData<TNode, TEdge, TNodeLabel, TEdgeLabel> {
  /**
   * Gets or sets the mapping from edges to their [EdgeRouterBusDescriptor].
   * @see [EdgeRouter.BUS_DESCRIPTOR_DATA_KEY]
   * @see [EdgeRouterBusDescriptor]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterData%23buses">Online Documentation</a>
   */
  final var buses: ItemCollectionMapping<TEdge, EdgeRouterBusDescriptor>
  
  /**
   * Gets or sets the mapping of edges to their [EdgeRouterEdgeDescriptor]
   * @see [EdgeRouter.EDGE_DESCRIPTOR_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterData%23edgeDescriptors">Online Documentation</a>
   */
  final var edgeDescriptors: ItemMapping<TEdge, EdgeRouterEdgeDescriptor>
  
  /**
   * Gets or sets a mapping from edge labels to a crossing cost factor.
   * @see [EdgeRouterCosts.edgeLabelCrossingCost]
   * @see [EdgeRouter.EDGE_LABEL_CROSSING_COST_FACTOR_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterData%23edgeLabelCrossingCostFactors">Online Documentation</a>
   */
  final var edgeLabelCrossingCostFactors: ItemMapping<TEdgeLabel, Double>
  
  /**
   * Gets or sets the mapping that provides an [EdgeLabelPreferredPlacement] instance for edge labels.
   * @see [EdgeLabelPreferredPlacement]
   * @see [EdgeLabelPreferredPlacement.EDGE_LABEL_PREFERRED_PLACEMENT_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterData%23edgeLabelPreferredPlacements">Online Documentation</a>
   */
  final var edgeLabelPreferredPlacements: ItemMapping<TEdgeLabel, EdgeLabelPreferredPlacement>
  
  /**
   * Gets or sets a custom comparison to define the processing order of the edges.
   * 
   * Default value - `null`. There is no custom instance set and the default implementation will be applied.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterData%23edgeProcessingComparator">Online Documentation</a>
   */
  final var edgeProcessingComparator: Comparison1<TEdge>?
  
  /**
   * Gets or sets the [LayoutGrid][yfiles.layout.LayoutGrid] layout data.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterData%23layoutGridData">Online Documentation</a>
   */
  final var layoutGridData: LayoutGridData<TNode, TEdge, TNodeLabel, TEdgeLabel>
  
  /**
   * Gets or sets a mapping from node labels to a crossing cost factor.
   * @see [EdgeRouterCosts.nodeLabelCrossingCost]
   * @see [EdgeRouter.NODE_LABEL_CROSSING_COST_FACTOR_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterData%23nodeLabelCrossingCostFactors">Online Documentation</a>
   */
  final var nodeLabelCrossingCostFactors: ItemMapping<TNodeLabel, Double>
  
  /**
   * Gets or sets the mapping from nodes to their margins.
   * @see [LayoutKeys.NODE_MARGIN_DATA_KEY][yfiles.layout.LayoutKeys.NODE_MARGIN_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterData%23nodeMargins">Online Documentation</a>
   */
  final var nodeMargins: ItemMapping<TNode, Insets>
  
  /**
   * Gets or sets the sub-data that influences the placement of the ports.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterData%23ports">Online Documentation</a>
   */
  final var ports: BasicPortData<TNode, TEdge, TNodeLabel, TEdgeLabel>
  
  /**
   * Gets or sets the sub-data that provides the ability to modify the scope of the [EdgeRouter] with regard to the routed edges.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterData%23scope">Online Documentation</a>
   */
  final val scope: EdgeRouterScopeData<TNode, TEdge, TNodeLabel, TEdgeLabel>
  
  /**
   * Gets or sets a mapping from edges to an object representing their source edge group.
   * @see [targetGroupIds]
   * @see [LayoutKeys.SOURCE_EDGE_GROUP_ID_DATA_KEY][yfiles.layout.LayoutKeys.SOURCE_EDGE_GROUP_ID_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterData%23sourceGroupIds">Online Documentation</a>
   */
  final var sourceGroupIds: ItemMapping<TEdge, Id>
  
  /**
   * Gets or sets a mapping from edges to an object representing their target edge group.
   * @see [sourceGroupIds]
   * @see [LayoutKeys.TARGET_EDGE_GROUP_ID_DATA_KEY][yfiles.layout.LayoutKeys.TARGET_EDGE_GROUP_ID_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterData%23targetGroupIds">Online Documentation</a>
   */
  final var targetGroupIds: ItemMapping<TEdge, Id>
  
  companion object : ClassMetadata<EdgeRouterData<*, *, *, *>> {
  }
}
