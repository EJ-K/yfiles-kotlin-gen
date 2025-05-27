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
 * Enumeration values for font styles for use in [Font]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FontStyle">Online Documentation</a>
 */
external sealed class FontStyle: YEnum<FontStyle> {
   companion object: EnumMetadata<FontStyle> {
       /**
 * The Normal font style.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FontStyle%23NORMAL">Online Documentation</a>
 */
val NORMAL: FontStyle

/**
 * The Italic font style.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FontStyle%23ITALIC">Online Documentation</a>
 */
val ITALIC: FontStyle

/**
 * The Oblique font style.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FontStyle%23OBLIQUE">Online Documentation</a>
 */
val OBLIQUE: FontStyle

/**
 * The Inherit font style.
 * 
 * Value - `3`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FontStyle%23INHERIT">Online Documentation</a>
 */
val INHERIT: FontStyle
   }
}
