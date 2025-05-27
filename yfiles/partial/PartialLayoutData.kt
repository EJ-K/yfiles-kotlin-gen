// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.partial

import yfiles.collections.ItemMapping
import yfiles.geometry.Insets
import yfiles.lang.ClassMetadata
import yfiles.lang.Id
import yfiles.layout.BasicPortData
import yfiles.layout.LayoutData
import yfiles.layout.LayoutGridData

/**
 * Specifies custom data for the [PartialLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayoutData">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayoutData%23PartialLayoutData-constructor-PartialLayoutData">Online Documentation</a>
 */
external class PartialLayoutData<TNode, TEdge, TNodeLabel, TEdgeLabel> () : LayoutData<TNode, TEdge, TNodeLabel, TEdgeLabel> {
  /**
   * Gets or sets the mapping from partial nodes to an object defining their component assignment.
   * @see [PartialLayout.COMPONENT_ID_DATA_KEY]
   * @see [PartialLayout.componentAssignmentStrategy]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayoutData%23componentIds">Online Documentation</a>
   */
  final var componentIds: ItemMapping<TNode, Id>
  
  /**
   * Gets or sets the mapping from edges to their orientation, specifying how they should be routed with respect to the main layout direction.
   * @see [PartialLayout.EDGE_ORIENTATION_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayoutData%23edgeOrientation">Online Documentation</a>
   */
  final var edgeOrientation: ItemMapping<TEdge, Double>
  
  /**
   * Gets or sets the [LayoutGrid][yfiles.layout.LayoutGrid] layout data.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayoutData%23layoutGridData">Online Documentation</a>
   */
  final var layoutGridData: LayoutGridData<TNode, TEdge, TNodeLabel, TEdgeLabel>
  
  /**
   * Gets or sets the mapping from nodes to their margins.
   * @see [LayoutKeys.NODE_MARGIN_DATA_KEY][yfiles.layout.LayoutKeys.NODE_MARGIN_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayoutData%23nodeMargins">Online Documentation</a>
   */
  final var nodeMargins: ItemMapping<TNode, Insets>
  
  /**
   * Gets or sets the sub-data that provides a way of influencing the placement of the ports.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayoutData%23ports">Online Documentation</a>
   */
  final var ports: BasicPortData<TNode, TEdge, TNodeLabel, TEdgeLabel>
  
  /**
   * Gets or sets the collection of nodes and edges that are considered as partial (movable) by the layout.
   * @see [PartialLayout.NODE_SCOPE_DATA_KEY]
   * @see [PartialLayout.EDGE_SCOPE_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayoutData%23scope">Online Documentation</a>
   */
  final val scope: PartialLayoutScopeData<TNode, TEdge>
  
  companion object : ClassMetadata<PartialLayoutData<*, *, *, *>> {
  }
}
