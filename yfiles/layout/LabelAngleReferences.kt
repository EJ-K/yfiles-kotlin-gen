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
 * Angle interpretation specifier for edge labels which expresses that the rotation angle should be interpreted relative to the edge slope.
 * @see [PreferredPlacementDescriptor.angleReference]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelAngleReferences">Online Documentation</a>
 */
external class LabelAngleReferences 
    private constructor(): YFlags<LabelAngleReferences> {
    companion object {
    /**
 * Angle interpretation specifier for edge labels which expresses that the rotation angle should be interpreted absolute and not relative to the edge slope.
 * 
 * Value - `1`
 * @see [PreferredPlacementDescriptor.angleReference]
 * @see [PreferredPlacementDescriptor.angle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelAngleReferences%23ABSOLUTE">Online Documentation</a>
 */
val ABSOLUTE: LabelAngleReferences
/**
 * Angle interpretation specifier for edge labels which expresses that the rotation angle should be interpreted relative to the edge slope.
 * 
 * Value - `2`
 * @see [PreferredPlacementDescriptor.angleReference]
 * @see [PreferredPlacementDescriptor.angle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelAngleReferences%23RELATIVE_TO_EDGE_FLOW">Online Documentation</a>
 */
val RELATIVE_TO_EDGE_FLOW: LabelAngleReferences

    }
}
