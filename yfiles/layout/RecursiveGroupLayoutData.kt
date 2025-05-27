// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.collections.ItemMapping
import yfiles.geometry.Insets
import yfiles.lang.ClassMetadata
import yfiles.lang.Id

/**
 * Specifies custom data for the [RecursiveGroupLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RecursiveGroupLayoutData">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RecursiveGroupLayoutData%23RecursiveGroupLayoutData-constructor-RecursiveGroupLayoutData">Online Documentation</a>
 */
external class RecursiveGroupLayoutData<TNode, TEdge, TNodeLabel, TEdgeLabel> () : LayoutData<TNode, TEdge, TNodeLabel, TEdgeLabel> {
  /**
   * Gets or sets the mapping from group nodes to the [ILayoutAlgorithm] used for their child nodes.
   * @see [RecursiveGroupLayout.GROUP_NODE_LAYOUT_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RecursiveGroupLayoutData%23groupNodeLayouts">Online Documentation</a>
   */
  final var groupNodeLayouts: ItemMapping<TNode, ILayoutAlgorithm>
  
  /**
   * Gets or sets the [layout grid][LayoutGridData] layout data.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RecursiveGroupLayoutData%23layoutGridData">Online Documentation</a>
   */
  final var layoutGridData: LayoutGridData<TNode, TEdge, TNodeLabel, TEdgeLabel>
  
  /**
   * Gets or sets the mapping from nodes to their margins.
   * @see [LayoutKeys.NODE_MARGIN_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RecursiveGroupLayoutData%23nodeMargins">Online Documentation</a>
   */
  final var nodeMargins: ItemMapping<TNode, Insets>
  
  /**
   * Gets or sets the sub-data that provides a way of influencing the placement of the ports.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RecursiveGroupLayoutData%23ports">Online Documentation</a>
   */
  final var ports: BasicPortData<TNode, TEdge, TNodeLabel, TEdgeLabel>
  
  /**
   * Gets or sets a mapping from edges connecting to group nodes to source split IDs.
   * @see [RecursiveGroupLayout.SOURCE_SPLIT_ID_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RecursiveGroupLayoutData%23sourceSplitIds">Online Documentation</a>
   */
  final var sourceSplitIds: ItemMapping<TEdge, Id>
  
  /**
   * Gets or sets a mapping from edges connecting to group nodes to target split IDs.
   * @see [RecursiveGroupLayout.TARGET_SPLIT_ID_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RecursiveGroupLayoutData%23targetSplitIds">Online Documentation</a>
   */
  final var targetSplitIds: ItemMapping<TEdge, Id>
  
  companion object : ClassMetadata<RecursiveGroupLayoutData<*, *, *, *>> {
  }
}
