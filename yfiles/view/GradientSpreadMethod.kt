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
 * Specifies the method that is used to fill the outside of the gradient vector of a [LinearGradient] or [RadialGradient].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GradientSpreadMethod">Online Documentation</a>
 */
external sealed class GradientSpreadMethod: YEnum<GradientSpreadMethod> {
   companion object: EnumMetadata<GradientSpreadMethod> {
       /**
 * The outside is filled with the terminal colors of the gradient.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GradientSpreadMethod%23PAD">Online Documentation</a>
 */
val PAD: GradientSpreadMethod

/**
 * The outside is filled by repeating the gradient but in alternating directions, until the area is filled.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GradientSpreadMethod%23REFLECT">Online Documentation</a>
 */
val REFLECT: GradientSpreadMethod

/**
 * The outside is filled by repeating the original gradient.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GradientSpreadMethod%23REPEAT">Online Documentation</a>
 */
val REPEAT: GradientSpreadMethod
   }
}
