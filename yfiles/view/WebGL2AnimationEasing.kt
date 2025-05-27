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
 * Defines the easing to apply to an animation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2AnimationEasing">Online Documentation</a>
 */
external sealed class WebGL2AnimationEasing: YEnum<WebGL2AnimationEasing> {
   companion object: EnumMetadata<WebGL2AnimationEasing> {
       /**
 * The animation is played without easing.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2AnimationEasing%23LINEAR">Online Documentation</a>
 */
val LINEAR: WebGL2AnimationEasing

/**
 * The animation first remains in its start state and jumps to the end state when in the middle of the animation.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2AnimationEasing%23STEP">Online Documentation</a>
 */
val STEP: WebGL2AnimationEasing

/**
 * The animation is eased at the beginning and at the end.
 * 
 * Value - `4`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2AnimationEasing%23EASE">Online Documentation</a>
 */
val EASE: WebGL2AnimationEasing

/**
 * The animation is eased at the beginning and at the end.
 * 
 * Value - `5`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2AnimationEasing%23EASE_IN_OUT">Online Documentation</a>
 */
val EASE_IN_OUT: WebGL2AnimationEasing

/**
 * The animation is eased at the end.
 * 
 * Value - `6`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2AnimationEasing%23EASE_OUT">Online Documentation</a>
 */
val EASE_OUT: WebGL2AnimationEasing

/**
 * The animation is eased at the beginning.
 * 
 * Value - `7`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2AnimationEasing%23EASE_IN">Online Documentation</a>
 */
val EASE_IN: WebGL2AnimationEasing
   }
}
