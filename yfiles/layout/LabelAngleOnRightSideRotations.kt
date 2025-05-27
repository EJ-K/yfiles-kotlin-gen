// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.lang.YFlags

/**
 * Angle interpretation specifier which expresses that the rotation angle should be interpreted *clockwise*.
 * @see [PreferredPlacementDescriptor.angleRotationOnRightSide]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelAngleOnRightSideRotations">Online Documentation</a>
 */
external class LabelAngleOnRightSideRotations 
    private constructor(): YFlags<LabelAngleOnRightSideRotations> {
    companion object {
    /**
 * Angle interpretation specifier which expresses that the rotation angle should be interpreted *clockwise*.
 * 
 * Value - `1`
 * @see [PreferredPlacementDescriptor.angleRotationOnRightSide]
 * @see [PreferredPlacementDescriptor.angle]
 * @see [PreferredPlacementDescriptor.sideOfEdge]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelAngleOnRightSideRotations%23CLOCKWISE">Online Documentation</a>
 */
val CLOCKWISE: LabelAngleOnRightSideRotations
/**
 * Angle interpretation specifier which expresses that the rotation angle should be interpreted *counter-clockwise*.
 * 
 * Value - `2`
 * @see [PreferredPlacementDescriptor.angleRotationOnRightSide]
 * @see [PreferredPlacementDescriptor.angle]
 * @see [PreferredPlacementDescriptor.sideOfEdge]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelAngleOnRightSideRotations%23COUNTER_CLOCKWISE">Online Documentation</a>
 */
val COUNTER_CLOCKWISE: LabelAngleOnRightSideRotations

    }
}
