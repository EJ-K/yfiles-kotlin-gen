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
 * Defines the direction of the animation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2AnimationDirection">Online Documentation</a>
 */
external sealed class WebGL2AnimationDirection: YEnum<WebGL2AnimationDirection> {
   companion object: EnumMetadata<WebGL2AnimationDirection> {
       /**
 * The animation plays forwards.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2AnimationDirection%23NORMAL">Online Documentation</a>
 */
val NORMAL: WebGL2AnimationDirection

/**
 * The animation plays backwards.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2AnimationDirection%23REVERSE">Online Documentation</a>
 */
val REVERSE: WebGL2AnimationDirection

/**
 * The animation plays forwards and backwards alternating.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2AnimationDirection%23ALTERNATE">Online Documentation</a>
 */
val ALTERNATE: WebGL2AnimationDirection

/**
 * The animation plays backwards and forwards alternating.
 * 
 * Value - `3`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2AnimationDirection%23ALTERNATE_REVERSE">Online Documentation</a>
 */
val ALTERNATE_REVERSE: WebGL2AnimationDirection
   }
}
