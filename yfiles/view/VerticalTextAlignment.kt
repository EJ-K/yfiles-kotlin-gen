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
 * Possible values for vertical alignment of objects.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VerticalTextAlignment">Online Documentation</a>
 */
external sealed class VerticalTextAlignment: YEnum<VerticalTextAlignment> {
   companion object: EnumMetadata<VerticalTextAlignment> {
       /**
 * Indicates that the object should be placed in the center of another object.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VerticalTextAlignment%23CENTER">Online Documentation</a>
 */
val CENTER: VerticalTextAlignment

/**
 * Indicates that the object should be placed at the top of another object.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VerticalTextAlignment%23TOP">Online Documentation</a>
 */
val TOP: VerticalTextAlignment

/**
 * Indicates that the object should be placed at the bottom of another object.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VerticalTextAlignment%23BOTTOM">Online Documentation</a>
 */
val BOTTOM: VerticalTextAlignment
   }
}
