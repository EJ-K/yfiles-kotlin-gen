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
 * Angle offset specifier for edge labels which expresses that no additional offset should be added to the angle.
 * @see [PreferredPlacementDescriptor.angleOffsetOnRightSide]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelAngleOnRightSideOffsets">Online Documentation</a>
 */
external class LabelAngleOnRightSideOffsets 
    private constructor(): YFlags<LabelAngleOnRightSideOffsets> {
    companion object {
    /**
 * Angle offset specifier for edge labels which expresses that no additional offset should be added to the angle.
 * 
 * Value - `1`
 * @see [PreferredPlacementDescriptor.angleOffsetOnRightSide]
 * @see [PreferredPlacementDescriptor.angle]
 * @see [PreferredPlacementDescriptor.sideOfEdge]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelAngleOnRightSideOffsets%23NONE">Online Documentation</a>
 */
val NONE: LabelAngleOnRightSideOffsets
/**
 * Angle offset specifier for edge labels which expresses that an additional offset of `180` degrees should be added to the angle.
 * 
 * Value - `2`
 * @see [PreferredPlacementDescriptor.angleOffsetOnRightSide]
 * @see [PreferredPlacementDescriptor.angle]
 * @see [PreferredPlacementDescriptor.sideOfEdge]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelAngleOnRightSideOffsets%23SEMI">Online Documentation</a>
 */
val SEMI: LabelAngleOnRightSideOffsets

    }
}
