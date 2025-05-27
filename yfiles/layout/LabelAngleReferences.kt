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
 * Specifies whether the rotation angle of edge labels should be interpreted absolute or relative to the edge slope.
 * @see [EdgeLabelPreferredPlacement.angleReference]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelAngleReferences">Online Documentation</a>
 */

sealed external class LabelAngleReferences {
  /**
   * Angle interpretation specifier for edge labels which expresses that the rotation angle should be interpreted absolute and not relative to the edge slope.
   * 
   * Value - `1`
   * @see [EdgeLabelPreferredPlacement.angleReference]
   * @see [EdgeLabelPreferredPlacement.angle]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelAngleReferences%23ABSOLUTE">Online Documentation</a>
   */
  object ABSOLUTE: LabelAngleReferences
  
  /**
   * Angle interpretation specifier for edge labels which expresses that the rotation angle should be interpreted relative to the edge slope.
   * 
   * Value - `2`
   * @see [EdgeLabelPreferredPlacement.angleReference]
   * @see [EdgeLabelPreferredPlacement.angle]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelAngleReferences%23RELATIVE_TO_EDGE_FLOW">Online Documentation</a>
   */
  object RELATIVE_TO_EDGE_FLOW: LabelAngleReferences
}
