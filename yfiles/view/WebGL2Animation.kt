// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import js.promise.Promise
import yfiles.lang.ClassMetadata
import yfiles.lang.TimeSpan

/**
 * An animation for use with [WebGL2GraphModelManager], only.
 * @see [WebGL2GraphModelManager.setAnimations]
 * @see [WebGL2GraphModelManager.createFadeAnimation]
 * @see [WebGL2GraphModelManager.createPulseAnimation]
 * @see [WebGL2GraphModelManager.createBeaconAnimation]
 * @see [WebGL2GraphModelManager.createScaleAnimation]
 * @see [WebGL2GraphModelManager.createShakeAnimation]
 * @see [WebGL2GraphModelManager.createArcHeightAnimation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2Animation">Online Documentation</a>
 */
external  class WebGL2Animation 
private constructor () : IAnimation {

/**
 * Specifies the preferred total duration of this animation if it is used with an [Animator].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2Animation%23preferredDuration">Online Documentation</a>
 */
final override val preferredDuration: TimeSpan
/**
 * Called by an [Animator] to run this animation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2Animation%23WebGL2Animation-method-animate">Online Documentation</a>
 */
 final override   fun animate( time: Double )
/**
 * Called by an [Animator] to clean up after this animation has finished.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2Animation%23WebGL2Animation-method-cleanUp">Online Documentation</a>
 */
 final override   fun cleanUp()
/**
 * Called by an [Animator] to initialize this animation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2Animation%23WebGL2Animation-method-initialize">Online Documentation</a>
 */
 final override   fun initialize()
/**
 * Immediately resets this animation to its initial state.
 * @see [start]
 * @see [stop]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2Animation%23WebGL2Animation-method-reset">Online Documentation</a>
 */
 final   fun reset()
/**
 * Starts the progress of the animation, unless it already finished.
 * @return A [Promise] that will resolve to `true` if the animation reached its final state, or to `false` if the animation has been [signaled to stop][stop] or [resetted][reset].
 * @see [stop]
 * @see [reset]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2Animation%23WebGL2Animation-method-start">Online Documentation</a>
 */
 final   fun start():Promise<Boolean>
/**
 * Signals the animation to stop.
 * @return A [Promise] that will resolve to `true` if the animation has fully stopped or [resetted][reset], or to `false` if the animation has been [switched back to normal progress][start].
 * @see [start]
 * @see [reset]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2Animation%23WebGL2Animation-method-stop">Online Documentation</a>
 */
 final   fun stop():Promise<Boolean>

companion object : ClassMetadata<WebGL2Animation> {
}
}
