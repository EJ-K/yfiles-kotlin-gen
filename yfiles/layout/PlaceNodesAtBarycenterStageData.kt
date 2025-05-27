// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.collections.ItemCollection
import yfiles.collections.ItemMapping
import yfiles.geometry.ISize
import yfiles.lang.ClassMetadata

/**
 * Specifies custom data for the [PlaceNodesAtBarycenterStage].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PlaceNodesAtBarycenterStageData">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PlaceNodesAtBarycenterStageData%23PlaceNodesAtBarycenterStageData-constructor-PlaceNodesAtBarycenterStageData">Online Documentation</a>
 */
external class PlaceNodesAtBarycenterStageData<TNode, TEdge, TNodeLabel, TEdgeLabel> () : LayoutData<TNode, TEdge, TNodeLabel, TEdgeLabel> {
  /**
   * Gets or sets the collection of nodes that should be affected by the [PlaceNodesAtBarycenterStage].
   * @see [PlaceNodesAtBarycenterStage.AFFECTED_NODES_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PlaceNodesAtBarycenterStageData%23affectedNodes">Online Documentation</a>
   */
  final var affectedNodes: ItemCollection<TNode>
  
  /**
   * Gets or sets the mapping from the affected nodes to their sizes.
   * @see [PlaceNodesAtBarycenterStage.AFFECTED_NODES_SIZE_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PlaceNodesAtBarycenterStageData%23affectedNodesSizes">Online Documentation</a>
   */
  final var affectedNodesSizes: ItemMapping<TNode, ISize>
  
  companion object : ClassMetadata<PlaceNodesAtBarycenterStageData<*, *, *, *>> {
  }
}
