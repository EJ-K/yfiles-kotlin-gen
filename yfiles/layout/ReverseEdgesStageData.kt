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
import yfiles.lang.ClassMetadata
import yfiles.lang.Id
import yfiles.router.EdgeScopeData

/**
 * Specifies custom data for the [ReverseEdgesStage].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReverseEdgesStageData">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReverseEdgesStageData%23ReverseEdgesStageData-constructor-ReverseEdgesStageData">Online Documentation</a>
 */
external class ReverseEdgesStageData<TNode, TEdge, TNodeLabel, TEdgeLabel> () : LayoutData<TNode, TEdge, TNodeLabel, TEdgeLabel> {
  /**
   * Gets or sets the sub-data that influences the placement of the ports.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReverseEdgesStageData%23ports">Online Documentation</a>
   */
  final var ports: PortData<TNode, TEdge, TNodeLabel, TEdgeLabel>
  
  /**
   * Gets or sets the sub-data that specifies the subset of edges that are in scope for the [ReverseEdgesStage].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReverseEdgesStageData%23scope">Online Documentation</a>
   */
  final val scope: EdgeScopeData<TNode, TEdge, TNodeLabel, TEdgeLabel, Boolean>
  
  /**
   * Gets or sets a mapping from edges to an object representing their source edge group.
   * @see [LayoutKeys.SOURCE_EDGE_GROUP_ID_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReverseEdgesStageData%23sourceGroupIds">Online Documentation</a>
   */
  final var sourceGroupIds: ItemMapping<TEdge, Id>
  
  /**
   * Gets or sets a mapping from edges to an object representing their target edge group.
   * @see [LayoutKeys.TARGET_EDGE_GROUP_ID_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReverseEdgesStageData%23targetGroupIds">Online Documentation</a>
   */
  final var targetGroupIds: ItemMapping<TEdge, Id>
  
  companion object : ClassMetadata<ReverseEdgesStageData<*, *, *, *>> {
  }
}
