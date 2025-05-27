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
 * Possible values for the line cap of a [Stroke].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LineCap">Online Documentation</a>
 */
external sealed class LineCap: YEnum<LineCap> {
   companion object: EnumMetadata<LineCap> {
       /**
 * Indicates that the line cap of a [Stroke] should be squared.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LineCap%23SQUARE">Online Documentation</a>
 */
val SQUARE: LineCap

/**
 * Indicates that the line cap of a [Stroke] should be flat.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LineCap%23FLAT">Online Documentation</a>
 */
val FLAT: LineCap

/**
 * Indicates that the line cap of a [Stroke] should be a semicircle.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LineCap%23ROUND">Online Documentation</a>
 */
val ROUND: LineCap
   }
}
