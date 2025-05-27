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
 * Flaggable enumeration to determine to which axis touch panning should snap to.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapPanningBehaviors">Online Documentation</a>
 */
external class SnapPanningBehaviors 
    private constructor(): YFlags<SnapPanningBehaviors> {
    companion object {
    /**
 * Don't snap to x- and y-axis when panning
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapPanningBehaviors%23NONE">Online Documentation</a>
 */
val NONE: SnapPanningBehaviors
/**
 * Snap to x-axis when panning
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapPanningBehaviors%23HORIZONTAL">Online Documentation</a>
 */
val HORIZONTAL: SnapPanningBehaviors
/**
 * Snap to y-axis when panning
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapPanningBehaviors%23VERTICAL">Online Documentation</a>
 */
val VERTICAL: SnapPanningBehaviors
/**
 * Snap to x- and y-axis when panning
 * 
 * Value - `3`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapPanningBehaviors%23BOTH">Online Documentation</a>
 */
val BOTH: SnapPanningBehaviors

    }
}
