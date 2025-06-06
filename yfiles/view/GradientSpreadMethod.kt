// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

/**
 * Specifies the method that is used to fill the outside of the gradient vector of a [LinearGradient] or [RadialGradient].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GradientSpreadMethod">Online Documentation</a>
 */

sealed external class GradientSpreadMethod {
  /**
   * The outside is filled with the terminal colors of the gradient.
   * 
   * Value - `0`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GradientSpreadMethod%23PAD">Online Documentation</a>
   */
  object PAD: GradientSpreadMethod
  
  /**
   * The outside is filled by repeating the gradient but in alternating directions, until the area is filled.
   * 
   * Value - `1`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GradientSpreadMethod%23REFLECT">Online Documentation</a>
   */
  object REFLECT: GradientSpreadMethod
  
  /**
   * The outside is filled by repeating the original gradient.
   * 
   * Value - `2`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GradientSpreadMethod%23REPEAT">Online Documentation</a>
   */
  object REPEAT: GradientSpreadMethod
}
