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
 * The type a [snap line][OrthogonalSnapLine] may be snapped to.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapLineSnapTypes">Online Documentation</a>
 */

external class SnapLineSnapTypes private constructor(): YFlags<SnapLineSnapTypes> {
  companion object {
    /**
     * Describes snap lines to which nothing will snap.
     * 
     * Value - `0`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapLineSnapTypes%23NONE">Online Documentation</a>
     */
    val NONE: SnapLineSnapTypes
    
    /**
     * Describes snap lines to which the top sides of rectangular elements will snap.
     * 
     * Value - `1`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapLineSnapTypes%23TOP">Online Documentation</a>
     */
    val TOP: SnapLineSnapTypes
    
    /**
     * Describes snap lines to which the bottom sides of rectangular elements will snap.
     * 
     * Value - `2`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapLineSnapTypes%23BOTTOM">Online Documentation</a>
     */
    val BOTTOM: SnapLineSnapTypes
    
    /**
     * Describes snap lines to which the left sides of rectangular elements will snap.
     * 
     * Value - `4`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapLineSnapTypes%23LEFT">Online Documentation</a>
     */
    val LEFT: SnapLineSnapTypes
    
    /**
     * Describes snap lines to which the right sides of rectangular elements will snap.
     * 
     * Value - `8`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapLineSnapTypes%23RIGHT">Online Documentation</a>
     */
    val RIGHT: SnapLineSnapTypes
    
    /**
     * Describes snap lines to which the center of elements will snap.
     * 
     * Value - `16`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapLineSnapTypes%23CENTER">Online Documentation</a>
     */
    val CENTER: SnapLineSnapTypes
    
    /**
     * Describes horizontal snap lines
     * 
     * Value - `19`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapLineSnapTypes%23HORIZONTAL">Online Documentation</a>
     */
    val HORIZONTAL: SnapLineSnapTypes
    
    /**
     * Describes vertical snap lines
     * 
     * Value - `28`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapLineSnapTypes%23VERTICAL">Online Documentation</a>
     */
    val VERTICAL: SnapLineSnapTypes
    
    /**
     * Describes snap lines to which all elements will snap on all sides
     * 
     * Value - `31`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapLineSnapTypes%23ALL">Online Documentation</a>
     */
    val ALL: SnapLineSnapTypes
  }
}
