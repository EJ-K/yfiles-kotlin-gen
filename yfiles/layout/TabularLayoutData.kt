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
import yfiles.lang.Comparison1

/**
 * Specifies custom data for the [TabularLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TabularLayoutData">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TabularLayoutData%23TabularLayoutData-constructor-TabularLayoutData">Online Documentation</a>
 */
external class TabularLayoutData<TNode, TEdge, TNodeLabel, TEdgeLabel> () : LayoutData<TNode, TEdge, TNodeLabel, TEdgeLabel> {
  /**
   * Gets or sets the comparison that defines the order in which the *free* nodes are placed in the table.
   * 
   * Default value - `null`. The nodes are sorted with respect to their indices of the graph structure.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TabularLayoutData%23freeNodeComparator">Online Documentation</a>
   */
  final var freeNodeComparator: Comparison1<TNode>?
  
  /**
   * Gets or sets the layout grid data.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TabularLayoutData%23layoutGridData">Online Documentation</a>
   */
  final var layoutGridData: LayoutGridData<TNode, TEdge, TNodeLabel, TEdgeLabel>
  
  /**
   * Gets or sets the mapping of nodes to their [TabularLayoutNodeDescriptor] that defines custom node placement settings.
   * @see [TabularLayout.NODE_DESCRIPTOR_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TabularLayoutData%23nodeDescriptors">Online Documentation</a>
   */
  final var nodeDescriptors: ItemMapping<TNode, TabularLayoutNodeDescriptor>
  
  /**
   * Gets or sets the mapping from nodes to their margins.
   * @see [LayoutKeys.NODE_MARGIN_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TabularLayoutData%23nodeMargins">Online Documentation</a>
   */
  final var nodeMargins: ItemMapping<TNode, Insets>
  
  companion object : ClassMetadata<TabularLayoutData<*, *, *, *>> {
  }
}
