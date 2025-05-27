// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * The orientation used by [orthogonal snap lines][OrthogonalSnapLine.orientation].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapLineOrientation">Online Documentation</a>
 */
external sealed class SnapLineOrientation: YEnum<SnapLineOrientation> {
   companion object: EnumMetadata<SnapLineOrientation> {
       /**
 * Constant that describes a horizontal [orientation][SnapLineOrientation] of a snap line.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapLineOrientation%23HORIZONTAL">Online Documentation</a>
 */
val HORIZONTAL: SnapLineOrientation

/**
 * Constant that describes a vertical [orientation][SnapLineOrientation] of a snap line.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapLineOrientation%23VERTICAL">Online Documentation</a>
 */
val VERTICAL: SnapLineOrientation
   }
}
