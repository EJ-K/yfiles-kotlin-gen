// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.lang.YFlags

/**
 * A flaggable enumeration of the different types of snaps that is used by [SnapState] in [SnapResult] implementations.
 * @see [SnapResult.snap]
 * @see [SnapContext]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapTypes">Online Documentation</a>
 */
external class SnapTypes 
    private constructor(): YFlags<SnapTypes> {
    companion object {
    /**
 * Indicates that the location has not been snapped at all.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapTypes%23NOT_SNAPPED">Online Documentation</a>
 */
val NOT_SNAPPED: SnapTypes
/**
 * Indicates that the location has been snapped to its x value.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapTypes%23SNAPPED_X">Online Documentation</a>
 */
val SNAPPED_X: SnapTypes
/**
 * Indicates that the location has been snapped to its y value.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapTypes%23SNAPPED_Y">Online Documentation</a>
 */
val SNAPPED_Y: SnapTypes
/**
 * Indicates that the location has been snapped to its x and y values.
 * 
 * Value - `3`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapTypes%23SNAPPED_X_Y">Online Documentation</a>
 */
val SNAPPED_X_Y: SnapTypes

    }
}
