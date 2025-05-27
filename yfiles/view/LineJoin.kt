// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * Possible values for the line join of a [Stroke].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LineJoin">Online Documentation</a>
 */
external sealed class LineJoin: YEnum<LineJoin> {
   companion object: EnumMetadata<LineJoin> {
       /**
 * Indicates that the line joins of a [Stroke] should be beveled.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LineJoin%23BEVEL">Online Documentation</a>
 */
val BEVEL: LineJoin

/**
 * Indicates that the line joins of a [Stroke] should be rounded.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LineJoin%23ROUND">Online Documentation</a>
 */
val ROUND: LineJoin

/**
 * Indicates that the line joins of a [Stroke] should be sharp.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LineJoin%23MITER">Online Documentation</a>
 */
val MITER: LineJoin
   }
}
