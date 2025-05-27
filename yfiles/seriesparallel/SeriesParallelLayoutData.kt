// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.seriesparallel

import yfiles.collections.ItemMapping
import yfiles.lang.ClassMetadata
import yfiles.lang.Id
import yfiles.layout.BasicPortData
import yfiles.layout.ChildOrderData
import yfiles.layout.EdgeLabelPreferredPlacement
import yfiles.layout.LayoutData

/**
 * Specifies custom data for the [SeriesParallelLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayoutData">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayoutData%23SeriesParallelLayoutData-constructor-SeriesParallelLayoutData">Online Documentation</a>
 */
external class SeriesParallelLayoutData<TNode, TEdge, TNodeLabel, TEdgeLabel> () : LayoutData<TNode, TEdge, TNodeLabel, TEdgeLabel> {
  /**
   * Gets or sets the [ChildOrderData] which specifies how child nodes are to be sorted.
   * @see [SeriesParallelLayout.OUT_EDGE_COMPARATOR_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayoutData%23childOrder">Online Documentation</a>
   */
  final var childOrder: ChildOrderData<TNode, TEdge>
  
  /**
   * Gets or sets the mapping from edges to their [SeriesParallelLayoutEdgeDescriptor].
   * @see [SeriesParallelLayoutEdgeDescriptor]
   * @see [SeriesParallelLayout.EDGE_DESCRIPTOR_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayoutData%23edgeDescriptors">Online Documentation</a>
   */
  final var edgeDescriptors: ItemMapping<TEdge, SeriesParallelLayoutEdgeDescriptor>
  
  /**
   * Gets or sets the mapping that provides an [EdgeLabelPreferredPlacement] instance for edge labels.
   * @see [EdgeLabelPreferredPlacement]
   * @see [EdgeLabelPreferredPlacement.EDGE_LABEL_PREFERRED_PLACEMENT_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayoutData%23edgeLabelPreferredPlacements">Online Documentation</a>
   */
  final var edgeLabelPreferredPlacements: ItemMapping<TEdgeLabel, EdgeLabelPreferredPlacement>
  
  /**
   * Gets or sets the mapping from nodes to their [ISeriesParallelLayoutPortAssigner].
   * @see [SeriesParallelLayout.PORT_ASSIGNER_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayoutData%23portAssigners">Online Documentation</a>
   */
  final var portAssigners: ItemMapping<TNode, ISeriesParallelLayoutPortAssigner>
  
  /**
   * Gets or sets the sub-data that influences the placement of the ports.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayoutData%23ports">Online Documentation</a>
   */
  final var ports: BasicPortData<TNode, TEdge, TNodeLabel, TEdgeLabel>
  
  /**
   * Gets or sets a mapping from edges to an object representing their source edge group.
   * @see [LayoutKeys.SOURCE_EDGE_GROUP_ID_DATA_KEY][yfiles.layout.LayoutKeys.SOURCE_EDGE_GROUP_ID_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayoutData%23sourceGroupIds">Online Documentation</a>
   */
  final var sourceGroupIds: ItemMapping<TEdge, Id>
  
  /**
   * Gets or sets a mapping from edges to an object representing their target edge group.
   * @see [LayoutKeys.TARGET_EDGE_GROUP_ID_DATA_KEY][yfiles.layout.LayoutKeys.TARGET_EDGE_GROUP_ID_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayoutData%23targetGroupIds">Online Documentation</a>
   */
  final var targetGroupIds: ItemMapping<TEdge, Id>
  
  companion object : ClassMetadata<SeriesParallelLayoutData<*, *, *, *>> {
  }
}
