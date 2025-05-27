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
 * Specifies in which direction the rotation angle should be interpreted.
 * @see [EdgeLabelPreferredPlacement.angleRotationOnRightSide]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelAngleOnRightSideRotations">Online Documentation</a>
 */

sealed external class LabelAngleOnRightSideRotations {
  /**
   * Angle interpretation specifier which expresses that the rotation angle should be interpreted *clockwise*.
   * 
   * Value - `1`
   * @see [EdgeLabelPreferredPlacement.angleRotationOnRightSide]
   * @see [EdgeLabelPreferredPlacement.angle]
   * @see [EdgeLabelPreferredPlacement.edgeSide]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelAngleOnRightSideRotations%23CLOCKWISE">Online Documentation</a>
   */
  object CLOCKWISE: LabelAngleOnRightSideRotations
  
  /**
   * Angle interpretation specifier which expresses that the rotation angle should be interpreted *counter-clockwise*.
   * 
   * Value - `2`
   * @see [EdgeLabelPreferredPlacement.angleRotationOnRightSide]
   * @see [EdgeLabelPreferredPlacement.angle]
   * @see [EdgeLabelPreferredPlacement.edgeSide]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelAngleOnRightSideRotations%23COUNTER_CLOCKWISE">Online Documentation</a>
   */
  object COUNTER_CLOCKWISE: LabelAngleOnRightSideRotations
}
