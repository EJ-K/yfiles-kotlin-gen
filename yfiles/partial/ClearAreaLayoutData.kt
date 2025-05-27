// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.partial

import yfiles.collections.IEnumerable
import yfiles.collections.ItemCollection
import yfiles.collections.ItemMapping
import yfiles.geometry.IPoint
import yfiles.geometry.IRectangle
import yfiles.geometry.Insets
import yfiles.lang.ClassMetadata
import yfiles.lang.Id
import yfiles.layout.BasicPortData
import yfiles.layout.LayoutData
import yfiles.layout.LayoutGridData

/**
 * Specifies custom data for the [ClearAreaLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayoutData">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayoutData%23ClearAreaLayoutData-constructor-ClearAreaLayoutData">Online Documentation</a>
 */
external class ClearAreaLayoutData<TNode, TEdge, TNodeLabel, TEdgeLabel> () : LayoutData<TNode, TEdge, TNodeLabel, TEdgeLabel> {
  /**
   * Gets or sets the group node inside which the cleared area should be located.
   * @see [ClearAreaLayout.AREA_GROUP_NODE_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayoutData%23areaGroupNode">Online Documentation</a>
   */
  final var areaGroupNode: ItemCollection<TNode>
  
  /**
   * Gets or sets the collection of nodes that define the area which must be cleared.
   * @see [ClearAreaLayout.AREA_NODES_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayoutData%23areaNodes">Online Documentation</a>
   */
  final var areaNodes: ItemCollection<TNode>
  
  /**
   * Gets or sets the mapping from nodes to an object defining their component id.
   * @see [ClearAreaLayout.COMPONENT_ID_DATA_KEY]
   * @see [ClearAreaLayout.componentAssignmentStrategy]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayoutData%23componentIds">Online Documentation</a>
   */
  final var componentIds: ItemMapping<TNode, Id>
  
  /**
   * Gets or sets the node that was expanded and, thus, defines the area that must be cleared.
   * @see [expandedNodeOriginalBounds]
   * @see [expandedNodeOriginalEdgePaths]
   * @see [ClearAreaLayout.EXPANDED_NODE_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayoutData%23expandedNode">Online Documentation</a>
   */
  final var expandedNode: ItemCollection<TNode>
  
  /**
   * Gets or sets the original, non-expanded bounds of the [expandedNode][ClearAreaLayoutData].
   * @see [expandedNode]
   * @see [expandedNodeOriginalEdgePaths]
   * @see [ClearAreaLayout.EXPANDED_NODE_ORIGINAL_BOUNDS_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayoutData%23expandedNodeOriginalBounds">Online Documentation</a>
   */
  final var expandedNodeOriginalBounds: IRectangle?
  
  /**
   * Gets or sets the mapping from edges adjacent to the [expandedNode][ClearAreaLayoutData] to their original edge paths, that is, their paths before the node was expanded.
   * @see [expandedNode]
   * @see [expandedNodeOriginalBounds]
   * @see [ClearAreaLayout.EXPANDED_NODE_ORIGINAL_EDGE_PATH_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayoutData%23expandedNodeOriginalEdgePaths">Online Documentation</a>
   */
  final var expandedNodeOriginalEdgePaths: ItemMapping<TEdge, IEnumerable<IPoint>>
  
  /**
   * Gets or sets the [LayoutGrid][yfiles.layout.LayoutGrid] layout data.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayoutData%23layoutGridData">Online Documentation</a>
   */
  final var layoutGridData: LayoutGridData<TNode, TEdge, TNodeLabel, TEdgeLabel>
  
  /**
   * Gets or sets the mapping from nodes to their margins.
   * @see [LayoutKeys.NODE_MARGIN_DATA_KEY][yfiles.layout.LayoutKeys.NODE_MARGIN_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayoutData%23nodeMargins">Online Documentation</a>
   */
  final var nodeMargins: ItemMapping<TNode, Insets>
  
  /**
   * Gets or sets the sub-data that provides a way of influencing the placement of the ports.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayoutData%23ports">Online Documentation</a>
   */
  final var ports: BasicPortData<TNode, TEdge, TNodeLabel, TEdgeLabel>
  
  /**
   * Gets or sets a mapping from edges to an object representing their source edge group.
   * @see [LayoutKeys.SOURCE_EDGE_GROUP_ID_DATA_KEY][yfiles.layout.LayoutKeys.SOURCE_EDGE_GROUP_ID_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayoutData%23sourceGroupIds">Online Documentation</a>
   */
  final var sourceGroupIds: ItemMapping<TEdge, Id>
  
  /**
   * Gets or sets a mapping from edges to an object representing their target edge group.
   * @see [LayoutKeys.TARGET_EDGE_GROUP_ID_DATA_KEY][yfiles.layout.LayoutKeys.TARGET_EDGE_GROUP_ID_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayoutData%23targetGroupIds">Online Documentation</a>
   */
  final var targetGroupIds: ItemMapping<TEdge, Id>
  
  companion object : ClassMetadata<ClearAreaLayoutData<*, *, *, *>> {
  }
}
