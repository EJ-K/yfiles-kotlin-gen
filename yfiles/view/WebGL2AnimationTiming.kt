// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.lang.ClassMetadata
import yfiles.lang.TimeSpan
import yfiles.lang.YObject

/**
 * Encapsulates the values that specify the timing information for an animation used by [WebGL2 animations][WebGL2GraphModelManager].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2AnimationTiming">Online Documentation</a>
 * 
 * @constructor Creates a new immutable instance with the provided values.
 * @param [duration] The duration of a single cycle. Defaults to 1 second.
 * @param [easing] The easing to apply in each cycle. Defaults to [WebGL2AnimationEasing.LINEAR]
 * @param [iterationCount] The number of iterations. Defaults to `1`.
 * @param [direction] The animation direction. Defaults to [WebGL2AnimationDirection.NORMAL].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2AnimationTiming%23WebGL2AnimationTiming-constructor-WebGL2AnimationTiming">Online Documentation</a>
 */
external open class WebGL2AnimationTiming  ( duration: TimeSpan?  = definedExternally,
 easing: WebGL2AnimationEasing  = definedExternally,
 iterationCount: Int  = definedExternally,
 direction: WebGL2AnimationDirection  = definedExternally) : YObject {

/**
 * Gets the direction of the animation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2AnimationTiming%23direction">Online Documentation</a>
 */
final val direction: WebGL2AnimationDirection
/**
 * Gets the duration of a single iteration cycle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2AnimationTiming%23duration">Online Documentation</a>
 */
final val duration: TimeSpan
/**
 * Gets the easing function to apply for each iteration.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2AnimationTiming%23easing">Online Documentation</a>
 */
final val easing: WebGL2AnimationEasing
/**
 * Gets the number of cycles of the animation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2AnimationTiming%23iterationCount">Online Documentation</a>
 */
final val iterationCount: Int

companion object : ClassMetadata<WebGL2AnimationTiming> {
/**
 * A default timing with default values for all properties.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2AnimationTiming%23DEFAULT">Online Documentation</a>
 */
 val DEFAULT: WebGL2AnimationTiming
/**
 * A timing that has a zero duration and a single cycle, only.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2AnimationTiming%23INSTANT">Online Documentation</a>
 */
 val INSTANT: WebGL2AnimationTiming
}
}
