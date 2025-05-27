// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.circular

import yfiles.collections.ItemMapping
import yfiles.geometry.Insets
import yfiles.lang.ClassMetadata
import yfiles.layout.BasicPortData
import yfiles.layout.LayoutData

/**
 * Specifies custom data for the [CompactDiskLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompactDiskLayoutData">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompactDiskLayoutData%23CompactDiskLayoutData-constructor-CompactDiskLayoutData">Online Documentation</a>
 */
external class CompactDiskLayoutData<TNode, TEdge, TNodeLabel, TEdgeLabel> () : LayoutData<TNode, TEdge, TNodeLabel, TEdgeLabel> {
  /**
   * Gets or sets the mapping from nodes to their margins.
   * @see [LayoutKeys.NODE_MARGIN_DATA_KEY][yfiles.layout.LayoutKeys.NODE_MARGIN_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompactDiskLayoutData%23nodeMargins">Online Documentation</a>
   */
  final var nodeMargins: ItemMapping<TNode, Insets>
  
  /**
   * Gets or sets the mapping from nodes to an object defining the node type, which influences the ordering of child nodes such that those with the same type are preferably placed next to each other.
   * @see [LayoutKeys.NODE_TYPE_DATA_KEY][yfiles.layout.LayoutKeys.NODE_TYPE_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompactDiskLayoutData%23nodeTypes">Online Documentation</a>
   */
  final var nodeTypes: ItemMapping<TNode, Any>
  
  /**
   * Gets or sets the sub-data that provides a way of influencing the placement of the ports.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompactDiskLayoutData%23ports">Online Documentation</a>
   */
  final var ports: BasicPortData<TNode, TEdge, TNodeLabel, TEdgeLabel>
  
  companion object : ClassMetadata<CompactDiskLayoutData<*, *, *, *>> {
  }
}
