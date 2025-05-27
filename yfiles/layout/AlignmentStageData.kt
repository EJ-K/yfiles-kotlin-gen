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
import yfiles.geometry.IPoint
import yfiles.geometry.Insets
import yfiles.lang.ClassMetadata

/**
 * Specifies custom data for the [AlignmentStage].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AlignmentStageData">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AlignmentStageData%23AlignmentStageData-constructor-AlignmentStageData">Online Documentation</a>
 */
external class AlignmentStageData<TNode, TEdge, TNodeLabel, TEdgeLabel> () : LayoutData<TNode, TEdge, TNodeLabel, TEdgeLabel> {
  /**
   * Gets or sets the [LayoutGrid] layout data which allows to define a grid that is respected by the [AlignmentStage] so that nodes that are not in the same column/row may not be aligned.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AlignmentStageData%23layoutGridData">Online Documentation</a>
   */
  final var layoutGridData: LayoutGridData<TNode, TEdge, TNodeLabel, TEdgeLabel>
  
  /**
   * Gets or sets the mapping from nodes to their margins.
   * @see [LayoutKeys.NODE_MARGIN_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AlignmentStageData%23nodeMargins">Online Documentation</a>
   */
  final var nodeMargins: ItemMapping<TNode, Insets>
  
  /**
   * Gets or sets the mapping from nodes to the points relative to the center that are aligned.
   * @see [AlignmentStage.SNAP_OFFSET_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AlignmentStageData%23snapOffsets">Online Documentation</a>
   */
  final var snapOffsets: ItemMapping<TNode, IPoint>
  
  companion object : ClassMetadata<AlignmentStageData<*, *, *, *>> {
  }
}
