// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.circular

import yfiles.algorithms.EdgeDirectedness
import yfiles.collections.IMapper
import yfiles.collections.ItemCollection
import yfiles.collections.ItemMapping
import yfiles.geometry.Insets
import yfiles.lang.ClassMetadata
import yfiles.lang.Comparison1
import yfiles.layout.BasicPortData
import yfiles.layout.EdgeBundleDescriptor
import yfiles.layout.LayoutData

/**
 * Specifies custom data for the [CircularLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayoutData">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [CircularLayoutData] which helps configuring [CircularLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayoutData%23CircularLayoutData-constructor-CircularLayoutData">Online Documentation</a>
 */
external class CircularLayoutData<TNode, TEdge, TNodeLabel, TEdgeLabel> () : LayoutData<TNode, TEdge, TNodeLabel, TEdgeLabel> {
  /**
   * Gets a mapper from nodes to their circle ID.
   * @see [CircularLayout.CIRCLE_ID_RESULT_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayoutData%23circleIdsResult">Online Documentation</a>
   */
  final val circleIdsResult: IMapper<TNode, Double>
  
  /**
   * Gets or sets the mapping of edges to their [EdgeBundleDescriptor].
   * @see [EdgeBundleDescriptor]
   * @see [EdgeBundling.EDGE_BUNDLE_DESCRIPTOR_DATA_KEY][yfiles.layout.EdgeBundling.EDGE_BUNDLE_DESCRIPTOR_DATA_KEY]
   * @see [CircularLayout.edgeBundling]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayoutData%23edgeBundleDescriptors">Online Documentation</a>
   */
  final var edgeBundleDescriptors: ItemMapping<TEdge, EdgeBundleDescriptor>
  
  /**
   * Gets or sets the mapping from edges to their directedness.
   * @see [CircularLayout.starSubstructureStyle]
   * @see [LayoutKeys.EDGE_DIRECTEDNESS_DATA_KEY][yfiles.layout.LayoutKeys.EDGE_DIRECTEDNESS_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayoutData%23edgeDirectedness">Online Documentation</a>
   */
  final var edgeDirectedness: ItemMapping<TEdge, EdgeDirectedness>
  
  /**
   * Gets or sets the collection of edges that are routed around the exterior of a circle formed by each partition.
   * @see [CircularLayout.EXTERIOR_EDGES_DATA_KEY]
   * @see [CircularLayout.exteriorEdgeDescriptor]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayoutData%23exteriorEdges">Online Documentation</a>
   */
  final var exteriorEdges: ItemCollection<TEdge>
  
  /**
   * Gets or sets a comparison function used for determining the node order on the circle.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayoutData%23nodeComparator">Online Documentation</a>
   */
  final var nodeComparator: Comparison1<TNode>?
  
  /**
   * Gets or sets the mapping from nodes to their margins.
   * @see [LayoutKeys.NODE_MARGIN_DATA_KEY][yfiles.layout.LayoutKeys.NODE_MARGIN_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayoutData%23nodeMargins">Online Documentation</a>
   */
  final var nodeMargins: ItemMapping<TNode, Insets>
  
  /**
   * Gets or sets the mapping from nodes to an object defining the node type which is considered during the layout.
   * @see [LayoutKeys.NODE_TYPE_DATA_KEY][yfiles.layout.LayoutKeys.NODE_TYPE_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayoutData%23nodeTypes">Online Documentation</a>
   */
  final var nodeTypes: ItemMapping<TNode, Any>
  
  /**
   * Gets or sets the mapping from nodes to their partition object.
   * @see [CircularLayout.PARTITION_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayoutData%23partitions">Online Documentation</a>
   */
  final var partitions: ItemMapping<TNode, Any>
  
  /**
   * Gets or sets the sub-data that provides a way of influencing the placement of the ports.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayoutData%23ports">Online Documentation</a>
   */
  final var ports: BasicPortData<TNode, TEdge, TNodeLabel, TEdgeLabel>
  
  companion object : ClassMetadata<CircularLayoutData<*, *, *, *>> {
  }
}
