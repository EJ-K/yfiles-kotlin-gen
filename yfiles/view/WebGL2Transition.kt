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
 * Encapsulates the values that specify how the visualization of an [indicator][WebGL2NodeIndicatorStyle] should be transitioned when [entering][WebGL2NodeIndicatorStyle.enterTransition] or [leaving][WebGL2NodeIndicatorStyle.leaveTransition] the visualization.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2Transition">Online Documentation</a>
 * 
 * @constructor Creates a new immutable instance with the provided values.
 * @param [properties] The properties to transition. Defaults to [WebGL2TransitionProperties.SCALE].
 * @param [duration] The duration of the transition. Defaults to 0.3 seconds.
 * @param [easing] The easing to apply. Defaults to [WebGL2AnimationEasing.LINEAR]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2Transition%23WebGL2Transition-constructor-WebGL2Transition">Online Documentation</a>
 */
external open class WebGL2Transition  ( properties: WebGL2TransitionProperties  = definedExternally,
 duration: TimeSpan?  = definedExternally,
 easing: WebGL2AnimationEasing  = definedExternally) : YObject {

/**
 * Gets the duration of a the transition.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2Transition%23duration">Online Documentation</a>
 */
final val duration: TimeSpan
/**
 * Gets the easing function to apply for the transition.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2Transition%23easing">Online Documentation</a>
 */
final val easing: WebGL2AnimationEasing
/**
 * Gets the set of properties to transition.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2Transition%23properties">Online Documentation</a>
 */
final val properties: WebGL2TransitionProperties

companion object : ClassMetadata<WebGL2Transition> {
/**
 * A transition that has a zero duration.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2Transition%23INSTANT">Online Documentation</a>
 */
 val INSTANT: WebGL2Transition
}
}
