// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.partial

import yfiles.collections.ItemCollection
import yfiles.collections.ItemMapping
import yfiles.geometry.Insets
import yfiles.lang.ClassMetadata
import yfiles.lang.Id
import yfiles.layout.LayoutData
import yfiles.layout.LayoutGridData

/**
 * Specifies custom data for the [FillAreaLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FillAreaLayoutData">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FillAreaLayoutData%23FillAreaLayoutData-constructor-FillAreaLayoutData">Online Documentation</a>
 */
external class FillAreaLayoutData<TNode, TEdge, TNodeLabel, TEdgeLabel> () : LayoutData<TNode, TEdge, TNodeLabel, TEdgeLabel> {
  /**
   * Gets or sets the mapping from nodes to an object defining their component id.
   * @see [FillAreaLayout.COMPONENT_ID_DATA_KEY]
   * @see [FillAreaLayout.componentAssignmentStrategy]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FillAreaLayoutData%23componentIds">Online Documentation</a>
   */
  final var componentIds: ItemMapping<TNode, Id>
  
  /**
   * Gets or sets the collection of nodes that are fixed and must not be moved.
   * @see [FillAreaLayout.FIXED_NODE_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FillAreaLayoutData%23fixedNodes">Online Documentation</a>
   */
  final var fixedNodes: ItemCollection<TNode>
  
  /**
   * Gets or sets the [LayoutGrid][yfiles.layout.LayoutGrid] layout data.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FillAreaLayoutData%23layoutGridData">Online Documentation</a>
   */
  final var layoutGridData: LayoutGridData<TNode, TEdge, TNodeLabel, TEdgeLabel>
  
  /**
   * Gets or sets the mapping from nodes to their margins.
   * @see [LayoutKeys.NODE_MARGIN_DATA_KEY][yfiles.layout.LayoutKeys.NODE_MARGIN_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FillAreaLayoutData%23nodeMargins">Online Documentation</a>
   */
  final var nodeMargins: ItemMapping<TNode, Insets>
  
  companion object : ClassMetadata<FillAreaLayoutData<*, *, *, *>> {
  }
}
