// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

/**
 * Specifies the alignment policies that can be applied to nodes in a layout process.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AlignmentStageAlignmentPolicy">Online Documentation</a>
 */

sealed external class AlignmentStageAlignmentPolicy {
  /**
   * This snapping policy enforces that nodes are aligned horizontally.
   * 
   * Value - `0`
   * @see [AlignmentStage.alignmentPolicy]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AlignmentStageAlignmentPolicy%23SNAP_Y">Online Documentation</a>
   */
  object SNAP_Y: AlignmentStageAlignmentPolicy
  
  /**
   * This snapping policy enforces that nodes are aligned vertically.
   * 
   * Value - `1`
   * @see [AlignmentStage.alignmentPolicy]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AlignmentStageAlignmentPolicy%23SNAP_X">Online Documentation</a>
   */
  object SNAP_X: AlignmentStageAlignmentPolicy
  
  /**
   * This snapping policy enforces that nodes are aligned both horizontally and vertically.
   * 
   * Value - `2`
   * @see [AlignmentStage.alignmentPolicy]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AlignmentStageAlignmentPolicy%23SNAP_XY">Online Documentation</a>
   */
  object SNAP_XY: AlignmentStageAlignmentPolicy
}
